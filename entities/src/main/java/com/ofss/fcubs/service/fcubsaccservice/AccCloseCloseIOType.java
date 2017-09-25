
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccClose-Close-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccClose-Close-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cust-Account-Closure" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CLSSN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CLSDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CLSBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CLSMOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LINKPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OFFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSPRINSTANARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSBENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSPAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSTAUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSEXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="INSISUBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSULTBF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSULTBF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSULTBF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSULTBF4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDETAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDTLTYP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDETAIL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDTLTYP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDETAIL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDTLTYP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDETAIL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDTLTYP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDETAIL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDTLTYP5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDETAIL6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSOTHDTLTYP6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NBINTERESTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AccClose-Close-IO-Type", propOrder = {
    "brn",
    "acc",
    "custAccountClosure"
})
public class AccCloseCloseIOType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "Cust-Account-Closure")
    protected AccCloseCloseIOType.CustAccountClosure custAccountClosure;

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
     * Gets the value of the custAccountClosure property.
     * 
     * @return
     *     possible object is
     *     {@link AccCloseCloseIOType.CustAccountClosure }
     *     
     */
    public AccCloseCloseIOType.CustAccountClosure getCustAccountClosure() {
        return custAccountClosure;
    }

    /**
     * Sets the value of the custAccountClosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccCloseCloseIOType.CustAccountClosure }
     *     
     */
    public void setCustAccountClosure(AccCloseCloseIOType.CustAccountClosure value) {
        this.custAccountClosure = value;
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
     *         &lt;element name="CLSSN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CLSDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CLSBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CLSMOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LINKPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OFFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSPRINSTANARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSBENFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSPAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSTAUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSEXPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="INSISUBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSULTBF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSULTBF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSULTBF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSULTBF4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDETAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDTLTYP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDETAIL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDTLTYP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDETAIL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDTLTYP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDETAIL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDTLTYP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDETAIL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDTLTYP5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDETAIL6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSOTHDTLTYP6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NBINTERESTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "clssn",
        "clsdt",
        "clsbal",
        "clsmod",
        "linkprd",
        "offbrn",
        "offacc",
        "offccy",
        "insno",
        "insprinstanary",
        "insbenfname",
        "inspaybrn",
        "instaus",
        "insexpdt",
        "insisubank",
        "insttype",
        "insultbf1",
        "insultbf2",
        "insultbf3",
        "insultbf4",
        "insothdetail1",
        "insothdtltyp1",
        "insothdetail2",
        "insothdtltyp2",
        "insothdetail3",
        "insothdtltyp3",
        "insothdetail4",
        "insothdtltyp4",
        "insothdetail5",
        "insothdtltyp5",
        "insothdetail6",
        "insothdtltyp6",
        "nbinterestdue"
    })
    public static class CustAccountClosure {

        @XmlElement(name = "CLSSN")
        protected BigDecimal clssn;
        @XmlElement(name = "CLSDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar clsdt;
        @XmlElement(name = "CLSBAL")
        protected BigDecimal clsbal;
        @XmlElement(name = "CLSMOD")
        protected String clsmod;
        @XmlElement(name = "LINKPRD")
        protected String linkprd;
        @XmlElement(name = "OFFBRN")
        protected String offbrn;
        @XmlElement(name = "OFFACC")
        protected String offacc;
        @XmlElement(name = "OFFCCY")
        protected String offccy;
        @XmlElement(name = "INSNO")
        protected String insno;
        @XmlElement(name = "INSPRINSTANARY")
        protected String insprinstanary;
        @XmlElement(name = "INSBENFNAME")
        protected String insbenfname;
        @XmlElement(name = "INSPAYBRN")
        protected String inspaybrn;
        @XmlElement(name = "INSTAUS")
        protected String instaus;
        @XmlElement(name = "INSEXPDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar insexpdt;
        @XmlElement(name = "INSISUBANK")
        protected String insisubank;
        @XmlElement(name = "INSTTYPE")
        protected String insttype;
        @XmlElement(name = "INSULTBF1")
        protected String insultbf1;
        @XmlElement(name = "INSULTBF2")
        protected String insultbf2;
        @XmlElement(name = "INSULTBF3")
        protected String insultbf3;
        @XmlElement(name = "INSULTBF4")
        protected String insultbf4;
        @XmlElement(name = "INSOTHDETAIL1")
        protected String insothdetail1;
        @XmlElement(name = "INSOTHDTLTYP1")
        protected String insothdtltyp1;
        @XmlElement(name = "INSOTHDETAIL2")
        protected String insothdetail2;
        @XmlElement(name = "INSOTHDTLTYP2")
        protected String insothdtltyp2;
        @XmlElement(name = "INSOTHDETAIL3")
        protected String insothdetail3;
        @XmlElement(name = "INSOTHDTLTYP3")
        protected String insothdtltyp3;
        @XmlElement(name = "INSOTHDETAIL4")
        protected String insothdetail4;
        @XmlElement(name = "INSOTHDTLTYP4")
        protected String insothdtltyp4;
        @XmlElement(name = "INSOTHDETAIL5")
        protected String insothdetail5;
        @XmlElement(name = "INSOTHDTLTYP5")
        protected String insothdtltyp5;
        @XmlElement(name = "INSOTHDETAIL6")
        protected String insothdetail6;
        @XmlElement(name = "INSOTHDTLTYP6")
        protected String insothdtltyp6;
        @XmlElement(name = "NBINTERESTDUE")
        protected String nbinterestdue;

        /**
         * Gets the value of the clssn property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCLSSN() {
            return clssn;
        }

        /**
         * Sets the value of the clssn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCLSSN(BigDecimal value) {
            this.clssn = value;
        }

        /**
         * Gets the value of the clsdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCLSDT() {
            return clsdt;
        }

        /**
         * Sets the value of the clsdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCLSDT(XMLGregorianCalendar value) {
            this.clsdt = value;
        }

        /**
         * Gets the value of the clsbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCLSBAL() {
            return clsbal;
        }

        /**
         * Sets the value of the clsbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCLSBAL(BigDecimal value) {
            this.clsbal = value;
        }

        /**
         * Gets the value of the clsmod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLSMOD() {
            return clsmod;
        }

        /**
         * Sets the value of the clsmod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLSMOD(String value) {
            this.clsmod = value;
        }

        /**
         * Gets the value of the linkprd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKPRD() {
            return linkprd;
        }

        /**
         * Sets the value of the linkprd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKPRD(String value) {
            this.linkprd = value;
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
         * Gets the value of the offccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFCCY() {
            return offccy;
        }

        /**
         * Sets the value of the offccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFCCY(String value) {
            this.offccy = value;
        }

        /**
         * Gets the value of the insno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSNO() {
            return insno;
        }

        /**
         * Sets the value of the insno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSNO(String value) {
            this.insno = value;
        }

        /**
         * Gets the value of the insprinstanary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSPRINSTANARY() {
            return insprinstanary;
        }

        /**
         * Sets the value of the insprinstanary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSPRINSTANARY(String value) {
            this.insprinstanary = value;
        }

        /**
         * Gets the value of the insbenfname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSBENFNAME() {
            return insbenfname;
        }

        /**
         * Sets the value of the insbenfname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSBENFNAME(String value) {
            this.insbenfname = value;
        }

        /**
         * Gets the value of the inspaybrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSPAYBRN() {
            return inspaybrn;
        }

        /**
         * Sets the value of the inspaybrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSPAYBRN(String value) {
            this.inspaybrn = value;
        }

        /**
         * Gets the value of the instaus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTAUS() {
            return instaus;
        }

        /**
         * Sets the value of the instaus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTAUS(String value) {
            this.instaus = value;
        }

        /**
         * Gets the value of the insexpdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getINSEXPDT() {
            return insexpdt;
        }

        /**
         * Sets the value of the insexpdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setINSEXPDT(XMLGregorianCalendar value) {
            this.insexpdt = value;
        }

        /**
         * Gets the value of the insisubank property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSISUBANK() {
            return insisubank;
        }

        /**
         * Sets the value of the insisubank property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSISUBANK(String value) {
            this.insisubank = value;
        }

        /**
         * Gets the value of the insttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTTYPE() {
            return insttype;
        }

        /**
         * Sets the value of the insttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTTYPE(String value) {
            this.insttype = value;
        }

        /**
         * Gets the value of the insultbf1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSULTBF1() {
            return insultbf1;
        }

        /**
         * Sets the value of the insultbf1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSULTBF1(String value) {
            this.insultbf1 = value;
        }

        /**
         * Gets the value of the insultbf2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSULTBF2() {
            return insultbf2;
        }

        /**
         * Sets the value of the insultbf2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSULTBF2(String value) {
            this.insultbf2 = value;
        }

        /**
         * Gets the value of the insultbf3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSULTBF3() {
            return insultbf3;
        }

        /**
         * Sets the value of the insultbf3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSULTBF3(String value) {
            this.insultbf3 = value;
        }

        /**
         * Gets the value of the insultbf4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSULTBF4() {
            return insultbf4;
        }

        /**
         * Sets the value of the insultbf4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSULTBF4(String value) {
            this.insultbf4 = value;
        }

        /**
         * Gets the value of the insothdetail1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDETAIL1() {
            return insothdetail1;
        }

        /**
         * Sets the value of the insothdetail1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDETAIL1(String value) {
            this.insothdetail1 = value;
        }

        /**
         * Gets the value of the insothdtltyp1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDTLTYP1() {
            return insothdtltyp1;
        }

        /**
         * Sets the value of the insothdtltyp1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDTLTYP1(String value) {
            this.insothdtltyp1 = value;
        }

        /**
         * Gets the value of the insothdetail2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDETAIL2() {
            return insothdetail2;
        }

        /**
         * Sets the value of the insothdetail2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDETAIL2(String value) {
            this.insothdetail2 = value;
        }

        /**
         * Gets the value of the insothdtltyp2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDTLTYP2() {
            return insothdtltyp2;
        }

        /**
         * Sets the value of the insothdtltyp2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDTLTYP2(String value) {
            this.insothdtltyp2 = value;
        }

        /**
         * Gets the value of the insothdetail3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDETAIL3() {
            return insothdetail3;
        }

        /**
         * Sets the value of the insothdetail3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDETAIL3(String value) {
            this.insothdetail3 = value;
        }

        /**
         * Gets the value of the insothdtltyp3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDTLTYP3() {
            return insothdtltyp3;
        }

        /**
         * Sets the value of the insothdtltyp3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDTLTYP3(String value) {
            this.insothdtltyp3 = value;
        }

        /**
         * Gets the value of the insothdetail4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDETAIL4() {
            return insothdetail4;
        }

        /**
         * Sets the value of the insothdetail4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDETAIL4(String value) {
            this.insothdetail4 = value;
        }

        /**
         * Gets the value of the insothdtltyp4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDTLTYP4() {
            return insothdtltyp4;
        }

        /**
         * Sets the value of the insothdtltyp4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDTLTYP4(String value) {
            this.insothdtltyp4 = value;
        }

        /**
         * Gets the value of the insothdetail5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDETAIL5() {
            return insothdetail5;
        }

        /**
         * Sets the value of the insothdetail5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDETAIL5(String value) {
            this.insothdetail5 = value;
        }

        /**
         * Gets the value of the insothdtltyp5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDTLTYP5() {
            return insothdtltyp5;
        }

        /**
         * Sets the value of the insothdtltyp5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDTLTYP5(String value) {
            this.insothdtltyp5 = value;
        }

        /**
         * Gets the value of the insothdetail6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDETAIL6() {
            return insothdetail6;
        }

        /**
         * Sets the value of the insothdetail6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDETAIL6(String value) {
            this.insothdetail6 = value;
        }

        /**
         * Gets the value of the insothdtltyp6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSOTHDTLTYP6() {
            return insothdtltyp6;
        }

        /**
         * Sets the value of the insothdtltyp6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSOTHDTLTYP6(String value) {
            this.insothdtltyp6 = value;
        }

        /**
         * Gets the value of the nbinterestdue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNBINTERESTDUE() {
            return nbinterestdue;
        }

        /**
         * Sets the value of the nbinterestdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNBINTERESTDUE(String value) {
            this.nbinterestdue = value;
        }

    }

}
