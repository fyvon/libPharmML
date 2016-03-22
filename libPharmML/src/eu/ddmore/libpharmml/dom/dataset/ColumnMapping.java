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


package eu.ddmore.libpharmml.dom.dataset;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.Assignable;
import eu.ddmore.libpharmml.dom.commontypes.Delay;
import eu.ddmore.libpharmml.dom.commontypes.Interpolation;
import eu.ddmore.libpharmml.dom.commontypes.Interval;
import eu.ddmore.libpharmml.dom.commontypes.Matrix;
import eu.ddmore.libpharmml.dom.commontypes.MatrixSelector;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.Product;
import eu.ddmore.libpharmml.dom.commontypes.Rhs;
import eu.ddmore.libpharmml.dom.commontypes.Scalar;
import eu.ddmore.libpharmml.dom.commontypes.Sequence;
import eu.ddmore.libpharmml.dom.commontypes.Sum;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRef;
import eu.ddmore.libpharmml.dom.commontypes.Vector;
import eu.ddmore.libpharmml.dom.commontypes.VectorSelector;
import eu.ddmore.libpharmml.dom.maths.Binop;
import eu.ddmore.libpharmml.dom.maths.Constant;
import eu.ddmore.libpharmml.dom.maths.FunctionCallType;
import eu.ddmore.libpharmml.dom.maths.MatrixUniOp;
import eu.ddmore.libpharmml.dom.maths.Piecewise;
import eu.ddmore.libpharmml.dom.maths.Uniop;
import eu.ddmore.libpharmml.dom.modeldefn.Probability;
import eu.ddmore.libpharmml.impl.PharmMLVersion;
import eu.ddmore.libpharmml.impl.XMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.util.annotations.HasElementRenamed;
import eu.ddmore.libpharmml.util.annotations.RenamedElement;


