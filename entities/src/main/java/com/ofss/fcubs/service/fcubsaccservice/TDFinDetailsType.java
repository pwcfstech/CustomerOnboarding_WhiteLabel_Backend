
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDFinDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDFinDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CURRBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AVLBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OSLIMITAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UNCOLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BLKAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TODLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SUBLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UNCOLFUNDLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DRACCRINT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRINTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RATE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDFinDetailsType", propOrder = {
    "currbal",
    "avlbal",
    "oslimitamt",
    "uncolamt",
    "blkamt",
    "todlimit",
    "sublimit",
    "uncolfundlimit",
    "draccrint",
    "crintamt",
    "tenor",
    "rate",
    "tdamt"
})
public class TDFinDetailsType {

    @XmlElement(name = "CURRBAL")
    protected BigDecimal currbal;
    @XmlElement(name = "AVLBAL")
    protected BigDecimal avlbal;
    @XmlElement(name = "OSLIMITAMT")
    protected BigDecimal oslimitamt;
    @XmlElement(name = "UNCOLAMT")
    protected BigDecimal uncolamt;
    @XmlElement(name = "BLKAMT")
    protected BigDecimal blkamt;
    @XmlElement(name = "TODLIMIT")
    protected BigDecimal todlimit;
    @XmlElement(name = "SUBLIMIT")
    protected BigDecimal sublimit;
    @XmlElement(name = "UNCOLFUNDLIMIT")
    protected BigDecimal uncolfundlimit;
    @XmlElement(name = "DRACCRINT")
    protected BigDecimal draccrint;
    @XmlElement(name = "CRINTAMT")
    protected BigDecimal crintamt;
    @XmlElement(name = "TENOR", required = true)
    protected BigDecimal tenor;
    @XmlElement(name = "RATE", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "TDAMT", required = true)
    protected BigDecimal tdamt;

    /**
     * Gets the value of the currbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCURRBAL() {
        return currbal;
    }

    /**
     * Sets the value of the currbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCURRBAL(BigDecimal value) {
        this.currbal = value;
    }

    /**
     * Gets the value of the avlbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAVLBAL() {
        return avlbal;
    }

    /**
     * Sets the value of the avlbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAVLBAL(BigDecimal value) {
        this.avlbal = value;
    }

    /**
     * Gets the value of the oslimitamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOSLIMITAMT() {
        return oslimitamt;
    }

    /**
     * Sets the value of the oslimitamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOSLIMITAMT(BigDecimal value) {
        this.oslimitamt = value;
    }

    /**
     * Gets the value of the uncolamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUNCOLAMT() {
        return uncolamt;
    }

    /**
     * Sets the value of the uncolamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUNCOLAMT(BigDecimal value) {
        this.uncolamt = value;
    }

    /**
     * Gets the value of the blkamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBLKAMT() {
        return blkamt;
    }

    /**
     * Sets the value of the blkamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBLKAMT(BigDecimal value) {
        this.blkamt = value;
    }

    /**
     * Gets the value of the todlimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTODLIMIT() {
        return todlimit;
    }

    /**
     * Sets the value of the todlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTODLIMIT(BigDecimal value) {
        this.todlimit = value;
    }

    /**
     * Gets the value of the sublimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUBLIMIT() {
        return sublimit;
    }

    /**
     * Sets the value of the sublimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUBLIMIT(BigDecimal value) {
        this.sublimit = value;
    }

    /**
     * Gets the value of the uncolfundlimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUNCOLFUNDLIMIT() {
        return uncolfundlimit;
    }

    /**
     * Sets the value of the uncolfundlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUNCOLFUNDLIMIT(BigDecimal value) {
        this.uncolfundlimit = value;
    }

    /**
     * Gets the value of the draccrint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRACCRINT() {
        return draccrint;
    }

    /**
     * Sets the value of the draccrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRACCRINT(BigDecimal value) {
        this.draccrint = value;
    }

    /**
     * Gets the value of the crintamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRINTAMT() {
        return crintamt;
    }

    /**
     * Sets the value of the crintamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRINTAMT(BigDecimal value) {
        this.crintamt = value;
    }

    /**
     * Gets the value of the tenor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTENOR() {
        return tenor;
    }

    /**
     * Sets the value of the tenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTENOR(BigDecimal value) {
        this.tenor = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRATE() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRATE(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the tdamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTDAMT() {
        return tdamt;
    }

    /**
     * Sets the value of the tdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTDAMT(BigDecimal value) {
        this.tdamt = value;
    }

}
