
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcProvDetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcProvDetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRVSTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRVPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DISCPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcProvDetType", propOrder = {
    "prvstatus",
    "prvpc",
    "discpc"
})
public class AcProvDetType {

    @XmlElement(name = "PRVSTATUS", required = true)
    protected String prvstatus;
    @XmlElement(name = "PRVPC")
    protected BigDecimal prvpc;
    @XmlElement(name = "DISCPC")
    protected BigDecimal discpc;

    /**
     * Gets the value of the prvstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRVSTATUS() {
        return prvstatus;
    }

    /**
     * Sets the value of the prvstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRVSTATUS(String value) {
        this.prvstatus = value;
    }

    /**
     * Gets the value of the prvpc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRVPC() {
        return prvpc;
    }

    /**
     * Sets the value of the prvpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRVPC(BigDecimal value) {
        this.prvpc = value;
    }

    /**
     * Gets the value of the discpc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISCPC() {
        return discpc;
    }

    /**
     * Sets the value of the discpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISCPC(BigDecimal value) {
        this.discpc = value;
    }

}
