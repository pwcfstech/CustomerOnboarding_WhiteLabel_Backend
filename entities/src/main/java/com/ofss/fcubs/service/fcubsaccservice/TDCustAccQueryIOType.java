
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDCustAcc-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDCustAcc-Query-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TERM_ACNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CRS_STST_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDCustAcc-Query-IO-Type", propOrder = {
    "brn",
    "termacno",
    "crsststreqd"
})
public class TDCustAccQueryIOType {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "TERM_ACNO", required = true)
    protected String termacno;
    @XmlElement(name = "CRS_STST_REQD")
    protected String crsststreqd;

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
     * Gets the value of the termacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTERMACNO() {
        return termacno;
    }

    /**
     * Sets the value of the termacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTERMACNO(String value) {
        this.termacno = value;
    }

    /**
     * Gets the value of the crsststreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRSSTSTREQD() {
        return crsststreqd;
    }

    /**
     * Sets the value of the crsststreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRSSTSTREQD(String value) {
        this.crsststreqd = value;
    }

}
