
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Csconchg-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Csconchg-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charge-Details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Csconchg-Create-IO-Type", propOrder = {
    "referenceno",
    "chargeDetails"
})
public class CsconchgCreateIOType {

    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "Charge-Details")
    protected List<CsconchgCreateIOType.ChargeDetails> chargeDetails;

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the chargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CsconchgCreateIOType.ChargeDetails }
     * 
     * 
     */
    public List<CsconchgCreateIOType.ChargeDetails> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<CsconchgCreateIOType.ChargeDetails>();
        }
        return this.chargeDetails;
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
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "amount",
        "waiver",
        "adesc"
    })
    public static class ChargeDetails {

        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "WAIVER")
        protected String waiver;
        @XmlElement(name = "ADESC")
        protected String adesc;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the waiver property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAIVER() {
            return waiver;
        }

        /**
         * Sets the value of the waiver property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAIVER(String value) {
            this.waiver = value;
        }

        /**
         * Gets the value of the adesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADESC() {
            return adesc;
        }

        /**
         * Sets the value of the adesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADESC(String value) {
            this.adesc = value;
        }

    }

}
