
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cscofacm-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cscofacm-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extsys-Ws-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="USERREMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cscofacm-Create-IO-Type", propOrder = {
    "keyid",
    "extsysWsDetails"
})
public class CscofacmCreateIOType {

    @XmlElement(name = "KEYID")
    protected String keyid;
    @XmlElement(name = "Extsys-Ws-Details")
    protected List<CscofacmCreateIOType.ExtsysWsDetails> extsysWsDetails;

    /**
     * Gets the value of the keyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYID() {
        return keyid;
    }

    /**
     * Sets the value of the keyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYID(String value) {
        this.keyid = value;
    }

    /**
     * Gets the value of the extsysWsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extsysWsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtsysWsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CscofacmCreateIOType.ExtsysWsDetails }
     * 
     * 
     */
    public List<CscofacmCreateIOType.ExtsysWsDetails> getExtsysWsDetails() {
        if (extsysWsDetails == null) {
            extsysWsDetails = new ArrayList<CscofacmCreateIOType.ExtsysWsDetails>();
        }
        return this.extsysWsDetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="USERREMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userremarks"
    })
    public static class ExtsysWsDetails {

        @XmlElement(name = "USERREMARKS")
        protected String userremarks;

        /**
         * Gets the value of the userremarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERREMARKS() {
            return userremarks;
        }

        /**
         * Sets the value of the userremarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSERREMARKS(String value) {
            this.userremarks = value;
        }

    }

}
