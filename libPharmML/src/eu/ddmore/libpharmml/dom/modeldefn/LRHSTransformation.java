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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for LRHSTransformationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LRHSTransformationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="identity"/>
 *     &lt;enumeration value="log"/>
 *     &lt;enumeration value="logit"/>
 *     &lt;enumeration value="probit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
//@XmlType(name = "LRHSTransformationType")
@XmlEnum
public enum LRHSTransformation {


    /**
     * Identity transformation.
     * 
     */
    @XmlEnumValue("identity")
    IDENTITY("identity"),

    /**
     * Natural log transformation.
     * 
     */
    @XmlEnumValue("log")
    LOG("log"),

    /**
     * Logit transformation.
     * 
     */
    @XmlEnumValue("logit")
    LOGIT("logit"),

    /**
     * Probit transformation.
     * 
     */
    @XmlEnumValue("probit")
    PROBIT("probit");
    private final String value;

    LRHSTransformation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LRHSTransformation fromValue(String v) {
        for (LRHSTransformation c: LRHSTransformation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
