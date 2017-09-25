
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IntLiqdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntLiqdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INTPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NXTLIQDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntLiqdType", propOrder = {
    "intprd",
    "nxtliqdt"
})
public class IntLiqdType {

    @XmlElement(name = "INTPRD")
    protected String intprd;
    @XmlElement(name = "NXTLIQDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtliqdt;

    /**
     * Gets the value of the intprd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTPRD() {
        return intprd;
    }

    /**
     * Sets the value of the intprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTPRD(String value) {
        this.intprd = value;
    }

    /**
     * Gets the value of the nxtliqdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNXTLIQDT() {
        return nxtliqdt;
    }

    /**
     * Sets the value of the nxtliqdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNXTLIQDT(XMLGregorianCalendar value) {
        this.nxtliqdt = value;
    }

}
