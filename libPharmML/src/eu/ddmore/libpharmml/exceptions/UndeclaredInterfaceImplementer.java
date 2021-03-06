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
package eu.ddmore.libpharmml.exceptions;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class UndeclaredInterfaceImplementer extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6709822764061769834L;
	
	public UndeclaredInterfaceImplementer(XmlAdapter<?,?> adapter, Object suspect){
		super("Undeclared class of "+suspect+" in adapter "+adapter.getClass());
	}

}
