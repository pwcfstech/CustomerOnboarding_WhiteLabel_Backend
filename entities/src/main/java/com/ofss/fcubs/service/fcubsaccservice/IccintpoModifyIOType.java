
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Iccintpo-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Iccintpo-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bcpayout-Int" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PAYOUTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHQ_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pcpayout-Int" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PAYOUTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCOFFSET_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Iccintpo-Modify-IO-Type", propOrder = {
    "branchcode",
    "custacno",
    "ccy",
    "bcpayoutInt",
    "pcpayoutInt"
})
public class IccintpoModifyIOType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "Bcpayout-Int")
    protected IccintpoModifyIOType.BcpayoutInt bcpayoutInt;
    @XmlElement(name = "Pcpayout-Int")
    protected IccintpoModifyIOType.PcpayoutInt pcpayoutInt;

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
     * Gets the value of the bcpayoutInt property.
     * 
     * @return
     *     possible object is
     *     {@link IccintpoModifyIOType.BcpayoutInt }
     *     
     */
    public IccintpoModifyIOType.BcpayoutInt getBcpayoutInt() {
        return bcpayoutInt;
    }

    /**
     * Sets the value of the bcpayoutInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IccintpoModifyIOType.BcpayoutInt }
     *     
     */
    public void setBcpayoutInt(IccintpoModifyIOType.BcpayoutInt value) {
        this.bcpayoutInt = value;
    }

    /**
     * Gets the value of the pcpayoutInt property.
     * 
     * @return
     *     possible object is
     *     {@link IccintpoModifyIOType.PcpayoutInt }
     *     
     */
    public IccintpoModifyIOType.PcpayoutInt getPcpayoutInt() {
        return pcpayoutInt;
    }

    /**
     * Sets the value of the pcpayoutInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IccintpoModifyIOType.PcpayoutInt }
     *     
     */
    public void setPcpayoutInt(IccintpoModifyIOType.PcpayoutInt value) {
        this.pcpayoutInt = value;
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
     *         &lt;element name="PAYOUTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHQ_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "payoutcomp",
        "bankcode",
        "chqdate",
        "paybrn",
        "benfname",
        "benfadd1",
        "benfadd2",
        "otherdets",
        "narrative"
    })
    public static class BcpayoutInt {

        @XmlElement(name = "PAYOUTCOMP")
        protected String payoutcomp;
        @XmlElement(name = "BANKCODE")
        protected String bankcode;
        @XmlElement(name = "CHQ_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar chqdate;
        @XmlElement(name = "PAYBRN")
        protected String paybrn;
        @XmlElement(name = "BENFNAME")
        protected String benfname;
        @XmlElement(name = "BENFADD1")
        protected String benfadd1;
        @XmlElement(name = "BENFADD2")
        protected String benfadd2;
        @XmlElement(name = "OTHERDETS")
        protected String otherdets;
        @XmlElement(name = "NARRATIVE")
        protected String narrative;

        /**
         * Gets the value of the payoutcomp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYOUTCOMP() {
            return payoutcomp;
        }

        /**
         * Sets the value of the payoutcomp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYOUTCOMP(String value) {
            this.payoutcomp = value;
        }

        /**
         * Gets the value of the bankcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBANKCODE() {
            return bankcode;
        }

        /**
         * Sets the value of the bankcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBANKCODE(String value) {
            this.bankcode = value;
        }

        /**
         * Gets the value of the chqdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCHQDATE() {
            return chqdate;
        }

        /**
         * Sets the value of the chqdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCHQDATE(XMLGregorianCalendar value) {
            this.chqdate = value;
        }

        /**
         * Gets the value of the paybrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYBRN() {
            return paybrn;
        }

        /**
         * Sets the value of the paybrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYBRN(String value) {
            this.paybrn = value;
        }

        /**
         * Gets the value of the benfname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFNAME() {
            return benfname;
        }

        /**
         * Sets the value of the benfname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFNAME(String value) {
            this.benfname = value;
        }

        /**
         * Gets the value of the benfadd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFADD1() {
            return benfadd1;
        }

        /**
         * Sets the value of the benfadd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFADD1(String value) {
            this.benfadd1 = value;
        }

        /**
         * Gets the value of the benfadd2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFADD2() {
            return benfadd2;
        }

        /**
         * Sets the value of the benfadd2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFADD2(String value) {
            this.benfadd2 = value;
        }

        /**
         * Gets the value of the otherdets property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERDETS() {
            return otherdets;
        }

        /**
         * Sets the value of the otherdets property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERDETS(String value) {
            this.otherdets = value;
        }

        /**
         * Gets the value of the narrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE() {
            return narrative;
        }

        /**
         * Sets the value of the narrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE(String value) {
            this.narrative = value;
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
     *         &lt;element name="PAYOUTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCOFFSET_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "payoutcomp",
        "pcbankcode",
        "pcoffsetacc",
        "benfname",
        "benfadd1",
        "benfadd2",
        "otherdets",
        "narrative"
    })
    public static class PcpayoutInt {

        @XmlElement(name = "PAYOUTCOMP")
        protected String payoutcomp;
        @XmlElement(name = "PCBANKCODE")
        protected String pcbankcode;
        @XmlElement(name = "PCOFFSET_ACC")
        protected String pcoffsetacc;
        @XmlElement(name = "BENFNAME")
        protected String benfname;
        @XmlElement(name = "BENFADD1")
        protected String benfadd1;
        @XmlElement(name = "BENFADD2")
        protected String benfadd2;
        @XmlElement(name = "OTHERDETS")
        protected String otherdets;
        @XmlElement(name = "NARRATIVE")
        protected String narrative;

        /**
         * Gets the value of the payoutcomp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYOUTCOMP() {
            return payoutcomp;
        }

        /**
         * Sets the value of the payoutcomp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYOUTCOMP(String value) {
            this.payoutcomp = value;
        }

        /**
         * Gets the value of the pcbankcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCBANKCODE() {
            return pcbankcode;
        }

        /**
         * Sets the value of the pcbankcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCBANKCODE(String value) {
            this.pcbankcode = value;
        }

        /**
         * Gets the value of the pcoffsetacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCOFFSETACC() {
            return pcoffsetacc;
        }

        /**
         * Sets the value of the pcoffsetacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCOFFSETACC(String value) {
            this.pcoffsetacc = value;
        }

        /**
         * Gets the value of the benfname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFNAME() {
            return benfname;
        }

        /**
         * Sets the value of the benfname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFNAME(String value) {
            this.benfname = value;
        }

        /**
         * Gets the value of the benfadd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFADD1() {
            return benfadd1;
        }

        /**
         * Sets the value of the benfadd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFADD1(String value) {
            this.benfadd1 = value;
        }

        /**
         * Gets the value of the benfadd2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFADD2() {
            return benfadd2;
        }

        /**
         * Sets the value of the benfadd2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFADD2(String value) {
            this.benfadd2 = value;
        }

        /**
         * Gets the value of the otherdets property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERDETS() {
            return otherdets;
        }

        /**
         * Sets the value of the otherdets property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERDETS(String value) {
            this.otherdets = value;
        }

        /**
         * Gets the value of the narrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE() {
            return narrative;
        }

        /**
         * Sets the value of the narrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE(String value) {
            this.narrative = value;
        }

    }

}
