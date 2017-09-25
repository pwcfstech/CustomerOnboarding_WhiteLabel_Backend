
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cscupdoc-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cscupdoc-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Doc-Upload" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DCREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DOC_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DOC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ui-Columns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
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
@XmlType(name = "Cscupdoc-Full-Type", propOrder = {
    "docUpload",
    "uiColumns"
})
public class CscupdocFullType {

    @XmlElement(name = "Doc-Upload")
    protected List<CscupdocFullType.DocUpload> docUpload;
    @XmlElement(name = "Ui-Columns")
    protected CscupdocFullType.UiColumns uiColumns;

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
     * {@link CscupdocFullType.DocUpload }
     * 
     * 
     */
    public List<CscupdocFullType.DocUpload> getDocUpload() {
        if (docUpload == null) {
            docUpload = new ArrayList<CscupdocFullType.DocUpload>();
        }
        return this.docUpload;
    }

    /**
     * Gets the value of the uiColumns property.
     * 
     * @return
     *     possible object is
     *     {@link CscupdocFullType.UiColumns }
     *     
     */
    public CscupdocFullType.UiColumns getUiColumns() {
        return uiColumns;
    }

    /**
     * Sets the value of the uiColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CscupdocFullType.UiColumns }
     *     
     */
    public void setUiColumns(CscupdocFullType.UiColumns value) {
        this.uiColumns = value;
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
     *         &lt;element name="DCREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DOC_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DOC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dcrefno",
        "doccategory",
        "doctype",
        "remarks"
    })
    public static class DocUpload {

        @XmlElement(name = "DCREFNO", required = true)
        protected String dcrefno;
        @XmlElement(name = "DOC_CATEGORY", required = true)
        protected String doccategory;
        @XmlElement(name = "DOC_TYPE", required = true)
        protected String doctype;
        @XmlElement(name = "REMARKS")
        protected String remarks;

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
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UiColumns {


    }

}
