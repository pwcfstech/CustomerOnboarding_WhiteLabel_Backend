
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
 * <p>Java class for Diarydetails-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diarydetails-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Diarydetails" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UNTVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSTRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EXEDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EXEMONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EXEYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MNTHENDFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HLDRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FRSTDUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="NXTDUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="NXTEXCDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="OPERATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONDVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ACCOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SPLINSTRTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SPLINSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="RECSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONDELEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Diarydetails-Full-Type", propOrder = {
    "diarydetails"
})
public class DiarydetailsFullType {

    @XmlElement(name = "Diarydetails")
    protected List<DiarydetailsFullType.Diarydetails> diarydetails;

    /**
     * Gets the value of the diarydetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diarydetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiarydetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiarydetailsFullType.Diarydetails }
     * 
     * 
     */
    public List<DiarydetailsFullType.Diarydetails> getDiarydetails() {
        if (diarydetails == null) {
            diarydetails = new ArrayList<DiarydetailsFullType.Diarydetails>();
        }
        return this.diarydetails;
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
     *         &lt;element name="INSTRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UNTVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSTRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EXEDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EXEMONTHS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EXEYEARS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MNTHENDFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HLDRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FRSTDUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="NXTDUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="NXTEXCDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="OPERATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONDVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ACCOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SPLINSTRTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SPLINSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="RECSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONDELEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "untype",
        "untval",
        "instr",
        "instrtype",
        "exedays",
        "exemonths",
        "exeyears",
        "mnthendflg",
        "hldrule",
        "frstduedt",
        "nxtduedt",
        "nxtexcdt",
        "operator",
        "condval",
        "accofficer",
        "splinstrtyp",
        "splinstr",
        "expdt",
        "recstatus",
        "authstat",
        "condelem"
    })
    public static class Diarydetails {

        @XmlElement(name = "INSTRNO")
        protected String instrno;
        @XmlElement(name = "UNTYPE")
        protected String untype;
        @XmlElement(name = "UNTVAL")
        protected String untval;
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
        @XmlElement(name = "NXTEXCDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nxtexcdt;
        @XmlElement(name = "OPERATOR")
        protected String operator;
        @XmlElement(name = "CONDVAL")
        protected BigDecimal condval;
        @XmlElement(name = "ACCOFFICER")
        protected String accofficer;
        @XmlElement(name = "SPLINSTRTYP")
        protected String splinstrtyp;
        @XmlElement(name = "SPLINSTR")
        protected String splinstr;
        @XmlElement(name = "EXPDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expdt;
        @XmlElement(name = "RECSTATUS")
        protected String recstatus;
        @XmlElement(name = "AUTHSTAT")
        protected String authstat;
        @XmlElement(name = "CONDELEM")
        protected String condelem;

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
         * Gets the value of the untype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNTYPE() {
            return untype;
        }

        /**
         * Sets the value of the untype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNTYPE(String value) {
            this.untype = value;
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
         * Gets the value of the nxtexcdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNXTEXCDT() {
            return nxtexcdt;
        }

        /**
         * Sets the value of the nxtexcdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNXTEXCDT(XMLGregorianCalendar value) {
            this.nxtexcdt = value;
        }

        /**
         * Gets the value of the operator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOPERATOR() {
            return operator;
        }

        /**
         * Sets the value of the operator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOPERATOR(String value) {
            this.operator = value;
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
         * Gets the value of the accofficer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOFFICER() {
            return accofficer;
        }

        /**
         * Sets the value of the accofficer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOFFICER(String value) {
            this.accofficer = value;
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
         * Gets the value of the recstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECSTATUS() {
            return recstatus;
        }

        /**
         * Sets the value of the recstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECSTATUS(String value) {
            this.recstatus = value;
        }

        /**
         * Gets the value of the authstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTHSTAT() {
            return authstat;
        }

        /**
         * Sets the value of the authstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTHSTAT(String value) {
            this.authstat = value;
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

    }

}
