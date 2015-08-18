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
package eu.ddmore.libpharmml.dom.maths;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.dataset.CategoryMapping;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.dom.modeldefn.UncertML;
import eu.ddmore.libpharmml.dom.probonto.ProbOnto;


/**
 * The schema type defining a `piece' in a piecewise function.
 * 
 * <p>Java class for PieceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PieceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/Maths}ExprType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="UncertML" type="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}UncertMLType"/>
 *           &lt;element name="ProbOnto" type="{http://www.pharmml.org/pharmml/0.7/ModelDefinition}ProbOntoType"/>
 *         &lt;/choice>
 *         &lt;element name="CategoryMapping" type="{http://www.pharmml.org/pharmml/0.7/Dataset}CategoryMappingType" minOccurs="0"/>
 *         &lt;element ref="{http://www.pharmml.org/pharmml/0.7/Maths}Condition"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieceType", propOrder = {
	"uncertML",
    "probOnto",
    "categoryMapping",
    "condition"
})
public class Piece
    extends Expression
{

    @XmlElement(name = "UncertML")
    protected UncertML uncertML;
    @XmlElement(name = "ProbOnto")
    protected ProbOnto probOnto;
    @XmlElement(name = "CategoryMapping")
    protected CategoryMapping categoryMapping;
    @XmlElement(name = "Condition", required = true)
    protected Condition condition;
    
    /**
     * Gets the value of the uncertML property.
     * 
     * @return
     *     possible object is
     *     {@link UncertML }
     *     
     * @since PharmML 0.7
     */
    public UncertML getUncertML() {
        return uncertML;
    }

    /**
     * Sets the value of the uncertML property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertML }
     *     
     * @since PharmML 0.7
     */
    public void setUncertML(UncertML value) {
        this.uncertML = value;
    }

    /**
     * Gets the value of the probOnto property.
     * 
     * @return
     *     possible object is
     *     {@link ProbOnto }
     *     
     * @since PharmML 0.7
     */
    public ProbOnto getProbOnto() {
        return probOnto;
    }

    /**
     * Sets the value of the probOnto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbOnto }
     *     
     * @since PharmML 0.7
     */
    public void setProbOnto(ProbOnto value) {
        this.probOnto = value;
    }

    /**
     * Gets the value of the categoryMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryMapping }
     *     
     * @since PharmML 0.6
     */
    public CategoryMapping getCategoryMapping() {
        return categoryMapping;
    }

    /**
     * Sets the value of the categoryMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryMapping }
     * 
     * @since PharmML 0.6
     */
    public void setCategoryMapping(CategoryMapping value) {
        this.categoryMapping = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }
    
    protected void beforeMarshal(Marshaller m){
		super.beforeMarshal(m);
	}
	
	protected void afterUnmarshal(Unmarshaller u, Object parent) {
		super.afterUnmarshal(u, parent);
	}
	
	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(super.listChildren())
				.addIfNotNull(uncertML)
				.addIfNotNull(probOnto)
				.addIfNotNull(categoryMapping)
				.addIfNotNull(condition);
	}

}
