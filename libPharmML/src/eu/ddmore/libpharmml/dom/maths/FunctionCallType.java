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


package eu.ddmore.libpharmml.dom.maths;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.MathExpressionConverter;
import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.commontypes.FunctionDefinition;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRef;
import eu.ddmore.libpharmml.dom.commontypes.SymbolScope;
import eu.ddmore.libpharmml.dom.tags.LogicBinOperand;
import eu.ddmore.libpharmml.impl.MathExpressionConverterToExpression;
import eu.ddmore.libpharmml.impl.MathExpressionConverterToMathML;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * A type defining a function call.
 * 
 * <p>Java class for FunctionCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionCallType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *         &lt;element name="FunctionArgument" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/2013/03/Maths}FunctionArgumentType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionCallType", propOrder = {
    "symbRef",
    "functionArgument"
})
public class FunctionCallType
    extends PharmMLRootType implements Operand, ExpressionValue, SymbolScope, LogicBinOperand
{

    @XmlElement(name = "SymbRef", namespace = NS_DEFAULT_CT, required = true)
    protected SymbolRef symbRef;
    @XmlElement(name = "FunctionArgument")
    protected List<FunctionCallType.FunctionArgument> functionArgument;
    
    /**
     * Empty constructor
     */
    public FunctionCallType(){}
    
    public FunctionCallType(String symbolId){
    	SymbolRef sref = new SymbolRef(symbolId);
    	this.symbRef = sref;
    }
    
    /**
     * Constructs a {@link FunctionCallType} to the given {@link FunctionDefinition}.
     * @param fd The {@link FunctionDefinition} this function call refers to. The
     * symbId of the function definition has to be defined.
     */
    public FunctionCallType(FunctionDefinition fd){
    	this(fd.getSymbId());
    }

    /**
     * Gets the value of the symbRef property.
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
     * Gets the value of the functionArgument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionArgument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionCallType.FunctionArgument }
     * 
     * 
     */
    public List<FunctionCallType.FunctionArgument> getListOfFunctionArgument() {
        if (functionArgument == null) {
            functionArgument = new ArrayList<FunctionCallType.FunctionArgument>();
        }
        return this.functionArgument;
    }
    
    /**
     * @deprecated Use {@link #getListOfFunctionArgument()}.
     */
    @Deprecated
    public List<FunctionCallType.FunctionArgument> getFunctionArgument() {
        return getListOfFunctionArgument();
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.pharmml.org/2013/03/Maths}FunctionArgumentType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FunctionArgument
        extends FunctionArgumentType
    {


    }
    
    /**
     * Gets the function argument corresponding to the given id. This argument
     * is fetched from {@link #getListOfFunctionArgument()}.
     * @param symbolId The symbolId of the wanted argument.
     * @return The argument as {@link FunctionArgument}.
     */
    public FunctionArgument getFunctionArgument(String symbolId){
    	for(FunctionArgument fa : getListOfFunctionArgument()){
    		if(fa.getSymbId() != null && fa.getSymbId().equals(symbolId)){
    			return fa;
    		}
    	}
    	return null;
    }

    /**
     * Tests if the given function argument is defined in this function call.
     * @param symbolId The symbol id of the wanted argument.
     * @return True if the function argument is present, else false.
     */
    public boolean containsFunctionArgument(String symbolId){
    	return getFunctionArgument(symbolId) != null;
    }

	@Override
	public JAXBElement<FunctionCallType> toJAXBElement() {
		return MasterObjectFactory.MATHS_OF.createFunctionCall(this);
	}

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>().addIfNotNull(symbRef)
				.addIfNotNull(functionArgument);
	}

	@Override
	public String toMathExpression() {
		return new MathExpressionConverterToExpression().convert(this);
	}

	@Override
	public String toMathML() {
		return new MathExpressionConverterToMathML().convert(this);
	}
	
	@Override
	public String convert(MathExpressionConverter converter) {
		return converter.convert(this);
	}

	@Override
	public JAXBElement<FunctionCallType> toJAXBElementOfLogicBinOp() {
		return ObjectFactory.getInstance().createFunctionCall(this);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
