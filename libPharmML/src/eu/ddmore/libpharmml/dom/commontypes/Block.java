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
package eu.ddmore.libpharmml.dom.commontypes;

public interface Block extends SymbolScope {
	
	/**
     * Gets the value of the blkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlkId();

    /**
     * Sets the value of the blkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlkId(String value);

}
