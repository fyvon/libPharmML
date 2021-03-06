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
package eu.ddmore.libpharmml.dom.modellingsteps;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.Rhs;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRef;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 Type defining paramaters to be estimated and their bounds and initial estimates.                 
 *             
 * 
 * <p>Java class for ParameterEstimateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterEstimateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *         &lt;element name="InitialEstimate" type="{http://www.pharmml.org/2013/03/ModellingSteps}InitialEstimateType" minOccurs="0"/>
 *         &lt;element name="LowerBound" type="{http://www.pharmml.org/2013/03/CommonTypes}ScalarRhs" minOccurs="0"/>
 *         &lt;element name="UpperBound" type="{http://www.pharmml.org/2013/03/CommonTypes}ScalarRhs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterEstimateType", propOrder = {
    "symbRef",
    "initialEstimate",
    "lowerBound",
    "upperBound"
})
public class ParameterEstimate
    extends PharmMLRootType
{

    @XmlElement(name = "SymbRef", namespace = NS_DEFAULT_CT, required = true)
    protected SymbolRef symbRef;
    @XmlElement(name = "InitialEstimate")
    protected InitialEstimate initialEstimate;
    @XmlElement(name = "LowerBound")
    protected Rhs lowerBound;
    @XmlElement(name = "UpperBound")
    protected Rhs upperBound;

    /**
     * 
     *                                 Reference to the parameter to be estimated.                 
     *                             
     * 
     * @return
     *     possible object is
     *     {@link SymbolRef }
     *     
     */
    public SymbolRef getSymbRef() {
        return symbRef;
    }

    /**
     * Sets the value of the symbRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolRef }
     *     
     */
    public void setSymbRef(SymbolRef value) {
        this.symbRef = value;
    }

    /**
     * Gets the value of the initialEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link InitialEstimate }
     *     
     */
    public InitialEstimate getInitialEstimate() {
        return initialEstimate;
    }

    /**
     * Sets the value of the initialEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialEstimate }
     *     
     */
    public void setInitialEstimate(InitialEstimate value) {
        this.initialEstimate = value;
    }

    /**
     * Gets the value of the lowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link Rhs }
     *     
     */
    public Rhs getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rhs }
     *     
     */
    public void setLowerBound(Rhs value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     * @return
     *     possible object is
     *     {@link Rhs }
     *     
     */
    public Rhs getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rhs }
     *     
     */
    public void setUpperBound(Rhs value) {
        this.upperBound = value;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(symbRef)
				.addIfNotNull(initialEstimate)
				.addIfNotNull(lowerBound)
				.addIfNotNull(upperBound);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
