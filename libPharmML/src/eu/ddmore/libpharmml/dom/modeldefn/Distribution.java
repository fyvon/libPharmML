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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.maths.Piecewise;
import eu.ddmore.libpharmml.dom.probonto.DistributionName;
import eu.ddmore.libpharmml.dom.probonto.DistributionType;
import eu.ddmore.libpharmml.dom.probonto.ProbOnto;
import eu.ddmore.libpharmml.impl.PharmMLVersion;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.util.annotations.HasElementRenamed;
import eu.ddmore.libpharmml.util.annotations.RenamedElement;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * Wrapping element of a distribution. The distribution can use the new {@link ProbOnto} feature,
 * or used the historical {@link UncertML} type.
 * 
 * <p>Additionally, it is possible to encode a conditional distribution using the {@link Piecewise}
 * element. It is then possible to use a different distribution depending on the nature of a 
 * covariate for instance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element name="UncertML" type="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}UncertMLType"/>
 *         &lt;element name="ProbOnto" type="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}ProbOntoType"/>
 *         &lt;element name="Piecewise" type="{http://www.pharmml.org/pharmml/0.7/Maths}PiecewiseType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @since PharmML 0.7
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionType", propOrder = {
    "uncertML",
    "probOnto",
    "piecewise_mdef",
    "piecewise_math"
})
@HasElementRenamed(mappedFields = {
		@RenamedElement(field = "piecewise_mdef"),
		@RenamedElement(field = "piecewise_math", since = PharmMLVersion.V0_8_1)
		}, transientField = "piecewise")
public class Distribution
    extends PharmMLRootType
{

    @XmlElement(name = "UncertML")
    protected UncertML uncertML;
    @XmlElement(name = "ProbOnto", namespace = NS_DEFAULT_PROBONTO)
    protected ProbOnto probOnto;
    
    @XmlElement(name = "Piecewise", namespace = NS_DEFAULT_MDEF)
    protected Piecewise piecewise_mdef;
    @XmlElement(name = "Piecewise", namespace = NS_DEFAULT_MATH)
    protected Piecewise piecewise_math;
    @XmlTransient
    protected Piecewise piecewise;

    /**
     * Gets the value of the uncertML property.
     * 
     * @return
     *     possible object is
     *     {@link UncertML }
     *     
     */
    public UncertML getUncertML() {
        return uncertML;
    }

    /**
     * Sets the value of the uncertML property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertML }
     *     
     */
    public void setUncertML(UncertML value) {
        this.uncertML = value;
    }

    /**
     * Gets the value of the probOnto property.
     * 
     * @return
     *     possible object is
     *     {@link ProbOnto }
     *     
     */
    public ProbOnto getProbOnto() {
        return probOnto;
    }

    /**
     * Sets the value of the probOnto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbOnto }
     *     
     */
    public void setProbOnto(ProbOnto value) {
        this.probOnto = value;
    }

    /**
     * A piecewise expression for conditional distributions.
     * 
     * @return
     *     possible object is
     *     {@link Piecewise }
     *     
     */
    public Piecewise getPiecewise() {
        return piecewise;
    }

    /**
     * Sets the value of the piecewise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Piecewise }
     *     
     */
    public void setPiecewise(Piecewise value) {
        this.piecewise = value;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(uncertML)
    			.addIfNotNull(probOnto)
    			.addIfNotNull(piecewise);
    }
    
    /**
     * Creates a new empty {@link UncertML} uncertML element, adds it to the current object and returns it.
     * @return The created {@link UncertML} object.
     */
    public UncertML createUncertML(){
            UncertML el = new UncertML();
            this.uncertML = el;
            return el;
    }

    /**
     * Creates a new empty {@link ProbOnto} probOnto element, adds it to the current object and returns it.
     * @return The created {@link ProbOnto} object.
     */
    public ProbOnto createProbOnto(){
            ProbOnto el = new ProbOnto();
            this.probOnto = el;
            return el;
    }
    
    /**
     * Creates a new empty {@link ProbOnto} probOnto element, adds it to the current object and returns it.
     * @param name The name of the distribution, compliant with ProbOnto ontology.
     * @return The created {@link ProbOnto} object.
     */
    public ProbOnto createProbOnto(DistributionName name){
            ProbOnto el = new ProbOnto();
            el.setName(name);
            this.probOnto = el;
            return el;
    }
    
    /**
     * Creates a new empty {@link ProbOnto} probOnto element, adds it to the current object and returns it.
     * @param name The name of the distribution, compliant with ProbOnto ontology.
     * @param type The type of the distribution, univariate or multivariate.
     * @return The created {@link ProbOnto} object.
     */
    public ProbOnto createProbOnto(DistributionName name, DistributionType type){
            ProbOnto el = new ProbOnto();
            el.setName(name);
            el.setType(type);
            this.probOnto = el;
            return el;
    }

    /**
     * Creates a new empty {@link Piecewise} piecewise element, adds it to the current object and returns it.
     * @return The created {@link Piecewise} object.
     */
    public Piecewise createPiecewise(){
            Piecewise el = new Piecewise();
            this.piecewise = el;
            return el;
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}


}
