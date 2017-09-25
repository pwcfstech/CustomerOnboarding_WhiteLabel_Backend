
package com.ofss.fcubs.service.fcubscustomerservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Stdncbqy-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stdncbqy-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXTREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_TAX_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CUST_DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRESS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRESS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BK_EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BK_EFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CUSTOMER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMER_NAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNIQUE_ID_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPSEQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stdncbqy-Full-Type", propOrder = {
    "extrefno",
    "bankcode",
    "bankname",
    "custtype",
    "custuid",
    "custtaxid",
    "custdob",
    "address1",
    "address2",
    "address3",
    "address4",
    "bkexpdt",
    "custacno",
    "accounttype",
    "customerno",
    "custname",
    "bkeffdt",
    "customertype",
    "customername1",
    "uniqueidvalue",
    "dob",
    "remarks",
    "upseq"
})
public class StdncbqyFullType {

    @XmlElement(name = "EXTREFNO")
    protected String extrefno;
    @XmlElement(name = "BANK_CODE")
    protected String bankcode;
    @XmlElement(name = "BANK_NAME")
    protected String bankname;
    @XmlElement(name = "CUST_TYPE")
    protected String custtype;
    @XmlElement(name = "CUST_UID")
    protected String custuid;
    @XmlElement(name = "CUST_TAX_ID")
    protected BigDecimal custtaxid;
    @XmlElement(name = "CUST_DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar custdob;
    @XmlElement(name = "ADDRESS1")
    protected String address1;
    @XmlElement(name = "ADDRESS2")
    protected String address2;
    @XmlElement(name = "ADDRESS3")
    protected String address3;
    @XmlElement(name = "ADDRESS4")
    protected String address4;
    @XmlElement(name = "BK_EXPDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bkexpdt;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "ACCOUNT_TYPE")
    protected String accounttype;
    @XmlElement(name = "CUSTOMER_NO")
    protected String customerno;
    @XmlElement(name = "CUSTNAME")
    protected String custname;
    @XmlElement(name = "BK_EFFDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bkeffdt;
    @XmlElement(name = "CUSTOMER_TYPE")
    protected String customertype;
    @XmlElement(name = "CUSTOMER_NAME1")
    protected String customername1;
    @XmlElement(name = "UNIQUE_ID_VALUE")
    protected String uniqueidvalue;
    @XmlElement(name = "DOB")
    protected String dob;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "UPSEQ")
    protected BigDecimal upseq;

    /**
     * Gets the value of the extrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTREFNO() {
        return extrefno;
    }

    /**
     * Sets the value of the extrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTREFNO(String value) {
        this.extrefno = value;
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
     * Gets the value of the bankname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKNAME() {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKNAME(String value) {
        this.bankname = value;
    }

    /**
     * Gets the value of the custtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTTYPE() {
        return custtype;
    }

    /**
     * Sets the value of the custtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTTYPE(String value) {
        this.custtype = value;
    }

    /**
     * Gets the value of the custuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTUID() {
        return custuid;
    }

    /**
     * Sets the value of the custuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTUID(String value) {
        this.custuid = value;
    }

    /**
     * Gets the value of the custtaxid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCUSTTAXID() {
        return custtaxid;
    }

    /**
     * Sets the value of the custtaxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCUSTTAXID(BigDecimal value) {
        this.custtaxid = value;
    }

    /**
     * Gets the value of the custdob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCUSTDOB() {
        return custdob;
    }

    /**
     * Sets the value of the custdob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCUSTDOB(XMLGregorianCalendar value) {
        this.custdob = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the bkexpdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBKEXPDT() {
        return bkexpdt;
    }

    /**
     * Sets the value of the bkexpdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBKEXPDT(XMLGregorianCalendar value) {
        this.bkexpdt = value;
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
     * Gets the value of the accounttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTYPE() {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTYPE(String value) {
        this.accounttype = value;
    }

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
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNAME() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNAME(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the bkeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBKEFFDT() {
        return bkeffdt;
    }

    /**
     * Sets the value of the bkeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBKEFFDT(XMLGregorianCalendar value) {
        this.bkeffdt = value;
    }

    /**
     * Gets the value of the customertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERTYPE() {
        return customertype;
    }

    /**
     * Sets the value of the customertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERTYPE(String value) {
        this.customertype = value;
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
     * Gets the value of the uniqueidvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIQUEIDVALUE() {
        return uniqueidvalue;
    }

    /**
     * Sets the value of the uniqueidvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIQUEIDVALUE(String value) {
        this.uniqueidvalue = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the upseq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPSEQ() {
        return upseq;
    }

    /**
     * Sets the value of the upseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUPSEQ(BigDecimal value) {
        this.upseq = value;
    }

}
