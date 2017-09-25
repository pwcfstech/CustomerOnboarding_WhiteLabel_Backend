
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegDPerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegDPerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegDPerType")
@XmlEnum
public enum RegDPerType {

    N,
    M,
    S;

    public String value() {
        return name();
    }

    public static RegDPerType fromValue(String v) {
        return valueOf(v);
    }

}
