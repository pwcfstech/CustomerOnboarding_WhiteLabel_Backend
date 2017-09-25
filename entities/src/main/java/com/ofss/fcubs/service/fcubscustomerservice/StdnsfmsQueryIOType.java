
package com.ofss.fcubs.service.fcubscustomerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stdnsfms-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stdnsfms-Query-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stdnsfms-Query-IO-Type", propOrder = {
    "refno"
})
public class StdnsfmsQueryIOType {

    @XmlElement(name = "REF_NO")
    protected String refno;

    /**
     * Gets the value of the refno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFNO() {
        return refno;
    }

    /**
     * Sets the value of the refno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFNO(String value) {
        this.refno = value;
    }

}
