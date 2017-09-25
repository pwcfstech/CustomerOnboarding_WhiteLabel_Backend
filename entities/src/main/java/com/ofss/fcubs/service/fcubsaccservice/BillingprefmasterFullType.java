
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Billingprefmaster-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Billingprefmaster-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billingprefmaster" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CONSOLACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BLLLIQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SETLMTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DIRDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DDBNKCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DDACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AGREMNTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SETLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONSOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SETLACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONSOLACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Billingproducts" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BILLPRODCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BILLPRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Billingprefmaster-Full-Type", propOrder = {
    "brn",
    "accno",
    "billingprefmaster",
    "billingproducts"
})
public class BillingprefmasterFullType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACCNO")
    protected String accno;
    @XmlElement(name = "Billingprefmaster")
    protected BillingprefmasterFullType.Billingprefmaster billingprefmaster;
    @XmlElement(name = "Billingproducts")
    protected List<BillingprefmasterFullType.Billingproducts> billingproducts;

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
     * Gets the value of the accno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCNO() {
        return accno;
    }

    /**
     * Sets the value of the accno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCNO(String value) {
        this.accno = value;
    }

    /**
     * Gets the value of the billingprefmaster property.
     * 
     * @return
     *     possible object is
     *     {@link BillingprefmasterFullType.Billingprefmaster }
     *     
     */
    public BillingprefmasterFullType.Billingprefmaster getBillingprefmaster() {
        return billingprefmaster;
    }

    /**
     * Sets the value of the billingprefmaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingprefmasterFullType.Billingprefmaster }
     *     
     */
    public void setBillingprefmaster(BillingprefmasterFullType.Billingprefmaster value) {
        this.billingprefmaster = value;
    }

    /**
     * Gets the value of the billingproducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingproducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingproducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingprefmasterFullType.Billingproducts }
     * 
     * 
     */
    public List<BillingprefmasterFullType.Billingproducts> getBillingproducts() {
        if (billingproducts == null) {
            billingproducts = new ArrayList<BillingprefmasterFullType.Billingproducts>();
        }
        return this.billingproducts;
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
     *         &lt;element name="CONSOLACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BLLLIQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SETLMTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DIRDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DDBNKCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DDACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AGREMNTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SETLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONSOLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SETLACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONSOLACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "consolacc",
        "bllliqd",
        "setlmtacc",
        "dirdebit",
        "ddbnkcd",
        "ddaccno",
        "name",
        "agremntid",
        "setlccy",
        "consolccy",
        "setlaccbrn",
        "consolaccbrn"
    })
    public static class Billingprefmaster {

        @XmlElement(name = "CONSOLACC")
        protected String consolacc;
        @XmlElement(name = "BLLLIQD")
        protected String bllliqd;
        @XmlElement(name = "SETLMTACC")
        protected String setlmtacc;
        @XmlElement(name = "DIRDEBIT")
        protected String dirdebit;
        @XmlElement(name = "DDBNKCD")
        protected String ddbnkcd;
        @XmlElement(name = "DDACCNO")
        protected String ddaccno;
        @XmlElement(name = "NAME")
        protected String name;
        @XmlElement(name = "AGREMNTID")
        protected String agremntid;
        @XmlElement(name = "SETLCCY")
        protected String setlccy;
        @XmlElement(name = "CONSOLCCY")
        protected String consolccy;
        @XmlElement(name = "SETLACCBRN")
        protected String setlaccbrn;
        @XmlElement(name = "CONSOLACCBRN")
        protected String consolaccbrn;

        /**
         * Gets the value of the consolacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSOLACC() {
            return consolacc;
        }

        /**
         * Sets the value of the consolacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSOLACC(String value) {
            this.consolacc = value;
        }

        /**
         * Gets the value of the bllliqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBLLLIQD() {
            return bllliqd;
        }

        /**
         * Sets the value of the bllliqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBLLLIQD(String value) {
            this.bllliqd = value;
        }

        /**
         * Gets the value of the setlmtacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETLMTACC() {
            return setlmtacc;
        }

        /**
         * Sets the value of the setlmtacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETLMTACC(String value) {
            this.setlmtacc = value;
        }

        /**
         * Gets the value of the dirdebit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDIRDEBIT() {
            return dirdebit;
        }

        /**
         * Sets the value of the dirdebit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDIRDEBIT(String value) {
            this.dirdebit = value;
        }

        /**
         * Gets the value of the ddbnkcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDDBNKCD() {
            return ddbnkcd;
        }

        /**
         * Sets the value of the ddbnkcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDDBNKCD(String value) {
            this.ddbnkcd = value;
        }

        /**
         * Gets the value of the ddaccno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDDACCNO() {
            return ddaccno;
        }

        /**
         * Sets the value of the ddaccno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDDACCNO(String value) {
            this.ddaccno = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the agremntid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAGREMNTID() {
            return agremntid;
        }

        /**
         * Sets the value of the agremntid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAGREMNTID(String value) {
            this.agremntid = value;
        }

        /**
         * Gets the value of the setlccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETLCCY() {
            return setlccy;
        }

        /**
         * Sets the value of the setlccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETLCCY(String value) {
            this.setlccy = value;
        }

        /**
         * Gets the value of the consolccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSOLCCY() {
            return consolccy;
        }

        /**
         * Sets the value of the consolccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSOLCCY(String value) {
            this.consolccy = value;
        }

        /**
         * Gets the value of the setlaccbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETLACCBRN() {
            return setlaccbrn;
        }

        /**
         * Sets the value of the setlaccbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETLACCBRN(String value) {
            this.setlaccbrn = value;
        }

        /**
         * Gets the value of the consolaccbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSOLACCBRN() {
            return consolaccbrn;
        }

        /**
         * Sets the value of the consolaccbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSOLACCBRN(String value) {
            this.consolaccbrn = value;
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
     *         &lt;element name="BILLPRODCD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BILLPRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "billprodcd",
        "billprddesc"
    })
    public static class Billingproducts {

        @XmlElement(name = "BILLPRODCD", required = true)
        protected String billprodcd;
        @XmlElement(name = "BILLPRDDESC")
        protected String billprddesc;

        /**
         * Gets the value of the billprodcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBILLPRODCD() {
            return billprodcd;
        }

        /**
         * Sets the value of the billprodcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBILLPRODCD(String value) {
            this.billprodcd = value;
        }

        /**
         * Gets the value of the billprddesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBILLPRDDESC() {
            return billprddesc;
        }

        /**
         * Sets the value of the billprddesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBILLPRDDESC(String value) {
            this.billprddesc = value;
        }

    }

}
