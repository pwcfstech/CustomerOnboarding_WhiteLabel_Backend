
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MudrabahSweep-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MudrabahSweep-Full-Type">
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
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ORDEROFLINKAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DEPBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEPACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ORIGINALDEPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LINKAGEPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LINKEDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="AVAILAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="UTILAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MDTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MudrabahSweep-Full-Type", propOrder = {
    "branchcode",
    "custacno",
    "sttbsSweepDetails"
})
public class MudrabahSweepFullType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "Sttbs-Sweep-Details")
    protected List<MudrabahSweepFullType.SttbsSweepDetails> sttbsSweepDetails;

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
     * {@link MudrabahSweepFullType.SttbsSweepDetails }
     * 
     * 
     */
    public List<MudrabahSweepFullType.SttbsSweepDetails> getSttbsSweepDetails() {
        if (sttbsSweepDetails == null) {
            sttbsSweepDetails = new ArrayList<MudrabahSweepFullType.SttbsSweepDetails>();
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
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ORDEROFLINKAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DEPBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEPACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ORIGINALDEPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LINKAGEPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LINKEDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="AVAILAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="UTILAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MDTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "brn",
        "custacc",
        "orderoflinkage",
        "depbrn",
        "depacc",
        "originaldepamt",
        "linkagepercent",
        "linkedamt",
        "availamt",
        "utilamt",
        "mdte",
        "blockedamount"
    })
    public static class SttbsSweepDetails {

        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "CUSTACC")
        protected String custacc;
        @XmlElement(name = "ORDEROFLINKAGE")
        protected BigDecimal orderoflinkage;
        @XmlElement(name = "DEPBRN")
        protected String depbrn;
        @XmlElement(name = "DEPACC", required = true)
        protected String depacc;
        @XmlElement(name = "ORIGINALDEPAMT")
        protected BigDecimal originaldepamt;
        @XmlElement(name = "LINKAGEPERCENT")
        protected BigDecimal linkagepercent;
        @XmlElement(name = "LINKEDAMT")
        protected BigDecimal linkedamt;
        @XmlElement(name = "AVAILAMT")
        protected BigDecimal availamt;
        @XmlElement(name = "UTILAMT")
        protected BigDecimal utilamt;
        @XmlElement(name = "MDTE")
        protected String mdte;
        @XmlElement(name = "BLOCKED_AMOUNT")
        protected BigDecimal blockedamount;

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
         * Gets the value of the custacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTACC() {
            return custacc;
        }

        /**
         * Sets the value of the custacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTACC(String value) {
            this.custacc = value;
        }

        /**
         * Gets the value of the orderoflinkage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getORDEROFLINKAGE() {
            return orderoflinkage;
        }

        /**
         * Sets the value of the orderoflinkage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setORDEROFLINKAGE(BigDecimal value) {
            this.orderoflinkage = value;
        }

        /**
         * Gets the value of the depbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPBRN() {
            return depbrn;
        }

        /**
         * Sets the value of the depbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPBRN(String value) {
            this.depbrn = value;
        }

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
         * Gets the value of the originaldepamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getORIGINALDEPAMT() {
            return originaldepamt;
        }

        /**
         * Sets the value of the originaldepamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setORIGINALDEPAMT(BigDecimal value) {
            this.originaldepamt = value;
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
         * Gets the value of the availamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAVAILAMT() {
            return availamt;
        }

        /**
         * Sets the value of the availamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAVAILAMT(BigDecimal value) {
            this.availamt = value;
        }

        /**
         * Gets the value of the utilamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUTILAMT() {
            return utilamt;
        }

        /**
         * Sets the value of the utilamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUTILAMT(BigDecimal value) {
            this.utilamt = value;
        }

        /**
         * Gets the value of the mdte property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDTE() {
            return mdte;
        }

        /**
         * Sets the value of the mdte property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDTE(String value) {
            this.mdte = value;
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
