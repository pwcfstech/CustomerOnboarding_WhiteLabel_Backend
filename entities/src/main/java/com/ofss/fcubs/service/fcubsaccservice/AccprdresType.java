
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccprdresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccprdresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRTTXN" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="CRTXN" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccprdresType", propOrder = {
    "prd",
    "prddesc",
    "drttxn",
    "crtxn"
})
public class AccprdresType {

    @XmlElement(name = "PRD", required = true)
    protected String prd;
    @XmlElement(name = "PRDDESC")
    protected String prddesc;
    @XmlElement(name = "DRTTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType drttxn;
    @XmlElement(name = "CRTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType crtxn;

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
     * Gets the value of the drttxn property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDRTTXN() {
        return drttxn;
    }

    /**
     * Sets the value of the drttxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDRTTXN(YesNoType value) {
        this.drttxn = value;
    }

    /**
     * Gets the value of the crtxn property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getCRTXN() {
        return crtxn;
    }

    /**
     * Sets the value of the crtxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setCRTXN(YesNoType value) {
        this.crtxn = value;
    }

}
