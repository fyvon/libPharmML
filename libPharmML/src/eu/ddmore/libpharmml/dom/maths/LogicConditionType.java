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


package eu.ddmore.libpharmml.dom.maths;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.ddmore.libpharmml.dom.commontypes.BooleanValue;
import eu.ddmore.libpharmml.dom.commontypes.FalseBoolean;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.TrueBoolean;


/**
 * The schema type defining logical condition.
 * 
 * <p>Java class for LogicConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicConditionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}LogicBinop"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}LogicUniop"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Boolean"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}Otherwise"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicConditionType", propOrder = {
    "logicBinop",
    "logicUniop",
    "_boolean",
    "otherwise"
})
@XmlSeeAlso({
    Condition.class
})
public class LogicConditionType
    extends PharmMLRootType
{

    @XmlElement(name = "LogicBinop")
    protected LogicBinOpType logicBinop;
    @XmlElement(name = "LogicUniop")
    protected LogicUniOpType logicUniop;
    @XmlElementRef(name = "Boolean", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends BooleanValue> _boolean;
    @XmlElement(name = "Otherwise")
    protected Object otherwise;

    /**
     * Gets the value of the logicBinop property.
     * 
     * @return
     *     possible object is
     *     {@link LogicBinOpType }
     *     
     */
    public LogicBinOpType getLogicBinop() {
        return logicBinop;
    }

    /**
     * Sets the value of the logicBinop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicBinOpType }
     *     
     */
    public void setLogicBinop(LogicBinOpType value) {
        this.logicBinop = value;
    }

    /**
     * Gets the value of the logicUniop property.
     * 
     * @return
     *     possible object is
     *     {@link LogicUniOpType }
     *     
     */
    public LogicUniOpType getLogicUniop() {
        return logicUniop;
    }

    /**
     * Sets the value of the logicUniop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicUniOpType }
     *     
     */
    public void setLogicUniop(LogicUniOpType value) {
        this.logicUniop = value;
    }

    /**
     * Gets the value of the boolean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}
     *     
     */
    public JAXBElement<? extends BooleanValue> getBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}
     *     
     */
    public void setBoolean(JAXBElement<? extends BooleanValue> value) {
        this._boolean = value;
    }

    /**
     * Gets the value of the otherwise property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOtherwise() {
        return otherwise;
    }

    /**
     * Sets the value of the otherwise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOtherwise(Object value) {
        this.otherwise = value;
    }

}
