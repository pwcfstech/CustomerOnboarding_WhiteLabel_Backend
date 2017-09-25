
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthBICDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthBICDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BICCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BICDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthBICDetailsType", propOrder = {
    "biccode",
    "bicdesc"
})
public class AuthBICDetailsType {

    @XmlElement(name = "BICCODE", required = true)
    protected String biccode;
    @XmlElement(name = "BICDESC")
    protected String bicdesc;

    /**
     * Gets the value of the biccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICCODE() {
        return biccode;
    }

    /**
     * Sets the value of the biccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICCODE(String value) {
        this.biccode = value;
    }

    /**
     * Gets the value of the bicdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICDESC() {
        return bicdesc;
    }

    /**
     * Sets the value of the bicdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICDESC(String value) {
        this.bicdesc = value;
    }

}
