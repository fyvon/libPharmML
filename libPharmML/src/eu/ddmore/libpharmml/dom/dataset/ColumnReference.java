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


package eu.ddmore.libpharmml.dom.dataset;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.maths.Operand;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * 
 *                 Type specified a reference to a column in a dataset.
 *             
 * 
 * <p>Java class for ColumnRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnRefType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}ColumnRef" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="columnIdRef" use="required" type="{http://www.pharmml.org/2013/03/CommonTypes}SymbolIdType" />
 *       &lt;attribute name="transformIdRef" type="{http://www.pharmml.org/2013/03/CommonTypes}SymbolIdType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnRefType", propOrder = {
    "columnRef"
})
public class ColumnReference
    extends PharmMLRootType implements Operand
{

    @XmlElement(name = "ColumnRef")
    protected ColumnReference columnRef;
    @XmlAttribute(name = "columnIdRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String columnIdRef;
    @XmlAttribute(name = "transformIdRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transformIdRef;
    
    /**
     * Empty constructor
     */
    public ColumnReference(){}
    
    /**
     * Creates a new reference to a given column.
     * @param columnIdRef The id of the referred column.
     */
    public ColumnReference(String columnIdRef){
    	this.columnIdRef = columnIdRef;
    }
    
    /**
     * Creates a new reference to a given column.
     * @param column The referred column.
     */
    public ColumnReference(ColumnDefinition column){
    	this(column.getColumnId());
    }

    /**
     * 
     *                                 Refers to a column in a table. 
     *                             
     * 
     * @return
     *     possible object is
     *     {@link ColumnReference }
     *     
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
     */
    public void setColumnRef(ColumnReference value) {
        this.columnRef = value;
    }

    /**
     * Gets the value of the columnIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnIdRef() {
        return columnIdRef;
    }

    /**
     * Sets the value of the columnIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnIdRef(String value) {
        this.columnIdRef = value;
    }

    /**
     * Gets the value of the transformIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     * @since PharmML 0.4.1
     */
    public String getTransformIdRef() {
        return transformIdRef;
    }

    /**
     * Sets the value of the transformIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @since PharmML 0.4.1
     */
    public void setTransformIdRef(String value) {
        this.transformIdRef = value;
    }

	@Override
	public JAXBElement<ColumnReference> toJAXBElement() {
		return MasterObjectFactory.DATASET_OF.createColumnRef(this);
	}

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(columnRef);
	}

}
