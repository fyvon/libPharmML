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
 * <p>Java class for NormalDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormalDistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.uncertml.org/3.0}AbstractContinuousUnivariateDistributionType">
 *       &lt;sequence>
 *         &lt;element name="mean" type="{http://www.uncertml.org/3.0}ContinuousValueType"/>
 *         &lt;choice>
 *           &lt;element name="variance" type="{http://www.uncertml.org/3.0}PositiveRealValueType"/>
 *           &lt;element name="stddev" type="{http://www.uncertml.org/3.0}PositiveRealValueType"/>
 *         &lt;/choice>
 *         &lt;element name="truncationLowerInclusiveBound" type="{http://www.uncertml.org/3.0}ContinuousValueType" minOccurs="0"/>
 *         &lt;element name="truncationUpperInclusiveBound" type="{http://www.uncertml.org/3.0}ContinuousValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NormalDistributionType", propOrder = {
    "mean",
    "variance",
    "stddev",
    "truncationLowerInclusiveBound",
    "truncationUpperInclusiveBound"
})
@XmlSeeAlso({
    NormalDistribution.class
})
public class NormalDistributionType
    extends AbstractContinuousUnivariateDistributionType
{
	@XmlTransient
	public static java.lang.String DEFINITION_ELEMENT_URI = "normal";

    @XmlElement(required = true)
    protected ContinuousValueType mean;
    protected PositiveRealValueType variance;
    protected PositiveRealValueType stddev;
    protected ContinuousValueType truncationLowerInclusiveBound;
    protected ContinuousValueType truncationUpperInclusiveBound;

    /**
     * Gets the value of the mean property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousValueType }
     *     
     */
    public ContinuousValueType getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousValueType }
     *     
     */
    public void setMean(ContinuousValueType value) {
        this.mean = value;
    }

    /**
     * Gets the value of the variance property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getVariance() {
        return variance;
    }

    /**
     * Sets the value of the variance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setVariance(PositiveRealValueType value) {
        this.variance = value;
    }

    /**
     * Gets the value of the stddev property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getStddev() {
        return stddev;
    }

    /**
     * Sets the value of the stddev property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setStddev(PositiveRealValueType value) {
        this.stddev = value;
    }

    /**
     * Gets the value of the truncationLowerInclusiveBound property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousValueType }
     *     
     */
    public ContinuousValueType getTruncationLowerInclusiveBound() {
        return truncationLowerInclusiveBound;
    }

    /**
     * Sets the value of the truncationLowerInclusiveBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousValueType }
     *     
     */
    public void setTruncationLowerInclusiveBound(ContinuousValueType value) {
        this.truncationLowerInclusiveBound = value;
    }

    /**
     * Gets the value of the truncationUpperInclusiveBound property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousValueType }
     *     
     */
    public ContinuousValueType getTruncationUpperInclusiveBound() {
        return truncationUpperInclusiveBound;
    }

    /**
     * Sets the value of the truncationUpperInclusiveBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousValueType }
     *     
     */
    public void setTruncationUpperInclusiveBound(ContinuousValueType value) {
        this.truncationUpperInclusiveBound = value;
    }

	@Override
	protected java.lang.String getDefinitionElementURI() {
		return DEFINITION_ELEMENT_URI;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
