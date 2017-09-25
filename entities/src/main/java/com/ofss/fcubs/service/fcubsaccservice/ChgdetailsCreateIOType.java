
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chgdetails-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chgdetails-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Chgdetails" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHGPROD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Chgslabs" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Chgdetails-Create-IO-Type", propOrder = {
    "brn",
    "acc",
    "chgdetails"
})
public class ChgdetailsCreateIOType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "Chgdetails")
    protected List<ChgdetailsCreateIOType.Chgdetails> chgdetails;

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
     * Gets the value of the chgdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chgdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChgdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChgdetailsCreateIOType.Chgdetails }
     * 
     * 
     */
    public List<ChgdetailsCreateIOType.Chgdetails> getChgdetails() {
        if (chgdetails == null) {
            chgdetails = new ArrayList<ChgdetailsCreateIOType.Chgdetails>();
        }
        return this.chgdetails;
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
     *         &lt;element name="CHGPROD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Chgslabs" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "chgprod",
        "waiveprod",
        "prodmapstat",
        "minamt",
        "maxamt",
        "freetxn",
        "brn",
        "acc",
        "chgslabs"
    })
    public static class Chgdetails {

        @XmlElement(name = "CHGPROD", required = true)
        protected String chgprod;
        @XmlElement(name = "WAIVEPROD")
        protected String waiveprod;
        @XmlElement(name = "PRODMAPSTAT")
        protected String prodmapstat;
        @XmlElement(name = "MINAMT")
        protected BigDecimal minamt;
        @XmlElement(name = "MAXAMT")
        protected BigDecimal maxamt;
        @XmlElement(name = "FREETXN")
        protected BigDecimal freetxn;
        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "Chgslabs")
        protected List<ChgdetailsCreateIOType.Chgdetails.Chgslabs> chgslabs;

        /**
         * Gets the value of the chgprod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGPROD() {
            return chgprod;
        }

        /**
         * Sets the value of the chgprod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGPROD(String value) {
            this.chgprod = value;
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
         * Gets the value of the minamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINAMT() {
            return minamt;
        }

        /**
         * Sets the value of the minamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINAMT(BigDecimal value) {
            this.minamt = value;
        }

        /**
         * Gets the value of the maxamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMAXAMT() {
            return maxamt;
        }

        /**
         * Sets the value of the maxamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMAXAMT(BigDecimal value) {
            this.maxamt = value;
        }

        /**
         * Gets the value of the freetxn property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFREETXN() {
            return freetxn;
        }

        /**
         * Sets the value of the freetxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFREETXN(BigDecimal value) {
            this.freetxn = value;
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
         * Gets the value of the chgslabs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chgslabs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChgslabs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChgdetailsCreateIOType.Chgdetails.Chgslabs }
         * 
         * 
         */
        public List<ChgdetailsCreateIOType.Chgdetails.Chgslabs> getChgslabs() {
            if (chgslabs == null) {
                chgslabs = new ArrayList<ChgdetailsCreateIOType.Chgdetails.Chgslabs>();
            }
            return this.chgslabs;
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
         *         &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "slabamt",
            "chgamt",
            "chgrate",
            "brn",
            "acc",
            "prd"
        })
        public static class Chgslabs {

            @XmlElement(name = "SLABAMT", required = true)
            protected BigDecimal slabamt;
            @XmlElement(name = "CHGAMT")
            protected BigDecimal chgamt;
            @XmlElement(name = "CHGRATE")
            protected BigDecimal chgrate;
            @XmlElement(name = "BRN")
            protected String brn;
            @XmlElement(name = "ACC")
            protected String acc;
            @XmlElement(name = "PRD")
            protected String prd;

            /**
             * Gets the value of the slabamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSLABAMT() {
                return slabamt;
            }

            /**
             * Sets the value of the slabamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSLABAMT(BigDecimal value) {
                this.slabamt = value;
            }

            /**
             * Gets the value of the chgamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCHGAMT() {
                return chgamt;
            }

            /**
             * Sets the value of the chgamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCHGAMT(BigDecimal value) {
                this.chgamt = value;
            }

            /**
             * Gets the value of the chgrate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCHGRATE() {
                return chgrate;
            }

            /**
             * Sets the value of the chgrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCHGRATE(BigDecimal value) {
                this.chgrate = value;
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
             * Gets the value of the prd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRD() {
                return prd;
            }

            /**
             * Sets the value of the prd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRD(String value) {
                this.prd = value;
            }

        }

    }

}
