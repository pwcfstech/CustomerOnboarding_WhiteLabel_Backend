
package com.ofss.fcubs.service.fcubscustomerservice;

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
 * <p>Java class for Custmis-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Custmis-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MISGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custchnglog" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Baltrnsfrlog" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FINYR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="GLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TRNIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Customermis" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Compositemis" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Custmis-Full-Type", propOrder = {
    "misgrp",
    "cust",
    "brncd",
    "custchnglog",
    "baltrnsfrlog",
    "customermis",
    "compositemis"
})
public class CustmisFullType {

    @XmlElement(name = "MISGRP")
    protected String misgrp;
    @XmlElement(name = "CUST", required = true)
    protected String cust;
    @XmlElement(name = "BRNCD")
    protected String brncd;
    @XmlElement(name = "Custchnglog")
    protected List<CustmisFullType.Custchnglog> custchnglog;
    @XmlElement(name = "Baltrnsfrlog")
    protected List<CustmisFullType.Baltrnsfrlog> baltrnsfrlog;
    @XmlElement(name = "Customermis")
    protected List<CustmisFullType.Customermis> customermis;
    @XmlElement(name = "Compositemis")
    protected List<CustmisFullType.Compositemis> compositemis;

    /**
     * Gets the value of the misgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISGRP() {
        return misgrp;
    }

    /**
     * Sets the value of the misgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISGRP(String value) {
        this.misgrp = value;
    }

    /**
     * Gets the value of the cust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUST() {
        return cust;
    }

    /**
     * Sets the value of the cust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUST(String value) {
        this.cust = value;
    }

    /**
     * Gets the value of the brncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNCD() {
        return brncd;
    }

    /**
     * Sets the value of the brncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRNCD(String value) {
        this.brncd = value;
    }

    /**
     * Gets the value of the custchnglog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custchnglog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustchnglog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisFullType.Custchnglog }
     * 
     * 
     */
    public List<CustmisFullType.Custchnglog> getCustchnglog() {
        if (custchnglog == null) {
            custchnglog = new ArrayList<CustmisFullType.Custchnglog>();
        }
        return this.custchnglog;
    }

    /**
     * Gets the value of the baltrnsfrlog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baltrnsfrlog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaltrnsfrlog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisFullType.Baltrnsfrlog }
     * 
     * 
     */
    public List<CustmisFullType.Baltrnsfrlog> getBaltrnsfrlog() {
        if (baltrnsfrlog == null) {
            baltrnsfrlog = new ArrayList<CustmisFullType.Baltrnsfrlog>();
        }
        return this.baltrnsfrlog;
    }

    /**
     * Gets the value of the customermis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customermis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomermis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisFullType.Customermis }
     * 
     * 
     */
    public List<CustmisFullType.Customermis> getCustomermis() {
        if (customermis == null) {
            customermis = new ArrayList<CustmisFullType.Customermis>();
        }
        return this.customermis;
    }

