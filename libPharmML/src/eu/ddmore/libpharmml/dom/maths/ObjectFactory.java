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
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.ddmore.libpharmml.dom.maths package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FunctionCall_QNAME = new QName("http://www.pharmml.org/2013/03/Maths", "FunctionCall");
    private final static QName _Constant_QNAME = new QName("http://www.pharmml.org/2013/03/Maths", "Constant");
    private final static QName _LogicUniop_QNAME = new QName("http://www.pharmml.org/2013/03/Maths", "LogicUniop");
    private final static QName _LogicBinop_QNAME = new QName("http://www.pharmml.org/2013/03/Maths", "LogicBinop");
    private final static QName _Otherwise_QNAME = new QName("http://www.pharmml.org/2013/03/Maths", "Otherwise");
    private final static QName _Uniop_QNAME = new QName("http://www.pharmml.org/2013/03/Maths", "Uniop");
    private final static QName _Binop_QNAME = new QName("http://www.pharmml.org/2013/03/Maths", "Binop");
    private final static QName _EquationTypePiecewise_QNAME = new QName("http://www.pharmml.org/2013/03/Maths", "Piecewise");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ddmore.libpharmml.dom.maths
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FunctionCallType }
     * 
     */
    public FunctionCallType createFunctionCallType() {
        return new FunctionCallType();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link LogicConditionType }
     * 
     */
    public LogicConditionType createLogicConditionType() {
        return new LogicConditionType();
    }

    /**
     * Create an instance of {@link LogicBinOpType }
     * 
     */
    public LogicBinOpType createLogicBinOpType() {
        return new LogicBinOpType();
    }

    /**
     * Create an instance of {@link LogicUniOpType }
     * 
     */
    public LogicUniOpType createLogicUniOpType() {
        return new LogicUniOpType();
    }

    /**
     * Create an instance of {@link Binop }
     * 
     */
    public Binop createBinopType() {
        return new Binop();
    }

    /**
     * Create an instance of {@link Equation }
     * 
     */
    public Equation createEquation() {
        return new Equation();
    }

    /**
     * Create an instance of {@link EquationType }
     * 
     */
    public EquationType createEquationType() {
        return new EquationType();
    }

    /**
     * Create an instance of {@link Uniop }
     * 
     */
    public Uniop createUniopType() {
        return new Uniop();
    }

    /**
     * Create an instance of {@link PiecewiseType }
     * 
     */
    public PiecewiseType createPiecewiseType() {
        return new PiecewiseType();
    }

    /**
     * Create an instance of {@link ConstantType }
     * 
     */
    public ConstantType createConstantType() {
        return new ConstantType();
    }

    /**
     * Create an instance of {@link ExprType }
     * 
     */
    public ExprType createExprType() {
        return new ExprType();
    }

    /**
     * Create an instance of {@link LogicExprType }
     * 
     */
    public LogicExprType createLogicExprType() {
        return new LogicExprType();
    }

    /**
     * Create an instance of {@link PieceType }
     * 
     */
    public PieceType createPieceType() {
        return new PieceType();
    }

    /**
     * Create an instance of {@link FunctionArgumentType }
     * 
     */
    public FunctionArgumentType createFunctionArgumentType() {
        return new FunctionArgumentType();
    }

    /**
     * Create an instance of {@link FunctionCallType.FunctionArgument }
     * 
     */
    public FunctionCallType.FunctionArgument createFunctionCallTypeFunctionArgument() {
        return new FunctionCallType.FunctionArgument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionCallType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/Maths", name = "FunctionCall")
    public JAXBElement<FunctionCallType> createFunctionCall(FunctionCallType value) {
        return new JAXBElement<FunctionCallType>(_FunctionCall_QNAME, FunctionCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/Maths", name = "Constant")
    public JAXBElement<ConstantType> createConstant(ConstantType value) {
        return new JAXBElement<ConstantType>(_Constant_QNAME, ConstantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogicUniOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/Maths", name = "LogicUniop")
    public JAXBElement<LogicUniOpType> createLogicUniop(LogicUniOpType value) {
        return new JAXBElement<LogicUniOpType>(_LogicUniop_QNAME, LogicUniOpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogicBinOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/Maths", name = "LogicBinop")
    public JAXBElement<LogicBinOpType> createLogicBinop(LogicBinOpType value) {
        return new JAXBElement<LogicBinOpType>(_LogicBinop_QNAME, LogicBinOpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/Maths", name = "Otherwise")
    public JAXBElement<Object> createOtherwise(Object value) {
        return new JAXBElement<Object>(_Otherwise_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uniop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/Maths", name = "Uniop")
    public JAXBElement<Uniop> createUniop(Uniop value) {
        return new JAXBElement<Uniop>(_Uniop_QNAME, Uniop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Binop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/Maths", name = "Binop")
    public JAXBElement<Binop> createBinop(Binop value) {
        return new JAXBElement<Binop>(_Binop_QNAME, Binop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PiecewiseType }{@code >}}
     * 
     */
	@Deprecated
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/Maths", name = "Piecewise", scope = EquationType.class)
    public JAXBElement<PiecewiseType> createEquationTypePiecewise(PiecewiseType value) {
        return new JAXBElement<PiecewiseType>(_EquationTypePiecewise_QNAME, PiecewiseType.class, EquationType.class, value);
    }

}
