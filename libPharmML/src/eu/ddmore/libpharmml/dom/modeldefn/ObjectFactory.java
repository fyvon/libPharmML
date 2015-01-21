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


package eu.ddmore.libpharmml.dom.modeldefn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.ddmore.libpharmml.dom.modeldefn package. 
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

    private final static QName _StructuralModel_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "StructuralModel");
    private final static QName _ModelDefinition_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "ModelDefinition");
    private final static QName _General_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "General");
    private final static QName _Probability_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "Probability");
    private final static QName _Standard_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "Standard");
    private final static QName _SimpleParameter_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "SimpleParameter");
    private final static QName _IndividualParameter_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "IndividualParameter");
    private final static QName _ObservationError_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "ObservationError");
    private final static QName _CommonParameterElement_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "CommonParameterElement");
    private final static QName _RandomVariable_QNAME = new QName("http://www.pharmml.org/2013/03/ModelDefinition", "RandomVariable");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ddmore.libpharmml.dom.modeldefn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndividualParameterType }
     * 
     */
    public IndividualParameterType createIndividualParameterType() {
        return new IndividualParameterType();
    }

    /**
     * Create an instance of {@link IndividualParameterType.GaussianModel }
     * 
     */
    public IndividualParameterType.GaussianModel createIndividualParameterTypeGaussianModel() {
        return new IndividualParameterType.GaussianModel();
    }

    /**
     * Create an instance of {@link IndividualParameterType.GaussianModel.LinearCovariate }
     * 
     */
    public IndividualParameterType.GaussianModel.LinearCovariate createIndividualParameterTypeGaussianModelLinearCovariate() {
        return new IndividualParameterType.GaussianModel.LinearCovariate();
    }

    /**
     * Create an instance of {@link GaussianObsError }
     * 
     */
    public GaussianObsError createGaussianObsError() {
        return new GaussianObsError();
    }

    /**
     * Create an instance of {@link ModelDefinitionType }
     * 
     */
    public ModelDefinitionType createModelDefinitionType() {
        return new ModelDefinitionType();
    }

    /**
     * Create an instance of {@link Probability }
     * 
     */
    public Probability createProbabilityType() {
        return new Probability();
    }

    /**
     * Create an instance of {@link StructuralModelType }
     * 
     */
    public StructuralModelType createStructuralModelType() {
        return new StructuralModelType();
    }

    /**
     * Create an instance of {@link GeneralObsError }
     * 
     */
    public GeneralObsError createGeneralObsError() {
        return new GeneralObsError();
    }

    /**
     * Create an instance of {@link ParameterRandomVariableType }
     * 
     */
    public ParameterRandomVariableType createParameterRandomVariableType() {
        return new ParameterRandomVariableType();
    }

    /**
     * Create an instance of {@link SimpleParameterType }
     * 
     */
    public SimpleParameterType createSimpleParameterType() {
        return new SimpleParameterType();
    }

    /**
     * Create an instance of {@link ParentLevelType }
     * 
     */
    public ParentLevelType createParentLevelType() {
        return new ParentLevelType();
    }

    /**
     * Create an instance of {@link TransitionRate }
     * 
     */
    public TransitionRate createTransitionRateType() {
        return new TransitionRate();
    }

    /**
     * Create an instance of {@link CovariateTransformationType }
     * 
     */
    public CovariateTransformationType createCovariateTransformationType() {
        return new CovariateTransformationType();
    }

    /**
     * Create an instance of {@link PairwiseType }
     * 
     */
    public PairwiseType createPairwiseType() {
        return new PairwiseType();
    }

    /**
     * Create an instance of {@link ContinuousObservationModel }
     * 
     */
    public ContinuousObservationModel createContinuousObservationModelType() {
        return new ContinuousObservationModel();
    }

    /**
     * Create an instance of {@link VariabilityLevelDefnType }
     * 
     */
    public VariabilityLevelDefnType createVariabilityLevelDefnType() {
        return new VariabilityLevelDefnType();
    }

    /**
     * Create an instance of {@link CountPMF }
     * 
     */
    public CountPMF createCountPMFType() {
        return new CountPMF();
    }

    /**
     * Create an instance of {@link Discrete }
     * 
     */
    public Discrete createDiscreteType() {
        return new Discrete();
    }

    /**
     * Create an instance of {@link TimeToEventData }
     * 
     */
    public TimeToEventData createTimeToEventDataType() {
        return new TimeToEventData();
    }

    /**
     * Create an instance of {@link VariabilityDefnBlock }
     * 
     */
    public VariabilityDefnBlock createVariabilityDefnBlock() {
        return new VariabilityDefnBlock();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategoryType() {
        return new Category();
    }

    /**
     * Create an instance of {@link ParameterModelType }
     * 
     */
    public ParameterModelType createParameterModelType() {
        return new ParameterModelType();
    }

    /**
     * Create an instance of {@link CategoricalCovariate }
     * 
     */
    public CategoricalCovariate createCategoricalCovariateType() {
        return new CategoricalCovariate();
    }

    /**
     * Create an instance of {@link CovariateRelationType }
     * 
     */
    public CovariateRelationType createCovariateRelationType() {
        return new CovariateRelationType();
    }

    /**
     * Create an instance of {@link CategoricalData }
     * 
     */
    public CategoricalData createCategoricalDataType() {
        return new CategoricalData();
    }

    /**
     * Create an instance of {@link CovariateModelType }
     * 
     */
    public CovariateModelType createCovariateModelType() {
        return new CovariateModelType();
    }

    /**
     * Create an instance of {@link CountData }
     * 
     */
    public CountData createCountDataType() {
        return new CountData();
    }

    /**
     * Create an instance of {@link Censoring }
     * 
     */
    public Censoring createCensoringType() {
        return new Censoring();
    }

    /**
     * Create an instance of {@link FixedEffectRelationType }
     * 
     */
    public FixedEffectRelationType createFixedEffectRelationType() {
        return new FixedEffectRelationType();
    }

    /**
     * Create an instance of {@link CommonDiscreteState }
     * 
     */
    public CommonDiscreteState createCommonDiscreteStateType() {
        return new CommonDiscreteState();
    }

    /**
     * Create an instance of {@link ObservationModelType }
     * 
     */
    public ObservationModelType createObservationModelType() {
        return new ObservationModelType();
    }

    /**
     * Create an instance of {@link CensoringFeature }
     * 
     */
    public CensoringFeature createCensoringFeatureType() {
        return new CensoringFeature();
    }

    /**
     * Create an instance of {@link DiscreteDataParameter }
     * 
     */
    public DiscreteDataParameter createDiscreteDataParameterType() {
        return new DiscreteDataParameter();
    }

    /**
     * Create an instance of {@link ProbabilityAssignment }
     * 
     */
    public ProbabilityAssignment createProbabilityAssignmentType() {
        return new ProbabilityAssignment();
    }

    /**
     * Create an instance of {@link ListOfCategories }
     * 
     */
    public ListOfCategories createListOfCategoriesType() {
        return new ListOfCategories();
    }

    /**
     * Create an instance of {@link CorrelationType }
     * 
     */
    public CorrelationType createCorrelationType() {
        return new CorrelationType();
    }

    /**
     * Create an instance of {@link CommonDiscreteVariable }
     * 
     */
    public CommonDiscreteVariable createCommonDiscreteVariableType() {
        return new CommonDiscreteVariable();
    }

    /**
     * Create an instance of {@link CorrelatedRandomVarType }
     * 
     */
    public CorrelatedRandomVarType createCorrelatedRandomVarType() {
        return new CorrelatedRandomVarType();
    }

    /**
     * Create an instance of {@link CategoricalPMF }
     * 
     */
    public CategoricalPMF createCategoricalPMFType() {
        return new CategoricalPMF();
    }

    /**
     * Create an instance of {@link TTEFunction }
     * 
     */
    public TTEFunction createTTEFunctionType() {
        return new TTEFunction();
    }

    /**
     * Create an instance of {@link CategoricalRelation }
     * 
     */
    public CategoricalRelation createCategoricalRelationType() {
        return new CategoricalRelation();
    }

    /**
     * Create an instance of {@link ContinuousCovariate }
     * 
     */
    public ContinuousCovariate createContinuousCovariateType() {
        return new ContinuousCovariate();
    }

    /**
     * Create an instance of {@link Dependance }
     * 
     */
    public Dependance createDependanceType() {
        return new Dependance();
    }

    /**
     * Create an instance of {@link ParameterRandomEffectType }
     * 
     */
    public ParameterRandomEffectType createParameterRandomEffectType() {
        return new ParameterRandomEffectType();
    }

    /**
     * Create an instance of {@link CovariateDefinitionType }
     * 
     */
    public CovariateDefinitionType createCovariateDefinitionType() {
        return new CovariateDefinitionType();
    }

    /**
     * Create an instance of {@link CategoricalCovariate }
     * 
     */
    public CategoricalCovariate createCategorialCovariateType() {
        return new CategoricalCovariate();
    }

    /**
     * Create an instance of {@link IndividualParameterType.GaussianModel.GeneralCovariate }
     * 
     */
    public IndividualParameterType.GaussianModel.GeneralCovariate createIndividualParameterTypeGaussianModelGeneralCovariate() {
        return new IndividualParameterType.GaussianModel.GeneralCovariate();
    }

    /**
     * Create an instance of {@link IndividualParameterType.GaussianModel.LinearCovariate.PopulationParameter }
     * 
     */
    public IndividualParameterType.GaussianModel.LinearCovariate.PopulationParameter createIndividualParameterTypeGaussianModelLinearCovariatePopulationParameter() {
        return new IndividualParameterType.GaussianModel.LinearCovariate.PopulationParameter();
    }

    /**
     * Create an instance of {@link GaussianObsError.Output }
     * 
     */
    public GaussianObsError.Output createGaussianObsErrorOutput() {
        return new GaussianObsError.Output();
    }

    /**
     * Create an instance of {@link GaussianObsError.ErrorModel }
     * 
     */
    public GaussianObsError.ErrorModel createGaussianObsErrorErrorModel() {
        return new GaussianObsError.ErrorModel();
    }

    /**
     * Create an instance of {@link GaussianObsError.ResidualError }
     * 
     */
    public GaussianObsError.ResidualError createGaussianObsErrorResidualError() {
        return new GaussianObsError.ResidualError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuralModelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "StructuralModel")
    public JAXBElement<StructuralModelType> createStructuralModel(StructuralModelType value) {
        return new JAXBElement<StructuralModelType>(_StructuralModel_QNAME, StructuralModelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelDefinitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "ModelDefinition")
    public JAXBElement<ModelDefinitionType> createModelDefinition(ModelDefinitionType value) {
        return new JAXBElement<ModelDefinitionType>(_ModelDefinition_QNAME, ModelDefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralObsError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "General", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/ModelDefinition", substitutionHeadName = "ObservationError")
    public JAXBElement<GeneralObsError> createGeneral(GeneralObsError value) {
        return new JAXBElement<GeneralObsError>(_General_QNAME, GeneralObsError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Probability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "Probability")
    public JAXBElement<Probability> createProbability(Probability value) {
        return new JAXBElement<Probability>(_Probability_QNAME, Probability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GaussianObsError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "Standard", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/ModelDefinition", substitutionHeadName = "ObservationError")
    public JAXBElement<GaussianObsError> createStandard(GaussianObsError value) {
        return new JAXBElement<GaussianObsError>(_Standard_QNAME, GaussianObsError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "SimpleParameter", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/ModelDefinition", substitutionHeadName = "CommonParameterElement")
    public JAXBElement<SimpleParameterType> createSimpleParameter(SimpleParameterType value) {
        return new JAXBElement<SimpleParameterType>(_SimpleParameter_QNAME, SimpleParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "IndividualParameter", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/ModelDefinition", substitutionHeadName = "CommonParameterElement")
    public JAXBElement<IndividualParameterType> createIndividualParameter(IndividualParameterType value) {
        return new JAXBElement<IndividualParameterType>(_IndividualParameter_QNAME, IndividualParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObservationErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "ObservationError")
    public JAXBElement<ObservationErrorType> createObservationError(ObservationErrorType value) {
        return new JAXBElement<ObservationErrorType>(_ObservationError_QNAME, ObservationErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "CommonParameterElement")
    public JAXBElement<CommonParameter> createCommonParameterElement(CommonParameter value) {
        return new JAXBElement<CommonParameter>(_CommonParameterElement_QNAME, CommonParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterRandomVariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/ModelDefinition", name = "RandomVariable", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/ModelDefinition", substitutionHeadName = "CommonParameterElement")
    public JAXBElement<ParameterRandomVariableType> createRandomVariable(ParameterRandomVariableType value) {
        return new JAXBElement<ParameterRandomVariableType>(_RandomVariable_QNAME, ParameterRandomVariableType.class, null, value);
    }

}
