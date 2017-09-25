
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmtAndDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmtAndDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACY_OPENING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_ACY_OPEN_BAL" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="ACY_TODAY_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_TODAY_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LCY_OPENING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_LCY_OPEN_BAL" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="LCY_TODAY_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LCY_TODAY_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_TANK_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_ACY_TANK_UNCOLLECTED" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="LCY_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LCY_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LCY_CURR_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_LCY_CURR_BAL" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="ACY_CURR_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_ACY_CURR_BAL" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="ACY_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_ACY_UNCOLLECTED" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="WITHDRAWABLE_UNCOLLED_FUND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_WITHDRAWABLE_UNCOLLED_FUND" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="ACY_BLOCKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RECEIVABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_AVL_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_ACY_AVL_BAL" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="DIS_UNUTILIZED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DIS_TOT_AVL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_TOT_AVL_AMOUNT" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="ACY_ACCRUED_DR_IC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_ACCRUED_CR_IC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DR_INT_DUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHG_DUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_UNAUTH_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_UNAUTH_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_UNAUTH_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_UNAUTH_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_UNAUTH_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACY_UNAUTH_TANK_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DC_ACY_UNAUTH_TANK_UNCOL" type="{http://fcubs.ofss.com/service/FCUBSAccService}DrCrType" minOccurs="0"/>
 *         &lt;element name="DATE_LAST_DR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="DATE_LAST_CR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="DATE_LAST_DR_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="DATE_LAST_CR_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="Turnovers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="ACY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="LCY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="LCY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmtAndDateType", propOrder = {
    "acyopeningbal",
    "dcacyopenbal",
    "acytodaytoverdr",
    "acytodaytovercr",
    "lcyopeningbal",
    "dclcyopenbal",
    "lcytodaytoverdr",
    "lcytodaytovercr",
    "acytankdr",
    "acytankcr",
    "acytankuncollected",
    "dcacytankuncollected",
    "lcytankdr",
    "lcytankcr",
    "lcycurrbalance",
    "dclcycurrbal",
    "acycurrbalance",
    "dcacycurrbal",
    "acyuncollected",
    "dcacyuncollected",
    "withdrawableuncolledfund",
    "dcwithdrawableuncolledfund",
    "acyblockedamount",
    "receivableamount",
    "acyavlbal",
    "dcacyavlbal",
    "disunutilizedamt",
    "distotavlamount",
    "dctotavlamount",
    "acyaccrueddric",
    "acyaccruedcric",
    "drintdue",
    "chgdue",
    "acyunauthdr",
    "acyunauthcr",
    "acyunauthuncollected",
    "acyunauthtankdr",
    "acyunauthtankcr",
    "acyunauthtankuncollected",
    "dcacyunauthtankuncol",
    "datelastdr",
    "datelastcr",
    "datelastdractivity",
    "datelastcractivity",
    "turnovers"
})
public class AmtAndDateType {

