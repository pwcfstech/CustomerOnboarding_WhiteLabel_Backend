
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
 * <p>Java class for TdRollHistory-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdRollHistory-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Td-Rolloverhistory" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OLD_MAT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="NEW_MAT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ROLLOVER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ACC_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ROLLOVER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INTEREST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ROLLOVER_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "TdRollHistory-Full-Type", propOrder = {
    "branchcode",
    "custacno",
    "tdRolloverhistory"
})
public class TdRollHistoryFullType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "Td-Rolloverhistory")
    protected List<TdRollHistoryFullType.TdRolloverhistory> tdRolloverhistory;

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
     * Gets the value of the custacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTACNO() {
        return custacno;
    }

    /**
     * Sets the value of the custacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTACNO(String value) {
        this.custacno = value;
    }

    /**
     * Gets the value of the tdRolloverhistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdRolloverhistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTdRolloverhistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TdRollHistoryFullType.TdRolloverhistory }
     * 
     * 
     */
    public List<TdRollHistoryFullType.TdRolloverhistory> getTdRolloverhistory() {
        if (tdRolloverhistory == null) {
            tdRolloverhistory = new ArrayList<TdRollHistoryFullType.TdRolloverhistory>();
        }
        return this.tdRolloverhistory;
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
     *         &lt;element name="OLD_MAT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="NEW_MAT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ROLLOVER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ACC_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ROLLOVER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INTEREST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ROLLOVER_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "oldmatdate",
        "newmatdate",
        "rolloverdate",
        "accstatus",
        "rollovertype",
        "interest",
        "principal",
        "rolloveramt",
        "seqno"
    })
    public static class TdRolloverhistory {

        @XmlElement(name = "OLD_MAT_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar oldmatdate;
        @XmlElement(name = "NEW_MAT_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar newmatdate;
        @XmlElement(name = "ROLLOVER_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar rolloverdate;
        @XmlElement(name = "ACC_STATUS")
        protected String accstatus;
        @XmlElement(name = "ROLLOVER_TYPE")
        protected String rollovertype;
        @XmlElement(name = "INTEREST")
        protected BigDecimal interest;
        @XmlElement(name = "PRINCIPAL")
        protected BigDecimal principal;
        @XmlElement(name = "ROLLOVER_AMT")
        protected BigDecimal rolloveramt;
        @XmlElement(name = "SEQNO")
        protected BigDecimal seqno;

        /**
         * Gets the value of the oldmatdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOLDMATDATE() {
            return oldmatdate;
        }

        /**
         * Sets the value of the oldmatdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOLDMATDATE(XMLGregorianCalendar value) {
            this.oldmatdate = value;
        }

        /**
         * Gets the value of the newmatdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNEWMATDATE() {
            return newmatdate;
        }

        /**
         * Sets the value of the newmatdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNEWMATDATE(XMLGregorianCalendar value) {
            this.newmatdate = value;
        }

        /**
         * Gets the value of the rolloverdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getROLLOVERDATE() {
            return rolloverdate;
        }

        /**
         * Sets the value of the rolloverdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setROLLOVERDATE(XMLGregorianCalendar value) {
            this.rolloverdate = value;
        }

        /**
         * Gets the value of the accstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCSTATUS() {
            return accstatus;
        }

        /**
         * Sets the value of the accstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCSTATUS(String value) {
            this.accstatus = value;
        }

        /**
         * Gets the value of the rollovertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROLLOVERTYPE() {
            return rollovertype;
        }

        /**
         * Sets the value of the rollovertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROLLOVERTYPE(String value) {
            this.rollovertype = value;
        }

        /**
         * Gets the value of the interest property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTEREST() {
            return interest;
        }

        /**
         * Sets the value of the interest property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTEREST(BigDecimal value) {
            this.interest = value;
        }

        /**
         * Gets the value of the principal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPRINCIPAL() {
            return principal;
        }

        /**
         * Sets the value of the principal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPRINCIPAL(BigDecimal value) {
            this.principal = value;
        }

        /**
         * Gets the value of the rolloveramt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getROLLOVERAMT() {
            return rolloveramt;
        }

        /**
         * Sets the value of the rolloveramt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setROLLOVERAMT(BigDecimal value) {
            this.rolloveramt = value;
        }

        /**
         * Gets the value of the seqno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSEQNO() {
            return seqno;
        }

        /**
         * Sets the value of the seqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSEQNO(BigDecimal value) {
            this.seqno = value;
        }

    }

}
