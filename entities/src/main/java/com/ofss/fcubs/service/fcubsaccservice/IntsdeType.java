
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntsdeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntsdeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RATEFLAG" type="{http://fcubs.ofss.com/service/FCUBSAccService}RateFlgType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntsdeType", propOrder = {
    "udeid",
    "udevalue",
    "ratecode",
    "tdratecode",
    "rateflag"
})
public class IntsdeType {

    @XmlElement(name = "UDEID", required = true)
    protected String udeid;
    @XmlElement(name = "UDEVALUE")
    protected BigDecimal udevalue;
    @XmlElement(name = "RATECODE")
    protected String ratecode;
    @XmlElement(name = "TDRATECODE")
    protected String tdratecode;
    @XmlElement(name = "RATEFLAG")
    @XmlSchemaType(name = "string")
    protected RateFlgType rateflag;

    /**
     * Gets the value of the udeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDEID() {
        return udeid;
    }

    /**
     * Sets the value of the udeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDEID(String value) {
        this.udeid = value;
    }

    /**
     * Gets the value of the udevalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUDEVALUE() {
        return udevalue;
    }

    /**
     * Sets the value of the udevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUDEVALUE(BigDecimal value) {
        this.udevalue = value;
    }

    /**
     * Gets the value of the ratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATECODE() {
        return ratecode;
    }

    /**
     * Sets the value of the ratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATECODE(String value) {
        this.ratecode = value;
    }

    /**
     * Gets the value of the tdratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDRATECODE() {
        return tdratecode;
    }

    /**
     * Sets the value of the tdratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDRATECODE(String value) {
        this.tdratecode = value;
    }

    /**
     * Gets the value of the rateflag property.
     * 
     * @return
     *     possible object is
     *     {@link RateFlgType }
     *     
     */
    public RateFlgType getRATEFLAG() {
        return rateflag;
    }

    /**
     * Sets the value of the rateflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFlgType }
     *     
     */
    public void setRATEFLAG(RateFlgType value) {
        this.rateflag = value;
    }

}
