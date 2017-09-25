
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
 * <p>Java class for Stcnsck-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stcnsck-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSFIB_CS_LAST_TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Cust-Ck-Det" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHQ_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LVL_EFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "Stcnsck-Create-IO-Type", propOrder = {
    "customerno",
    "nsfibcslasttrndt",
    "custCkDet"
})
public class StcnsckCreateIOType {

    @XmlElement(name = "CUSTOMER_NO")
    protected String customerno;
    @XmlElement(name = "NSFIB_CS_LAST_TRN_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nsfibcslasttrndt;
    @XmlElement(name = "Cust-Ck-Det")
    protected List<StcnsckCreateIOType.CustCkDet> custCkDet;

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
     * Gets the value of the nsfibcslasttrndt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNSFIBCSLASTTRNDT() {
        return nsfibcslasttrndt;
    }

    /**
     * Sets the value of the nsfibcslasttrndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNSFIBCSLASTTRNDT(XMLGregorianCalendar value) {
        this.nsfibcslasttrndt = value;
    }

    /**
     * Gets the value of the custCkDet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custCkDet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustCkDet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StcnsckCreateIOType.CustCkDet }
     * 
     * 
     */
    public List<StcnsckCreateIOType.CustCkDet> getCustCkDet() {
        if (custCkDet == null) {
            custCkDet = new ArrayList<StcnsckCreateIOType.CustCkDet>();
        }
        return this.custCkDet;
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
     *         &lt;element name="CHQ_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LVL_EFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "chqamt",
        "customerno",
        "lvleffdt"
    })
    public static class CustCkDet {

        @XmlElement(name = "CHQ_AMT")
        protected BigDecimal chqamt;
        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "LVL_EFFDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lvleffdt;

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

    }

}
