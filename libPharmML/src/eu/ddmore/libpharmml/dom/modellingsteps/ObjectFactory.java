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


package eu.ddmore.libpharmml.dom.modellingsteps;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import eu.ddmore.libpharmml.impl.XMLFilter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.ddmore.libpharmml.dom.modellingsteps package. 
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

    private final static QName _SimulationStep_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "SimulationStep");
    private final static QName _Property_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "Property");
    private final static QName _CommonModellingStep_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "CommonModellingStep");
    private final static QName _ModellingSteps_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "ModellingSteps");
    private final static QName _VariableMapping_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "VariableMapping");
    private final static QName _IndividualMapping_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "IndividualMapping");
	@Deprecated
    private final static QName _Operation_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "Operation");
    private final static QName _EstimationStep_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "EstimationStep");
    private final static QName _Timepoints_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "Timepoints");
    private final static QName _Mapping_QNAME = new QName(XMLFilter.NS_DEFAULT_MSTEPS, "Mapping");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ddmore.libpharmml.dom.modellingsteps
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModellingSteps }
     * 
     */
    public ModellingSteps createModellingStepsType() {
        return new ModellingSteps();
    }

    /**
     * Create an instance of {@link Simulation }
     * 
     */
    public Simulation createSimulationStepType() {
        return new Simulation();
    }

    /**
     * Create an instance of {@link IndividualMapping }
     * 
     */
    @Deprecated
    public IndividualMapping createIndividualMappingType() {
        return new IndividualMapping();
    }

    /**
     * Create an instance of {@link Timepoints }
     * 
     */
    public Timepoints createTimepointsType() {
        return new Timepoints();
    }

    /**
     * Create an instance of {@link VariableMapping }
     * 
     */
    @Deprecated
    public VariableMapping createVariableMappingType() {
        return new VariableMapping();
    }

    /**
     * Create an instance of {@link Estimation }
     * 
     */
    public Estimation createEstimationStepType() {
        return new Estimation();
    }

    /**
     * Create an instance of {@link OperationProperty }
     * 
     */
    public OperationProperty createOperationPropertyType() {
        return new OperationProperty();
    }

    /**
     * Create an instance of {@link ContinuousObservation }
     * 
     */
    public ContinuousObservation createContinuousObservationType() {
        return new ContinuousObservation();
    }

    /**
     * Create an instance of {@link SimulationOperation }
     * 
	 * @since PharmML 0.3
     */
    public SimulationOperation createSimulationOperationType() {
        return new SimulationOperation();
    }

    /**
     * Create an instance of {@link Algorithm }
     * 
     */
    public Algorithm createAlgorithmType() {
        return new Algorithm();
    }

    /**
     * Create an instance of {@link TargetToolReference }
     * 
     */
    public TargetToolReference createTargetToolReferenceType() {
        return new TargetToolReference();
    }

    /**
     * Create an instance of {@link CodeInjection }
     * 
     */
    public CodeInjection createCodeInjectionType() {
        return new CodeInjection();
    }

    /**
     * Create an instance of {@link TargetTool }
     * 
     */
    public TargetTool createTargetToolType() {
        return new TargetTool();
    }

    /**
     * Create an instance of {@link ParameterEstimate }
     * 
     */
    public ParameterEstimate createParameterEstimateType() {
        return new ParameterEstimate();
    }

    /**
     * Create an instance of {@link Observations }
     * 
     */
    public Observations createObservationsType() {
        return new Observations();
    }

    /**
     * Create an instance of {@link StepDependency }
     * 
     */
    public StepDependency createStepDependencyType() {
        return new StepDependency();
    }

    /**
     * Create an instance of {@link DependentsType }
     * 
     */
    public DependentsType createDependentsType() {
        return new DependentsType();
    }

    /**
     * Create an instance of {@link NONMEMdataSet }
     * 
	 * @since PharmML0.3
     */
    @Deprecated
    public NONMEMdataSet createNONMEMdataSetType() {
        return new NONMEMdataSet();
    }

    /**
     * Create an instance of {@link InitialEstimate }
     * 
     */
    public InitialEstimate createInitialEstimateType() {
        return new InitialEstimate();
    }

    /**
     * Create an instance of {@link TargetToolSymbol }
     * 
	 * @since PharmML0.3
     */
    public TargetToolSymbol createTargetToolSymbolType() {
        return new TargetToolSymbol();
    }
    
    /**
     * Create an instance of {@link MultipleDVMapping }
     * 
     */
    public MultipleDVMapping createMultipleDVMappingType() {
        return new MultipleDVMapping();
    }
    
    /**
     * Create an instance of {@link NONMEMdataSetReference }
     * 
     */
    public NONMEMdataSetReference createNONMEMdataSetReferenceType() {
        return new NONMEMdataSetReference();
    }



    /**
     * Create an instance of {@link DatasetMapping }
     * 
	 * @since PharmML0.3
     */
    public DatasetMapping createDatasetMappingType() {
        return new DatasetMapping();
    }

    /**
     * Create an instance of {@link StepType }
     * 
	 * @since PharmML0.3
     */
    public StepType createStepType() {
        return new StepType();
    }

    /**
     * Create an instance of {@link GenericCode }
     * 
	 * @since PharmML0.3
     */
    public GenericCode createGenericCodeType() {
        return new GenericCode();
    }

    /**
     * Create an instance of {@link SymbolMapping }
     * 
	 * @since PharmML0.3
     */
    public SymbolMapping createSymbolMappingType() {
        return new SymbolMapping();
    }

    /**
     * Create an instance of {@link ToEstimate }
     * 
	 * @since PharmML0.3
     */
    public ToEstimate createToEstimateType() {
        return new ToEstimate();
    }

    /**
     * Create an instance of {@link EstimationOperation }
     * 
     */
    public EstimationOperation createEstimationOperationType() {
        return new EstimationOperation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Simulation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "SimulationStep", substitutionHeadNamespace = XMLFilter.NS_DEFAULT_MSTEPS, substitutionHeadName = "CommonModellingStep")
    public JAXBElement<Simulation> createSimulationStep(Simulation value) {
        return new JAXBElement<Simulation>(_SimulationStep_QNAME, Simulation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "Property")
    public JAXBElement<OperationProperty> createProperty(OperationProperty value) {
        return new JAXBElement<OperationProperty>(_Property_QNAME, OperationProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModellingStepType }{@code >}}
     * 
     */
	@XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "CommonModellingStep")
    public JAXBElement<CommonModellingStep> createCommonModellingStep(CommonModellingStep value) {
        return new JAXBElement<CommonModellingStep>(_CommonModellingStep_QNAME, CommonModellingStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModellingSteps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "ModellingSteps")
    public JAXBElement<ModellingSteps> createModellingSteps(ModellingSteps value) {
        return new JAXBElement<ModellingSteps>(_ModellingSteps_QNAME, ModellingSteps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "VariableMapping", substitutionHeadNamespace = XMLFilter.NS_DEFAULT_MSTEPS, substitutionHeadName = "Mapping")
    @Deprecated
    public JAXBElement<VariableMapping> createVariableMapping(VariableMapping value) {
        return new JAXBElement<VariableMapping>(_VariableMapping_QNAME, VariableMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "IndividualMapping", substitutionHeadNamespace = XMLFilter.NS_DEFAULT_MSTEPS, substitutionHeadName = "Mapping")
    @Deprecated
    public JAXBElement<IndividualMapping> createIndividualMapping(IndividualMapping value) {
        return new JAXBElement<IndividualMapping>(_IndividualMapping_QNAME, IndividualMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimationOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "Operation")
	@Deprecated
    public JAXBElement<EstimationOperation> createOperation(EstimationOperation value) {
        return new JAXBElement<EstimationOperation>(_Operation_QNAME, EstimationOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estimation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "EstimationStep", substitutionHeadNamespace = XMLFilter.NS_DEFAULT_MSTEPS, substitutionHeadName = "CommonModellingStep")
    public JAXBElement<Estimation> createEstimationStep(Estimation value) {
        return new JAXBElement<Estimation>(_EstimationStep_QNAME, Estimation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Timepoints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "Timepoints")
    public JAXBElement<Timepoints> createTimepoints(Timepoints value) {
        return new JAXBElement<Timepoints>(_Timepoints_QNAME, Timepoints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = XMLFilter.NS_DEFAULT_MSTEPS, name = "Mapping")
    @Deprecated
    public JAXBElement<MappingType> createMapping(MappingType value) {
        return new JAXBElement<MappingType>(_Mapping_QNAME, MappingType.class, null, value);
    }

}
