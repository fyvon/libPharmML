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
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.Assignable;
import eu.ddmore.libpharmml.dom.commontypes.Delay;
import eu.ddmore.libpharmml.dom.commontypes.Interpolation;
import eu.ddmore.libpharmml.dom.commontypes.Interval;
import eu.ddmore.libpharmml.dom.commontypes.Matrix;
import eu.ddmore.libpharmml.dom.commontypes.MatrixSelector;
import eu.ddmore.libpharmml.dom.commontypes.Product;
import eu.ddmore.libpharmml.dom.commontypes.Rhs;
import eu.ddmore.libpharmml.dom.commontypes.Scalar;
import eu.ddmore.libpharmml.dom.commontypes.Sequence;
import eu.ddmore.libpharmml.dom.commontypes.Sum;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRef;
import eu.ddmore.libpharmml.dom.commontypes.Vector;
import eu.ddmore.libpharmml.dom.commontypes.VectorSelector;
import eu.ddmore.libpharmml.dom.maths.Binop;
import eu.ddmore.libpharmml.dom.maths.Constant;
import eu.ddmore.libpharmml.dom.maths.FunctionCallType;
import eu.ddmore.libpharmml.dom.maths.MatrixUniOp;
import eu.ddmore.libpharmml.dom.maths.Piecewise;
import eu.ddmore.libpharmml.dom.maths.Uniop;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 This defines a design parameter.
 *             
 * 
 * <p>Java class for DesignParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignParameterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}CommonParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}Assign" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @since PharmML 0.7
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesignParameterType", propOrder = {
    "assign"
})
public class DesignParameter
    extends CommonParameter implements Assignable
{

    public DesignParameter() {
		super();
	}

	public DesignParameter(DesignParameter referredParameter) {
		super(referredParameter);
	}

	public DesignParameter(String symbId) {
		super(symbId);
	}

	@XmlElement(name = "Assign", namespace = NS_DEFAULT_CT)
    protected Rhs assign;

    /**
     * Initialises the parameter.
     * 
     * @return
     *     possible object is
     *     {@link Rhs }
     *     
     */
    @Override
	public Rhs getAssign() {
        return assign;
    }

    /**
     * Initialises the parameter.
     * 
     * @param value
     *     allowed object is
     *     {@link Rhs }
     *     
     */
    @Override
	public void setAssign(Rhs value) {
        this.assign = value;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(assign);
    }
    
    @Override
   	public Rhs assign(Scalar scalar) {
   		Rhs rhs = new Rhs(scalar);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(SymbolRef symbolRef) {
   		Rhs rhs = new Rhs(symbolRef);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Sequence sequence) {
   		Rhs rhs = new Rhs(sequence);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Vector vector) {
   		Rhs rhs = new Rhs(vector);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Interpolation interpolation) {
   		Rhs rhs = new Rhs(interpolation);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Matrix matrix) {
   		Rhs rhs = new Rhs(matrix);
   		setAssign(rhs);
   		return rhs;
   	}
   	
   	@Override
   	public Rhs assign(Constant constant) {
   		Rhs rhs = new Rhs(constant);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Interval interval) {
   		Rhs rhs = new Rhs(interval);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Binop binop) {
   		Rhs rhs = new Rhs(binop);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Uniop uniop) {
   		Rhs rhs = new Rhs(uniop);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Piecewise piecewise) {
   		Rhs rhs = new Rhs(piecewise);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(FunctionCallType functionCall) {
   		Rhs rhs = new Rhs(functionCall);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Sum sum) {
   		Rhs rhs = new Rhs(sum);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Product product) {
   		Rhs rhs = new Rhs(product);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Delay delay) {
   		Rhs rhs = new Rhs(delay);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(VectorSelector vectorSelector) {
   		Rhs rhs = new Rhs(vectorSelector);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(MatrixSelector matrixSelector) {
   		Rhs rhs = new Rhs(matrixSelector);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(MatrixUniOp matrixUniop) {
   		Rhs rhs = new Rhs(matrixUniop);
   		setAssign(rhs);
   		return rhs;
   	}

   	@Override
   	public Rhs assign(Probability probability) {
   		Rhs rhs = new Rhs(probability);
   		setAssign(rhs);
   		return rhs;
   	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
