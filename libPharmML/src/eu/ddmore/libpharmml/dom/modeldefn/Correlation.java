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
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.LevelReference;
import eu.ddmore.libpharmml.dom.commontypes.Matrix;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.ScalarRhs;
import eu.ddmore.libpharmml.impl.XMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type defining a correlation between random effects.
 * 
 * <p>Java class for CorrelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}VariabilityReference"/>
 *         &lt;choice>
 *           &lt;element name="Pairwise" type="{http://www.pharmml.org/2013/03/ModelDefinition}PairwiseType"/>
 *           &lt;element name="Matrix" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="deviationMatrixType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *             &lt;enumeration value="CovMatrix"/>
 *             &lt;enumeration value="CorrMatrix"/>
 *             &lt;enumeration value="StDevCorrMatrix"/>
 *             &lt;enumeration value="Cholesky"/>
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
@XmlType(name = "CorrelationType", propOrder = {
    "variabilityReference",
	"randomVariable1",
    "randomVariable2",
    "correlationCoefficient",
    "covariance",
    "pairwise",
    "matrix"
})
public class Correlation
    extends PharmMLRootType
{

    @XmlElement(name = "VariabilityReference", namespace = XMLFilter.NS_DEFAULT_CT, required = true)
    protected LevelReference variabilityReference;
	@XmlElement(name = "RandomVariable1", required = true)
	@Deprecated
    protected CorrelatedRandomVariable randomVariable1;
    @XmlElement(name = "RandomVariable2", required = true)
    @Deprecated
    protected CorrelatedRandomVariable randomVariable2;
    @XmlElement(name = "CorrelationCoefficient")
    @Deprecated
    protected ScalarRhs correlationCoefficient;
    @XmlElement(name = "Covariance")
    @Deprecated
    protected ScalarRhs covariance;
    @XmlElement(name = "Pairwise")
    protected Pairwise pairwise;
    @XmlElement(name = "Matrix")
    protected Matrix matrix;
    @XmlAttribute(name = "deviationMatrixType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deviationMatrixType;

    /**
     * Gets the value of the variabilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link LevelReference }
     *     
     */
    public LevelReference getVariabilityReference() {
        return variabilityReference;
    }

    /**
     * Sets the value of the variabilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelReference }
     *     
     */
    public void setVariabilityReference(LevelReference value) {
        this.variabilityReference = value;
    }

    /**
     * Gets the value of the randomVariable1 property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelatedRandomVariable }
     *     
     * @deprecated Since PharmML 0.3, pair-wise correlations must be defined within the {@link Pairwise} child element,
     * accessible through {@link #getPairwise()}
     */
    @Deprecated
	public CorrelatedRandomVariable getRandomVariable1() {
        return randomVariable1;
    }

    /**
     * Sets the value of the randomVariable1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelatedRandomVariable }
     * 
     * @deprecated Since PharmML 0.3, pair-wise correlations must be defined within the {@link Pairwise} child element,
     * accessible through {@link #getPairwise()}
     */
    @Deprecated
	public void setRandomVariable1(CorrelatedRandomVariable value) {
        this.randomVariable1 = value;
    }

    /**
     * Gets the value of the randomVariable2 property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelatedRandomVariable }
     *     
     * @deprecated Since PharmML 0.3, pair-wise correlations must be defined within the {@link Pairwise} child element,
     * accessible through {@link #getPairwise()}
     */
    @Deprecated
	public CorrelatedRandomVariable getRandomVariable2() {
        return randomVariable2;
    }

    /**
     * Sets the value of the randomVariable2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelatedRandomVariable }
     *     
     * @deprecated Since PharmML 0.3, pair-wise correlations must be defined within the {@link Pairwise} child element,
     * accessible through {@link #getPairwise()}
     */
    @Deprecated
	public void setRandomVariable2(CorrelatedRandomVariable value) {
        this.randomVariable2 = value;
    }

    /**
     * Gets the value of the correlationCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link ScalarRhs }
     *     
     * @deprecated Since PharmML 0.3, pair-wise correlations must be defined within the {@link Pairwise} child element,
     * accessible through {@link #getPairwise()}
     */
    @Deprecated
	public ScalarRhs getCorrelationCoefficient() {
        return correlationCoefficient;
    }

    /**
     * Sets the value of the correlationCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalarRhs }
     *     
     * @deprecated Since PharmML 0.3, pair-wise correlations must be defined within the {@link Pairwise} child element,
     * accessible through {@link #getPairwise()}
     */
    @Deprecated
	public void setCorrelationCoefficient(ScalarRhs value) {
        this.correlationCoefficient = value;
    }

    /**
     * Gets the value of the covariance property.
     * 
     * @return
     *     possible object is
     *     {@link ScalarRhs }
     *     
     * @deprecated Since PharmML 0.3, pair-wise correlations must be defined within the {@link Pairwise} child element,
     * accessible through {@link #getPairwise()}
     */
    @Deprecated
	public ScalarRhs getCovariance() {
        return covariance;
    }

    /**
     * Sets the value of the covariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalarRhs }
     *     
     * @deprecated Since PharmML 0.3, pair-wise correlations must be defined within the {@link Pairwise} child element,
     * accessible through {@link #getPairwise()}
     */
    @Deprecated
	public void setCovariance(ScalarRhs value) {
        this.covariance = value;
    }

    /**
     * Gets the value of the pairwise property.
     * 
     * @return
     *     possible object is
     *     {@link Pairwise }
     *     
     * @since libPharmML 0.3
     */
    public Pairwise getPairwise() {
        return pairwise;
    }

    /**
     * Sets the value of the pairwise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pairwise }
     *     
     * @since libPharmML 0.3
     */
    public void setPairwise(Pairwise value) {
        this.pairwise = value;
    }

    /**
     * Gets the value of the matrix property.
     * 
     * @return
     *     possible object is
     *     {@link Matrix }
     *     
     * @since libPharmML 0.3
     */
    public Matrix getMatrix() {
        return matrix;
    }

    /**
     * Sets the value of the matrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Matrix }
     *     
     * @since libPharmML 0.3
     */
    public void setMatrix(Matrix value) {
        this.matrix = value;
    }

    /**
     * Gets the value of the deviationMatrixType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviationMatrixType() {
        return deviationMatrixType;
    }

    /**
     * Sets the value of the deviationMatrixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviationMatrixType(String value) {
        this.deviationMatrixType = value;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(variabilityReference)
				.addIfNotNull(pairwise)
				.addIfNotNull(matrix);
	}

}
