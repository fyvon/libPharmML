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
package eu.ddmore.libpharmml.dom.trialdesign;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.Assignable;
import eu.ddmore.libpharmml.dom.commontypes.Delay;
import eu.ddmore.libpharmml.dom.commontypes.Interpolation;
import eu.ddmore.libpharmml.dom.commontypes.Interval;
import eu.ddmore.libpharmml.dom.commontypes.Matrix;
import eu.ddmore.libpharmml.dom.commontypes.MatrixSelector;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.Product;
import eu.ddmore.libpharmml.dom.commontypes.Rhs;
import eu.ddmore.libpharmml.dom.commontypes.Scalar;
import eu.ddmore.libpharmml.dom.commontypes.Sequence;
import eu.ddmore.libpharmml.dom.commontypes.StandardAssignable;
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
import eu.ddmore.libpharmml.dom.modeldefn.Probability;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 * Timepoints.
 *             
 * 
 * <p>Java class for TimepointsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimepointsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}Assign"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated Since PharmML 0.7.1, timepoints use the class {@link StandardAssignable}.
 */
@Deprecated
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimepointsType", propOrder = {
    "assign",
    "arrays"
})
public class Timepoints
    extends PharmMLRootType implements Assignable
{

    @XmlElement(name = "Assign", namespace = NS_DEFAULT_CT)
    protected Rhs assign;
    
    @XmlElementRef(name = "Arrays", namespace = NS_DEFAULT_CT, type = JAXBElement.class)
    @Deprecated
    protected JAXBElement<?> arrays;


    /**
     * Gets the value of the assign property.
     * 
     * @return
     *     possible object is
     *     {@link Rhs }
     *     
     * @since PharmML 0.7
     */
    @Override
	public Rhs getAssign() {
        return assign;
    }

    /**
     * Sets the value of the assign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rhs }
     *     
     * @since PharmML 0.7
     */
    @Override
	public void setAssign(Rhs value) {
        this.assign = value;
    }
    
    /**
     * Gets the value of the arrays property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link Sequence }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vector }{@code >}
     *
     * @deprecated Since PharmML 0.7
     */
    @Deprecated
    public JAXBElement<?> getArrays() {
        return arrays;
    }

    /**
     * Sets the value of the arrays property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link Sequence }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vector }{@code >}
     *
     * @deprecated Since PharmML 0.7
     */
    @Deprecated
    public void setArrays(JAXBElement<?> value) {
        this.arrays = value;
    }

    
    @Override
    protected List<TreeNode> listChildren() {
    	List<TreeNode> list = new ChainedList<TreeNode>(super.listChildren()).addIfNotNull(assign);
    	if(arrays != null && arrays.getValue() instanceof TreeNode){
    		list.add((TreeNode) arrays.getValue());
    	}
    	return list;
    }

    @Override
    public Rhs assign(Scalar scalar) {
    	Rhs rhs = new Rhs(scalar);
    	setAssign(rhs);
    	return rhs;
    }

    @Deprecated
	public Rhs assign(eu.ddmore.libpharmml.dom.maths.Equation equation) {
		Rhs rhs = new Rhs(equation);
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
