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
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.commontypes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.util.ChainedList;


/**
 * 
 *                 The type specifies the content of a block/submatrix of a matrix.
 *             
 * 
 * <p>Java class for MatrixBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixBlockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="BlockStartRow" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *         &lt;element name="BlockStartColumn" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *         &lt;choice>
 *           &lt;element name="BlockRow" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixRowType" maxOccurs="unbounded"/>
 *           &lt;element name="BlockCell" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixCellType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="diagDefault" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="offDiagDefault" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="numbCols" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="numbRows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixBlockType", propOrder = {
    "blockStartRow",
    "blockStartColumn",
    "blockRow",
    "blockCell"
})
public class MatrixBlock
    extends PharmMLRootType
{

    @XmlElement(name = "BlockStartRow", required = true)
    protected MatrixVectorIndex blockStartRow;
    @XmlElement(name = "BlockStartColumn", required = true)
    protected MatrixVectorIndex blockStartColumn;
    @XmlElement(name = "BlockRow")
    protected List<MatrixRow> blockRow;
    @XmlElement(name = "BlockCell")
    protected List<MatrixCell> blockCell;
    @XmlAttribute(name = "diagDefault")
    protected Double diagDefault;
    @XmlAttribute(name = "offDiagDefault")
    protected Double offDiagDefault;
    @XmlAttribute(name = "numbCols")
    protected BigInteger numbCols;
    @XmlAttribute(name = "numbRows")
    protected BigInteger numbRows;
    
    public MatrixBlock(){}
    
    public MatrixBlock(MatrixVectorIndex blockStartRow, MatrixVectorIndex blockStartColumn){
    	this.blockStartRow = blockStartRow;
    	this.blockStartColumn = blockStartColumn;
    }
    
    public MatrixBlock(int blockStartRow, int blockStartcolumn){
    	this(new MatrixVectorIndex(blockStartRow), new MatrixVectorIndex(blockStartcolumn));
    }

    /**
     * Gets the value of the blockStartRow property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixVectorIndexType }
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
     *     {@link MatrixVectorIndexType }
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
     *     {@link MatrixVectorIndexType }
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
     *     {@link MatrixVectorIndexType }
     *     
     */
    public void setBlockStartColumn(MatrixVectorIndex value) {
        this.blockStartColumn = value;
    }

    /**
     * Gets the value of the blockRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixRow }
     * 
     * 
     */
    public List<MatrixRow> getListOfBlockRow() {
        if (blockRow == null) {
            blockRow = new ArrayList<MatrixRow>();
        }
        return this.blockRow;
    }

    /**
     * Gets the value of the blockCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixCell }
     * 
     * 
     */
    public List<MatrixCell> getListOfBlockCell() {
        if (blockCell == null) {
            blockCell = new ArrayList<MatrixCell>();
        }
        return this.blockCell;
    }

    /**
     * Gets the value of the diagDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDiagDefault() {
        if (diagDefault == null) {
            return  0.0D;
        } else {
            return diagDefault;
        }
    }

    /**
     * Sets the value of the diagDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiagDefault(Double value) {
        this.diagDefault = value;
    }

    /**
     * Gets the value of the offDiagDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getOffDiagDefault() {
        if (offDiagDefault == null) {
            return  0.0D;
        } else {
            return offDiagDefault;
        }
    }

    /**
     * Sets the value of the offDiagDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffDiagDefault(Double value) {
        this.offDiagDefault = value;
    }

    /**
     * Gets the value of the numbCols property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumbCols() {
        return numbCols;
    }

    /**
     * Sets the value of the numbCols property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumbCols(BigInteger value) {
        this.numbCols = value;
    }

    /**
     * Gets the value of the numbRows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumbRows() {
        return numbRows;
    }

    /**
     * Sets the value of the numbRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumbRows(BigInteger value) {
        this.numbRows = value;
    }
    
    /**
     * Creates a new empty {@link MatrixVectorIndex} blockStartRow element, adds it to the current object and returns it.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createBlockStartRow(){
            MatrixVectorIndex el = new MatrixVectorIndex();
            this.blockStartRow = el;
            return el;
    }

    /**
     * Creates a new empty {@link MatrixVectorIndex} blockStartColumn element, adds it to the current object and returns it.
     * @return The created {@link MatrixVectorIndex} object.
     */
    public MatrixVectorIndex createBlockStartColumn(){
            MatrixVectorIndex el = new MatrixVectorIndex();
            this.blockStartColumn = el;
            return el;
    }

    /**
     * Creates a new empty {@link MatrixRow} blockRow element, adds it to the current object and returns it.
     * @return The created {@link MatrixRow} object.
     */
    public MatrixRow createBlockRow(){
            MatrixRow el = new MatrixRow();
            getListOfBlockRow().add(el);
            return el;
    }
    
    /**
     * Creates a new {@link MatrixRow} blockRow element, adds it to the current object and returns it.
     * @param rowIndex The index within the parent matrix.
     * @return The created {@link MatrixRow} object.
     */
    public MatrixRow createBlockRow(MatrixVectorIndex rowIndex){
            MatrixRow el = createBlockRow();
            el.setRowIndex(rowIndex);
            return el;
    }

    /**
     * Creates a new empty {@link MatrixCell} blockCell element, adds it to the current object and returns it.
     * @return The created {@link MatrixCell} object.
     */
    public MatrixCell createBlockCell(){
            MatrixCell el = new MatrixCell();
            getListOfBlockCell().add(el);
            return el;
    }

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(blockStartRow)
				.addIfNotNull(blockStartColumn)
				.addIfNotNull(blockRow)
				.addIfNotNull(blockCell);
	}


}
