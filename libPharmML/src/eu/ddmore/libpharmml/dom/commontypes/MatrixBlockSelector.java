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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.commontypes;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 This type specifies a block selector for a matrix.
 *             
 * 
 * <p>Java class for MatrixBlockSelectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixBlockSelectorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="BlockStartRow" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *         &lt;element name="BlockStartColumn" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *         &lt;element name="RowsNumber" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *         &lt;element name="ColumnsNumber" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixBlockSelectorType", propOrder = {
    "blockStartRow",
    "blockStartColumn",
    "rowsNumber",
    "columnsNumber"
})
public class MatrixBlockSelector
    extends PharmMLRootType
{

    @XmlElement(name = "BlockStartRow", required = true)
    protected MatrixVectorIndex blockStartRow;
    @XmlElement(name = "BlockStartColumn", required = true)
    protected MatrixVectorIndex blockStartColumn;
    @XmlElement(name = "RowsNumber", required = true)
    protected MatrixVectorIndex rowsNumber;
    @XmlElement(name = "ColumnsNumber", required = true)
    protected MatrixVectorIndex columnsNumber;
    
    /**
     * Empty constructor
     */
    public MatrixBlockSelector(){}
    
    /**
     * Constructs a new matrix block selector with the required parameters.
     * @param blockStartRow The row index within the matrix where the block selector starts.
     * @param blockStartColumn The column index within the matrix where the block selector starts.
     * @param rowsNumber The number of rows that are covered by the selector.
     * @param columnsNumber The number of columns that are convered by the selector.
     */
    public MatrixBlockSelector(MatrixVectorIndex blockStartRow, 
    		MatrixVectorIndex blockStartColumn,
    		MatrixVectorIndex rowsNumber,
    		MatrixVectorIndex columnsNumber){
    	this.blockStartRow = blockStartRow;
    	this.blockStartColumn = blockStartColumn;
    	this.rowsNumber = rowsNumber;
    	this.columnsNumber = columnsNumber;
    }
    
    /**
     * Constructs a new matrix block selector with the required parameters.
     * A {@link MatrixVectorIndex} object will be built from the primitive parameters for each attribute.
     * @param blockStartRow The row index within the matrix where the block selector starts.
     * @param blockStartColumn The column index within the matrix where the block selector starts.
     * @param rowsNumber The number of rows that are covered by the selector.
     * @param columnsNumber The number of columns that are convered by the selector.
     */
    public MatrixBlockSelector(int blockStartRow, 
    		int blockStartColumn,
    		int rowsNumber,
    		int columnsNumber){
    	this(new MatrixVectorIndex(blockStartRow),
    			new MatrixVectorIndex(blockStartColumn),
    			new MatrixVectorIndex(rowsNumber),
    			new MatrixVectorIndex(columnsNumber)
    	);
    }

    /**
     * Gets the value of the blockStartRow property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public MatrixVectorIndex getBlockStartRow() {
        return blockStartRow;
    }

    /**
     * Sets the value of the blockStartRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public void setBlockStartRow(MatrixVectorIndex value) {
        this.blockStartRow = value;
    }

    /**
     * Gets the value of the blockStartColumn property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public MatrixVectorIndex getBlockStartColumn() {
        return blockStartColumn;
    }

    /**
     * Sets the value of the blockStartColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public void setBlockStartColumn(MatrixVectorIndex value) {
        this.blockStartColumn = value;
    }

    /**
     * Gets the value of the rowsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public MatrixVectorIndex getRowsNumber() {
        return rowsNumber;
    }

    /**
     * Sets the value of the rowsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public void setRowsNumber(MatrixVectorIndex value) {
        this.rowsNumber = value;
    }

    /**
     * Gets the value of the columnsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public MatrixVectorIndex getColumnsNumber() {
        return columnsNumber;
    }

    /**
     * Sets the value of the columnsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixVectorIndex }
     *     
     */
    public void setColumnsNumber(MatrixVectorIndex value) {
        this.columnsNumber = value;
    }

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(blockStartRow)
				.addIfNotNull(blockStartColumn)
				.addIfNotNull(rowsNumber)
				.addIfNotNull(columnsNumber);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
