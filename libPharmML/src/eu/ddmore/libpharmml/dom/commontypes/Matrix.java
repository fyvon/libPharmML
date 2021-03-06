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
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom.commontypes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.MathExpressionConverter;
import eu.ddmore.libpharmml.dom.maths.ExpressionValue;
import eu.ddmore.libpharmml.dom.tags.LogicBinOperand;
import eu.ddmore.libpharmml.impl.MathExpressionConverterToExpression;
import eu.ddmore.libpharmml.impl.MathExpressionConverterToMathML;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.util.SubList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 * The type specifies the content of a matrix.
 * 
 * 
 * <p><h3>Encoding:</h3>
 * The definition of matrixes is similar to the definition of vectors (see {@link Vector}).
 * It is possible to define a matrix row-by-row using {@link MatrixRow} elements or to define
 * a sparse matrix with a few elements such as {@link MatrixBlock} objects or {@link MatrixCell}
 * objects.
 * 
 * <p>Some attributes allow to simplify the matrix encoding by only specifying explictly
 * a few values:
 * <p><ul>
 * <li><b>matrixType</b> (see {@link Matrix.Type}):
 * 		<ul>
 * 		<li><b>Any</b>: no requirement on the matrix.</li>
 * 		<li><b>Diagonal</b>: only the diagonal values have to be specified, the rest is by definition zero.</li>
 * 		<li><b>LowerTriangular/UpperTriangular</b>: only diagonal and off-diagonal matrix elements
 * below or above the diagonal are non-zero and have to be specified, respectively.</li>
 * 		<li><b>Symmetric</b>: due to simmetry only the off-diagonal matrix elements below or above
 * the diagonal have to be specified.</li>
 * 		</ul>
 * </li>
 * <li><b>diagDefault</b>: sets all the diagonal values to a given default value.</li>
 * <li><b>offDiagDefault</b>: sets all the off-diagonal values to a given default value.</li>
 * </ul> 
 * 
 * <p><h3>Reading:</h3>
 * Any reference to the matrix can be done using a symbol reference (see {@link SymbolRef}).
 * It must refer to the symbId of the variable the matrix is assigned to.
 * It is also possible to refer to a subpart of a matrix using a {@link MatrixSelector} object. The
 * selector must also refers to the symbol id of the corresponding variable.
 *             
 * 
 * <p><h3>Schema:</h3>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="RowNames" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}MatrixColumnRowNames" minOccurs="0"/>
 *         &lt;element name="ColumnNames" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}MatrixColumnRowNames" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="MatrixColumn" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}MatrixColumnType" maxOccurs="unbounded"/>
 *           &lt;element name="MatrixRow" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}MatrixRowType" maxOccurs="unbounded"/>
 *           &lt;element name="MatrixCell" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}MatrixCellType" maxOccurs="unbounded"/>
 *           &lt;element name="MatrixBlock" type="{http://www.pharmml.org/pharmml/0.7/CommonTypes}MatrixBlockType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="diagDefault" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="offDiagDefault" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="numbCols" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="numbRows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="matrixType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *             &lt;enumeration value="Any"/>
 *             &lt;enumeration value="Diagonal"/>
 *             &lt;enumeration value="LowerTriangular"/>
 *             &lt;enumeration value="UpperTriangular"/>
 *             &lt;enumeration value="Symmetric"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixType", propOrder = {
    "rowNames",
    "columnNames",
    "matrixRowOrMatrixCellOrMatrixBlock"
})
public class Matrix
    extends PharmMLRootType implements ExpressionValue, LogicBinOperand
{

    @XmlElement(name = "RowNames")
    protected MatrixColumnRowNames rowNames;
    @XmlElement(name = "ColumnNames")
    protected MatrixColumnRowNames columnNames;
    @XmlElements({
    	@XmlElement(name = "MatrixColumn", type = MatrixColumn.class),
        @XmlElement(name = "MatrixRow", type = MatrixRow.class),
        @XmlElement(name = "MatrixCell", type = MatrixCell.class),
        @XmlElement(name = "MatrixBlock", type = MatrixBlock.class)
    })
    protected List<PharmMLRootType> matrixRowOrMatrixCellOrMatrixBlock;
    @XmlAttribute(name = "diagDefault")
    protected Double diagDefault;
    @XmlAttribute(name = "offDiagDefault")
    protected Double offDiagDefault;
    @XmlAttribute(name = "numbCols")
    protected Integer numbCols;
    @XmlAttribute(name = "numbRows")
    protected Integer numbRows;
    @XmlAttribute(name = "matrixType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String matrixType;
    @XmlAttribute(name = "symbId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @Deprecated
    protected String symbId;
    
    /**
	 * Empty constructor
	 */
	public Matrix(){
	}
	
	/**
	 * Constructs a matrix with the minimal required attributes
	 * @param symbolId Symbol of the matrix (may be null).
	 * @param type Matrix type.
	 * 
	 * @deprecated Since PharmML 0.5.1. The id of a matrix is now located within the variable
	 * this matrix is assigned to. Use {@link #Matrix(Type)} instead.
	 */
	@Deprecated
	public Matrix(String symbolId, Matrix.Type type){
		this();
		this.setSymbId(symbolId);
		this.setMatrixType(type);
	}
	/**
	 * Constructs a matrix with a given type.
	 * @param type Matrix type.
	 * 
	 */
	public Matrix(Matrix.Type type){
		this();
		this.setMatrixType(type);
	}
	
	/**
	 * Constructs a matrix with the minimal required attributes for a sparse matrix.
	 * @param symbolId Symbol of the matrix (may be null).
	 * @param type Matrix type.
	 * @param numbCols Number of columns.
	 * @param numbRows Number of rows.
	 * 
	 * @deprecated Since PharmML 0.5.1. The id of a matrix is now located within the variable
	 * this matrix is assigned to. Use {@link #Matrix(Type, int, int)} instead.
	 */
	@Deprecated
	public Matrix(String symbolId, Matrix.Type type, int numbCols, int numbRows){
		this(symbolId,type);
		this.setNumbCols(numbCols);
		this.setNumbRows(numbRows);
	}
	/**
	 * Constructs a matrix with the minimal required attributes for a sparse matrix.
	 * @param type Matrix type.
	 * @param numbCols Number of columns.
	 * @param numbRows Number of rows.
	 */
	public Matrix(Matrix.Type type, int numbCols, int numbRows){
		this(type);
		this.setNumbCols(numbCols);
		this.setNumbRows(numbRows);
	}
	
	/**
	 * Constructs a matrix with the minimal required attributes for a sparse matrix that contains
	 * matrix blocks and/or matrix cells.
	 * @param symbolId Symbol of the matrix (may be null).
	 * @param type Matrix type.
	 * @param numbCols Number of columns.
	 * @param numbRows Number of rows.
	 * @param diagDefault Default value on the diagonal.
	 * @param offDiagDefault Default off-diagonal value.
	 */
	public Matrix(String symbolId, Matrix.Type type, int numbCols, int numbRows, 
			double diagDefault, double offDiagDefault){
		this(symbolId,type,numbCols,numbRows);
		this.setDiagDefault(diagDefault);
		this.setOffDiagDefault(offDiagDefault);
	}

    /**
     * Gets the value of the rowNames property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixColumnRowNames }
     *     
     */
    public MatrixColumnRowNames getRowNames() {
        return rowNames;
    }

    /**
     * Sets the value of the rowNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixColumnRowNames }
     *     
     */
    public void setRowNames(MatrixColumnRowNames value) {
        this.rowNames = value;
    }

    /**
     * Gets the value of the columnNames property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixColumnRowNames }
     *     
     */
    public MatrixColumnRowNames getColumnNames() {
        return columnNames;
    }

    /**
     * Sets the value of the columnNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixColumnRowNames }
     *     
     */
    public void setColumnNames(MatrixColumnRowNames value) {
        this.columnNames = value;
    }
	
	/**
     * Gets the value of the matrixRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrixRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixRow }
     * 
     * @deprecated
     */
    @Deprecated
	public List<MatrixRow> getMatrixRow() {
//        if (matrixRow == null) {
//            matrixRow = new ArrayList<MatrixRowType>();
//        }
//        return this.matrixRow;
    	return new SubList<MatrixRow>(getListOfMatrixElements(), MatrixRow.class);
    }

    /**
     * Gets the value of the matrixRowOrMatrixCellOrMatrixBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrixRowOrMatrixCellOrMatrixBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixRowOrMatrixCellOrMatrixBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixColumn }
     * {@link MatrixRow }
     * {@link MatrixCell }
     * {@link MatrixBlock }
     * 
     * 
     */
    public List<PharmMLRootType> getListOfMatrixElements() {
        if (matrixRowOrMatrixCellOrMatrixBlock == null) {
            matrixRowOrMatrixCellOrMatrixBlock = new ArrayList<PharmMLRootType>();
        }
        return this.matrixRowOrMatrixCellOrMatrixBlock;
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
     *     {@link Integer }
     *     
     */
    public Integer getNumbCols() {
        return numbCols;
    }

    /**
     * Sets the value of the numbCols property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumbCols(Integer value) {
        this.numbCols = value;
    }
    
    /**
     * Sets the value of the numbCols property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @deprecated PharmML now uses xs:int values. Use {@link #setNumbCols(Integer)}.
     */
    @Deprecated
    public void setNumbCols(BigInteger value) {
        this.numbCols = value.intValue();
    }

    /**
     * Gets the value of the numbRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumbRows() {
        return numbRows;
    }

    /**
     * Sets the value of the numbRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumbRows(Integer value) {
        this.numbRows = value;
    }
    
    /**
     * Sets the value of the numbRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @deprecated PharmML now uses xs:int values. Use {@link #setNumbRows(Integer)}.
     */
    @Deprecated
    public void setNumbRows(BigInteger value) {
        this.numbRows = value.intValue();
    }

    /**
     * Gets the value of the matrixType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixType() {
        return matrixType;
    }

    /**
     * Sets the value of the matrixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixType(String value) {
        this.matrixType = value;
    }

    /**
     * Gets the value of the symbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     * @deprecated Since PharmML 0.5.1. Symbol id must be accessed via the variable
     * this matrix is assigned to.
     */
    @Deprecated
    public String getSymbId() {
        return symbId;
    }

    /**
     * Sets the value of the symbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @deprecated Since PharmML 0.5.1. Symbol id must be accessed via the variable
     * this matrix is assigned to.
     */
    @Deprecated
    public void setSymbId(String value) {
        this.symbId = value;
    }
    
    public void setMatrixType(Matrix.Type type){
		setMatrixType(type.toString());
	}

	/**
	 * Creates an empty {@link MatrixColumnRowNames} element for row names in that matrix and returns it.
	 * @return The created {@link MatrixColumnRowNames} object.
	 */
    public MatrixColumnRowNames createRowNames(){
    	MatrixColumnRowNames rowNames = new MatrixColumnRowNames();
    	this.rowNames = rowNames;
    	return rowNames;
    }
    
    /**
     * Creates an empty {@link MatrixColumnRowNames} element for column names in that matrix and returns it.
	 * @return The created {@link MatrixColumnRowNames} object.
     */
    public MatrixColumnRowNames createColumnNames(){
    	MatrixColumnRowNames columnNames = new MatrixColumnRowNames();
    	this.columnNames = columnNames;
    	return columnNames;
    }
    
    /**
     * Creates an empty matrix cell into that matrix and returns it.
     * @return The create {@link MatrixCell} object.
     */
    public MatrixCell createMatrixCell(){
    	MatrixCell cell = new MatrixCell();
    	getListOfMatrixElements().add(cell);
    	return cell;
    }
    
    /**
     * Creates a matrix cell into that matrix and returns it.
     * @param rowIndex The row index of the cell within the parent matrix.
     * @param columnIndex The column index of the cell within the parent matrix.
     * @return The create {@link MatrixCell} object.
     */
    public MatrixCell createMatrixCell(int rowIndex, int columnIndex){
    	return createMatrixCell(new MatrixVectorIndex(rowIndex), new MatrixVectorIndex(columnIndex));
    }
    
    /**
     * Creates a matrix cell into that matrix and returns it.
     * @param rowIndex The row index of the cell within the parent matrix.
     * @param columnIndex The column index of the cell within the parent matrix.
     * @param value The value of the cell as real, that will be wrapped into a {@link RealValue}.
     * @return The create {@link MatrixCell} object.
     */
    public MatrixCell createMatrixCell(int rowIndex, int columnIndex, double value){
    	MatrixCell cell = createMatrixCell(rowIndex,columnIndex);
    	cell.createRealValue(value);
    	return cell;
    }
    
    /**
     * Creates a matrix cell into that matrix and returns it.
     * @param rowIndex The row index of the cell within the parent matrix.
     * @param columnIndex The column index of the cell within the parent matrix.
     * @param value The value of the cell as integer, that will be wrapped into a {@link IntValue}.
     * @return The create {@link MatrixCell} object.
     */
    public MatrixCell createMatrixCell(int rowIndex, int columnIndex, int value){
    	MatrixCell cell = createMatrixCell(rowIndex,columnIndex);
    	cell.createIntValue(value);
    	return cell;
    }
    
    /**
     * Creates a matrix cell into that matrix and returns it.
     * @param rowIndex The row index of the cell within the parent matrix.
     * @param columnIndex The column index of the cell within the parent matrix.
     * @param value The value of the cell as boolean, that will be wrapped into a {@link BooleanValue}.
     * @return The create {@link MatrixCell} object.
     */
    public MatrixCell createMatrixCell(int rowIndex, int columnIndex, boolean value){
    	MatrixCell cell = createMatrixCell(rowIndex,columnIndex);
    	cell.createBooleanValue(value);
    	return cell;
    }
    
    /**
     * Creates a matrix cell into that matrix and returns it.
     * @param rowIndex The row index of the cell within the parent matrix.
     * @param columnIndex The column index of the cell within the parent matrix.
     * @param value The value of the cell as string, that will be wrapped into a {@link StringValue}.
     * @return The create {@link MatrixCell} object.
     */
    public MatrixCell createMatrixCell(int rowIndex, int columnIndex, String value){
    	MatrixCell cell = createMatrixCell(rowIndex,columnIndex);
    	cell.createStringValue(value);
    	return cell;
    }
    
    /**
     * Creates a matrix cell into that matrix and returns it.
     * @param rowIndex The row index of the cell within the parent matrix.
     * @param columnIndex The column index of the cell within the parent matrix.
     * @return The create {@link MatrixCell} object.
     */
    public MatrixCell createMatrixCell(MatrixVectorIndex rowIndex, MatrixVectorIndex columnIndex){
    	MatrixCell cell = createMatrixCell();
    	cell.setCellRow(rowIndex);
    	cell.setCellColumn(columnIndex);
    	return cell;
    }
    
    /**
     * Creates a matrix cell into that matrix and returns it.
     * @param rowIndex The row index of the cell within the parent matrix.
     * @param columnIndex The column index of the cell within the parent matrix.
     * @param value The abstracted value of the cell. May be {@link Scalar} or {@link SymbolRef}.
     * @return The create {@link MatrixCell} object.
     */
    public MatrixCell createMatrixCell(MatrixVectorIndex rowIndex, MatrixVectorIndex columnIndex, MatrixCellValue value){
    	MatrixCell cell = createMatrixCell(rowIndex,columnIndex);
    	cell.setValue(value);
    	return cell;
    }
    
    /**
     * Creates an empty {@link MatrixBlock} element into that matrix and returns it.
     * @return The created {@link MatrixBlock} object.
     */
    public MatrixBlock createMatrixBlock(){
    	MatrixBlock block = new MatrixBlock();
    	getListOfMatrixElements().add(block);
    	return block;
    }
    
    /**
     * Creates a {@link MatrixBlock} element into that matrix and returns it.
     * @param rowStartIndex The start row index of this block within the parent matrix.
     * @param columnStartIndex The start column index of this block within the parant matrix.
     * @return The created {@link MatrixBlock} object.
     */
    public MatrixBlock createMatrixBlock(MatrixVectorIndex rowStartIndex, MatrixVectorIndex columnStartIndex){
    	MatrixBlock block = createMatrixBlock();
    	block.setBlockStartRow(rowStartIndex);
    	block.setBlockStartColumn(columnStartIndex);
    	return block;
    }
    
    /**
     * Creates an empty {@link MatrixRow} element into that matrix and returns it.
     * @return The created {@link MatrixRow} element.
     */
    public MatrixRow createMatrixRow(){
    	MatrixRow row = new MatrixRow();
    	getListOfMatrixElements().add(row);
    	return row;
    }
    
    /**
     * Creates a {@link MatrixRow} element with default value into that matrix and returns it.
     * @param defaultValue Default value of the row elements.
     * @return The created {@link MatrixRow} element.
     */
    public MatrixRow createMatrixRow(double defaultValue){
    	MatrixRow row = createMatrixRow();
    	row.setDefault(defaultValue);
    	return row;
    }
    
    /**
     * Creates a {@link MatrixRow} element with default value at the given index and returns it.
     * @param index Index of that row within the parent matrix.
     * @param defaultValue Default value of the row elements.
     * @return The created {@link MatrixRow} element.
     */
    public MatrixRow createMatrixRow(MatrixVectorIndex index, double defaultValue){
    	MatrixRow row = createMatrixRow(defaultValue);
    	row.setRowIndex(index);
    	return row;
    }
    
    /**
     * Creates a {@link MatrixRow} element with specified elements and returns it.
     * @param values Elements of the row.
     * @return The created {@link MatrixRow} element.
     */
    public MatrixRow createMatrixRow(MatrixRowValue[] values){
    	MatrixRow row = createMatrixRow();
    	for(MatrixRowValue value : values){
    		row.getListOfValues().add(value);
    	}
    	return row;
    }
    
    /**
     * Creates a {@link MatrixRow} element with specified elements at the given index and returns it.
     * @param index Index of that row within the parent matrix.
     * @param values Elements of the row.
     * @return The created {@link MatrixRow} element.
     */
    public MatrixRow createMatrixRow(MatrixVectorIndex index, MatrixRowValue[] values){
    	MatrixRow row = createMatrixRow(values);
    	row.setRowIndex(index);
    	return row;
    }
    
    public MatrixColumn createMatrixColumn(){
    	MatrixColumn column = new MatrixColumn();
    	getListOfMatrixElements().add(column);
    	return column;
    }
    
    /**
     * Enumerates the possible types of a matrix.
     * @author F. Yvon
     */
    public static enum Type {
    	/**
    	 * "Any" - 
    	 * No requirement on the matrix.
    	 */
    	ANY("Any"),
    	/**
    	 * "Diagonal" - 
    	 * Only the diagonal values have to be specified, the rest is by definition zero.
    	 */
    	DIAGONAL("Diagonal"),
    	/**
    	 * "LowerTriangular" - 
    	 * Only diagonal and off-diagonal matrix elements below the diagonal are non-zero and have to be specified.
    	 */
    	LOWER_TRIANGULAR("LowerTriangular"),
    	/**
    	 * "UpperTriangular" - 
    	 * Only diagonal and off-diagonal matrix elements above the diagonal are non-zero and have to be specified.
    	 */
    	UPPER_TRIANGULAR("UpperTriangular"),
    	/**
    	 * "Symmetric" - 
    	 * Due to simmetry only the off-diagonal matrix elements below or above the diagonal have to be specified.
    	 */
    	SYMMETRIC("Symmetric");
    	
    	private String type;
    	
    	Type(String type){
    		this.type = type;
    	}
    	
    	/**
    	 * Converts the enum value to the string version that apperas in PharmML files.
    	 */
    	@Override
    	public String toString() {
    		return this.type;
    	}
    }

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(rowNames)
				.addIfNotNull(columnNames)
				.addIfNotNull(matrixRowOrMatrixCellOrMatrixBlock);
	}

	@Override
	public String toMathExpression() {
		return new MathExpressionConverterToExpression().convert(this);
	}

	@Override
	public String toMathML() {
		return new MathExpressionConverterToMathML().convert(this);
	}

	@Override
	public String convert(MathExpressionConverter converter) {
		return converter.convert(this);
	}

	@Override
	public JAXBElement<Matrix> toJAXBElement() {
		return ObjectFactory.getInstance().createMatrix(this);
	}

	@Override
	public JAXBElement<Matrix> toJAXBElementOfLogicBinOp() {
		return ObjectFactory.getInstance().createMatrix(this);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
        
}
