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
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.IValidationError;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.SymbolTypeType;
import eu.ddmore.libpharmml.impl.ValidationErrorImpl;
import eu.ddmore.libpharmml.validation.Validatable;


/**
 * 
 *                 The type specifying the dataset. The dataset is decribed in more detail in the Language Overview section of the specification.
 *             
 * 
 * <p>Java class for DataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}Definition"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}ImportData"/>
 *           &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}Table"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetType", propOrder = {
    "definition",
    "importData",
    "table"
})
public class DataSetType
    extends PharmMLRootType implements Validatable
{

    @XmlElement(name = "Definition", required = true)
    protected ColumnsDefinitionType definition;
    @XmlElement(name = "ImportData")
    protected ImportDataType importData;
    @XmlElement(name = "Table")
    protected DataSetTableType table;

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
     * 
     *                                     Import datafile
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link ImportDataType }
     *     
     */
    public ImportDataType getImportData() {
        return importData;
    }

    /**
     * Sets the value of the importData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDataType }
     *     
     */
    public void setImportData(ImportDataType value) {
        this.importData = value;
    }

    /**
     * 
     *                                     Defines a data table.
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link DataSetTableType }
     *     
     */
    public DataSetTableType getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetTableType }
     *     
     */
    public void setTable(DataSetTableType value) {
        this.table = value;
    }

	@Override
	public List<IValidationError> validate() {
		List<IValidationError> errors = new ArrayList<IValidationError>();
		
		boolean DS1 = false;
		boolean DS2 = false;
//		boolean DS6 = false; added for each cell
		boolean DS8 = false;
		
		// DS1 & DS2
		ColumnsDefinitionType colDef = getDefinition();
		if(colDef != null){
			List<ColumnDefnType> columns = colDef.getColumn();
			if(columns != null && columns.size() > 0){
				for(int i=0;i<columns.size();i++){
					ColumnDefnType column = columns.get(i);
					if(i == 0){
						if(!column.getColumnNum().equals(BigInteger.valueOf(1))){
							DS2 = true;
						}
					} else {
						BigInteger previousNum = columns.get(i-1).getColumnNum();
						if(previousNum != null && !column.getColumnNum().equals(previousNum.add(BigInteger.valueOf(1)))){
							DS2 = true;
						}
						if(previousNum != null && (column.getColumnNum().compareTo(previousNum) == -1)){
							DS1 = true;
						}
					}
				}
			}
		}
		
		// DS6 cell.type = column.type
		// DS8 row.size() = columns.size()
		int colNum = colDef.getColumn().size();
		if(getTable() != null && getTable().getRow() != null){
			for(DatasetRowType row : getTable().getRow()){
				if(row.size() != colNum){
					DS8 = true;
				}
				for(int i=0;i<colNum;i++){
					try{
						JAXBElement<?> cell = row.getScalar().get(i);
						SymbolTypeType columnDataType = colDef.getColumn().get(i).getValueType();
						if(!cell.getDeclaredType().equals(columnDataType.getDataType())){
//							DS6 = true;
							errors.add(new ValidationErrorImpl("DS6",
									"Cell value "+cell.getValue()+" ("+cell.getDeclaredType()+
									") is not type compatible with the column definition ("+
											columnDataType.value()+")", this));
						}
					} catch (IndexOutOfBoundsException e) {
						DS8 = true;
						break;
					}
				}
			}
		}
		
		if(DS1){
			errors.add(new ValidationErrorImpl("DS1",
					"Columns must be ordered. The order is specified by the columnNum attribute.",
					this));
		}
		if(DS2){
			errors.add(new ValidationErrorImpl("DS2",
					"Columns must be numbered sequentially from 1, with no gaps in the sequence.",
					this));
		}
//		if(DS6){
//			errors.add(new ValidationErrorImpl("DS6",
//					"Each cell must contain a value that is type compatible with the column definition.",
//					this));
//		}
		if(DS8){
			errors.add(new ValidationErrorImpl("DS8",
					"Each row must define a cell for each column.",
					this));
		}
		
		return errors;
	}

}
