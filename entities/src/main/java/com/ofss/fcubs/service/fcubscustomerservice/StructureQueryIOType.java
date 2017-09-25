
package com.ofss.fcubs.service.fcubscustomerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Structure-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Structure-Query-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STRUCTG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Structure-Query-IO-Type", propOrder = {
    "structg"
})
public class StructureQueryIOType {

    @XmlElement(name = "STRUCTG", required = true)
    protected String structg;

    /**
     * Gets the value of the structg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRUCTG() {
        return structg;
    }

    /**
     * Sets the value of the structg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRUCTG(String value) {
        this.structg = value;
    }

}
