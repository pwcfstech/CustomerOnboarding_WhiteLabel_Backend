
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACSTMTType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ACSTMTType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACSTMTType")
@XmlEnum
public enum ACSTMTType {

    D,
    S,
    N;

    public String value() {
        return name();
    }

    public static ACSTMTType fromValue(String v) {
        return valueOf(v);
    }

}
