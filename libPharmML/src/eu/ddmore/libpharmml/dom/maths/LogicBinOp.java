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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.MathExpressionConverter;
import eu.ddmore.libpharmml.dom.commontypes.BooleanValue;
import eu.ddmore.libpharmml.dom.commontypes.CategoryRef;
import eu.ddmore.libpharmml.dom.commontypes.FalseBoolean;
import eu.ddmore.libpharmml.dom.commontypes.IdValue;
import eu.ddmore.libpharmml.dom.commontypes.IntValue;
import eu.ddmore.libpharmml.dom.commontypes.Matrix;
import eu.ddmore.libpharmml.dom.commontypes.MatrixSelector;
import eu.ddmore.libpharmml.dom.commontypes.MissingValue;
import eu.ddmore.libpharmml.dom.commontypes.OidRef;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.Product;
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.commontypes.StringValue;
import eu.ddmore.libpharmml.dom.commontypes.Sum;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRef;
import eu.ddmore.libpharmml.dom.commontypes.TrueBoolean;
import eu.ddmore.libpharmml.dom.commontypes.Vector;
import eu.ddmore.libpharmml.dom.commontypes.VectorSelector;
import eu.ddmore.libpharmml.dom.dataset.ColumnReference;
import eu.ddmore.libpharmml.dom.modeldefn.Realisation;
import eu.ddmore.libpharmml.dom.tags.LogicBinOperand;
import eu.ddmore.libpharmml.dom.tags.MathExpression;
import eu.ddmore.libpharmml.dom.tags.StructuralModelElement;
import eu.ddmore.libpharmml.dom.uncertml.Probability;
import eu.ddmore.libpharmml.impl.MathExpressionConverterToExpression;
import eu.ddmore.libpharmml.impl.MathExpressionConverterToMathML;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;



/**
 * The schema type defining a binary logical operator.
 * 
 * <p>Java class for LogicBinOpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicBinOpType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}LogicBinop"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}LogicUniop"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}Scalar"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}Constant"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}SymbRef"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}CatRef"/>
 *           &lt;element name="ArmRef" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}OidRefType"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Dataset}ColumnRef"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}Binop"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}Uniop"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}FunctionCall"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}Sum"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}Product"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}VectorSelector"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}MatrixSelector"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}Probability"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}LogicBinop"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}LogicUniop"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}Scalar"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}Constant"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}SymbRef"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}CatRef"/>
 *           &lt;element name="ArmRef" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}OidRefType"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Dataset}ColumnRef"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}Binop"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}Uniop"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}FunctionCall"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}Sum"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}Product"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}VectorSelector"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}MatrixSelector"/>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}Probability"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="op" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *             &lt;enumeration value="lt"/>
 *             &lt;enumeration value="leq"/>
 *             &lt;enumeration value="gt"/>
 *             &lt;enumeration value="geq"/>
 *             &lt;enumeration value="eq"/>
 *             &lt;enumeration value="neq"/>
 *             &lt;enumeration value="and"/>
 *             &lt;enumeration value="or"/>
 *             &lt;enumeration value="xor"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicBinOpType", propOrder = {
    "content"
})
public class LogicBinOp
    extends PharmMLRootType implements MathExpression, StructuralModelElement, LogicBinOperand
{

	@XmlElementRefs({
        @XmlElementRef(name = "Product", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Constant", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Naryop", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Matrix", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FunctionCall", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Realisation", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CDF", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LogicUniop", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MatrixSelector", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CatRef", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SF", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArmRef", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Vector", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PDF", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SymbRef", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Probability", namespace = NS_DEFAULT_MDEF, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Statsop", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Uniop", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Sum", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VectorSelector", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Scalar", namespace = NS_DEFAULT_CT, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LogicBinop", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Binop", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HF", namespace = NS_DEFAULT_MATH, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ColumnRef", namespace = NS_DEFAULT_DS, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Stage", namespace = NS_DEFAULT_TD, type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "op", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String op;
    
    /**
     * Empty constructor.
     */
    public LogicBinOp(){};
    
    public LogicBinOp(LogicOperator op){
    	this.op = op.value();
    }
    
    public LogicBinOp(LogicOperator op, LogicBinOperand operand1, LogicBinOperand operand2){
    	this.op = op.value();
    	if(operand1 != null){
    		getContent().add(operand1.toJAXBElementOfLogicBinOp());
    	}
    	if(operand2 != null){
    		getContent().add(operand2.toJAXBElementOfLogicBinOp());
    	}
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
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
     * {@link JAXBElement }{@code <}{@link Product }{@code >}
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * {@link JAXBElement }{@code <}{@link Constant }{@code >}
     * {@link JAXBElement }{@code <}{@link Naryop }{@code >}
     * {@link JAXBElement }{@code <}{@link IdValue }{@code >}
     * {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     * {@link JAXBElement }{@code <}{@link Matrix }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionCallType }{@code >}
     * {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     * {@link JAXBElement }{@code <}{@link Realisation }{@code >}
     * {@link JAXBElement }{@code <}{@link ProbabilityFunction }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicUniOp }{@code >}
     * {@link JAXBElement }{@code <}{@link MatrixSelector }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryRef }{@code >}
     * {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ProbabilityFunction }{@code >}
     * {@link JAXBElement }{@code <}{@link OidRef }{@code >}
     * {@link JAXBElement }{@code <}{@link Vector }{@code >}
     * {@link JAXBElement }{@code <}{@link IntValue }{@code >}
     * {@link JAXBElement }{@code <}{@link ProbabilityFunction }{@code >}
     * {@link JAXBElement }{@code <}{@link SymbolRef }{@code >}
     * {@link JAXBElement }{@code <}{@link Probability }{@code >}
     * {@link JAXBElement }{@code <}{@link Statsop }{@code >}
     * {@link JAXBElement }{@code <}{@link Uniop }{@code >}
     * {@link JAXBElement }{@code <}{@link Sum }{@code >}
     * {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link VectorSelector }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicBinOp }{@code >}
     * {@link JAXBElement }{@code <}{@link Binop }{@code >}
     * {@link JAXBElement }{@code <}{@link MissingValue }{@code >}
     * {@link JAXBElement }{@code <}{@link ProbabilityFunction }{@code >}
     * {@link JAXBElement }{@code <}{@link ColumnReference }{@code >}
     * 
     * <p>
     * In order to be compliant with the PharmML specification (>= 0.3.1), only 1 {@link ColumnReference } is allowed in the content,
     * and should always be the 1st operand (i.e., the first element of this list). Anyway, this is checked only
     * during the XSD-based validation process.
     * </p>
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOp(String value) {
        this.op = value;
    }

	@Override
	protected List<TreeNode> listChildren() {
		ChainedList<TreeNode> list = new ChainedList<TreeNode>(super.listChildren());
		for(JAXBElement<?> jaxbEl : getContent()){
			if(jaxbEl.getValue() instanceof TreeNode){
				list.add((TreeNode) jaxbEl.getValue());
			}
		}
		return list;
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
	public JAXBElement<LogicBinOp> toJAXBElementOfLogicBinOp() {
		return ObjectFactory.getInstance().createLogicBinop(this);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
