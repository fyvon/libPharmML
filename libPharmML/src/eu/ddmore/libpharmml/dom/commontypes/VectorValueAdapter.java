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
package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.maths.Equation;
import eu.ddmore.libpharmml.exceptions.UndeclaredInterfaceImplementer;
import eu.ddmore.libpharmml.impl.PharmMLVersion;

@SuppressWarnings("deprecation")
public class VectorValueAdapter extends XmlAdapter<JAXBElement<?>, VectorValue>{
	
	private static ObjectFactory of = ObjectFactory.getInstance();

	@Override
	public VectorValue unmarshal(JAXBElement<?> v) throws Exception {
		return (VectorValue) v.getValue();
	}

	@Override
	public JAXBElement<?> marshal(VectorValue v) throws Exception {
		if(v instanceof VectorCellValue){
			return new VectorCellValueAdapter().marshal((VectorCellValue) v);
		} else if (v instanceof Sequence){
			return of.createSequence((Sequence) v);
		} else if (v instanceof Rhs){
			PharmMLVersion version = ((PharmMLElement)v).getMarshalVersion();
			if(version.isEqualOrLaterThan(PharmMLVersion.V0_7_3)){
				return MasterObjectFactory.COMMONTYPES_OF.createAssign((Rhs) v);
			} else {
				return MasterObjectFactory.MATHS_OF.createEquation(Equation.fromRhs((Rhs) v));
			}
		} else if (v instanceof Equation){
			return MasterObjectFactory.MATHS_OF.createEquation((Equation) v);
		} else {
			throw new UndeclaredInterfaceImplementer(this, v);
		}
	}

}
