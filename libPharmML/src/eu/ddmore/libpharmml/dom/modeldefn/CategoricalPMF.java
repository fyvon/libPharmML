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
package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.commontypes.LinkFunction;
import eu.ddmore.libpharmml.dom.commontypes.PMFtransform;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractCategoricalMultivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractCategoricalUnivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractDiscreteMultivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractDiscreteUnivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.BernoulliDistribution;
import eu.ddmore.libpharmml.dom.uncertml.BinomialDistribution;
import eu.ddmore.libpharmml.dom.uncertml.CategoricalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.CategoricalMultivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.CategoricalUnivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.DiscreteMultivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.DiscreteUnivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.GeometricDistribution;
import eu.ddmore.libpharmml.dom.uncertml.HypergeometricDistribution;
import eu.ddmore.libpharmml.dom.uncertml.MultinomialDistribution;
import eu.ddmore.libpharmml.dom.uncertml.NegativeBinomialDistribution;
import eu.ddmore.libpharmml.dom.uncertml.PoissonDistribution;
import eu.ddmore.libpharmml.dom.uncertml.WishartDistribution;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 Type specifies a PMF for categorical data models.
 *             
 * 
 * <p>Java class for CategoricalPMFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoricalPMFType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.uncertml.org/3.0}AbstractCategoricalUnivariateDistribution" minOccurs="0"/>
 *           &lt;element ref="{http://www.uncertml.org/3.0}AbstractCategoricalMultivariateDistribution" minOccurs="0"/>
 *           &lt;element ref="{http://www.uncertml.org/3.0}AbstractDiscreteUnivariateDistribution" minOccurs="0"/>
 *           &lt;element ref="{http://www.uncertml.org/3.0}AbstractDiscreteMultivariateDistribution" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="transform" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}PMFtransformType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoricalPMFType", propOrder = {
    "jaxb_abstractCategoricalUnivariateDistribution",
    "jaxb_abstractCategoricalMultivariateDistribution",
    "jaxb_abstractDiscreteUnivariateDistribution",
    "jaxb_abstractDiscreteMultivariateDistribution",
    "distribution"
})
@XmlJavaTypeAdapter(CategoricalPMF.Adapter.class)
public class CategoricalPMF
    extends PharmMLRootType
{

	// --------
    @XmlElementRef(name = "AbstractCategoricalUnivariateDistribution", namespace = NS_DEFAULT_UNCERTML, type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCategoricalUnivariateDistributionType> jaxb_abstractCategoricalUnivariateDistribution;
    @XmlElementRef(name = "AbstractCategoricalMultivariateDistribution", namespace = NS_DEFAULT_UNCERTML, type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCategoricalMultivariateDistributionType> jaxb_abstractCategoricalMultivariateDistribution;
    @XmlElementRef(name = "AbstractDiscreteUnivariateDistribution", namespace = NS_DEFAULT_UNCERTML, type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractDiscreteUnivariateDistributionType> jaxb_abstractDiscreteUnivariateDistribution;
    @XmlElementRef(name = "AbstractDiscreteMultivariateDistribution", namespace =NS_DEFAULT_UNCERTML, type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractDiscreteMultivariateDistributionType> jaxb_abstractDiscreteMultivariateDistribution;
    
    @XmlTransient
    protected AbstractDistributionType formerdistribution;
    // --------
    
    @XmlElement(name = "Distribution")
    protected Distribution distribution;
    
    @XmlAttribute(name = "linkFunction")
    @Deprecated
    protected LinkFunction linkFunction;
    
    // PharmML 0.7.3
    @XmlAttribute(name = "transform")
    protected PMFtransform transform;

    /**
     * Empty constructor
     */
    public CategoricalPMF(){}
    
    @Deprecated
    public CategoricalPMF(LinkFunction linkFunction){
    	this.linkFunction = linkFunction;
    }
    
    public CategoricalPMF(PMFtransform transform){
    	this.transform = transform;
    }
    
    /**
     * Gets the value of the distribution property. The distribution may have the following types: 
     * <ul><li>{@link BernoulliDistribution}</li>
     * <li>{@link CategoricalUnivariateMixtureModel}</li>
     * <li>{@link CategoricalMultivariateMixtureModel }</li>
     * <li>{@link CategoricalDistribution }</li>
     * <li>{@link GeometricDistribution }</li>
     * <li>{@link HypergeometricDistribution }</li>
     * <li>{@link NegativeBinomialDistribution }</li>
     * <li>{@link PoissonDistribution }</li>
     * <li>{@link BinomialDistribution }</li>
     * <li>{@link DiscreteUnivariateMixtureModel }</li>
     * <li>{@link WishartDistribution }</li>
     * <li>{@link DiscreteMultivariateMixtureModel }</li>
     * <li>{@link MultinomialDistribution }</li></ul>
     * @return The distribution object that may cast to one of the types above.
     * 
     * @deprecated Since PharmML 0.7, the distribution is uncluded in a {@link Distribution}
     * object. See {@link #getDistribution()}.
     */
    @Deprecated
    public AbstractDistributionType getUncertMLDistribution(){
    	return this.formerdistribution;
    }
    
    /**
     * @deprecated Since PharmML 0.7, the distribution is uncluded in a {@link Distribution}
     * object. See {@link #getDistribution()}.
     */
    @Deprecated
    public void setDistribution(AbstractCategoricalUnivariateDistributionType distribution){
    	this.formerdistribution = distribution;
    }
    /**
     * @deprecated Since PharmML 0.7, the distribution is uncluded in a {@link Distribution}
     * object. See {@link #getDistribution()}.
     */
    @Deprecated
    public void setDistribution(AbstractCategoricalMultivariateDistributionType distribution){
    	this.formerdistribution = distribution;
    }
    /**
     * @deprecated Since PharmML 0.7, the distribution is uncluded in a {@link Distribution}
     * object. See {@link #getDistribution()}.
     */
    @Deprecated
    public void setDistribution(AbstractDiscreteUnivariateDistributionType distribution){
    	this.formerdistribution = distribution;
    }
    /**
     * @deprecated Since PharmML 0.7, the distribution is uncluded in a {@link Distribution}
     * object. See {@link #getDistribution()}.
     */
    @Deprecated
    public void setDistribution(AbstractDiscreteMultivariateDistributionType distribution){
    	this.formerdistribution = distribution;
    }
    
    /**
     * Gets the value of the distribution property.
     * 
     * <p>Since PharmML 0.7, the distribution is wrapped in this {@link Distribution} object.
     * In order to make libPharmML backwards compatible with model version prior to 0.7, the 
     * distribution for those models is available via {@link #getUncertMLDistribution()}.
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

    /**
     * Gets the value of the linkFunction property.
     * 
     * @return
     *     possible object is
     *     {@link LinkFunction }
     *     
     * @deprecated Since PharmML 0.7.3
     */
    @Deprecated
    public LinkFunction getLinkFunction() {
        return linkFunction;
    }

    /**
     * Sets the value of the linkFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkFunction }
     *     
     * @deprecated Since PharmML 0.7.3
     */
    @Deprecated
    public void setLinkFunction(LinkFunction value) {
        this.linkFunction = value;
    }
    
    /**
     * Gets the value of the transform property (optional).
     * 
     * @return
     *     possible object is
     *     {@link PMFtransform }
     *     
     * @since PharmML 0.7.3
     */
    public PMFtransform getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property (optional).
     * 
     * @param value
     *     allowed object is
     *     {@link PMFtransform }
     *     
     * @since PharmML 0.7.3
     */
    public void setTransform(PMFtransform value) {
        this.transform = value;
    }
    
    protected static class Adapter extends XmlAdapter<CategoricalPMF, CategoricalPMF>{

		@Override
		public CategoricalPMF unmarshal(CategoricalPMF v) throws Exception {
			if(v.jaxb_abstractCategoricalMultivariateDistribution != null){
				v.formerdistribution = v.jaxb_abstractCategoricalMultivariateDistribution.getValue();
			} else if(v.jaxb_abstractCategoricalUnivariateDistribution != null){
				v.formerdistribution = v.jaxb_abstractCategoricalUnivariateDistribution.getValue();
			} else if(v.jaxb_abstractDiscreteMultivariateDistribution != null){
				v.formerdistribution = v.jaxb_abstractDiscreteMultivariateDistribution.getValue();
			} else if(v.jaxb_abstractDiscreteUnivariateDistribution != null){
				v.formerdistribution = v.jaxb_abstractDiscreteUnivariateDistribution.getValue();
			}
			return v;
		}

		@Override
		public CategoricalPMF marshal(CategoricalPMF v) throws Exception {
			if(v != null){
				if(v.formerdistribution instanceof AbstractCategoricalMultivariateDistributionType){
					v.jaxb_abstractCategoricalMultivariateDistribution = 
							MasterObjectFactory.createCategoricalMultivariateDistribution(
									(AbstractCategoricalMultivariateDistributionType) v.formerdistribution);
				} else if (v.formerdistribution instanceof AbstractCategoricalUnivariateDistributionType){
					v.jaxb_abstractCategoricalUnivariateDistribution =
							MasterObjectFactory.createCategoricalUnivariateDistribution(
									(AbstractCategoricalUnivariateDistributionType) v.formerdistribution);
				} else if (v.formerdistribution instanceof AbstractDiscreteMultivariateDistributionType){
					v.jaxb_abstractDiscreteMultivariateDistribution = 
							MasterObjectFactory.createDiscreteMultivariateDistribution(
									(AbstractDiscreteMultivariateDistributionType) v.formerdistribution);
				} else if (v.formerdistribution instanceof AbstractDiscreteUnivariateDistributionType){
					v.jaxb_abstractDiscreteUnivariateDistribution = 
							MasterObjectFactory.createDiscreteUnivariateDistribution(
									(AbstractDiscreteUnivariateDistributionType) v.formerdistribution);
				}
				return v;
			} else {
				return null;
			}
		}
    	
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>()
    			.addIfNotNull(distribution);
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
