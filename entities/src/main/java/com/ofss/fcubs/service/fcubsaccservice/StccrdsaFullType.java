
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Stccrdsa-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stccrdsa-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sttms-Detail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REQUEST_REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CARDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUST_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CARD_PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRIMARY_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NAME_ON_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OWNER_ID_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CARD_ISSUED_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CARD_EXPIRY_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CARD_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECORD_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUTH_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CARD_BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Stccrdsa-Full-Type", propOrder = {
    "branchcode",
    "custno",
    "actno",
    "sttmsDetail"
})
public class StccrdsaFullType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_NO")
    protected String custno;
    @XmlElement(name = "ACTNO")
    protected String actno;
    @XmlElement(name = "Sttms-Detail")
    protected List<StccrdsaFullType.SttmsDetail> sttmsDetail;

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
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
     * Gets the value of the actno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTNO() {
        return actno;
    }

    /**
     * Sets the value of the actno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTNO(String value) {
        this.actno = value;
    }

    /**
     * Gets the value of the sttmsDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttmsDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttmsDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StccrdsaFullType.SttmsDetail }
     * 
     * 
     */
    public List<StccrdsaFullType.SttmsDetail> getSttmsDetail() {
        if (sttmsDetail == null) {
            sttmsDetail = new ArrayList<StccrdsaFullType.SttmsDetail>();
        }
        return this.sttmsDetail;
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
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REQUEST_REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CARDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUST_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CARD_PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRIMARY_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NAME_ON_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OWNER_ID_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CARD_ISSUED_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CARD_EXPIRY_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CARD_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECORD_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUTH_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CARD_BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "branchcode",
        "requestreferenceno",
        "cardno",
        "custno",
        "cardproduct",
        "primarycard",
        "nameoncard",
        "owneridno",
        "cardissueddt",
        "cardexpirydt",
        "cardstatus",
        "recordstat",
        "authstat",
        "cardbin",
        "custacno"
    })
    public static class SttmsDetail {

        @XmlElement(name = "BRANCH_CODE")
        protected String branchcode;
        @XmlElement(name = "REQUEST_REFERENCE_NO")
        protected String requestreferenceno;
        @XmlElement(name = "CARDNO")
        protected String cardno;
        @XmlElement(name = "CUST_NO")
        protected String custno;
        @XmlElement(name = "CARD_PRODUCT")
        protected String cardproduct;
        @XmlElement(name = "PRIMARY_CARD")
        protected String primarycard;
        @XmlElement(name = "NAME_ON_CARD")
        protected String nameoncard;
        @XmlElement(name = "OWNER_ID_NO")
        protected String owneridno;
        @XmlElement(name = "CARD_ISSUED_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar cardissueddt;
        @XmlElement(name = "CARD_EXPIRY_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar cardexpirydt;
        @XmlElement(name = "CARD_STATUS")
        protected String cardstatus;
        @XmlElement(name = "RECORD_STAT")
        protected String recordstat;
        @XmlElement(name = "AUTH_STAT")
        protected String authstat;
        @XmlElement(name = "CARD_BIN")
        protected String cardbin;
        @XmlElement(name = "CUST_AC_NO")
        protected String custacno;

        /**
         * Gets the value of the branchcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRANCHCODE() {
            return branchcode;
        }

        /**
         * Sets the value of the branchcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRANCHCODE(String value) {
            this.branchcode = value;
        }

        /**
         * Gets the value of the requestreferenceno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTREFERENCENO() {
            return requestreferenceno;
        }

        /**
         * Sets the value of the requestreferenceno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTREFERENCENO(String value) {
            this.requestreferenceno = value;
        }

        /**
         * Gets the value of the cardno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDNO() {
            return cardno;
        }

        /**
         * Sets the value of the cardno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDNO(String value) {
            this.cardno = value;
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
         * Gets the value of the cardproduct property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDPRODUCT() {
            return cardproduct;
        }

        /**
         * Sets the value of the cardproduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDPRODUCT(String value) {
            this.cardproduct = value;
        }

        /**
         * Gets the value of the primarycard property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRIMARYCARD() {
            return primarycard;
        }

        /**
         * Sets the value of the primarycard property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRIMARYCARD(String value) {
            this.primarycard = value;
        }

        /**
         * Gets the value of the nameoncard property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAMEONCARD() {
            return nameoncard;
        }

        /**
         * Sets the value of the nameoncard property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAMEONCARD(String value) {
            this.nameoncard = value;
        }

        /**
         * Gets the value of the owneridno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOWNERIDNO() {
            return owneridno;
        }

        /**
         * Sets the value of the owneridno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOWNERIDNO(String value) {
            this.owneridno = value;
        }

        /**
         * Gets the value of the cardissueddt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCARDISSUEDDT() {
            return cardissueddt;
        }

        /**
         * Sets the value of the cardissueddt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCARDISSUEDDT(XMLGregorianCalendar value) {
            this.cardissueddt = value;
        }

        /**
         * Gets the value of the cardexpirydt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCARDEXPIRYDT() {
            return cardexpirydt;
        }

        /**
         * Sets the value of the cardexpirydt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCARDEXPIRYDT(XMLGregorianCalendar value) {
            this.cardexpirydt = value;
        }

        /**
         * Gets the value of the cardstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDSTATUS() {
            return cardstatus;
        }

        /**
         * Sets the value of the cardstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDSTATUS(String value) {
            this.cardstatus = value;
        }

        /**
         * Gets the value of the recordstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECORDSTAT() {
            return recordstat;
        }

        /**
         * Sets the value of the recordstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECORDSTAT(String value) {
            this.recordstat = value;
        }

        /**
         * Gets the value of the authstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTHSTAT() {
            return authstat;
        }

        /**
         * Sets the value of the authstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTHSTAT(String value) {
            this.authstat = value;
        }

        /**
         * Gets the value of the cardbin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDBIN() {
            return cardbin;
        }

        /**
         * Sets the value of the cardbin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDBIN(String value) {
            this.cardbin = value;
        }

        /**
         * Gets the value of the custacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTACNO() {
            return custacno;
        }

        /**
         * Sets the value of the custacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTACNO(String value) {
            this.custacno = value;
        }

    }

}
