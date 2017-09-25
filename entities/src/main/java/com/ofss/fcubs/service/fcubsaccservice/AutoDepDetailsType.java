
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoDepDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoDepDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWPTOACBRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SWPTOAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SWPAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MINREQDBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STARTDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="RETRYTILLDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SWPMULTIOF" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoDepDetailsType", propOrder = {
    "swptoacbrn",
    "swptoac",
    "swpamount",
    "minreqdbal",
    "depccy",
    "startdt",
    "retrytilldt",
    "accls",
    "ccy",
    "tenor",
    "customer",
    "seqno",
    "scode",
    "xref",
    "swpmultiof"
})
public class AutoDepDetailsType {

    @XmlElement(name = "SWPTOACBRN", required = true)
    protected String swptoacbrn;
    @XmlElement(name = "SWPTOAC", required = true)
    protected String swptoac;
    @XmlElement(name = "SWPAMOUNT")
    protected BigDecimal swpamount;
    @XmlElement(name = "MINREQDBAL")
    protected BigDecimal minreqdbal;
    @XmlElement(name = "DEPCCY")
    protected String depccy;
    @XmlElement(name = "STARTDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object startdt;
    @XmlElement(name = "RETRYTILLDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object retrytilldt;
    @XmlElement(name = "ACCLS")
    protected String accls;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "TENOR")
    protected BigInteger tenor;
    @XmlElement(name = "CUSTOMER")
    protected String customer;
    @XmlElement(name = "SEQNO")
    protected BigInteger seqno;
    @XmlElement(name = "SCODE")
    protected String scode;
    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "SWPMULTIOF")
    protected BigInteger swpmultiof;

    /**
     * Gets the value of the swptoacbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWPTOACBRN() {
        return swptoacbrn;
    }

    /**
     * Sets the value of the swptoacbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWPTOACBRN(String value) {
        this.swptoacbrn = value;
    }

    /**
     * Gets the value of the swptoac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWPTOAC() {
        return swptoac;
    }

    /**
     * Sets the value of the swptoac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWPTOAC(String value) {
        this.swptoac = value;
    }

    /**
     * Gets the value of the swpamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSWPAMOUNT() {
        return swpamount;
    }

    /**
     * Sets the value of the swpamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSWPAMOUNT(BigDecimal value) {
        this.swpamount = value;
    }

    /**
     * Gets the value of the minreqdbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINREQDBAL() {
        return minreqdbal;
    }

    /**
     * Sets the value of the minreqdbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINREQDBAL(BigDecimal value) {
        this.minreqdbal = value;
    }

    /**
     * Gets the value of the depccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPCCY() {
        return depccy;
    }

    /**
     * Sets the value of the depccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPCCY(String value) {
        this.depccy = value;
    }

    /**
     * Gets the value of the startdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSTARTDT() {
        return startdt;
    }

    /**
     * Sets the value of the startdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSTARTDT(Object value) {
        this.startdt = value;
    }

    /**
     * Gets the value of the retrytilldt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRETRYTILLDT() {
        return retrytilldt;
    }

    /**
     * Sets the value of the retrytilldt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRETRYTILLDT(Object value) {
        this.retrytilldt = value;
    }

    /**
     * Gets the value of the accls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCLS() {
        return accls;
    }

    /**
     * Sets the value of the accls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCLS(String value) {
        this.accls = value;
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
     * Gets the value of the tenor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTENOR() {
        return tenor;
    }

    /**
     * Sets the value of the tenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTENOR(BigInteger value) {
        this.tenor = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMER() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMER(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the seqno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEQNO() {
        return seqno;
    }

    /**
     * Sets the value of the seqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEQNO(BigInteger value) {
        this.seqno = value;
    }

    /**
     * Gets the value of the scode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCODE() {
        return scode;
    }

    /**
     * Sets the value of the scode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCODE(String value) {
        this.scode = value;
    }

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXREF() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXREF(String value) {
        this.xref = value;
    }

    /**
     * Gets the value of the swpmultiof property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSWPMULTIOF() {
        return swpmultiof;
    }

    /**
     * Sets the value of the swpmultiof property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSWPMULTIOF(BigInteger value) {
        this.swpmultiof = value;
    }

}
