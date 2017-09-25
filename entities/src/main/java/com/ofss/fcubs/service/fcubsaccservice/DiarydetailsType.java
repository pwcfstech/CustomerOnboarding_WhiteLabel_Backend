
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiarydetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiarydetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INSTRNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UNTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UNTVAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXEDAYS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EXEMONTHS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EXEYEARS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MNTHENDFLG" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="HLDRULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FRSTDUEDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="NXTDUEDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="NXTEXCDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="OPERATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONDVAL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ACCOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPLINSTRTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPLINSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="RECSTATUS" type="{http://fcubs.ofss.com/service/FCUBSAccService}RecStatType" minOccurs="0"/>
 *         &lt;element name="AUTHSTAT" type="{http://fcubs.ofss.com/service/FCUBSAccService}AUTHSTATType" minOccurs="0"/>
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
@XmlType(name = "DiarydetailsType", propOrder = {
    "instrno",
    "untype",
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
public class DiarydetailsType {

    @XmlElement(name = "INSTRNO", required = true)
    protected String instrno;
    @XmlElement(name = "UNTYPE", required = true)
    protected String untype;
    @XmlElement(name = "UNTVAL", required = true)
    protected String untval;
    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "INSTR")
    protected String instr;
    @XmlElement(name = "INSTRTYPE")
    protected String instrtype;
    @XmlElement(name = "EXEDAYS")
    protected BigInteger exedays;
    @XmlElement(name = "EXEMONTHS")
    protected BigInteger exemonths;
    @XmlElement(name = "EXEYEARS")
    protected BigInteger exeyears;
    @XmlElement(name = "MNTHENDFLG")
    @XmlSchemaType(name = "string")
    protected YesNoType mnthendflg;
    @XmlElement(name = "HLDRULE")
    protected String hldrule;
    @XmlElement(name = "FRSTDUEDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object frstduedt;
    @XmlElement(name = "NXTDUEDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object nxtduedt;
    @XmlElement(name = "NXTEXCDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object nxtexcdt;
    @XmlElement(name = "OPERATOR")
    protected String operator;
    @XmlElement(name = "CONDVAL")
    protected BigInteger condval;
    @XmlElement(name = "ACCOFFICER")
    protected String accofficer;
    @XmlElement(name = "SPLINSTRTYP")
    protected String splinstrtyp;
    @XmlElement(name = "SPLINSTR")
    protected String splinstr;
    @XmlElement(name = "EXPDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object expdt;
    @XmlElement(name = "RECSTATUS")
    @XmlSchemaType(name = "string")
    protected RecStatType recstatus;
    @XmlElement(name = "AUTHSTAT")
    @XmlSchemaType(name = "string")
    protected AUTHSTATType authstat;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXEDAYS() {
        return exedays;
    }

    /**
     * Sets the value of the exedays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXEDAYS(BigInteger value) {
        this.exedays = value;
    }

    /**
     * Gets the value of the exemonths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXEMONTHS() {
        return exemonths;
    }

    /**
     * Sets the value of the exemonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXEMONTHS(BigInteger value) {
        this.exemonths = value;
    }

    /**
     * Gets the value of the exeyears property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXEYEARS() {
        return exeyears;
    }

    /**
     * Sets the value of the exeyears property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXEYEARS(BigInteger value) {
        this.exeyears = value;
    }

    /**
     * Gets the value of the mnthendflg property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getMNTHENDFLG() {
        return mnthendflg;
    }

    /**
     * Sets the value of the mnthendflg property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setMNTHENDFLG(YesNoType value) {
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
     *     {@link Object }
     *     
     */
    public Object getFRSTDUEDT() {
        return frstduedt;
    }

    /**
     * Sets the value of the frstduedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFRSTDUEDT(Object value) {
        this.frstduedt = value;
    }

    /**
     * Gets the value of the nxtduedt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNXTDUEDT() {
        return nxtduedt;
    }

    /**
     * Sets the value of the nxtduedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNXTDUEDT(Object value) {
        this.nxtduedt = value;
    }

    /**
     * Gets the value of the nxtexcdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNXTEXCDT() {
        return nxtexcdt;
    }

    /**
     * Sets the value of the nxtexcdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNXTEXCDT(Object value) {
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCONDVAL() {
        return condval;
    }

    /**
     * Sets the value of the condval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCONDVAL(BigInteger value) {
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
     *     {@link Object }
     *     
     */
    public Object getEXPDT() {
        return expdt;
    }

    /**
     * Sets the value of the expdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXPDT(Object value) {
        this.expdt = value;
    }

    /**
     * Gets the value of the recstatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecStatType }
     *     
     */
    public RecStatType getRECSTATUS() {
        return recstatus;
    }

    /**
     * Sets the value of the recstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecStatType }
     *     
     */
    public void setRECSTATUS(RecStatType value) {
        this.recstatus = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link AUTHSTATType }
     *     
     */
    public AUTHSTATType getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUTHSTATType }
     *     
     */
    public void setAUTHSTAT(AUTHSTATType value) {
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
