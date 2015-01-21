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
// Generated on: 2014.03.24 at 03:18:36 PM GMT 
//


package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.Rhs;


/**
 * Describes an individual parameter. Three encodings of a parameter model are available:
 *                 Type 1. explicit equation type of parameter model
 *                 psi_i = H(beta, c_i, eta_i)
 *                 
 *                 Type 2. Gaussian model with general covariate model
 *                 h(psi_i) = H(beta, c_i) + eta_i
 *                 
 *                 Type 3. Gaussian model with linear covariate model
 *                 h(psi_i) = h(psi_pop) + beta c_i + eta_i
 *             
 * 
 * <p>Java class for IndividualParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualParameterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/ModelDefinition}CommonParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="GaussianModel">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *                   &lt;sequence>
 *                     &lt;element name="Transformation" type="{http://www.pharmml.org/2013/03/ModelDefinition}LRHSTransformationType" minOccurs="0"/>
 *                     &lt;choice>
 *                       &lt;element name="LinearCovariate">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *                               &lt;sequence>
 *                                 &lt;element name="PopulationParameter">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *                                         &lt;sequence>
 *                                           &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
 *                                         &lt;/sequence>
 *                                       &lt;/extension>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="Covariate" type="{http://www.pharmml.org/2013/03/ModelDefinition}CovariateRelationType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="GeneralCovariate">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *                               &lt;sequence>
 *                                 &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
 *                               &lt;/sequence>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                     &lt;element name="RandomEffects" type="{http://www.pharmml.org/2013/03/ModelDefinition}ParameterRandomEffectType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
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
@XmlType(name = "IndividualParameterType", propOrder = {
    "gaussianModel",
    "assign"
})
public class IndividualParameterType
    extends CommonParameter
{

    @XmlElement(name = "GaussianModel")
    protected IndividualParameterType.GaussianModel gaussianModel;
    @XmlElement(name = "Assign", namespace = "http://www.pharmml.org/2013/03/CommonTypes")
    protected Rhs assign;

    /**
     * Gets the value of the gaussianModel property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualParameterType.GaussianModel }
     *     
     */
    public IndividualParameterType.GaussianModel getGaussianModel() {
        return gaussianModel;
    }

    /**
     * Sets the value of the gaussianModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualParameterType.GaussianModel }
     *     
     */
    public void setGaussianModel(IndividualParameterType.GaussianModel value) {
        this.gaussianModel = value;
    }

    /**
     * 
     *                                     The explicit, type 1, definition of an individual parameter. This defines H and can contain references to one or more random variables.
     *                                 
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
     *       &lt;sequence>
     *         &lt;element name="Transformation" type="{http://www.pharmml.org/2013/03/ModelDefinition}LRHSTransformationType" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="LinearCovariate">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
     *                   &lt;sequence>
     *                     &lt;element name="PopulationParameter">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
     *                             &lt;sequence>
     *                               &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
     *                             &lt;/sequence>
     *                           &lt;/extension>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="Covariate" type="{http://www.pharmml.org/2013/03/ModelDefinition}CovariateRelationType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="GeneralCovariate">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
     *                   &lt;sequence>
     *                     &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
     *                   &lt;/sequence>
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="RandomEffects" type="{http://www.pharmml.org/2013/03/ModelDefinition}ParameterRandomEffectType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transformation",
        "linearCovariate",
        "generalCovariate",
        "randomEffects"
    })
    public static class GaussianModel
        extends PharmMLRootType
    {

        @XmlElement(name = "Transformation")
        protected LhsTransformationType transformation;
        @XmlElement(name = "LinearCovariate")
        protected IndividualParameterType.GaussianModel.LinearCovariate linearCovariate;
        @XmlElement(name = "GeneralCovariate")
        protected IndividualParameterType.GaussianModel.GeneralCovariate generalCovariate;
        @XmlElement(name = "RandomEffects", required = true)
        protected List<ParameterRandomEffectType> randomEffects;

        /**
         * Gets the value of the transformation property.
         * 
         * @return
         *     possible object is
         *     {@link LhsTransformationType }
         *     
         */
        public LhsTransformationType getTransformation() {
            return transformation;
        }

        /**
         * Sets the value of the transformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link LhsTransformationType }
         *     
         */
        public void setTransformation(LhsTransformationType value) {
            this.transformation = value;
        }

        /**
         * Gets the value of the linearCovariate property.
         * 
         * @return
         *     possible object is
         *     {@link IndividualParameterType.GaussianModel.LinearCovariate }
         *     
         */
        public IndividualParameterType.GaussianModel.LinearCovariate getLinearCovariate() {
            return linearCovariate;
        }

        /**
         * Sets the value of the linearCovariate property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndividualParameterType.GaussianModel.LinearCovariate }
         *     
         */
        public void setLinearCovariate(IndividualParameterType.GaussianModel.LinearCovariate value) {
            this.linearCovariate = value;
        }

        /**
         * Gets the value of the generalCovariate property.
         * 
         * @return
         *     possible object is
         *     {@link IndividualParameterType.GaussianModel.GeneralCovariate }
         *     
         */
        public IndividualParameterType.GaussianModel.GeneralCovariate getGeneralCovariate() {
            return generalCovariate;
        }

        /**
         * Sets the value of the generalCovariate property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndividualParameterType.GaussianModel.GeneralCovariate }
         *     
         */
        public void setGeneralCovariate(IndividualParameterType.GaussianModel.GeneralCovariate value) {
            this.generalCovariate = value;
        }

        /**
         * Gets the value of the randomEffects property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the randomEffects property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRandomEffects().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParameterRandomEffectType }
         * 
         * @since PharmML 0.3. This method returned an indivual element before.
         */
        public List<ParameterRandomEffectType> getRandomEffects() {
            if (randomEffects == null) {
                randomEffects = new ArrayList<ParameterRandomEffectType>();
            }
            return this.randomEffects;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
         *       &lt;/sequence>
         *     &lt;/extension>
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
        public static class GeneralCovariate
            extends PharmMLRootType
        {

            @XmlElement(name = "Assign", namespace = "http://www.pharmml.org/2013/03/CommonTypes", required = true)
            protected Rhs assign;

            /**
             * 
             *                                                                 The general covariate definition. Note that this should NOT contain references to a random variable. You should use an explicit (type 3) parameter definition to do that.
             *                                                             
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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
         *       &lt;sequence>
         *         &lt;element name="PopulationParameter">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Covariate" type="{http://www.pharmml.org/2013/03/ModelDefinition}CovariateRelationType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "populationParameter",
            "covariate"
        })
        public static class LinearCovariate
            extends PharmMLRootType
        {

            @XmlElement(name = "PopulationParameter", required = true)
            protected IndividualParameterType.GaussianModel.LinearCovariate.PopulationParameter populationParameter;
            @XmlElement(name = "Covariate")
            protected List<CovariateRelation> covariate;

            /**
             * Gets the value of the populationParameter property.
             * 
             * @return
             *     possible object is
             *     {@link IndividualParameterType.GaussianModel.LinearCovariate.PopulationParameter }
             *     
             */
            public IndividualParameterType.GaussianModel.LinearCovariate.PopulationParameter getPopulationParameter() {
                return populationParameter;
            }

            /**
             * Sets the value of the populationParameter property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndividualParameterType.GaussianModel.LinearCovariate.PopulationParameter }
             *     
             */
            public void setPopulationParameter(IndividualParameterType.GaussianModel.LinearCovariate.PopulationParameter value) {
                this.populationParameter = value;
            }

            /**
             * Gets the value of the covariate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the covariate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCovariate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CovariateRelation }
             * 
             * 
             */
            public List<CovariateRelation> getCovariate() {
                if (covariate == null) {
                    covariate = new ArrayList<CovariateRelation>();
                }
                return this.covariate;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
             *       &lt;sequence>
             *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Assign"/>
             *       &lt;/sequence>
             *     &lt;/extension>
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
            public static class PopulationParameter
                extends PharmMLRootType
            {

                @XmlElement(name = "Assign", namespace = "http://www.pharmml.org/2013/03/CommonTypes", required = true)
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

            }

        }

    }

}