    @XmlElement(name = "ACY_OPENING_BAL")
    protected BigDecimal acyopeningbal;
    @XmlElement(name = "DC_ACY_OPEN_BAL")
    @XmlSchemaType(name = "string")
    protected DrCrType dcacyopenbal;
    @XmlElement(name = "ACY_TODAY_TOVER_DR")
    protected BigDecimal acytodaytoverdr;
    @XmlElement(name = "ACY_TODAY_TOVER_CR")
    protected BigDecimal acytodaytovercr;
    @XmlElement(name = "LCY_OPENING_BAL")
    protected BigDecimal lcyopeningbal;
    @XmlElement(name = "DC_LCY_OPEN_BAL")
    @XmlSchemaType(name = "string")
    protected DrCrType dclcyopenbal;
    @XmlElement(name = "LCY_TODAY_TOVER_DR")
    protected BigDecimal lcytodaytoverdr;
    @XmlElement(name = "LCY_TODAY_TOVER_CR")
    protected BigDecimal lcytodaytovercr;
    @XmlElement(name = "ACY_TANK_DR")
    protected BigDecimal acytankdr;
    @XmlElement(name = "ACY_TANK_CR")
    protected BigDecimal acytankcr;
    @XmlElement(name = "ACY_TANK_UNCOLLECTED")
    protected BigDecimal acytankuncollected;
    @XmlElement(name = "DC_ACY_TANK_UNCOLLECTED")
    @XmlSchemaType(name = "string")
    protected DrCrType dcacytankuncollected;
    @XmlElement(name = "LCY_TANK_DR")
    protected BigDecimal lcytankdr;
    @XmlElement(name = "LCY_TANK_CR")
    protected BigDecimal lcytankcr;
    @XmlElement(name = "LCY_CURR_BALANCE")
    protected BigDecimal lcycurrbalance;
    @XmlElement(name = "DC_LCY_CURR_BAL")
    @XmlSchemaType(name = "string")
    protected DrCrType dclcycurrbal;
    @XmlElement(name = "ACY_CURR_BALANCE")
    protected BigDecimal acycurrbalance;
    @XmlElement(name = "DC_ACY_CURR_BAL")
    @XmlSchemaType(name = "string")
    protected DrCrType dcacycurrbal;
    @XmlElement(name = "ACY_UNCOLLECTED")
    protected BigDecimal acyuncollected;
    @XmlElement(name = "DC_ACY_UNCOLLECTED")
    @XmlSchemaType(name = "string")
    protected DrCrType dcacyuncollected;
    @XmlElement(name = "WITHDRAWABLE_UNCOLLED_FUND")
    protected BigDecimal withdrawableuncolledfund;
    @XmlElement(name = "DC_WITHDRAWABLE_UNCOLLED_FUND")
    @XmlSchemaType(name = "string")
    protected DrCrType dcwithdrawableuncolledfund;
    @XmlElement(name = "ACY_BLOCKED_AMOUNT")
    protected BigDecimal acyblockedamount;
    @XmlElement(name = "RECEIVABLE_AMOUNT")
    protected BigDecimal receivableamount;
    @XmlElement(name = "ACY_AVL_BAL")
    protected BigDecimal acyavlbal;
    @XmlElement(name = "DC_ACY_AVL_BAL")
    @XmlSchemaType(name = "string")
    protected DrCrType dcacyavlbal;
    @XmlElement(name = "DIS_UNUTILIZED_AMT")
    protected BigDecimal disunutilizedamt;
    @XmlElement(name = "DIS_TOT_AVL_AMOUNT")
    protected BigDecimal distotavlamount;
    @XmlElement(name = "DC_TOT_AVL_AMOUNT")
    @XmlSchemaType(name = "string")
    protected DrCrType dctotavlamount;
    @XmlElement(name = "ACY_ACCRUED_DR_IC")
    protected BigDecimal acyaccrueddric;
    @XmlElement(name = "ACY_ACCRUED_CR_IC")
    protected BigDecimal acyaccruedcric;
    @XmlElement(name = "DR_INT_DUE")
    protected BigDecimal drintdue;
    @XmlElement(name = "CHG_DUE")
    protected BigDecimal chgdue;
    @XmlElement(name = "ACY_UNAUTH_DR")
    protected BigDecimal acyunauthdr;
    @XmlElement(name = "ACY_UNAUTH_CR")
    protected BigDecimal acyunauthcr;
    @XmlElement(name = "ACY_UNAUTH_UNCOLLECTED")
    protected BigDecimal acyunauthuncollected;
    @XmlElement(name = "ACY_UNAUTH_TANK_DR")
    protected BigDecimal acyunauthtankdr;
    @XmlElement(name = "ACY_UNAUTH_TANK_CR")
    protected BigDecimal acyunauthtankcr;
    @XmlElement(name = "ACY_UNAUTH_TANK_UNCOLLECTED")
    protected BigDecimal acyunauthtankuncollected;
    @XmlElement(name = "DC_ACY_UNAUTH_TANK_UNCOL")
    @XmlSchemaType(name = "string")
    protected DrCrType dcacyunauthtankuncol;
    @XmlElement(name = "DATE_LAST_DR")
    @XmlSchemaType(name = "anySimpleType")
    protected Object datelastdr;
    @XmlElement(name = "DATE_LAST_CR")
    @XmlSchemaType(name = "anySimpleType")
    protected Object datelastcr;
    @XmlElement(name = "DATE_LAST_DR_ACTIVITY")
    @XmlSchemaType(name = "anySimpleType")
    protected Object datelastdractivity;
    @XmlElement(name = "DATE_LAST_CR_ACTIVITY")
    @XmlSchemaType(name = "anySimpleType")
    protected Object datelastcractivity;
    @XmlElement(name = "Turnovers")
    protected AmtAndDateType.Turnovers turnovers;

