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


package eu.ddmore.libpharmml.dom.commontypes;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.maths.Equation;
import eu.ddmore.libpharmml.impl.XMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * <p>Java class for ScalarRhs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScalarRhs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/Maths}Equation"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Scalar"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated Since PharmML 0.7.1.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScalarRhs", propOrder = {
    "equation",
    "scalar",
    "symbRef"
})
//@XmlSeeAlso({
//    InitialEstimate.class // was the case before 0.7. Now extends Rhs
//})
@Deprecated
public class ScalarRhs
    extends PharmMLRootType
{

    @XmlElement(name = "Equation", namespace = XMLFilter.NS_DEFAULT_MATH)
    protected Equation equation;
    @XmlElementRef(name = "Scalar", namespace = XMLFilter.NS_DEFAULT_CT, type = JAXBElement.class, required = false)
    protected Scalar scalar;
    @XmlElement(name = "SymbRef")
    protected SymbolRef symbRef;

    /**
     * A mathematical expression.
     * 
     * @return
     *     possible object is
     *     {@link Equation }
     *     
     */
    public Equation getEquation() {
        return equation;
    }

    /**
     * Sets the value of the equation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equation }
     *     
     */
    public void setEquation(Equation value) {
        this.equation = value;
    }

    /**
     * A scalar value.
     * 
     * @return
     *     a {@link Scalar} implementation.
     *     
     */
    public Scalar getScalar() {
        return scalar;
    }

    /**
     * Sets the value of the scalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}
     *     
     */
    public void setScalar(Scalar value) {
        this.scalar = value;
    }

    /**
     * A variable reference.
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

	@Override
	protected List<TreeNode> listChildren() {
		List<TreeNode> list = new ChainedList<TreeNode>()
				.addIfNotNull(equation)
				.addIfNotNull(scalar)
				.addIfNotNull(symbRef);
		return list;
	}

}
