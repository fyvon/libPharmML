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
package eu.ddmore.libpharmml.dom.maths;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.DerivativeVariable;
import eu.ddmore.libpharmml.dom.commontypes.FunctionDefinition;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLElement;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.VariableDefinition;
import eu.ddmore.libpharmml.dom.modeldefn.DesignParameter;
import eu.ddmore.libpharmml.dom.modeldefn.IndividualParameter;
import eu.ddmore.libpharmml.dom.modeldefn.Parameter;
import eu.ddmore.libpharmml.dom.modeldefn.ParameterRandomVariable;
import eu.ddmore.libpharmml.dom.modeldefn.PopulationParameter;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * The schema type defining statement(s) in a conditional statement.
 * 
 * <p>Java class for IfElseIfType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfElseIfType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/Maths}ExprType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.8/Maths}Condition"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="ConditionalStatement" type="{http://www.pharmml.org/pharmml/0.8/Maths}ConditionalStatementType" minOccurs="0"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.8/CommonTypes}AssignStatement" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.8/ModelDefinition}CommonParameterElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @since PharmML 0.8
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfElseIfType", propOrder = {
    "condition",
    "content"
})
public class IfElseIfCondition
    extends PharmMLRootType
{

    @XmlElement(name = "Condition", required = true)
    protected Condition condition;
//    @XmlElementRefs({
//        @XmlElementRef(name = "CommonParameterElement", namespace = NS_DEFAULT_MDEF, type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "AssignStatement", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "ConditionalStatement", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false)
//    })
//    protected List<JAXBElement<?>> conditionalStatementOrAssignStatementOrCommonParameterElement;
    
    @XmlElements({
        @XmlElement(name = "ConditionalStatement", namespace = NS_DEFAULT_MDEF, type = ConditionalStatement.class, required = false),
        @XmlElement(name = "PopulationParameter", namespace = NS_DEFAULT_MDEF, type = PopulationParameter.class, required = false),
        @XmlElement(name = "Parameter", namespace = NS_DEFAULT_MDEF, type = Parameter.class, required = false),
        @XmlElement(name = "AssignStatement", namespace = NS_DEFAULT_CT, type = LogicBinOp.class, required = false),
        @XmlElement(name = "IndividualParameter", namespace = NS_DEFAULT_MDEF, type = IndividualParameter.class, required = false),
        @XmlElement(name = "DesignParameter", namespace = NS_DEFAULT_MDEF, type = DesignParameter.class, required = false),
        @XmlElement(name = "RandomVariable", namespace = NS_DEFAULT_MDEF, type = ParameterRandomVariable.class, required = false),
        @XmlElement(name = "Variable", namespace = NS_DEFAULT_CT, type = VariableDefinition.class, required = false),
        @XmlElement(name = "DerivativeVariable", namespace = NS_DEFAULT_CT, type = DerivativeVariable.class, required = false),
        @XmlElement(name = "FunctionDefinition", namespace = NS_DEFAULT_CT, type = FunctionDefinition.class, required = false)
    })
    protected List<PharmMLElement> content;
    
    /**
     * Empty constructor
     */
    public IfElseIfCondition(){}
    
    public IfElseIfCondition(Condition condition){
    	this.condition = condition;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }

    /**
     * Gets the value of the conditionalStatementOrAssignStatementOrCommonParameterElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionalStatementOrAssignStatementOrCommonParameterElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter },
     * {@link LogicBinOp },
     * {@link DesignParameter },
     * {@link ConditionalStatement },
     * {@link IndividualParameter },
     * {@link PopulationParameter },
     * {@link ParameterRandomVariable },
     * {@link DerivativeVariable },
     * {@link VariableDefinition }
     * 
     */
    public List<PharmMLElement> getContent() {
        if (content == null) {
        	content = new ArrayList<PharmMLElement>();
        }
        return this.content;
    }
    
    public LogicBinOp createAssignment(){
    	LogicBinOp lb = new LogicBinOp();
    	getContent().add(lb);
    	return lb;
    }
    
    public ConditionalStatement createConditionalStatement(){
    	ConditionalStatement cs = new ConditionalStatement();
    	getContent().add(cs);
    	return cs;
    }
    
    public Condition createCondition(){
    	Condition condition = new Condition();
    	this.condition = condition;
    	return condition;
    }
    
    public Parameter createParameter(){
    	Parameter param = new Parameter();
    	getContent().add(param);
    	return param;
    }
    
    public Parameter createParameterRef(Parameter refParam){
    	Parameter param = new Parameter(refParam);
    	getContent().add(param);
    	return param;
    }
    
    public IndividualParameter createIndividualParameter(){
    	IndividualParameter param = new IndividualParameter();
    	getContent().add(param);
    	return param;
    }
    
    public IndividualParameter createIndividualParameterRef(IndividualParameter refParam){
    	IndividualParameter param = new IndividualParameter(refParam);
    	getContent().add(param);
    	return param;
    }
    
    public PopulationParameter createPopulationParameter(){
    	PopulationParameter param = new PopulationParameter();
    	getContent().add(param);
    	return param;
    }
    
    public PopulationParameter createPopulationParameterRef(PopulationParameter refParam){
    	PopulationParameter param = new PopulationParameter(refParam);
    	getContent().add(param);
    	return param;
    }
    
    public DesignParameter createDesignParameter(){
    	DesignParameter dp = new DesignParameter();
    	getContent().add(dp);
    	return dp;
    }
    
    public DesignParameter createDesignParameterRef(DesignParameter refParam){
    	DesignParameter dp = new DesignParameter(refParam);
    	getContent().add(dp);
    	return dp;
    }
    
    public ParameterRandomVariable createParameterRandomVariable(){
    	ParameterRandomVariable prv = new ParameterRandomVariable();
    	getContent().add(prv);
    	return prv;
    }
    
    public ParameterRandomVariable createParameterRandomVariableRef(ParameterRandomVariable refParam){
    	ParameterRandomVariable prv = new ParameterRandomVariable(refParam);
    	getContent().add(prv);
    	return prv;
    }
    
    public VariableDefinition createVariableDefinition(){
    	VariableDefinition var = new VariableDefinition();
    	getContent().add(var);
    	return var;
    }
    
    public DerivativeVariable createDerivativeVariable(){
    	DerivativeVariable var = new DerivativeVariable();
    	getContent().add(var);
    	return var;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	ChainedList<TreeNode> list = new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(condition)
    			.addIfNotNull(content);
    	return list;
    }
    
    @Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
