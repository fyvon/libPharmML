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
package eu.ddmore.libpharmml.dom.trialdesign;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.LevelReference;
import eu.ddmore.libpharmml.dom.commontypes.Name;
import eu.ddmore.libpharmml.dom.modeldefn.DesignParameter;
import eu.ddmore.libpharmml.impl.XMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type combining the individual and explicit samplings.
 * 
 * <p>Java class for ObservationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}DesignParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/TrialDesign}LookupTable" maxOccurs="unbounded"/>
 *           &lt;element name="IndividualObservations" type="{http://www.pharmml.org/pharmml/0.7/TrialDesign}DatasetMappingType" maxOccurs="unbounded"/>
 *           &lt;element name="Observation" type="{http://www.pharmml.org/pharmml/0.7/TrialDesign}ObservationType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="ObservationsCombination" type="{http://www.pharmml.org/pharmml/0.7/TrialDesign}ObservationsCombinationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("deprecation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationsType", propOrder = {
		"name",
	    "variabilityReference",
	    "observationGroup",
    "listOfDesignParameter",
    "listOfLookupTable",
    "listOfIndividualObservations",
    "listOfObservation",
    "listOfObservationsCombination"
})
public class Observations
    extends StudyEvent
{
	
	// Before PharmML 0.7
	@XmlElement(name = "Name", namespace = XMLFilter.NS_DEFAULT_CT)
	@Deprecated
    protected Name name;
    @XmlElement(name = "VariabilityReference", namespace = XMLFilter.NS_DEFAULT_CT)
    @Deprecated
    protected LevelReference variabilityReference;
    @XmlElement(name = "ObservationGroup", required = true)
    @Deprecated
    protected List<ObservationsGroup> observationGroup;


    @XmlElement(name = "DesignParameter", namespace = XMLFilter.NS_DEFAULT_MDEF)
    protected List<DesignParameter> listOfDesignParameter;
    @XmlElement(name = "LookupTable")
    protected List<LookupTable> listOfLookupTable;
    @XmlElement(name = "IndividualObservations")
    protected List<DatasetMapping> listOfIndividualObservations;
    @XmlElement(name = "Observation")
    protected List<Observation> listOfObservation;
    @XmlElement(name = "ObservationsCombination")
    protected List<ObservationsCombination> listOfObservationsCombination;

    /**
     * A parameter definition.Gets the value of the designParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfDesignParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignParameter }
     * 
     * 
     */
    public List<DesignParameter> getListOfDesignParameter() {
        if (listOfDesignParameter == null) {
        	listOfDesignParameter = new ArrayList<DesignParameter>();
        }
        return this.listOfDesignParameter;
    }

    /**
     * Gets the value of the lookupTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfLookupTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LookupTable }
     * 
     * 
     */
    public List<LookupTable> getListOfLookupTable() {
        if (listOfLookupTable == null) {
        	listOfLookupTable = new ArrayList<LookupTable>();
        }
        return this.listOfLookupTable;
    }

    /**
     * Gets the value of the individualObservations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualObservations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfIndividualObservations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetMapping }
     * 
     * 
     */
    public List<DatasetMapping> getListOfIndividualObservations() {
        if (listOfIndividualObservations == null) {
        	listOfIndividualObservations = new ArrayList<DatasetMapping>();
        }
        return this.listOfIndividualObservations;
    }

    /**
     * Gets the value of the observation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Observation }
     * 
     * 
     */
    public List<Observation> getListOfObservation() {
        if (listOfObservation == null) {
        	listOfObservation = new ArrayList<Observation>();
        }
        return this.listOfObservation;
    }

    /**
     * Gets the value of the observationsCombination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationsCombination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfObservationsCombination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationsCombination }
     * 
     * 
     */
    public List<ObservationsCombination> getListOfObservationsCombination() {
        if (listOfObservationsCombination == null) {
        	listOfObservationsCombination = new ArrayList<ObservationsCombination>();
        }
        return this.listOfObservationsCombination;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(name)
    			.addIfNotNull(variabilityReference)
    			.addIfNotNull(observationGroup)
    			.addIfNotNull(listOfDesignParameter)
    			.addIfNotNull(listOfLookupTable)
    			.addIfNotNull(listOfIndividualObservations)
    			.addIfNotNull(listOfObservation)
    			.addIfNotNull(listOfObservationsCombination);
    }
    
    /**
     * 
     *                                 A descriptive name for this set of observations.
     *                             
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     * @deprecated PharmML 0.7, trial design strucure has been deeply changed. See PharmML-0.7
     * changelog for more details.
     */
    @Deprecated
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     * @deprecated PharmML 0.7, trial design strucure has been deeply changed. See PharmML-0.7
     * changelog for more details.
     */
    @Deprecated
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * 
     *                                 Refers to the variability level that describes the random variability associated with
     *                                 these observations. Typically this is used to describe Random Inter-Occasion Variability. 
     *                             
     * 
     * @return
     *     possible object is
     *     {@link LevelReference }
     * 
     * @deprecated PharmML 0.7, trial design strucure has been deeply changed. See PharmML-0.7
     * changelog for more details.
     */
    @Deprecated
    public LevelReference getVariabilityReference() {
        return variabilityReference;
    }

    /**
     * Sets the value of the variabilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelReference }
     *     
     * @deprecated PharmML 0.7, trial design strucure has been deeply changed. See PharmML-0.7
     * changelog for more details.    
     */
    @Deprecated
    public void setVariabilityReference(LevelReference value) {
        this.variabilityReference = value;
    }

    /**
     * Gets the value of the observationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationsGroup }
     * 
     * @deprecated PharmML 0.7, trial design strucure has been deeply changed. See PharmML-0.7
     * changelog for more details.
     */
    @Deprecated
    public List<ObservationsGroup> getObservationGroup() {
        if (observationGroup == null) {
            observationGroup = new ArrayList<ObservationsGroup>();
        }
        return this.observationGroup;
    }

}
