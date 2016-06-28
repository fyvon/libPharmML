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
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom.uncertml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * <p>Java class for CategoricalUnivariateMixtureModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoricalUnivariateMixtureModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.uncertml.org/3.0}AbstractCategoricalUnivariateDistributionType">
 *       &lt;sequence>
 *         &lt;element name="component" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.uncertml.org/3.0}AbstractCategoricalUnivariateDistribution"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="weight" use="required" type="{http://www.uncertml.org/3.0}prob" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoricalUnivariateMixtureModelType", propOrder = {
    "component"
})
@XmlSeeAlso({
    CategoricalUnivariateMixtureModel.class
})
public class CategoricalUnivariateMixtureModelType
    extends AbstractCategoricalUnivariateDistributionType
{
	@XmlTransient
	public static java.lang.String DEFINITION_ELEMENT_URI = "mixture-model";

	@Override
	protected java.lang.String getDefinitionElementURI() {
		return DEFINITION_ELEMENT_URI;
	}

    @XmlElement(required = true)
    protected List<CategoricalUnivariateMixtureModelType.Component> component;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoricalUnivariateMixtureModelType.Component }
     * 
     * 
     */
    public List<CategoricalUnivariateMixtureModelType.Component> getComponent() {
        if (component == null) {
            component = new ArrayList<CategoricalUnivariateMixtureModelType.Component>();
        }
        return this.component;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.uncertml.org/3.0}AbstractCategoricalUnivariateDistribution"/>
     *       &lt;/sequence>
     *       &lt;attribute name="weight" use="required" type="{http://www.uncertml.org/3.0}prob" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractCategoricalUnivariateDistribution"
    })
    public static class Component {

        @XmlElementRef(name = "AbstractCategoricalUnivariateDistribution", namespace = "http://www.uncertml.org/3.0", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractCategoricalUnivariateDistributionType> abstractCategoricalUnivariateDistribution;
        @XmlAttribute(name = "weight", required = true)
        protected double weight;

        /**
         * Gets the value of the abstractCategoricalUnivariateDistribution property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BernoulliDistribution }{@code >}
         *     {@link JAXBElement }{@code <}{@link CategoricalUnivariateMixtureModel }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractCategoricalUnivariateDistributionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractCategoricalUnivariateDistributionType> getAbstractCategoricalUnivariateDistribution() {
            return abstractCategoricalUnivariateDistribution;
        }

        /**
         * Sets the value of the abstractCategoricalUnivariateDistribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BernoulliDistribution }{@code >}
         *     {@link JAXBElement }{@code <}{@link CategoricalUnivariateMixtureModel }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractCategoricalUnivariateDistributionType }{@code >}
         *     
         */
        public void setAbstractCategoricalUnivariateDistribution(JAXBElement<? extends AbstractCategoricalUnivariateDistributionType> value) {
            this.abstractCategoricalUnivariateDistribution = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         */
        public double getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         */
        public void setWeight(double value) {
            this.weight = value;
        }

    }


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
