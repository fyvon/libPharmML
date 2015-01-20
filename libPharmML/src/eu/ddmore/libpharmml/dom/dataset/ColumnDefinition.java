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


package eu.ddmore.libpharmml.dom.dataset;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.SymbolType;


/**
 * <p>Java class for ColumnDefnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnDefnType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/08/Dataset}CommonColumnDefnType">
 *       &lt;attribute name="columnId" use="required" type="{http://www.pharmml.org/2013/03/CommonTypes}SymbolIdType" />
 *       &lt;attribute name="columnType" use="required" type="{http://www.pharmml.org/2013/08/Dataset}ColumnTypeType" />
 *       &lt;attribute name="valueType" use="required" type="{http://www.pharmml.org/2013/08/Dataset}ColumnValueTypeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnDefnType")
public class ColumnDefinition
    extends CommonColumnDefnType
{

    @XmlAttribute(name = "columnId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String columnId;
    @XmlAttribute(name = "columnType", required = true)
    protected ColumnType columnType;
    @XmlAttribute(name = "valueType", required = true)
    protected SymbolType valueType;
    
    /**
     * Empty constructor
     */
    public ColumnDefinition(){}

    /**
     * Creates a new column definition with all the required attributes.
     * @param columnId Identifier of the column.
     * @param columnType Type of the column.
     * @param valueType Type of the values within this column. The scalar elements within
     * this column must fit with this value type.
     * @param columnNum The column number. Needed to map the column into the dataset.
     */
    public ColumnDefinition(String columnId, ColumnType columnType, SymbolType valueType, Integer columnNum){
    	this.columnId = columnId;
    	this.columnType = columnType;
    	this.valueType = valueType;
    	this.columnNum = BigInteger.valueOf(columnNum);
    }
    
    /**
     * Gets the value of the columnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * Sets the value of the columnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnId(String value) {
        this.columnId = value;
    }

    /**
     * Gets the value of the columnType property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnType }
     *     
     */
    public ColumnType getColumnType() {
        return columnType;
    }

    /**
     * Sets the value of the columnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnType }
     *     
     */
    public void setColumnType(ColumnType value) {
        this.columnType = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolType }
     *     
     */
    public SymbolType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolType }
     *     
     */
    public void setValueType(SymbolType value) {
        this.valueType = value;
    }

}
