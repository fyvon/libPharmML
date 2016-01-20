/*******************************************************************************
 * Copyright (c) 2014,2015 European Molecular Biology Laboratory,
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
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.DependanceAttribute;
import eu.ddmore.libpharmml.dom.commontypes.OrderedAttribute;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type defining nominal and ordered categorical data models.
 * 
 * <p>Java class for CategoricalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoricalDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CommonObservationModelType">
 *       &lt;sequence>
 *         &lt;element name="ListOfCategories" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}ListOfCategoriesType"/>
 *         &lt;element name="CategoryVariable" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CommonDiscreteVariableType"/>
 *         &lt;element name="InitialStateVariable" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CommonDiscreteVariableType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PreviousStateVariable" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CommonDiscreteVariableType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dependance" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}DependanceType" minOccurs="0"/>
 *         &lt;element name="TransitionMatrix" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}TransitionMatrixType" minOccurs="0"/>
 *         &lt;element name="ProbabilityAssignment" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}ProbabilityAssignmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PMF" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CategoricalPMFType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ordered" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}OrderedAttributeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoricalDataType", propOrder = {
    "listOfCategories",
    "categoryVariable",
    "listOfInitialStateVariable",
    "listOfPreviousStateVariable",
    "dependance",
    "transitionMatrix",
    "probabilityAssignment",
    "pmf"
})
public class CategoricalData
    extends CommonObservationModel
{

    @XmlElement(name = "Category", required = true)
    @XmlElementWrapper(name = "ListOfCategories")
    protected List<CommonDiscreteVariable> listOfCategories;
    @XmlElement(name = "CategoryVariable", required = true)
    protected CommonDiscreteVariable categoryVariable;
    @XmlElement(name = "InitialStateVariable")
    protected List<CommonDiscreteVariable> listOfInitialStateVariable;
    @XmlElement(name = "PreviousStateVariable")
    protected List<CommonDiscreteVariable> listOfPreviousStateVariable;
    @XmlElement(name = "Dependance")
    protected Dependance dependance;
    @XmlElement(name = "TransitionMatrix")
    protected TransitionMatrix transitionMatrix;
    @XmlElement(name = "ProbabilityAssignment")
    protected List<ProbabilityAssignment> probabilityAssignment;
    @XmlElement(name = "PMF")
    protected List<CategoricalPMF> pmf;
    @XmlAttribute(name = "ordered")
    protected OrderedAttribute ordered;

    /**
     * Gets the value of the listOfCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfCategories().add(newItem);
     * </pre>
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonDiscreteVariable }
     *     
     */
    public List<CommonDiscreteVariable> getListOfCategories() {
    	if(listOfCategories == null){
    		listOfCategories = new ArrayList<CommonDiscreteVariable>();
    	}
        return listOfCategories;
    }

    /**
     * Gets the value of the categoryVariable property.
     * 
     * @return
     *     possible object is
     *     {@link CommonDiscreteVariable }
     *     
     */
    public CommonDiscreteVariable getCategoryVariable() {
        return categoryVariable;
    }

    /**
     * Sets the value of the categoryVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonDiscreteVariable }
     *     
     */
    public void setCategoryVariable(CommonDiscreteVariable value) {
        this.categoryVariable = value;
    }

    /**
     * Gets the value of the initialStateVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialStateVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialStateVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonDiscreteVariable }
     * 
     * 
     */
    public List<CommonDiscreteVariable> getListOfInitialStateVariable() {
        if (listOfInitialStateVariable == null) {
        	listOfInitialStateVariable = new ArrayList<CommonDiscreteVariable>();
        }
        return this.listOfInitialStateVariable;
    }

    /**
     * Gets the value of the previousStateVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousStateVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousStateVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonDiscreteVariable }
     * 
     * 
     */
    public List<CommonDiscreteVariable> getListOfPreviousStateVariable() {
        if (listOfPreviousStateVariable == null) {
        	listOfPreviousStateVariable = new ArrayList<CommonDiscreteVariable>();
        }
        return this.listOfPreviousStateVariable;
    }

    /**
     * Gets the value of the dependance property.
     * 
     * @return
     *     possible object is
     *     {@link Dependance }
     *     
     */
    public Dependance getDependance() {
        return dependance;
    }

    /**
     * Sets the value of the dependance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dependance }
     *     
     */
    public void setDependance(Dependance value) {
        this.dependance = value;
    }
    
    /**
     * Gets the value of the transitionMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link TransitionMatrix }
     *     
     */
    public TransitionMatrix getTransitionMatrix() {
        return transitionMatrix;
    }

    /**
     * Sets the value of the transitionMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionMatrix }
     *     
     */
    public void setTransitionMatrix(TransitionMatrix value) {
        this.transitionMatrix = value;
    }

    /**
     * Gets the value of the probabilityAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the probabilityAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProbabilityAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProbabilityAssignment }
     * 
     * 
     */
    public List<ProbabilityAssignment> getListOfProbabilityAssignment() {
        if (probabilityAssignment == null) {
            probabilityAssignment = new ArrayList<ProbabilityAssignment>();
        }
        return this.probabilityAssignment;
    }

    /**
     * Gets the value of the pmf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPMF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoricalPMF }
     * 
     * 
     */
    public List<CategoricalPMF> getListOfPMF() {
        if (pmf == null) {
            pmf = new ArrayList<CategoricalPMF>();
        }
        return this.pmf;
    }

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link OrderedAttribute }
     *     
     */
    public OrderedAttribute getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderedAttribute }
     *     
     */
    public void setOrdered(OrderedAttribute value) {
        this.ordered = value;
    }
    
    /**                                                                             
     * Creates a new empty {@link CommonDiscreteVariable} element, adds it to the current {@link CategoricalData} object and returns it.
     * @return The created {@link CommonDiscreteVariable} object.                                                                       
     */                                                                                                                                 
    public CommonDiscreteVariable createCategory(){                                                                             
            CommonDiscreteVariable el = new CommonDiscreteVariable();                                                                   
            getListOfCategories().add(el);                                                                                        
            return el;                                                                                                                  
    }
    
    /**                                                                             
     * Creates a new {@link CommonDiscreteVariable} element, adds it to the current {@link CategoricalData} object and returns it.
     * @param symbId The symbol id of the category
     * @return The created category as a {@link CommonDiscreteVariable} object.                                                                       
     */                                                                                                                                 
    public CommonDiscreteVariable createCategory(String symbId){                                                                             
            CommonDiscreteVariable el = createCategory();
            el.setSymbId(symbId);
            return el;                                                                                                                  
    }

    /**
     * Creates a new empty {@link CommonDiscreteVariable} element, adds it to the current {@link CategoricalData} object and returns it.
     * @return The created {@link CommonDiscreteVariable} object.
     */
    public CommonDiscreteVariable createCategoryVariable(){
            CommonDiscreteVariable el = new CommonDiscreteVariable();
            this.categoryVariable = el;
            return el;
    }
    
    /**
     * Creates a new {@link CommonDiscreteVariable} element, adds it to the current {@link CategoricalData} object and returns it.
     * @param symbId The symbol id of the category variable
     * @return The created {@link CommonDiscreteVariable} object.
     */
    public CommonDiscreteVariable createCategoryVariable(String symbId){
            CommonDiscreteVariable el = createCategoryVariable();
            el.setSymbId(symbId);
            return el;
    }

    /**
     * Creates a new empty {@link CommonDiscreteVariable} element, adds it to the current {@link CategoricalData} object and returns it.
     * @return The created {@link CommonDiscreteVariable} object.
     */
    public CommonDiscreteVariable createInitialStateVariable(){
            CommonDiscreteVariable el = new CommonDiscreteVariable();
            getListOfInitialStateVariable().add(el);
            return el;
    }
    
    /**
     * Creates a new {@link CommonDiscreteVariable} element, adds it to the current {@link CategoricalData} object and returns it.
     * @param symbId Symbol id of the variable.
     * @return The created {@link CommonDiscreteVariable} object.
     */
    public CommonDiscreteVariable createInitialStateVariable(String symbId){
            CommonDiscreteVariable el = createInitialStateVariable();
            el.setSymbId(symbId);
            return el;
    }

    /**
     * Creates a new empty {@link CommonDiscreteVariable} element, adds it to the current {@link CategoricalData} object and returns it.
     * @return The created {@link CommonDiscreteVariable} object.
     */
    public CommonDiscreteVariable createPreviousStateVariable(){
            CommonDiscreteVariable el = new CommonDiscreteVariable();
            getListOfPreviousStateVariable().add(el);
            return el;
    }
    
    /**
     * Creates a new {@link CommonDiscreteVariable} element, adds it to the current {@link CategoricalData} object and returns it.
     * @param symbId The symbol id of the variable.
     * @return The created {@link CommonDiscreteVariable} object.
     */
    public CommonDiscreteVariable createPreviousStateVariable(String symbId){
            CommonDiscreteVariable el = createPreviousStateVariable();
            el.setSymbId(symbId);
            return el;
    }


    /**
     * Creates a new empty {@link Dependance} element, adds it to the current {@link CategoricalData} object and returns it.
     * @return The created {@link Dependance} object.
     */
    public Dependance createDependance(){
            Dependance el = new Dependance();
            this.dependance = el;
            return el;
    }
    
    /**
     * Creates a {@link Dependance} element, adds it to the current {@link CategoricalData} object and returns it.
     * @param dependanceAttribute Type of dependance.
     * @return The created {@link Dependance} object.
     */
    public Dependance createDependance(DependanceAttribute dependanceAttribute){
            Dependance el = createDependance();
            el.setType(dependanceAttribute);
            return el;
    }

    /**
     * Creates a new empty {@link ProbabilityAssignment} element, adds it to the current {@link CategoricalData} object and returns it.
     * @return The created {@link ProbabilityAssignment} object.
     */
    public ProbabilityAssignment createProbabilityAssignment(){
            ProbabilityAssignment el = new ProbabilityAssignment();
            getListOfProbabilityAssignment().add(el);
            return el;
    }

    /**
     * Creates a new empty {@link CategoricalPMF} element, adds it to the current {@link CategoricalData} object and returns it.
     * @return The created {@link CategoricalPMF} object.
     */
    public CategoricalPMF createPMF(){
            CategoricalPMF el = new CategoricalPMF();
            getListOfPMF().add(el);
            return el;
    }

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(super.listChildren())
				.addIfNotNull(listOfCategories)
				.addIfNotNull(categoryVariable)
				.addIfNotNull(listOfInitialStateVariable)
				.addIfNotNull(listOfPreviousStateVariable)
				.addIfNotNull(dependance)
				.addIfNotNull(transitionMatrix)
				.addIfNotNull(probabilityAssignment)
				.addIfNotNull(pmf);
	}


}
