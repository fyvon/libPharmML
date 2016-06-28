/*******************************************************************************
 * Copyright (c) 2014-2016 European Molecular Biology Laboratory,
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
package eu.ddmore.libpharmml.dom.modellingsteps;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.IErrorHandler;
import eu.ddmore.libpharmml.dom.commontypes.OidRef;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.TargetToolDataSet;
import eu.ddmore.libpharmml.dom.tags.PharmMLObject;
import eu.ddmore.libpharmml.dom.tags.ReferenceContainer;
import eu.ddmore.libpharmml.dom.trialdesign.ExternalDataSet;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.validation.SymbolResolver;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 Type defining reference to an external dataset.
 *             
 * 
 * <p>Java class for ExternalDataSetReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalDataSetReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.6/CommonTypes}OidRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalDataSetReferenceType", propOrder = {
    "oidRef"
})
public class ExternalDataSetReference
    extends PharmMLRootType implements ReferenceContainer
{

    @XmlElement(name = "OidRef", namespace = NS_DEFAULT_CT, required = true)
    protected OidRef oidRef;
    
    public ExternalDataSetReference(){}
    
    public ExternalDataSetReference(String oidRef){
    	this.oidRef = new OidRef(oidRef);
    }
    
    public ExternalDataSetReference(ExternalDataSet dataset){
    	this.oidRef = new OidRef(dataset.getOid());
    }

    /**
     * Gets the value of the oidRef property.
     * 
     * @return
     *     possible object is
     *     {@link OidRef }
     *     
     */
    public OidRef getOidRef() {
        return oidRef;
    }

    /**
     * Sets the value of the oidRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OidRef }
     *     
     */
    public void setOidRef(OidRef value) {
        this.oidRef = value;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(oidRef);
	}
    
    @Override
	public void validateReferences(SymbolResolver sr, IErrorHandler errorHandler) {
		if(oidRef != null && oidRef.getOidRef() != null){
			if(sr.containsObject(oidRef.getOidRef())){
				PharmMLObject object = sr.getObject(oidRef.getOidRef());
				if(!(object instanceof ExternalDataSet || object instanceof TargetToolDataSet)){
					sr.handleIncompatibleObject(oidRef, object, this);
				}
			} else {
				sr.handleUnresolvedObject(oidRef);
			}
		}
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
