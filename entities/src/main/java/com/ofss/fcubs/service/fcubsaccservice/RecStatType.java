
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecStatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecStatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecStatType")
@XmlEnum
public enum RecStatType {

    O,
    C;

    public String value() {
        return name();
    }

    public static RecStatType fromValue(String v) {
        return valueOf(v);
    }

}
