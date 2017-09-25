
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Autodepdetails-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Autodepdetails-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Autodepdetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="SWPAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DEPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="SWPTOAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MINREQDBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="SWPMULTIOF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="RETRYTILLDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="SWPTOACBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "Autodepdetails-Create-IO-Type", propOrder = {
    "brn",
    "acc",
    "autodepdetails"
})
public class AutodepdetailsCreateIOType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC", required = true)
    protected String acc;
    @XmlElement(name = "Autodepdetails")
    protected AutodepdetailsCreateIOType.Autodepdetails autodepdetails;

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
     * Gets the value of the autodepdetails property.
     * 
     * @return
     *     possible object is
     *     {@link AutodepdetailsCreateIOType.Autodepdetails }
     *     
     */
    public AutodepdetailsCreateIOType.Autodepdetails getAutodepdetails() {
        return autodepdetails;
    }

    /**
     * Sets the value of the autodepdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutodepdetailsCreateIOType.Autodepdetails }
     *     
     */
    public void setAutodepdetails(AutodepdetailsCreateIOType.Autodepdetails value) {
        this.autodepdetails = value;
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
     *         &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="SWPAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DEPCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="SWPTOAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MINREQDBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="SWPMULTIOF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="RETRYTILLDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="SWPTOACBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "tenor",
        "swpamount",
        "depccy",
        "seqno",
        "swptoac",
        "scode",
        "xref",
        "minreqdbal",
        "swpmultiof",
        "retrytilldt",
        "swptoacbrn",
        "startdt"
    })
    public static class Autodepdetails {

        @XmlElement(name = "TENOR")
        protected BigDecimal tenor;
        @XmlElement(name = "SWPAMOUNT")
        protected BigDecimal swpamount;
        @XmlElement(name = "DEPCCY")
        protected String depccy;
        @XmlElement(name = "SEQNO")
        protected BigDecimal seqno;
        @XmlElement(name = "SWPTOAC")
        protected String swptoac;
        @XmlElement(name = "SCODE")
        protected String scode;
        @XmlElement(name = "XREF")
        protected String xref;
        @XmlElement(name = "MINREQDBAL")
        protected BigDecimal minreqdbal;
        @XmlElement(name = "SWPMULTIOF")
        protected BigDecimal swpmultiof;
        @XmlElement(name = "RETRYTILLDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar retrytilldt;
        @XmlElement(name = "SWPTOACBRN")
        protected String swptoacbrn;
        @XmlElement(name = "STARTDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startdt;

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
         * Gets the value of the swpamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSWPAMOUNT() {
            return swpamount;
        }

        /**
         * Sets the value of the swpamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSWPAMOUNT(BigDecimal value) {
            this.swpamount = value;
        }

        /**
         * Gets the value of the depccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPCCY() {
            return depccy;
        }

        /**
         * Sets the value of the depccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPCCY(String value) {
            this.depccy = value;
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

        /**
         * Gets the value of the swptoac property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSWPTOAC() {
            return swptoac;
        }

        /**
         * Sets the value of the swptoac property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSWPTOAC(String value) {
            this.swptoac = value;
        }

        /**
         * Gets the value of the scode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCODE() {
            return scode;
        }

        /**
         * Sets the value of the scode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCODE(String value) {
            this.scode = value;
        }

        /**
         * Gets the value of the xref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXREF() {
            return xref;
        }

        /**
         * Sets the value of the xref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXREF(String value) {
            this.xref = value;
        }

        /**
         * Gets the value of the minreqdbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINREQDBAL() {
            return minreqdbal;
        }

        /**
         * Sets the value of the minreqdbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINREQDBAL(BigDecimal value) {
            this.minreqdbal = value;
        }

        /**
         * Gets the value of the swpmultiof property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSWPMULTIOF() {
            return swpmultiof;
        }

        /**
         * Sets the value of the swpmultiof property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSWPMULTIOF(BigDecimal value) {
            this.swpmultiof = value;
        }

        /**
         * Gets the value of the retrytilldt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRETRYTILLDT() {
            return retrytilldt;
        }

        /**
         * Sets the value of the retrytilldt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRETRYTILLDT(XMLGregorianCalendar value) {
            this.retrytilldt = value;
        }

        /**
         * Gets the value of the swptoacbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSWPTOACBRN() {
            return swptoacbrn;
        }

        /**
         * Sets the value of the swptoacbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSWPTOACBRN(String value) {
            this.swptoacbrn = value;
        }

        /**
         * Gets the value of the startdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTARTDT() {
            return startdt;
        }

        /**
         * Sets the value of the startdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTARTDT(XMLGregorianCalendar value) {
            this.startdt = value;
        }

    }

}
