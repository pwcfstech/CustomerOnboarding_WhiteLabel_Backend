
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
 * <p>Java class for IntDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGSTARTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="INTSTMTREQ" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="Intprodmap" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ILPRODUCT" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *                   &lt;element name="DISPILTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Inteffdtmap" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Intsde" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RATEFLAG" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
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
@XmlType(name = "IntDetailsType", propOrder = {
    "calcacc",
    "bookacc",
    "hasis",
    "intstartdt",
    "bookaccbrn",
    "drcradv",
    "chgbookaccbrn",
    "chgbookacc",
    "chgstartdt",
    "intstmtreq",
    "intprodmap"
})
public class IntDetailsType {

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
    @XmlElement(name = "CHGBOOKACCBRN")
    protected String chgbookaccbrn;
    @XmlElement(name = "CHGBOOKACC")
    protected String chgbookacc;
    @XmlElement(name = "CHGSTARTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chgstartdt;
    @XmlElement(name = "INTSTMTREQ")
    @XmlSchemaType(name = "string")
    protected YesNoType intstmtreq;
    @XmlElement(name = "Intprodmap")
    protected List<IntDetailsType.Intprodmap> intprodmap;

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
     * Gets the value of the intstmtreq property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getINTSTMTREQ() {
        return intstmtreq;
    }

    /**
     * Sets the value of the intstmtreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setINTSTMTREQ(YesNoType value) {
        this.intstmtreq = value;
    }

    /**
     * Gets the value of the intprodmap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intprodmap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntprodmap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntDetailsType.Intprodmap }
     * 
     * 
     */
    public List<IntDetailsType.Intprodmap> getIntprodmap() {
        if (intprodmap == null) {
            intprodmap = new ArrayList<IntDetailsType.Intprodmap>();
        }
        return this.intprodmap;
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
     *         &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UDECCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ILPRODUCT" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
     *         &lt;element name="DISPILTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Inteffdtmap" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Intsde" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RATEFLAG" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
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
        "waiveprod",
        "genudechngadv",
        "intprod",
        "prodmapstat",
        "udeccy",
        "ilproduct",
        "dispiltype",
        "inteffdtmap"
    })
    public static class Intprodmap {

        @XmlElement(name = "WAIVEPROD")
        protected String waiveprod;
        @XmlElement(name = "GENUDECHNGADV")
        protected String genudechngadv;
        @XmlElement(name = "INTPROD")
        protected String intprod;
        @XmlElement(name = "PRODMAPSTAT")
        protected String prodmapstat;
        @XmlElement(name = "UDECCY")
        protected String udeccy;
        @XmlElement(name = "ILPRODUCT")
        @XmlSchemaType(name = "string")
        protected YesNoType ilproduct;
        @XmlElement(name = "DISPILTYPE")
        protected String dispiltype;
        @XmlElement(name = "Inteffdtmap")
        protected List<IntDetailsType.Intprodmap.Inteffdtmap> inteffdtmap;

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
         * Gets the value of the ilproduct property.
         * 
         * @return
         *     possible object is
         *     {@link YesNoType }
         *     
         */
        public YesNoType getILPRODUCT() {
            return ilproduct;
        }

        /**
         * Sets the value of the ilproduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link YesNoType }
         *     
         */
        public void setILPRODUCT(YesNoType value) {
            this.ilproduct = value;
        }

        /**
         * Gets the value of the dispiltype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISPILTYPE() {
            return dispiltype;
        }

        /**
         * Sets the value of the dispiltype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISPILTYPE(String value) {
            this.dispiltype = value;
        }

        /**
         * Gets the value of the inteffdtmap property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inteffdtmap property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInteffdtmap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntDetailsType.Intprodmap.Inteffdtmap }
         * 
         * 
         */
        public List<IntDetailsType.Intprodmap.Inteffdtmap> getInteffdtmap() {
            if (inteffdtmap == null) {
                inteffdtmap = new ArrayList<IntDetailsType.Intprodmap.Inteffdtmap>();
            }
            return this.inteffdtmap;
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
         *         &lt;element name="Intsde" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RATEFLAG" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
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
            "intsde"
        })
        public static class Inteffdtmap {

            @XmlElement(name = "UDEEFFDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar udeeffdt;
            @XmlElement(name = "EFFDTMAPSTAT")
            protected String effdtmapstat;
            @XmlElement(name = "Intsde")
            protected List<IntDetailsType.Intprodmap.Inteffdtmap.Intsde> intsde;

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
             * Gets the value of the intsde property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the intsde property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIntsde().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IntDetailsType.Intprodmap.Inteffdtmap.Intsde }
             * 
             * 
             */
            public List<IntDetailsType.Intprodmap.Inteffdtmap.Intsde> getIntsde() {
                if (intsde == null) {
                    intsde = new ArrayList<IntDetailsType.Intprodmap.Inteffdtmap.Intsde>();
                }
                return this.intsde;
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
             *         &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RATEFLAG" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
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
                "ratecode",
                "tdratecode",
                "rateflag"
            })
            public static class Intsde {

                @XmlElement(name = "UDEID")
                protected String udeid;
                @XmlElement(name = "UDEVALUE")
                protected BigDecimal udevalue;
                @XmlElement(name = "RATECODE")
                protected String ratecode;
                @XmlElement(name = "TDRATECODE")
                protected String tdratecode;
                @XmlElement(name = "RATEFLAG")
                @XmlSchemaType(name = "string")
                protected YesNoType rateflag;

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

                /**
                 * Gets the value of the tdratecode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTDRATECODE() {
                    return tdratecode;
                }

                /**
                 * Sets the value of the tdratecode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTDRATECODE(String value) {
                    this.tdratecode = value;
                }

                /**
                 * Gets the value of the rateflag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YesNoType }
                 *     
                 */
                public YesNoType getRATEFLAG() {
                    return rateflag;
                }

                /**
                 * Sets the value of the rateflag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YesNoType }
                 *     
                 */
                public void setRATEFLAG(YesNoType value) {
                    this.rateflag = value;
                }

            }

        }

    }

}
