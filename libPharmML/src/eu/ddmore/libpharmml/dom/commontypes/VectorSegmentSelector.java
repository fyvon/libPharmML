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
// Generated on: 2014.07.21 at 11:29:00 AM BST 
//


package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This type specifies a vector segment.
 *             
 * 
 * <p>Java class for VectorSegmentSelectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VectorSegmentSelectorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="StartIndex" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *         &lt;element name="SegmentLength" type="{http://www.pharmml.org/2013/03/CommonTypes}MatrixVectorIndexType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VectorSegmentSelectorType", propOrder = {
    "startIndex",
    "segmentLength"
})
public class VectorSegmentSelector
    extends PharmMLRootType
{

//    @XmlElementRefs({
//        @XmlElementRef(name = "SegmentLength", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class),
//        @XmlElementRef(name = "StartIndex", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class)
//    })
//    protected List<JAXBElement<MatrixVectorIndex>> startIndexAndSegmentLength;
    
    @XmlElementRef(name = "StartIndex", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class)
    protected MatrixVectorIndex startIndex;
    @XmlElementRef(name = "SegmentLength", namespace = "http://www.pharmml.org/2013/03/CommonTypes", type = JAXBElement.class)
    protected MatrixVectorIndex segmentLength;

    /**
//     * Gets the value of the startIndexAndSegmentLength property.
//     * 
//     * <p>
//     * This accessor method returns a reference to the live list,
//     * not a snapshot. Therefore any modification you make to the
//     * returned list will be present inside the JAXB object.
//     * This is why there is not a <CODE>set</CODE> method for the startIndexAndSegmentLength property.
//     * 
//     * <p>
//     * For example, to add a new item, do as follows:
//     * <pre>
//     *    getStartIndexAndSegmentLength().add(newItem);
//     * </pre>
//     * 
//     * 
//     * <p>
//     * Objects of the following type(s) are allowed in the list
//     * {@link JAXBElement }{@code <}{@link MatrixVectorIndexType }{@code >}
//     * {@link JAXBElement }{@code <}{@link MatrixVectorIndexType }{@code >}
//     * 
//     * 
//     */
//    public List<JAXBElement<MatrixVectorIndex>> getStartIndexAndSegmentLength() {
//        if (startIndexAndSegmentLength == null) {
//            startIndexAndSegmentLength = new ArrayList<JAXBElement<MatrixVectorIndex>>();
//        }
//        return this.startIndexAndSegmentLength;
//    }
    
    /**
     * Empty constructor
     */
    public VectorSegmentSelector(){}
    
    /**
     * Creates a vector segment selector with start index and length as integers.
     * {@link MatrixVectorIndex} objects are created with the provided integers
     * for both startIndex and length elements.
     * @param startIndex Start index of the selector within the parent {@link VectorSelector}
     * @param length Length of the current {@link VectorSegmentSelector}
     */
    public VectorSegmentSelector(int startIndex, int length){
    	this();
    	createStartIndex(startIndex);
    	createSegmentLength(length);
    }
    
    public VectorSegmentSelector(MatrixVectorIndex startIndex, MatrixVectorIndex length){
    	this();
    	this.startIndex = startIndex;
    	this.segmentLength = length;
    }
    
    public MatrixVectorIndex getStartIndex(){
    	return this.startIndex;
    }
    
    public void setStartIndex(MatrixVectorIndex index){
    	this.startIndex = index;
    }
    
    public MatrixVectorIndex getSegmentLength(){
    	return this.segmentLength;
    }
    
    public void setSegmentLength(MatrixVectorIndex length){
    	this.segmentLength = length;
    }
    
    public MatrixVectorIndex createStartIndex(int index){
    	MatrixVectorIndex mvIndex = new MatrixVectorIndex();
    	mvIndex.setIntValue(new IntValue(index));
    	this.startIndex = mvIndex;
    	return mvIndex;
    }
    
    public MatrixVectorIndex createStartIndex(SymbolRef index){
    	MatrixVectorIndex mvIndex = new MatrixVectorIndex();
    	mvIndex.setSymbolRef(index);
    	this.startIndex = mvIndex;
    	return mvIndex;
    }
    
    public MatrixVectorIndex createSegmentLength(int length){
    	MatrixVectorIndex mvIndex = new MatrixVectorIndex();
    	mvIndex.setIntValue(new IntValue(length));
    	this.segmentLength = mvIndex;
    	return mvIndex;
    }
    
    public MatrixVectorIndex createSegmentLength(SymbolRef length){
    	MatrixVectorIndex mvIndex = new MatrixVectorIndex();
    	mvIndex.setSymbolRef(length);
    	this.segmentLength = mvIndex;
    	return mvIndex;
    }

}
