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
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom.uncertml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetaDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetaDistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.uncertml.org/3.0}AbstractContinuousUnivariateDistributionType">
 *       &lt;sequence>
 *         &lt;element name="alpha" type="{http://www.uncertml.org/3.0}PositiveRealValueType"/>
 *         &lt;element name="beta" type="{http://www.uncertml.org/3.0}PositiveRealValueType"/>
 *         &lt;element name="truncationLowerInclusiveBound" type="{http://www.uncertml.org/3.0}ProbabilityValueType" minOccurs="0"/>
 *         &lt;element name="truncationUpperInclusiveBound" type="{http://www.uncertml.org/3.0}ProbabilityValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BetaDistributionType", propOrder = {
    "alpha",
    "beta",
    "truncationLowerInclusiveBound",
    "truncationUpperInclusiveBound"
})
@XmlSeeAlso({
    BetaDistribution.class
})
public class BetaDistributionType
    extends AbstractContinuousUnivariateDistributionType
{
	
	@XmlTransient
	public static java.lang.String DEFINITION_ELEMENT_URI = "beta";

	@Override
	protected java.lang.String getDefinitionElementURI() {
		return DEFINITION_ELEMENT_URI;
	}

    @XmlElement(required = true)
    protected PositiveRealValueType alpha;
    @XmlElement(required = true)
    protected PositiveRealValueType beta;
    protected ProbabilityValueType truncationLowerInclusiveBound;
    protected ProbabilityValueType truncationUpperInclusiveBound;

    /**
     * Gets the value of the alpha property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setAlpha(PositiveRealValueType value) {
        this.alpha = value;
    }

    /**
     * Gets the value of the beta property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getBeta() {
        return beta;
    }

    /**
     * Sets the value of the beta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setBeta(PositiveRealValueType value) {
        this.beta = value;
    }

    /**
     * Gets the value of the truncationLowerInclusiveBound property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityValueType }
     *     
     */
    public ProbabilityValueType getTruncationLowerInclusiveBound() {
        return truncationLowerInclusiveBound;
    }

    /**
     * Sets the value of the truncationLowerInclusiveBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityValueType }
     *     
     */
    public void setTruncationLowerInclusiveBound(ProbabilityValueType value) {
        this.truncationLowerInclusiveBound = value;
    }

    /**
     * Gets the value of the truncationUpperInclusiveBound property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityValueType }
     *     
     */
    public ProbabilityValueType getTruncationUpperInclusiveBound() {
        return truncationUpperInclusiveBound;
    }

    /**
     * Sets the value of the truncationUpperInclusiveBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityValueType }
     *     
     */
    public void setTruncationUpperInclusiveBound(ProbabilityValueType value) {
        this.truncationUpperInclusiveBound = value;
    }

}
