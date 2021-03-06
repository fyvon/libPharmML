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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * <p>Java class for UniformDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniformDistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.uncertml.org/3.0}AbstractContinuousUnivariateDistributionType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="minimum" type="{http://www.uncertml.org/3.0}ContinuousValueType"/>
 *           &lt;element name="maximum" type="{http://www.uncertml.org/3.0}ContinuousValueType"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="numberOfClasses" type="{http://www.uncertml.org/3.0}PositiveNaturalNumberValueType"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniformDistributionType", propOrder = {
    "minimum",
    "maximum",
    "numberOfClasses"
})
@XmlSeeAlso({
    UniformDistribution.class
})
public class UniformDistributionType
    extends AbstractContinuousUnivariateDistributionType
{
	@XmlTransient
	public static java.lang.String DEFINITION_ELEMENT_URI = "uniform";

	@Override
	protected java.lang.String getDefinitionElementURI() {
		return DEFINITION_ELEMENT_URI;
	}

    protected ContinuousValueType minimum;
    protected ContinuousValueType maximum;
    protected PositiveNaturalNumberValueType numberOfClasses;

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousValueType }
     *     
     */
    public ContinuousValueType getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousValueType }
     *     
     */
    public void setMinimum(ContinuousValueType value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousValueType }
     *     
     */
    public ContinuousValueType getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousValueType }
     *     
     */
    public void setMaximum(ContinuousValueType value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the numberOfClasses property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveNaturalNumberValueType }
     *     
     */
    public PositiveNaturalNumberValueType getNumberOfClasses() {
        return numberOfClasses;
    }

    /**
     * Sets the value of the numberOfClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveNaturalNumberValueType }
     *     
     */
    public void setNumberOfClasses(PositiveNaturalNumberValueType value) {
        this.numberOfClasses = value;
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
