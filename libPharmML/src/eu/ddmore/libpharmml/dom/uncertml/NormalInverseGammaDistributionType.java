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
 * <p>Java class for NormalInverseGammaDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormalInverseGammaDistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.uncertml.org/3.0}AbstractContinuousMultivariateDistributionType">
 *       &lt;sequence>
 *         &lt;element name="mean" type="{http://www.uncertml.org/3.0}ContinuousValueType"/>
 *         &lt;element name="varianceScaling" type="{http://www.uncertml.org/3.0}PositiveRealValueType"/>
 *         &lt;element name="truncationLowerInclusiveBoundN" type="{http://www.uncertml.org/3.0}ContinuousValueType" minOccurs="0"/>
 *         &lt;element name="truncationUpperInclusiveBoundN" type="{http://www.uncertml.org/3.0}ContinuousValueType" minOccurs="0"/>
 *         &lt;element name="shape" type="{http://www.uncertml.org/3.0}PositiveRealValueType"/>
 *         &lt;element name="scale" type="{http://www.uncertml.org/3.0}PositiveRealValueType"/>
 *         &lt;element name="truncationLowerInclusiveBoundIG" type="{http://www.uncertml.org/3.0}PositiveRealValueType" minOccurs="0"/>
 *         &lt;element name="truncationUpperInclusiveBoundIG" type="{http://www.uncertml.org/3.0}PositiveRealValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NormalInverseGammaDistributionType", propOrder = {
    "mean",
    "varianceScaling",
    "truncationLowerInclusiveBoundN",
    "truncationUpperInclusiveBoundN",
    "shape",
    "scale",
    "truncationLowerInclusiveBoundIG",
    "truncationUpperInclusiveBoundIG"
})
@XmlSeeAlso({
    NormalInverseGammaDistribution.class
})
public class NormalInverseGammaDistributionType
    extends AbstractContinuousMultivariateDistributionType
{
	@XmlTransient
	public static java.lang.String DEFINITION_ELEMENT_URI = "normal-inverse-gamma";

	@Override
	protected java.lang.String getDefinitionElementURI() {
		return DEFINITION_ELEMENT_URI;
	}

    @XmlElement(required = true)
    protected ContinuousValueType mean;
    @XmlElement(required = true)
    protected PositiveRealValueType varianceScaling;
    protected ContinuousValueType truncationLowerInclusiveBoundN;
    protected ContinuousValueType truncationUpperInclusiveBoundN;
    @XmlElement(required = true)
    protected PositiveRealValueType shape;
    @XmlElement(required = true)
    protected PositiveRealValueType scale;
    protected PositiveRealValueType truncationLowerInclusiveBoundIG;
    protected PositiveRealValueType truncationUpperInclusiveBoundIG;

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
     * Gets the value of the varianceScaling property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getVarianceScaling() {
        return varianceScaling;
    }

    /**
     * Sets the value of the varianceScaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setVarianceScaling(PositiveRealValueType value) {
        this.varianceScaling = value;
    }

    /**
     * Gets the value of the truncationLowerInclusiveBoundN property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousValueType }
     *     
     */
    public ContinuousValueType getTruncationLowerInclusiveBoundN() {
        return truncationLowerInclusiveBoundN;
    }

    /**
     * Sets the value of the truncationLowerInclusiveBoundN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousValueType }
     *     
     */
    public void setTruncationLowerInclusiveBoundN(ContinuousValueType value) {
        this.truncationLowerInclusiveBoundN = value;
    }

    /**
     * Gets the value of the truncationUpperInclusiveBoundN property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousValueType }
     *     
     */
    public ContinuousValueType getTruncationUpperInclusiveBoundN() {
        return truncationUpperInclusiveBoundN;
    }

    /**
     * Sets the value of the truncationUpperInclusiveBoundN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousValueType }
     *     
     */
    public void setTruncationUpperInclusiveBoundN(ContinuousValueType value) {
        this.truncationUpperInclusiveBoundN = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setShape(PositiveRealValueType value) {
        this.shape = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setScale(PositiveRealValueType value) {
        this.scale = value;
    }

    /**
     * Gets the value of the truncationLowerInclusiveBoundIG property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getTruncationLowerInclusiveBoundIG() {
        return truncationLowerInclusiveBoundIG;
    }

    /**
     * Sets the value of the truncationLowerInclusiveBoundIG property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setTruncationLowerInclusiveBoundIG(PositiveRealValueType value) {
        this.truncationLowerInclusiveBoundIG = value;
    }

    /**
     * Gets the value of the truncationUpperInclusiveBoundIG property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveRealValueType }
     *     
     */
    public PositiveRealValueType getTruncationUpperInclusiveBoundIG() {
        return truncationUpperInclusiveBoundIG;
    }

    /**
     * Sets the value of the truncationUpperInclusiveBoundIG property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveRealValueType }
     *     
     */
    public void setTruncationUpperInclusiveBoundIG(PositiveRealValueType value) {
        this.truncationUpperInclusiveBoundIG = value;
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
