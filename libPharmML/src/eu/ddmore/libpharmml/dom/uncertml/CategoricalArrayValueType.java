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
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom.uncertml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoricalArrayValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoricalArrayValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;choice>
 *             &lt;element name="sVal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *             &lt;element ref="{http://www.uncertml.org/3.0}var"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.uncertml.org/3.0}arrayVar"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoricalArrayValueType", propOrder = {
    "sValOrVar",
    "arrayVar"
})
public class CategoricalArrayValueType {

    @XmlElements({
        @XmlElement(name = "sVal", type = java.lang.String.class),
        @XmlElement(name = "var", type = VarRefType.class)
    })
    protected List<Object> sValOrVar;
    protected ArrayVarRefType arrayVar;

    /**
     * Gets the value of the sValOrVar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sValOrVar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSValOrVar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * {@link VarRefType }
     * 
     * 
     */
    public List<Object> getSValOrVar() {
        if (sValOrVar == null) {
            sValOrVar = new ArrayList<Object>();
        }
        return this.sValOrVar;
    }

    /**
     * Gets the value of the arrayVar property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayVarRefType }
     *     
     */
    public ArrayVarRefType getArrayVar() {
        return arrayVar;
    }

    /**
     * Sets the value of the arrayVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayVarRefType }
     *     
     */
    public void setArrayVar(ArrayVarRefType value) {
        this.arrayVar = value;
    }

}
