
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Csconevt-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Csconevt-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ac-Entries-Main" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Ac-Entries-Detail" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AMOUNT_TAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="VALUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Event-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EVENTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVENT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="EVENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Csconevt-Full-Type", propOrder = {
    "referenceno",
    "acEntriesMain",
    "eventDetails"
})
public class CsconevtFullType {

    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "Ac-Entries-Main")
    protected CsconevtFullType.AcEntriesMain acEntriesMain;
    @XmlElement(name = "Event-Details")
    protected List<CsconevtFullType.EventDetails> eventDetails;

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the acEntriesMain property.
     * 
     * @return
     *     possible object is
     *     {@link CsconevtFullType.AcEntriesMain }
     *     
     */
    public CsconevtFullType.AcEntriesMain getAcEntriesMain() {
        return acEntriesMain;
    }

    /**
     * Sets the value of the acEntriesMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconevtFullType.AcEntriesMain }
     *     
     */
    public void setAcEntriesMain(CsconevtFullType.AcEntriesMain value) {
        this.acEntriesMain = value;
    }

    /**
     * Gets the value of the eventDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CsconevtFullType.EventDetails }
     * 
     * 
     */
    public List<CsconevtFullType.EventDetails> getEventDetails() {
        if (eventDetails == null) {
            eventDetails = new ArrayList<CsconevtFullType.EventDetails>();
        }
        return this.eventDetails;
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
     *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Ac-Entries-Detail" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AMOUNT_TAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="VALUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "referenceno",
        "event",
        "acEntriesDetail"
    })
    public static class AcEntriesMain {

        @XmlElement(name = "REFERENCE_NO")
        protected String referenceno;
        @XmlElement(name = "EVENT", required = true)
        protected String event;
        @XmlElement(name = "Ac-Entries-Detail")
        protected List<CsconevtFullType.AcEntriesMain.AcEntriesDetail> acEntriesDetail;

        /**
         * Gets the value of the referenceno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFERENCENO() {
            return referenceno;
        }

        /**
         * Sets the value of the referenceno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFERENCENO(String value) {
            this.referenceno = value;
        }

        /**
         * Gets the value of the event property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENT() {
            return event;
        }

        /**
         * Sets the value of the event property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENT(String value) {
            this.event = value;
        }

        /**
         * Gets the value of the acEntriesDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acEntriesDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcEntriesDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CsconevtFullType.AcEntriesMain.AcEntriesDetail }
         * 
         * 
         */
        public List<CsconevtFullType.AcEntriesMain.AcEntriesDetail> getAcEntriesDetail() {
            if (acEntriesDetail == null) {
                acEntriesDetail = new ArrayList<CsconevtFullType.AcEntriesMain.AcEntriesDetail>();
            }
            return this.acEntriesDetail;
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
         *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AMOUNT_TAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="VALUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "branch",
            "account",
            "ccy",
            "drcrindictr",
            "amounttag",
            "trncode",
            "fcyamount",
            "lcyamount",
            "date",
            "valuedate"
        })
        public static class AcEntriesDetail {

            @XmlElement(name = "BRANCH")
            protected String branch;
            @XmlElement(name = "ACCOUNT")
            protected String account;
            @XmlElement(name = "CCY")
            protected String ccy;
            @XmlElement(name = "DRCRINDICTR")
            protected String drcrindictr;
            @XmlElement(name = "AMOUNT_TAG")
            protected String amounttag;
            @XmlElement(name = "TRN_CODE")
            protected String trncode;
            @XmlElement(name = "FCYAMOUNT")
            protected BigDecimal fcyamount;
            @XmlElement(name = "LCY_AMOUNT")
            protected BigDecimal lcyamount;
            @XmlElement(name = "DATE")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlElement(name = "VALUE_DATE")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar valuedate;

            /**
             * Gets the value of the branch property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBRANCH() {
                return branch;
            }

            /**
             * Sets the value of the branch property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBRANCH(String value) {
                this.branch = value;
            }

            /**
             * Gets the value of the account property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNT() {
                return account;
            }

            /**
             * Sets the value of the account property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNT(String value) {
                this.account = value;
            }

            /**
             * Gets the value of the ccy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCCY() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCCY(String value) {
                this.ccy = value;
            }

            /**
             * Gets the value of the drcrindictr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRCRINDICTR() {
                return drcrindictr;
            }

            /**
             * Sets the value of the drcrindictr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRCRINDICTR(String value) {
                this.drcrindictr = value;
            }

            /**
             * Gets the value of the amounttag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMOUNTTAG() {
                return amounttag;
            }

            /**
             * Sets the value of the amounttag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMOUNTTAG(String value) {
                this.amounttag = value;
            }

            /**
             * Gets the value of the trncode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNCODE() {
                return trncode;
            }

            /**
             * Sets the value of the trncode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNCODE(String value) {
                this.trncode = value;
            }

            /**
             * Gets the value of the fcyamount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFCYAMOUNT() {
                return fcyamount;
            }

            /**
             * Sets the value of the fcyamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFCYAMOUNT(BigDecimal value) {
                this.fcyamount = value;
            }

            /**
             * Gets the value of the lcyamount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLCYAMOUNT() {
                return lcyamount;
            }

            /**
             * Sets the value of the lcyamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLCYAMOUNT(BigDecimal value) {
                this.lcyamount = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATE() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATE(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the valuedate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVALUEDATE() {
                return valuedate;
            }

            /**
             * Sets the value of the valuedate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVALUEDATE(XMLGregorianCalendar value) {
                this.valuedate = value;
            }

        }

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
     *         &lt;element name="EVENTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVENT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="EVENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "eventno",
        "eventdate",
        "eventcode",
        "adesc"
    })
    public static class EventDetails {

        @XmlElement(name = "EVENTNO")
        protected String eventno;
        @XmlElement(name = "EVENT_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar eventdate;
        @XmlElement(name = "EVENT_CODE")
        protected String eventcode;
        @XmlElement(name = "ADESC")
        protected String adesc;

        /**
         * Gets the value of the eventno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENTNO() {
            return eventno;
        }

        /**
         * Sets the value of the eventno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENTNO(String value) {
            this.eventno = value;
        }

        /**
         * Gets the value of the eventdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEVENTDATE() {
            return eventdate;
        }

        /**
         * Sets the value of the eventdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEVENTDATE(XMLGregorianCalendar value) {
            this.eventdate = value;
        }

        /**
         * Gets the value of the eventcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENTCODE() {
            return eventcode;
        }

        /**
         * Sets the value of the eventcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENTCODE(String value) {
            this.eventcode = value;
        }

        /**
         * Gets the value of the adesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADESC() {
            return adesc;
        }

        /**
         * Sets the value of the adesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADESC(String value) {
            this.adesc = value;
        }

    }

}
