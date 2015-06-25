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
// Generated on: 2014.03.24 at 10:08:07 AM GMT 
//


package eu.ddmore.libpharmml.dom.trialdesign;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.dataset.ColumnReference;
import eu.ddmore.libpharmml.impl.XMLFilter;


/**
 * 
 *                 A type defining the mapping of indendent variable dependent properties.    
 *             
 * 
 * <p>Java class for IndependentVariableDependentMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndependentVariableDependentMappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}ColumnRef"/>
 *         &lt;choice>
 *           &lt;element name="IndependentVariableMapping" type="{http://www.pharmml.org/2013/03/TrialDesign}IndependentVariableMappingType"/>
 *           &lt;element name="EpochMapping" type="{http://www.pharmml.org/2013/03/TrialDesign}EpochMappingType"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/TrialDesign}AttributeMapping" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated Since PharmML 0.3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndependentVariableDependentMappingType", propOrder = {
    "columnRef",
    "independentVariableMapping",
    "epochMapping",
    "attributeMapping"
})
@Deprecated
public class IndependentVariableDependentMapping {

    @XmlElement(name = "ColumnRef", namespace = XMLFilter.NS_DEFAULT_DS, required = true)
    protected ColumnReference columnRef;
    @XmlElement(name = "IndependentVariableMapping")
    protected IndependentVariableMapping independentVariableMapping;
    @XmlElement(name = "EpochMapping")
    protected EpochMapping epochMapping;
    @XmlElementRef(name = "AttributeMapping", namespace = XMLFilter.NS_DEFAULT_TD, type = JAXBElement.class)
    protected List<JAXBElement<?>> attributeMapping;

    /**
     * Gets the value of the columnRef property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnReference }
     *     
     */
    public ColumnReference getColumnRef() {
        return columnRef;
    }

    /**
     * Sets the value of the columnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnReference }
     *     
     */
    public void setColumnRef(ColumnReference value) {
        this.columnRef = value;
    }

    /**
     * Gets the value of the independentVariableMapping property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentVariableMapping }
     *     
     */
    public IndependentVariableMapping getIndependentVariableMapping() {
        return independentVariableMapping;
    }

    /**
     * Sets the value of the independentVariableMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentVariableMapping }
     *     
     */
    public void setIndependentVariableMapping(IndependentVariableMapping value) {
        this.independentVariableMapping = value;
    }

    /**
     * Gets the value of the epochMapping property.
     * 
     * @return
     *     possible object is
     *     {@link EpochMapping }
     *     
     */
    public EpochMapping getEpochMapping() {
        return epochMapping;
    }

    /**
     * Sets the value of the epochMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link EpochMapping }
     *     
     */
    public void setEpochMapping(EpochMapping value) {
        this.epochMapping = value;
    }

    /**
     * 
     *                         Defines the property of the subject that this mapping applies to.
     *                     Gets the value of the attributeMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link CovariateMapping }{@code >}
     * {@link JAXBElement }{@code <}{@link DemographicMapping }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAttributeMapping() {
        if (attributeMapping == null) {
            attributeMapping = new ArrayList<JAXBElement<?>>();
        }
        return this.attributeMapping;
    }

}
