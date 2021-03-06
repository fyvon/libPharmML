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
package eu.ddmore.libpharmml.dom.trialdesign;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.tags.PharmMLObject;
import eu.ddmore.libpharmml.util.ChainedList;
import eu.ddmore.libpharmml.visitor.Visitor;


/**
 * 
 *                     Type defining a combination of samplings.  
 *                 
 * 
 * <p>Java class for ObservationsCombinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationsCombinationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.7/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="Observations" type="{http://www.pharmml.org/pharmml/0.7/TrialDesign}SingleObservationType" maxOccurs="unbounded"/>
 *         &lt;element name="Relative" type="{http://www.pharmml.org/pharmml/0.7/TrialDesign}RelativeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/pharmml/0.7/CommonTypes}OidDefnGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @since PharmML 0.7
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationsCombinationType", propOrder = {
    "listOfObservations",
    "relative"
})
public class ObservationsCombination
    extends PharmMLRootType implements PharmMLObject
{

    @XmlElement(name = "Observations", required = true)
    protected List<SingleObservation> listOfObservations;
    @XmlElement(name = "Relative")
    protected String relative;
    @XmlAttribute(name = "oid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    
    public ObservationsCombination(){}
    
    public ObservationsCombination(String oid){
    	this.oid = oid;
    }

    /**
     * Gets the value of the observations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfObservations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleObservation }
     * 
     * 
     */
    public List<SingleObservation> getListOfObservations() {
        if (listOfObservations == null) {
        	listOfObservations = new ArrayList<SingleObservation>();
        }
        return this.listOfObservations;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelative(String value) {
        this.relative = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
	public void setOid(String value) {
        this.oid = value;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(listOfObservations);
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
