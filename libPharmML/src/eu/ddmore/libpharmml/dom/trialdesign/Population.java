/*******************************************************************************
 * Copyright (c) 2014-2016 European Molecular Biology Laboratory,
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


package eu.ddmore.libpharmml.dom.trialdesign;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.LevelReference;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.ColumnMapping;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.dom.dataset.DatasetMap;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 Type defining the population of subjects in the study.   
 *             
 * 
 * <p>Java class for PopulationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopulationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}VariabilityReference" minOccurs="0"/>
 *         &lt;element name="Demographic" type="{http://www.pharmml.org/2013/03/TrialDesign}DemographicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ColumnMapping" type="{http://www.pharmml.org/2013/08/Dataset}ColumnMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}DataSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated Since PharmML 0.7, {@link TrialDesign} structure has been completely redefined. See PharmML
 * 0.7 change document, chapter 5.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopulationType", propOrder = {
    "variabilityReference",
    "demographic",
    "columnMapping",
    "individualTemplate",
    "dataSet"
})
@Deprecated
public class Population
    extends PharmMLRootType implements DatasetMap
{

    @XmlElement(name = "VariabilityReference", namespace = NS_DEFAULT_CT)
    protected LevelReference variabilityReference;
    @XmlElement(name = "Demographic")
    protected List<Demographic> demographic;
    @XmlElement(name = "ColumnMapping")
    protected List<ColumnMapping> columnMapping;
    @XmlElement(name = "DataSet", namespace = NS_DEFAULT_DS, required = true)
    protected DataSet dataSet;
	@XmlElement(name = "IndividualTemplate")
	@Deprecated
    protected IndividualDefinition individualTemplate;

    /**
     * 
     *                                 Refers to the variability level that defines the random variability between
     *                                 the subjects of the study (BSV).
     *                             
     * 
     * @return
     *     possible object is
     *     {@link LevelReference }
     *     
     */
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
     */
    public void setVariabilityReference(LevelReference value) {
        this.variabilityReference = value;
    }

    /**
     * Gets the value of the demographic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demographic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemographic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Demographic }
     * 
     * 
     */
    public List<Demographic> getDemographic() {
        if (demographic == null) {
            demographic = new ArrayList<Demographic>();
        }
        return this.demographic;
    }

    /**
     * @deprecated Use {@link #getListOfColumnMapping()}.
     */
    @Deprecated
	public List<ColumnMapping> getColumnMapping() {
        return getListOfColumnMapping();
    }
	
	/**
     * Gets the value of the individualTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualDefinition }
     *     
     */
	 @Deprecated
    public IndividualDefinition getIndividualTemplate() {
        return individualTemplate;
    }

    /**
     * Sets the value of the individualTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualDefinition }
     *     
     */
	 @Deprecated
    public void setIndividualTemplate(IndividualDefinition value) {
        this.individualTemplate = value;
    }

    /**
     * 
     *                                 Instantiates the individual template defined above with data for each subject within
     *                                 the study.
     *                             
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    @Override
	public DataSet getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setDataSet(DataSet value) {
        this.dataSet = value;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(variabilityReference)
				.addIfNotNull(demographic)
				.addIfNotNull(columnMapping)
				.addIfNotNull(dataSet);
	}

	@Override
	public List<ColumnMapping> getListOfColumnMapping() {
		if (columnMapping == null) {
            columnMapping = new ArrayList<ColumnMapping>();
        }
        return this.columnMapping;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
