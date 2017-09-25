
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChgDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChgDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHGPROD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WAIVEPROD" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType"/>
 *         &lt;element name="PRODMAPSTAT" type="{http://fcubs.ofss.com/service/FCUBSAccService}RecStatType"/>
 *         &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Chgslabs" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "ChgDetailsType", propOrder = {
    "chgprod",
    "waiveprod",
    "prodmapstat",
    "minamt",
    "maxamt",
    "freetxn",
    "prddesc",
    "chgccy",
    "chgslabs"
})
public class ChgDetailsType {

    @XmlElement(name = "CHGPROD", required = true)
    protected String chgprod;
    @XmlElement(name = "WAIVEPROD", required = true)
    @XmlSchemaType(name = "string")
    protected YesNoType waiveprod;
    @XmlElement(name = "PRODMAPSTAT", required = true)
    @XmlSchemaType(name = "string")
    protected RecStatType prodmapstat;
    @XmlElement(name = "MINAMT", required = true)
    protected BigDecimal minamt;
    @XmlElement(name = "MAXAMT", required = true)
    protected BigDecimal maxamt;
    @XmlElement(name = "FREETXN", required = true)
    protected BigInteger freetxn;
    @XmlElement(name = "PRDDESC")
    protected String prddesc;
    @XmlElement(name = "CHGCCY")
    protected String chgccy;
    @XmlElement(name = "Chgslabs")
    protected List<ChgDetailsType.Chgslabs> chgslabs;

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
     *     {@link YesNoType }
     *     
     */
    public YesNoType getWAIVEPROD() {
        return waiveprod;
    }

    /**
     * Sets the value of the waiveprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setWAIVEPROD(YesNoType value) {
        this.waiveprod = value;
    }

    /**
     * Gets the value of the prodmapstat property.
     * 
     * @return
     *     possible object is
     *     {@link RecStatType }
     *     
     */
    public RecStatType getPRODMAPSTAT() {
        return prodmapstat;
    }

    /**
     * Sets the value of the prodmapstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecStatType }
     *     
     */
    public void setPRODMAPSTAT(RecStatType value) {
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFREETXN() {
        return freetxn;
    }

    /**
     * Sets the value of the freetxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFREETXN(BigInteger value) {
        this.freetxn = value;
    }

    /**
     * Gets the value of the prddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDDESC() {
        return prddesc;
    }

    /**
     * Sets the value of the prddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDDESC(String value) {
        this.prddesc = value;
    }

    /**
     * Gets the value of the chgccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGCCY() {
        return chgccy;
    }

    /**
     * Sets the value of the chgccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGCCY(String value) {
        this.chgccy = value;
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
     * {@link ChgDetailsType.Chgslabs }
     * 
     * 
     */
    public List<ChgDetailsType.Chgslabs> getChgslabs() {
        if (chgslabs == null) {
            chgslabs = new ArrayList<ChgDetailsType.Chgslabs>();
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
     *         &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "chgrate"
    })
    public static class Chgslabs {

        @XmlElement(name = "SLABAMT", required = true)
        protected Object slabamt;
        @XmlElement(name = "CHGAMT")
        protected Object chgamt;
        @XmlElement(name = "CHGRATE")
        protected BigDecimal chgrate;

        /**
         * Gets the value of the slabamt property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSLABAMT() {
            return slabamt;
        }

        /**
         * Sets the value of the slabamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSLABAMT(Object value) {
            this.slabamt = value;
        }

        /**
         * Gets the value of the chgamt property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCHGAMT() {
            return chgamt;
        }

        /**
         * Sets the value of the chgamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCHGAMT(Object value) {
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

    }

}
