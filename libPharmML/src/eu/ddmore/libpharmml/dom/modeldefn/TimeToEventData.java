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
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type defining TTE data models.
 * 
 * <p>Java class for TimeToEventDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeToEventDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/ModelDefinition}CommonObservationModelType">
 *       &lt;sequence>
 *         &lt;element name="EventVariable" type="{http://www.pharmml.org/2013/03/ModelDefinition}CommonDiscreteVariableType"/>
 *         &lt;element name="HazardFunction" type="{http://www.pharmml.org/2013/03/ModelDefinition}TTEFunctionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurvivalFunction" type="{http://www.pharmml.org/2013/03/ModelDefinition}TTEFunctionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Censoring" type="{http://www.pharmml.org/2013/03/ModelDefinition}CensoringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaximumNumberEvents" type="{http://www.pharmml.org/2013/03/ModelDefinition}CensoringFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeToEventDataType", propOrder = {
    "eventVariable",
    "hazardFunction",
    "survivalFunction",
    "censoring",
    "maximumNumberEvents"
})
public class TimeToEventData
    extends CommonObservationModel
{

    @XmlElement(name = "EventVariable", required = true)
    protected CommonDiscreteVariable eventVariable;
    @XmlElement(name = "HazardFunction")
    protected List<TTEFunction> hazardFunction;
    @XmlElement(name = "SurvivalFunction")
    protected List<TTEFunction> survivalFunction;
    @XmlElement(name = "Censoring")
    protected List<Censoring> censoring;
    @XmlElement(name = "MaximumNumberEvents")
    protected List<CensoringFeature> maximumNumberEvents;

    /**
     * Gets the value of the eventVariable property.
     * 
     * @return
     *     possible object is
     *     {@link CommonDiscreteVariableType }
     *     
     */
    public CommonDiscreteVariable getEventVariable() {
        return eventVariable;
    }

    /**
     * Sets the value of the eventVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonDiscreteVariableType }
     *     
     */
    public void setEventVariable(CommonDiscreteVariable value) {
        this.eventVariable = value;
    }

    /**
     * Gets the value of the hazardFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTEFunctionType }
     * 
     * 
     */
    public List<TTEFunction> getListOfHazardFunction() {
        if (hazardFunction == null) {
            hazardFunction = new ArrayList<TTEFunction>();
        }
        return this.hazardFunction;
    }

    /**
     * Gets the value of the survivalFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the survivalFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurvivalFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTEFunctionType }
     * 
     * 
     */
    public List<TTEFunction> getListOfSurvivalFunction() {
        if (survivalFunction == null) {
            survivalFunction = new ArrayList<TTEFunction>();
        }
        return this.survivalFunction;
    }

    /**
     * Gets the value of the censoring property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the censoring property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCensoring().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensoringType }
     * 
     * 
     */
    public List<Censoring> getListOfCensoring() {
        if (censoring == null) {
            censoring = new ArrayList<Censoring>();
        }
        return this.censoring;
    }

    /**
     * Gets the value of the maximumNumberEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumNumberEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumNumberEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensoringFeatureType }
     * 
     * 
     */
    public List<CensoringFeature> getListOfMaximumNumberEvents() {
        if (maximumNumberEvents == null) {
            maximumNumberEvents = new ArrayList<CensoringFeature>();
        }
        return this.maximumNumberEvents;
    }

    /**
     * Creates a new empty {@link CommonDiscreteVariable} eventVariable element, adds it to the current {@link TimeToEventData} object and returns it.
     * @return The created {@link CommonDiscreteVariable} object.
     */
    public CommonDiscreteVariable createEventVariable(){
            CommonDiscreteVariable el = new CommonDiscreteVariable();
            this.eventVariable = el;
            return el;
    }

    /**
     * Creates a new empty {@link TTEFunction} hazardFunction element, adds it to the current {@link TimeToEventData} object and returns it.
     * @return The created {@link TTEFunction} object.
     */
    public TTEFunction createHazardFunction(){
            TTEFunction el = new TTEFunction();
            getListOfHazardFunction().add(el);
            return el;
    }
    
    /**
     * Creates a new {@link TTEFunction} hazardFunction element, adds it to the current {@link TimeToEventData} object and returns it.
     * @param symbolId The symbol id of the new hazard function.
     * @return The created {@link TTEFunction} object.
     */
    public TTEFunction createHazardFunction(String symbolId){
            TTEFunction el = createHazardFunction();
            el.setSymbId(symbolId);
            return el;
    }

    /**
     * Creates a new empty {@link TTEFunction} survivalFunction element, adds it to the current {@link TimeToEventData} object and returns it.
     * @return The created {@link TTEFunction} object.
     */
    public TTEFunction createSurvivalFunction(){
            TTEFunction el = new TTEFunction();
            getListOfSurvivalFunction().add(el);
            return el;
    }
    
    /**
     * Creates a new {@link TTEFunction} survivalFunction element, adds it to the current {@link TimeToEventData} object and returns it.
     * @param symbolId The symbol id of the new survival function.
     * @return The created {@link TTEFunction} object.
     */
    public TTEFunction createSurvivalFunction(String symbolId){
            TTEFunction el = createSurvivalFunction();
            el.setSymbId(symbolId);
            return el;
    }

    /**
     * Creates a new empty {@link Censoring} censoring element, adds it to the current {@link TimeToEventData} object and returns it.
     * @return The created {@link Censoring} object.
     */
    public Censoring createCensoring(){
            Censoring el = new Censoring();
            getListOfCensoring().add(el);
            return el;
    }

    /**
     * Creates a new empty {@link CensoringFeature} maximumNumberEvents element, adds it to the current {@link TimeToEventData} object and returns it.
     * @return The created {@link CensoringFeature} object.
     */
    public CensoringFeature createMaximumNumberEvents(){
            CensoringFeature el = new CensoringFeature();
            getListOfMaximumNumberEvents().add(el);
            return el;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>()
    			.addIfNotNull(super.listChildren())
    			.addIfNotNull(eventVariable)
    			.addIfNotNull(hazardFunction)
    			.addIfNotNull(survivalFunction)
    			.addIfNotNull(censoring)
    			.addIfNotNull(maximumNumberEvents);
    }
    
}
