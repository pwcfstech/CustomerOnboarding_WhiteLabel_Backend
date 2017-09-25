
package com.ofss.fcubs.service.fcubscustomerservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Custtext-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Custtext-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTTEXT" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Custtext-Modify-IO-Type", propOrder = {
    "custno",
    "custtext"
})
public class CusttextModifyIOType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "CUSTTEXT")
    protected List<CusttextModifyIOType.CUSTTEXT> custtext;

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
     * Gets the value of the custtext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custtext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUSTTEXT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CusttextModifyIOType.CUSTTEXT }
     * 
     * 
     */
    public List<CusttextModifyIOType.CUSTTEXT> getCUSTTEXT() {
        if (custtext == null) {
            custtext = new ArrayList<CusttextModifyIOType.CUSTTEXT>();
        }
        return this.custtext;
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
     *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "custno",
        "tdesc"
    })
    public static class CUSTTEXT {

        @XmlElement(name = "SEQNO")
        protected BigDecimal seqno;
        @XmlElement(name = "CUSTNO")
        protected String custno;
        @XmlElement(name = "TDESC")
        protected String tdesc;

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
         * Gets the value of the tdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTDESC() {
            return tdesc;
        }

        /**
         * Sets the value of the tdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTDESC(String value) {
            this.tdesc = value;
        }

    }

}
