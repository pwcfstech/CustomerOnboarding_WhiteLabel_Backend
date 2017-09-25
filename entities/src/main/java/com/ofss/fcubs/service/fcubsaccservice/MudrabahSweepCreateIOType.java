
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MudrabahSweep-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MudrabahSweep-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sttbs-Sweep-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DEPACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LINKAGEPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LINKEDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="BLOCKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "MudrabahSweep-Create-IO-Type", propOrder = {
    "branchcode",
    "custacno",
    "sttbsSweepDetails"
})
public class MudrabahSweepCreateIOType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "Sttbs-Sweep-Details")
    protected List<MudrabahSweepCreateIOType.SttbsSweepDetails> sttbsSweepDetails;

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

    /**
     * Gets the value of the sttbsSweepDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttbsSweepDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttbsSweepDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MudrabahSweepCreateIOType.SttbsSweepDetails }
     * 
     * 
     */
    public List<MudrabahSweepCreateIOType.SttbsSweepDetails> getSttbsSweepDetails() {
        if (sttbsSweepDetails == null) {
            sttbsSweepDetails = new ArrayList<MudrabahSweepCreateIOType.SttbsSweepDetails>();
        }
        return this.sttbsSweepDetails;
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
     *         &lt;element name="DEPACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LINKAGEPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LINKEDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="BLOCKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "depacc",
        "linkagepercent",
        "linkedamt",
        "blockedamount"
    })
    public static class SttbsSweepDetails {

        @XmlElement(name = "DEPACC", required = true)
        protected String depacc;
        @XmlElement(name = "LINKAGEPERCENT")
        protected BigDecimal linkagepercent;
        @XmlElement(name = "LINKEDAMT")
        protected BigDecimal linkedamt;
        @XmlElement(name = "BLOCKED_AMOUNT")
        protected BigDecimal blockedamount;

        /**
         * Gets the value of the depacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPACC() {
            return depacc;
        }

        /**
         * Sets the value of the depacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPACC(String value) {
            this.depacc = value;
        }

        /**
         * Gets the value of the linkagepercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLINKAGEPERCENT() {
            return linkagepercent;
        }

        /**
         * Sets the value of the linkagepercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLINKAGEPERCENT(BigDecimal value) {
            this.linkagepercent = value;
        }

        /**
         * Gets the value of the linkedamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLINKEDAMT() {
            return linkedamt;
        }

        /**
         * Sets the value of the linkedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLINKEDAMT(BigDecimal value) {
            this.linkedamt = value;
        }

        /**
         * Gets the value of the blockedamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBLOCKEDAMOUNT() {
            return blockedamount;
        }

        /**
         * Sets the value of the blockedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBLOCKEDAMOUNT(BigDecimal value) {
            this.blockedamount = value;
        }

    }

}
