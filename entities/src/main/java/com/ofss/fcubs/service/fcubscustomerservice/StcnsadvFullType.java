
package com.ofss.fcubs.service.fcubscustomerservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stcnsadv-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stcnsadv-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cus-Adv" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="NSF_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NSF_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CB_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADV_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EVENT_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="FROM_NSF_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Stcnsadv-Full-Type", propOrder = {
    "custno",
    "cname",
    "cusAdv"
})
public class StcnsadvFullType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "CNAME")
    protected String cname;
    @XmlElement(name = "Cus-Adv")
    protected List<StcnsadvFullType.CusAdv> cusAdv;

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
     * Gets the value of the cusAdv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cusAdv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCusAdv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StcnsadvFullType.CusAdv }
     * 
     * 
     */
    public List<StcnsadvFullType.CusAdv> getCusAdv() {
        if (cusAdv == null) {
            cusAdv = new ArrayList<StcnsadvFullType.CusAdv>();
        }
        return this.cusAdv;
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
     *         &lt;element name="SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="NSF_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NSF_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CB_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADV_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EVENT_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="FROM_NSF_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "seqno",
        "nsftype",
        "nsflvl",
        "cbstatus",
        "advformat",
        "dcn",
        "eventno",
        "fromnsflvl"
    })
    public static class CusAdv {

        @XmlElement(name = "SEQ_NO")
        protected BigDecimal seqno;
        @XmlElement(name = "NSF_TYPE")
        protected String nsftype;
        @XmlElement(name = "NSF_LVL")
        protected String nsflvl;
        @XmlElement(name = "CB_STATUS")
        protected String cbstatus;
        @XmlElement(name = "ADV_FORMAT")
        protected String advformat;
        @XmlElement(name = "DCN")
        protected String dcn;
        @XmlElement(name = "EVENT_NO")
        protected BigDecimal eventno;
        @XmlElement(name = "FROM_NSF_LVL")
        protected String fromnsflvl;

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
         * Gets the value of the nsftype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSFTYPE() {
            return nsftype;
        }

        /**
         * Sets the value of the nsftype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSFTYPE(String value) {
            this.nsftype = value;
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
         * Gets the value of the cbstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBSTATUS() {
            return cbstatus;
        }

        /**
         * Sets the value of the cbstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBSTATUS(String value) {
            this.cbstatus = value;
        }

        /**
         * Gets the value of the advformat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADVFORMAT() {
            return advformat;
        }

        /**
         * Sets the value of the advformat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADVFORMAT(String value) {
            this.advformat = value;
        }

        /**
         * Gets the value of the dcn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCN() {
            return dcn;
        }

        /**
         * Sets the value of the dcn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCN(String value) {
            this.dcn = value;
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

        /**
         * Gets the value of the fromnsflvl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFROMNSFLVL() {
            return fromnsflvl;
        }

        /**
         * Sets the value of the fromnsflvl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFROMNSFLVL(String value) {
            this.fromnsflvl = value;
        }

    }

}
