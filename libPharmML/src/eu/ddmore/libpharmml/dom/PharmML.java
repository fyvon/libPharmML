/*******************************************************************************
 * Copyright (c) 2014 European Molecular Biology Laboratory,
 * Heidelberg, Germany.
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on 
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations 
 * under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.ddmore.libpharmml.dom.commontypes.AnnotationType;
import eu.ddmore.libpharmml.dom.commontypes.FunctionDefinition;
import eu.ddmore.libpharmml.dom.commontypes.Name;
import eu.ddmore.libpharmml.dom.modeldefn.ModelDefinition;
import eu.ddmore.libpharmml.dom.modellingsteps.ModellingSteps;
import eu.ddmore.libpharmml.dom.trialdesign.TrialDesign;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Name"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Description" minOccurs="0"/>
 *         &lt;element name="IndependentVariable" type="{http://www.pharmml.org/2013/03/PharmML}IndependentVariableType" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}FunctionDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/ModelDefinition}ModelDefinition"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/TrialDesign}TrialDesign" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/ModellingSteps}ModellingSteps" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/2013/03/CommonTypes}RootAttributesGroup"/>
 *       &lt;attribute name="writtenVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="implementedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "description",
    "independentVariable",
    "functionDefinition",
    "modelDefinition",
    "trialDesign",
    "modellingSteps"
})
@XmlRootElement(name = "PharmML")
public class PharmML {

    @XmlElement(name = "Name", namespace = "http://www.pharmml.org/2013/03/CommonTypes", required = true)
    protected Name name;
    @XmlElement(name = "Description", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected AnnotationType description;
    @XmlElement(name = "IndependentVariable")
    protected IndependentVariable independentVariable;
    @XmlElement(name = "FunctionDefinition", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected List<FunctionDefinition> functionDefinition;
    @XmlElement(name = "ModelDefinition", namespace = "http://www.pharmml.org/2013/03/ModelDefinition", required = true)
    protected ModelDefinition modelDefinition;
    @XmlElement(name = "TrialDesign", namespace = "http://www.pharmml.org/2013/03/TrialDesign")
    protected TrialDesign trialDesign;
    @XmlElement(name = "ModellingSteps", namespace = "http://www.pharmml.org/2013/03/ModellingSteps")
    protected ModellingSteps modellingSteps;
    @XmlAttribute(name = "writtenVersion", required = true)
    protected String writtenVersion;
    @XmlAttribute(name = "implementedBy")
    protected String implementedBy;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationType }
     *     
     */
    public AnnotationType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationType }
     *     
     */
    public void setDescription(AnnotationType value) {
        this.description = value;
    }

    /**
     * Gets the value of the independentVariable property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentVariable }
     *     
     */
    public IndependentVariable getIndependentVariable() {
        return independentVariable;
    }

    /**
     * Sets the value of the independentVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentVariable }
     *     
     */
    public void setIndependentVariable(IndependentVariable value) {
        this.independentVariable = value;
    }

    /**
     * Gets the value of the functionDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionDefinition }
     * 
     * 
     */
    public List<FunctionDefinition> getFunctionDefinition() {
        if (functionDefinition == null) {
            functionDefinition = new ArrayList<FunctionDefinition>();
        }
        return this.functionDefinition;
    }

    /**
     * 
     *                             Defines the model definition section.
     *                         
     * 
     * @return
     *     possible object is
     *     {@link ModelDefinition }
     *     
     */
    public ModelDefinition getModelDefinition() {
        return modelDefinition;
    }

    /**
     * Sets the value of the modelDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelDefinition }
     *     
     */
    public void setModelDefinition(ModelDefinition value) {
        this.modelDefinition = value;
    }

    /**
     * Defines the trial design for the model.
     * 
     * @return
     *     possible object is
     *     {@link TrialDesign }
     *     
     */
    public TrialDesign getTrialDesign() {
        return trialDesign;
    }

    /**
     * Sets the value of the trialDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrialDesign }
     *     
     */
    public void setTrialDesign(TrialDesign value) {
        this.trialDesign = value;
    }

    /**
     * Defines the tasks (or in PharmML speak) "modelling steps" that are perfromed on the model.
     * 
     * @return
     *     possible object is
     *     {@link ModellingSteps }
     *     
     */
    public ModellingSteps getModellingSteps() {
        return modellingSteps;
    }

    /**
     * Sets the value of the modellingSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModellingSteps }
     *     
     */
    public void setModellingSteps(ModellingSteps value) {
        this.modellingSteps = value;
    }

    /**
     * Gets the value of the writtenVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrittenVersion() {
        return writtenVersion;
    }

    /**
     * Sets the value of the writtenVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrittenVersion(String value) {
        this.writtenVersion = value;
    }

    /**
     * Gets the value of the implementedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementedBy() {
        return implementedBy;
    }

    /**
     * Sets the value of the implementedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementedBy(String value) {
        this.implementedBy = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
