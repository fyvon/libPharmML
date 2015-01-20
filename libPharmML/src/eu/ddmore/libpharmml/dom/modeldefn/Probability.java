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


package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.commontypes.LinkFunction;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.maths.LogicBinOp;
import eu.ddmore.libpharmml.dom.maths.LogicUniOpType;
import eu.ddmore.libpharmml.dom.maths.Operand;


/**
 * Type defining the probability definition.
 * 
 * <p>Java class for ProbabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProbabilityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.pharmml.org/2013/03/Maths}LogicBinop"/>
 *           &lt;element ref="{http://www.pharmml.org/2013/03/Maths}LogicUniop"/>
 *         &lt;/choice>
 *         &lt;element name="CurrentState" type="{http://www.pharmml.org/2013/03/ModelDefinition}CommonDiscreteStateType" minOccurs="0"/>
 *         &lt;element name="PreviousState" type="{http://www.pharmml.org/2013/03/ModelDefinition}CommonDiscreteStateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.pharmml.org/2013/03/ModelDefinition}CommonDiscreteStateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="linkFunction" type="{http://www.pharmml.org/2013/03/CommonTypes}LinkFunctionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProbabilityType", propOrder = {
    "logicBinop",
    "logicUniop",
    "currentState",
    "previousState",
    "condition"
})
public class Probability
    extends PharmMLRootType implements Operand
{

    @XmlElement(name = "LogicBinop", namespace = "http://www.pharmml.org/2013/03/Maths")
    protected LogicBinOp logicBinop;
    @XmlElement(name = "LogicUniop", namespace = "http://www.pharmml.org/2013/03/Maths")
    protected LogicUniOpType logicUniop;
    @XmlElement(name = "CurrentState")
    protected CommonDiscreteState currentState;
    @XmlElement(name = "PreviousState")
    protected List<CommonDiscreteState> previousState;
    @XmlElement(name = "Condition")
    protected List<CommonDiscreteState> condition;
    @XmlAttribute(name = "linkFunction")
    protected LinkFunction linkFunction;

    /**
     * Gets the value of the logicBinop property.
     * 
     * @return
     *     possible object is
     *     {@link LogicBinOp }
     *     
     */
    public LogicBinOp getLogicBinop() {
        return logicBinop;
    }

    /**
     * Sets the value of the logicBinop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicBinOp }
     *     
     */
    public void setLogicBinop(LogicBinOp value) {
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
     * Gets the value of the currentState property.
     * 
     * @return
     *     possible object is
     *     {@link CommonDiscreteState }
     *     
     */
    public CommonDiscreteState getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonDiscreteState }
     *     
     */
    public void setCurrentState(CommonDiscreteState value) {
        this.currentState = value;
    }

    /**
     * Gets the value of the previousState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonDiscreteState }
     * 
     * 
     */
    public List<CommonDiscreteState> getListOfPreviousState() {
        if (previousState == null) {
            previousState = new ArrayList<CommonDiscreteState>();
        }
        return this.previousState;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonDiscreteState }
     * 
     * 
     */
    public List<CommonDiscreteState> getListOfCondition() {
        if (condition == null) {
            condition = new ArrayList<CommonDiscreteState>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the linkFunction property.
     * 
     * @return
     *     possible object is
     *     {@link LinkFunctionType }
     *     
     */
    public LinkFunction getLinkFunction() {
        return linkFunction;
    }

    /**
     * Sets the value of the linkFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkFunctionType }
     *     
     */
    public void setLinkFunction(LinkFunction value) {
        this.linkFunction = value;
    }
    
    /**
     * Creates a new empty {@link LogicBinOp} element, adds it to the current {@link Probability} object and returns it.
     * @return The created {@link LogicBinOp} object.
     */
    public LogicBinOp createLogicBinop(){
            LogicBinOp el = new LogicBinOp();
            this.logicBinop = el;
            return el;
    }

    /**
     * Creates a new empty {@link LogicUniOpType} element, adds it to the current {@link Probability} object and returns it.
     * @return The created {@link LogicUniOpType} object.
     */
    public LogicUniOpType createLogicUniop(){
            LogicUniOpType el = new LogicUniOpType();
            this.logicUniop = el;
            return el;
    }

    /**
     * Creates a new empty {@link CommonDiscreteState} element, adds it to the current {@link Probability} object and returns it.
     * @return The created {@link CommonDiscreteState} object.
     */
    public CommonDiscreteState createCurrentState(){
            CommonDiscreteState el = new CommonDiscreteState();
            this.currentState = el;
            return el;
    }

    /**
     * Creates a new empty {@link CommonDiscreteState} element, adds it to the current {@link Probability} object and returns it.
     * @return The created {@link CommonDiscreteState} object.
     */
    public CommonDiscreteState createPreviousState(){
            CommonDiscreteState el = new CommonDiscreteState();
            getListOfPreviousState().add(el);
            return el;
    }

    /**
     * Creates a new empty {@link CommonDiscreteState} element, adds it to the current {@link Probability} object and returns it.
     * @return The created {@link CommonDiscreteState} object.
     */
    public CommonDiscreteState createCondition(){
            CommonDiscreteState el = new CommonDiscreteState();
            getListOfCondition().add(el);
            return el;
    }

	@Override
	public JAXBElement<Probability> toJAXBElement() {
		return MasterObjectFactory.MODELDEFN_OF.createProbability(this);
	}


}
