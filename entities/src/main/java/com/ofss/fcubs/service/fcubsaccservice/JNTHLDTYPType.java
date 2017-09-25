
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JNTHLDTYPType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JNTHLDTYPType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUS"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="CUS"/>
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="GUA"/>
 *     &lt;enumeration value="GUR"/>
 *     &lt;enumeration value="JAF"/>
 *     &lt;enumeration value="JAO"/>
 *     &lt;enumeration value="JOF"/>
 *     &lt;enumeration value="JOO"/>
 *     &lt;enumeration value="NOM"/>
 *     &lt;enumeration value="REL"/>
 *     &lt;enumeration value="SOL"/>
 *     &lt;enumeration value="SOW"/>
 *     &lt;enumeration value="THR"/>
 *     &lt;enumeration value="TRU"/>
 *     &lt;enumeration value="VAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JNTHLDTYPType")
@XmlEnum
public enum JNTHLDTYPType {

    AUS,
    CON,
    CUS,
    DEV,
    GUA,
    GUR,
    JAF,
    JAO,
    JOF,
    JOO,
    NOM,
    REL,
    SOL,
    SOW,
    THR,
    TRU,
    VAL;

    public String value() {
        return name();
    }

    public static JNTHLDTYPType fromValue(String v) {
        return valueOf(v);
    }

}
