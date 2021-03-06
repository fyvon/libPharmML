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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * <p>Java class for BinomialDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinomialDistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.uncertml.org/3.0}AbstractDiscreteUnivariateDistributionType">
 *       &lt;sequence>
 *         &lt;element name="numberOfTrials" type="{http://www.uncertml.org/3.0}NaturalNumberValueType"/>
 *         &lt;element name="probabilityOfSuccess" type="{http://www.uncertml.org/3.0}ProbabilityValueType"/>
 *         &lt;element name="truncationLowerInclusiveBound" type="{http://www.uncertml.org/3.0}NaturalNumberValueType" minOccurs="0"/>
 *         &lt;element name="truncationUpperInclusiveBound" type="{http://www.uncertml.org/3.0}NaturalNumberValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinomialDistributionType", propOrder = {
    "numberOfTrials",
    "probabilityOfSuccess",
    "truncationLowerInclusiveBound",
    "truncationUpperInclusiveBound"
})
@XmlSeeAlso({
    BinomialDistribution.class
})
public class BinomialDistributionType
    extends AbstractDiscreteUnivariateDistributionType
{
	
	@XmlTransient
	public static java.lang.String DEFINITION_ELEMENT_URI = "binomial";

	@Override
	protected java.lang.String getDefinitionElementURI() {
		return DEFINITION_ELEMENT_URI;
	}

    @XmlElement(required = true)
    protected NaturalNumberValueType numberOfTrials;
    @XmlElement(required = true)
    protected ProbabilityValueType probabilityOfSuccess;
    protected NaturalNumberValueType truncationLowerInclusiveBound;
    protected NaturalNumberValueType truncationUpperInclusiveBound;

    /**
     * Gets the value of the numberOfTrials property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalNumberValueType }
     *     
     */
    public NaturalNumberValueType getNumberOfTrials() {
        return numberOfTrials;
    }

    /**
     * Sets the value of the numberOfTrials property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalNumberValueType }
     *     
     */
    public void setNumberOfTrials(NaturalNumberValueType value) {
        this.numberOfTrials = value;
    }

    /**
     * Gets the value of the probabilityOfSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityValueType }
     *     
     */
    public ProbabilityValueType getProbabilityOfSuccess() {
        return probabilityOfSuccess;
    }

    /**
     * Sets the value of the probabilityOfSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityValueType }
     *     
     */
    public void setProbabilityOfSuccess(ProbabilityValueType value) {
        this.probabilityOfSuccess = value;
    }

    /**
     * Gets the value of the truncationLowerInclusiveBound property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalNumberValueType }
     *     
     */
    public NaturalNumberValueType getTruncationLowerInclusiveBound() {
        return truncationLowerInclusiveBound;
    }

    /**
     * Sets the value of the truncationLowerInclusiveBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalNumberValueType }
     *     
     */
    public void setTruncationLowerInclusiveBound(NaturalNumberValueType value) {
        this.truncationLowerInclusiveBound = value;
    }

    /**
     * Gets the value of the truncationUpperInclusiveBound property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalNumberValueType }
     *     
     */
    public NaturalNumberValueType getTruncationUpperInclusiveBound() {
        return truncationUpperInclusiveBound;
    }

    /**
     * Sets the value of the truncationUpperInclusiveBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalNumberValueType }
     *     
     */
    public void setTruncationUpperInclusiveBound(NaturalNumberValueType value) {
        this.truncationUpperInclusiveBound = value;
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
