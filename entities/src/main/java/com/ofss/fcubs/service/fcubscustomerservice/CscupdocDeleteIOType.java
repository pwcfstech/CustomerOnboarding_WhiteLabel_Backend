
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cscupdoc-Delete-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cscupdoc-Delete-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FUNCTION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doc-Upload" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KEY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUNCTION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DCREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DOC_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cscupdoc-Delete-IO-Type", propOrder = {
    "keyid",
    "functionid",
    "module",
    "docUpload"
})
public class CscupdocDeleteIOType {

    @XmlElement(name = "KEY_ID")
    protected String keyid;
    @XmlElement(name = "FUNCTION_ID")
    protected String functionid;
    @XmlElement(name = "MODULE")
    protected String module;
    @XmlElement(name = "Doc-Upload")
    protected List<CscupdocDeleteIOType.DocUpload> docUpload;

    /**
     * Gets the value of the keyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYID() {
        return keyid;
    }

    /**
     * Sets the value of the keyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYID(String value) {
        this.keyid = value;
    }

    /**
     * Gets the value of the functionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTIONID() {
        return functionid;
    }

    /**
     * Sets the value of the functionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTIONID(String value) {
        this.functionid = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULE() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULE(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the docUpload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docUpload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocUpload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CscupdocDeleteIOType.DocUpload }
     * 
     * 
     */
    public List<CscupdocDeleteIOType.DocUpload> getDocUpload() {
        if (docUpload == null) {
            docUpload = new ArrayList<CscupdocDeleteIOType.DocUpload>();
        }
        return this.docUpload;
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
     *         &lt;element name="KEY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUNCTION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DCREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DOC_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "keyid",
        "functionid",
        "dcrefno",
        "doccategory",
        "doctype",
        "remarks"
    })
    public static class DocUpload {

        @XmlElement(name = "KEY_ID")
        protected String keyid;
        @XmlElement(name = "FUNCTION_ID")
        protected String functionid;
        @XmlElement(name = "DCREFNO", required = true)
        protected String dcrefno;
        @XmlElement(name = "DOC_CATEGORY")
        protected String doccategory;
        @XmlElement(name = "DOC_TYPE")
        protected String doctype;
        @XmlElement(name = "REMARKS")
        protected String remarks;

        /**
         * Gets the value of the keyid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKEYID() {
            return keyid;
        }

        /**
         * Sets the value of the keyid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKEYID(String value) {
            this.keyid = value;
        }

        /**
         * Gets the value of the functionid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNCTIONID() {
            return functionid;
        }

        /**
         * Sets the value of the functionid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNCTIONID(String value) {
            this.functionid = value;
        }

        /**
         * Gets the value of the dcrefno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCREFNO() {
            return dcrefno;
        }

        /**
         * Sets the value of the dcrefno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCREFNO(String value) {
            this.dcrefno = value;
        }

        /**
         * Gets the value of the doccategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCCATEGORY() {
            return doccategory;
        }

        /**
         * Sets the value of the doccategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCCATEGORY(String value) {
            this.doccategory = value;
        }

        /**
         * Gets the value of the doctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCTYPE() {
            return doctype;
        }

        /**
         * Sets the value of the doctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCTYPE(String value) {
            this.doctype = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARKS() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARKS(String value) {
            this.remarks = value;
        }

    }

}