    /**
     * Gets the value of the compositemis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositemis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositemis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisFullType.Compositemis }
     * 
     * 
     */
    public List<CustmisFullType.Compositemis> getCompositemis() {
        if (compositemis == null) {
            compositemis = new ArrayList<CustmisFullType.Compositemis>();
        }
        return this.compositemis;
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
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FINYR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="GLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TRNIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "brn",
        "prdcd",
        "finyr",
        "txndt",
        "glcode",
        "miscls",
        "oldmiscd",
        "nwmiscd",
        "trnind",
        "ccy",
        "amt",
        "xrate"
    })
    public static class Baltrnsfrlog {

        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "PRDCD")
        protected String prdcd;
        @XmlElement(name = "FINYR")
        protected String finyr;
        @XmlElement(name = "TXNDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar txndt;
        @XmlElement(name = "GLCODE")
        protected String glcode;
        @XmlElement(name = "MISCLS")
        protected String miscls;
        @XmlElement(name = "OLDMISCD")
        protected String oldmiscd;
        @XmlElement(name = "NWMISCD")
        protected String nwmiscd;
        @XmlElement(name = "TRNIND")
        protected String trnind;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "AMT")
        protected BigDecimal amt;
        @XmlElement(name = "XRATE")
        protected BigDecimal xrate;

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
         * Gets the value of the prdcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRDCD() {
            return prdcd;
        }

        /**
         * Sets the value of the prdcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRDCD(String value) {
            this.prdcd = value;
        }

        /**
         * Gets the value of the finyr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFINYR() {
            return finyr;
        }

        /**
         * Sets the value of the finyr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFINYR(String value) {
            this.finyr = value;
        }

        /**
         * Gets the value of the txndt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTXNDT() {
            return txndt;
        }

        /**
         * Sets the value of the txndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTXNDT(XMLGregorianCalendar value) {
            this.txndt = value;
        }

        /**
         * Gets the value of the glcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGLCODE() {
            return glcode;
        }

        /**
         * Sets the value of the glcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGLCODE(String value) {
            this.glcode = value;
        }

        /**
         * Gets the value of the miscls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCLS() {
            return miscls;
        }

        /**
         * Sets the value of the miscls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCLS(String value) {
            this.miscls = value;
        }

        /**
         * Gets the value of the oldmiscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOLDMISCD() {
            return oldmiscd;
        }

        /**
         * Sets the value of the oldmiscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOLDMISCD(String value) {
            this.oldmiscd = value;
        }

        /**
         * Gets the value of the nwmiscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNWMISCD() {
            return nwmiscd;
        }

        /**
         * Sets the value of the nwmiscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNWMISCD(String value) {
            this.nwmiscd = value;
        }

        /**
         * Gets the value of the trnind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNIND() {
            return trnind;
        }

        /**
         * Sets the value of the trnind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNIND(String value) {
            this.trnind = value;
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
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMT() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMT(BigDecimal value) {
            this.amt = value;
        }

        /**
         * Gets the value of the xrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getXRATE() {
            return xrate;
        }

        /**
         * Sets the value of the xrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setXRATE(BigDecimal value) {
            this.xrate = value;
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
     *         &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "miscls",
        "miscd"
    })
    public static class Compositemis {

        @XmlElement(name = "MISCLS")
        protected String miscls;
        @XmlElement(name = "MISCD")
        protected String miscd;

        /**
         * Gets the value of the miscls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCLS() {
            return miscls;
        }

        /**
         * Sets the value of the miscls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCLS(String value) {
            this.miscls = value;
        }

        /**
         * Gets the value of the miscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCD() {
            return miscd;
        }

        /**
         * Sets the value of the miscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCD(String value) {
            this.miscd = value;
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
     *         &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "miscls",
        "txndt",
        "oldmiscd",
        "nwmiscd"
    })
    public static class Custchnglog {

        @XmlElement(name = "MISCLS", required = true)
        protected String miscls;
        @XmlElement(name = "TXNDT", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar txndt;
        @XmlElement(name = "OLDMISCD")
        protected String oldmiscd;
        @XmlElement(name = "NWMISCD")
        protected String nwmiscd;

        /**
         * Gets the value of the miscls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCLS() {
            return miscls;
        }

        /**
         * Sets the value of the miscls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCLS(String value) {
            this.miscls = value;
        }

        /**
         * Gets the value of the txndt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTXNDT() {
            return txndt;
        }

        /**
         * Sets the value of the txndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTXNDT(XMLGregorianCalendar value) {
            this.txndt = value;
        }

        /**
         * Gets the value of the oldmiscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOLDMISCD() {
            return oldmiscd;
        }

        /**
         * Sets the value of the oldmiscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOLDMISCD(String value) {
            this.oldmiscd = value;
        }

        /**
         * Gets the value of the nwmiscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNWMISCD() {
            return nwmiscd;
        }

        /**
         * Sets the value of the nwmiscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNWMISCD(String value) {
            this.nwmiscd = value;
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
     *         &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "miscls",
        "miscd"
    })
    public static class Customermis {

        @XmlElement(name = "MISCLS")
        protected String miscls;
        @XmlElement(name = "MISCD")
        protected String miscd;

        /**
         * Gets the value of the miscls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCLS() {
            return miscls;
        }

        /**
         * Sets the value of the miscls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCLS(String value) {
            this.miscls = value;
        }

        /**
         * Gets the value of the miscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCD() {
            return miscd;
        }

        /**
         * Sets the value of the miscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCD(String value) {
            this.miscd = value;
        }

    }

}
