
package com.ofss.fcubs.service.fcubscustomerservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustSegAssociation-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSegAssociation-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUSTSEGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTSEGSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NETWORTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NETWORTHCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CustSegAssociation-Modify-IO-Type", propOrder = {
    "custno",
    "custsegcd",
    "custsegstatus",
    "networth",
    "networthccy",
    "custccy",
    "maker",
    "makerstamp",
    "udfdetails"
})
public class CustSegAssociationModifyIOType {

    @XmlElement(name = "CUSTNO", required = true)
    protected String custno;
    @XmlElement(name = "CUSTSEGCD")
    protected String custsegcd;
    @XmlElement(name = "CUSTSEGSTATUS")
    protected String custsegstatus;
    @XmlElement(name = "NETWORTH")
    protected BigDecimal networth;
    @XmlElement(name = "NETWORTHCCY")
    protected String networthccy;
    @XmlElement(name = "CUSTCCY")
    protected String custccy;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
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
     * Gets the value of the networth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNETWORTH() {
        return networth;
    }

    /**
     * Sets the value of the networth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNETWORTH(BigDecimal value) {
        this.networth = value;
    }

    /**
     * Gets the value of the networthccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETWORTHCCY() {
        return networthccy;
    }

    /**
     * Sets the value of the networthccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETWORTHCCY(String value) {
        this.networthccy = value;
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
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKER() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKER(String value) {
        this.maker = value;
    }

    /**
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
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
