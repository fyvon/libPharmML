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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.Block;
import eu.ddmore.libpharmml.dom.commontypes.CovariateModelRef;
import eu.ddmore.libpharmml.dom.commontypes.Name;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.maths.ConditionalStatement;
import eu.ddmore.libpharmml.dom.maths.LogicBinOp;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 A type defining a covariate model.
 *             
 * 
 * <p>Java class for CovariateModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CovariateModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="CovariateModelRef" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}CovariateModelRefType" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.8/CommonTypes}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}PopulationParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.8/CommonTypes}AssignStatement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConditionalStatement" type="{http://www.pharmml.org/pharmml/0.8/Maths}ConditionalStatementType" minOccurs="0"/>
 *         &lt;element name="Covariate" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CovariateDefinitionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/pharmml/0.8/CommonTypes}BlockDefnGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CovariateModelType", propOrder = {
	"covariateModelRef",
    "name",
    "simpleParameter",
    "listOfPopulationParameter",
    "listOfParameter",
    "listOfAssignStatement",
    "conditionalStatement",
    "listOfCovariate"
})
public class CovariateModel
    extends PharmMLRootType implements Block
{

	@XmlElement(name = "CovariateModelRef")
    protected CovariateModelRef covariateModelRef; // PharmML 0.7
	
    @XmlElement(name = "Name", namespace = NS_DEFAULT_CT)
    protected Name name;
    @Deprecated
    @XmlElement(name = "SimpleParameter")
    protected List<SimpleParameter> simpleParameter;
    
    @XmlElement(name = "PopulationParameter")
    protected List<PopulationParameter> listOfPopulationParameter; // PharmML 0.7
    
    // PharmML 0.8
    @XmlElement(name = "Parameter")
    protected List<Parameter> listOfParameter;
    @XmlElement(name = "AssignStatement", namespace = NS_DEFAULT_CT)
    protected List<LogicBinOp> listOfAssignStatement;
    @XmlElement(name = "ConditionalStatement")
    protected ConditionalStatement conditionalStatement;
    
    @XmlElement(name = "Covariate", required = true)
    protected List<CovariateDefinition> listOfCovariate;
    @XmlAttribute(name = "blkId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String blkId;
    
    /**
     * Gets the value of the covariateModelRef property.
     * 
     * @return
     *     possible object is
     *     {@link CovariateModelRef }
     *    
     * @since PharmML 0.7
     */
    public CovariateModelRef getCovariateModelRef() {
        return covariateModelRef;
    }

    /**
     * Sets the value of the covariateModelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CovariateModelRef }
     * 
     * @since PharmML 0.7
     */
    public void setCovariateModelRef(CovariateModelRef value) {
        this.covariateModelRef = value;
    }

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
     * The definition of parameters in the covariate block. Typically these will 
     * define parameters used by the covariate definitions. Gets the value of the 
     * simpleParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleParameter }
     * 
     * @deprecated Since PharmML 0.7, parameters are located within {@link #getListOfPopulationParameter()}.
     */
    @Deprecated
    public List<SimpleParameter> getSimpleParameter() {
        if (simpleParameter == null) {
            simpleParameter = new ArrayList<SimpleParameter>();
        }
        return this.simpleParameter;
    }
    
    /**
     * The definition of parameters in the covariate block. Typically these will 
     * define parameters used by the covariate definitions. Gets the value of 
     * the populationParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the populationParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfPopulationParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PopulationParameter }
     * 
     * @since PharmML 0.7
     */
    public List<PopulationParameter> getListOfPopulationParameter() {
        if (listOfPopulationParameter == null) {
        	listOfPopulationParameter = new ArrayList<PopulationParameter>();
        }
        return this.listOfPopulationParameter;
    }
    
    /**
     * A parameter definition of the basic type.Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * @since PharmML 0.8
     */
    public List<Parameter> getListOfParameter() {
        if (listOfParameter == null) {
        	listOfParameter = new ArrayList<Parameter>();
        }
        return this.listOfParameter;
    }

    /**
     * Gets the value of the assignStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfAssignStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicBinOp }
     * 
     * @since PharmML 0.8
     */
    public List<LogicBinOp> getListOfAssignStatement() {
        if (listOfAssignStatement == null) {
        	listOfAssignStatement = new ArrayList<LogicBinOp>();
        }
        return this.listOfAssignStatement;
    }

    /**
     * Gets the value of the conditionalStatement property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalStatement }
     *     
     * @since PharmML 0.8
     */
    public ConditionalStatement getConditionalStatement() {
        return conditionalStatement;
    }
    
    /**
     * Sets the value of the conditionalStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalStatement }
     *     
     * @since PharmML 0.8
     */
    public void setConditionalStatement(ConditionalStatement value) {
        this.conditionalStatement = value;
    }

    /**
     * Gets the value of the covariate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the covariate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfCovariate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CovariateDefinition }
     * 
     * 
     */
    public List<CovariateDefinition> getListOfCovariate() {
        if (listOfCovariate == null) {
        	listOfCovariate = new ArrayList<CovariateDefinition>();
        }
        return this.listOfCovariate;
    }
    
    /**
     * @deprecated Use {@link #getListOfCovariate()}.
     */
    @Deprecated
    public List<CovariateDefinition> getCovariate() {
        return getListOfCovariate();
    }

    /**
     * Gets the value of the blkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getBlkId() {
        return blkId;
    }

    /**
     * Sets the value of the blkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setBlkId(String value) {
        this.blkId = value;
    }

    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(covariateModelRef)
				.addIfNotNull(name)
				.addIfNotNull(simpleParameter)
				.addIfNotNull(listOfPopulationParameter)
				.addIfNotNull(listOfParameter)
				.addIfNotNull(listOfAssignStatement)
				.addIfNotNull(conditionalStatement)
				.addIfNotNull(listOfCovariate);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
