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


package eu.ddmore.libpharmml.dom.maths;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.BooleanValue;
import eu.ddmore.libpharmml.dom.commontypes.FalseBoolean;
import eu.ddmore.libpharmml.dom.commontypes.IdValue;
import eu.ddmore.libpharmml.dom.commontypes.IntValue;
import eu.ddmore.libpharmml.dom.commontypes.MatrixSelector;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.Product;
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.commontypes.Scalar;
import eu.ddmore.libpharmml.dom.commontypes.StringValue;
import eu.ddmore.libpharmml.dom.commontypes.Sum;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRef;
import eu.ddmore.libpharmml.dom.commontypes.TrueBoolean;
import eu.ddmore.libpharmml.dom.commontypes.VectorSelector;
import eu.ddmore.libpharmml.dom.modeldefn.Probability;


/**
 * The schema type defining a mathematical expression.
 * 
 * <p>Java class for ExprType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExprType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Scalar"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}Constant"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}Binop"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}Uniop"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}FunctionCall"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Sum"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Product"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}VectorSelector"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}MatrixSelector"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/ModelDefinition}Probability"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "ExprType", propOrder = {
//    "scalar",
//    "symbRef",
//    "constant",
//    "binop",
//    "uniop",
//    "functionCall",
//    "sum",
//    "product",
//    "vectorSelector",
//    "matrixSelector",
//    "probability"
//})
@XmlType(name = "ExprType", propOrder = {
	    "jaxb_value"
	})
@XmlSeeAlso({
    Uniop.class,
    Piece.class
})
public class Expression
    extends PharmMLRootType
{

//    @XmlElementRef(name = "Scalar", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false)
//    protected JAXBElement<?> scalar;
//    @XmlElement(name = "SymbRef", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
//    protected SymbolRef symbRef;
//    @XmlElement(name = "Constant")
//    protected Constant constant;
//    @XmlElement(name = "Binop")
//    protected Binop binop;
//    @XmlElement(name = "Uniop")
//    protected Uniop uniop;
//    @XmlElement(name = "FunctionCall")
//    protected FunctionCallType functionCall;
//    @XmlElement(name = "Sum", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
//    protected Sum sum;
//    @XmlElement(name = "Product", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
//    protected Product product;
//    @XmlElement(name = "VectorSelector", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
//    protected VectorSelector vectorSelector;
//    @XmlElement(name = "MatrixSelector", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
//    protected MatrixSelector matrixSelector;
//    @XmlElement(name = "Probability", namespace = "http://www.pharmml.org/2013/03/ModelDefinition")
//    protected Probability probability;
    
    @XmlElementRefs({
    	@XmlElementRef(name = "Scalar", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class),
    	@XmlElementRef(name = "SymbRef", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class),
    	@XmlElementRef(name = "Sum", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class),
    	@XmlElementRef(name = "Product", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class),
    	@XmlElementRef(name = "VectorSelector", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class),
    	@XmlElementRef(name = "MatrixSelector", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class),
    	@XmlElementRef(name = "Probability", namespace = "http://www.pharmml.org/2013/03/ModelDefinition", type = JAXBElement.class),
    	@XmlElementRef(name = "Constant", namespace = "http://www.pharmml.org/2013/03/Maths", type = JAXBElement.class),
    	@XmlElementRef(name = "Binop", namespace = "http://www.pharmml.org/2013/03/Maths", type = JAXBElement.class),
    	@XmlElementRef(name = "Uniop", namespace = "http://www.pharmml.org/2013/03/Maths", type = JAXBElement.class),
    	@XmlElementRef(name = "FunctionCall", namespace = "http://www.pharmml.org/2013/03/Maths", type = JAXBElement.class)
    })
    protected JAXBElement<?> jaxb_value;
    
    @XmlTransient
    protected ExpressionValue value;
    
    public ExpressionValue getValue(){
    	return value;
    }
    
    public void setValue(ExpressionValue value){
    	this.value = value;
    }

    /**
     * Gets the value of the scalar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public JAXBElement<?> getScalar() {
    	if(value instanceof Scalar){
    		return value.toJAXBElement();
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the scalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setScalar(JAXBElement<?> value) {
    	if(value.getValue() instanceof ExpressionValue){
    		this.value = (ExpressionValue) value.getValue();
    	}
    }

    /**
     * Gets the value of the symbRef property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolRef }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public SymbolRef getSymbRef() {
    	if(value instanceof SymbolRef){
    		return (SymbolRef) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the symbRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolRef }
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setSymbRef(SymbolRef value) {
        this.value = value;
    }

    /**
     * Gets the value of the constant property.
     * 
     * @return
     *     possible object is
     *     {@link Constant }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public Constant getConstant() {
    	if(value instanceof Constant){
    		return (Constant) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the constant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Constant }
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setConstant(Constant value) {
        this.value = value;
    }

    /**
     * Gets the value of the binop property.
     * 
     * @return
     *     possible object is
     *     {@link Binop }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public Binop getBinop() {
    	if(value instanceof Binop){
    		return (Binop) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the binop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binop }
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setBinop(Binop value) {
        this.value = value;
    }

    /**
     * Gets the value of the uniop property.
     * 
     * @return
     *     possible object is
     *     {@link Uniop }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public Uniop getUniop() {
    	if(value instanceof Uniop){
    		return (Uniop) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the uniop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uniop }
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setUniop(Uniop value) {
        this.value = value;
    }

    /**
     * Gets the value of the functionCall property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionCallType }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public FunctionCallType getFunctionCall() {
    	if(value instanceof FunctionCallType){
    		return (FunctionCallType) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the functionCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionCallType }
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setFunctionCall(FunctionCallType value) {
        this.value = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link SumType }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public Sum getSum() {
    	if(value instanceof Sum){
    		return (Sum) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumType }
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setSum(Sum value) {
        this.value = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public Product getProduct() {
    	if(value instanceof Product){
    		return (Product) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setProduct(Product value) {
        this.value = value;
    }

    /**
     * Gets the value of the vectorSelector property.
     * 
     * @return
     *     possible object is
     *     {@link VectorSelectorType }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public VectorSelector getVectorSelector() {
    	if(value instanceof VectorSelector){
    		return (VectorSelector) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the vectorSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorSelectorType }
     *     
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setVectorSelector(VectorSelector value) {
        this.value = value;
    }

    /**
     * Gets the value of the matrixSelector property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixSelector }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public MatrixSelector getMatrixSelector() {
    	if(value instanceof MatrixSelector){
    		return (MatrixSelector) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the matrixSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixSelector }
     *    
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead. 
     */
    @Deprecated
    public void setMatrixSelector(MatrixSelector value) {
        this.value = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Probability }
     *     
     * @deprecated Must use {@link #getValue()} instead.
     */
    @Deprecated
    public Probability getProbability() {
    	if(value instanceof Probability){
    		return (Probability) value;
    	} else {
    		return null;
    	}
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Probability }
     *   
     * @deprecated Must use {@link #setValue(ExpressionValue)} instead.
     */
    @Deprecated
    public void setProbability(Probability value) {
        this.value = value;
    }
    
	protected void beforeMarshal(Marshaller m){
		if(value != null){
			jaxb_value = value.toJAXBElement();
		} else {
			jaxb_value = null;
		}
	}
	
	protected void afterUnmarshal(Unmarshaller u, Object parent) {
		if(jaxb_value != null && jaxb_value.getValue() instanceof ExpressionValue){
			this.value = (ExpressionValue) jaxb_value.getValue();
		} else {
			this.value = null;
		}
	}

}
