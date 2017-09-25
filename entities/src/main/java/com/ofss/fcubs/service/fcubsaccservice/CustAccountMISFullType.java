
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
 * <p>Java class for CustAccountMIS-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAccountMIS-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misdetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MISGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="POOLCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="REFRTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISGRPTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFRTSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CALCMETH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISGRPCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RTFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINKGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MisAccLog" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MisBalLog" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FINYR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="GLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TRNIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *         &lt;element name="Chglog" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Classname" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="C2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="C3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="C4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="C6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="C7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="C8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="C9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="C10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CustAccountMIS-Full-Type", propOrder = {
    "brn",
    "acc",
    "misdetails",
    "chglog",
    "classname"
})
public class CustAccountMISFullType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "Misdetails")
    protected CustAccountMISFullType.Misdetails misdetails;
    @XmlElement(name = "Chglog")
    protected CustAccountMISFullType.Chglog chglog;
    @XmlElement(name = "Classname")
    protected CustAccountMISFullType.Classname classname;

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
     * Gets the value of the misdetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccountMISFullType.Misdetails }
     *     
     */
    public CustAccountMISFullType.Misdetails getMisdetails() {
        return misdetails;
    }

    /**
     * Sets the value of the misdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccountMISFullType.Misdetails }
     *     
     */
    public void setMisdetails(CustAccountMISFullType.Misdetails value) {
        this.misdetails = value;
    }

    /**
     * Gets the value of the chglog property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccountMISFullType.Chglog }
     *     
     */
    public CustAccountMISFullType.Chglog getChglog() {
        return chglog;
    }

    /**
     * Sets the value of the chglog property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccountMISFullType.Chglog }
     *     
     */
    public void setChglog(CustAccountMISFullType.Chglog value) {
        this.chglog = value;
    }

    /**
     * Gets the value of the classname property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccountMISFullType.Classname }
     *     
     */
    public CustAccountMISFullType.Classname getClassname() {
        return classname;
    }

    /**
     * Sets the value of the classname property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccountMISFullType.Classname }
     *     
     */
    public void setClassname(CustAccountMISFullType.Classname value) {
        this.classname = value;
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
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Chglog {


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
     *         &lt;element name="C2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="C3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="C4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="C6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="C7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="C8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="C9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="C10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "c2",
        "c3",
        "c4",
        "c6",
        "c7",
        "c8",
        "c9",
        "c10",
        "t1",
        "t3",
        "t5",
        "t6",
        "t7",
        "t8",
        "t9",
        "t10"
    })
    public static class Classname {

        @XmlElement(name = "C2")
        protected String c2;
        @XmlElement(name = "C3")
        protected String c3;
        @XmlElement(name = "C4")
        protected String c4;
        @XmlElement(name = "C6")
        protected String c6;
        @XmlElement(name = "C7")
        protected String c7;
        @XmlElement(name = "C8")
        protected String c8;
        @XmlElement(name = "C9")
        protected String c9;
        @XmlElement(name = "C10")
        protected String c10;
        @XmlElement(name = "T1")
        protected String t1;
        @XmlElement(name = "T3")
        protected String t3;
        @XmlElement(name = "T5")
        protected String t5;
        @XmlElement(name = "T6")
        protected String t6;
        @XmlElement(name = "T7")
        protected String t7;
        @XmlElement(name = "T8")
        protected String t8;
        @XmlElement(name = "T9")
        protected String t9;
        @XmlElement(name = "T10")
        protected String t10;

        /**
         * Gets the value of the c2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC2() {
            return c2;
        }

        /**
         * Sets the value of the c2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC2(String value) {
            this.c2 = value;
        }

        /**
         * Gets the value of the c3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC3() {
            return c3;
        }

        /**
         * Sets the value of the c3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC3(String value) {
            this.c3 = value;
        }

        /**
         * Gets the value of the c4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC4() {
            return c4;
        }

        /**
         * Sets the value of the c4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC4(String value) {
            this.c4 = value;
        }

        /**
         * Gets the value of the c6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC6() {
            return c6;
        }

        /**
         * Sets the value of the c6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC6(String value) {
            this.c6 = value;
        }

        /**
         * Gets the value of the c7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC7() {
            return c7;
        }

        /**
         * Sets the value of the c7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC7(String value) {
            this.c7 = value;
        }

        /**
         * Gets the value of the c8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC8() {
            return c8;
        }

        /**
         * Sets the value of the c8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC8(String value) {
            this.c8 = value;
        }

        /**
         * Gets the value of the c9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC9() {
            return c9;
        }

        /**
         * Sets the value of the c9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC9(String value) {
            this.c9 = value;
        }

        /**
         * Gets the value of the c10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getC10() {
            return c10;
        }

        /**
         * Sets the value of the c10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setC10(String value) {
            this.c10 = value;
        }

        /**
         * Gets the value of the t1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getT1() {
            return t1;
        }

        /**
         * Sets the value of the t1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setT1(String value) {
            this.t1 = value;
        }

        /**
         * Gets the value of the t3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getT3() {
            return t3;
        }

        /**
         * Sets the value of the t3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setT3(String value) {
            this.t3 = value;
        }

        /**
         * Gets the value of the t5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getT5() {
            return t5;
        }

        /**
         * Sets the value of the t5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setT5(String value) {
            this.t5 = value;
        }

        /**
         * Gets the value of the t6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getT6() {
            return t6;
        }

        /**
         * Sets the value of the t6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setT6(String value) {
            this.t6 = value;
        }

        /**
         * Gets the value of the t7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getT7() {
            return t7;
        }

        /**
         * Sets the value of the t7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setT7(String value) {
            this.t7 = value;
        }

        /**
         * Gets the value of the t8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getT8() {
            return t8;
        }

        /**
         * Sets the value of the t8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setT8(String value) {
            this.t8 = value;
        }

        /**
         * Gets the value of the t9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getT9() {
            return t9;
        }

        /**
         * Sets the value of the t9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setT9(String value) {
            this.t9 = value;
        }

        /**
         * Gets the value of the t10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getT10() {
            return t10;
        }

        /**
         * Sets the value of the t10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setT10(String value) {
            this.t10 = value;
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
     *         &lt;element name="MISGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="POOLCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="REFRTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISGRPTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFRTSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CALCMETH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISGRPCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RTFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINKGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MisAccLog" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MisBalLog" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FINYR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="GLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TRNIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "misgrp",
        "poolcd",
        "refrate",
        "refrttype",
        "misgrptxn",
        "refrtcd",
        "refrtsprd",
        "calcmeth",
        "txnmis1",
        "txnmis2",
        "txnmis3",
        "txnmis4",
        "txnmis5",
        "txnmis6",
        "txnmis7",
        "txnmis8",
        "txnmis9",
        "txnmis10",
        "misgrpcomp",
        "compmis1",
        "compmis2",
        "compmis3",
        "compmis4",
        "compmis5",
        "compmis6",
        "compmis7",
        "compmis8",
        "compmis9",
        "compmis10",
        "costcod1",
        "costcod2",
        "costcod3",
        "costcod4",
        "costcod5",
        "rtflag",
        "linkgrp",
        "misAccLog",
        "misBalLog"
    })
    public static class Misdetails {

        @XmlElement(name = "MISGRP")
        protected String misgrp;
        @XmlElement(name = "POOLCD")
        protected String poolcd;
        @XmlElement(name = "REFRATE")
        protected BigDecimal refrate;
        @XmlElement(name = "REFRTTYPE")
        protected String refrttype;
        @XmlElement(name = "MISGRPTXN")
        protected String misgrptxn;
        @XmlElement(name = "REFRTCD")
        protected String refrtcd;
        @XmlElement(name = "REFRTSPRD")
        protected BigDecimal refrtsprd;
        @XmlElement(name = "CALCMETH")
        protected String calcmeth;
        @XmlElement(name = "TXNMIS1")
        protected String txnmis1;
        @XmlElement(name = "TXNMIS2")
        protected String txnmis2;
        @XmlElement(name = "TXNMIS3")
        protected String txnmis3;
        @XmlElement(name = "TXNMIS4")
        protected String txnmis4;
        @XmlElement(name = "TXNMIS5")
        protected String txnmis5;
        @XmlElement(name = "TXNMIS6")
        protected String txnmis6;
        @XmlElement(name = "TXNMIS7")
        protected String txnmis7;
        @XmlElement(name = "TXNMIS8")
        protected String txnmis8;
        @XmlElement(name = "TXNMIS9")
        protected String txnmis9;
        @XmlElement(name = "TXNMIS10")
        protected String txnmis10;
        @XmlElement(name = "MISGRPCOMP")
        protected String misgrpcomp;
        @XmlElement(name = "COMPMIS1")
        protected String compmis1;
        @XmlElement(name = "COMPMIS2")
        protected String compmis2;
        @XmlElement(name = "COMPMIS3")
        protected String compmis3;
        @XmlElement(name = "COMPMIS4")
        protected String compmis4;
        @XmlElement(name = "COMPMIS5")
        protected String compmis5;
        @XmlElement(name = "COMPMIS6")
        protected String compmis6;
        @XmlElement(name = "COMPMIS7")
        protected String compmis7;
        @XmlElement(name = "COMPMIS8")
        protected String compmis8;
        @XmlElement(name = "COMPMIS9")
        protected String compmis9;
        @XmlElement(name = "COMPMIS10")
        protected String compmis10;
        @XmlElement(name = "COSTCOD1")
        protected String costcod1;
        @XmlElement(name = "COSTCOD2")
        protected String costcod2;
        @XmlElement(name = "COSTCOD3")
        protected String costcod3;
        @XmlElement(name = "COSTCOD4")
        protected String costcod4;
        @XmlElement(name = "COSTCOD5")
        protected String costcod5;
        @XmlElement(name = "RTFLAG")
        protected String rtflag;
        @XmlElement(name = "LINKGRP")
        protected String linkgrp;
        @XmlElement(name = "MisAccLog")
        protected List<CustAccountMISFullType.Misdetails.MisAccLog> misAccLog;
        @XmlElement(name = "MisBalLog")
        protected List<CustAccountMISFullType.Misdetails.MisBalLog> misBalLog;

        /**
         * Gets the value of the misgrp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGRP() {
            return misgrp;
        }

        /**
         * Sets the value of the misgrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGRP(String value) {
            this.misgrp = value;
        }

        /**
         * Gets the value of the poolcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOOLCD() {
            return poolcd;
        }

        /**
         * Sets the value of the poolcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOOLCD(String value) {
            this.poolcd = value;
        }

        /**
         * Gets the value of the refrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getREFRATE() {
            return refrate;
        }

        /**
         * Sets the value of the refrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setREFRATE(BigDecimal value) {
            this.refrate = value;
        }

        /**
         * Gets the value of the refrttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFRTTYPE() {
            return refrttype;
        }

        /**
         * Sets the value of the refrttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFRTTYPE(String value) {
            this.refrttype = value;
        }

        /**
         * Gets the value of the misgrptxn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGRPTXN() {
            return misgrptxn;
        }

        /**
         * Sets the value of the misgrptxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGRPTXN(String value) {
            this.misgrptxn = value;
        }

        /**
         * Gets the value of the refrtcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFRTCD() {
            return refrtcd;
        }

        /**
         * Sets the value of the refrtcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFRTCD(String value) {
            this.refrtcd = value;
        }

        /**
         * Gets the value of the refrtsprd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getREFRTSPRD() {
            return refrtsprd;
        }

        /**
         * Sets the value of the refrtsprd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setREFRTSPRD(BigDecimal value) {
            this.refrtsprd = value;
        }

        /**
         * Gets the value of the calcmeth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCMETH() {
            return calcmeth;
        }

        /**
         * Sets the value of the calcmeth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCMETH(String value) {
            this.calcmeth = value;
        }

        /**
         * Gets the value of the txnmis1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS1() {
            return txnmis1;
        }

        /**
         * Sets the value of the txnmis1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS1(String value) {
            this.txnmis1 = value;
        }

        /**
         * Gets the value of the txnmis2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS2() {
            return txnmis2;
        }

        /**
         * Sets the value of the txnmis2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS2(String value) {
            this.txnmis2 = value;
        }

        /**
         * Gets the value of the txnmis3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS3() {
            return txnmis3;
        }

        /**
         * Sets the value of the txnmis3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS3(String value) {
            this.txnmis3 = value;
        }

        /**
         * Gets the value of the txnmis4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS4() {
            return txnmis4;
        }

        /**
         * Sets the value of the txnmis4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS4(String value) {
            this.txnmis4 = value;
        }

        /**
         * Gets the value of the txnmis5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS5() {
            return txnmis5;
        }

        /**
         * Sets the value of the txnmis5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS5(String value) {
            this.txnmis5 = value;
        }

        /**
         * Gets the value of the txnmis6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS6() {
            return txnmis6;
        }

        /**
         * Sets the value of the txnmis6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS6(String value) {
            this.txnmis6 = value;
        }

        /**
         * Gets the value of the txnmis7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS7() {
            return txnmis7;
        }

        /**
         * Sets the value of the txnmis7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS7(String value) {
            this.txnmis7 = value;
        }

        /**
         * Gets the value of the txnmis8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS8() {
            return txnmis8;
        }

        /**
         * Sets the value of the txnmis8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS8(String value) {
            this.txnmis8 = value;
        }

        /**
         * Gets the value of the txnmis9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS9() {
            return txnmis9;
        }

        /**
         * Sets the value of the txnmis9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS9(String value) {
            this.txnmis9 = value;
        }

        /**
         * Gets the value of the txnmis10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS10() {
            return txnmis10;
        }

        /**
         * Sets the value of the txnmis10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS10(String value) {
            this.txnmis10 = value;
        }

        /**
         * Gets the value of the misgrpcomp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGRPCOMP() {
            return misgrpcomp;
        }

        /**
         * Sets the value of the misgrpcomp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGRPCOMP(String value) {
            this.misgrpcomp = value;
        }

        /**
         * Gets the value of the compmis1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS1() {
            return compmis1;
        }

        /**
         * Sets the value of the compmis1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS1(String value) {
            this.compmis1 = value;
        }

        /**
         * Gets the value of the compmis2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS2() {
            return compmis2;
        }

        /**
         * Sets the value of the compmis2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS2(String value) {
            this.compmis2 = value;
        }

        /**
         * Gets the value of the compmis3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS3() {
            return compmis3;
        }

        /**
         * Sets the value of the compmis3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS3(String value) {
            this.compmis3 = value;
        }

        /**
         * Gets the value of the compmis4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS4() {
            return compmis4;
        }

        /**
         * Sets the value of the compmis4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS4(String value) {
            this.compmis4 = value;
        }

        /**
         * Gets the value of the compmis5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS5() {
            return compmis5;
        }

        /**
         * Sets the value of the compmis5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS5(String value) {
            this.compmis5 = value;
        }

        /**
         * Gets the value of the compmis6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS6() {
            return compmis6;
        }

        /**
         * Sets the value of the compmis6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS6(String value) {
            this.compmis6 = value;
        }

        /**
         * Gets the value of the compmis7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS7() {
            return compmis7;
        }

        /**
         * Sets the value of the compmis7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS7(String value) {
            this.compmis7 = value;
        }

        /**
         * Gets the value of the compmis8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS8() {
            return compmis8;
        }

        /**
         * Sets the value of the compmis8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS8(String value) {
            this.compmis8 = value;
        }

        /**
         * Gets the value of the compmis9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS9() {
            return compmis9;
        }

        /**
         * Sets the value of the compmis9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS9(String value) {
            this.compmis9 = value;
        }

        /**
         * Gets the value of the compmis10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS10() {
            return compmis10;
        }

        /**
         * Sets the value of the compmis10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS10(String value) {
            this.compmis10 = value;
        }

        /**
         * Gets the value of the costcod1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD1() {
            return costcod1;
        }

        /**
         * Sets the value of the costcod1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD1(String value) {
            this.costcod1 = value;
        }

        /**
         * Gets the value of the costcod2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD2() {
            return costcod2;
        }

        /**
         * Sets the value of the costcod2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD2(String value) {
            this.costcod2 = value;
        }

        /**
         * Gets the value of the costcod3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD3() {
            return costcod3;
        }

        /**
         * Sets the value of the costcod3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD3(String value) {
            this.costcod3 = value;
        }

        /**
         * Gets the value of the costcod4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD4() {
            return costcod4;
        }

        /**
         * Sets the value of the costcod4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD4(String value) {
            this.costcod4 = value;
        }

        /**
         * Gets the value of the costcod5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD5() {
            return costcod5;
        }

        /**
         * Sets the value of the costcod5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD5(String value) {
            this.costcod5 = value;
        }

        /**
         * Gets the value of the rtflag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRTFLAG() {
            return rtflag;
        }

        /**
         * Sets the value of the rtflag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRTFLAG(String value) {
            this.rtflag = value;
        }

        /**
         * Gets the value of the linkgrp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKGRP() {
            return linkgrp;
        }

        /**
         * Sets the value of the linkgrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKGRP(String value) {
            this.linkgrp = value;
        }

        /**
         * Gets the value of the misAccLog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the misAccLog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMisAccLog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustAccountMISFullType.Misdetails.MisAccLog }
         * 
         * 
         */
        public List<CustAccountMISFullType.Misdetails.MisAccLog> getMisAccLog() {
            if (misAccLog == null) {
                misAccLog = new ArrayList<CustAccountMISFullType.Misdetails.MisAccLog>();
            }
            return this.misAccLog;
        }

        /**
         * Gets the value of the misBalLog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the misBalLog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMisBalLog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustAccountMISFullType.Misdetails.MisBalLog }
         * 
         * 
         */
        public List<CustAccountMISFullType.Misdetails.MisBalLog> getMisBalLog() {
            if (misBalLog == null) {
                misBalLog = new ArrayList<CustAccountMISFullType.Misdetails.MisBalLog>();
            }
            return this.misBalLog;
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
         *         &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "miscls",
            "txndt",
            "oldmiscd",
            "nwmiscd"
        })
        public static class MisAccLog {

            @XmlElement(name = "MISCLS", required = true)
            protected String miscls;
            @XmlElement(name = "TXNDT", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar txndt;
            @XmlElement(name = "OLDMISCD")
            protected String oldmiscd;
            @XmlElement(name = "NWMISCD")
            protected String nwmiscd;

            /**
             * Gets the value of the miscls property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMISCLS() {
                return miscls;
            }

            /**
             * Sets the value of the miscls property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMISCLS(String value) {
                this.miscls = value;
            }

            /**
             * Gets the value of the txndt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTXNDT() {
                return txndt;
            }

            /**
             * Sets the value of the txndt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTXNDT(XMLGregorianCalendar value) {
                this.txndt = value;
            }

            /**
             * Gets the value of the oldmiscd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOLDMISCD() {
                return oldmiscd;
            }

            /**
             * Sets the value of the oldmiscd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOLDMISCD(String value) {
                this.oldmiscd = value;
            }

            /**
             * Gets the value of the nwmiscd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNWMISCD() {
                return nwmiscd;
            }

            /**
             * Sets the value of the nwmiscd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNWMISCD(String value) {
                this.nwmiscd = value;
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
         *         &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FINYR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="GLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OLDMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NWMISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TRNIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            "prdcd",
            "finyr",
            "txndt",
            "glcode",
            "miscls",
            "oldmiscd",
            "nwmiscd",
            "trnind",
            "ccy",
            "xrate",
            "amt"
        })
        public static class MisBalLog {

            @XmlElement(name = "BRN")
            protected String brn;
            @XmlElement(name = "PRDCD")
            protected String prdcd;
            @XmlElement(name = "FINYR")
            protected String finyr;
            @XmlElement(name = "TXNDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar txndt;
            @XmlElement(name = "GLCODE")
            protected String glcode;
            @XmlElement(name = "MISCLS")
            protected String miscls;
            @XmlElement(name = "OLDMISCD")
            protected String oldmiscd;
            @XmlElement(name = "NWMISCD")
            protected String nwmiscd;
            @XmlElement(name = "TRNIND")
            protected String trnind;
            @XmlElement(name = "CCY")
            protected String ccy;
            @XmlElement(name = "XRATE")
            protected BigDecimal xrate;
            @XmlElement(name = "AMT")
            protected BigDecimal amt;

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
             * Gets the value of the prdcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRDCD() {
                return prdcd;
            }

            /**
             * Sets the value of the prdcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRDCD(String value) {
                this.prdcd = value;
            }

            /**
             * Gets the value of the finyr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFINYR() {
                return finyr;
            }

            /**
             * Sets the value of the finyr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFINYR(String value) {
                this.finyr = value;
            }

            /**
             * Gets the value of the txndt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTXNDT() {
                return txndt;
            }

            /**
             * Sets the value of the txndt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTXNDT(XMLGregorianCalendar value) {
                this.txndt = value;
            }

            /**
             * Gets the value of the glcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGLCODE() {
                return glcode;
            }

            /**
             * Sets the value of the glcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGLCODE(String value) {
                this.glcode = value;
            }

            /**
             * Gets the value of the miscls property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMISCLS() {
                return miscls;
            }

            /**
             * Sets the value of the miscls property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMISCLS(String value) {
                this.miscls = value;
            }

            /**
             * Gets the value of the oldmiscd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOLDMISCD() {
                return oldmiscd;
            }

            /**
             * Sets the value of the oldmiscd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOLDMISCD(String value) {
                this.oldmiscd = value;
            }

            /**
             * Gets the value of the nwmiscd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNWMISCD() {
                return nwmiscd;
            }

            /**
             * Sets the value of the nwmiscd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNWMISCD(String value) {
                this.nwmiscd = value;
            }

            /**
             * Gets the value of the trnind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNIND() {
                return trnind;
            }

            /**
             * Sets the value of the trnind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNIND(String value) {
                this.trnind = value;
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
             * Gets the value of the xrate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getXRATE() {
                return xrate;
            }

            /**
             * Sets the value of the xrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setXRATE(BigDecimal value) {
                this.xrate = value;
            }

            /**
             * Gets the value of the amt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAMT() {
                return amt;
            }

            /**
             * Sets the value of the amt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAMT(BigDecimal value) {
                this.amt = value;
            }

        }

    }

}
