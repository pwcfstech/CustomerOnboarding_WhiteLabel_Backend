
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
 * <p>Java class for CustDiaryDetails-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustDiaryDetails-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Diary-Mst" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UNTVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSTRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EXEDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EXEMONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EXEYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MNTHENDFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HLDRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FRSTDUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="NXTDUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="NXTEXEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CONDELEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OPRTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONDVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACCOFCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SPLINSTRTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="SPLINSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CustDiaryDetails-Modify-IO-Type", propOrder = {
    "custno",
    "diaryMst"
})
public class CustDiaryDetailsModifyIOType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "Diary-Mst")
    protected List<CustDiaryDetailsModifyIOType.DiaryMst> diaryMst;

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
     * Gets the value of the diaryMst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diaryMst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiaryMst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustDiaryDetailsModifyIOType.DiaryMst }
     * 
     * 
     */
    public List<CustDiaryDetailsModifyIOType.DiaryMst> getDiaryMst() {
        if (diaryMst == null) {
            diaryMst = new ArrayList<CustDiaryDetailsModifyIOType.DiaryMst>();
        }
        return this.diaryMst;
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
     *         &lt;element name="INSTRNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="UNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UNTVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSTRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EXEDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EXEMONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EXEYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MNTHENDFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HLDRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FRSTDUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="NXTDUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="NXTEXEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CONDELEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OPRTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONDVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACCOFCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SPLINSTRTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="SPLINSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "instrno",
        "unttyp",
        "untval",
        "brn",
        "instr",
        "instrtype",
        "exedays",
        "exemonths",
        "exeyears",
        "mnthendflg",
        "hldrule",
        "frstduedt",
        "nxtduedt",
        "nxtexedt",
        "condelem",
        "oprtr",
        "condval",
        "accofcr",
        "splinstrtyp",
        "expdt",
        "splinstr"
    })
    public static class DiaryMst {

        @XmlElement(name = "INSTRNO", required = true)
        protected String instrno;
        @XmlElement(name = "UNTTYP")
        protected String unttyp;
        @XmlElement(name = "UNTVAL")
        protected String untval;
        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "INSTR")
        protected String instr;
        @XmlElement(name = "INSTRTYPE")
        protected String instrtype;
        @XmlElement(name = "EXEDAYS")
        protected BigDecimal exedays;
        @XmlElement(name = "EXEMONTHS")
        protected BigDecimal exemonths;
        @XmlElement(name = "EXEYEARS")
        protected BigDecimal exeyears;
        @XmlElement(name = "MNTHENDFLG")
        protected String mnthendflg;
        @XmlElement(name = "HLDRULE")
        protected String hldrule;
        @XmlElement(name = "FRSTDUEDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar frstduedt;
        @XmlElement(name = "NXTDUEDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nxtduedt;
        @XmlElement(name = "NXTEXEDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nxtexedt;
        @XmlElement(name = "CONDELEM")
        protected String condelem;
        @XmlElement(name = "OPRTR")
        protected String oprtr;
        @XmlElement(name = "CONDVAL")
        protected BigDecimal condval;
        @XmlElement(name = "ACCOFCR")
        protected String accofcr;
        @XmlElement(name = "SPLINSTRTYP")
        protected String splinstrtyp;
        @XmlElement(name = "EXPDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expdt;
        @XmlElement(name = "SPLINSTR")
        protected String splinstr;

        /**
         * Gets the value of the instrno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRNO() {
            return instrno;
        }

        /**
         * Sets the value of the instrno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRNO(String value) {
            this.instrno = value;
        }

        /**
         * Gets the value of the unttyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNTTYP() {
            return unttyp;
        }

        /**
         * Sets the value of the unttyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNTTYP(String value) {
            this.unttyp = value;
        }

        /**
         * Gets the value of the untval property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNTVAL() {
            return untval;
        }

        /**
         * Sets the value of the untval property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNTVAL(String value) {
            this.untval = value;
        }

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
         * Gets the value of the instr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTR() {
            return instr;
        }

        /**
         * Sets the value of the instr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTR(String value) {
            this.instr = value;
        }

        /**
         * Gets the value of the instrtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRTYPE() {
            return instrtype;
        }

        /**
         * Sets the value of the instrtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRTYPE(String value) {
            this.instrtype = value;
        }

        /**
         * Gets the value of the exedays property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXEDAYS() {
            return exedays;
        }

        /**
         * Sets the value of the exedays property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXEDAYS(BigDecimal value) {
            this.exedays = value;
        }

        /**
         * Gets the value of the exemonths property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXEMONTHS() {
            return exemonths;
        }

        /**
         * Sets the value of the exemonths property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXEMONTHS(BigDecimal value) {
            this.exemonths = value;
        }

        /**
         * Gets the value of the exeyears property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXEYEARS() {
            return exeyears;
        }

        /**
         * Sets the value of the exeyears property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXEYEARS(BigDecimal value) {
            this.exeyears = value;
        }

        /**
         * Gets the value of the mnthendflg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMNTHENDFLG() {
            return mnthendflg;
        }

        /**
         * Sets the value of the mnthendflg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMNTHENDFLG(String value) {
            this.mnthendflg = value;
        }

        /**
         * Gets the value of the hldrule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHLDRULE() {
            return hldrule;
        }

        /**
         * Sets the value of the hldrule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHLDRULE(String value) {
            this.hldrule = value;
        }

        /**
         * Gets the value of the frstduedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFRSTDUEDT() {
            return frstduedt;
        }

        /**
         * Sets the value of the frstduedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFRSTDUEDT(XMLGregorianCalendar value) {
            this.frstduedt = value;
        }

        /**
         * Gets the value of the nxtduedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNXTDUEDT() {
            return nxtduedt;
        }

        /**
         * Sets the value of the nxtduedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNXTDUEDT(XMLGregorianCalendar value) {
            this.nxtduedt = value;
        }

        /**
         * Gets the value of the nxtexedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNXTEXEDT() {
            return nxtexedt;
        }

        /**
         * Sets the value of the nxtexedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNXTEXEDT(XMLGregorianCalendar value) {
            this.nxtexedt = value;
        }

        /**
         * Gets the value of the condelem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONDELEM() {
            return condelem;
        }

        /**
         * Sets the value of the condelem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONDELEM(String value) {
            this.condelem = value;
        }

        /**
         * Gets the value of the oprtr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOPRTR() {
            return oprtr;
        }

        /**
         * Sets the value of the oprtr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOPRTR(String value) {
            this.oprtr = value;
        }

        /**
         * Gets the value of the condval property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCONDVAL() {
            return condval;
        }

        /**
         * Sets the value of the condval property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCONDVAL(BigDecimal value) {
            this.condval = value;
        }

        /**
         * Gets the value of the accofcr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOFCR() {
            return accofcr;
        }

        /**
         * Sets the value of the accofcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOFCR(String value) {
            this.accofcr = value;
        }

        /**
         * Gets the value of the splinstrtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSPLINSTRTYP() {
            return splinstrtyp;
        }

        /**
         * Sets the value of the splinstrtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSPLINSTRTYP(String value) {
            this.splinstrtyp = value;
        }

        /**
         * Gets the value of the expdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEXPDT() {
            return expdt;
        }

        /**
         * Sets the value of the expdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEXPDT(XMLGregorianCalendar value) {
            this.expdt = value;
        }

        /**
         * Gets the value of the splinstr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSPLINSTR() {
            return splinstr;
        }

        /**
         * Sets the value of the splinstr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSPLINSTR(String value) {
            this.splinstr = value;
        }

    }

}
