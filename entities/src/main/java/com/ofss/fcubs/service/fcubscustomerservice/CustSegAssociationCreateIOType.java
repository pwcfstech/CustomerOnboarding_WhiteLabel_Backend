
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustSegAssociation-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSegAssociation-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUSTSEGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTSEGSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTCCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustSegAssociation-Create-IO-Type", propOrder = {
    "custno",
    "custsegcd",
    "custsegstatus",
    "custccy",
    "udfdetails"
})
public class CustSegAssociationCreateIOType {

    @XmlElement(name = "CUSTNO", required = true)
    protected String custno;
    @XmlElement(name = "CUSTSEGCD")
    protected String custsegcd;
    @XmlElement(name = "CUSTSEGSTATUS")
    protected String custsegstatus;
    @XmlElement(name = "CUSTCCY", required = true)
    protected String custccy;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

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
     * Gets the value of the custsegcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTSEGCD() {
        return custsegcd;
    }

    /**
     * Sets the value of the custsegcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTSEGCD(String value) {
        this.custsegcd = value;
    }

    /**
     * Gets the value of the custsegstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTSEGSTATUS() {
        return custsegstatus;
    }

    /**
     * Sets the value of the custsegstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTSEGSTATUS(String value) {
        this.custsegstatus = value;
    }

    /**
     * Gets the value of the custccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTCCY() {
        return custccy;
    }

    /**
     * Sets the value of the custccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTCCY(String value) {
        this.custccy = value;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
    }

}
