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
package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * Type defining the observation model.
 * 
 * <p>Java class for ContinuousObservationModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContinuousObservationModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/ModelDefinition}CommonObservationModelType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/ModelDefinition}ObservationError"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContinuousObservationModelType", propOrder = {
    "jaxbObservationError"
})
//@XmlJavaTypeAdapter(ContinuousObservationModel.Adapter.class)
public class ContinuousObservationModel
    extends CommonObservationModel
{

	// -------------
    @XmlElementRef(name = "ObservationError", namespace = NS_DEFAULT_MDEF, type = JAXBElement.class)
    protected JAXBElement<? extends ObservationError> jaxbObservationError;
    @XmlTransient
    protected ObservationError observationError;
    // -------------

    /**
     * Gets the value of the observationError property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationError }
     *     {@link GeneralObsError }
     *     {@link GaussianObsError }
     *     
     */
    public ObservationError getObservationError() {
        return observationError;
    }

//    /**
//     * Sets the value of the observationError property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link JAXBElement }{@code <}{@link ObservationErrorType }{@code >}
//     *     {@link JAXBElement }{@code <}{@link GeneralObsError }{@code >}
//     *     {@link JAXBElement }{@code <}{@link GaussianObsError }{@code >}
//     *     
//     */
//    public void setObservationError(JAXBElement<? extends ObservationErrorType> value) {
//        this.observationError = value;
//    }
    
    public void setObservationError(GeneralObsError obsError){
    	this.observationError = obsError;
    }
    
    /**
     * @deprecated Use {@link #setObservationError(StructuredObsError)}.
     */
    @Deprecated
    public void setObservationError(GaussianObsError obsError){
    	this.observationError = obsError;
    }
    
    public void setObservationError(StructuredObsError obsError){
    	this.observationError = obsError;
    }
    
    /**
     * Creates an empty {@link GeneralObsError} element, adds it to the current element and returns it.
     * @return The created {@link GeneralObsError} element.
     */
    public GeneralObsError createGeneralObsError(){
    	GeneralObsError obsError = new GeneralObsError();
    	this.observationError = obsError;
    	return obsError;
    }
    
    /**
     * Creates a {@link GeneralObsError} element, adds it to the current element and returns it.
     * @param symbolId The symbol id of the new element.
     * @return The created {@link GeneralObsError} element.
     */
    public GeneralObsError createGeneralObsError(String symbolId){
    	GeneralObsError obsError = createGeneralObsError();
    	obsError.setSymbId(symbolId);
    	return obsError;
    }
    
    /**
     * Creates an empty {@link GaussianObsError} element, adds it to the current element and returns it.
     * @return The created {@link GaussianObsError} element.
     * 
     * @deprecated Use {@link #createStructuredObsError()}.
     */
    @Deprecated
	public GaussianObsError createGaussianObsError(){
    	GaussianObsError obsError = new GaussianObsError();
    	this.observationError = obsError;
    	return obsError;
    }
    
    /**
     * Creates an empty {@link StructuredObsError} element, adds it to the current element and returns it.
     * @return The created {@link StructuredObsError} element.
     */
    public StructuredObsError createStructuredObsError(){
    	StructuredObsError obsError = new StructuredObsError();
    	this.observationError = obsError;
    	return obsError;
    }
    
    /**
     * Creates a {@link GaussianObsError} element, adds it to the current element and returns it.
     * @param symbolId The symbol id of the new element.
     * @return The created {@link GaussianObsError} element.
     * 
     * @deprecated Use {@link #createStructuredObsError(String)}.
     */
    @Deprecated
    public GaussianObsError createGaussianObsError(String symbolId){
    	GaussianObsError obsError = createGaussianObsError();
    	obsError.setSymbId(symbolId);
    	return obsError;
    }
    
    /**
     * Creates a {@link StructuredObsError} element, adds it to the current element and returns it.
     * @param symbolId The symbol id of the new element.
     * @return The created {@link StructuredObsError} element.
     */
    public StructuredObsError createStructuredObsError(String symbolId){
    	StructuredObsError obsError = createStructuredObsError();
    	obsError.setSymbId(symbolId);
    	return obsError;
    }
    
    @Override
	protected void afterUnmarshal(Unmarshaller u, Object parent){
    	if(jaxbObservationError != null){
			observationError = jaxbObservationError.getValue();
		} else {
			observationError = null;
		}
    	super.afterUnmarshal(u, parent);
    }
    
    @Override
	protected void beforeMarshal(Marshaller m){
    	if(observationError != null){
			jaxbObservationError = MasterObjectFactory.createObservationError(observationError);
		} else {
			jaxbObservationError = null;
		}
    	super.beforeMarshal(m);
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>()
    			.addIfNotNull(super.listChildren())
    			.addIfNotNull(observationError);
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
    
//    protected static class Adapter extends XmlAdapter<ContinuousObservationModel, ContinuousObservationModel>{
//
//		@Override
//		public ContinuousObservationModel unmarshal(ContinuousObservationModel v)
//				throws Exception {
//			if(v.jaxbObservationError != null){
//				v.observationError = v.jaxbObservationError.getValue();
//			}
//			return v;
//		}
//
//		@Override
//		public ContinuousObservationModel marshal(ContinuousObservationModel v)
//				throws Exception {
//			if(v == null){
//				return null;
//			}
//			if(v.observationError != null){
//				v.jaxbObservationError = MasterObjectFactory.createObservationError(v.observationError);
//			}
//			return (ContinuousObservationModel) new CommonObservationModel.Adapter().marshal(v);
//		}
//    	
//    }

}
