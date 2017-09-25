
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Custmis-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Custmis-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MISGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custchnglog" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Baltrnsfrlog" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Customermis" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Compositemis" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Custmis-Create-IO-Type", propOrder = {
    "misgrp",
    "custno",
    "custchnglog",
    "baltrnsfrlog",
    "customermis",
    "compositemis"
})
public class CustmisCreateIOType {

    @XmlElement(name = "MISGRP")
    protected String misgrp;
    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "Custchnglog")
    protected List<CustmisCreateIOType.Custchnglog> custchnglog;
    @XmlElement(name = "Baltrnsfrlog")
    protected List<CustmisCreateIOType.Baltrnsfrlog> baltrnsfrlog;
    @XmlElement(name = "Customermis")
    protected List<CustmisCreateIOType.Customermis> customermis;
    @XmlElement(name = "Compositemis")
    protected List<CustmisCreateIOType.Compositemis> compositemis;

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
     * Gets the value of the custchnglog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custchnglog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustchnglog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisCreateIOType.Custchnglog }
     * 
     * 
     */
    public List<CustmisCreateIOType.Custchnglog> getCustchnglog() {
        if (custchnglog == null) {
            custchnglog = new ArrayList<CustmisCreateIOType.Custchnglog>();
        }
        return this.custchnglog;
    }

    /**
     * Gets the value of the baltrnsfrlog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baltrnsfrlog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaltrnsfrlog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisCreateIOType.Baltrnsfrlog }
     * 
     * 
     */
    public List<CustmisCreateIOType.Baltrnsfrlog> getBaltrnsfrlog() {
        if (baltrnsfrlog == null) {
            baltrnsfrlog = new ArrayList<CustmisCreateIOType.Baltrnsfrlog>();
        }
        return this.baltrnsfrlog;
    }

    /**
     * Gets the value of the customermis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customermis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomermis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisCreateIOType.Customermis }
     * 
     * 
     */
    public List<CustmisCreateIOType.Customermis> getCustomermis() {
        if (customermis == null) {
            customermis = new ArrayList<CustmisCreateIOType.Customermis>();
        }
        return this.customermis;
    }

    /**
     * Gets the value of the compositemis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositemis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositemis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustmisCreateIOType.Compositemis }
     * 
     * 
     */
    public List<CustmisCreateIOType.Compositemis> getCompositemis() {
        if (compositemis == null) {
            compositemis = new ArrayList<CustmisCreateIOType.Compositemis>();
        }
        return this.compositemis;
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
    public static class Baltrnsfrlog {


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
     *         &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "miscd"
    })
    public static class Compositemis {

        @XmlElement(name = "MISCLS")
        protected String miscls;
        @XmlElement(name = "MISCD")
        protected String miscd;

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
         * Gets the value of the miscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCD() {
            return miscd;
        }

        /**
         * Sets the value of the miscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCD(String value) {
            this.miscd = value;
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
    public static class Custchnglog {


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
     *         &lt;element name="MISCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "miscd"
    })
    public static class Customermis {

        @XmlElement(name = "MISCLS")
        protected String miscls;
        @XmlElement(name = "MISCD")
        protected String miscd;

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
         * Gets the value of the miscd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCD() {
            return miscd;
        }

        /**
         * Sets the value of the miscd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCD(String value) {
            this.miscd = value;
        }

    }

}
