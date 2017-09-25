
package com.ofss.fcubs.service.fcubscustomerservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDAmountBlock-Reopen-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDAmountBlock-Reopen-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMTBLKNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDAmountBlock-Reopen-IO-Type", propOrder = {
    "amtblkno",
    "modno"
})
public class TDAmountBlockReopenIOType {

    @XmlElement(name = "AMTBLKNO", required = true)
    protected String amtblkno;
    @XmlElement(name = "MODNO")
    protected BigInteger modno;

    /**
     * Gets the value of the amtblkno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTBLKNO() {
        return amtblkno;
    }

    /**
     * Sets the value of the amtblkno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTBLKNO(String value) {
        this.amtblkno = value;
    }

    /**
     * Gets the value of the modno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODNO() {
        return modno;
    }

    /**
     * Sets the value of the modno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODNO(BigInteger value) {
        this.modno = value;
    }

}
