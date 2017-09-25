
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProvCcyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProvCcyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProvCcyType")
@XmlEnum
public enum ProvCcyType {

    L,
    A;

    public String value() {
        return name();
    }

    public static ProvCcyType fromValue(String v) {
        return valueOf(v);
    }

}
