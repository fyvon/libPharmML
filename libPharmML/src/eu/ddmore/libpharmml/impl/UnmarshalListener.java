/*******************************************************************************
 * Copyright (c) 2014,2015 European Molecular Biology Laboratory,
 * Heidelberg, Germany.
 * 
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 * 
 *  		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on 
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations 
 * under the License.
 ******************************************************************************/
package eu.ddmore.libpharmml.impl;

import static eu.ddmore.libpharmml.impl.Utils.copyField;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.TreeNode;
import javax.xml.bind.Unmarshaller.Listener;

import eu.ddmore.libpharmml.IErrorHandler;
import eu.ddmore.libpharmml.IdFactory;
import eu.ddmore.libpharmml.dom.AbstractTreeNode;
import eu.ddmore.libpharmml.dom.Identifiable;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLElement;
import eu.ddmore.libpharmml.dom.dataset.DatasetMap;
import eu.ddmore.libpharmml.dom.modellingsteps.TargetTool;
import eu.ddmore.libpharmml.exceptions.AnnotationException;
import eu.ddmore.libpharmml.util.annotations.HasElementRenamed;
import eu.ddmore.libpharmml.util.annotations.HasElementsRenamed;
import eu.ddmore.libpharmml.util.annotations.RenamedElement;
import eu.ddmore.libpharmml.validation.PharmMLValidator;
import eu.ddmore.libpharmml.validation.Validatable;
import eu.ddmore.libpharmml.validation.exceptions.DuplicateIdentifierException;

public class UnmarshalListener extends Listener {
	
	private final PharmMLVersion docVersion;
	private final IdFactory idFactory;
	private final IErrorHandler errorHandler;
	
	public UnmarshalListener(PharmMLVersion docVersion, IdFactory idFactory, IErrorHandler errorHandler){
		this.docVersion = docVersion;
		this.idFactory = idFactory;
		this.errorHandler = errorHandler;
	}

	@Override
	public void beforeUnmarshal(Object target, Object parent) {
		if(target instanceof PharmMLElement){
			((PharmMLElement)target).setUnmarshalVersion(docVersion);
		}
	}

	@Override
	public void afterUnmarshal(Object target, Object parent) {
		Class<?> _class = target.getClass();
		
		// Checking for renamed elements
		if(_class.isAnnotationPresent(HasElementRenamed.class)){

				Annotation annotation = _class.getAnnotation(HasElementRenamed.class);
				handleAnnotation((HasElementRenamed) annotation, target);

		}
		if(_class.isAnnotationPresent(HasElementsRenamed.class)){

			Annotation annotation = _class.getAnnotation(HasElementsRenamed.class);
			handleAnnotation((HasElementsRenamed) annotation, target);

	}
		
		// Storing id if present
		if(target instanceof Identifiable){
			if(((Identifiable) target).getId() != null){
				try {
					idFactory.storeIdentifiable((Identifiable) target);
					LoggerWrapper.getLogger().info("Stored object with id \""+ ((Identifiable) target).getId() +"\"");
				} catch (DuplicateIdentifierException e) {
					LoggerWrapper.getLogger().warning("Identifier \""+ e.getDuplicate().getId() +"\" is duplicate.");
				}
			}
		}
		
		// Validating if possible
		if(target instanceof Validatable && docVersion.isEqualOrLaterThan(PharmMLVersion.V0_6)){
			((Validatable) target).validate(errorHandler);
		}
		
		// Registering parent
		if(target instanceof AbstractTreeNode){
			if(parent instanceof TreeNode){
				((AbstractTreeNode) target).setParent((TreeNode) parent);
			}
		}
		
		if(target instanceof DatasetMap){
			validateDatasetMap((DatasetMap) target);
		}
		if(target instanceof TargetTool){
			// TODO: put TargetTool is the same process as DatasetMap
			validateTargetTool((TargetTool) target);
		}
		
	}
	
	private void handleAnnotation(HasElementRenamed annotation, Object target){
		try {
			
			String transientField = annotation.transientField();
			
			List<PharmMLVersion> versionList = new ArrayList<PharmMLVersion>();
			Map<PharmMLVersion,String> versionToField = new HashMap<PharmMLVersion,String>();
			
			for(RenamedElement renamedEl : annotation.mappedFields()){
				versionList.add(renamedEl.since());
				versionToField.put(renamedEl.since(), renamedEl.field());
			}
			
			Collections.sort(versionList, Collections.reverseOrder());
			for(PharmMLVersion version : versionList){
				if(docVersion.isEqualOrLaterThan(version)){

						String mappedField = versionToField.get(version);
						copyField(target, mappedField, transientField, true);
						LoggerWrapper.getLogger().info("Using "+mappedField+" as "+ transientField+" in "+target);
						break;

				}
			}
		
		} catch (NoSuchFieldException e) {
			throw new AnnotationException(target, "1 field does not exist.");
		}
	}
	
	private void handleAnnotation(HasElementsRenamed annotation, Object target){
		for(HasElementRenamed singleAnnot : annotation.value()){
			handleAnnotation(singleAnnot, target);
		}
	}
	
	private void validateDatasetMap(DatasetMap dm){
		PharmMLValidator.validateDatasetMap(dm, errorHandler);
	}
	private void validateTargetTool(TargetTool tt){
		PharmMLValidator.validateTargetTool(tt, errorHandler);
	}

}
