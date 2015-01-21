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


package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.ddmore.libpharmml.dom.commontypes package. 
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

    private final static QName _Variable_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Variable");
    private final static QName _Interpolation_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Interpolation");
    private final static QName _Delay_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Delay");
    private final static QName _Int_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Int");
    private final static QName _VariableAssignment_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "VariableAssignment");
    private final static QName _Arrays_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Arrays");
    private final static QName _FunctionDefinition_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "FunctionDefinition");
    private final static QName _VariabilityReference_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "VariabilityReference");
    private final static QName _Matrix_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Matrix");
    private final static QName _Scalar_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Scalar");
    private final static QName _VectorSelector_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "VectorSelector");
    private final static QName _Symbol_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Symbol");
    private final static QName _String_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "String");
    private final static QName _CommonVariable_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "CommonVariable");
    private final static QName _Real_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Real");
    private final static QName _Vector_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Vector");
    private final static QName _True_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "True");
    private final static QName _Id_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Id");
    private final static QName _Assign_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Assign");
    private final static QName _Product_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Product");
    private final static QName _MatrixSelector_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "MatrixSelector");
    private final static QName _Sequence_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Sequence");
    private final static QName _OidRef_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "OidRef");
    private final static QName _DerivativeVariable_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "DerivativeVariable");
    private final static QName _False_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "False");
    private final static QName _Name_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Name");
    private final static QName _Description_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Description");
    private final static QName _Boolean_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Boolean");
    private final static QName _SymbRef_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "SymbRef");
    
    // Vectors (0.3.2)
    private final static QName _VectorElements_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "VectorElements");
    private final static QName _VectorCell_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "VectorCell");
    private final static QName _VectorSegment_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "VectorSegment");
    private final static QName _VectorCellValue_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "VectorCellValue");
    private final static QName _VectorValue_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "VectorValue");
    private final static QName _Sum_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "Sum");
    private final static QName _VectorSegmentSelectorTypeSegmentLength_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "SegmentLength");
    private final static QName _VectorSegmentSelectorTypeStartIndex_QNAME = new QName("http://www.pharmml.org/2013/03/CommonTypes", "StartIndex");

    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ddmore.libpharmml.dom.commontypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createNameType() {
        return new Name();
    }

    /**
     * Create an instance of {@link AnnotationType }
     * 
     */
    public AnnotationType createAnnotationType() {
        return new AnnotationType();
    }

    /**
     * Create an instance of {@link FunctionDefinition }
     * 
     */
    public FunctionDefinition createFunctionDefinitionType() {
        return new FunctionDefinition();
    }

    /**
     * Create an instance of {@link SymbolRef }
     * 
     */
    public SymbolRef createSymbolRefType() {
        return new SymbolRef();
    }

    /**
     * Create an instance of {@link Rhs }
     * 
     */
    public Rhs createRhs() {
        return new Rhs();
    }

    /**
     * Create an instance of {@link VariableDefinition }
     * 
     */
    public VariableDefinition createVariableDefinitionType() {
        return new VariableDefinition();
    }

    /**
     * Create an instance of {@link LevelReference }
     * 
     */
    public LevelReference createLevelReferenceType() {
        return new LevelReference();
    }

    /**
     * Create an instance of {@link DerivativeVariable }
     * 
     */
    public DerivativeVariable createDerivativeVariableType() {
        return new DerivativeVariable();
    }

    /**
     * Create an instance of {@link FalseBoolean }
     * 
     */
    public FalseBoolean createFalseBooleanType() {
        return new FalseBoolean();
    }

    /**
     * Create an instance of {@link Interpolation }
     * 
     */
    public Interpolation createInterpolationType() {
        return new Interpolation();
    }

    /**
     * Create an instance of {@link RealValue }
     * 
     */
    public RealValue createRealValueType() {
        return new RealValue();
    }

    /**
     * Create an instance of {@link StringValue }
     * 
     */
    public StringValue createStringValueType() {
        return new StringValue();
    }

    /**
     * Create an instance of {@link SymbolName }
     * 
     */
    public SymbolName createSymbolNameType() {
        return new SymbolName();
    }

    /**
     * Create an instance of {@link TrueBoolean }
     * 
     */
    public TrueBoolean createTrueBooleanType() {
        return new TrueBoolean();
    }

    /**
     * Create an instance of {@link VariableAssignment }
     * 
     */
    public VariableAssignment createVariableAssignmentType() {
        return new VariableAssignment();
    }

    /**
     * Create an instance of {@link IdValue }
     * 
     */
    public IdValue createIdValueType() {
        return new IdValue();
    }

    /**
     * Create an instance of {@link OidRef }
     * 
     */
    public OidRef createOidRefType() {
        return new OidRef();
    }

    /**
     * Create an instance of {@link Sequence }
     * 
     */
    public Sequence createSequenceType() {
        return new Sequence();
    }

    /**
     * Create an instance of {@link IntValue }
     * 
     */
    public IntValue createIntValueType() {
        return new IntValue();
    }

    /**
     * Create an instance of {@link Vector }
     * 
     */
    @Deprecated
    public Vector createVectorType() {
        return new Vector();
    }

    /**
     * Create an instance of {@link Matrix }
     * @deprecated Use {@link #createMatrix()} instead.
     */
    @Deprecated
    public Matrix createMatrixType() {
        return new Matrix();
    }
    
    /**
     * Create an instance of {@link Matrix }
     * 
     */
    public Matrix createMatrix() {
        return new Matrix();
    }

    /**
     * Create an instance of {@link InitialTime }
     * 
     */
    public InitialTime createInitialTimeType() {
        return new InitialTime();
    }

    /**
     * Create an instance of {@link ScalarRhs }
     * 
     */
    public ScalarRhs createScalarRhs() {
        return new ScalarRhs();
    }

    /**
     * Create an instance of {@link IndependentVariableReference }
     * 
     */
    public IndependentVariableReference createIndependentVariableReferenceType() {
        return new IndependentVariableReference();
    }

    /**
     * Create an instance of {@link InterpolationIV }
     * 
     */
    public InterpolationIV createInterpolationIVType() {
        return new InterpolationIV();
    }

    /**
     * Create an instance of {@link MatrixColumnRowNames }
     * 
     */
    public MatrixColumnRowNames createMatrixColumnRowNames() {
        return new MatrixColumnRowNames();
    }

    /**
     * Create an instance of {@link MatrixRow }
     * 
     */
    public MatrixRow createMatrixRowType() {
        return new MatrixRow();
    }

    /**
     * Create an instance of {@link InitialCondition }
     * 
     */
    public InitialCondition createInitialConditionType() {
        return new InitialCondition();
    }

    /**
     * Create an instance of {@link InitialValue }
     * 
     */
    public InitialValue createInitialValueType() {
        return new InitialValue();
    }

    /**
     * Create an instance of {@link FunctionParameter }
     * 
     */
    public FunctionParameter createFuncParameterDefinitionType() {
        return new FunctionParameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Variable", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "CommonVariable")
    public JAXBElement<VariableDefinition> createVariable(VariableDefinition value) {
        return new JAXBElement<VariableDefinition>(_Variable_QNAME, VariableDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Interpolation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Interpolation")
    public JAXBElement<Interpolation> createInterpolation(Interpolation value) {
        return new JAXBElement<Interpolation>(_Interpolation_QNAME, Interpolation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Int", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Scalar")
    public JAXBElement<IntValue> createInt(IntValue value) {
        return new JAXBElement<IntValue>(_Int_QNAME, IntValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "VariableAssignment")
    public JAXBElement<VariableAssignment> createVariableAssignment(VariableAssignment value) {
        return new JAXBElement<VariableAssignment>(_VariableAssignment_QNAME, VariableAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "FunctionDefinition")
    public JAXBElement<FunctionDefinition> createFunctionDefinition(FunctionDefinition value) {
        return new JAXBElement<FunctionDefinition>(_FunctionDefinition_QNAME, FunctionDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Arrays")
    public JAXBElement<Object> createArrays(Object value) {
        return new JAXBElement<Object>(_Arrays_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "VariabilityReference")
    public JAXBElement<LevelReference> createVariabilityReference(LevelReference value) {
        return new JAXBElement<LevelReference>(_VariabilityReference_QNAME, LevelReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Scalar", substitutionHeadNamespace="http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName="VectorCellValue")
    public JAXBElement<Object> createScalar(Object value) {
        return new JAXBElement<Object>(_Scalar_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Symbol")
    public JAXBElement<SymbolName> createSymbol(SymbolName value) {
        return new JAXBElement<SymbolName>(_Symbol_QNAME, SymbolName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "String", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Scalar")
    public JAXBElement<StringValue> createString(StringValue value) {
        return new JAXBElement<StringValue>(_String_QNAME, StringValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonVariableDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "CommonVariable")
    public JAXBElement<CommonVariableDefinition> createCommonVariable(CommonVariableDefinition value) {
        return new JAXBElement<CommonVariableDefinition>(_CommonVariable_QNAME, CommonVariableDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Real", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Scalar")
    public JAXBElement<RealValue> createReal(RealValue value) {
        return new JAXBElement<RealValue>(_Real_QNAME, RealValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Vector", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Arrays")
    public JAXBElement<Vector> createVector(Vector value) {
        return new JAXBElement<Vector>(_Vector_QNAME, Vector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "True", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Boolean")
    public JAXBElement<TrueBoolean> createTrue(TrueBoolean value) {
        return new JAXBElement<TrueBoolean>(_True_QNAME, TrueBoolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Id", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Scalar")
    public JAXBElement<IdValue> createId(IdValue value) {
        return new JAXBElement<IdValue>(_Id_QNAME, IdValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rhs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Assign")
    public JAXBElement<Rhs> createAssign(Rhs value) {
        return new JAXBElement<Rhs>(_Assign_QNAME, Rhs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Sequence", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Arrays")
    public JAXBElement<Sequence> createSequence(Sequence value) {
        return new JAXBElement<Sequence>(_Sequence_QNAME, Sequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OidRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "OidRef")
    public JAXBElement<OidRef> createOidRef(OidRef value) {
        return new JAXBElement<OidRef>(_OidRef_QNAME, OidRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivativeVariable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "DerivativeVariable", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "CommonVariable")
    public JAXBElement<DerivativeVariable> createDerivativeVariable(DerivativeVariable value) {
        return new JAXBElement<DerivativeVariable>(_DerivativeVariable_QNAME, DerivativeVariable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "False", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Boolean")
    public JAXBElement<FalseBoolean> createFalse(FalseBoolean value) {
        return new JAXBElement<FalseBoolean>(_False_QNAME, FalseBoolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Name")
    public JAXBElement<Name> createName(Name value) {
        return new JAXBElement<Name>(_Name_QNAME, Name.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnotationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Description")
    public JAXBElement<AnnotationType> createDescription(AnnotationType value) {
        return new JAXBElement<AnnotationType>(_Description_QNAME, AnnotationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Boolean", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName = "Scalar")
    public JAXBElement<BooleanValue> createBoolean(BooleanValue value) {
        return new JAXBElement<BooleanValue>(_Boolean_QNAME, BooleanValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "SymbRef", substitutionHeadNamespace="http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName="VectorCellValue")
    public JAXBElement<SymbolRef> createSymbRef(SymbolRef value) {
        return new JAXBElement<SymbolRef>(_SymbRef_QNAME, SymbolRef.class, null, value);
    }
    
    // 0.3.2
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "VectorElements")
    JAXBElement<VectorElements> createVectorElements(VectorElements value){
    	return new JAXBElement<VectorElements>(_VectorElements_QNAME, VectorElements.class, null, value);
    }
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "VectorCell")
    JAXBElement<VectorCell> createVectorCell(VectorCell value){
    	return new JAXBElement<VectorCell>(_VectorCell_QNAME, VectorCell.class, null, value);
    }
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "VectorSegment")
    JAXBElement<VectorSegment> createVectorSegment(VectorSegment value){
    	return new JAXBElement<VectorSegment>(_VectorSegment_QNAME, VectorSegment.class, null, value);
    }
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "VectorCellValue", substitutionHeadNamespace="http://www.pharmml.org/2013/03/CommonTypes", substitutionHeadName="VectorValue")
    JAXBElement<Object> createVectorCellValue(Object value) {
        return new JAXBElement<Object>(_VectorCellValue_QNAME, Object.class, null, value);
    }
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "VectorValue")
    JAXBElement<Object> createVectorValue(Object value) {
        return new JAXBElement<Object>(_VectorValue_QNAME, Object.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixSelectorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "MatrixSelector")
    public JAXBElement<MatrixSelector> createMatrixSelector(MatrixSelector value) {
        return new JAXBElement<MatrixSelector>(_MatrixSelector_QNAME, MatrixSelector.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorSelectorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "VectorSelector")
    public JAXBElement<VectorSelector> createVectorSelector(VectorSelector value) {
        return new JAXBElement<VectorSelector>(_VectorSelector_QNAME, VectorSelector.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Matrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Matrix")
    public JAXBElement<Matrix> createMatrix(Matrix value) {
        return new JAXBElement<Matrix>(_Matrix_QNAME, Matrix.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "Delay")
    public JAXBElement<Delay> createDelay(Delay value) {
        return new JAXBElement<Delay>(_Delay_QNAME, Delay.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixVectorIndexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "SegmentLength", scope = VectorSegmentSelector.class)
    public JAXBElement<MatrixVectorIndex> createVectorSegmentSelectorTypeSegmentLength(MatrixVectorIndex value) {
        return new JAXBElement<MatrixVectorIndex>(_VectorSegmentSelectorTypeSegmentLength_QNAME, MatrixVectorIndex.class, VectorSegmentSelector.class, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixVectorIndexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/CommonTypes", name = "StartIndex", scope = VectorSegmentSelector.class)
    public JAXBElement<MatrixVectorIndex> createVectorSegmentSelectorTypeStartIndex(MatrixVectorIndex value) {
        return new JAXBElement<MatrixVectorIndex>(_VectorSegmentSelectorTypeStartIndex_QNAME, MatrixVectorIndex.class, VectorSegmentSelector.class, value);
    }
}
