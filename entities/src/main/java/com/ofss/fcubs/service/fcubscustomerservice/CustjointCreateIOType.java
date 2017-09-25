
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Custjoint-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Custjoint-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custjoint" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTPREFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FRSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LASTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PPTISSDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="PPTEXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DECEASED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RESISTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Custjoint-Create-IO-Type", propOrder = {
    "custno",
    "custjoint"
})
public class CustjointCreateIOType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "Custjoint")
    protected List<CustjointCreateIOType.Custjoint> custjoint;

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
     * Gets the value of the custjoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custjoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustjoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustjointCreateIOType.Custjoint }
     * 
     * 
     */
    public List<CustjointCreateIOType.Custjoint> getCustjoint() {
        if (custjoint == null) {
            custjoint = new ArrayList<CustjointCreateIOType.Custjoint>();
        }
        return this.custjoint;
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
     *         &lt;element name="CUSTPREFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FRSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LASTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PPTISSDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="PPTEXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DECEASED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RESISTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "custprefix",
        "frstname",
        "midname",
        "lastname",
        "dob",
        "sex",
        "ppno",
        "pptissdt",
        "pptexpdt",
        "add1",
        "add2",
        "add3",
        "tel",
        "email",
        "deceased",
        "resistat"
    })
    public static class Custjoint {

        @XmlElement(name = "CUSTPREFIX")
        protected String custprefix;
        @XmlElement(name = "FRSTNAME")
        protected String frstname;
        @XmlElement(name = "MIDNAME")
        protected String midname;
        @XmlElement(name = "LASTNAME")
        protected String lastname;
        @XmlElement(name = "DOB")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;
        @XmlElement(name = "SEX")
        protected String sex;
        @XmlElement(name = "PPNO")
        protected String ppno;
        @XmlElement(name = "PPTISSDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar pptissdt;
        @XmlElement(name = "PPTEXPDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar pptexpdt;
        @XmlElement(name = "ADD1")
        protected String add1;
        @XmlElement(name = "ADD2")
        protected String add2;
        @XmlElement(name = "ADD3")
        protected String add3;
        @XmlElement(name = "TEL")
        protected String tel;
        @XmlElement(name = "EMAIL")
        protected String email;
        @XmlElement(name = "DECEASED")
        protected String deceased;
        @XmlElement(name = "RESISTAT")
        protected String resistat;

        /**
         * Gets the value of the custprefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTPREFIX() {
            return custprefix;
        }

        /**
         * Sets the value of the custprefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTPREFIX(String value) {
            this.custprefix = value;
        }

        /**
         * Gets the value of the frstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFRSTNAME() {
            return frstname;
        }

        /**
         * Sets the value of the frstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFRSTNAME(String value) {
            this.frstname = value;
        }

        /**
         * Gets the value of the midname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMIDNAME() {
            return midname;
        }

        /**
         * Sets the value of the midname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMIDNAME(String value) {
            this.midname = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTNAME() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTNAME(String value) {
            this.lastname = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOB(XMLGregorianCalendar value) {
            this.dob = value;
        }

        /**
         * Gets the value of the sex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEX() {
            return sex;
        }

        /**
         * Sets the value of the sex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEX(String value) {
            this.sex = value;
        }

        /**
         * Gets the value of the ppno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPPNO() {
            return ppno;
        }

        /**
         * Sets the value of the ppno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPPNO(String value) {
            this.ppno = value;
        }

        /**
         * Gets the value of the pptissdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPPTISSDT() {
            return pptissdt;
        }

        /**
         * Sets the value of the pptissdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPPTISSDT(XMLGregorianCalendar value) {
            this.pptissdt = value;
        }

        /**
         * Gets the value of the pptexpdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPPTEXPDT() {
            return pptexpdt;
        }

        /**
         * Sets the value of the pptexpdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPPTEXPDT(XMLGregorianCalendar value) {
            this.pptexpdt = value;
        }

        /**
         * Gets the value of the add1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADD1() {
            return add1;
        }

        /**
         * Sets the value of the add1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADD1(String value) {
            this.add1 = value;
        }

        /**
         * Gets the value of the add2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADD2() {
            return add2;
        }

        /**
         * Sets the value of the add2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADD2(String value) {
            this.add2 = value;
        }

        /**
         * Gets the value of the add3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADD3() {
            return add3;
        }

        /**
         * Sets the value of the add3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADD3(String value) {
            this.add3 = value;
        }

        /**
         * Gets the value of the tel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTEL() {
            return tel;
        }

        /**
         * Sets the value of the tel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTEL(String value) {
            this.tel = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMAIL() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMAIL(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the deceased property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDECEASED() {
            return deceased;
        }

        /**
         * Sets the value of the deceased property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDECEASED(String value) {
            this.deceased = value;
        }

        /**
         * Gets the value of the resistat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRESISTAT() {
            return resistat;
        }

        /**
         * Sets the value of the resistat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRESISTAT(String value) {
            this.resistat = value;
        }

    }

}
