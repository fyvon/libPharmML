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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.17 at 02:06:30 PM GMT 
//


package eu.ddmore.libpharmml.dom.modeldefn.pkmacro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.Rhs;


/**
 * Type defines an absorption/oral macro.
 * 
 * <p>Java class for AbsorptionOralMacroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsorptionOralMacroType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.pharmml.org/2013/03/ModelDefinition}AbsorptionOralMacroValueType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsorptionOralMacroType")
@XmlSeeAlso({OralMacro.class, AbsorptionMacro.class})
public abstract class AbsorptionOralMacro
    extends PKMacro
{

	/**
	 * Creates a new value for this macro with an assignment.
	 * @param argument The name of the argument.
	 * @param assignment The value that is assigned to the argument.
	 * @return The created {@link MacroValue} object.
	 */
	public MacroValue createValue(AbsorptionOralMacro.Arg argument, Rhs assignment){
		MacroValue value = new MacroValue(argument.toString(), assignment);
		getListOfValue().add(value);
		return value;
	}
	
	public static enum Arg {
		CMT("cmt"),
		TYPE("type"),
		ADM("adm"),
		TLAG("Tlag"),
		P("p"),
		TK0("Tk0"),
		KA("ka"),
		KTR("Ktr"),
		MTT("Mtt");
		
		private String value;
		
		private Arg(String value){
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value;
		}
	}
	
}
