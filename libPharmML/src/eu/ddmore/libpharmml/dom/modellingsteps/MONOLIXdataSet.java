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

package eu.ddmore.libpharmml.dom.modellingsteps;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.ColumnMapping;
import eu.ddmore.libpharmml.dom.dataset.ColumnTransformation;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.dom.trialdesign.CodeInjection;
import eu.ddmore.libpharmml.dom.trialdesign.MultipleDVMapping;
import eu.ddmore.libpharmml.dom.trialdesign.ExternalDataSet;
import eu.ddmore.libpharmml.impl.XMLFilter;


/**
 * 
 *                 A type defining the MONOLIX type data and task settings.                
 *             
 * 
 * <p>Java class for MONOLIXdataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MONOLIXdataSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="ColumnMapping" type="{http://www.pharmml.org/2013/08/Dataset}ColumnMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ColumnTransformation" type="{http://www.pharmml.org/2013/08/Dataset}ColumnTransformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MultipleDVMapping" type="{http://www.pharmml.org/2013/03/ModellingSteps}MultipleDVMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}DataSet"/>
 *         &lt;element name="CodeInjection" type="{http://www.pharmml.org/2013/03/ModellingSteps}CodeInjectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/2013/03/CommonTypes}OidDefnGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated MONOLIX and NONMEM datasets are now regrouped into the {@link ExternalDataSet} class.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MONOLIXdataSetType", propOrder = {
    "listOfColumnMapping",
    "listOfColumnTransformation",
    "listOfMultipleDVMapping",
    "dataSet",
    "codeInjection"
})
@Deprecated
public class MONOLIXdataSet
    extends PharmMLRootType
{

    @XmlElement(name = "ColumnMapping")
    protected List<ColumnMapping> listOfColumnMapping;
    @XmlElement(name = "ColumnTransformation")
    protected List<ColumnTransformation> listOfColumnTransformation;
    @XmlElement(name = "MultipleDVMapping")
    protected List<MultipleDVMapping> listOfMultipleDVMapping;
    @XmlElement(name = "DataSet", namespace = XMLFilter.NS_DEFAULT_DS, required = true)
    protected DataSet dataSet;
    @XmlElement(name = "CodeInjection", namespace = XMLFilter.NS_DEFAULT_MSTEPS) // NS < PharmML0.7
    protected CodeInjection codeInjection;
    @XmlAttribute(name = "oid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    
    /**
     * Empty constructor.
     */
    public MONOLIXdataSet(){}
    
    /**
     * Constructs a new MONOLIX dataset with the given oid.
     * @param oid The oid as a {@link String}.
     */
    public MONOLIXdataSet(String oid){
    	this.oid = oid;
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
    public List<ColumnMapping> getListOfColumnMapping() {
        if (listOfColumnMapping == null) {
        	listOfColumnMapping = new ArrayList<ColumnMapping>();
        }
        return this.listOfColumnMapping;
    }

    /**
     * Gets the value of the columnTransformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnTransformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnTransformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnTransformation }
     * 
     * 
     */
    public List<ColumnTransformation> getListOfColumnTransformation() {
        if (listOfColumnTransformation == null) {
        	listOfColumnTransformation = new ArrayList<ColumnTransformation>();
        }
        return this.listOfColumnTransformation;
    }

    /**
     * Gets the value of the multipleDVMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multipleDVMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultipleDVMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultipleDVMapping }
     * 
     * 
     */
    public List<MultipleDVMapping> getListOfMultipleDVMapping() {
        if (listOfMultipleDVMapping == null) {
        	listOfMultipleDVMapping = new ArrayList<MultipleDVMapping>();
        }
        return this.listOfMultipleDVMapping;
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
    
    /**
     * Creates a new empty {@link ColumnMapping} ColumnMapping element, adds it to the current object and returns it.
     * @return The created {@link ColumnMapping} object.
     */
    public ColumnMapping createColumnMapping(){
            ColumnMapping el = new ColumnMapping();
            getListOfColumnMapping().add(el);
            return el;
    }

    /**
     * Creates a new empty {@link ColumnTransformation} ColumnTransformation element, adds it to the current object and returns it.
     * @return The created {@link ColumnTransformation} object.
     */
    public ColumnTransformation createColumnTransformation(){
            ColumnTransformation el = new ColumnTransformation();
            getListOfColumnTransformation().add(el);
            return el;
    }

    /**
     * Creates a new empty {@link MultipleDVMapping} MultipleDVMapping element, adds it to the current object and returns it.
     * @return The created {@link MultipleDVMapping} object.
     */
    public MultipleDVMapping createMultipleDVMapping(){
    		MultipleDVMapping el = new MultipleDVMapping();
            getListOfMultipleDVMapping().add(el);
            return el;
    }

    /**
     * Creates a new empty {@link DataSet} dataSet element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createDataSet(){
            DataSet el = new DataSet();
            this.dataSet = el;
            return el;
    }

    /**
     * Creates a new empty {@link CodeInjection} codeInjection element, adds it to the current object and returns it.
     * @return The created {@link CodeInjection} object.
     */
    public CodeInjection createCodeInjection(){
    		CodeInjection el = new CodeInjection();
            this.codeInjection = el;
            return el;
    }


}
