
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACSTMTCycleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ACSTMTCycleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACSTMTCycleType")
@XmlEnum
public enum ACSTMTCycleType {

    A,
    S,
    Q,
    M,
    F,
    W,
    D;

    public String value() {
        return name();
    }

    public static ACSTMTCycleType fromValue(String v) {
        return valueOf(v);
    }

}