/**
 * 
 *                 The type that defines column mapping.
 *             
 * 
 * <p>Java class for ColumnMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnMappingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.pharmml.org/2013/08/Dataset}ColumnRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef" minOccurs="0"/>
 *             &lt;element name="Piecewise" type="{http://www.pharmml.org/2013/03/Maths}PiecewiseType" minOccurs="0"/>
 *             &lt;element name="CategoryMapping" type="{http://www.pharmml.org/2013/08/Dataset}CategoryMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="TargetMapping" type="{http://www.pharmml.org/2013/08/Dataset}TargetMappingType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @since PharmML 0.3
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnMappingType", propOrder = {
    "columnRef",
    "assign",
    "symbRef",
    "piecewise_ds",
    "piecewise_math",
    "categoryMapping",
    "targetMapping"
})
@HasElementRenamed(mappedFields = {
		@RenamedElement(field = "piecewise_ds"),
		@RenamedElement(field = "piecewise_math", since = PharmMLVersion.V0_8_1)
		}, transientField = "piecewise")
public class ColumnMapping
    extends PharmMLRootType implements Assignable
{

    @XmlElement(name = "ColumnRef")
    protected ColumnReference columnRef;
    @XmlElement(name = "Assign", namespace = NS_DEFAULT_CT)
    protected Rhs assign; // PharmML 0.8
    @XmlElement(name = "SymbRef", namespace = XMLFilter.NS_DEFAULT_CT)
    protected SymbolRef symbRef;
    
    @XmlElement(name = "Piecewise", namespace = NS_DEFAULT_DS)
    protected Piecewise piecewise_ds;
    @XmlElement(name = "Piecewise", namespace = NS_DEFAULT_MATH)
    protected Piecewise piecewise_math;
    @XmlTransient
    protected Piecewise piecewise;
    
    @XmlElement(name = "CategoryMapping")
    protected List<CategoryMapping> categoryMapping;
    @XmlElement(name = "TargetMapping")
    protected List<TargetMapping> targetMapping;

    /**
     * 
     *                                 The column reference to map to.
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
     * Gets the value of the assign property.
     * 
     * @return
     *     possible object is
     *     {@link Rhs }
     * 
     * @since PharmML 0.8
     */
    public Rhs getAssign() {
        return assign;
    }

    /**
     * Sets the value of the assign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rhs }
     *     
     * @since PharmML 0.8
     */
    public void setAssign(Rhs value) {
        this.assign = value;
    }

    /**
     * Reference to the symbol to map the column data to.
     * 
     * @return
     *     possible object is
     *     {@link SymbolRef }
     *     
     */
    public SymbolRef getSymbRef() {
        return symbRef;
    }

    /**
     * Sets the value of the symbRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolRef }
     *     
     */
    public void setSymbRef(SymbolRef value) {
        this.symbRef = value;
    }

    /**
     * Gets the value of the piecewise property.
     * 
     * @return
     *     possible object is
     *     {@link Piecewise }
     *     
     * @since PharmML 0.5
     */
    public Piecewise getPiecewise() {
        return piecewise;
    }

    /**
     * Sets the value of the piecewise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Piecewise }
     *     
     * @since PharmML 0.5
     */
    public void setPiecewise(Piecewise value) {
        this.piecewise = value;
    }
    
    /**
     * Gets the value of the categoryMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfCategoryMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryMapping }
     * 
     * 
     */
    public List<CategoryMapping> getListOfCategoryMapping() {
        if (categoryMapping == null) {
            categoryMapping = new ArrayList<CategoryMapping>();
        }
        return this.categoryMapping;
    }

    /**
     * Gets the value of the targetMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfTargetMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMapping }
     * 
     * @since PharmML 0.5
     */
    public List<TargetMapping> getListOfTargetMapping() {
        if (targetMapping == null) {
            targetMapping = new ArrayList<TargetMapping>();
        }
        return this.targetMapping;
    }
    
    /**
     * Creates a new empty {@link ColumnReference} columnRef element, adds it to the current object and returns it.
     * @return The created {@link ColumnReference} object.
     */
    public ColumnReference createColumnRef(){
            ColumnReference el = new ColumnReference();
            this.columnRef = el;
            return el;
    }
    /**
     * Creates a new reference to the provided column, adds it to the current object
     * and returns it.
     * @param columnId The id of the column this object refers to.
     * @return The created {@link ColumnReference} object.
     */
    public ColumnReference createColumnRef(String columnId){
            ColumnReference el = new ColumnReference();
            el.setColumnIdRef(columnId);
            this.columnRef = el;
            return el;
    }

    /**
     * Creates a new empty {@link SymbolRef} symbRef element, adds it to the current object and returns it.
     * @return The created {@link SymbolRef} object.
     */
    public SymbolRef createSymbRef(){
            SymbolRef el = new SymbolRef();
            this.symbRef = el;
            return el;
    }
    /**
     * Creates a new {@link SymbolRef} symbRef element to the provided symbol id, 
     * adds it to the current object and returns it.
     * @param symbolId The symbol id this refers to.
     * @return The created {@link SymbolRef} object.
     */
    public SymbolRef createSymbRef(String symbolId){
            SymbolRef el = new SymbolRef();
            el.setSymbIdRef(symbolId);
            this.symbRef = el;
            return el;
    }
    /**
     * Creates a new {@link SymbolRef} symbRef element to the provided symbol id within 
     * the provided block id, adds it to the current object and returns it.
     * @param symbolId The symbol id this refers to
     * @param blkId The block id of the refered symbol.
     * @return The created {@link SymbolRef} object.
     */
    public SymbolRef createSymbRef(String symbolId, String blkId){
            SymbolRef el = new SymbolRef();
            el.setSymbIdRef(symbolId);
            el.setBlkIdRef(blkId);
            this.symbRef = el;
            return el;
    }

    /**
     * Creates a new empty {@link Piecewise} piecewise element, adds it to the current object and returns it.
     * @return The created {@link Piecewise} object.
     */
    public Piecewise createPiecewise(){
            Piecewise el = new Piecewise();
            this.piecewise = el;
            return el;
    }

    /**
     * Creates a new empty {@link CategoryMapping} categoryMapping element, adds it to the current object and returns it.
     * @return The created {@link CategoryMapping} object.
     */
    public CategoryMapping createCategoryMapping(){
            CategoryMapping el = new CategoryMapping();
            getListOfCategoryMapping().add(el);
            return el;
    }

    /**
     * Creates a new empty {@link TargetMapping} targetMapping element, adds it to the current object and returns it.
     * @return The created {@link TargetMapping} object.
     */
    public TargetMapping createTargetMapping(){
            TargetMapping el = new TargetMapping();
            getListOfTargetMapping().add(el);
            return el;
    }

	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(columnRef)
				.addIfNotNull(assign)
				.addIfNotNull(symbRef)
				.addIfNotNull(piecewise)
				.addIfNotNull(categoryMapping)
				.addIfNotNull(targetMapping);
	}

	@Override
	public Rhs assign(Scalar scalar) {
		Rhs rhs = new Rhs(scalar);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(SymbolRef symbolRef) {
		Rhs rhs = new Rhs(symbolRef);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Sequence sequence) {
		Rhs rhs = new Rhs(sequence);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Vector vector) {
		Rhs rhs = new Rhs(vector);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Interpolation interpolation) {
		Rhs rhs = new Rhs(interpolation);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Matrix matrix) {
		Rhs rhs = new Rhs(matrix);
		setAssign(rhs);
		return rhs;
	}
	
	@Override
	public Rhs assign(Constant constant) {
		Rhs rhs = new Rhs(constant);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Interval interval) {
		Rhs rhs = new Rhs(interval);
		setAssign(rhs);
		return rhs;
	}
	
	@Override
	public Rhs assign(Binop binop) {
		Rhs rhs = new Rhs(binop);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Uniop uniop) {
		Rhs rhs = new Rhs(uniop);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Piecewise piecewise) {
		Rhs rhs = new Rhs(piecewise);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(FunctionCallType functionCall) {
		Rhs rhs = new Rhs(functionCall);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Sum sum) {
		Rhs rhs = new Rhs(sum);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Product product) {
		Rhs rhs = new Rhs(product);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Delay delay) {
		Rhs rhs = new Rhs(delay);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(VectorSelector vectorSelector) {
		Rhs rhs = new Rhs(vectorSelector);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(MatrixSelector matrixSelector) {
		Rhs rhs = new Rhs(matrixSelector);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(MatrixUniOp matrixUniop) {
		Rhs rhs = new Rhs(matrixUniop);
		setAssign(rhs);
		return rhs;
	}

	@Override
	public Rhs assign(Probability probability) {
		Rhs rhs = new Rhs(probability);
		setAssign(rhs);
		return rhs;
	}

}
