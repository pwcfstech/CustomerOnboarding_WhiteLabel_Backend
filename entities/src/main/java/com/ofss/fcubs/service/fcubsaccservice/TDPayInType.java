
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TDPayInType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDPayInType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MMPAYOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MMTDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MMOFFSETBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MMTDOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MMTDOFFSETCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MMPERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHQINSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRODUCT_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHQ_ADTE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DRAWEE_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROUTING_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MMXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDPayInType", propOrder = {
    "brn",
    "acc",
    "ccy",
    "mmpayopt",
    "mmtdamt",
    "mmoffsetbrn",
    "mmtdoffsetacc",
    "mmtdoffsetccy",
    "mmpercentage",
    "chqinstno",
    "productf",
    "chqadte",
    "draweeaccount",
    "routingno",
    "mmxrate",
    "seqno"
})
public class TDPayInType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "MMPAYOPT")
    protected String mmpayopt;
    @XmlElement(name = "MMTDAMT")
    protected BigDecimal mmtdamt;
    @XmlElement(name = "MMOFFSETBRN")
    protected String mmoffsetbrn;
    @XmlElement(name = "MMTDOFFSETACC")
    protected String mmtdoffsetacc;
    @XmlElement(name = "MMTDOFFSETCCY")
    protected String mmtdoffsetccy;
    @XmlElement(name = "MMPERCENTAGE")
    protected BigDecimal mmpercentage;
    @XmlElement(name = "CHQINSTNO")
    protected String chqinstno;
    @XmlElement(name = "PRODUCT_F")
    protected String productf;
    @XmlElement(name = "CHQ_ADTE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chqadte;
    @XmlElement(name = "DRAWEE_ACCOUNT")
    protected String draweeaccount;
    @XmlElement(name = "ROUTING_NO")
    protected String routingno;
    @XmlElement(name = "MMXRATE")
    protected BigDecimal mmxrate;
    @XmlElement(name = "SEQNO")
    protected BigInteger seqno;

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
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
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
     * Gets the value of the mmpayopt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMPAYOPT() {
        return mmpayopt;
    }

    /**
     * Sets the value of the mmpayopt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMPAYOPT(String value) {
        this.mmpayopt = value;
    }

    /**
     * Gets the value of the mmtdamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMTDAMT() {
        return mmtdamt;
    }

    /**
     * Sets the value of the mmtdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMTDAMT(BigDecimal value) {
        this.mmtdamt = value;
    }

    /**
     * Gets the value of the mmoffsetbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMOFFSETBRN() {
        return mmoffsetbrn;
    }

    /**
     * Sets the value of the mmoffsetbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMOFFSETBRN(String value) {
        this.mmoffsetbrn = value;
    }

    /**
     * Gets the value of the mmtdoffsetacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMTDOFFSETACC() {
        return mmtdoffsetacc;
    }

    /**
     * Sets the value of the mmtdoffsetacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMTDOFFSETACC(String value) {
        this.mmtdoffsetacc = value;
    }

    /**
     * Gets the value of the mmtdoffsetccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMTDOFFSETCCY() {
        return mmtdoffsetccy;
    }

    /**
     * Sets the value of the mmtdoffsetccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMTDOFFSETCCY(String value) {
        this.mmtdoffsetccy = value;
    }

    /**
     * Gets the value of the mmpercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMPERCENTAGE() {
        return mmpercentage;
    }

    /**
     * Sets the value of the mmpercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMPERCENTAGE(BigDecimal value) {
        this.mmpercentage = value;
    }

    /**
     * Gets the value of the chqinstno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHQINSTNO() {
        return chqinstno;
    }

    /**
     * Sets the value of the chqinstno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHQINSTNO(String value) {
        this.chqinstno = value;
    }

    /**
     * Gets the value of the productf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTF() {
        return productf;
    }

    /**
     * Sets the value of the productf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTF(String value) {
        this.productf = value;
    }

    /**
     * Gets the value of the chqadte property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCHQADTE() {
        return chqadte;
    }

    /**
     * Sets the value of the chqadte property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCHQADTE(XMLGregorianCalendar value) {
        this.chqadte = value;
    }

    /**
     * Gets the value of the draweeaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRAWEEACCOUNT() {
        return draweeaccount;
    }

    /**
     * Sets the value of the draweeaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRAWEEACCOUNT(String value) {
        this.draweeaccount = value;
    }

    /**
     * Gets the value of the routingno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTINGNO() {
        return routingno;
    }

    /**
     * Sets the value of the routingno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTINGNO(String value) {
        this.routingno = value;
    }

    /**
     * Gets the value of the mmxrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMXRATE() {
        return mmxrate;
    }

    /**
     * Sets the value of the mmxrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMXRATE(BigDecimal value) {
        this.mmxrate = value;
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

}
