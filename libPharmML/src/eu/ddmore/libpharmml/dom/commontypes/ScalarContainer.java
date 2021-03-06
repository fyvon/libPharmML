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
package eu.ddmore.libpharmml.dom.commontypes;

import javax.xml.bind.annotation.XmlTransient;

/**
 * Interface for XML binded elements that contain a scalar value.
 * It provides a set of methods to create XML elements from primitive types.
 */
@XmlTransient
public interface ScalarContainer {

	/**
	 * Creates a {@link IntValue} element, adds it as a value to the current object and returns it.
	 * @param value Primitive value of the {@link IntValue} element.
	 * @return The created {@link IntValue} element.
	 */
	public IntValue createIntValue(int value);

	/**
	 * Creates a {@link RealValue} element, adds it as a value to the current object and returns it.
	 * @param value Primitive value of the {@link RealValue} element.
	 * @return The created {@link RealValue} element.
	 */
	public RealValue createRealValue(double value);

	/**
	 * Creates a {@link StringValue} element, adds it as a value to the current object and returns it.
	 * @param value Primitive value of the {@link StringValue} element.
	 * @return The created {@link StringValue} element.
	 */
	public StringValue createStringValue(String value);

	/**
	 * Creates a {@link IdValue} element, adds it as a value to the current object and returns it.
	 * @param value Primitive value of the {@link IdValue} element.
	 * @return The created {@link IdValue} element.
	 */
	public IdValue createIdValue(String value);

	/**
	 * Creates either a {@link TrueBoolean} or a {@link FalseBoolean} element, adds it as a value to the current object and returns it.
	 * @param value Primitive value of the {@link BooleanValue} element. If <b>true</b>, the return
	 * type will be {@link TrueBoolean}, else it will be {@link FalseBoolean}.
	 * @return The created {@link BooleanValue} element.
	 */
	public BooleanValue createBooleanValue(boolean value);
	
	/**
	 * Creates a {@link MissingValue} element with the given symbol.
	 * @param symbol The {@link MissingValueSymbol} of the missing value.
	 * @return The created {@link MissingValue} element.
	 */
	public MissingValue createMissingValue(MissingValueSymbol symbol);
	
}
