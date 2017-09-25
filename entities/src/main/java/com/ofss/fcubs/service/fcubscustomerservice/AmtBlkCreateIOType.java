
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
 * <p>Java class for AmtBlk-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmtBlk-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMTBLKNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EXPDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="REM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABLKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EFFDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HOLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cadamblk-Summary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMOUNT_BLOCK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EFFECTIVE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ABLKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmtBlk-Create-IO-Type", propOrder = {
    "acc",
    "amtblkno",
    "amt",
    "expdate",
    "rem",
    "ablktype",
    "referenceno",
    "hpcode",
    "effdate",
    "holddesc",
    "branch",
    "cadamblkSummary",
    "udfdetails"
})
public class AmtBlkCreateIOType {

    @XmlElement(name = "ACC", required = true)
    protected String acc;
    @XmlElement(name = "AMTBLKNO", required = true)
    protected String amtblkno;
    @XmlElement(name = "AMT", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "EXPDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expdate;
    @XmlElement(name = "REM")
    protected String rem;
    @XmlElement(name = "ABLKTYPE")
    protected String ablktype;
    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "HPCODE")
    protected String hpcode;
    @XmlElement(name = "EFFDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effdate;
    @XmlElement(name = "HOLDDESC")
    protected String holddesc;
    @XmlElement(name = "BRANCH")
    protected String branch;
    @XmlElement(name = "Cadamblk-Summary")
    protected AmtBlkCreateIOType.CadamblkSummary cadamblkSummary;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

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
     * Gets the value of the amtblkno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTBLKNO() {
        return amtblkno;
    }

    /**
     * Sets the value of the amtblkno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTBLKNO(String value) {
        this.amtblkno = value;
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
     * Gets the value of the expdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXPDATE() {
        return expdate;
    }

    /**
     * Sets the value of the expdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXPDATE(XMLGregorianCalendar value) {
        this.expdate = value;
    }

    /**
     * Gets the value of the rem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREM() {
        return rem;
    }

    /**
     * Sets the value of the rem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREM(String value) {
        this.rem = value;
    }

    /**
     * Gets the value of the ablktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABLKTYPE() {
        return ablktype;
    }

    /**
     * Sets the value of the ablktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABLKTYPE(String value) {
        this.ablktype = value;
    }

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
     * Gets the value of the hpcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPCODE() {
        return hpcode;
    }

    /**
     * Sets the value of the hpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPCODE(String value) {
        this.hpcode = value;
    }

    /**
     * Gets the value of the effdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEFFDATE() {
        return effdate;
    }

    /**
     * Sets the value of the effdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEFFDATE(XMLGregorianCalendar value) {
        this.effdate = value;
    }

    /**
     * Gets the value of the holddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLDDESC() {
        return holddesc;
    }

    /**
     * Sets the value of the holddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLDDESC(String value) {
        this.holddesc = value;
    }

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
     * Gets the value of the cadamblkSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AmtBlkCreateIOType.CadamblkSummary }
     *     
     */
    public AmtBlkCreateIOType.CadamblkSummary getCadamblkSummary() {
        return cadamblkSummary;
    }

    /**
     * Sets the value of the cadamblkSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtBlkCreateIOType.CadamblkSummary }
     *     
     */
    public void setCadamblkSummary(AmtBlkCreateIOType.CadamblkSummary value) {
        this.cadamblkSummary = value;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
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
     *         &lt;element name="AMOUNT_BLOCK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EFFECTIVE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ABLKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "amountblockno",
        "amount",
        "effectivedate",
        "expirydate",
        "ablktype",
        "referenceno"
    })
    public static class CadamblkSummary {

        @XmlElement(name = "BRANCH")
        protected String branch;
        @XmlElement(name = "ACCOUNT")
        protected String account;
        @XmlElement(name = "AMOUNT_BLOCK_NO")
        protected String amountblockno;
        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "EFFECTIVE_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectivedate;
        @XmlElement(name = "EXPIRY_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expirydate;
        @XmlElement(name = "ABLKTYPE")
        protected String ablktype;
        @XmlElement(name = "REFERENCE_NO")
        protected String referenceno;

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
         * Gets the value of the amountblockno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMOUNTBLOCKNO() {
            return amountblockno;
        }

        /**
         * Sets the value of the amountblockno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMOUNTBLOCKNO(String value) {
            this.amountblockno = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the effectivedate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEFFECTIVEDATE() {
            return effectivedate;
        }

        /**
         * Sets the value of the effectivedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEFFECTIVEDATE(XMLGregorianCalendar value) {
            this.effectivedate = value;
        }

        /**
         * Gets the value of the expirydate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEXPIRYDATE() {
            return expirydate;
        }

        /**
         * Sets the value of the expirydate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEXPIRYDATE(XMLGregorianCalendar value) {
            this.expirydate = value;
        }

        /**
         * Gets the value of the ablktype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getABLKTYPE() {
            return ablktype;
        }

        /**
         * Sets the value of the ablktype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setABLKTYPE(String value) {
            this.ablktype = value;
        }

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

    }

}
