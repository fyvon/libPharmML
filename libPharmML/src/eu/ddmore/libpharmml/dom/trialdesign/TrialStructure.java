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


package eu.ddmore.libpharmml.dom.trialdesign;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                 Type that defines the structure of the study.  
 *             
 * 
 * <p>Java class for TrialStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrialStructureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="Epoch" type="{http://www.pharmml.org/2013/03/TrialDesign}EpochDefnType" maxOccurs="unbounded"/>
 *         &lt;element name="Arm" type="{http://www.pharmml.org/2013/03/TrialDesign}ArmDefnType" maxOccurs="unbounded"/>
 *         &lt;element name="Cell" type="{http://www.pharmml.org/2013/03/TrialDesign}CellDefnType" maxOccurs="unbounded"/>
 *         &lt;element name="Segment" type="{http://www.pharmml.org/2013/03/TrialDesign}SegmentDefnType" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/TrialDesign}Activity" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.pharmml.org/2013/03/TrialDesign}StudyEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated Since PharmML 0.7, {@link TrialDesign} structure has been completely redefined. See PharmML
 * 0.7 change document, chapter 5.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrialStructureType", propOrder = {
    "epoch",
    "arm",
    "cell",
    "segment",
    "activity",
    "studyEvent"
})
@Deprecated
public class TrialStructure
    extends PharmMLRootType
{

    @XmlElement(name = "Epoch", required = true)
    protected List<EpochDefinition> epoch;
    @XmlElement(name = "Arm", required = true)
    protected List<ArmDefinition> arm;
    @XmlElement(name = "Cell", required = true)
    protected List<CellDefinition> cell;
    @XmlElement(name = "Segment", required = true)
    protected List<SegmentDefinition> segment;
    @XmlElement(name = "Activity", required = true)
    protected List<Activity> activity;
    @XmlElementRef(name = "StudyEvent", namespace = NS_DEFAULT_TD, type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends StudyEvent>> studyEvent;

    /**
     * Gets the value of the epoch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the epoch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpoch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EpochDefinition }
     * 
     * 
     */
    public List<EpochDefinition> getEpoch() {
        if (epoch == null) {
            epoch = new ArrayList<EpochDefinition>();
        }
        return this.epoch;
    }

    /**
     * Gets the value of the arm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArmDefinition }
     * 
     * 
     */
    public List<ArmDefinition> getArm() {
        if (arm == null) {
            arm = new ArrayList<ArmDefinition>();
        }
        return this.arm;
    }

    /**
     * Gets the value of the cell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellDefinition }
     * 
     * 
     */
    public List<CellDefinition> getCell() {
        if (cell == null) {
            cell = new ArrayList<CellDefinition>();
        }
        return this.cell;
    }

    /**
     * Gets the value of the segment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentDefinition }
     * 
     * 
     */
    public List<SegmentDefinition> getSegment() {
        if (segment == null) {
            segment = new ArrayList<SegmentDefinition>();
        }
        return this.segment;
    }

    /**
     * 
     *                                 Defines an activity in the study.   
     *                             Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<Activity>();
        }
        return this.activity;
    }

    /**
     * 
     *                                 Defines a study event. Typically an Observation Event.  
     *                             Gets the value of the studyEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Observations }{@code >}
     * {@link JAXBElement }{@code <}{@link StudyEvent }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends StudyEvent>> getStudyEvent() {
        if (studyEvent == null) {
            studyEvent = new ArrayList<JAXBElement<? extends StudyEvent>>();
        }
        return this.studyEvent;
    }
    
    @Override
	protected List<TreeNode> listChildren() {
		List<TreeNode> list = new ChainedList<TreeNode>()
				.addIfNotNull(epoch)
				.addIfNotNull(arm)
				.addIfNotNull(cell)
				.addIfNotNull(segment)
				.addIfNotNull(activity);
		for(JAXBElement<? extends StudyEvent> el : getStudyEvent()){
			list.add(el.getValue());
		}
		return list;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
