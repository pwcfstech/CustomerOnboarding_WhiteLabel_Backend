
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Billingprefmaster-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Billingprefmaster-Create-IO-Type">
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
@XmlType(name = "Billingprefmaster-Create-IO-Type", propOrder = {
    "brn",
    "accno",
    "billingprefmaster",
    "billingproducts"
})
public class BillingprefmasterCreateIOType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACCNO")
    protected String accno;
    @XmlElement(name = "Billingprefmaster")
    protected BillingprefmasterCreateIOType.Billingprefmaster billingprefmaster;
    @XmlElement(name = "Billingproducts")
    protected List<BillingprefmasterCreateIOType.Billingproducts> billingproducts;

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
     *     {@link BillingprefmasterCreateIOType.Billingprefmaster }
     *     
     */
    public BillingprefmasterCreateIOType.Billingprefmaster getBillingprefmaster() {
        return billingprefmaster;
    }

    /**
     * Sets the value of the billingprefmaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingprefmasterCreateIOType.Billingprefmaster }
     *     
     */
    public void setBillingprefmaster(BillingprefmasterCreateIOType.Billingprefmaster value) {
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
     * {@link BillingprefmasterCreateIOType.Billingproducts }
     * 
     * 
     */
    public List<BillingprefmasterCreateIOType.Billingproducts> getBillingproducts() {
        if (billingproducts == null) {
            billingproducts = new ArrayList<BillingprefmasterCreateIOType.Billingproducts>();
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
        "agremntid"
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
        "billprodcd"
    })
    public static class Billingproducts {

        @XmlElement(name = "BILLPRODCD", required = true)
        protected String billprodcd;

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

    }

}
