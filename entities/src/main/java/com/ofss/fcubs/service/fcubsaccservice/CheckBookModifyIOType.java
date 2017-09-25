
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckBook-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckBook-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INCL_FOR_CHKBOOK_PRINTING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIRST_CHECK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDER_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQUEST_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLY_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSAccService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Event-Master" type="{http://fcubs.ofss.com/service/FCUBSAccService}Csconevt-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Charge-Main" type="{http://fcubs.ofss.com/service/FCUBSAccService}Csconchg-Modify-IO-Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckBook-Modify-IO-Type", propOrder = {
    "inclforchkbookprinting",
    "branch",
    "account",
    "firstcheckno",
    "orderdetails",
    "requeststatus",
    "referenceno",
    "applycharge",
    "maker",
    "makerstamp",
    "udfdetails",
    "eventMaster",
    "chargeMain"
})
public class CheckBookModifyIOType {

    @XmlElement(name = "INCL_FOR_CHKBOOK_PRINTING")
    protected String inclforchkbookprinting;
    @XmlElement(name = "BRANCH", required = true)
    protected String branch;
    @XmlElement(name = "ACCOUNT", required = true)
    protected String account;
    @XmlElement(name = "FIRST_CHECK_NO")
    protected String firstcheckno;
    @XmlElement(name = "ORDER_DETAILS")
    protected String orderdetails;
    @XmlElement(name = "REQUEST_STATUS")
    protected String requeststatus;
    @XmlElement(name = "REFERENCENO")
    protected String referenceno;
    @XmlElement(name = "APPLY_CHARGE")
    protected String applycharge;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;
    @XmlElement(name = "Event-Master")
    protected CsconevtModifyIOType eventMaster;
    @XmlElement(name = "Charge-Main")
    protected CsconchgModifyIOType chargeMain;

    /**
     * Gets the value of the inclforchkbookprinting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCLFORCHKBOOKPRINTING() {
        return inclforchkbookprinting;
    }

    /**
     * Sets the value of the inclforchkbookprinting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCLFORCHKBOOKPRINTING(String value) {
        this.inclforchkbookprinting = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNT() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNT(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the firstcheckno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTCHECKNO() {
        return firstcheckno;
    }

    /**
     * Sets the value of the firstcheckno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTCHECKNO(String value) {
        this.firstcheckno = value;
    }

    /**
     * Gets the value of the orderdetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERDETAILS() {
        return orderdetails;
    }

    /**
     * Sets the value of the orderdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERDETAILS(String value) {
        this.orderdetails = value;
    }

    /**
     * Gets the value of the requeststatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUESTSTATUS() {
        return requeststatus;
    }

    /**
     * Sets the value of the requeststatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUESTSTATUS(String value) {
        this.requeststatus = value;
    }

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the applycharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLYCHARGE() {
        return applycharge;
    }

    /**
     * Sets the value of the applycharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLYCHARGE(String value) {
        this.applycharge = value;
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

    /**
     * Gets the value of the eventMaster property.
     * 
     * @return
     *     possible object is
     *     {@link CsconevtModifyIOType }
     *     
     */
    public CsconevtModifyIOType getEventMaster() {
        return eventMaster;
    }

    /**
     * Sets the value of the eventMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconevtModifyIOType }
     *     
     */
    public void setEventMaster(CsconevtModifyIOType value) {
        this.eventMaster = value;
    }

    /**
     * Gets the value of the chargeMain property.
     * 
     * @return
     *     possible object is
     *     {@link CsconchgModifyIOType }
     *     
     */
    public CsconchgModifyIOType getChargeMain() {
        return chargeMain;
    }

    /**
     * Sets the value of the chargeMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconchgModifyIOType }
     *     
     */
    public void setChargeMain(CsconchgModifyIOType value) {
        this.chargeMain = value;
    }

}