    /**
     * Gets the value of the acyopeningbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYOPENINGBAL() {
        return acyopeningbal;
    }

    /**
     * Sets the value of the acyopeningbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYOPENINGBAL(BigDecimal value) {
        this.acyopeningbal = value;
    }

    /**
     * Gets the value of the dcacyopenbal property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCACYOPENBAL() {
        return dcacyopenbal;
    }

    /**
     * Sets the value of the dcacyopenbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCACYOPENBAL(DrCrType value) {
        this.dcacyopenbal = value;
    }

    /**
     * Gets the value of the acytodaytoverdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYTODAYTOVERDR() {
        return acytodaytoverdr;
    }

    /**
     * Sets the value of the acytodaytoverdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYTODAYTOVERDR(BigDecimal value) {
        this.acytodaytoverdr = value;
    }

    /**
     * Gets the value of the acytodaytovercr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYTODAYTOVERCR() {
        return acytodaytovercr;
    }

    /**
     * Sets the value of the acytodaytovercr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYTODAYTOVERCR(BigDecimal value) {
        this.acytodaytovercr = value;
    }

    /**
     * Gets the value of the lcyopeningbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYOPENINGBAL() {
        return lcyopeningbal;
    }

    /**
     * Sets the value of the lcyopeningbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYOPENINGBAL(BigDecimal value) {
        this.lcyopeningbal = value;
    }

    /**
     * Gets the value of the dclcyopenbal property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCLCYOPENBAL() {
        return dclcyopenbal;
    }

    /**
     * Sets the value of the dclcyopenbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCLCYOPENBAL(DrCrType value) {
        this.dclcyopenbal = value;
    }

    /**
     * Gets the value of the lcytodaytoverdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYTODAYTOVERDR() {
        return lcytodaytoverdr;
    }

    /**
     * Sets the value of the lcytodaytoverdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYTODAYTOVERDR(BigDecimal value) {
        this.lcytodaytoverdr = value;
    }

    /**
     * Gets the value of the lcytodaytovercr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYTODAYTOVERCR() {
        return lcytodaytovercr;
    }

    /**
     * Sets the value of the lcytodaytovercr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYTODAYTOVERCR(BigDecimal value) {
        this.lcytodaytovercr = value;
    }

    /**
     * Gets the value of the acytankdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYTANKDR() {
        return acytankdr;
    }

    /**
     * Sets the value of the acytankdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYTANKDR(BigDecimal value) {
        this.acytankdr = value;
    }

    /**
     * Gets the value of the acytankcr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYTANKCR() {
        return acytankcr;
    }

    /**
     * Sets the value of the acytankcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYTANKCR(BigDecimal value) {
        this.acytankcr = value;
    }

    /**
     * Gets the value of the acytankuncollected property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYTANKUNCOLLECTED() {
        return acytankuncollected;
    }

    /**
     * Sets the value of the acytankuncollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYTANKUNCOLLECTED(BigDecimal value) {
        this.acytankuncollected = value;
    }

    /**
     * Gets the value of the dcacytankuncollected property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCACYTANKUNCOLLECTED() {
        return dcacytankuncollected;
    }

    /**
     * Sets the value of the dcacytankuncollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCACYTANKUNCOLLECTED(DrCrType value) {
        this.dcacytankuncollected = value;
    }

    /**
     * Gets the value of the lcytankdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYTANKDR() {
        return lcytankdr;
    }

    /**
     * Sets the value of the lcytankdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYTANKDR(BigDecimal value) {
        this.lcytankdr = value;
    }

    /**
     * Gets the value of the lcytankcr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYTANKCR() {
        return lcytankcr;
    }

    /**
     * Sets the value of the lcytankcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYTANKCR(BigDecimal value) {
        this.lcytankcr = value;
    }

    /**
     * Gets the value of the lcycurrbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYCURRBALANCE() {
        return lcycurrbalance;
    }

    /**
     * Sets the value of the lcycurrbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYCURRBALANCE(BigDecimal value) {
        this.lcycurrbalance = value;
    }

    /**
     * Gets the value of the dclcycurrbal property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCLCYCURRBAL() {
        return dclcycurrbal;
    }

    /**
     * Sets the value of the dclcycurrbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCLCYCURRBAL(DrCrType value) {
        this.dclcycurrbal = value;
    }

    /**
     * Gets the value of the acycurrbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYCURRBALANCE() {
        return acycurrbalance;
    }

    /**
     * Sets the value of the acycurrbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYCURRBALANCE(BigDecimal value) {
        this.acycurrbalance = value;
    }

    /**
     * Gets the value of the dcacycurrbal property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCACYCURRBAL() {
        return dcacycurrbal;
    }

    /**
     * Sets the value of the dcacycurrbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCACYCURRBAL(DrCrType value) {
        this.dcacycurrbal = value;
    }

    /**
     * Gets the value of the acyuncollected property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYUNCOLLECTED() {
        return acyuncollected;
    }

    /**
     * Sets the value of the acyuncollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYUNCOLLECTED(BigDecimal value) {
        this.acyuncollected = value;
    }

    /**
     * Gets the value of the dcacyuncollected property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCACYUNCOLLECTED() {
        return dcacyuncollected;
    }

    /**
     * Sets the value of the dcacyuncollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCACYUNCOLLECTED(DrCrType value) {
        this.dcacyuncollected = value;
    }

    /**
     * Gets the value of the withdrawableuncolledfund property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWITHDRAWABLEUNCOLLEDFUND() {
        return withdrawableuncolledfund;
    }

    /**
     * Sets the value of the withdrawableuncolledfund property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWITHDRAWABLEUNCOLLEDFUND(BigDecimal value) {
        this.withdrawableuncolledfund = value;
    }

    /**
     * Gets the value of the dcwithdrawableuncolledfund property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCWITHDRAWABLEUNCOLLEDFUND() {
        return dcwithdrawableuncolledfund;
    }

    /**
     * Sets the value of the dcwithdrawableuncolledfund property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCWITHDRAWABLEUNCOLLEDFUND(DrCrType value) {
        this.dcwithdrawableuncolledfund = value;
    }

    /**
     * Gets the value of the acyblockedamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYBLOCKEDAMOUNT() {
        return acyblockedamount;
    }

    /**
     * Sets the value of the acyblockedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYBLOCKEDAMOUNT(BigDecimal value) {
        this.acyblockedamount = value;
    }

    /**
     * Gets the value of the receivableamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRECEIVABLEAMOUNT() {
        return receivableamount;
    }

    /**
     * Sets the value of the receivableamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRECEIVABLEAMOUNT(BigDecimal value) {
        this.receivableamount = value;
    }

    /**
     * Gets the value of the acyavlbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYAVLBAL() {
        return acyavlbal;
    }

    /**
     * Sets the value of the acyavlbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYAVLBAL(BigDecimal value) {
        this.acyavlbal = value;
    }

    /**
     * Gets the value of the dcacyavlbal property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCACYAVLBAL() {
        return dcacyavlbal;
    }

    /**
     * Sets the value of the dcacyavlbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCACYAVLBAL(DrCrType value) {
        this.dcacyavlbal = value;
    }

    /**
     * Gets the value of the disunutilizedamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISUNUTILIZEDAMT() {
        return disunutilizedamt;
    }

    /**
     * Sets the value of the disunutilizedamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISUNUTILIZEDAMT(BigDecimal value) {
        this.disunutilizedamt = value;
    }

    /**
     * Gets the value of the distotavlamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISTOTAVLAMOUNT() {
        return distotavlamount;
    }

    /**
     * Sets the value of the distotavlamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISTOTAVLAMOUNT(BigDecimal value) {
        this.distotavlamount = value;
    }

    /**
     * Gets the value of the dctotavlamount property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCTOTAVLAMOUNT() {
        return dctotavlamount;
    }

    /**
     * Sets the value of the dctotavlamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCTOTAVLAMOUNT(DrCrType value) {
        this.dctotavlamount = value;
    }

    /**
     * Gets the value of the acyaccrueddric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYACCRUEDDRIC() {
        return acyaccrueddric;
    }

    /**
     * Sets the value of the acyaccrueddric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYACCRUEDDRIC(BigDecimal value) {
        this.acyaccrueddric = value;
    }

    /**
     * Gets the value of the acyaccruedcric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYACCRUEDCRIC() {
        return acyaccruedcric;
    }

    /**
     * Sets the value of the acyaccruedcric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYACCRUEDCRIC(BigDecimal value) {
        this.acyaccruedcric = value;
    }

    /**
     * Gets the value of the drintdue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRINTDUE() {
        return drintdue;
    }

    /**
     * Sets the value of the drintdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRINTDUE(BigDecimal value) {
        this.drintdue = value;
    }

    /**
     * Gets the value of the chgdue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCHGDUE() {
        return chgdue;
    }

    /**
     * Sets the value of the chgdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCHGDUE(BigDecimal value) {
        this.chgdue = value;
    }

    /**
     * Gets the value of the acyunauthdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYUNAUTHDR() {
        return acyunauthdr;
    }

    /**
     * Sets the value of the acyunauthdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYUNAUTHDR(BigDecimal value) {
        this.acyunauthdr = value;
    }

    /**
     * Gets the value of the acyunauthcr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYUNAUTHCR() {
        return acyunauthcr;
    }

    /**
     * Sets the value of the acyunauthcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYUNAUTHCR(BigDecimal value) {
        this.acyunauthcr = value;
    }

    /**
     * Gets the value of the acyunauthuncollected property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYUNAUTHUNCOLLECTED() {
        return acyunauthuncollected;
    }

    /**
     * Sets the value of the acyunauthuncollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYUNAUTHUNCOLLECTED(BigDecimal value) {
        this.acyunauthuncollected = value;
    }

    /**
     * Gets the value of the acyunauthtankdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYUNAUTHTANKDR() {
        return acyunauthtankdr;
    }

    /**
     * Sets the value of the acyunauthtankdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYUNAUTHTANKDR(BigDecimal value) {
        this.acyunauthtankdr = value;
    }

    /**
     * Gets the value of the acyunauthtankcr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYUNAUTHTANKCR() {
        return acyunauthtankcr;
    }

    /**
     * Sets the value of the acyunauthtankcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYUNAUTHTANKCR(BigDecimal value) {
        this.acyunauthtankcr = value;
    }

    /**
     * Gets the value of the acyunauthtankuncollected property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYUNAUTHTANKUNCOLLECTED() {
        return acyunauthtankuncollected;
    }

    /**
     * Sets the value of the acyunauthtankuncollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYUNAUTHTANKUNCOLLECTED(BigDecimal value) {
        this.acyunauthtankuncollected = value;
    }

    /**
     * Gets the value of the dcacyunauthtankuncol property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDCACYUNAUTHTANKUNCOL() {
        return dcacyunauthtankuncol;
    }

    /**
     * Sets the value of the dcacyunauthtankuncol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDCACYUNAUTHTANKUNCOL(DrCrType value) {
        this.dcacyunauthtankuncol = value;
    }

    /**
     * Gets the value of the datelastdr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDATELASTDR() {
        return datelastdr;
    }

    /**
     * Sets the value of the datelastdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDATELASTDR(Object value) {
        this.datelastdr = value;
    }

    /**
     * Gets the value of the datelastcr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDATELASTCR() {
        return datelastcr;
    }

    /**
     * Sets the value of the datelastcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDATELASTCR(Object value) {
        this.datelastcr = value;
    }

    /**
     * Gets the value of the datelastdractivity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDATELASTDRACTIVITY() {
        return datelastdractivity;
    }

    /**
     * Sets the value of the datelastdractivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDATELASTDRACTIVITY(Object value) {
        this.datelastdractivity = value;
    }

    /**
     * Gets the value of the datelastcractivity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDATELASTCRACTIVITY() {
        return datelastcractivity;
    }

    /**
     * Sets the value of the datelastcractivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDATELASTCRACTIVITY(Object value) {
        this.datelastcractivity = value;
    }

    /**
     * Gets the value of the turnovers property.
     * 
     * @return
     *     possible object is
     *     {@link AmtAndDateType.Turnovers }
     *     
     */
    public AmtAndDateType.Turnovers getTurnovers() {
        return turnovers;
    }

