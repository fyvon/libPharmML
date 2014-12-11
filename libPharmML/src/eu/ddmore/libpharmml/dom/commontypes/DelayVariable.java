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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The type for delay variable.
 *             
 * 
 * <p>Java class for DelayVariableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelayVariableType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Scalar"/>
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
@XmlType(name = "DelayVariableType", propOrder = {
    "scalar",
    "symbRef"
})
public class DelayVariable
    extends PharmMLRootType
{

//    @XmlElementRef(name = "Scalar", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false)
//    protected JAXBElement<?> scalar;
    @XmlElementRef(name = "Scalar", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false)
    protected Scalar scalar;
    @XmlElement(name = "SymbRef")
    protected SymbolRefType symbRef;
    
    /**
     * Empty constructor
     */
    public DelayVariable(){}
    
    /**
     * Creates a new DelayVariable and set its value with the provided scalar. Possible scalar type is 
     * 	   {@link IntValue }
     *     {@link StringValue }
     *     {@link RealValue }
     *     {@link TrueBooleanType }
     *     {@link IdValue }
     *     {@link FalseBooleanType }
     * @param scalar
     */
    public DelayVariable(Scalar scalar){
    	this.scalar = scalar;
    }
    
    /**
     * Creates a new DelayVariable and set its value with the provided symbol reference.
     * @param symbRef
     */
    public DelayVariable(SymbolRefType symbRef){
    	this.symbRef = symbRef;
    }

    /**
     * Reference to the delay value.
     * 
     * @return
     *     possible object is
     *     {@link IntValue }
     *     {@link StringValue }
     *     {@link RealValue }
     *     {@link TrueBooleanType }
     *     {@link IdValue }
     *     {@link FalseBooleanType }
     *     
     */
    public Scalar getScalar() {
        return scalar;
    }

    /**
     * Sets the value of the scalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntValue }
     *     {@link StringValue }
     *     {@link RealValue }
     *     {@link TrueBooleanType }
     *     {@link IdValue }
     *     {@link FalseBooleanType }
     *     
     */
    public void setScalar(Scalar value) {
        this.scalar = value;
    }

    /**
     * Reference to the variable for a delay variable.
     * 
     * @return
     *     possible object is
     *     {@link SymbolRefType }
     *     
     */
    public SymbolRefType getSymbRef() {
        return symbRef;
    }

    /**
     * Sets the value of the symbRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolRefType }
     *     
     */
    public void setSymbRef(SymbolRefType value) {
        this.symbRef = value;
    }

}
