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

// TO DELETE
package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLElement;
import eu.ddmore.libpharmml.dom.commontypes.Rhs;
import eu.ddmore.libpharmml.dom.commontypes.SymbolRef;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * Gaussian residual error definition. Definition is of the form: y = f + g * eps
 * 
 * <p>Java class for GaussianObsError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GaussianObsError">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/ModelDefinition}ObservationErrorType">
 *       &lt;sequence>
 *         &lt;element name="Transformation" type="{http://www.pharmml.org/2013/03/ModelDefinition}LhsTransformationType" minOccurs="0"/>
 *         &lt;element name="Output">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ErrorModel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResidualError">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated GaussianObsError has been renamed to {@link StructuredObsError}.
 */
@Deprecated
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GaussianObsError", propOrder = {
    "transformation",
    "output",
    "errorModel",
    "residualError"
})
public class GaussianObsError
    extends ObservationError
{

    @XmlElement(name = "Transformation")
    protected LhsTransformation transformation;
    @XmlElement(name = "Output", required = true)
    protected GaussianObsError.Output output;
    @XmlElement(name = "ErrorModel", required = true)
    protected GaussianObsError.ErrorModel errorModel;
    @XmlElement(name = "ResidualError", required = true)
    protected GaussianObsError.ResidualError residualError;

    /**
     * Gets the value of the transformation property.
     * 
     * @return
     *     possible object is
     *     {@link LhsTransformation }
     *     
     */
    public LhsTransformation getTransformation() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LhsTransformation }
     *     
     */
    public void setTransformation(LhsTransformation value) {
        this.transformation = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link GaussianObsError.Output }
     *     
     */
    public GaussianObsError.Output getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link GaussianObsError.Output }
     *     
     */
    public void setOutput(GaussianObsError.Output value) {
        this.output = value;
    }

    /**
     * Gets the value of the errorModel property.
     * 
     * @return
     *     possible object is
     *     {@link GaussianObsError.ErrorModel }
     *     
     */
    public GaussianObsError.ErrorModel getErrorModel() {
        return errorModel;
    }

    /**
     * Sets the value of the errorModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GaussianObsError.ErrorModel }
     *     
     */
    public void setErrorModel(GaussianObsError.ErrorModel value) {
        this.errorModel = value;
    }

    /**
     * Gets the value of the residualError property.
     * 
     * @return
     *     possible object is
     *     {@link GaussianObsError.ResidualError }
     *     
     */
    public GaussianObsError.ResidualError getResidualError() {
        return residualError;
    }

    /**
     * Sets the value of the residualError property.
     * 
     * @param value
     *     allowed object is
     *     {@link GaussianObsError.ResidualError }
     *     
     */
    public void setResidualError(GaussianObsError.ResidualError value) {
        this.residualError = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "assign"
    })
    @Deprecated
    public static class ErrorModel extends PharmMLElement {

        @XmlElement(name = "Assign", namespace = NS_DEFAULT_CT, required = true)
        protected Rhs assign;

        /**
         * Gets the value of the assign property.
         * 
         * @return
         *     possible object is
         *     {@link Rhs }
         *     
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
         */
        public void setAssign(Rhs value) {
            this.assign = value;
        }
        
        @Override
    	protected List<TreeNode> listChildren() {
    		return new ChainedList<TreeNode>()
    				.addIfNotNull(assign);
    	}
        
        @Override
		public PharmMLElement clone() {
			return clone(ErrorModel.class, this);
		}

		@Override
		public void accept(Visitor visitor) {
			visitor.visit(this);
			
		}

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "symbRef"
    })
    @Deprecated
    public static class Output extends PharmMLElement {

        @XmlElement(name = "SymbRef", namespace = NS_DEFAULT_CT, required = true)
        protected SymbolRef symbRef;

        /**
         * Gets the value of the symbRef property.
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
        
        @Override
    	protected List<TreeNode> listChildren() {
    		return new ChainedList<TreeNode>()
    				.addIfNotNull(symbRef);
    	}
        
        @Override
		public PharmMLElement clone() {
			return clone(Output.class, this);
		}

		@Override
		public void accept(Visitor visitor) {
			visitor.visit(this);
			
		}

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}SymbRef"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "symbRef"
    })
    @Deprecated
    public static class ResidualError extends PharmMLElement {

        @XmlElement(name = "SymbRef", namespace = NS_DEFAULT_CT, required = true)
        protected SymbolRef symbRef;

        /**
         * Gets the value of the symbRef property.
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
        
        @Override
    	protected List<TreeNode> listChildren() {
    		return new ChainedList<TreeNode>()
    				.addIfNotNull(symbRef);
    	}

		@Override
		public PharmMLElement clone() {
			return clone(ResidualError.class, this);
		}

		@Override
		public void accept(Visitor visitor) {
			visitor.visit(this);
			
		}

    }
    
    @Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>()
				.addIfNotNull(super.listChildren())
				.addIfNotNull(output)
				.addIfNotNull(errorModel)
				.addIfNotNull(residualError);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
