
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DCDInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCDInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TD_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TD_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TD_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINK_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY_OPTION_PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LINKED_CCY_SETT_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LINKED_CCY_GL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIXING_DAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="YLD_ENHANCEMENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INCEPTION_FAIR_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OPTION_CONTRACT_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TD_MAT_DATE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCDInputType", propOrder = {
    "tdbrn",
    "tdacc",
    "tdccy",
    "linkccy",
    "ccyoptionprod",
    "exchrate",
    "linkedccysettacc",
    "linkedccygl",
    "fixingdays",
    "yldenhancement",
    "inceptionfairvalue",
    "optioncontractrefno",
    "tdmatdate"
})
public class DCDInputType {

    @XmlElement(name = "TD_BRN")
    protected String tdbrn;
    @XmlElement(name = "TD_ACC")
    protected String tdacc;
    @XmlElement(name = "TD_CCY")
    protected String tdccy;
    @XmlElement(name = "LINK_CCY")
    protected String linkccy;
    @XmlElement(name = "CCY_OPTION_PROD")
    protected String ccyoptionprod;
    @XmlElement(name = "EXCH_RATE")
    protected BigDecimal exchrate;
    @XmlElement(name = "LINKED_CCY_SETT_ACC")
    protected String linkedccysettacc;
    @XmlElement(name = "LINKED_CCY_GL")
    protected String linkedccygl;
    @XmlElement(name = "FIXING_DAYS")
    protected BigDecimal fixingdays;
    @XmlElement(name = "YLD_ENHANCEMENT")
    protected BigDecimal yldenhancement;
    @XmlElement(name = "INCEPTION_FAIR_VALUE")
    protected BigDecimal inceptionfairvalue;
    @XmlElement(name = "OPTION_CONTRACT_REF_NO")
    protected String optioncontractrefno;
    @XmlElement(name = "TD_MAT_DATE")
    @XmlSchemaType(name = "anySimpleType")
    protected Object tdmatdate;

    /**
     * Gets the value of the tdbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDBRN() {
        return tdbrn;
    }

    /**
     * Sets the value of the tdbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDBRN(String value) {
        this.tdbrn = value;
    }

    /**
     * Gets the value of the tdacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDACC() {
        return tdacc;
    }

    /**
     * Sets the value of the tdacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDACC(String value) {
        this.tdacc = value;
    }

    /**
     * Gets the value of the tdccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDCCY() {
        return tdccy;
    }

    /**
     * Sets the value of the tdccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDCCY(String value) {
        this.tdccy = value;
    }

    /**
     * Gets the value of the linkccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKCCY() {
        return linkccy;
    }

    /**
     * Sets the value of the linkccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKCCY(String value) {
        this.linkccy = value;
    }

    /**
     * Gets the value of the ccyoptionprod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCYOPTIONPROD() {
        return ccyoptionprod;
    }

    /**
     * Sets the value of the ccyoptionprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCYOPTIONPROD(String value) {
        this.ccyoptionprod = value;
    }

    /**
     * Gets the value of the exchrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXCHRATE() {
        return exchrate;
    }

    /**
     * Sets the value of the exchrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXCHRATE(BigDecimal value) {
        this.exchrate = value;
    }

    /**
     * Gets the value of the linkedccysettacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKEDCCYSETTACC() {
        return linkedccysettacc;
    }

    /**
     * Sets the value of the linkedccysettacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKEDCCYSETTACC(String value) {
        this.linkedccysettacc = value;
    }

    /**
     * Gets the value of the linkedccygl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKEDCCYGL() {
        return linkedccygl;
    }

    /**
     * Sets the value of the linkedccygl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKEDCCYGL(String value) {
        this.linkedccygl = value;
    }

    /**
     * Gets the value of the fixingdays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFIXINGDAYS() {
        return fixingdays;
    }

    /**
     * Sets the value of the fixingdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFIXINGDAYS(BigDecimal value) {
        this.fixingdays = value;
    }

    /**
     * Gets the value of the yldenhancement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYLDENHANCEMENT() {
        return yldenhancement;
    }

    /**
     * Sets the value of the yldenhancement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYLDENHANCEMENT(BigDecimal value) {
        this.yldenhancement = value;
    }

    /**
     * Gets the value of the inceptionfairvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINCEPTIONFAIRVALUE() {
        return inceptionfairvalue;
    }

    /**
     * Sets the value of the inceptionfairvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINCEPTIONFAIRVALUE(BigDecimal value) {
        this.inceptionfairvalue = value;
    }

    /**
     * Gets the value of the optioncontractrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTIONCONTRACTREFNO() {
        return optioncontractrefno;
    }

    /**
     * Sets the value of the optioncontractrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTIONCONTRACTREFNO(String value) {
        this.optioncontractrefno = value;
    }

    /**
     * Gets the value of the tdmatdate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTDMATDATE() {
        return tdmatdate;
    }

    /**
     * Sets the value of the tdmatdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTDMATDATE(Object value) {
        this.tdmatdate = value;
    }

}
