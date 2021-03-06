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


package eu.ddmore.libpharmml.dom.trialdesign;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 Type the defines bolus dosing. 
 *             
 * 
 * <p>Java class for BolusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BolusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/TrialDesign}DosingRegimenType">
 *       &lt;sequence>
 *         &lt;element name="DoseAmount" type="{http://www.pharmml.org/2013/03/TrialDesign}DosingVariableType"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="SteadyState" type="{http://www.pharmml.org/2013/03/TrialDesign}SteadyStateType"/>
 *           &lt;element name="DosingTimes" type="{http://www.pharmml.org/2013/03/TrialDesign}DosingTimesPointsType"/>
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
@XmlType(name = "BolusType", propOrder = {
    "doseAmount",
    "steadyState",
    "dosingTimes"
})
public class Bolus
    extends DosingRegimen
{

    @XmlElement(name = "DoseAmount", required = true)
    protected DosingVariable doseAmount;
    @XmlElement(name = "SteadyState")
    protected SteadyState steadyState;
    @XmlElement(name = "DosingTimes")
    protected DosingTimesPoints dosingTimes;

    /**
     * Gets the value of the doseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DosingVariable }
     *     
     */
    public DosingVariable getDoseAmount() {
        return doseAmount;
    }

    /**
     * Sets the value of the doseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DosingVariable }
     *     
     */
    public void setDoseAmount(DosingVariable value) {
        this.doseAmount = value;
    }

    /**
     * Gets the value of the steadyState property.
     * 
     * @return
     *     possible object is
     *     {@link SteadyState }
     *     
     */
    public SteadyState getSteadyState() {
        return steadyState;
    }

    /**
     * Sets the value of the steadyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SteadyState }
     *     
     */
    public void setSteadyState(SteadyState value) {
        this.steadyState = value;
    }

    /**
     * Gets the value of the dosingTimes property.
     * 
     * @return
     *     possible object is
     *     {@link DosingTimesPoints }
     *     
     */
    public DosingTimesPoints getDosingTimes() {
        return dosingTimes;
    }

    /**
     * Sets the value of the dosingTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DosingTimesPoints }
     *     
     */
    public void setDosingTimes(DosingTimesPoints value) {
        this.dosingTimes = value;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(doseAmount)
				.addIfNotNull(steadyState)
				.addIfNotNull(dosingTimes);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
