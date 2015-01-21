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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;


/**
 * 
 *                 An activity that occurs during dosing. 
 *             
 * 
 * <p>Java class for ActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.pharmml.org/2013/03/TrialDesign}LookupTable"/>
 *           &lt;element ref="{http://www.pharmml.org/2013/03/TrialDesign}DosingRegimen"/>
 *           &lt;element ref="{http://www.pharmml.org/2013/03/TrialDesign}Washout"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/2013/03/CommonTypes}OidDefnGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityType", propOrder = {
    "lookupTable",
    "dosingRegimen",
    "washout"
})
public class Activity
    extends PharmMLRootType
{

    @XmlElement(name = "LookupTable")
    protected LookupTableType lookupTable;
    @XmlElementRef(name = "DosingRegimen", namespace = "http://www.pharmml.org/2013/03/TrialDesign", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DosingRegimen> dosingRegimen;
    @XmlElement(name = "Washout")
    protected WashoutType washout;
    @XmlAttribute(name = "oid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;

    /**
     * Gets the value of the lookupTable property.
     * 
     * @return
     *     possible object is
     *     {@link LookupTableType }
     *     
     * @since PharmML 0.3
     */
    public LookupTableType getLookupTable() {
        return lookupTable;
    }

    /**
     * Sets the value of the lookupTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupTableType }
     *     
     * @since PharmML 0.3
     */
    public void setLookupTable(LookupTableType value) {
        this.lookupTable = value;
    }

    /**
     * Gets the value of the dosingRegimen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DosingRegimen }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bolus }{@code >}
     *     {@link JAXBElement }{@code <}{@link Infusion }{@code >}
     *     
     */
    public JAXBElement<? extends DosingRegimen> getDosingRegimen() {
        return dosingRegimen;
    }

    /**
     * Sets the value of the dosingRegimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DosingRegimen }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bolus }{@code >}
     *     {@link JAXBElement }{@code <}{@link Infusion }{@code >}
     *     
     */
    public void setDosingRegimen(JAXBElement<? extends DosingRegimen> value) {
        this.dosingRegimen = value;
    }

    /**
     * Gets the value of the washout property.
     * 
     * @return
     *     possible object is
     *     {@link WashoutType }
     *     
     */
    public WashoutType getWashout() {
        return washout;
    }

    /**
     * Sets the value of the washout property.
     * 
     * @param value
     *     allowed object is
     *     {@link WashoutType }
     *     
     */
    public void setWashout(WashoutType value) {
        this.washout = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOid(String value) {
        this.oid = value;
    }

}
