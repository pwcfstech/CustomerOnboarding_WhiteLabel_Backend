
package com.ofss.fcubs.service.fcubscustomerservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Stdnsfqy-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stdnsfqy-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMER_NAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_EVENT_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_LVL_EFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_LVL_EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_BLK_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_LAST_TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_WBRCK_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_WBRCK_EFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_WBRCK_EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NSFIB_IB_BLK_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_IB_BLK_EFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NSFIB_IB_BLK_EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NSFIB_IB_BLK_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CB_BLK_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CB_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CB_EFFDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CB_EXPDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_BLK_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_WBRCK_STAT_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cus" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Stcnsfib-Full-Type" minOccurs="0"/>
 *         &lt;element name="Cus1" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}Stcnsadv-Full-Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stdnsfqy-Full-Type", propOrder = {
    "customerno",
    "customername1",
    "branchcode",
    "nsfibcseventno",
    "nsfibcslvl",
    "nsfibcslvleffdt",
    "nsfibcslvlexpdt",
    "nsfibcsblkstat",
    "nsfibcslasttrndt",
    "nsfibcswbrckstat",
    "nsfibcswbrckeffdt",
    "nsfibcswbrckexpdt",
    "nsfibibblkstat",
    "nsfibibblkeffdt",
    "nsfibibblkexpdt",
    "nsfibibblkdesc",
    "nsfibcbblkstat",
    "nsfibcbdesc",
    "nsfibcbeffdt",
    "nsfibcbexpdt",
    "nsfibcsblkdesc",
    "nsfibcswbrckstatdesc",
    "cus",
    "cus1"
})
public class StdnsfqyFullType {

