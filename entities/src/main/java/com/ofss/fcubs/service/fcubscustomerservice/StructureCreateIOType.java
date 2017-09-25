
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Structure-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Structure-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STRUCTG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GRPDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Struct-Detail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "Structure-Create-IO-Type", propOrder = {
    "structg",
    "grpdesc",
    "structDetail",
    "udfdetails"
})
public class StructureCreateIOType {

    @XmlElement(name = "STRUCTG", required = true)
    protected String structg;
    @XmlElement(name = "GRPDESC")
    protected String grpdesc;
    @XmlElement(name = "Struct-Detail")
    protected List<StructureCreateIOType.StructDetail> structDetail;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

    /**
     * Gets the value of the structg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRUCTG() {
        return structg;
    }

    /**
     * Sets the value of the structg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRUCTG(String value) {
        this.structg = value;
    }

    /**
     * Gets the value of the grpdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRPDESC() {
        return grpdesc;
    }

    /**
     * Sets the value of the grpdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRPDESC(String value) {
        this.grpdesc = value;
    }

    /**
     * Gets the value of the structDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructureCreateIOType.StructDetail }
     * 
     * 
     */
    public List<StructureCreateIOType.StructDetail> getStructDetail() {
        if (structDetail == null) {
            structDetail = new ArrayList<StructureCreateIOType.StructDetail>();
        }
        return this.structDetail;
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
     *         &lt;element name="PACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "paccount"
    })
    public static class StructDetail {

        @XmlElement(name = "PACCOUNT")
        protected String paccount;

        /**
         * Gets the value of the paccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPACCOUNT() {
            return paccount;
        }

        /**
         * Sets the value of the paccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPACCOUNT(String value) {
            this.paccount = value;
        }

    }

}
