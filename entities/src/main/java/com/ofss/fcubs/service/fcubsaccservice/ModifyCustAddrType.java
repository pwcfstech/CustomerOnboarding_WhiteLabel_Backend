
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyCustAddrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyCustAddrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTADDRESS" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAddrModifyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyCustAddrType", propOrder = {
    "xref",
    "custno",
    "custaddress"
})
public class ModifyCustAddrType {

    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "CUSTADDRESS", required = true)
    protected CustAddrModifyType custaddress;

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
     * Gets the value of the custaddress property.
     * 
     * @return
     *     possible object is
     *     {@link CustAddrModifyType }
     *     
     */
    public CustAddrModifyType getCUSTADDRESS() {
        return custaddress;
    }

    /**
     * Sets the value of the custaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAddrModifyType }
     *     
     */
    public void setCUSTADDRESS(CustAddrModifyType value) {
        this.custaddress = value;
    }

}
