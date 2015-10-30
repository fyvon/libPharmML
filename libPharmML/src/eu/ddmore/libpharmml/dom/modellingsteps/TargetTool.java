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

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.ColumnMapping;
import eu.ddmore.libpharmml.dom.dataset.TargetToolDataSet;
import eu.ddmore.libpharmml.dom.tags.PharmMLObject;
import eu.ddmore.libpharmml.dom.trialdesign.CodeInjection;
import eu.ddmore.libpharmml.impl.PharmMLVersion;
import eu.ddmore.libpharmml.impl.XMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.util.annotations.HasElementRenamed;
import eu.ddmore.libpharmml.util.annotations.RenamedElement;


/**
 * 
 *                 A type defining the target tool type data and task settings.                
 *             
 * 
 * <p>Java class for TargetToolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetToolType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="TargetToolName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([a-zA-Z0-9])[a-zA-Z0-9\\_]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ColumnMapping" type="{http://www.pharmml.org/2013/08/Dataset}ColumnMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}TargetToolData"/>
 *         &lt;element name="CodeInjection" type="{http://www.pharmml.org/2013/03/ModellingSteps}CodeInjectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/2013/03/CommonTypes}OidDefnGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetToolType", propOrder = {
    "targetToolName",
    "columnMapping",
    "targetToolData",
    "msteps_codeInjection",
    "design_codeInjection"
})
@HasElementRenamed(mappedFields = { 
		@RenamedElement(field = "msteps_codeInjection"),
		@RenamedElement(field = "design_codeInjection", since = PharmMLVersion.V0_7_3)}, 
		transientField = "codeInjection")
public class TargetTool
    extends PharmMLRootType implements PharmMLObject
{

    @XmlElement(name = "TargetToolName", required = true)
    protected String targetToolName;
    @XmlElement(name = "ColumnMapping")
    protected List<ColumnMapping> columnMapping;
    @XmlElement(name = "TargetToolData", namespace = XMLFilter.NS_DEFAULT_DS)
    protected TargetToolDataSet targetToolData;
//    @XmlElement(name = "CodeInjection")
//    protected CodeInjection codeInjection;
    @XmlAttribute(name = "oid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    
    @XmlElement(name = "CodeInjection", namespace = XMLFilter.NS_DEFAULT_MSTEPS)
    protected CodeInjection msteps_codeInjection;
    @XmlElement(name = "CodeInjection", namespace = XMLFilter.NS_DEFAULT_TD)
    protected CodeInjection design_codeInjection;
    @XmlTransient
    protected CodeInjection codeInjection;

    /**
     * Gets the value of the targetToolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetToolName() {
        return targetToolName;
    }

    /**
     * Sets the value of the targetToolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetToolName(String value) {
        this.targetToolName = value;
    }

    /**
     * Gets the value of the columnMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnMapping }
     * 
     * 
     */
    public List<ColumnMapping> getColumnMapping() {
        if (columnMapping == null) {
            columnMapping = new ArrayList<ColumnMapping>();
        }
        return this.columnMapping;
    }

    /**
     * 
     *                                 Instantiates the individual template defined above with data for each subject within
     *                                 the study.
     *                             
     * 
     * @return
     *     possible object is
     *     {@link TargetToolDataSet }
     *     
     */
    public TargetToolDataSet getTargetToolData() {
        return targetToolData;
    }

    /**
     * Sets the value of the targetToolData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetToolDataSet }
     *     
     */
    public void setTargetToolData(TargetToolDataSet value) {
        this.targetToolData = value;
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
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(columnMapping)
				.addIfNotNull(targetToolData)
				.addIfNotNull(codeInjection);
	}

}
