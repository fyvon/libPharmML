/*******************************************************************************
 * Copyright (c) 2014 European Molecular Biology Laboratory,
 * Heidelberg, Germany.
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on 
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations 
 * under the License.
 *******************************************************************************/
package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.ddmore.libpharmml.dom.maths.Equation;


/**
 * <p>Java class for MatrixVectorIndexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixVectorIndexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}Equation"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Int"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixVectorIndex", propOrder = {
	    "equation",
	    "intValue",
	    "symbRef"
	})
public class MatrixVectorIndex extends PharmMLRootType {
	
	@XmlElement(name = "Equation", namespace = "http://www.pharmml.org/2013/03/Maths")
    protected Equation equation;
	
	@XmlElement(name = "Int")
	protected IntValue intValue;
	
	@XmlElement(name = "SymbRef")
	protected SymbolRefType symbRef;
	
	public MatrixVectorIndex(){
		
	}
	
	public MatrixVectorIndex(int value){
		this(new IntValue(value));
	}
	
	public MatrixVectorIndex(IntValue value){
		intValue = value;
	}
	
	public MatrixVectorIndex(SymbolRefType symbolRef){
		symbRef = symbolRef;
	}
	
	public MatrixVectorIndex(Equation equation){
		this.equation = equation;
	}
	
	/**
     * A mathematical expression.
     * 
     * @return
     *     possible object is
     *     {@link Equation }
     *     
     */
    public Equation getEquation() {
        return equation;
    }

    /**
     * Sets the value of the equation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equation }
     *     
     */
    public void setEquation(Equation value) {
        this.equation = value;
    }
	
	public IntValue getIntValue(){
		return intValue;
	}
	public void setIntValue(IntValue value){
		this.intValue = value;
	}
	
	public SymbolRefType getSymbolRef(){
		return symbRef;
	}
	public void setSymbolRef(SymbolRefType symbRef){
		this.symbRef = symbRef;
	}

}
