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


package eu.ddmore.libpharmml.dom.modeldefn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;


/**
 * Type definig the list of categories. Categories can be assinged automatically by a tool.
 *                 The mapping between their names and symbols used in a dataset happens in the ModellingSteps/DataSet. 
 *                 This keeps categories definition uncoupled from the data
 *                 
 * <p>This class implements {@link List} of {@link CommonDiscreteVariable}. Unlike a classic list,
 * a ListOfCategoriesType XML element is marshalled as a wrapper for all categories within.
 * This allows to add an id to the ListOfCategories, as this class extends {@link PharmMLRootType}.
 * 
 * <p>Java class for ListOfCategoriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCategoriesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{http://www.pharmml.org/2013/03/ModelDefinition}CommonDiscreteVariableType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCategoriesType", propOrder = {
    "category"
})
public class ListOfCategories implements List<CommonDiscreteVariable>
{

    @XmlElement(name = "Category", required = true)
    protected List<CommonDiscreteVariable> category;
    
    /**
     * Empty constructor
     */
    public ListOfCategories(){
    	category = new ArrayList<CommonDiscreteVariable>();
    }
    
    /**
     * Create an instance of ListOfCategories from a common {@link List} of categories.
     * @param list
     */
    public ListOfCategories(List<CommonDiscreteVariable> list){
    	category = list;
    }
    
    /**
     * Create an intance of ListOfCategories from an array of symbol ids.
     * For each symbol id, a {@link CommonDiscreteVariable} instance is created
     * and added to the list.
     * @param symbols An array of {@link String} containing symbol ids.
     */
    public ListOfCategories(String []symbols){
    	this();
    	for(String symbId : symbols){
    		CommonDiscreteVariable cat = new CommonDiscreteVariable();
    		cat.setSymbId(symbId);
    		category.add(cat);
    	}
    }

	@Override
	public int size() {
		return category.size();
	}

	@Override
	public boolean isEmpty() {
		return category.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return category.contains(o);
	}

	@Override
	public Iterator<CommonDiscreteVariable> iterator() {
		return category.iterator();
	}

	@Override
	public Object[] toArray() {
		return category.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return category.toArray(a);
	}

	@Override
	public boolean add(CommonDiscreteVariable e) {
		return category.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return category.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return category.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends CommonDiscreteVariable> c) {
		return category.addAll(c);
	}

	@Override
	public boolean addAll(int index,
			Collection<? extends CommonDiscreteVariable> c) {
		return category.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return category.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return category.retainAll(c);
	}

	@Override
	public void clear() {
		category.clear();
	}

	@Override
	public CommonDiscreteVariable get(int index) {
		return category.get(index);
	}

	@Override
	public CommonDiscreteVariable set(int index, CommonDiscreteVariable element) {
		return category.set(index, element);
	}

	@Override
	public void add(int index, CommonDiscreteVariable element) {
		category.add(index, element);
	}

	@Override
	public CommonDiscreteVariable remove(int index) {
		return category.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return category.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return category.lastIndexOf(o);
	}

	@Override
	public ListIterator<CommonDiscreteVariable> listIterator() {
		return category.listIterator();
	}

	@Override
	public ListIterator<CommonDiscreteVariable> listIterator(int index) {
		return category.listIterator(index);
	}

	@Override
	public ListOfCategories subList(int fromIndex, int toIndex) {
		return new ListOfCategories(category.subList(fromIndex, toIndex));
	}

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonDiscreteVariable }
     * 
     * 
     */
//    public List<CommonDiscreteVariable> getCategory() {
//        if (category == null) {
//            category = new ArrayList<CommonDiscreteVariable>();
//        }
//        return this.category;
//    }

}