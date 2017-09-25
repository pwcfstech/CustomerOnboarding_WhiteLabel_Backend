
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocTypeChecklist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocTypeChecklist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANDATORY" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="CHECKED" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EXPECTED_DATE_SUBMISSION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ACTUAL_SUBMISSION_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DOCREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocTypeChecklist", propOrder = {
    "branchcode",
    "custacno",
    "documenttype",
    "mandatory",
    "checked",
    "expirydate",
    "expecteddatesubmission",
    "actualsubmissiondate",
    "docrefno"
})
public class DocTypeChecklist {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "DOCUMENT_TYPE")
    protected String documenttype;
    @XmlElement(name = "MANDATORY")
    @XmlSchemaType(name = "string")
    protected YesNoType mandatory;
    @XmlElement(name = "CHECKED")
    @XmlSchemaType(name = "string")
    protected YesNoType checked;
    @XmlElement(name = "EXPIRY_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirydate;
    @XmlElement(name = "EXPECTED_DATE_SUBMISSION")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expecteddatesubmission;
    @XmlElement(name = "ACTUAL_SUBMISSION_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualsubmissiondate;
    @XmlElement(name = "DOCREFNO")
    protected String docrefno;

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
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTTYPE(String value) {
        this.documenttype = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getMANDATORY() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setMANDATORY(YesNoType value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the checked property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getCHECKED() {
        return checked;
    }

    /**
     * Sets the value of the checked property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setCHECKED(YesNoType value) {
        this.checked = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXPIRYDATE(XMLGregorianCalendar value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the expecteddatesubmission property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXPECTEDDATESUBMISSION() {
        return expecteddatesubmission;
    }

    /**
     * Sets the value of the expecteddatesubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXPECTEDDATESUBMISSION(XMLGregorianCalendar value) {
        this.expecteddatesubmission = value;
    }

    /**
     * Gets the value of the actualsubmissiondate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACTUALSUBMISSIONDATE() {
        return actualsubmissiondate;
    }

    /**
     * Sets the value of the actualsubmissiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACTUALSUBMISSIONDATE(XMLGregorianCalendar value) {
        this.actualsubmissiondate = value;
    }

    /**
     * Gets the value of the docrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCREFNO() {
        return docrefno;
    }

    /**
     * Sets the value of the docrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCREFNO(String value) {
        this.docrefno = value;
    }

}
