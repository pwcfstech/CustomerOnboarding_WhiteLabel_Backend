
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcStatusLinesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcStatusLinesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACSTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CRGL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRGL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STATDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcStatusLinesType", propOrder = {
    "acstatus",
    "crcbline",
    "drcbline",
    "crgl",
    "drgl",
    "crholine",
    "drholine",
    "statdesc"
})
public class AcStatusLinesType {

    @XmlElement(name = "ACSTATUS", required = true)
    protected String acstatus;
    @XmlElement(name = "CRCBLINE", required = true)
    protected String crcbline;
    @XmlElement(name = "DRCBLINE", required = true)
    protected String drcbline;
    @XmlElement(name = "CRGL", required = true)
    protected String crgl;
    @XmlElement(name = "DRGL", required = true)
    protected String drgl;
    @XmlElement(name = "CRHOLINE", required = true)
    protected String crholine;
    @XmlElement(name = "DRHOLINE", required = true)
    protected String drholine;
    @XmlElement(name = "STATDESC")
    protected String statdesc;

    /**
     * Gets the value of the acstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTATUS() {
        return acstatus;
    }

    /**
     * Sets the value of the acstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTATUS(String value) {
        this.acstatus = value;
    }

    /**
     * Gets the value of the crcbline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRCBLINE() {
        return crcbline;
    }

    /**
     * Sets the value of the crcbline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRCBLINE(String value) {
        this.crcbline = value;
    }

    /**
     * Gets the value of the drcbline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRCBLINE() {
        return drcbline;
    }

    /**
     * Sets the value of the drcbline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRCBLINE(String value) {
        this.drcbline = value;
    }

    /**
     * Gets the value of the crgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRGL() {
        return crgl;
    }

    /**
     * Sets the value of the crgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRGL(String value) {
        this.crgl = value;
    }

    /**
     * Gets the value of the drgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRGL() {
        return drgl;
    }

    /**
     * Sets the value of the drgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRGL(String value) {
        this.drgl = value;
    }

    /**
     * Gets the value of the crholine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRHOLINE() {
        return crholine;
    }

    /**
     * Sets the value of the crholine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRHOLINE(String value) {
        this.crholine = value;
    }

    /**
     * Gets the value of the drholine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRHOLINE() {
        return drholine;
    }

    /**
     * Sets the value of the drholine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRHOLINE(String value) {
        this.drholine = value;
    }

    /**
     * Gets the value of the statdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATDESC() {
        return statdesc;
    }

    /**
     * Sets the value of the statdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATDESC(String value) {
        this.statdesc = value;
    }

}
