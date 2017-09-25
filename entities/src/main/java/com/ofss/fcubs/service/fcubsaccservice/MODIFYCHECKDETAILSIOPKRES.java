
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSAccService}FCUBS_HEADERType"/>
 *         &lt;element name="FCUBS_BODY">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Cavws-Check-Details-PK" type="{http://fcubs.ofss.com/service/FCUBSAccService}CheckDetails-PK-Type" minOccurs="0"/>
 *                   &lt;element name="Cavws-Check-Details-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}CheckDetails-Modify-IO-Type" minOccurs="0"/>
 *                   &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccService}ERRORType" minOccurs="0"/>
 *                   &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccService}WARNINGType" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "MODIFYCHECKDETAILS_IOPK_RES")
public class MODIFYCHECKDETAILSIOPKRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected MODIFYCHECKDETAILSIOPKRES.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link MODIFYCHECKDETAILSIOPKRES.FCUBSBODY }
     *     
     */
    public MODIFYCHECKDETAILSIOPKRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link MODIFYCHECKDETAILSIOPKRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(MODIFYCHECKDETAILSIOPKRES.FCUBSBODY value) {
        this.fcubsbody = value;
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
     *         &lt;element name="Cavws-Check-Details-PK" type="{http://fcubs.ofss.com/service/FCUBSAccService}CheckDetails-PK-Type" minOccurs="0"/>
     *         &lt;element name="Cavws-Check-Details-IO" type="{http://fcubs.ofss.com/service/FCUBSAccService}CheckDetails-Modify-IO-Type" minOccurs="0"/>
     *         &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccService}ERRORType" minOccurs="0"/>
     *         &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSAccService}WARNINGType" minOccurs="0"/>
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
        "cavwsCheckDetailsPK",
        "cavwsCheckDetailsIO",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Cavws-Check-Details-PK")
        protected CheckDetailsPKType cavwsCheckDetailsPK;
        @XmlElement(name = "Cavws-Check-Details-IO")
        protected CheckDetailsModifyIOType cavwsCheckDetailsIO;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected ERRORType fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected WARNINGType fcubswarningresp;

        /**
         * Gets the value of the cavwsCheckDetailsPK property.
         * 
         * @return
         *     possible object is
         *     {@link CheckDetailsPKType }
         *     
         */
        public CheckDetailsPKType getCavwsCheckDetailsPK() {
            return cavwsCheckDetailsPK;
        }

        /**
         * Sets the value of the cavwsCheckDetailsPK property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckDetailsPKType }
         *     
         */
        public void setCavwsCheckDetailsPK(CheckDetailsPKType value) {
            this.cavwsCheckDetailsPK = value;
        }

        /**
         * Gets the value of the cavwsCheckDetailsIO property.
         * 
         * @return
         *     possible object is
         *     {@link CheckDetailsModifyIOType }
         *     
         */
        public CheckDetailsModifyIOType getCavwsCheckDetailsIO() {
            return cavwsCheckDetailsIO;
        }

        /**
         * Sets the value of the cavwsCheckDetailsIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckDetailsModifyIOType }
         *     
         */
        public void setCavwsCheckDetailsIO(CheckDetailsModifyIOType value) {
            this.cavwsCheckDetailsIO = value;
        }

        /**
         * Gets the value of the fcubserrorresp property.
         * 
         * @return
         *     possible object is
         *     {@link ERRORType }
         *     
         */
        public ERRORType getFCUBSERRORRESP() {
            return fcubserrorresp;
        }

        /**
         * Sets the value of the fcubserrorresp property.
         * 
         * @param value
         *     allowed object is
         *     {@link ERRORType }
         *     
         */
        public void setFCUBSERRORRESP(ERRORType value) {
            this.fcubserrorresp = value;
        }

        /**
         * Gets the value of the fcubswarningresp property.
         * 
         * @return
         *     possible object is
         *     {@link WARNINGType }
         *     
         */
        public WARNINGType getFCUBSWARNINGRESP() {
            return fcubswarningresp;
        }

        /**
         * Sets the value of the fcubswarningresp property.
         * 
         * @param value
         *     allowed object is
         *     {@link WARNINGType }
         *     
         */
        public void setFCUBSWARNINGRESP(WARNINGType value) {
            this.fcubswarningresp = value;
        }

    }

}
