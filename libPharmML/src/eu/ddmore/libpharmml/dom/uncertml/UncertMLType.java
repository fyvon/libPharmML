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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UncertMLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UncertMLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.uncertml.org/3.0}AbstractUncertainty"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UncertMLType", propOrder = {
    "abstractUncertainty"
})
public class UncertMLType {

    @XmlElementRef(name = "AbstractUncertainty", namespace = "http://www.uncertml.org/3.0", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractUncertaintyType> abstractUncertainty;

    /**
     * Gets the value of the abstractUncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParetoDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Range }{@code >}
     *     {@link JAXBElement }{@code <}{@link StudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link SystematicSample }{@code >}
     *     {@link JAXBElement }{@code <}{@link Quantile }{@code >}
     *     {@link JAXBElement }{@code <}{@link Kurtosis }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mean }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChiSquareDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link BernoulliDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link RandomSample }{@code >}
     *     {@link JAXBElement }{@code <}{@link Probability }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteProbability }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnknownSample }{@code >}
     *     {@link JAXBElement }{@code <}{@link CentredMoment }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDiscreteDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegativeBinomialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Correlation }{@code >}
     *     {@link JAXBElement }{@code <}{@link Realisation }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateStudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link GammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link WishartDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Skewness }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatisticsCollection }{@code >}
     *     {@link JAXBElement }{@code <}{@link Percentile }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogisticDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CredibleInterval }{@code >}
     *     {@link JAXBElement }{@code <}{@link FDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Variance }{@code >}
     *     {@link JAXBElement }{@code <}{@link Quartile }{@code >}
     *     {@link JAXBElement }{@code <}{@link Decile }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultinomialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDiscreteMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinomialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiracDeltaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CauchyDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterquartileRange }{@code >}
     *     {@link JAXBElement }{@code <}{@link UniformDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeometricDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link HypergeometricDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardDeviation }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link BetaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSummaryStatisticType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSampleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractUncertaintyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeibullDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoissonDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CovarianceMatrix }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirichletDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDiscreteUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoefficientOfVariation }{@code >}
     *     {@link JAXBElement }{@code <}{@link LaplaceDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalInverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Moment }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConfidenceInterval }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mode }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExponentialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Median }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalUnivariateDistributionType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractUncertaintyType> getAbstractUncertainty() {
        return abstractUncertainty;
    }

    /**
     * Sets the value of the abstractUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParetoDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Range }{@code >}
     *     {@link JAXBElement }{@code <}{@link StudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link SystematicSample }{@code >}
     *     {@link JAXBElement }{@code <}{@link Quantile }{@code >}
     *     {@link JAXBElement }{@code <}{@link Kurtosis }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mean }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChiSquareDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link BernoulliDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link RandomSample }{@code >}
     *     {@link JAXBElement }{@code <}{@link Probability }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteProbability }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnknownSample }{@code >}
     *     {@link JAXBElement }{@code <}{@link CentredMoment }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDiscreteDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegativeBinomialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Correlation }{@code >}
     *     {@link JAXBElement }{@code <}{@link Realisation }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateStudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link GammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link WishartDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Skewness }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatisticsCollection }{@code >}
     *     {@link JAXBElement }{@code <}{@link Percentile }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogisticDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CredibleInterval }{@code >}
     *     {@link JAXBElement }{@code <}{@link FDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Variance }{@code >}
     *     {@link JAXBElement }{@code <}{@link Quartile }{@code >}
     *     {@link JAXBElement }{@code <}{@link Decile }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultinomialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDiscreteMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinomialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiracDeltaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CauchyDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterquartileRange }{@code >}
     *     {@link JAXBElement }{@code <}{@link UniformDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeometricDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link HypergeometricDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardDeviation }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link BetaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSummaryStatisticType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSampleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractUncertaintyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeibullDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoissonDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CovarianceMatrix }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirichletDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDiscreteUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoefficientOfVariation }{@code >}
     *     {@link JAXBElement }{@code <}{@link LaplaceDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalInverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Moment }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConfidenceInterval }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mode }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExponentialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link Median }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalUnivariateDistributionType }{@code >}
     *     
     */
    public void setAbstractUncertainty(JAXBElement<? extends AbstractUncertaintyType> value) {
        this.abstractUncertainty = value;
    }

}
