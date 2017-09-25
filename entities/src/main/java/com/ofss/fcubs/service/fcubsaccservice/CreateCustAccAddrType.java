
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCustAccAddrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustAccAddrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTACCADDRESS" type="{http://fcubs.ofss.com/service/FCUBSAccService}AccAddrType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCustAccAddrType", propOrder = {
    "xref",
    "custacno",
    "brn",
    "custaccaddress"
})
public class CreateCustAccAddrType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "CUSTACNO")
    protected String custacno;
    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "CUSTACCADDRESS", required = true)
    protected AccAddrType custaccaddress;

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXREF() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXREF(String value) {
        this.xref = value;
    }

    /**
     * Gets the value of the custacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTACNO() {
        return custacno;
    }

    /**
     * Sets the value of the custacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTACNO(String value) {
        this.custacno = value;
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
     * Gets the value of the custaccaddress property.
     * 
     * @return
     *     possible object is
     *     {@link AccAddrType }
     *     
     */
    public AccAddrType getCUSTACCADDRESS() {
        return custaccaddress;
    }

    /**
     * Sets the value of the custaccaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccAddrType }
     *     
     */
    public void setCUSTACCADDRESS(AccAddrType value) {
        this.custaccaddress = value;
    }

}
