
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocTypeRemarks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocTypeRemarks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocTypeRemarks", propOrder = {
    "branchcode",
    "custacno",
    "remark1",
    "remark2",
    "remark3",
    "remark4",
    "remark5",
    "remark6",
    "remark7",
    "remark8",
    "remark9",
    "remark10"
})
public class DocTypeRemarks {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "REMARK1")
    protected String remark1;
    @XmlElement(name = "REMARK2")
    protected String remark2;
    @XmlElement(name = "REMARK3")
    protected String remark3;
    @XmlElement(name = "REMARK4")
    protected String remark4;
    @XmlElement(name = "REMARK5")
    protected String remark5;
    @XmlElement(name = "REMARK6")
    protected String remark6;
    @XmlElement(name = "REMARK7")
    protected String remark7;
    @XmlElement(name = "REMARK8")
    protected String remark8;
    @XmlElement(name = "REMARK9")
    protected String remark9;
    @XmlElement(name = "REMARK10")
    protected String remark10;

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
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
     * Gets the value of the remark1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK1() {
        return remark1;
    }

    /**
     * Sets the value of the remark1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK1(String value) {
        this.remark1 = value;
    }

    /**
     * Gets the value of the remark2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK2() {
        return remark2;
    }

    /**
     * Sets the value of the remark2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK2(String value) {
        this.remark2 = value;
    }

    /**
     * Gets the value of the remark3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK3() {
        return remark3;
    }

    /**
     * Sets the value of the remark3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK3(String value) {
        this.remark3 = value;
    }

    /**
     * Gets the value of the remark4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK4() {
        return remark4;
    }

    /**
     * Sets the value of the remark4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK4(String value) {
        this.remark4 = value;
    }

    /**
     * Gets the value of the remark5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK5() {
        return remark5;
    }

    /**
     * Sets the value of the remark5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK5(String value) {
        this.remark5 = value;
    }

    /**
     * Gets the value of the remark6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK6() {
        return remark6;
    }

    /**
     * Sets the value of the remark6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK6(String value) {
        this.remark6 = value;
    }

    /**
     * Gets the value of the remark7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK7() {
        return remark7;
    }

    /**
     * Sets the value of the remark7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK7(String value) {
        this.remark7 = value;
    }

    /**
     * Gets the value of the remark8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK8() {
        return remark8;
    }

    /**
     * Sets the value of the remark8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK8(String value) {
        this.remark8 = value;
    }

    /**
     * Gets the value of the remark9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK9() {
        return remark9;
    }

    /**
     * Sets the value of the remark9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK9(String value) {
        this.remark9 = value;
    }

    /**
     * Gets the value of the remark10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK10() {
        return remark10;
    }

    /**
     * Sets the value of the remark10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK10(String value) {
        this.remark10 = value;
    }

}
