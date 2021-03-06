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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * Class for encoding discrete data models. 
 * This is a wrapper for either {@link CategoricalData}, {@link CountData} or {@link TimeToEventData}.
 * 
 * <p>Java class for DiscreteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscreteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element name="CategoricalData" type="{http://www.pharmml.org/2013/03/ModelDefinition}CategoricalDataType"/>
 *         &lt;element name="CountData" type="{http://www.pharmml.org/2013/03/ModelDefinition}CountDataType"/>
 *         &lt;element name="TimeToEventData" type="{http://www.pharmml.org/2013/03/ModelDefinition}TimeToEventDataType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscreteType", propOrder = {
    "categoricalData",
    "countData",
    "timeToEventData"
})
public class Discrete
    extends PharmMLRootType
{

    @XmlElement(name = "CategoricalData")
    protected CategoricalData categoricalData;
    @XmlElement(name = "CountData")
    protected CountData countData;
    @XmlElement(name = "TimeToEventData")
    protected TimeToEventData timeToEventData;

    /**
     * Gets the value of the categoricalData property.
     * 
     * @return
     *     possible object is
     *     {@link CategoricalData }
     *     
     */
    public CategoricalData getCategoricalData() {
        return categoricalData;
    }

    /**
     * Sets the value of the categoricalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoricalData }
     *     
     */
    public void setCategoricalData(CategoricalData value) {
        this.categoricalData = value;
    }

    /**
     * Gets the value of the countData property.
     * 
     * @return
     *     possible object is
     *     {@link CountData }
     *     
     */
    public CountData getCountData() {
        return countData;
    }

    /**
     * Sets the value of the countData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountData }
     *     
     */
    public void setCountData(CountData value) {
        this.countData = value;
    }

    /**
     * Gets the value of the timeToEventData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToEventData }
     *     
     */
    public TimeToEventData getTimeToEventData() {
        return timeToEventData;
    }

    /**
     * Sets the value of the timeToEventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToEventData }
     *     
     */
    public void setTimeToEventData(TimeToEventData value) {
        this.timeToEventData = value;
    }
    
    /**
     * Creates a new empty {@link CountData} into the {@link Discrete} element and returns it.
     * @return The created {@link CountData} object.
     */
    public CountData createCountData(){
    	CountData cd = new CountData();
    	this.countData = cd;
    	return cd;
    }
    
    /**
     * Creates a new empty {@link CategoricalData} into the {@link Discrete} element and returns it.
     * @return The created {@link CategoricalData} object.
     */
    public CategoricalData createCategoricalData(){
    	CategoricalData cd = new CategoricalData();
    	this.categoricalData = cd;
    	return cd;
    }
    
    /**
     * Creates a new empty {@link TimeToEventData} into the {@link Discrete} element and returns it.
     * @return The created {@link TimeToEventData} object.
     */
    public TimeToEventData createTimeToEventData(){
    	TimeToEventData td = new TimeToEventData();
    	this.timeToEventData = td;
    	return td;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(categoricalData)
				.addIfNotNull(countData)
				.addIfNotNull(timeToEventData);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