    @XmlElement(name = "CUSTOMER_NO")
    protected String customerno;
    @XmlElement(name = "CUSTOMER_NAME1")
    protected String customername1;
    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "NSFIB_CS_EVENT_NO")
    protected BigDecimal nsfibcseventno;
    @XmlElement(name = "NSFIB_CS_LVL")
    protected String nsfibcslvl;
    @XmlElement(name = "NSFIB_CS_LVL_EFFDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nsfibcslvleffdt;
    @XmlElement(name = "NSFIB_CS_LVL_EXPDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nsfibcslvlexpdt;
    @XmlElement(name = "NSFIB_CS_BLK_STAT")
    protected String nsfibcsblkstat;
    @XmlElement(name = "NSFIB_CS_LAST_TRN_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nsfibcslasttrndt;
    @XmlElement(name = "NSFIB_CS_WBRCK_STAT")
    protected String nsfibcswbrckstat;
    @XmlElement(name = "NSFIB_CS_WBRCK_EFFDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nsfibcswbrckeffdt;
    @XmlElement(name = "NSFIB_CS_WBRCK_EXPDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nsfibcswbrckexpdt;
    @XmlElement(name = "NSFIB_IB_BLK_STAT")
    protected String nsfibibblkstat;
    @XmlElement(name = "NSFIB_IB_BLK_EFFDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nsfibibblkeffdt;
    @XmlElement(name = "NSFIB_IB_BLK_EXPDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nsfibibblkexpdt;
    @XmlElement(name = "NSFIB_IB_BLK_DESC")
    protected String nsfibibblkdesc;
    @XmlElement(name = "NSFIB_CB_BLK_STAT")
    protected String nsfibcbblkstat;
    @XmlElement(name = "NSFIB_CB_DESC")
    protected String nsfibcbdesc;
    @XmlElement(name = "NSFIB_CB_EFFDT")
    protected String nsfibcbeffdt;
    @XmlElement(name = "NSFIB_CB_EXPDT")
    protected String nsfibcbexpdt;
    @XmlElement(name = "NSFIB_CS_BLK_DESC")
    protected String nsfibcsblkdesc;
    @XmlElement(name = "NSFIB_CS_WBRCK_STAT_DESC")
    protected String nsfibcswbrckstatdesc;
    @XmlElement(name = "Cus")
    protected StcnsfibFullType cus;
    @XmlElement(name = "Cus1")
    protected StcnsadvFullType cus1;

    /**
     * Gets the value of the customerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNO() {
        return customerno;
    }

    /**
     * Sets the value of the customerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNO(String value) {
        this.customerno = value;
    }

    /**
     * Gets the value of the customername1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNAME1() {
        return customername1;
    }

    /**
     * Sets the value of the customername1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNAME1(String value) {
        this.customername1 = value;
    }

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
     * Gets the value of the nsfibcseventno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNSFIBCSEVENTNO() {
        return nsfibcseventno;
    }

    /**
     * Sets the value of the nsfibcseventno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNSFIBCSEVENTNO(BigDecimal value) {
        this.nsfibcseventno = value;
    }

    /**
     * Gets the value of the nsfibcslvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCSLVL() {
        return nsfibcslvl;
    }

    /**
     * Sets the value of the nsfibcslvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCSLVL(String value) {
        this.nsfibcslvl = value;
    }

    /**
     * Gets the value of the nsfibcslvleffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNSFIBCSLVLEFFDT() {
        return nsfibcslvleffdt;
    }

    /**
     * Sets the value of the nsfibcslvleffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNSFIBCSLVLEFFDT(XMLGregorianCalendar value) {
        this.nsfibcslvleffdt = value;
    }

    /**
     * Gets the value of the nsfibcslvlexpdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNSFIBCSLVLEXPDT() {
        return nsfibcslvlexpdt;
    }

    /**
     * Sets the value of the nsfibcslvlexpdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNSFIBCSLVLEXPDT(XMLGregorianCalendar value) {
        this.nsfibcslvlexpdt = value;
    }

    /**
     * Gets the value of the nsfibcsblkstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCSBLKSTAT() {
        return nsfibcsblkstat;
    }

    /**
     * Sets the value of the nsfibcsblkstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCSBLKSTAT(String value) {
        this.nsfibcsblkstat = value;
    }

    /**
     * Gets the value of the nsfibcslasttrndt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNSFIBCSLASTTRNDT() {
        return nsfibcslasttrndt;
    }

    /**
     * Sets the value of the nsfibcslasttrndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNSFIBCSLASTTRNDT(XMLGregorianCalendar value) {
        this.nsfibcslasttrndt = value;
    }

    /**
     * Gets the value of the nsfibcswbrckstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCSWBRCKSTAT() {
        return nsfibcswbrckstat;
    }

    /**
     * Sets the value of the nsfibcswbrckstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCSWBRCKSTAT(String value) {
        this.nsfibcswbrckstat = value;
    }

    /**
     * Gets the value of the nsfibcswbrckeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNSFIBCSWBRCKEFFDT() {
        return nsfibcswbrckeffdt;
    }

    /**
     * Sets the value of the nsfibcswbrckeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNSFIBCSWBRCKEFFDT(XMLGregorianCalendar value) {
        this.nsfibcswbrckeffdt = value;
    }

    /**
     * Gets the value of the nsfibcswbrckexpdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNSFIBCSWBRCKEXPDT() {
        return nsfibcswbrckexpdt;
    }

    /**
     * Sets the value of the nsfibcswbrckexpdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNSFIBCSWBRCKEXPDT(XMLGregorianCalendar value) {
        this.nsfibcswbrckexpdt = value;
    }

    /**
     * Gets the value of the nsfibibblkstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBIBBLKSTAT() {
        return nsfibibblkstat;
    }

    /**
     * Sets the value of the nsfibibblkstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBIBBLKSTAT(String value) {
        this.nsfibibblkstat = value;
    }

    /**
     * Gets the value of the nsfibibblkeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNSFIBIBBLKEFFDT() {
        return nsfibibblkeffdt;
    }

    /**
     * Sets the value of the nsfibibblkeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNSFIBIBBLKEFFDT(XMLGregorianCalendar value) {
        this.nsfibibblkeffdt = value;
    }

    /**
     * Gets the value of the nsfibibblkexpdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNSFIBIBBLKEXPDT() {
        return nsfibibblkexpdt;
    }

    /**
     * Sets the value of the nsfibibblkexpdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNSFIBIBBLKEXPDT(XMLGregorianCalendar value) {
        this.nsfibibblkexpdt = value;
    }

    /**
     * Gets the value of the nsfibibblkdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBIBBLKDESC() {
        return nsfibibblkdesc;
    }

    /**
     * Sets the value of the nsfibibblkdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBIBBLKDESC(String value) {
        this.nsfibibblkdesc = value;
    }

    /**
     * Gets the value of the nsfibcbblkstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCBBLKSTAT() {
        return nsfibcbblkstat;
    }

    /**
     * Sets the value of the nsfibcbblkstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCBBLKSTAT(String value) {
        this.nsfibcbblkstat = value;
    }

    /**
     * Gets the value of the nsfibcbdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCBDESC() {
        return nsfibcbdesc;
    }

    /**
     * Sets the value of the nsfibcbdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCBDESC(String value) {
        this.nsfibcbdesc = value;
    }

    /**
     * Gets the value of the nsfibcbeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCBEFFDT() {
        return nsfibcbeffdt;
    }

    /**
     * Sets the value of the nsfibcbeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCBEFFDT(String value) {
        this.nsfibcbeffdt = value;
    }

    /**
     * Gets the value of the nsfibcbexpdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCBEXPDT() {
        return nsfibcbexpdt;
    }

    /**
     * Sets the value of the nsfibcbexpdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCBEXPDT(String value) {
        this.nsfibcbexpdt = value;
    }

    /**
     * Gets the value of the nsfibcsblkdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCSBLKDESC() {
        return nsfibcsblkdesc;
    }

    /**
     * Sets the value of the nsfibcsblkdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCSBLKDESC(String value) {
        this.nsfibcsblkdesc = value;
    }

    /**
     * Gets the value of the nsfibcswbrckstatdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFIBCSWBRCKSTATDESC() {
        return nsfibcswbrckstatdesc;
    }

    /**
     * Sets the value of the nsfibcswbrckstatdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFIBCSWBRCKSTATDESC(String value) {
        this.nsfibcswbrckstatdesc = value;
    }

    /**
     * Gets the value of the cus property.
     * 
     * @return
     *     possible object is
     *     {@link StcnsfibFullType }
     *     
     */
    public StcnsfibFullType getCus() {
        return cus;
    }

    /**
     * Sets the value of the cus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StcnsfibFullType }
     *     
     */
    public void setCus(StcnsfibFullType value) {
        this.cus = value;
    }

    /**
     * Gets the value of the cus1 property.
     * 
     * @return
     *     possible object is
     *     {@link StcnsadvFullType }
     *     
     */
    public StcnsadvFullType getCus1() {
        return cus1;
    }

    /**
     * Sets the value of the cus1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StcnsadvFullType }
     *     
     */
    public void setCus1(StcnsadvFullType value) {
        this.cus1 = value;
    }

}
