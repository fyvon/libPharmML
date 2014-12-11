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


package eu.ddmore.libpharmml.dom.commontypes;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The definition of a non-uniform sequence of numbers. The vector is an ordered list of
 *             values. The values of the sequence element are inserted into the vector at the point of definition.
 *             For example, take the vector (the [] brackets denote a sequence): 0, 4, [0:1:3], 33. Inserting the 
 *             sequence gives us the vector of values: 0, 4, 0, 1, 2, 3, 33. 
 *             
 * 
 * <p>Java class for VectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VectorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Sequence"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/CommonTypes}Scalar"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VectorType", propOrder = {
	"vectorElements",
	"vectorCellOrVectorSegment",
    "sequenceOrScalar"
})
@XmlSeeAlso({
	Vector.class,
	VectorSegment.class
})
@XmlJavaTypeAdapter(VectorType.Adapter.class)
public class VectorType extends AbstractVector {
	
	// deprecated since 0.3.2
	@XmlElementRefs({
		@XmlElementRef(name = "Sequence", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Scalar", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class, required = false)
	})
	protected List<JAXBElement<?>> sequenceOrScalar;
	// ----------
    
    @XmlElements({
        @XmlElement(name = "VectorCell", type = VectorCell.class),
        @XmlElement(name = "VectorSegment", type = VectorSegment.class)
    })
    protected List<PharmMLRootType> vectorCellOrVectorSegment;
        
    @XmlAttribute(name = "length")
    protected Integer length;
    
    /**
     * Empty constructor
     * 
     * @deprecated Construct a {@link Vector} instead.
     */
    @Deprecated
    public VectorType(){
    	
    }
    
    /**
     * For internal purpose
     */
    protected VectorType(int a){}
    
    /**
     * Gets the value of the sequenceOrScalar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceOrScalar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceOrScalar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IdValue }{@code >}
     * {@link JAXBElement }{@code <}{@link FalseBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link SequenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     * {@link JAXBElement }{@code <}{@link IntValue }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     * {@link JAXBElement }{@code <}{@link TrueBoolean }{@code >}
     * 
     * 
     */
    @Deprecated
    public List<JAXBElement<?>> getSequenceOrScalar() {
        if (sequenceOrScalar == null) {
            sequenceOrScalar = new ArrayList<JAXBElement<?>>();
        }
        return this.sequenceOrScalar;
    }
    
   
    public List<PharmMLRootType> getListOfVectorCellAndSegment(){
    	if(vectorCellOrVectorSegment == null){
    		vectorCellOrVectorSegment = new ArrayList<PharmMLRootType>();
    	}
    	return vectorCellOrVectorSegment;
    }
    
    public Integer getLength(){
    	return this.length;
    }
    
    public void setLength(int length){
    	this.length = length;
    }
    
    /**
     * For marshalling a VectorType as a Vector.
     */
    protected static class Adapter extends XmlAdapter<VectorType, VectorType>{

		@Override
		public VectorType unmarshal(VectorType vt) throws Exception {
			Vector v = new Vector();
			v.defaultValue = vt.defaultValue;
			v.description = vt.description;
			v.id = vt.id;
			v.length = vt.length;
			v.sequenceOrScalar = vt.sequenceOrScalar;
			v.vectorCellOrVectorSegment = vt.vectorCellOrVectorSegment;
			v.vectorElements = vt.vectorElements;
			return v;
		}

		@Override
		public VectorType marshal(VectorType v) throws Exception {
			return v;
		}

    	
    }

}
