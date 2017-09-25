
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stcnsadv-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stcnsadv-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cus-Adv" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NSF_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Stcnsadv-Create-IO-Type", propOrder = {
    "custno",
    "cusAdv"
})
public class StcnsadvCreateIOType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "Cus-Adv")
    protected List<StcnsadvCreateIOType.CusAdv> cusAdv;

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
     * {@link StcnsadvCreateIOType.CusAdv }
     * 
     * 
     */
    public List<StcnsadvCreateIOType.CusAdv> getCusAdv() {
        if (cusAdv == null) {
            cusAdv = new ArrayList<StcnsadvCreateIOType.CusAdv>();
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
     *         &lt;element name="NSF_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "nsflvl"
    })
    public static class CusAdv {

        @XmlElement(name = "NSF_LVL")
        protected String nsflvl;

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

    }

}
