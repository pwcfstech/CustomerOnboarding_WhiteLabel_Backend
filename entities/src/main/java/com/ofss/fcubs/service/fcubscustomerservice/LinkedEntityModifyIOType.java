
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedEntity-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedEntity-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relationship-Linkage" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="INHERIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DESCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LinkedEntity-Modify-IO-Type", propOrder = {
    "custno",
    "relationshipLinkage"
})
public class LinkedEntityModifyIOType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "Relationship-Linkage")
    protected List<LinkedEntityModifyIOType.RelationshipLinkage> relationshipLinkage;

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
     * Gets the value of the relationshipLinkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipLinkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedEntityModifyIOType.RelationshipLinkage }
     * 
     * 
     */
    public List<LinkedEntityModifyIOType.RelationshipLinkage> getRelationshipLinkage() {
        if (relationshipLinkage == null) {
            relationshipLinkage = new ArrayList<LinkedEntityModifyIOType.RelationshipLinkage>();
        }
        return this.relationshipLinkage;
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
     *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="INHERIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DESCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "customer",
        "relationship",
        "inherit",
        "descp"
    })
    public static class RelationshipLinkage {

        @XmlElement(name = "CUSTOMER", required = true)
        protected String customer;
        @XmlElement(name = "RELATIONSHIP", required = true)
        protected String relationship;
        @XmlElement(name = "INHERIT")
        protected String inherit;
        @XmlElement(name = "DESCP")
        protected String descp;

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMER() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMER(String value) {
            this.customer = value;
        }

        /**
         * Gets the value of the relationship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATIONSHIP() {
            return relationship;
        }

        /**
         * Sets the value of the relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATIONSHIP(String value) {
            this.relationship = value;
        }

        /**
         * Gets the value of the inherit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINHERIT() {
            return inherit;
        }

        /**
         * Sets the value of the inherit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINHERIT(String value) {
            this.inherit = value;
        }

        /**
         * Gets the value of the descp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCP() {
            return descp;
        }

        /**
         * Sets the value of the descp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCP(String value) {
            this.descp = value;
        }

    }

}
