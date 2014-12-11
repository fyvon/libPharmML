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
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type specifying a derivative variable.
 * 
 * <p>Java class for DerivativeVariableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeVariableType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}CommonVariableDefinitionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign" minOccurs="0"/>
 *         &lt;element name="IndependentVariable" type="{http://www.pharmml.org/2013/03/CommonTypes}IndependentVariableReferenceType" minOccurs="0"/>
 *         &lt;element name="InitialCondition" type="{http://www.pharmml.org/2013/03/CommonTypes}InitialConditionType" minOccurs="0"/>
 *         &lt;element name="History" type="{http://www.pharmml.org/2013/03/CommonTypes}HistoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="compartmentNo" type="{http://www.pharmml.org/2013/03/CommonTypes}CompartmentNoType" />
 *       &lt;attribute name="symbolType" use="required" type="{http://www.pharmml.org/2013/03/CommonTypes}SymbolTypeType" fixed="real" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeVariableType", propOrder = {
    "assign",
    "independentVariable",
    "initialCondition",
    "history"
})
public class DerivativeVariableType
    extends CommonVariableDefinitionType
{

    @XmlElement(name = "Assign")
    protected Rhs assign;
    @XmlElement(name = "IndependentVariable")
    protected IndependentVariableReferenceType independentVariable;
    @XmlElement(name = "InitialCondition")
    protected InitialConditionType initialCondition;
    @XmlElement(name = "History")
    protected History history;
    @XmlAttribute(name = "compartmentNo")
    @Deprecated
    protected Integer compartmentNo;
    @XmlAttribute(name = "symbolType", required = true)
    protected SymbolType symbolType;

    /**
     * The symbol id used to define the variable.
     * 
     * @return
     *     possible object is
     *     {@link Rhs }
     *     
     */
    public Rhs getAssign() {
        return assign;
    }

    /**
     * Sets the value of the assign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rhs }
     *     
     */
    public void setAssign(Rhs value) {
        this.assign = value;
    }

    /**
     * Gets the value of the independentVariable property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentVariableReferenceType }
     *     
     */
    public IndependentVariableReferenceType getIndependentVariable() {
        return independentVariable;
    }

    /**
     * Sets the value of the independentVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentVariableReferenceType }
     *     
     */
    public void setIndependentVariable(IndependentVariableReferenceType value) {
        this.independentVariable = value;
    }

    /**
     * Gets the value of the initialCondition property.
     * 
     * @return
     *     possible object is
     *     {@link InitialConditionType }
     *     
     */
    public InitialConditionType getInitialCondition() {
        return initialCondition;
    }

    /**
     * Sets the value of the initialCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialConditionType }
     *     
     */
    public void setInitialCondition(InitialConditionType value) {
        this.initialCondition = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link History }
     *     
     */
    public History getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link History }
     *     
     */
    public void setHistory(History value) {
        this.history = value;
    }

    /**
     * Gets the value of the compartmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     * @deprecated Since PharmML 0.4.1
     *     
     */
    public Integer getCompartmentNo() {
        return compartmentNo;
    }
    
    /**
     * Sets the value of the compartmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     *     
     * @deprecated Since PharmML 0.4.1
     */
    public void setCompartmentNo(Integer value) {
        this.compartmentNo = value;
    }

    /**
     * Gets the value of the symbolType property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolType }
     *     
     */
    public SymbolType getSymbolType() {
        if (symbolType == null) {
            return SymbolType.REAL;
        } else {
            return symbolType;
        }
    }

    /**
     * Sets the value of the symbolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolType }
     *     
     */
    public void setSymbolType(SymbolType value) {
        this.symbolType = value;
    }

}
