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
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.maths.Operand;


/**
 * 
 * Delay class for encoding a discrete delay element for delay differential equations. The typical expression
 * for delay is:
 * 
 * <p><math xmlns="http://www.w3.org/1998/Math/MathML">
 * <mi>y</mi>
 * <mo>(</mo>
 * <mi>t</mi>
 * <mo>-</mo>
 * <mi>&tau;</mi>
 * <mo>)</mo>
 * </math>
 * 
 * <p>where y is the model variable, and <mi>&tau;</mi> the discrete delay. <mi>&tau;</mi> can be a scalar or a symbol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *         &lt;element name="DelayVariable" type="{http://www.pharmml.org/2013/03/CommonTypes}DelayVariableType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayType", propOrder = {
    "symbRef",
    "delayVariable"
})
public class Delay
    extends PharmMLRootType implements Operand
{

    @XmlElement(name = "SymbRef", required = true)
    protected SymbolRefType symbRef;
    @XmlElement(name = "DelayVariable", required = true)
    protected DelayVariable delayVariable;
    
    /**
     * Empty constructor
     */
    public Delay(){}
    
    /**
     * Creates a delay element "<math xmlns="http://www.w3.org/1998/Math/MathML">
	 * <mi>y</mi>
	 * <mo>(</mo>
	 * <mi>t</mi>
	 * <mo>-</mo>
	 * <mi>&tau;</mi>
	 * <mo>)</mo>
	 * </math>" whith <mi>&tau;</mi> as a symbol.
     * @param y The model variable
     * @param tau The discrete delay as a reference to the according symbol 
     */
    public Delay(SymbolRefType y, SymbolRefType tau){
    	this.symbRef = y;
    	createDelayVariable(tau);
    }
    
    /**
     * Creates a delay element "<math xmlns="http://www.w3.org/1998/Math/MathML">
	 * <mi>y</mi>
	 * <mo>(</mo>
	 * <mi>t</mi>
	 * <mo>-</mo>
	 * <mi>&tau;</mi>
	 * <mo>)</mo>
	 * </math>" whith <mi>&tau;</mi> as a scalar.
     * @param y The model variable
     * @param tau The discrete delay as a scalar, either {@link IntValueType },
     *     {@link StringValueType },
     *     {@link RealValueType },
     *     {@link TrueBooleanType },
     *     {@link IdValueType } or
     *     {@link FalseBooleanType }
     */
    public Delay(SymbolRefType y, Scalar tau){
    	this.symbRef = y;
    	createDelayVariable(tau);
    }

    /**
     * Reference to the variable for which a delay is defined.
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
     * Gets the value of the delayVariable property.
     * 
     * @return
     *     possible object is
     *     {@link DelayVariable }
     *     
     */
    public DelayVariable getDelayVariable() {
        return delayVariable;
    }

    /**
     * Sets the value of the delayVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayVariable }
     *     
     */
    public void setDelayVariable(DelayVariable value) {
        this.delayVariable = value;
    }
    
    /**
     * Creates a delay variable as a symbol reference, adds it to the {@link Delay} element and returns it.
     * @param symbRef The delay variable <mi>&tau;</mi>
     * @return the created {@link DelayVariable} element
     */
    public DelayVariable createDelayVariable(SymbolRefType symbRef){
    	DelayVariable var = new DelayVariable();
    	var.setSymbRef(symbRef);
    	delayVariable = var;
    	return var;
    }
    
    /**
     * Creates a delay variable as a scalar, adds it to the {@link Delay} element and returns it.
     * @param scalar The delay variable <mi>&tau;</mi>
     * @return the created {@link DelayVariable} element
     */
    public DelayVariable createDelayVariable(Scalar scalar){
    	DelayVariable var = new DelayVariable();
    	var.setScalar(scalar);
    	delayVariable = var;
    	return var;
    }

	@Override
	public JAXBElement<Delay> toJAXBElement() {
		return MasterObjectFactory.COMMONTYPES_OF.createDelay(this);
	}

}
