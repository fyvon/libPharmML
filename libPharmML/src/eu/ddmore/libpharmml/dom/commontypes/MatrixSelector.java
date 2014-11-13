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
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.maths.Operand;


/**
 * 
 *                 Type for matrix selector.
 *             
 * 
 * <p>Java class for MatrixSelectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixSelectorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *         &lt;choice>
 *           &lt;element name="Cell" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixCellSelectorType"/>
 *           &lt;element name="Block" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixBlockSelectorType"/>
 *           &lt;element name="Row" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *           &lt;element name="Column" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
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
@XmlType(name = "MatrixSelectorType", propOrder = {
    "symbRef",
    "cell",
    "block",
    "row",
    "column"
})
public class MatrixSelector
    extends PharmMLRootType implements Operand
{

    @XmlElement(name = "SymbRef", required = true)
    protected SymbolRefType symbRef;
    @XmlElement(name = "Cell")
    protected MatrixCellSelector cell;
    @XmlElement(name = "Block")
    protected MatrixBlockSelector block;
    @XmlElement(name = "Row")
    protected MatrixVectorIndex row;
    @XmlElement(name = "Column")
    protected MatrixVectorIndex column;
    
    /**
     * Empty constructor
     */
    public MatrixSelector(){}

    /**
     * Constructs a selector for the given matrix.
     * @param matrixRef A reference to the selected matrix
     */
    public MatrixSelector(SymbolRefType matrixRef){
    	this.symbRef = matrixRef;
    }
    
    /**
     * Gets the value of the symbRef property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolRefType }
     *     
     */
    public SymbolRefType getSymbRef() {
        return symbRef;
    }

    /**
     * Sets the value of the symbRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolRefType }
     *     
     */
    public void setSymbRef(SymbolRefType value) {
        this.symbRef = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixCellSelector }
     *     
     */
    public MatrixCellSelector getCell() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixCellSelector }
     *     
     */
    public void setCell(MatrixCellSelector value) {
        this.cell = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixBlockSelector }
     *     
     */
    public MatrixBlockSelector getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixBlockSelector }
     *     
     */
    public void setBlock(MatrixBlockSelector value) {
        this.block = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndexType }
     *     
     */
    public MatrixVectorIndex getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixVectorIndexType }
     *     
     */
    public void setRow(MatrixVectorIndex value) {
        this.row = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndexType }
     *     
     */
    public MatrixVectorIndex getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixVectorIndexType }
     *     
     */
    public void setColumn(MatrixVectorIndex value) {
        this.column = value;
    }
    
    /**
     * Creates a new empty {@link SymbolRefType} symbRef element, adds it to the current object and returns it.
     * @return The created {@link SymbolRefType} object.
     */
    public SymbolRefType createSymbRef(){
            SymbolRefType el = new SymbolRefType();
            this.symbRef = el;
            return el;
    }

    /**
     * Creates a new empty {@link MatrixCellSelector} cell element, adds it to the current object and returns it.
     * @return The created {@link MatrixCellSelector} object.
     */
    public MatrixCellSelector createCell(){
            MatrixCellSelector el = new MatrixCellSelector();
            this.cell = el;
            return el;
    }

    /**
     * Creates a new empty {@link MatrixBlockSelector} block element, adds it to the current object and returns it.
     * @return The created {@link MatrixBlockSelector} object.
     */
    public MatrixBlockSelector createBlock(){
            MatrixBlockSelector el = new MatrixBlockSelector();
            this.block = el;
            return el;
    }

    /**
     * Creates a new empty {@link MatrixVectorIndex} row element, adds it to the current object and returns it.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createRow(){
            MatrixVectorIndex el = new MatrixVectorIndex();
            this.row = el;
            return el;
    }

    /**
     * Creates a new empty {@link MatrixVectorIndex} column element, adds it to the current object and returns it.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createColumn(){
            MatrixVectorIndex el = new MatrixVectorIndex();
            this.column = el;
            return el;
    }

	@Override
	public JAXBElement<MatrixSelector> toJAXBElement() {
		return MasterObjectFactory.COMMONTYPES_OF.createMatrixSelector(this);
	}


}
