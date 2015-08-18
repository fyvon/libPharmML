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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.ToolName;
import eu.ddmore.libpharmml.dom.dataset.ColumnDefinition;
import eu.ddmore.libpharmml.dom.dataset.ColumnMapping;
import eu.ddmore.libpharmml.dom.dataset.ColumnReference;
import eu.ddmore.libpharmml.dom.dataset.ColumnTransformation;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.dom.dataset.DatasetMap;
import eu.ddmore.libpharmml.dom.modellingsteps.MSMultipleDVMapping;
import eu.ddmore.libpharmml.dom.tags.PharmMLObject;
import eu.ddmore.libpharmml.impl.PharmMLVersion;
import eu.ddmore.libpharmml.impl.XMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.util.SubList;
import eu.ddmore.libpharmml.util.annotations.HasElementRenamed;
import eu.ddmore.libpharmml.util.annotations.RenamedElement;


/**
 * 
 *                 A type defining the external type data and task settings.                
 *             
 * 
 * <p>Java class for ExternalDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalDataSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="ColumnMapping" type="{http://www.pharmml.org/pharmml/0.7/Dataset}ColumnMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ColumnTransformation" type="{http://www.pharmml.org/pharmml/0.7/Dataset}ColumnTransformationType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="MultipleDVMapping" type="{http://www.pharmml.org/pharmml/0.7/TrialDesign}MultipleDVMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Dataset}DataSet"/>
 *           &lt;element name="CodeInjection" type="{http://www.pharmml.org/pharmml/0.7/TrialDesign}CodeInjectionType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}OidDefnGroup"/>
 *       &lt;attribute name="toolName" use="required" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}ToolNameType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalDataSetType", propOrder = {
    "listOfColumnMappingOrColumnTransformationOrMultipleDVMapping",
    "dataSet",
    "msteps_codeInjection",
    "design_codeInjection"
})
@HasElementRenamed(mappedFields = { 
		@RenamedElement(field = "msteps_codeInjection"),
		@RenamedElement(field = "design_codeInjection", since = PharmMLVersion.V0_7)}, 
		transientField = "codeInjection")
public class ExternalDataSet
    extends PharmMLRootType implements DatasetMap, PharmMLObject
{

    @XmlElements({
        @XmlElement(name = "ColumnMapping", type = ColumnMapping.class),
        @XmlElement(name = "ColumnTransformation", type = ColumnTransformation.class),
        @XmlElement(name = "MultipleDVMapping", namespace = XMLFilter.NS_DEFAULT_MSTEPS, type = MSMultipleDVMapping.class),
        @XmlElement(name = "MultipleDVMapping", namespace = XMLFilter.NS_DEFAULT_TD, type = MultipleDVMapping.class)
    })
    protected List<PharmMLRootType> listOfColumnMappingOrColumnTransformationOrMultipleDVMapping;
    @XmlElement(name = "DataSet", namespace = XMLFilter.NS_DEFAULT_DS, required = true)
    protected DataSet dataSet;
    
    
    @XmlElement(name = "CodeInjection", namespace = XMLFilter.NS_DEFAULT_MSTEPS)
    protected CodeInjection msteps_codeInjection;
    @XmlElement(name = "CodeInjection", namespace = XMLFilter.NS_DEFAULT_TD)
    protected CodeInjection design_codeInjection;
    @XmlTransient
    protected CodeInjection codeInjection;
    
    
    @XmlAttribute(name = "toolName", required = true)
    protected ToolName toolName;
    @XmlAttribute(name = "oid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    
    /**
     * Empty constructor.
     */
    public ExternalDataSet(){}
    
    /**
     * Constructs an external dataset with the required attributes.
     * @param toolName The tool this dataset comes from.
     * @param oid Object id of this dataset for refering.
     */
    public ExternalDataSet(ToolName toolName, String oid){
    	this.toolName = toolName;
    	this.oid = oid;
    }

    /**
     * Gets the value of the columnMappingOrColumnTransformationOrMultipleDVMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnMappingOrColumnTransformationOrMultipleDVMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnMappingOrColumnTransformationOrMultipleDVMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnMapping }
     * {@link ColumnTransformation }
     * {@link MSMultipleDVMapping }
     * 
     * 
     */
    public List<PharmMLRootType> getListOfColumnMappingOrColumnTransformationOrMultipleDVMapping() {
        if (listOfColumnMappingOrColumnTransformationOrMultipleDVMapping == null) {
        	listOfColumnMappingOrColumnTransformationOrMultipleDVMapping = new ArrayList<PharmMLRootType>();
        }
        return this.listOfColumnMappingOrColumnTransformationOrMultipleDVMapping;
    }

    /**
     * 
     *                                     Data for each subject within the study.
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
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

    /**
     * Gets the value of the codeInjection property.
     * 
     * @return
     *     possible object is
     *     {@link CodeInjection }
     *     
     */
    public CodeInjection getCodeInjection() {
        return codeInjection;
    }

    /**
     * Sets the value of the codeInjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeInjection }
     *     
     */
    public void setCodeInjection(CodeInjection value) {
        this.codeInjection = value;
    }

    /**
     * Gets the value of the toolName property.
     * 
     * @return
     *     possible object is
     *     {@link ToolName }
     *     
     */
    public ToolName getToolName() {
        return toolName;
    }

    /**
     * Sets the value of the toolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolName }
     *     
     */
    public void setToolName(ToolName value) {
        this.toolName = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOid(String value) {
        this.oid = value;
    }
    
    public ColumnMapping createColumnMapping(String columnId){
    	ColumnMapping cm = new ColumnMapping();
    	cm.setColumnRef(new ColumnReference(columnId));
    	getListOfColumnMappingOrColumnTransformationOrMultipleDVMapping().add(cm);
    	return cm;
    }
    
    public ColumnMapping createColumnMapping(ColumnDefinition column){
    	ColumnMapping cm = new ColumnMapping();
    	cm.setColumnRef(new ColumnReference(column.getColumnId()));
    	getListOfColumnMappingOrColumnTransformationOrMultipleDVMapping().add(cm);
    	return cm;
    }
    
    public ColumnTransformation createColumnTransformation(){
    	ColumnTransformation ct = new ColumnTransformation();
    	getListOfColumnMappingOrColumnTransformationOrMultipleDVMapping().add(ct);
    	return ct;
    }
    
    public MSMultipleDVMapping createMultipleDVMapping(){
    	MSMultipleDVMapping dvm = new MSMultipleDVMapping();
    	getListOfColumnMappingOrColumnTransformationOrMultipleDVMapping().add(dvm);
    	return dvm;
    }
    
    public DataSet createDataSet(){
    	DataSet ds = new DataSet();
    	setDataSet(ds);
    	return ds;
    }
    
    public CodeInjection createCodeInjection(){
    	CodeInjection ci = new CodeInjection();
    	setCodeInjection(ci);
    	return ci;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(listOfColumnMappingOrColumnTransformationOrMultipleDVMapping)
				.addIfNotNull(dataSet)
				.addIfNotNull(codeInjection);
	}

	@Override
	public List<ColumnMapping> getListOfColumnMapping() {
		// TODO do something smarter here
		return new SubList<ColumnMapping>(getListOfColumnMappingOrColumnTransformationOrMultipleDVMapping(),
				ColumnMapping.class);
	}

}