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
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom.modeldefn;

import static eu.ddmore.libpharmml.util.Util.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.commontypes.Block;
import eu.ddmore.libpharmml.dom.commontypes.Name;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLElement;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRef;
import eu.ddmore.libpharmml.dom.maths.ConditionalStatement;
import eu.ddmore.libpharmml.dom.maths.LogicBinOp;
import eu.ddmore.libpharmml.dom.maths.LogicOperator;
import eu.ddmore.libpharmml.impl.XMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Abstract type defining common parameter model.
 * 
 * <p>Java class for CommonParameterModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonParameterModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.8/CommonTypes}Name" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;sequence>
 *             &lt;element name="ConditionalStatement" type="{http://www.pharmml.org/pharmml/0.8/Maths}ConditionalStatementType" minOccurs="0"/>
 *             &lt;element ref="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CommonParameterElement" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.pharmml.org/pharmml/0.8/CommonTypes}AssignStatement" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="Correlation" type="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CorrelationType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
@XmlType(name = "CommonParameterModelType", propOrder = {
    "name",
    "listOfElements"
})
@XmlSeeAlso({
    ParameterModel.class
})
public abstract class CommonParameterModel
    extends PharmMLRootType implements Block
{

    @XmlElement(name = "Name", namespace = XMLFilter.NS_DEFAULT_CT)
    protected Name name;
//    @XmlElementRef(name = "CommonParameterElement", namespace = XMLFilter.NS_DEFAULT_MDEF, type = JAXBElement.class, required = false)
//    protected List<JAXBElement<? extends CommonParameter>> commonParameterElement;
//    @XmlElement(name = "Correlation")
//    protected List<Correlation> correlation;
    
//    @XmlElementRefs({
//        @XmlElementRef(name = "CommonParameterElement", namespace = "http://www.pharmml.org/pharmml/0.8/ModelDefinition", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "Correlation", namespace = "http://www.pharmml.org/pharmml/0.8/ModelDefinition", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "AssignStatement", namespace = "http://www.pharmml.org/pharmml/0.8/CommonTypes", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "ConditionalStatement", namespace = "http://www.pharmml.org/pharmml/0.8/ModelDefinition", type = JAXBElement.class, required = false)
//    })
//    protected List<JAXBElement<?>> conditionalStatementAndCommonParameterElementAndAssignStatement;
    
    @SuppressWarnings("deprecation")
	@XmlElements({
    	@XmlElement(name = "Correlation", namespace = NS_DEFAULT_MDEF, type = Correlation.class, required = false),
        @XmlElement(name = "ConditionalStatement", namespace = NS_DEFAULT_MDEF, type = ConditionalStatement.class, required = false),
        @XmlElement(name = "PopulationParameter", namespace = NS_DEFAULT_MDEF, type = PopulationParameter.class, required = false),
        @XmlElement(name = "Parameter", namespace = NS_DEFAULT_MDEF, type = Parameter.class, required = false),
        @XmlElement(name = "SimpleParameter", namespace = NS_DEFAULT_MDEF, type = SimpleParameter.class, required = false), // BC
        @XmlElement(name = "AssignStatement", namespace = NS_DEFAULT_CT, type = LogicBinOp.class, required = false),
        @XmlElement(name = "IndividualParameter", namespace = NS_DEFAULT_MDEF, type = IndividualParameter.class, required = false),
        @XmlElement(name = "DesignParameter", namespace = NS_DEFAULT_MDEF, type = DesignParameter.class, required = false),
        @XmlElement(name = "RandomVariable", namespace = NS_DEFAULT_MDEF, type = ParameterRandomVariable.class, required = false)
    })
    protected List<PharmMLElement> listOfElements;
    
    @XmlAttribute(name = "blkId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String blkId;

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

//    /**
//     * Gets the value of the commonParameterElement property.
//     * 
//     * <p>
//     * This accessor method returns a reference to the live list,
//     * not a snapshot. Therefore any modification you make to the
//     * returned list will be present inside the JAXB object.
//     * This is why there is not a <CODE>set</CODE> method for the commonParameterElement property.
//     * 
//     * <p>
//     * For example, to add a new item, do as follows:
//     * <pre>
//     *    getCommonParameterElement().add(newItem);
//     * </pre>
//     * 
//     * 
//     * <p>
//     * Objects of the following type(s) are allowed in the list
//     * {@link JAXBElement }{@code <}{@link SimpleParameter }{@code >}
//     * {@link JAXBElement }{@code <}{@link CommonParameter }{@code >}
//     * {@link JAXBElement }{@code <}{@link IndividualParameter }{@code >}
//     * {@link JAXBElement }{@code <}{@link ParameterRandomVariable }{@code >}
//     * 
//     * 
//     */
//    public List<JAXBElement<? extends CommonParameter>> getCommonParameterElement() {
//        if (commonParameterElement == null) {
//            commonParameterElement = new ArrayList<JAXBElement<? extends CommonParameter>>();
//        }
//        return this.commonParameterElement;
//    }

//    /**
//     * Gets the value of the correlation property.
//     * 
//     * <p>
//     * This accessor method returns a reference to the live list,
//     * not a snapshot. Therefore any modification you make to the
//     * returned list will be present inside the JAXB object.
//     * This is why there is not a <CODE>set</CODE> method for the correlation property.
//     * 
//     * <p>
//     * For example, to add a new item, do as follows:
//     * <pre>
//     *    getCorrelation().add(newItem);
//     * </pre>
//     * 
//     * 
//     * <p>
//     * Objects of the following type(s) are allowed in the list
//     * {@link Correlation }
//     * 
//     * 
//     */
//    public List<Correlation> getCorrelation() {
//        if (correlation == null) {
//            correlation = new ArrayList<Correlation>();
//        }
//        return this.correlation;
//    }
    
    public List<PharmMLElement> getListOfParameterModelElements(){
    	if(listOfElements == null){
    		listOfElements = new ArrayList<PharmMLElement>();
    	}
    	return listOfElements;
    }
    
    /**
     * Returns an <b><u>immutable</u></b> collection of the {@link IndividualParameter} elements of this parameter model.
     * @return An <b><u>immutable</u></b> collection of the {@link IndividualParameter} elements of this parameter model.
     */
    public Collection<IndividualParameter> fetchIndividualParameters(){
    	return filter(listOfElements, IndividualParameter.class);
    }
    /**
     * Returns an <b><u>immutable</u></b> collection of the {@link PopulationParameter} elements of this parameter model.
     * @return An <b><u>immutable</u></b> collection of the {@link PopulationParameter} elements of this parameter model.
     */
    public Collection<PopulationParameter> fetchPopulationParameters(){
    	return filter(listOfElements, PopulationParameter.class);
    }
    /**
     * Returns an <b><u>immutable</u></b> collection of the {@link Parameter} elements of this parameter model.
     * @return An <b><u>immutable</u></b> collection of the {@link Parameter} elements of this parameter model.
     */
    public Collection<Parameter> fetchParameters(){
    	return filter(listOfElements, Parameter.class);
    }
    /**
     * Returns an <b><u>immutable</u></b> collection of the {@link ParameterRandomVariable} elements of this parameter model.
     * @return An <b><u>immutable</u></b> collection of the {@link ParameterRandomVariable} elements of this parameter model.
     */
    public Collection<ParameterRandomVariable> fetchParameterRandomVariables(){
    	return filter(listOfElements, ParameterRandomVariable.class);
    }
    /**
     * Returns an <b><u>immutable</u></b> collection of the {@link DesignParameter} elements of this parameter model.
     * @return An <b><u>immutable</u></b> collection of the {@link DesignParameter} elements of this parameter model.
     */
    public Collection<DesignParameter> fetchDesignParameters(){
    	return filter(listOfElements, DesignParameter.class);
    }
    /**
     * Returns an <b><u>immutable</u></b> collection of the {@link LogicBinOp} assign statements of this parameter model.
     * @return An <b><u>immutable</u></b> collection of the {@link LogicBinOp} assign statements of this parameter model.
     */
    public Collection<LogicBinOp> fetchAssignStatements(){
    	return filter(listOfElements, LogicBinOp.class);
    }
    /**
     * Returns an <b><u>immutable</u></b> collection of the {@link ConditionalStatement} elements of this parameter model.
     * @return An <b><u>immutable</u></b> collection of the {@link ConditionalStatement} elements of this parameter model.
     */
    public Collection<ConditionalStatement> fetchConditionalStatements(){
    	return filter(listOfElements, ConditionalStatement.class);
    }
    /**
     * Returns an <b><u>immutable</u></b> collection of the {@link Correlation} elements of this parameter model.
     * @return An <b><u>immutable</u></b> collection of the {@link Correlation} elements of this parameter model.
     */
    public Collection<Correlation> fetchCorrelations(){
    	return filter(listOfElements, Correlation.class);
    }
    
    public Parameter createParameter(){
    	Parameter param = new Parameter();
    	getListOfParameterModelElements().add(param);
    	return param;
    }
    
    public Parameter createParameter(String symbId){
    	Parameter param = createParameter();
    	param.setSymbId(symbId);
    	return param;
    }
    
    public IndividualParameter createIndividualParameter(){
    	IndividualParameter param = new IndividualParameter();
    	getListOfParameterModelElements().add(param);
    	return param;
    }
    
    public IndividualParameter createIndividualParameter(String symbId){
    	IndividualParameter param = createIndividualParameter();
    	param.setSymbId(symbId);
    	return param;
    }
    
    public PopulationParameter createPopulationParameter(){
    	PopulationParameter param = new PopulationParameter();
    	getListOfParameterModelElements().add(param);
    	return param;
    }
    
    public PopulationParameter createPopulationParameter(String symbId){
    	PopulationParameter param = createPopulationParameter();
    	param.setSymbId(symbId);
    	return param;
    }
    
    public DesignParameter createDesignParameter(){
    	DesignParameter dp = new DesignParameter();
    	getListOfParameterModelElements().add(dp);
    	return dp;
    }
    
    public DesignParameter createDesignParameter(String symbId){
    	DesignParameter dp = createDesignParameter();
    	dp.setSymbId(symbId);
    	return dp;
    }
    
    public ParameterRandomVariable createParameterRandomVariable(){
    	ParameterRandomVariable prv = new ParameterRandomVariable();
    	getListOfParameterModelElements().add(prv);
    	return prv;
    }
    
    public ParameterRandomVariable createParameterRandomVariable(String symbId){
    	ParameterRandomVariable prv = new ParameterRandomVariable();
    	prv.setSymbId(symbId);
    	getListOfParameterModelElements().add(prv);
    	return prv;
    }
    
    public Correlation createCorrelation(){
    	Correlation c = new Correlation();
    	getListOfParameterModelElements().add(c);
    	return c;
    }
    
    public LogicBinOp createAssignStatement(){
    	LogicBinOp as = new LogicBinOp(LogicOperator.EQ);
    	getListOfParameterModelElements().add(as);
    	return as;
    }
    
    public LogicBinOp createAssignStatement(SymbolRef lhs){
    	LogicBinOp as = new LogicBinOp(LogicOperator.EQ);
    	as.getContent().add(MasterObjectFactory.COMMONTYPES_OF.createSymbRef(lhs));
    	getListOfParameterModelElements().add(as);
    	return as;
    }
    
    public ConditionalStatement createConditionalStatement(){
    	ConditionalStatement cs = new ConditionalStatement();
    	getListOfParameterModelElements().add(cs);
    	return cs;
    }

    /**
     * Gets the value of the blkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setBlkId(String value) {
        this.blkId = value;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		List<TreeNode> list = new ChainedList<TreeNode>(super.listChildren())
				.addIfNotNull(name)
				.addIfNotNull(listOfElements);
		return list;
	}

}
