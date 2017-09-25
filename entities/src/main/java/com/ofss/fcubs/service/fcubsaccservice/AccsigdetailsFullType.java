
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accsigdetails-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accsigdetails-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINNOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accsigdetails" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SIGID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SIGMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="APPROVLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="SIGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SOLOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "Accsigdetails-Full-Type", propOrder = {
    "brn",
    "acc",
    "custno",
    "acdesc",
    "accmsg",
    "minnosig",
    "custname",
    "accsigdetails"
})
public class AccsigdetailsFullType {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "ACC", required = true)
    protected String acc;
    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "ACDESC")
    protected String acdesc;
    @XmlElement(name = "ACCMSG")
    protected String accmsg;
    @XmlElement(name = "MINNOSIG")
    protected BigDecimal minnosig;
    @XmlElement(name = "CUSTNAME")
    protected String custname;
    @XmlElement(name = "Accsigdetails")
    protected List<AccsigdetailsFullType.Accsigdetails> accsigdetails;

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the custno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNO() {
        return custno;
    }

    /**
     * Sets the value of the custno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNO(String value) {
        this.custno = value;
    }

    /**
     * Gets the value of the acdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDESC() {
        return acdesc;
    }

    /**
     * Sets the value of the acdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDESC(String value) {
        this.acdesc = value;
    }

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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINNOSIG() {
        return minnosig;
    }

    /**
     * Sets the value of the minnosig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINNOSIG(BigDecimal value) {
        this.minnosig = value;
    }

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNAME() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNAME(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the accsigdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accsigdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccsigdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccsigdetailsFullType.Accsigdetails }
     * 
     * 
     */
    public List<AccsigdetailsFullType.Accsigdetails> getAccsigdetails() {
        if (accsigdetails == null) {
            accsigdetails = new ArrayList<AccsigdetailsFullType.Accsigdetails>();
        }
        return this.accsigdetails;
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
     *         &lt;element name="SIGID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SIGMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="APPROVLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="SIGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SOLOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "sigmsg",
        "sigtype",
        "approvlimit",
        "signame",
        "solosig"
    })
    public static class Accsigdetails {

        @XmlElement(name = "SIGID", required = true)
        protected String sigid;
        @XmlElement(name = "SIGMSG")
        protected String sigmsg;
        @XmlElement(name = "SIGTYPE")
        protected String sigtype;
        @XmlElement(name = "APPROVLIMIT")
        protected BigDecimal approvlimit;
        @XmlElement(name = "SIGNAME")
        protected String signame;
        @XmlElement(name = "SOLOSIG")
        protected BigDecimal solosig;

        /**
         * Gets the value of the sigid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGID() {
            return sigid;
        }

        /**
         * Sets the value of the sigid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGID(String value) {
            this.sigid = value;
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
         * Gets the value of the approvlimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAPPROVLIMIT() {
            return approvlimit;
        }

        /**
         * Sets the value of the approvlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAPPROVLIMIT(BigDecimal value) {
            this.approvlimit = value;
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

        /**
         * Gets the value of the solosig property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSOLOSIG() {
            return solosig;
        }

        /**
         * Sets the value of the solosig property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSOLOSIG(BigDecimal value) {
            this.solosig = value;
        }

    }

}
