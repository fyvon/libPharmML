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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.BooleanType;
import eu.ddmore.libpharmml.dom.commontypes.Delay;
import eu.ddmore.libpharmml.dom.commontypes.FalseBooleanType;
import eu.ddmore.libpharmml.dom.commontypes.IdValueType;
import eu.ddmore.libpharmml.dom.commontypes.IntValueType;
import eu.ddmore.libpharmml.dom.commontypes.MatrixSelector;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.Product;
import eu.ddmore.libpharmml.dom.commontypes.RealValueType;
import eu.ddmore.libpharmml.dom.commontypes.Scalar;
import eu.ddmore.libpharmml.dom.commontypes.StringValueType;
import eu.ddmore.libpharmml.dom.commontypes.Sum;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRefType;
import eu.ddmore.libpharmml.dom.commontypes.TrueBooleanType;
import eu.ddmore.libpharmml.dom.commontypes.VectorSelector;
import eu.ddmore.libpharmml.dom.modeldefn.Probability;
import eu.ddmore.libpharmml.impl.LoggerWrapper;
import eu.ddmore.libpharmml.impl.PharmMLVersion;


/**
 * Complex Type that defines a mathematical equation.
 * 
 * <p>Java class for EquationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Scalar"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}Binop"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}Uniop"/>
 *         &lt;element name="Piecewise" type="{http://www.pharmml.org/2013/03/Maths}PiecewiseType"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}FunctionCall"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Sum"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Product"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Delay"/>
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
@XmlType(name = "EquationType", propOrder = {
	"scalarOrSymbRefOrBinop",
    "scalar",
    "symbRef",
    "binop",
    "uniop",
    "piecewise",
    "functionCall",
    "sum",
    "product",
    "delay",
    "vectorSelector",
    "matrixSelector",
    "probability"
})
@XmlSeeAlso({
    Equation.class
})
public class EquationType
    extends PharmMLRootType
{

    @XmlElementRef(name = "Scalar", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<?> scalar;
    @XmlElement(name = "SymbRef", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected SymbolRefType symbRef;
    @XmlElement(name = "Binop")
    protected Binop binop;
    @XmlElement(name = "Uniop")
    protected Uniop uniop;
    @XmlElement(name = "Piecewise")
    protected PiecewiseType piecewise;
    @XmlElement(name = "FunctionCall")
    protected FunctionCallType functionCall;
	@XmlElement(name = "Sum", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected Sum sum;
    @XmlElement(name = "Product", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected Product product;
    @XmlElement(name = "Delay", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected Delay delay;
    @XmlElement(name = "VectorSelector", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected VectorSelector vectorSelector;
    @XmlElement(name = "MatrixSelector", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected MatrixSelector matrixSelector;
    @XmlElement(name = "Probability", namespace = "http://www.pharmml.org/2013/03/ModelDefinition")
    protected Probability probability;
	
	@XmlElementRefs({
        @XmlElementRef(name = "Piecewise", namespace = "http://www.pharmml.org/2013/03/Maths", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SymbRef", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Uniop", namespace = "http://www.pharmml.org/2013/03/Maths", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Binop", namespace = "http://www.pharmml.org/2013/03/Maths", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FunctionCall", namespace = "http://www.pharmml.org/2013/03/Maths", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Scalar", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false)
    })
	@Deprecated
    protected List<JAXBElement<?>> scalarOrSymbRefOrBinop;

    /**
     * Gets the value of the scalar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RealValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrueBooleanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalseBooleanType }{@code >}
     *     
     */
    public JAXBElement<?> getScalar() {
        return scalar;
    }

    /**
     * Sets the value of the scalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RealValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrueBooleanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalseBooleanType }{@code >}
     *     
     */
    public void setScalar(JAXBElement<?> value) {
        this.scalar = value;
    }

    /**
     * Gets the value of the symbRef property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolRefType }
     *     
     */
    public SymbolRefType getSymbRef() {
        return symbRef;
    }

    /**
     * Sets the value of the symbRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolRefType }
     *     
     */
    public void setSymbRef(SymbolRefType value) {
        this.symbRef = value;
    }

    /**
     * Gets the value of the binop property.
     * 
     * @return
     *     possible object is
     *     {@link Binop }
     *     
     */
    public Binop getBinop() {
        return binop;
    }

    /**
     * Sets the value of the binop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binop }
     *     
     */
    public void setBinop(Binop value) {
        this.binop = value;
    }

    /**
     * Gets the value of the uniop property.
     * 
     * @return
     *     possible object is
     *     {@link Uniop }
     *     
     */
    public Uniop getUniop() {
        return uniop;
    }

    /**
     * Sets the value of the uniop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uniop }
     *     
     */
    public void setUniop(Uniop value) {
        this.uniop = value;
    }

    /**
     * Gets the value of the piecewise property.
     * 
     * @return
     *     possible object is
     *     {@link PiecewiseType }
     *     
     */
    public PiecewiseType getPiecewise() {
        return piecewise;
    }

    /**
     * Sets the value of the piecewise property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiecewiseType }
     *     
     */
    public void setPiecewise(PiecewiseType value) {
        this.piecewise = value;
    }

    /**
     * Gets the value of the functionCall property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionCallType }
     *     
     */
    public FunctionCallType getFunctionCall() {
        return functionCall;
    }

    /**
     * Sets the value of the functionCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionCallType }
     *     
     */
    public void setFunctionCall(FunctionCallType value) {
        this.functionCall = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link SumType }
     *     
     */
    public Sum getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumType }
     *     
     */
    public void setSum(Sum value) {
        this.sum = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setDelay(Delay value) {
        this.delay = value;
    }

    /**
     * Gets the value of the vectorSelector property.
     * 
     * @return
     *     possible object is
     *     {@link VectorSelectorType }
     *     
     */
    public VectorSelector getVectorSelector() {
        return vectorSelector;
    }

    /**
     * Sets the value of the vectorSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorSelectorType }
     *     
     */
    public void setVectorSelector(VectorSelector value) {
        this.vectorSelector = value;
    }

    /**
     * Gets the value of the matrixSelector property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixSelector }
     *     
     */
    public MatrixSelector getMatrixSelector() {
        return matrixSelector;
    }

    /**
     * Sets the value of the matrixSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixSelector }
     *     
     */
    public void setMatrixSelector(MatrixSelector value) {
        this.matrixSelector = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Probability }
     *     
     */
    public Probability getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Probability }
     *     
     */
    public void setProbability(Probability value) {
        this.probability = value;
    }
	
    @Deprecated
	public List<JAXBElement<?>> getScalarOrSymbRefOrBinop() {
        if (scalarOrSymbRefOrBinop == null) {
            scalarOrSymbRefOrBinop = new ArrayList<JAXBElement<?>>();
        }
        return this.scalarOrSymbRefOrBinop;
    }
    
    /**
     * Method used to deal with different behaviour of this class with differents PharmML versions
     * @param unmarshaller
     * @param parent
     */
    protected void afterUnmarshal(Unmarshaller unmarshaller, Object parent){
    	PharmMLVersion version = getUnmarshalVersion();
    	switch(version){
    	case V0_2_1:
    		// do nothing, deprecated attribute is set in priority
    		break;
    	default:// >=0.3
    		boolean firstElement = false;
    		for(JAXBElement<?> element : getScalarOrSymbRefOrBinop()){
    			if(!firstElement){
        			if(element.getDeclaredType().equals(SymbolRefType.class)){
        				setSymbRef((SymbolRefType)element.getValue()); 
        				firstElement = true;
        			} else if (element.getDeclaredType().equals(Binop.class)){
        				setBinop((Binop)element.getValue());
        				firstElement = true;
        			} else if (element.getDeclaredType().equals(FunctionCallType.class)){
        				setFunctionCall((FunctionCallType)element.getValue());
        				firstElement = true;
        			} else if (element.getDeclaredType().equals(PiecewiseType.class)){
        				setPiecewise((PiecewiseType)element.getValue());
        				firstElement = true;
        			} else if (element.getDeclaredType().equals(Uniop.class)){
        				setUniop((Uniop)element.getValue());
        				firstElement = true;
//        			} else if (element.getDeclaredType().equals(ScalarRhs.class)){
//        				setScalar(element);
//        				firstElement = true;
        			} else if (element.getValue() instanceof Scalar){
        				setScalar(element);
        				firstElement = true;
        			}
    			} else {
    				LoggerWrapper.getLogger().warning("Additionnal element "+element.getDeclaredType()+" ignored in "+this+
    						". EquationType can only have 1 single child in PharmML "+version+".");
    			}
    		}
    		getScalarOrSymbRefOrBinop().clear();
    	}
    }

}
