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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * 
 *                 Type for censoring for TTE data models.
 *             
 * 
 * <p>Java class for CensoringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensoringType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="IntervalLength" type="{http://www.pharmml.org/2013/03/ModelDefinition}CensoringFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LeftCensoringTime" type="{http://www.pharmml.org/2013/03/ModelDefinition}CensoringFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RightCensoringTime" type="{http://www.pharmml.org/2013/03/ModelDefinition}CensoringFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="censoringType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *             &lt;enumeration value="intervalCensored"/>
 *             &lt;enumeration value="rightCensored"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensoringType", propOrder = {
    "intervalLength",
    "leftCensoringTime",
    "rightCensoringTime"
})
public class Censoring
    extends PharmMLRootType
{

    @XmlElement(name = "IntervalLength")
    protected List<CensoringFeature> intervalLength;
    @XmlElement(name = "LeftCensoringTime")
    protected List<CensoringFeature> leftCensoringTime;
    @XmlElement(name = "RightCensoringTime")
    protected List<CensoringFeature> rightCensoringTime;
    @XmlAttribute(name = "censoringType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String censoringType;

    /**
     * Gets the value of the intervalLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensoringFeature }
     * 
     * 
     */
    public List<CensoringFeature> getListOfIntervalLength() {
        if (intervalLength == null) {
            intervalLength = new ArrayList<CensoringFeature>();
        }
        return this.intervalLength;
    }

    /**
     * Gets the value of the leftCensoringTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leftCensoringTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeftCensoringTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensoringFeature }
     * 
     * 
     */
    public List<CensoringFeature> getListOfLeftCensoringTime() {
        if (leftCensoringTime == null) {
            leftCensoringTime = new ArrayList<CensoringFeature>();
        }
        return this.leftCensoringTime;
    }

    /**
     * Gets the value of the rightCensoringTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightCensoringTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightCensoringTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensoringFeature }
     * 
     * 
     */
    public List<CensoringFeature> getListOfRightCensoringTime() {
        if (rightCensoringTime == null) {
            rightCensoringTime = new ArrayList<CensoringFeature>();
        }
        return this.rightCensoringTime;
    }

    /**
     * Gets the value of the censoringType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCensoringType() {
        return censoringType;
    }

    /**
     * Sets the value of the censoringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCensoringType(String value) {
        this.censoringType = value;
    }

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(intervalLength)
				.addIfNotNull(leftCensoringTime)
				.addIfNotNull(rightCensoringTime);
	}

}
