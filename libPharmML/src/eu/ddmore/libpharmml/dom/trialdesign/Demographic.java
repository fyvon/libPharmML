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
package eu.ddmore.libpharmml.dom.trialdesign;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.BooleanValue;
import eu.ddmore.libpharmml.dom.commontypes.FalseBoolean;
import eu.ddmore.libpharmml.dom.commontypes.IdValue;
import eu.ddmore.libpharmml.dom.commontypes.IntValue;
import eu.ddmore.libpharmml.dom.commontypes.LevelReference;
import eu.ddmore.libpharmml.dom.commontypes.Name;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.commontypes.StringValue;
import eu.ddmore.libpharmml.dom.commontypes.TrueBoolean;
import eu.ddmore.libpharmml.dom.dataset.ColumnReference;
import eu.ddmore.libpharmml.dom.tags.PharmMLObject;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 The type defining a demographic attribute of the subject.
 *             
 * 
 * <p>Java class for DemographicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemographicType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}VariabilityReference"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Scalar" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}ColumnRef"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/2013/03/CommonTypes}OidDefnGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated Since PharmML 0.7, {@link TrialDesign} structure has been completely redefined. See PharmML
 * 0.7 change document, chapter 5.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemographicType", propOrder = {
    "name",
    "variabilityReference",
    "scalar",
    "columnRef"
})
@Deprecated
public class Demographic
    extends PharmMLRootType implements PharmMLObject
{

    @XmlElement(name = "Name", namespace = NS_DEFAULT_CT)
    protected Name name;
    @XmlElement(name = "VariabilityReference", namespace = NS_DEFAULT_CT, required = true)
    protected LevelReference variabilityReference;
    @XmlElementRef(name = "Scalar", namespace = NS_DEFAULT_CT, type = JAXBElement.class)
    protected List<JAXBElement<?>> scalar;
    @XmlElement(name = "ColumnRef", namespace = NS_DEFAULT_DS, required = true)
    protected ColumnReference columnRef;
    @XmlAttribute(name = "oid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
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
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * 
     *                                 Refers to the variability level that describes the random variability between
     *                                 subjects with different values of this demographic attribute. This is typically
     *                                 use to describe random variability between subjects belonging to different study
     *                                 centres or countries.
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
     * 
     *                                 A value of this demographic attribute.   
     *                             Gets the value of the scalar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scalar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScalar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IdValue }{@code >}
     * {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     * {@link JAXBElement }{@code <}{@link IntValue }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     * {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getScalar() {
        if (scalar == null) {
            scalar = new ArrayList<JAXBElement<?>>();
        }
        return this.scalar;
    }

    /**
     * 
     *                                 Refers to the column in the dataset that contains the information to be mapped 
     *                                 to the individual.
     *                             
     * 
     * @return
     *     possible object is
     *     {@link ColumnReference }
     *     
     * @since PharmML 0.3
     */
    public ColumnReference getColumnRef() {
        return columnRef;
    }

    /**
     * Sets the value of the columnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnReference }
     *     
     * @since PharmML 0.3
     */
    public void setColumnRef(ColumnReference value) {
        this.columnRef = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
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
    @Override
	public void setOid(String value) {
        this.oid = value;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	ChainedList<TreeNode> list = new ChainedList<TreeNode>()
    			.addIfNotNull(name)
    			.addIfNotNull(variabilityReference);
    	for(JAXBElement<?> el : getScalar()){
    		if(el.getValue() instanceof TreeNode){
    			list.add((TreeNode) el.getValue());
    		}
    	}
    	list.addIfNotNull(columnRef);
    	return list;
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
