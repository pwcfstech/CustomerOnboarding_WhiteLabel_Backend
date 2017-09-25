
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
 * <p>Java class for Acc-Bal-Res-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Acc-Bal-Res-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACC_BAL" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="OPNBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CURBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="AVLBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="UNCOLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="AVLCR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MTDTOVCR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MTDTOVDR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_BKD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACCR_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACCR_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="SUBLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TODLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TOD_ST_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="TOD_EXP_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ACY_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_TANK_UNCOL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_UNAUTH_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_UNAUTH_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_UNAUTH_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_UNAUTH_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_UNAUTH_UNCOL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACY_UNAUTH_TANK_UNCOL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="INTLIQD" type="{http://fcubs.ofss.com/service/FCUBSAccService}IntLiqdType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Acc-Bal-Res-type", propOrder = {
    "accbal"
})
public class AccBalResType {

    @XmlElement(name = "ACC_BAL", required = true)
    protected List<AccBalResType.ACCBAL> accbal;

    /**
     * Gets the value of the accbal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accbal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCBAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccBalResType.ACCBAL }
     * 
     * 
     */
    public List<AccBalResType.ACCBAL> getACCBAL() {
        if (accbal == null) {
            accbal = new ArrayList<AccBalResType.ACCBAL>();
        }
        return this.accbal;
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
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="OPNBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CURBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="AVLBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="UNCOLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="AVLCR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MTDTOVCR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MTDTOVDR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_BKD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACCR_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACCR_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="SUBLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="TODLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="TOD_ST_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="TOD_EXP_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ACY_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_TANK_UNCOL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_UNAUTH_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_UNAUTH_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_UNAUTH_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_UNAUTH_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_UNAUTH_UNCOL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACY_UNAUTH_TANK_UNCOL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="INTLIQD" type="{http://fcubs.ofss.com/service/FCUBSAccService}IntLiqdType" maxOccurs="unbounded" minOccurs="0"/>
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
        "custacno",
        "ccy",
        "trndt",
        "opnbal",
        "curbal",
        "avlbal",
        "uncolamt",
        "avlcr",
        "mtdtovcr",
        "mtdtovdr",
        "acybkdamt",
        "accrdr",
        "accrcr",
        "sublimit",
        "todlimit",
        "todstdt",
        "todexpdt",
        "acytankcr",
        "acytankdr",
        "acytankuncol",
        "acyunauthdr",
        "acyunauthtankdr",
        "acyunauthcr",
        "acyunauthtankcr",
        "acyunauthuncol",
        "acyunauthtankuncol",
        "intliqd"
    })
    public static class ACCBAL {

        @XmlElement(name = "BRANCH_CODE", required = true)
        protected String branchcode;
        @XmlElement(name = "CUST_AC_NO", required = true)
        protected String custacno;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "TRNDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trndt;
        @XmlElement(name = "OPNBAL")
        protected BigDecimal opnbal;
        @XmlElement(name = "CURBAL")
        protected BigDecimal curbal;
        @XmlElement(name = "AVLBAL")
        protected BigDecimal avlbal;
        @XmlElement(name = "UNCOLAMT")
        protected BigDecimal uncolamt;
        @XmlElement(name = "AVLCR")
        protected BigDecimal avlcr;
        @XmlElement(name = "MTDTOVCR")
        protected BigDecimal mtdtovcr;
        @XmlElement(name = "MTDTOVDR")
        protected BigDecimal mtdtovdr;
        @XmlElement(name = "ACY_BKD_AMT")
        protected BigDecimal acybkdamt;
        @XmlElement(name = "ACCR_DR")
        protected BigDecimal accrdr;
        @XmlElement(name = "ACCR_CR")
        protected BigDecimal accrcr;
        @XmlElement(name = "SUBLIMIT")
        protected BigDecimal sublimit;
        @XmlElement(name = "TODLIMIT")
        protected BigDecimal todlimit;
        @XmlElement(name = "TOD_ST_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar todstdt;
        @XmlElement(name = "TOD_EXP_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar todexpdt;
        @XmlElement(name = "ACY_TANK_CR")
        protected BigDecimal acytankcr;
        @XmlElement(name = "ACY_TANK_DR")
        protected BigDecimal acytankdr;
        @XmlElement(name = "ACY_TANK_UNCOL")
        protected BigDecimal acytankuncol;
        @XmlElement(name = "ACY_UNAUTH_DR")
        protected BigDecimal acyunauthdr;
        @XmlElement(name = "ACY_UNAUTH_TANK_DR")
        protected BigDecimal acyunauthtankdr;
        @XmlElement(name = "ACY_UNAUTH_CR")
        protected BigDecimal acyunauthcr;
        @XmlElement(name = "ACY_UNAUTH_TANK_CR")
        protected BigDecimal acyunauthtankcr;
        @XmlElement(name = "ACY_UNAUTH_UNCOL")
        protected BigDecimal acyunauthuncol;
        @XmlElement(name = "ACY_UNAUTH_TANK_UNCOL")
        protected BigDecimal acyunauthtankuncol;
        @XmlElement(name = "INTLIQD")
        protected List<IntLiqdType> intliqd;

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
         * Gets the value of the trndt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTRNDT() {
            return trndt;
        }

        /**
         * Sets the value of the trndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTRNDT(XMLGregorianCalendar value) {
            this.trndt = value;
        }

        /**
         * Gets the value of the opnbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOPNBAL() {
            return opnbal;
        }

        /**
         * Sets the value of the opnbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOPNBAL(BigDecimal value) {
            this.opnbal = value;
        }

        /**
         * Gets the value of the curbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCURBAL() {
            return curbal;
        }

        /**
         * Sets the value of the curbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCURBAL(BigDecimal value) {
            this.curbal = value;
        }

        /**
         * Gets the value of the avlbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAVLBAL() {
            return avlbal;
        }

        /**
         * Sets the value of the avlbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAVLBAL(BigDecimal value) {
            this.avlbal = value;
        }

        /**
         * Gets the value of the uncolamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUNCOLAMT() {
            return uncolamt;
        }

        /**
         * Sets the value of the uncolamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUNCOLAMT(BigDecimal value) {
            this.uncolamt = value;
        }

        /**
         * Gets the value of the avlcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAVLCR() {
            return avlcr;
        }

        /**
         * Sets the value of the avlcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAVLCR(BigDecimal value) {
            this.avlcr = value;
        }

        /**
         * Gets the value of the mtdtovcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMTDTOVCR() {
            return mtdtovcr;
        }

        /**
         * Sets the value of the mtdtovcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMTDTOVCR(BigDecimal value) {
            this.mtdtovcr = value;
        }

        /**
         * Gets the value of the mtdtovdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMTDTOVDR() {
            return mtdtovdr;
        }

        /**
         * Sets the value of the mtdtovdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMTDTOVDR(BigDecimal value) {
            this.mtdtovdr = value;
        }

        /**
         * Gets the value of the acybkdamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYBKDAMT() {
            return acybkdamt;
        }

        /**
         * Sets the value of the acybkdamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYBKDAMT(BigDecimal value) {
            this.acybkdamt = value;
        }

        /**
         * Gets the value of the accrdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACCRDR() {
            return accrdr;
        }

        /**
         * Sets the value of the accrdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACCRDR(BigDecimal value) {
            this.accrdr = value;
        }

        /**
         * Gets the value of the accrcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACCRCR() {
            return accrcr;
        }

        /**
         * Sets the value of the accrcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACCRCR(BigDecimal value) {
            this.accrcr = value;
        }

        /**
         * Gets the value of the sublimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSUBLIMIT() {
            return sublimit;
        }

        /**
         * Sets the value of the sublimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSUBLIMIT(BigDecimal value) {
            this.sublimit = value;
        }

        /**
         * Gets the value of the todlimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTODLIMIT() {
            return todlimit;
        }

        /**
         * Sets the value of the todlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTODLIMIT(BigDecimal value) {
            this.todlimit = value;
        }

        /**
         * Gets the value of the todstdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTODSTDT() {
            return todstdt;
        }

        /**
         * Sets the value of the todstdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTODSTDT(XMLGregorianCalendar value) {
            this.todstdt = value;
        }

        /**
         * Gets the value of the todexpdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTODEXPDT() {
            return todexpdt;
        }

        /**
         * Sets the value of the todexpdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTODEXPDT(XMLGregorianCalendar value) {
            this.todexpdt = value;
        }

        /**
         * Gets the value of the acytankcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYTANKCR() {
            return acytankcr;
        }

        /**
         * Sets the value of the acytankcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYTANKCR(BigDecimal value) {
            this.acytankcr = value;
        }

        /**
         * Gets the value of the acytankdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYTANKDR() {
            return acytankdr;
        }

        /**
         * Sets the value of the acytankdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYTANKDR(BigDecimal value) {
            this.acytankdr = value;
        }

        /**
         * Gets the value of the acytankuncol property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYTANKUNCOL() {
            return acytankuncol;
        }

        /**
         * Sets the value of the acytankuncol property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYTANKUNCOL(BigDecimal value) {
            this.acytankuncol = value;
        }

        /**
         * Gets the value of the acyunauthdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHDR() {
            return acyunauthdr;
        }

        /**
         * Sets the value of the acyunauthdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHDR(BigDecimal value) {
            this.acyunauthdr = value;
        }

        /**
         * Gets the value of the acyunauthtankdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHTANKDR() {
            return acyunauthtankdr;
        }

        /**
         * Sets the value of the acyunauthtankdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHTANKDR(BigDecimal value) {
            this.acyunauthtankdr = value;
        }

        /**
         * Gets the value of the acyunauthcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHCR() {
            return acyunauthcr;
        }

        /**
         * Sets the value of the acyunauthcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHCR(BigDecimal value) {
            this.acyunauthcr = value;
        }

        /**
         * Gets the value of the acyunauthtankcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHTANKCR() {
            return acyunauthtankcr;
        }

        /**
         * Sets the value of the acyunauthtankcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHTANKCR(BigDecimal value) {
            this.acyunauthtankcr = value;
        }

        /**
         * Gets the value of the acyunauthuncol property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHUNCOL() {
            return acyunauthuncol;
        }

        /**
         * Sets the value of the acyunauthuncol property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHUNCOL(BigDecimal value) {
            this.acyunauthuncol = value;
        }

        /**
         * Gets the value of the acyunauthtankuncol property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHTANKUNCOL() {
            return acyunauthtankuncol;
        }

        /**
         * Sets the value of the acyunauthtankuncol property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHTANKUNCOL(BigDecimal value) {
            this.acyunauthtankuncol = value;
        }

        /**
         * Gets the value of the intliqd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intliqd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINTLIQD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntLiqdType }
         * 
         * 
         */
        public List<IntLiqdType> getINTLIQD() {
            if (intliqd == null) {
                intliqd = new ArrayList<IntLiqdType>();
            }
            return this.intliqd;
        }

    }

}
