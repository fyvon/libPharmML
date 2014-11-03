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
package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Marshaller.Listener;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.impl.MarshalListener;
import eu.ddmore.libpharmml.impl.PharmMLVersion;

/**
 * 
 * VectorCell class for specifying a single value within a type-B {@link Vector}.
 * 
 * <b>Important</b>:
 * The index of the cell, accessible through {@link #getIndex()}
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VectorCellType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="CellIndex" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Scalar"/>
 *           &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
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
@XmlRootElement
@XmlType(propOrder = {
	    "cellIndex",
	    "vectorIndex",
	    "value"
	})
public class VectorCell extends PharmMLRootType implements ScalarContainer {
	
	// Mapped attributes
	
	@XmlElement(name = "CellIndex", required = true)
	protected MatrixVectorIndex cellIndex;
	@XmlElement(name = "VectorIndex")
	// not used since PharmML 0.4.1. Replaced by cellIndex.
	protected MatrixVectorIndex vectorIndex;
	
	@XmlTransient
	// Attribute used for index in software side. Will be copied to either cellIndex or
	// vectorIndex according to the document written version. See beforeMarshal and afterUnmarshal
	// in this class.
	protected MatrixVectorIndex index;
	
	@XmlElementRef(name = "VectorCellValue", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class)
	protected VectorCellValue value;
		
	// -----------------
	
	/**
	 * Empty constructor
	 */
	public VectorCell(){}
	
	/**
	 * Constructs a vector cell at the specified index and with the given value.
	 * @param index Index of the cell within the parent vector.
	 * @param value Value of the cell as a symbol reference.
	 */
	public VectorCell(MatrixVectorIndex index, SymbolRefType value){
		this.index = index;
		this.value = value;
	}
	
	/**
	 * Constructs a vector cell at the specified index and with the given value.
	 * @param index Index of the cell within the parent vector.
	 * @param value Value of the cell as a scalar.
	 */
	public VectorCell(MatrixVectorIndex index, Scalar value){
		this.index = index;
		this.value = value;
	}
	
	/**
	 * Set the value of the index of the cell within the parent vector.
	 * @param index A {@link MatrixVectorIndex} object.
	 */
	public void setVectorIndex(MatrixVectorIndex index){
		this.index = index;
	}
	
	/**
	 * @deprecated Use {@link #getIndex()} instead.
	 * 
	 * Gets the index of the cell within the vector.
	 * @return The index as a {@link MatrixVectorIndex} object.
	 */
	@Deprecated
	public MatrixVectorIndex getVectorIndex(){
		return getIndex();
	}
	
	/**
	 * Gets the index of the cell within the vector.
	 * @return The index as a {@link MatrixVectorIndex} object.
	 */
	public MatrixVectorIndex getIndex(){
		return this.index;
	}
	
	/**
	 * Gets the value of the cell.
	 * Possible types are {@link Scalar} and {@link SymbolRefType}.
	 * @return The value of the cell.
	 */
	public VectorCellValue getValue(){
		return value;
	}
	
	public void setValue(SymbolRefType value){
		this.value = value;
	}
	
	public void setValue(Scalar value){
		this.value = value;
	}
	
	public MatrixVectorIndex createIndex(SymbolRefType index){
		this.index = new MatrixVectorIndex(index);
		return this.index;
	}
	
	public MatrixVectorIndex createIndex(int index){
		this.index = new MatrixVectorIndex(index);
		return this.index;
	}

	public SymbolRefType createSymbolRef(String symbId){
		SymbolRefType symb = new SymbolRefType();
		symb.setSymbIdRef(symbId);
		setValue(symb);
		return symb;
	}
	
	public SymbolRefType createSymbolRef(String symbId, String blkId){
		SymbolRefType symb = createSymbolRef(symbId);
		symb.setBlkIdRef(blkId);
		return symb;
	}
	
	@Override
	public IntValue createIntValue(int value) {
		IntValue wValue = new IntValue(value);
		setValue(wValue);
		return wValue;
	}
	
	@Override
	public RealValue createRealValue(double value) {
		RealValue wValue = new RealValue(value);
		setValue(wValue);
		return wValue;
	}
	
	
	@Override
	public StringValue createStringValue(String value) {
		StringValue wValue = new StringValue(value);
		setValue(wValue);
		return wValue;
	}
	
	@Override
	public IdValue createIdValue(String value) {
		IdValue wValue = new IdValue(value);
		setValue(wValue);
		return wValue;
	}
	
	@Override
	public BooleanType createBooleanValue(boolean value) {
		BooleanType wValue;
		if(value){
			wValue = new TrueBooleanType();
		} else {
			wValue = new FalseBooleanType();
		}
		setValue(wValue);
		return wValue;
	}
	
	/**
	 * Method used to deal with the name change of the element "cellIndex". This child element
	 * was formerly "vectorIndex" in PharmML 0.4. This element will therefore be marshalled
	 * as "VectorIndex" for PharmML 0.4 documents, otherwise it will be marshalled as
	 * "CellIndex".
	 * @param marshaller
	 */
	void beforeMarshal(Marshaller marshaller){
		Listener listener = marshaller.getListener();
		if(listener instanceof MarshalListener){
			PharmMLVersion version = ((MarshalListener) listener).getMarshalVersion();
			if(version.isEqualOrLaterThan(PharmMLVersion.V0_4_1)){
				this.vectorIndex = null;
				this.cellIndex = this.index;
			} else {
				this.vectorIndex = this.index;
				this.cellIndex = null;
			}
		}
	}

	/**
	 * See {@link #beforeMarshal(Marshaller)} documentation.
	 */
	void afterUnmarshal(Unmarshaller u, Object parent) {
		  if(cellIndex != null){
			  index = cellIndex;
		  } else if (vectorIndex != null){
			  index = vectorIndex;
		  }
	}

}
