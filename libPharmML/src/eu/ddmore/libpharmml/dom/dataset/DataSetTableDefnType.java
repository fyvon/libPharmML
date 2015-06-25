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
// Generated on: 2014.03.24 at 10:08:07 AM GMT 
//


package eu.ddmore.libpharmml.dom.dataset;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 Type that specifies the definition of a nested table. 
 *             
 * 
 * <p>Java class for DataSetTableDefnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSetTableDefnType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/08/Dataset}CommonColumnDefnType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}Definition"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tableId" use="required" type="{http://www.pharmml.org/2013/03/CommonTypes}oidType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetTableDefnType", propOrder = {
    "definition"
})
@Deprecated
public class DataSetTableDefnType
    extends CommonColumnDefinition
{

    @XmlElement(name = "Definition", required = true)
    protected ColumnsDefinitionType definition;
    @XmlAttribute(name = "tableId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tableId;

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnsDefinitionType }
     *     
     */
    public ColumnsDefinitionType getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnsDefinitionType }
     *     
     */
    public void setDefinition(ColumnsDefinitionType value) {
        this.definition = value;
    }

    /**
     * Gets the value of the tableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * Sets the value of the tableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableId(String value) {
        this.tableId = value;
    }

}
