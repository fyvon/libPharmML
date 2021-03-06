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
package eu.ddmore.libpharmml.dom.commontypes;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 This type specifies a matrix cell - with indexes.
 *             
 * 
 * <p>Java class for MatrixCellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixCellType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="CellRow" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *         &lt;element name="CellColumn" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
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
@XmlType(name = "MatrixCellType", propOrder = {
    "cellRow",
    "cellColumn",
    "value"
})
public class MatrixCell
    extends PharmMLRootType implements ScalarContainer
{

    @XmlElement(name = "CellRow", required = true)
    protected MatrixVectorIndex cellRow;
    @XmlElement(name = "CellColumn", required = true)
    protected MatrixVectorIndex cellColumn;
    @XmlElementRefs({
    		@XmlElementRef(name = "VectorCellValue", namespace = NS_DEFAULT_CT, type = JAXBElement.class),
    		@XmlElementRef(name = "Assign", namespace = NS_DEFAULT_CT, type = JAXBElement.class), // PharmML 0.7.1
    		@XmlElementRef(name = "Equation", namespace = NS_DEFAULT_MATH, type = JAXBElement.class)
    })
    protected MatrixCellValue value;
    
    /**
     * Empty constructor
     */
    public MatrixCell(){}
    
    /**
     * Constructs a matrix cell at the specified position within the matrix.
     * @param rowIndex The row index within the matrix
     * @param columnIndex The column index within the matrix
     */
    public MatrixCell(MatrixVectorIndex rowIndex, MatrixVectorIndex columnIndex){
    	this.cellRow = rowIndex;
    	this.cellColumn = columnIndex;
    }
    
    /**
     * Constructs a matrix cell at the specified position within the matrix, with the given value.
     * @param rowIndex The row index within the matrix
     * @param columnIndex The column index within the matrix
     * @param value The value of the cell
     */
    public MatrixCell(MatrixVectorIndex rowIndex, MatrixVectorIndex columnIndex, MatrixCellValue value){
    	this(rowIndex, columnIndex);
    	this.value = value;
    }

    /**
     * Gets the value of the cellRow property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public MatrixVectorIndex getCellRow() {
        return cellRow;
    }

    /**
     * Sets the value of the cellRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public void setCellRow(MatrixVectorIndex value) {
        this.cellRow = value;
    }

    /**
     * Gets the value of the cellColumn property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public MatrixVectorIndex getCellColumn() {
        return cellColumn;
    }

    /**
     * Sets the value of the cellColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public void setCellColumn(MatrixVectorIndex value) {
        this.cellColumn = value;
    }

    /**
     * Gets the value of the matrix cell.
     * 
     * <p>
     * Objects of the following type(s) are allowed:
     * {@link IntValue }
     * {@link StringValue }
     * {@link RealValue }
     * {@link TrueBoolean }
     * {@link SymbolRef }
     * {@link BooleanValue }
     * {@link IdValue }
     * {@link FalseBoolean }
     * 
     * 
     */
    public MatrixCellValue getValue() {
        return this.value;
    }
    
    /**
     * Sets the value of the matrix cell.
     * 
     * <p>
     * Objects of the following type(s) are allowed:
     * {@link IntValue }
     * {@link StringValue }
     * {@link RealValue }
     * {@link TrueBoolean }
     * {@link SymbolRef }
     * {@link BooleanValue }
     * {@link IdValue }
     * {@link FalseBoolean }
     * 
     */
    public void setValue(MatrixCellValue value){
    	this.value = value;
    }
    
    /**
     * Creates a new empty {@link MatrixVectorIndex} cellRow element, adds it to the current object and returns it.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createCellRowIndex(){
            MatrixVectorIndex el = new MatrixVectorIndex();
            this.cellRow = el;
            return el;
    }
    
    /**
     * Creates a new {@link MatrixVectorIndex} cellRow element, adds it to the current object and returns it.
     * @param index The row index of the cell, as an integer.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createCellRowIndex(int index){
            MatrixVectorIndex el = createCellRowIndex();
            el.setIntValue(new IntValue(index));
            return el;
    }
    
    /**
     * Creates a new {@link MatrixVectorIndex} cellRow element, adds it to the current object and returns it.
     * @param index The row index of the cell, as a symbol.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createCellRowIndex(SymbolRef index){
            MatrixVectorIndex el = createCellRowIndex();
            el.setSymbolRef(index);
            return el;
    }

    /**
     * Creates a new empty {@link MatrixVectorIndex} cellColumn element, adds it to the current object and returns it.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createCellColumnIndex(){
            MatrixVectorIndex el = new MatrixVectorIndex();
            this.cellColumn = el;
            return el;
    }
    
    /**
     * Creates a new {@link MatrixVectorIndex} cellColumn element, adds it to the current object and returns it.
     * @param index The column index of the cell, as an integer.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createCellColumnIndex(int index){
            MatrixVectorIndex el = createCellColumnIndex();
            el.setIntValue(new IntValue(index));
            return el;
    }
    
    /**
     * Creates a new {@link MatrixVectorIndex} cellColumn element, adds it to the current object and returns it.
     * @param index The column index of the cell, as an symbol.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createCellColumnIndex(SymbolRef index){
            MatrixVectorIndex el = createCellColumnIndex();
            el.setSymbolRef(index);
            return el;
    }

	@Override
	public IntValue createIntValue(int value) {
		this.value = new IntValue(value);
		return (IntValue) this.value;
	}

	@Override
	public RealValue createRealValue(double value) {
		RealValue wValue = new RealValue(value);
		this.value = wValue;
		return wValue;
	}

	@Override
	public StringValue createStringValue(String value) {
		StringValue wValue = new StringValue(value);
		this.value = wValue;
		return wValue;
	}

	@Override
	public IdValue createIdValue(String value) {
		IdValue wValue = new IdValue(value);
		this.value = wValue;
		return wValue;
	}

	@Override
	public BooleanValue createBooleanValue(boolean value) {
		BooleanValue wValue;
		if(value){
			wValue = new TrueBoolean();
		} else {
			wValue = new FalseBoolean();
		}
		this.value = wValue;
		return wValue;
	}

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(cellRow)
				.addIfNotNull(cellColumn)
				.addIfNotNull(value);
	}

	@Override
	public MissingValue createMissingValue(MissingValueSymbol symbol) {
		MissingValue mValue = new MissingValue(symbol);
		this.value = mValue;
		return mValue;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