    /**
     * Sets the value of the turnovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtAndDateType.Turnovers }
     *     
     */
    public void setTurnovers(AmtAndDateType.Turnovers value) {
        this.turnovers = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ACY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="ACY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="LCY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="LCY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acymtdtoverdr",
        "acymtdtovercr",
        "lcymtdtoverdr",
        "lcymtdtovercr"
    })
    public static class Turnovers {

        @XmlElement(name = "ACY_MTD_TOVER_DR")
        protected Object acymtdtoverdr;
        @XmlElement(name = "ACY_MTD_TOVER_CR")
        protected Object acymtdtovercr;
        @XmlElement(name = "LCY_MTD_TOVER_DR")
        protected Object lcymtdtoverdr;
        @XmlElement(name = "LCY_MTD_TOVER_CR")
        protected Object lcymtdtovercr;

        /**
         * Gets the value of the acymtdtoverdr property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getACYMTDTOVERDR() {
            return acymtdtoverdr;
        }

        /**
         * Sets the value of the acymtdtoverdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setACYMTDTOVERDR(Object value) {
            this.acymtdtoverdr = value;
        }

        /**
         * Gets the value of the acymtdtovercr property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getACYMTDTOVERCR() {
            return acymtdtovercr;
        }

        /**
         * Sets the value of the acymtdtovercr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setACYMTDTOVERCR(Object value) {
            this.acymtdtovercr = value;
        }

        /**
         * Gets the value of the lcymtdtoverdr property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLCYMTDTOVERDR() {
            return lcymtdtoverdr;
        }

        /**
         * Sets the value of the lcymtdtoverdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLCYMTDTOVERDR(Object value) {
            this.lcymtdtoverdr = value;
        }

        /**
         * Gets the value of the lcymtdtovercr property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLCYMTDTOVERCR() {
            return lcymtdtovercr;
        }

        /**
         * Sets the value of the lcymtdtovercr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLCYMTDTOVERCR(Object value) {
            this.lcymtdtovercr = value;
        }

    }

}
