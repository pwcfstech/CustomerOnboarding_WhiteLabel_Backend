
package com.ofss.fcubs.service.fcubscustomerservice;

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
 * <p>Java class for Stcnsfib-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stcnsfib-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Chq-Det" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHQ_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CHQ_VALUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CHQ_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CHQ_PROCESS_ORDER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LVL_COMP_EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CG_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NSF_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LVL_EFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="LVL_EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHQ_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHQ_SAME_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EVENT_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "Stcnsfib-Full-Type", propOrder = {
    "custno",
    "cname",
    "chqDet"
})
public class StcnsfibFullType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "CNAME")
    protected String cname;
    @XmlElement(name = "Chq-Det")
    protected List<StcnsfibFullType.ChqDet> chqDet;

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
     * Gets the value of the cname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNAME() {
        return cname;
    }

    /**
     * Sets the value of the cname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNAME(String value) {
        this.cname = value;
    }

    /**
     * Gets the value of the chqDet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chqDet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChqDet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StcnsfibFullType.ChqDet }
     * 
     * 
     */
    public List<StcnsfibFullType.ChqDet> getChqDet() {
        if (chqDet == null) {
            chqDet = new ArrayList<StcnsfibFullType.ChqDet>();
        }
        return this.chqDet;
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
     *         &lt;element name="CHQ_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CHQ_VALUEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CHQ_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CHQ_PROCESS_ORDER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LVL_COMP_EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CG_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NSF_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LVL_EFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="LVL_EXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHQ_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHQ_SAME_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EVENT_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "chqdt",
        "chqvaluedt",
        "chqamt",
        "chqprocessorder",
        "lvlcompexpdt",
        "branchcode",
        "cgrefno",
        "nsflvl",
        "lvleffdt",
        "lvlexpdt",
        "customerno",
        "accountno",
        "chqno",
        "chqsameseqno",
        "eventno"
    })
    public static class ChqDet {

        @XmlElement(name = "CHQ_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar chqdt;
        @XmlElement(name = "CHQ_VALUEDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar chqvaluedt;
        @XmlElement(name = "CHQ_AMT")
        protected BigDecimal chqamt;
        @XmlElement(name = "CHQ_PROCESS_ORDER")
        protected BigDecimal chqprocessorder;
        @XmlElement(name = "LVL_COMP_EXPDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lvlcompexpdt;
        @XmlElement(name = "BRANCH_CODE")
        protected String branchcode;
        @XmlElement(name = "CG_REF_NO")
        protected String cgrefno;
        @XmlElement(name = "NSF_LVL")
        protected String nsflvl;
        @XmlElement(name = "LVL_EFFDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lvleffdt;
        @XmlElement(name = "LVL_EXPDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lvlexpdt;
        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "ACCOUNT_NO")
        protected String accountno;
        @XmlElement(name = "CHQ_NO")
        protected String chqno;
        @XmlElement(name = "CHQ_SAME_SEQ_NO")
        protected BigDecimal chqsameseqno;
        @XmlElement(name = "EVENT_NO")
        protected BigDecimal eventno;

        /**
         * Gets the value of the chqdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCHQDT() {
            return chqdt;
        }

        /**
         * Sets the value of the chqdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCHQDT(XMLGregorianCalendar value) {
            this.chqdt = value;
        }

        /**
         * Gets the value of the chqvaluedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCHQVALUEDT() {
            return chqvaluedt;
        }

        /**
         * Sets the value of the chqvaluedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCHQVALUEDT(XMLGregorianCalendar value) {
            this.chqvaluedt = value;
        }

        /**
         * Gets the value of the chqamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHQAMT() {
            return chqamt;
        }

        /**
         * Sets the value of the chqamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHQAMT(BigDecimal value) {
            this.chqamt = value;
        }

        /**
         * Gets the value of the chqprocessorder property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHQPROCESSORDER() {
            return chqprocessorder;
        }

        /**
         * Sets the value of the chqprocessorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHQPROCESSORDER(BigDecimal value) {
            this.chqprocessorder = value;
        }

        /**
         * Gets the value of the lvlcompexpdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLVLCOMPEXPDT() {
            return lvlcompexpdt;
        }

        /**
         * Sets the value of the lvlcompexpdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLVLCOMPEXPDT(XMLGregorianCalendar value) {
            this.lvlcompexpdt = value;
        }

        /**
         * Gets the value of the branchcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRANCHCODE() {
            return branchcode;
        }

        /**
         * Sets the value of the branchcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRANCHCODE(String value) {
            this.branchcode = value;
        }

        /**
         * Gets the value of the cgrefno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCGREFNO() {
            return cgrefno;
        }

        /**
         * Sets the value of the cgrefno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCGREFNO(String value) {
            this.cgrefno = value;
        }

        /**
         * Gets the value of the nsflvl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSFLVL() {
            return nsflvl;
        }

        /**
         * Sets the value of the nsflvl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSFLVL(String value) {
            this.nsflvl = value;
        }

        /**
         * Gets the value of the lvleffdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLVLEFFDT() {
            return lvleffdt;
        }

        /**
         * Sets the value of the lvleffdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLVLEFFDT(XMLGregorianCalendar value) {
            this.lvleffdt = value;
        }

        /**
         * Gets the value of the lvlexpdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLVLEXPDT() {
            return lvlexpdt;
        }

        /**
         * Sets the value of the lvlexpdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLVLEXPDT(XMLGregorianCalendar value) {
            this.lvlexpdt = value;
        }

        /**
         * Gets the value of the customerno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNO() {
            return customerno;
        }

        /**
         * Sets the value of the customerno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNO(String value) {
            this.customerno = value;
        }

        /**
         * Gets the value of the accountno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTNO() {
            return accountno;
        }

        /**
         * Sets the value of the accountno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTNO(String value) {
            this.accountno = value;
        }

        /**
         * Gets the value of the chqno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHQNO() {
            return chqno;
        }

        /**
         * Sets the value of the chqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHQNO(String value) {
            this.chqno = value;
        }

        /**
         * Gets the value of the chqsameseqno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHQSAMESEQNO() {
            return chqsameseqno;
        }

        /**
         * Sets the value of the chqsameseqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHQSAMESEQNO(BigDecimal value) {
            this.chqsameseqno = value;
        }

        /**
         * Gets the value of the eventno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEVENTNO() {
            return eventno;
        }

        /**
         * Sets the value of the eventno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEVENTNO(BigDecimal value) {
            this.eventno = value;
        }

    }

}
