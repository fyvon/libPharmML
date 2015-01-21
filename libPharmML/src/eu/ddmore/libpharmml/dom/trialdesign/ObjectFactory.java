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


package eu.ddmore.libpharmml.dom.trialdesign;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import eu.ddmore.libpharmml.dom.commontypes.IntValue;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.ddmore.libpharmml.dom.trialdesign package. 
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

    private final static QName _Order_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "Order");
    @Deprecated
	private final static QName _AttributeMapping_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "AttributeMapping");
    private final static QName _TrialDesign_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "TrialDesign");
    @Deprecated
	private final static QName _ArmMapping_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "ArmMapping");
    @Deprecated
	private final static QName _DemographicMapping_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "DemographicMapping");
    @Deprecated
	private final static QName _ReplicateMapping_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "ReplicateMapping");
    private final static QName _DosingRegimen_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "DosingRegimen");
    private final static QName _StudyEvent_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "StudyEvent");
    private final static QName _Bolus_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "Bolus");
    private final static QName _Washout_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "Washout");
    private final static QName _Infusion_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "Infusion");
	@Deprecated
    private final static QName _IndividualMapping_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "IndividualMapping");
	@Deprecated
    private final static QName _CovariateMapping_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "CovariateMapping");
    private final static QName _ObservationsEvent_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "ObservationsEvent");
    private final static QName _LookupTable_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "LookupTable");
    private final static QName _Activity_QNAME = new QName("http://www.pharmml.org/2013/03/TrialDesign", "Activity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ddmore.libpharmml.dom.trialdesign
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InfusionType }
     * 
     */
    public InfusionType createInfusionType() {
        return new InfusionType();
    }

    /**
     * Create an instance of {@link TrialDesignType }
     * 
     */
    public TrialDesignType createTrialDesignType() {
        return new TrialDesignType();
    }

    /**
     * Create an instance of {@link LookupTableType }
     * 
     */
    public LookupTableType createLookupTableType() {
        return new LookupTableType();
    }

    /**
     * Create an instance of {@link DemographicMapping }
     * 
     */
	@Deprecated
    public DemographicMapping createDemographicMappingType() {
        return new DemographicMapping();
    }

    /**
     * Create an instance of {@link ReplicateMappingType }
     * 
     */
	@Deprecated
    public ReplicateMappingType createReplicateMappingType() {
        return new ReplicateMappingType();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivityType() {
        return new Activity();
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
     * Create an instance of {@link ArmMapping }
     * 
     */
	@Deprecated
    public ArmMapping createArmMappingType() {
        return new ArmMapping();
    }

    /**
     * Create an instance of {@link WashoutType }
     * 
     */
    public WashoutType createWashoutType() {
        return new WashoutType();
    }

    /**
     * Create an instance of {@link Bolus }
     * 
     */
    public Bolus createBolusType() {
        return new Bolus();
    }

    /**
     * Create an instance of {@link ObservationsType }
     * 
     */
    public ObservationsType createObservationsType() {
        return new ObservationsType();
    }
	
	/**
     * Create an instance of {@link CovariateMapping }
     * 
     */
	@Deprecated
    public CovariateMapping createCovariateMappingType() {
        return new CovariateMapping();
    }

    /**
     * Create an instance of {@link TrialStructureType }
     * 
     */
    public TrialStructureType createTrialStructureType() {
        return new TrialStructureType();
    }

    /**
     * Create an instance of {@link DosingVariable }
     * 
     */
    public DosingVariable createDosingVariableType() {
        return new DosingVariable();
    }

    /**
     * Create an instance of {@link TreatmentType }
     * 
     */
	@Deprecated
    public TreatmentType createTreatmentType() {
        return new TreatmentType();
    }

    /**
     * Create an instance of {@link SteadyStateParameterType }
     * 
     */
    public SteadyStateParameterType createSteadyStateParameterType() {
        return new SteadyStateParameterType();
    }

    /**
     * Create an instance of {@link StudyPeriodType }
     * 
     */
    public StudyPeriodType createStudyPeriodType() {
        return new StudyPeriodType();
    }

    /**
     * Create an instance of {@link ArmDefinition }
     * 
     */
    public ArmDefinition createArmDefnType() {
        return new ArmDefinition();
    }

    /**
     * Create an instance of {@link PopulationType }
     * 
     */
    public PopulationType createPopulationType() {
        return new PopulationType();
    }

    /**
     * Create an instance of {@link IndividualDefinition }
     * 
     */
	@Deprecated
    public IndividualDefinition createIndividualDefinitionType() {
        return new IndividualDefinition();
    }

    /**
     * Create an instance of {@link SteadyStateType }
     * 
     */
    public SteadyStateType createSteadyStateType() {
        return new SteadyStateType();
    }

    /**
     * Create an instance of {@link StudyTimePointType }
     * 
     */
    public StudyTimePointType createStudyTimePointType() {
        return new StudyTimePointType();
    }

    /**
     * Create an instance of {@link IndividualDosing }
     * 
     */
    public IndividualDosing createIndividualDosingType() {
        return new IndividualDosing();
    }

    /**
     * Create an instance of {@link CellDefinition }
     * 
     */
    public CellDefinition createCellDefnType() {
        return new CellDefinition();
    }

    /**
     * Create an instance of {@link SegmentDefnType }
     * 
     */
    public SegmentDefnType createSegmentDefnType() {
        return new SegmentDefnType();
    }

    /**
     * Create an instance of {@link ObservationsGroupType }
     * 
     */
    public ObservationsGroupType createObservationsGroupType() {
        return new ObservationsGroupType();
    }

    /**
     * Create an instance of {@link IndependentVariableMapping }
     * 
     */
    @Deprecated
    public IndependentVariableMapping createIndependentVariableMappingType() {
        return new IndependentVariableMapping();
    }

    /**
     * Create an instance of {@link DemographicType }
     * 
     */
    public DemographicType createDemographicType() {
        return new DemographicType();
    }

    /**
     * Create an instance of {@link TargetType }
     * 
     */
    public TargetType createTargetMappingType() {
        return new TargetType();
    }

    /**
     * Create an instance of {@link EpochDefinition }
     * 
     */
    public EpochDefinition createEpochDefnType() {
        return new EpochDefinition();
    }

    /**
     * Create an instance of {@link EpochMapping }
     * 
     */
	@Deprecated
    public EpochMapping createEpochMappingType() {
        return new EpochMapping();
    }

    /**
     * Create an instance of {@link DosingTimesPoints }
     * 
     */
    public DosingTimesPoints createDosingTimesPointsType() {
        return new DosingTimesPoints();
    }

    /**
     * Create an instance of {@link IndependentVariableDependentMapping }
     * 
     */
	@Deprecated
    public IndependentVariableDependentMapping createIndependentVariableDependentMappingType() {
        return new IndependentVariableDependentMapping();
    }

    /**
     * Create an instance of {@link InfusionType.DoseAmount }
     * 
     */
    public InfusionType.DoseAmount createInfusionTypeDoseAmount() {
        return new InfusionType.DoseAmount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "Order")
    public JAXBElement<IntValue> createOrder(IntValue value) {
        return new JAXBElement<IntValue>(_Order_QNAME, IntValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
	@Deprecated
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "AttributeMapping")
    public JAXBElement<Object> createAttributeMapping(Object value) {
        return new JAXBElement<Object>(_AttributeMapping_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrialDesignType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "TrialDesign")
    public JAXBElement<TrialDesignType> createTrialDesign(TrialDesignType value) {
        return new JAXBElement<TrialDesignType>(_TrialDesign_QNAME, TrialDesignType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArmMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "ArmMapping")
    @Deprecated
	public JAXBElement<ArmMapping> createArmMapping(ArmMapping value) {
        return new JAXBElement<ArmMapping>(_ArmMapping_QNAME, ArmMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemographicMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "DemographicMapping", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/TrialDesign", substitutionHeadName = "AttributeMapping")
    @Deprecated
	public JAXBElement<DemographicMapping> createDemographicMapping(DemographicMapping value) {
        return new JAXBElement<DemographicMapping>(_DemographicMapping_QNAME, DemographicMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplicateMappingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "ReplicateMapping")
    @Deprecated
	public JAXBElement<ReplicateMappingType> createReplicateMapping(ReplicateMappingType value) {
        return new JAXBElement<ReplicateMappingType>(_ReplicateMapping_QNAME, ReplicateMappingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DosingRegimen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "DosingRegimen")
    public JAXBElement<DosingRegimen> createDosingRegimen(DosingRegimen value) {
        return new JAXBElement<DosingRegimen>(_DosingRegimen_QNAME, DosingRegimen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudyEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "StudyEvent")
    public JAXBElement<StudyEventType> createStudyEvent(StudyEventType value) {
        return new JAXBElement<StudyEventType>(_StudyEvent_QNAME, StudyEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bolus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "Bolus", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/TrialDesign", substitutionHeadName = "DosingRegimen")
    public JAXBElement<Bolus> createBolus(Bolus value) {
        return new JAXBElement<Bolus>(_Bolus_QNAME, Bolus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WashoutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "Washout")
    public JAXBElement<WashoutType> createWashout(WashoutType value) {
        return new JAXBElement<WashoutType>(_Washout_QNAME, WashoutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfusionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "Infusion", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/TrialDesign", substitutionHeadName = "DosingRegimen")
    public JAXBElement<InfusionType> createInfusion(InfusionType value) {
        return new JAXBElement<InfusionType>(_Infusion_QNAME, InfusionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "IndividualMapping")
    @Deprecated
	public JAXBElement<IndividualMapping> createIndividualMapping(IndividualMapping value) {
        return new JAXBElement<IndividualMapping>(_IndividualMapping_QNAME, IndividualMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CovariateMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "ObservationsEvent", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/TrialDesign", substitutionHeadName = "StudyEvent")
    public JAXBElement<ObservationsType> createObservationsEvent(ObservationsType value) {
        return new JAXBElement<ObservationsType>(_ObservationsEvent_QNAME, ObservationsType.class, null, value);
    }
	
	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link CovariateMapping }{@code >}}
     * 
     */
	@Deprecated
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "CovariateMapping", substitutionHeadNamespace = "http://www.pharmml.org/2013/03/TrialDesign", substitutionHeadName = "AttributeMapping")
    public JAXBElement<CovariateMapping> createCovariateMapping(CovariateMapping value) {
        return new JAXBElement<CovariateMapping>(_CovariateMapping_QNAME, CovariateMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupTableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "LookupTable")
    public JAXBElement<LookupTableType> createLookupTable(LookupTableType value) {
        return new JAXBElement<LookupTableType>(_LookupTable_QNAME, LookupTableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pharmml.org/2013/03/TrialDesign", name = "Activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

}
