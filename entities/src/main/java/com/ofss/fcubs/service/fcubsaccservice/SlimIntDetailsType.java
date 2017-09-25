
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SlimIntDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlimIntDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRINTRT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRINTRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRINTRT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DRINTRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTBOOKBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlimIntDetailsType", propOrder = {
    "crintrt",
    "crintrtcd",
    "drintrt",
    "drintrtcd",
    "intbookacc",
    "intbookbrn"
})
public class SlimIntDetailsType {

    @XmlElement(name = "CRINTRT")
    protected BigDecimal crintrt;
    @XmlElement(name = "CRINTRTCD")
    protected String crintrtcd;
    @XmlElement(name = "DRINTRT")
    protected BigDecimal drintrt;
    @XmlElement(name = "DRINTRTCD")
    protected String drintrtcd;
    @XmlElement(name = "INTBOOKACC")
    protected String intbookacc;
    @XmlElement(name = "INTBOOKBRN")
    protected String intbookbrn;

    /**
     * Gets the value of the crintrt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRINTRT() {
        return crintrt;
    }

    /**
     * Sets the value of the crintrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRINTRT(BigDecimal value) {
        this.crintrt = value;
    }

    /**
     * Gets the value of the crintrtcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRINTRTCD() {
        return crintrtcd;
    }

    /**
     * Sets the value of the crintrtcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRINTRTCD(String value) {
        this.crintrtcd = value;
    }

    /**
     * Gets the value of the drintrt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRINTRT() {
        return drintrt;
    }

    /**
     * Sets the value of the drintrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRINTRT(BigDecimal value) {
        this.drintrt = value;
    }

    /**
     * Gets the value of the drintrtcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRINTRTCD() {
        return drintrtcd;
    }

    /**
     * Sets the value of the drintrtcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRINTRTCD(String value) {
        this.drintrtcd = value;
    }

    /**
     * Gets the value of the intbookacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTBOOKACC() {
        return intbookacc;
    }

    /**
     * Sets the value of the intbookacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTBOOKACC(String value) {
        this.intbookacc = value;
    }

    /**
     * Gets the value of the intbookbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTBOOKBRN() {
        return intbookbrn;
    }

    /**
     * Sets the value of the intbookbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTBOOKBRN(String value) {
        this.intbookbrn = value;
    }

}
