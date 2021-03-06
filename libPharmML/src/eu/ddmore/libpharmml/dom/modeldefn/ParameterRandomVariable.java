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


package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.LevelReference;
import eu.ddmore.libpharmml.dom.uncertml.AbstractCategoricalMultivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractCategoricalUnivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractContinuousMultivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractContinuousUnivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.BernoulliDistribution;
import eu.ddmore.libpharmml.dom.uncertml.BetaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.CategoricalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.CategoricalMultivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.CategoricalUnivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.CauchyDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ChiSquareDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ContinuousMultivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.ContinuousUnivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.DiracDeltaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.DirichletDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ExponentialDistribution;
import eu.ddmore.libpharmml.dom.uncertml.FDistribution;
import eu.ddmore.libpharmml.dom.uncertml.GammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.InverseGammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LaplaceDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LogNormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LogisticDistribution;
import eu.ddmore.libpharmml.dom.uncertml.MultivariateNormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.MultivariateStudentTDistribution;
import eu.ddmore.libpharmml.dom.uncertml.NormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.NormalInverseGammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ParetoDistribution;
import eu.ddmore.libpharmml.dom.uncertml.StudentTDistribution;
import eu.ddmore.libpharmml.dom.uncertml.UniformDistribution;
import eu.ddmore.libpharmml.dom.uncertml.WeibullDistribution;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 Type specifies a random variable definition.
 *             
 * 
 * <p>Java class for ParameterRandomVariableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterRandomVariableType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}CommonParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}VariabilityReference" maxOccurs="unbounded"/>
 *         &lt;element name="LHSTransformation" type="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}LHSTransformationType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Distribution" type="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}DistributionType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterRandomVariableType", propOrder = {
    "listOfVariabilityReference",
    "abstractContinuousUnivariateDistribution",
    "abstractContinuousMultivariateDistribution",
    "abstractCategoricalUnivariateDistribution",
    "abstractCategoricalMultivariateDistribution",
    "lhsTransformation",
    "distribution"
})
public class ParameterRandomVariable
    extends CommonParameter
{

	/**
	 * Empty constructor
	 */
	public ParameterRandomVariable() {
		super();
	}

	/**
     * Constructs a parameter that refers to a former declaration within the model. This may be used for parameter assignments within
     * conditional statements.
     * @param referredParameter {@link ParameterRandomVariable} referred by this instance.
     */
	public ParameterRandomVariable(ParameterRandomVariable referredParameter) {
		super(referredParameter);
	}

	/**
	 * Constructs a new parameter with the given symbol identifier.
	 * @param symbId Symbol identifier of the parameter that must be unique within its block.
	 */
	public ParameterRandomVariable(String symbId) {
		super(symbId);
	}


	@XmlElement(name = "VariabilityReference", namespace = NS_DEFAULT_CT)
    protected List<LevelReference> listOfVariabilityReference;
    @Deprecated
    @XmlElementRef(name = "AbstractContinuousUnivariateDistribution", namespace = NS_DEFAULT_UNCERTML, type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractContinuousUnivariateDistributionType> abstractContinuousUnivariateDistribution;
    @Deprecated
    @XmlElementRef(name = "AbstractContinuousMultivariateDistribution", namespace = NS_DEFAULT_UNCERTML, type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractContinuousMultivariateDistributionType> abstractContinuousMultivariateDistribution;
    @Deprecated
    @XmlElementRef(name = "AbstractCategoricalUnivariateDistribution", namespace = NS_DEFAULT_UNCERTML, type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCategoricalUnivariateDistributionType> abstractCategoricalUnivariateDistribution;
    @Deprecated
    @XmlElementRef(name = "AbstractCategoricalMultivariateDistribution", namespace = NS_DEFAULT_UNCERTML, type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCategoricalMultivariateDistributionType> abstractCategoricalMultivariateDistribution;

    // PharmML 0.7
    @XmlElement(name = "LHSTransformation")
    protected LHSTransformationType lhsTransformation;
    @XmlElement(name = "Distribution")
    protected Distribution distribution;
    
    
    /**
     * The level of random variability that describes this random variable.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variabilityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfVariabilityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LevelReference}
     * 
     * 
     */
    public List<LevelReference> getListOfVariabilityReference() {
        if (listOfVariabilityReference == null) {
        	listOfVariabilityReference = new ArrayList<LevelReference>();
        }
        return this.listOfVariabilityReference;
    }
    
    /**
     * 
     * The level of random variability that describes this random variable.
     *                             
     * 
     * @return
     *     possible object is
     *     {@link LevelReference }
     *     
     * @deprecated Since PharmML 0.7, variability references can be multiple. See {@link #getListOfVariabilityReference()}.
     */
    @Deprecated
    public LevelReference getVariabilityReference() {
        if(getListOfVariabilityReference().size() > 0){
        	return getListOfVariabilityReference().get(0);
        } else {
        	return null;
        }
    }

    /**
     * Sets the value of the variabilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelReference }
     *     
     * @deprecated Since PharmML 0.7, variability references can be multiple. See {@link #getListOfVariabilityReference()}.
     */
    @Deprecated
    public void setVariabilityReference(LevelReference value) {
        getListOfVariabilityReference().clear();
        getListOfVariabilityReference().add(value);
    }

    /**
     * 
     *                                     A continuous univariate probability distribution, defined by UncertML. 
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CauchyDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogisticDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link StudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiracDeltaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link BetaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LaplaceDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link GammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link UniformDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link InverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExponentialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChiSquareDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParetoDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link FDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeibullDistribution }{@code >}
     *     
     * @deprecated Since PharmML 0.7, the distributions are located in {@link #getDistribution()}.
     */
    @Deprecated
    public JAXBElement<? extends AbstractContinuousUnivariateDistributionType> getAbstractContinuousUnivariateDistribution() {
        return abstractContinuousUnivariateDistribution;
    }

    /**
     * Sets the value of the abstractContinuousUnivariateDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CauchyDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogisticDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link StudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiracDeltaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link BetaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LaplaceDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link GammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link UniformDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link InverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExponentialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChiSquareDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParetoDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link FDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeibullDistribution }{@code >}
     *     
     * @deprecated Since PharmML 0.7, the distributions are located in {@link #setDistribution(Distribution)}.
     */
    @Deprecated
    public void setAbstractContinuousUnivariateDistribution(JAXBElement<? extends AbstractContinuousUnivariateDistributionType> value) {
        this.abstractContinuousUnivariateDistribution = value;
    }

    /**
     * 
     *                                     A continuous multivariate probability distribution, defined by UncertML. 
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultivariateStudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirichletDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalInverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateNormalDistribution }{@code >}
     *     
     * @deprecated Since PharmML 0.7, the distributions are located in {@link #getDistribution()}.
     */
    @Deprecated
    public JAXBElement<? extends AbstractContinuousMultivariateDistributionType> getAbstractContinuousMultivariateDistribution() {
        return abstractContinuousMultivariateDistribution;
    }

    /**
     * Sets the value of the abstractContinuousMultivariateDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultivariateStudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirichletDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalInverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateNormalDistribution }{@code >}
     *     
     * @deprecated Since PharmML 0.7, the distributions are located in {@link #setDistribution(Distribution)}.
     */
    @Deprecated
    public void setAbstractContinuousMultivariateDistribution(JAXBElement<? extends AbstractContinuousMultivariateDistributionType> value) {
        this.abstractContinuousMultivariateDistribution = value;
    }

    /**
     * 
     *                                     A categorical univariate probability distribution, defined by UncertML. 
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BernoulliDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalUnivariateMixtureModel }{@code >}
     *     
     * @deprecated Since PharmML 0.7, the distributions are located in {@link #getDistribution()}.
     */
    @Deprecated
    public JAXBElement<? extends AbstractCategoricalUnivariateDistributionType> getAbstractCategoricalUnivariateDistribution() {
        return abstractCategoricalUnivariateDistribution;
    }

    /**
     * Sets the value of the abstractCategoricalUnivariateDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BernoulliDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalUnivariateMixtureModel }{@code >}
     *     
     * @deprecated Since PharmML 0.7, the distributions are located in {@link #setDistribution(Distribution)}.
     */
    @Deprecated
    public void setAbstractCategoricalUnivariateDistribution(JAXBElement<? extends AbstractCategoricalUnivariateDistributionType> value) {
        this.abstractCategoricalUnivariateDistribution = value;
    }

    /**
     * 
     *                                     A categorical multivariate probability distribution, defined by UncertML. 
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoricalMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalDistribution }{@code >}
     *     
     * @deprecated Since PharmML 0.7, the distributions are located in {@link #getDistribution()}.
     */
    @Deprecated
    public JAXBElement<? extends AbstractCategoricalMultivariateDistributionType> getAbstractCategoricalMultivariateDistribution() {
        return abstractCategoricalMultivariateDistribution;
    }

    /**
     * Sets the value of the abstractCategoricalMultivariateDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoricalMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCategoricalMultivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoricalDistribution }{@code >}
     *     
     * @deprecated Since PharmML 0.7, the distributions are located in {@link #setDistribution(Distribution)}.
     */
    @Deprecated
    public void setAbstractCategoricalMultivariateDistribution(JAXBElement<? extends AbstractCategoricalMultivariateDistributionType> value) {
        this.abstractCategoricalMultivariateDistribution = value;
    }
    
    /**
     * Gets the value of the lhsTransformation property.
     * 
     * @return
     *     possible object is
     *     {@link LHSTransformationType }
     *     
     * @since PharmML 0.7
     */
    public LHSTransformationType getLHSTransformation() {
        return lhsTransformation;
    }

    /**
     * Sets the value of the lhsTransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LHSTransformationType }
     *     
     * @since PharmML 0.7
     */
    public void setLHSTransformation(LHSTransformationType value) {
        this.lhsTransformation = value;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * @return
     *     possible object is
     *     {@link Distribution }
     *     
     * @since PharmML 0.7
     */
    public Distribution getDistribution() {
        return distribution;
    }

    /**
     * Sets the value of the distribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distribution }
     *     
     * @since PharmML 0.7
     */
    public void setDistribution(Distribution value) {
        this.distribution = value;
    }

    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>(super.listChildren())
				.addIfNotNull(listOfVariabilityReference)
				.addJAXBIfNotNull(abstractContinuousUnivariateDistribution)
				.addJAXBIfNotNull(abstractContinuousMultivariateDistribution)
				.addJAXBIfNotNull(abstractCategoricalUnivariateDistribution)
				.addJAXBIfNotNull(abstractCategoricalMultivariateDistribution)
				.addIfNotNull(lhsTransformation)
				.addIfNotNull(distribution);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
