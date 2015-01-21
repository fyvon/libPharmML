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


package eu.ddmore.libpharmml.dom.trialdesign;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;


/**
 * 
 *                 Type that specifies steady state dosing.
 *             
 * 
 * <p>Java class for SteadyStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SteadyStateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="EndTime" type="{http://www.pharmml.org/2013/03/TrialDesign}SteadyStateParameterType"/>
 *         &lt;element name="Interval" type="{http://www.pharmml.org/2013/03/TrialDesign}SteadyStateParameterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SteadyStateType", propOrder = {
    "endTime",
    "interval"
})
public class SteadyState
    extends PharmMLRootType
{

    @XmlElement(name = "EndTime", required = true)
    protected SteadyStateParameter endTime;
    @XmlElement(name = "Interval")
    protected SteadyStateParameter interval;

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link SteadyStateParameter }
     *     
     */
    public SteadyStateParameter getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SteadyStateParameter }
     *     
     */
    public void setEndTime(SteadyStateParameter value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link SteadyStateParameter }
     *     
     */
    public SteadyStateParameter getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link SteadyStateParameter }
     *     
     */
    public void setInterval(SteadyStateParameter value) {
        this.interval = value;
    }

}