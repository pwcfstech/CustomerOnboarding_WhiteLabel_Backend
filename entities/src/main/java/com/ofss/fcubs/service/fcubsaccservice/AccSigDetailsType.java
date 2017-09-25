
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccSigDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccSigDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINNOSIG" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Sigdets" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SIGID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="SIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SOLOSIG" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="APPROVLIMIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="SIGMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SIGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AccSigDetailsType", propOrder = {
    "accmsg",
    "minnosig",
    "sigdets"
})
public class AccSigDetailsType {

    @XmlElement(name = "ACCMSG")
    protected String accmsg;
    @XmlElement(name = "MINNOSIG")
    protected BigInteger minnosig;
    @XmlElement(name = "Sigdets")
    protected List<AccSigDetailsType.Sigdets> sigdets;

    /**
     * Gets the value of the accmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCMSG() {
        return accmsg;
    }

    /**
     * Sets the value of the accmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCMSG(String value) {
        this.accmsg = value;
    }

    /**
     * Gets the value of the minnosig property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMINNOSIG() {
        return minnosig;
    }

    /**
     * Sets the value of the minnosig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMINNOSIG(BigInteger value) {
        this.minnosig = value;
    }

    /**
     * Gets the value of the sigdets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sigdets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigdets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccSigDetailsType.Sigdets }
     * 
     * 
     */
    public List<AccSigDetailsType.Sigdets> getSigdets() {
        if (sigdets == null) {
            sigdets = new ArrayList<AccSigDetailsType.Sigdets>();
        }
        return this.sigdets;
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
     *         &lt;element name="SIGID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="SIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SOLOSIG" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="APPROVLIMIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="SIGMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SIGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "sigid",
        "sigtype",
        "solosig",
        "approvlimit",
        "sigmsg",
        "signame"
    })
    public static class Sigdets {

        @XmlElement(name = "SIGID")
        protected Object sigid;
        @XmlElement(name = "SIGTYPE")
        protected String sigtype;
        @XmlElement(name = "SOLOSIG", required = true)
        protected BigInteger solosig;
        @XmlElement(name = "APPROVLIMIT")
        protected Object approvlimit;
        @XmlElement(name = "SIGMSG")
        protected String sigmsg;
        @XmlElement(name = "SIGNAME")
        protected String signame;

        /**
         * Gets the value of the sigid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSIGID() {
            return sigid;
        }

        /**
         * Sets the value of the sigid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSIGID(Object value) {
            this.sigid = value;
        }

        /**
         * Gets the value of the sigtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGTYPE() {
            return sigtype;
        }

        /**
         * Sets the value of the sigtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGTYPE(String value) {
            this.sigtype = value;
        }

        /**
         * Gets the value of the solosig property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSOLOSIG() {
            return solosig;
        }

        /**
         * Sets the value of the solosig property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSOLOSIG(BigInteger value) {
            this.solosig = value;
        }

        /**
         * Gets the value of the approvlimit property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAPPROVLIMIT() {
            return approvlimit;
        }

        /**
         * Sets the value of the approvlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAPPROVLIMIT(Object value) {
            this.approvlimit = value;
        }

        /**
         * Gets the value of the sigmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGMSG() {
            return sigmsg;
        }

        /**
         * Sets the value of the sigmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGMSG(String value) {
            this.sigmsg = value;
        }

        /**
         * Gets the value of the signame property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGNAME() {
            return signame;
        }

        /**
         * Sets the value of the signame property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGNAME(String value) {
            this.signame = value;
        }

    }

}
