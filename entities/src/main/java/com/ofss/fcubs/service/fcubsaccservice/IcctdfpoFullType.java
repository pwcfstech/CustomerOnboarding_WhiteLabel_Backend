
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Icctdfpo-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Icctdfpo-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tddetailsfpo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DFTFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Childintdetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHGSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INTSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Childintprodmap" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ILPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DISPTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Childinteffdtmap" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Childinttddetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AUTOROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PMNTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="CLONMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MOVINTUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MOVPRIUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="NEXTMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="MOVETOUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FUNDONOVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="REFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="REFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AUTOPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DEPTENOR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Childtdpayoutdetails" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Bcpayoutspo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Pcpayoutspo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PCOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bcpayout" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PAYBRN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pcpayout" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCOFFSET_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Icctdfpo-Full-Type", propOrder = {
    "brn",
    "acc",
    "ccy",
    "tddetailsfpo",
    "bcpayout",
    "pcpayout"
})
public class IcctdfpoFullType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "Tddetailsfpo")
    protected IcctdfpoFullType.Tddetailsfpo tddetailsfpo;
    @XmlElement(name = "Bcpayout")
    protected IcctdfpoFullType.Bcpayout bcpayout;
    @XmlElement(name = "Pcpayout")
    protected IcctdfpoFullType.Pcpayout pcpayout;

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
     * Gets the value of the tddetailsfpo property.
     * 
     * @return
     *     possible object is
     *     {@link IcctdfpoFullType.Tddetailsfpo }
     *     
     */
    public IcctdfpoFullType.Tddetailsfpo getTddetailsfpo() {
        return tddetailsfpo;
    }

    /**
     * Sets the value of the tddetailsfpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcctdfpoFullType.Tddetailsfpo }
     *     
     */
    public void setTddetailsfpo(IcctdfpoFullType.Tddetailsfpo value) {
        this.tddetailsfpo = value;
    }

    /**
     * Gets the value of the bcpayout property.
     * 
     * @return
     *     possible object is
     *     {@link IcctdfpoFullType.Bcpayout }
     *     
     */
    public IcctdfpoFullType.Bcpayout getBcpayout() {
        return bcpayout;
    }

    /**
     * Sets the value of the bcpayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcctdfpoFullType.Bcpayout }
     *     
     */
    public void setBcpayout(IcctdfpoFullType.Bcpayout value) {
        this.bcpayout = value;
    }

    /**
     * Gets the value of the pcpayout property.
     * 
     * @return
     *     possible object is
     *     {@link IcctdfpoFullType.Pcpayout }
     *     
     */
    public IcctdfpoFullType.Pcpayout getPcpayout() {
        return pcpayout;
    }

    /**
     * Sets the value of the pcpayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcctdfpoFullType.Pcpayout }
     *     
     */
    public void setPcpayout(IcctdfpoFullType.Pcpayout value) {
        this.pcpayout = value;
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
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PAYBRN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ccy",
        "bankcode",
        "paybrnf",
        "benfname",
        "benfadd1",
        "otherdets",
        "narrative"
    })
    public static class Bcpayout {

        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "BANKCODE")
        protected String bankcode;
        @XmlElement(name = "PAYBRN_F")
        protected String paybrnf;
        @XmlElement(name = "BENFNAME")
        protected String benfname;
        @XmlElement(name = "BENFADD1")
        protected String benfadd1;
        @XmlElement(name = "OTHERDETS")
        protected String otherdets;
        @XmlElement(name = "NARRATIVE")
        protected String narrative;

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
         * Gets the value of the bankcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBANKCODE() {
            return bankcode;
        }

        /**
         * Sets the value of the bankcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBANKCODE(String value) {
            this.bankcode = value;
        }

        /**
         * Gets the value of the paybrnf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYBRNF() {
            return paybrnf;
        }

        /**
         * Sets the value of the paybrnf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYBRNF(String value) {
            this.paybrnf = value;
        }

        /**
         * Gets the value of the benfname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFNAME() {
            return benfname;
        }

        /**
         * Sets the value of the benfname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFNAME(String value) {
            this.benfname = value;
        }

        /**
         * Gets the value of the benfadd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFADD1() {
            return benfadd1;
        }

        /**
         * Sets the value of the benfadd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFADD1(String value) {
            this.benfadd1 = value;
        }

        /**
         * Gets the value of the otherdets property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERDETS() {
            return otherdets;
        }

        /**
         * Sets the value of the otherdets property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERDETS(String value) {
            this.otherdets = value;
        }

        /**
         * Gets the value of the narrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE() {
            return narrative;
        }

        /**
         * Sets the value of the narrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE(String value) {
            this.narrative = value;
        }

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
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCOFFSET_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ccy",
        "benfname",
        "benfadd1",
        "otherdets",
        "narrative",
        "pcbankcode",
        "pcoffsetacc"
    })
    public static class Pcpayout {

        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "BENFNAME")
        protected String benfname;
        @XmlElement(name = "BENFADD1")
        protected String benfadd1;
        @XmlElement(name = "OTHERDETS")
        protected String otherdets;
        @XmlElement(name = "NARRATIVE")
        protected String narrative;
        @XmlElement(name = "PCBANKCODE")
        protected String pcbankcode;
        @XmlElement(name = "PCOFFSET_ACC")
        protected String pcoffsetacc;

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
         * Gets the value of the benfname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFNAME() {
            return benfname;
        }

        /**
         * Sets the value of the benfname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFNAME(String value) {
            this.benfname = value;
        }

        /**
         * Gets the value of the benfadd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENFADD1() {
            return benfadd1;
        }

        /**
         * Sets the value of the benfadd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENFADD1(String value) {
            this.benfadd1 = value;
        }

        /**
         * Gets the value of the otherdets property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERDETS() {
            return otherdets;
        }

        /**
         * Sets the value of the otherdets property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERDETS(String value) {
            this.otherdets = value;
        }

        /**
         * Gets the value of the narrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE() {
            return narrative;
        }

        /**
         * Sets the value of the narrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE(String value) {
            this.narrative = value;
        }

        /**
         * Gets the value of the pcbankcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCBANKCODE() {
            return pcbankcode;
        }

        /**
         * Sets the value of the pcbankcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCBANKCODE(String value) {
            this.pcbankcode = value;
        }

        /**
         * Gets the value of the pcoffsetacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCOFFSETACC() {
            return pcoffsetacc;
        }

        /**
         * Sets the value of the pcoffsetacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCOFFSETACC(String value) {
            this.pcoffsetacc = value;
        }

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
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DFTFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Childintdetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHGSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INTSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Childintprodmap" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ILPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DISPTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Childinteffdtmap" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Childinttddetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AUTOROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PMNTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="CLONMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MOVINTUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MOVPRIUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="NEXTMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="MOVETOUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FUNDONOVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="REFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="REFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AUTOPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DEPTENOR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Childtdpayoutdetails" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Bcpayoutspo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Pcpayoutspo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PCOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "brn",
        "ccy",
        "dftfrom",
        "custno",
        "accls",
        "childintdetails",
        "childinttddetails"
    })
    public static class Tddetailsfpo {

        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "DFTFROM")
        protected String dftfrom;
        @XmlElement(name = "CUSTNO")
        protected String custno;
        @XmlElement(name = "ACCLS")
        protected String accls;
        @XmlElement(name = "Childintdetails")
        protected IcctdfpoFullType.Tddetailsfpo.Childintdetails childintdetails;
        @XmlElement(name = "Childinttddetails")
        protected IcctdfpoFullType.Tddetailsfpo.Childinttddetails childinttddetails;

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
         * Gets the value of the dftfrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDFTFROM() {
            return dftfrom;
        }

        /**
         * Sets the value of the dftfrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDFTFROM(String value) {
            this.dftfrom = value;
        }

        /**
         * Gets the value of the custno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTNO() {
            return custno;
        }

        /**
         * Sets the value of the custno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTNO(String value) {
            this.custno = value;
        }

        /**
         * Gets the value of the accls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCLS() {
            return accls;
        }

        /**
         * Sets the value of the accls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCLS(String value) {
            this.accls = value;
        }

        /**
         * Gets the value of the childintdetails property.
         * 
         * @return
         *     possible object is
         *     {@link IcctdfpoFullType.Tddetailsfpo.Childintdetails }
         *     
         */
        public IcctdfpoFullType.Tddetailsfpo.Childintdetails getChildintdetails() {
            return childintdetails;
        }

        /**
         * Sets the value of the childintdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link IcctdfpoFullType.Tddetailsfpo.Childintdetails }
         *     
         */
        public void setChildintdetails(IcctdfpoFullType.Tddetailsfpo.Childintdetails value) {
            this.childintdetails = value;
        }

        /**
         * Gets the value of the childinttddetails property.
         * 
         * @return
         *     possible object is
         *     {@link IcctdfpoFullType.Tddetailsfpo.Childinttddetails }
         *     
         */
        public IcctdfpoFullType.Tddetailsfpo.Childinttddetails getChildinttddetails() {
            return childinttddetails;
        }

        /**
         * Sets the value of the childinttddetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link IcctdfpoFullType.Tddetailsfpo.Childinttddetails }
         *     
         */
        public void setChildinttddetails(IcctdfpoFullType.Tddetailsfpo.Childinttddetails value) {
            this.childinttddetails = value;
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
         *         &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHGSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INTSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Childintprodmap" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ILPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DISPTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Childinteffdtmap" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
        @XmlType(name = "", propOrder = {
            "chgbookaccbrn",
            "chgbookacc",
            "chgstartdt",
            "calcacc",
            "bookacc",
            "hasis",
            "intstartdt",
            "bookaccbrn",
            "drcradv",
            "brn",
            "childintprodmap"
        })
        public static class Childintdetails {

            @XmlElement(name = "CHGBOOKACCBRN")
            protected String chgbookaccbrn;
            @XmlElement(name = "CHGBOOKACC")
            protected String chgbookacc;
            @XmlElement(name = "CHGSTARTDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar chgstartdt;
            @XmlElement(name = "CALCACC")
            protected String calcacc;
            @XmlElement(name = "BOOKACC")
            protected String bookacc;
            @XmlElement(name = "HASIS")
            protected String hasis;
            @XmlElement(name = "INTSTARTDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar intstartdt;
            @XmlElement(name = "BOOKACCBRN")
            protected String bookaccbrn;
            @XmlElement(name = "DRCRADV")
            protected String drcradv;
            @XmlElement(name = "BRN")
            protected String brn;
            @XmlElement(name = "Childintprodmap")
            protected List<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap> childintprodmap;

            /**
             * Gets the value of the chgbookaccbrn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHGBOOKACCBRN() {
                return chgbookaccbrn;
            }

            /**
             * Sets the value of the chgbookaccbrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHGBOOKACCBRN(String value) {
                this.chgbookaccbrn = value;
            }

            /**
             * Gets the value of the chgbookacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHGBOOKACC() {
                return chgbookacc;
            }

            /**
             * Sets the value of the chgbookacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHGBOOKACC(String value) {
                this.chgbookacc = value;
            }

            /**
             * Gets the value of the chgstartdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCHGSTARTDT() {
                return chgstartdt;
            }

            /**
             * Sets the value of the chgstartdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCHGSTARTDT(XMLGregorianCalendar value) {
                this.chgstartdt = value;
            }

            /**
             * Gets the value of the calcacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCALCACC() {
                return calcacc;
            }

            /**
             * Sets the value of the calcacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCALCACC(String value) {
                this.calcacc = value;
            }

            /**
             * Gets the value of the bookacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOOKACC() {
                return bookacc;
            }

            /**
             * Sets the value of the bookacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOOKACC(String value) {
                this.bookacc = value;
            }

            /**
             * Gets the value of the hasis property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHASIS() {
                return hasis;
            }

            /**
             * Sets the value of the hasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHASIS(String value) {
                this.hasis = value;
            }

            /**
             * Gets the value of the intstartdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getINTSTARTDT() {
                return intstartdt;
            }

            /**
             * Sets the value of the intstartdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setINTSTARTDT(XMLGregorianCalendar value) {
                this.intstartdt = value;
            }

            /**
             * Gets the value of the bookaccbrn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOOKACCBRN() {
                return bookaccbrn;
            }

            /**
             * Sets the value of the bookaccbrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOOKACCBRN(String value) {
                this.bookaccbrn = value;
            }

            /**
             * Gets the value of the drcradv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRCRADV() {
                return drcradv;
            }

            /**
             * Sets the value of the drcradv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRCRADV(String value) {
                this.drcradv = value;
            }

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
             * Gets the value of the childintprodmap property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the childintprodmap property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChildintprodmap().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap }
             * 
             * 
             */
            public List<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap> getChildintprodmap() {
                if (childintprodmap == null) {
                    childintprodmap = new ArrayList<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap>();
                }
                return this.childintprodmap;
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
             *         &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ILPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DISPTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Childinteffdtmap" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
            @XmlType(name = "", propOrder = {
                "intprod",
                "waiveprod",
                "genudechngadv",
                "prodmapstat",
                "udeccy",
                "ilprd",
                "disptyp",
                "childinteffdtmap"
            })
            public static class Childintprodmap {

                @XmlElement(name = "INTPROD")
                protected String intprod;
                @XmlElement(name = "WAIVEPROD")
                protected String waiveprod;
                @XmlElement(name = "GENUDECHNGADV")
                protected String genudechngadv;
                @XmlElement(name = "PRODMAPSTAT")
                protected String prodmapstat;
                @XmlElement(name = "UDECCY")
                protected String udeccy;
                @XmlElement(name = "ILPRD")
                protected String ilprd;
                @XmlElement(name = "DISPTYP")
                protected String disptyp;
                @XmlElement(name = "Childinteffdtmap")
                protected List<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap> childinteffdtmap;

                /**
                 * Gets the value of the intprod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINTPROD() {
                    return intprod;
                }

                /**
                 * Sets the value of the intprod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINTPROD(String value) {
                    this.intprod = value;
                }

                /**
                 * Gets the value of the waiveprod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWAIVEPROD() {
                    return waiveprod;
                }

                /**
                 * Sets the value of the waiveprod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWAIVEPROD(String value) {
                    this.waiveprod = value;
                }

                /**
                 * Gets the value of the genudechngadv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGENUDECHNGADV() {
                    return genudechngadv;
                }

                /**
                 * Sets the value of the genudechngadv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGENUDECHNGADV(String value) {
                    this.genudechngadv = value;
                }

                /**
                 * Gets the value of the prodmapstat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODMAPSTAT() {
                    return prodmapstat;
                }

                /**
                 * Sets the value of the prodmapstat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODMAPSTAT(String value) {
                    this.prodmapstat = value;
                }

                /**
                 * Gets the value of the udeccy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUDECCY() {
                    return udeccy;
                }

                /**
                 * Sets the value of the udeccy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUDECCY(String value) {
                    this.udeccy = value;
                }

                /**
                 * Gets the value of the ilprd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getILPRD() {
                    return ilprd;
                }

                /**
                 * Sets the value of the ilprd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setILPRD(String value) {
                    this.ilprd = value;
                }

                /**
                 * Gets the value of the disptyp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDISPTYP() {
                    return disptyp;
                }

                /**
                 * Sets the value of the disptyp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDISPTYP(String value) {
                    this.disptyp = value;
                }

                /**
                 * Gets the value of the childinteffdtmap property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the childinteffdtmap property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChildinteffdtmap().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap }
                 * 
                 * 
                 */
                public List<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap> getChildinteffdtmap() {
                    if (childinteffdtmap == null) {
                        childinteffdtmap = new ArrayList<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap>();
                    }
                    return this.childinteffdtmap;
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
                 *         &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Childintsde" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                @XmlType(name = "", propOrder = {
                    "udeeffdt",
                    "effdtmapstat",
                    "childintsde"
                })
                public static class Childinteffdtmap {

                    @XmlElement(name = "UDEEFFDT")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar udeeffdt;
                    @XmlElement(name = "EFFDTMAPSTAT")
                    protected String effdtmapstat;
                    @XmlElement(name = "Childintsde")
                    protected List<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap.Childintsde> childintsde;

                    /**
                     * Gets the value of the udeeffdt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getUDEEFFDT() {
                        return udeeffdt;
                    }

                    /**
                     * Sets the value of the udeeffdt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setUDEEFFDT(XMLGregorianCalendar value) {
                        this.udeeffdt = value;
                    }

                    /**
                     * Gets the value of the effdtmapstat property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEFFDTMAPSTAT() {
                        return effdtmapstat;
                    }

                    /**
                     * Sets the value of the effdtmapstat property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEFFDTMAPSTAT(String value) {
                        this.effdtmapstat = value;
                    }

                    /**
                     * Gets the value of the childintsde property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the childintsde property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getChildintsde().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap.Childintsde }
                     * 
                     * 
                     */
                    public List<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap.Childintsde> getChildintsde() {
                        if (childintsde == null) {
                            childintsde = new ArrayList<IcctdfpoFullType.Tddetailsfpo.Childintdetails.Childintprodmap.Childinteffdtmap.Childintsde>();
                        }
                        return this.childintsde;
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
                     *         &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "udeid",
                        "udevalue",
                        "ratecode"
                    })
                    public static class Childintsde {

                        @XmlElement(name = "UDEID")
                        protected String udeid;
                        @XmlElement(name = "UDEVALUE")
                        protected BigDecimal udevalue;
                        @XmlElement(name = "RATECODE")
                        protected String ratecode;

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

                    }

                }

            }

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
         *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AUTOROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PMNTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="CLONMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MOVINTUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MOVPRIUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="NEXTMATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="MOVETOUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FUNDONOVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="REFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="REFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AUTOPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DEPTENOR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Childtdpayoutdetails" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Bcpayoutspo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Pcpayoutspo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PCOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "brn",
            "tdccy",
            "autoroll",
            "pmntccy",
            "rdamt",
            "pmntdt",
            "clonmat",
            "movintunclm",
            "movpriunclm",
            "matdt",
            "rolltype",
            "rollamt",
            "nextmatdt",
            "movetounclm",
            "fundonovd",
            "refreday",
            "refremth",
            "refreyear",
            "payacc",
            "paybrn",
            "autopay",
            "deptenor",
            "childtdpayoutdetails",
            "bcpayoutspo",
            "pcpayoutspo"
        })
        public static class Childinttddetails {

            @XmlElement(name = "BRN")
            protected String brn;
            @XmlElement(name = "TDCCY")
            protected String tdccy;
            @XmlElement(name = "AUTOROLL")
            protected String autoroll;
            @XmlElement(name = "PMNTCCY")
            protected String pmntccy;
            @XmlElement(name = "RDAMT")
            protected BigDecimal rdamt;
            @XmlElement(name = "PMNTDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar pmntdt;
            @XmlElement(name = "CLONMAT")
            protected String clonmat;
            @XmlElement(name = "MOVINTUNCLM")
            protected String movintunclm;
            @XmlElement(name = "MOVPRIUNCLM")
            protected String movpriunclm;
            @XmlElement(name = "MATDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar matdt;
            @XmlElement(name = "ROLLTYPE")
            protected String rolltype;
            @XmlElement(name = "ROLLAMT")
            protected BigDecimal rollamt;
            @XmlElement(name = "NEXTMATDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar nextmatdt;
            @XmlElement(name = "MOVETOUNCLM")
            protected String movetounclm;
            @XmlElement(name = "FUNDONOVD")
            protected String fundonovd;
            @XmlElement(name = "REFREDAY")
            protected BigDecimal refreday;
            @XmlElement(name = "REFREMTH")
            protected BigDecimal refremth;
            @XmlElement(name = "REFREYEAR")
            protected BigDecimal refreyear;
            @XmlElement(name = "PAYACC")
            protected String payacc;
            @XmlElement(name = "PAYBRN")
            protected String paybrn;
            @XmlElement(name = "AUTOPAY")
            protected String autopay;
            @XmlElement(name = "DEPTENOR")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar deptenor;
            @XmlElement(name = "Childtdpayoutdetails")
            protected List<IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Childtdpayoutdetails> childtdpayoutdetails;
            @XmlElement(name = "Bcpayoutspo")
            protected IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Bcpayoutspo bcpayoutspo;
            @XmlElement(name = "Pcpayoutspo")
            protected IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Pcpayoutspo pcpayoutspo;

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
             * Gets the value of the autoroll property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUTOROLL() {
                return autoroll;
            }

            /**
             * Sets the value of the autoroll property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUTOROLL(String value) {
                this.autoroll = value;
            }

            /**
             * Gets the value of the pmntccy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPMNTCCY() {
                return pmntccy;
            }

            /**
             * Sets the value of the pmntccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPMNTCCY(String value) {
                this.pmntccy = value;
            }

            /**
             * Gets the value of the rdamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRDAMT() {
                return rdamt;
            }

            /**
             * Sets the value of the rdamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRDAMT(BigDecimal value) {
                this.rdamt = value;
            }

            /**
             * Gets the value of the pmntdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPMNTDT() {
                return pmntdt;
            }

            /**
             * Sets the value of the pmntdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPMNTDT(XMLGregorianCalendar value) {
                this.pmntdt = value;
            }

            /**
             * Gets the value of the clonmat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLONMAT() {
                return clonmat;
            }

            /**
             * Sets the value of the clonmat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLONMAT(String value) {
                this.clonmat = value;
            }

            /**
             * Gets the value of the movintunclm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOVINTUNCLM() {
                return movintunclm;
            }

            /**
             * Sets the value of the movintunclm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOVINTUNCLM(String value) {
                this.movintunclm = value;
            }

            /**
             * Gets the value of the movpriunclm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOVPRIUNCLM() {
                return movpriunclm;
            }

            /**
             * Sets the value of the movpriunclm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOVPRIUNCLM(String value) {
                this.movpriunclm = value;
            }

            /**
             * Gets the value of the matdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getMATDT() {
                return matdt;
            }

            /**
             * Sets the value of the matdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setMATDT(XMLGregorianCalendar value) {
                this.matdt = value;
            }

            /**
             * Gets the value of the rolltype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getROLLTYPE() {
                return rolltype;
            }

            /**
             * Sets the value of the rolltype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setROLLTYPE(String value) {
                this.rolltype = value;
            }

            /**
             * Gets the value of the rollamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getROLLAMT() {
                return rollamt;
            }

            /**
             * Sets the value of the rollamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setROLLAMT(BigDecimal value) {
                this.rollamt = value;
            }

            /**
             * Gets the value of the nextmatdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNEXTMATDT() {
                return nextmatdt;
            }

            /**
             * Sets the value of the nextmatdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNEXTMATDT(XMLGregorianCalendar value) {
                this.nextmatdt = value;
            }

            /**
             * Gets the value of the movetounclm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOVETOUNCLM() {
                return movetounclm;
            }

            /**
             * Sets the value of the movetounclm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOVETOUNCLM(String value) {
                this.movetounclm = value;
            }

            /**
             * Gets the value of the fundonovd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFUNDONOVD() {
                return fundonovd;
            }

            /**
             * Sets the value of the fundonovd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFUNDONOVD(String value) {
                this.fundonovd = value;
            }

            /**
             * Gets the value of the refreday property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getREFREDAY() {
                return refreday;
            }

            /**
             * Sets the value of the refreday property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setREFREDAY(BigDecimal value) {
                this.refreday = value;
            }

            /**
             * Gets the value of the refremth property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getREFREMTH() {
                return refremth;
            }

            /**
             * Sets the value of the refremth property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setREFREMTH(BigDecimal value) {
                this.refremth = value;
            }

            /**
             * Gets the value of the refreyear property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getREFREYEAR() {
                return refreyear;
            }

            /**
             * Sets the value of the refreyear property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setREFREYEAR(BigDecimal value) {
                this.refreyear = value;
            }

            /**
             * Gets the value of the payacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYACC() {
                return payacc;
            }

            /**
             * Sets the value of the payacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYACC(String value) {
                this.payacc = value;
            }

            /**
             * Gets the value of the paybrn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYBRN() {
                return paybrn;
            }

            /**
             * Sets the value of the paybrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYBRN(String value) {
                this.paybrn = value;
            }

            /**
             * Gets the value of the autopay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUTOPAY() {
                return autopay;
            }

            /**
             * Sets the value of the autopay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUTOPAY(String value) {
                this.autopay = value;
            }

            /**
             * Gets the value of the deptenor property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDEPTENOR() {
                return deptenor;
            }

            /**
             * Sets the value of the deptenor property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDEPTENOR(XMLGregorianCalendar value) {
                this.deptenor = value;
            }

            /**
             * Gets the value of the childtdpayoutdetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the childtdpayoutdetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChildtdpayoutdetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Childtdpayoutdetails }
             * 
             * 
             */
            public List<IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Childtdpayoutdetails> getChildtdpayoutdetails() {
                if (childtdpayoutdetails == null) {
                    childtdpayoutdetails = new ArrayList<IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Childtdpayoutdetails>();
                }
                return this.childtdpayoutdetails;
            }

            /**
             * Gets the value of the bcpayoutspo property.
             * 
             * @return
             *     possible object is
             *     {@link IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Bcpayoutspo }
             *     
             */
            public IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Bcpayoutspo getBcpayoutspo() {
                return bcpayoutspo;
            }

            /**
             * Sets the value of the bcpayoutspo property.
             * 
             * @param value
             *     allowed object is
             *     {@link IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Bcpayoutspo }
             *     
             */
            public void setBcpayoutspo(IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Bcpayoutspo value) {
                this.bcpayoutspo = value;
            }

            /**
             * Gets the value of the pcpayoutspo property.
             * 
             * @return
             *     possible object is
             *     {@link IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Pcpayoutspo }
             *     
             */
            public IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Pcpayoutspo getPcpayoutspo() {
                return pcpayoutspo;
            }

            /**
             * Sets the value of the pcpayoutspo property.
             * 
             * @param value
             *     allowed object is
             *     {@link IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Pcpayoutspo }
             *     
             */
            public void setPcpayoutspo(IcctdfpoFullType.Tddetailsfpo.Childinttddetails.Pcpayoutspo value) {
                this.pcpayoutspo = value;
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
             *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ccy",
                "bankcode",
                "benfname",
                "benfadd1",
                "benfadd2",
                "otherdets",
                "narrative"
            })
            public static class Bcpayoutspo {

                @XmlElement(name = "CCY")
                protected String ccy;
                @XmlElement(name = "BANKCODE")
                protected String bankcode;
                @XmlElement(name = "BENFNAME")
                protected String benfname;
                @XmlElement(name = "BENFADD1")
                protected String benfadd1;
                @XmlElement(name = "BENFADD2")
                protected String benfadd2;
                @XmlElement(name = "OTHERDETS")
                protected String otherdets;
                @XmlElement(name = "NARRATIVE")
                protected String narrative;

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
                 * Gets the value of the bankcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBANKCODE() {
                    return bankcode;
                }

                /**
                 * Sets the value of the bankcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBANKCODE(String value) {
                    this.bankcode = value;
                }

                /**
                 * Gets the value of the benfname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFNAME() {
                    return benfname;
                }

                /**
                 * Sets the value of the benfname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFNAME(String value) {
                    this.benfname = value;
                }

                /**
                 * Gets the value of the benfadd1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFADD1() {
                    return benfadd1;
                }

                /**
                 * Sets the value of the benfadd1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFADD1(String value) {
                    this.benfadd1 = value;
                }

                /**
                 * Gets the value of the benfadd2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFADD2() {
                    return benfadd2;
                }

                /**
                 * Sets the value of the benfadd2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFADD2(String value) {
                    this.benfadd2 = value;
                }

                /**
                 * Gets the value of the otherdets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOTHERDETS() {
                    return otherdets;
                }

                /**
                 * Sets the value of the otherdets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOTHERDETS(String value) {
                    this.otherdets = value;
                }

                /**
                 * Gets the value of the narrative property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNARRATIVE() {
                    return narrative;
                }

                /**
                 * Sets the value of the narrative property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNARRATIVE(String value) {
                    this.narrative = value;
                }

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
             *         &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "payouttype",
                "offbrn",
                "offacc",
                "percentage",
                "narrative"
            })
            public static class Childtdpayoutdetails {

                @XmlElement(name = "PAYOUTTYPE")
                protected String payouttype;
                @XmlElement(name = "OFFBRN")
                protected String offbrn;
                @XmlElement(name = "OFFACC")
                protected String offacc;
                @XmlElement(name = "PERCENTAGE")
                protected BigDecimal percentage;
                @XmlElement(name = "NARRATIVE")
                protected String narrative;

                /**
                 * Gets the value of the payouttype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPAYOUTTYPE() {
                    return payouttype;
                }

                /**
                 * Sets the value of the payouttype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPAYOUTTYPE(String value) {
                    this.payouttype = value;
                }

                /**
                 * Gets the value of the offbrn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOFFBRN() {
                    return offbrn;
                }

                /**
                 * Sets the value of the offbrn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOFFBRN(String value) {
                    this.offbrn = value;
                }

                /**
                 * Gets the value of the offacc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOFFACC() {
                    return offacc;
                }

                /**
                 * Sets the value of the offacc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOFFACC(String value) {
                    this.offacc = value;
                }

                /**
                 * Gets the value of the percentage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPERCENTAGE() {
                    return percentage;
                }

                /**
                 * Sets the value of the percentage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPERCENTAGE(BigDecimal value) {
                    this.percentage = value;
                }

                /**
                 * Gets the value of the narrative property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNARRATIVE() {
                    return narrative;
                }

                /**
                 * Sets the value of the narrative property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNARRATIVE(String value) {
                    this.narrative = value;
                }

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
             *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PCBANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PCOFFSETACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BENFADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OTHERDETS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ccy",
                "pcbankcode",
                "pcoffsetacc",
                "benfname",
                "benfadd1",
                "otherdets",
                "narrative"
            })
            public static class Pcpayoutspo {

                @XmlElement(name = "CCY")
                protected String ccy;
                @XmlElement(name = "PCBANKCODE")
                protected String pcbankcode;
                @XmlElement(name = "PCOFFSETACC")
                protected String pcoffsetacc;
                @XmlElement(name = "BENFNAME")
                protected String benfname;
                @XmlElement(name = "BENFADD1")
                protected String benfadd1;
                @XmlElement(name = "OTHERDETS")
                protected String otherdets;
                @XmlElement(name = "NARRATIVE")
                protected String narrative;

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
                 * Gets the value of the pcbankcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPCBANKCODE() {
                    return pcbankcode;
                }

                /**
                 * Sets the value of the pcbankcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPCBANKCODE(String value) {
                    this.pcbankcode = value;
                }

                /**
                 * Gets the value of the pcoffsetacc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPCOFFSETACC() {
                    return pcoffsetacc;
                }

                /**
                 * Sets the value of the pcoffsetacc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPCOFFSETACC(String value) {
                    this.pcoffsetacc = value;
                }

                /**
                 * Gets the value of the benfname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFNAME() {
                    return benfname;
                }

                /**
                 * Sets the value of the benfname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFNAME(String value) {
                    this.benfname = value;
                }

                /**
                 * Gets the value of the benfadd1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBENFADD1() {
                    return benfadd1;
                }

                /**
                 * Sets the value of the benfadd1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBENFADD1(String value) {
                    this.benfadd1 = value;
                }

                /**
                 * Gets the value of the otherdets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOTHERDETS() {
                    return otherdets;
                }

                /**
                 * Sets the value of the otherdets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOTHERDETS(String value) {
                    this.otherdets = value;
                }

                /**
                 * Gets the value of the narrative property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNARRATIVE() {
                    return narrative;
                }

                /**
                 * Sets the value of the narrative property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNARRATIVE(String value) {
                    this.narrative = value;
                }

            }

        }

    }

}
