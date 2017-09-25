
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINKEDENTITYType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINKEDENTITYType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INHERIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINKEDENTITYType", propOrder = {
    "descp",
    "customer",
    "relationship",
    "inherit"
})
public class LINKEDENTITYType {

    @XmlElement(name = "DESCP", required = true)
    protected String descp;
    @XmlElement(name = "CUSTOMER", required = true)
    protected String customer;
    @XmlElement(name = "RELATIONSHIP", required = true)
    protected String relationship;
    @XmlElement(name = "INHERIT")
    protected String inherit;

    /**
     * Gets the value of the descp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCP() {
        return descp;
    }

    /**
     * Sets the value of the descp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCP(String value) {
        this.descp = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMER() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMER(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELATIONSHIP() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELATIONSHIP(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the inherit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINHERIT() {
        return inherit;
    }

    /**
     * Sets the value of the inherit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINHERIT(String value) {
        this.inherit = value;
    }

}
