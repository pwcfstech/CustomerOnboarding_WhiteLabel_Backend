
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CheckBook-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckBook-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INCL_FOR_CHKBOOK_PRINTING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIRST_CHECK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECK_LEAVES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ISSUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ORDER_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHQ_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CH_BK_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELIVERY_ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELIVERY_ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELIVERY_ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELIVERY_ADD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELIVERY_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LANGCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQUEST_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQUEST_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLY_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cavws-Cheque-Status" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHQ_BOOK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHQ_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSAccService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Event-Master" type="{http://fcubs.ofss.com/service/FCUBSAccService}Csconevt-Full-Type" minOccurs="0"/>
 *         &lt;element name="Charge-Main" type="{http://fcubs.ofss.com/service/FCUBSAccService}Csconchg-Full-Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckBook-Full-Type", propOrder = {
    "inclforchkbookprinting",
    "branch",
    "account",
    "firstcheckno",
    "checkleaves",
    "orderdate",
    "issuedate",
    "orderdetails",
    "chqtype",
    "chbktype",
    "deliveryadd1",
    "deliveryadd2",
    "deliveryadd3",
    "deliveryadd4",
    "deliverymode",
    "langcode",
    "requeststatus",
    "requestmode",
    "applycharge",
    "maker",
    "makerstamp",
    "checker",
    "checkerstamp",
    "modno",
    "txnstat",
    "authstat",
    "cavwsChequeStatus",
    "udfdetails",
    "eventMaster",
    "chargeMain"
})
public class CheckBookFullType {

    @XmlElement(name = "INCL_FOR_CHKBOOK_PRINTING")
    protected String inclforchkbookprinting;
    @XmlElement(name = "BRANCH", required = true)
    protected String branch;
    @XmlElement(name = "ACCOUNT", required = true)
    protected String account;
    @XmlElement(name = "FIRST_CHECK_NO")
    protected String firstcheckno;
    @XmlElement(name = "CHECK_LEAVES")
    protected BigDecimal checkleaves;
    @XmlElement(name = "ORDER_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderdate;
    @XmlElement(name = "ISSUE_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedate;
    @XmlElement(name = "ORDER_DETAILS")
    protected String orderdetails;
    @XmlElement(name = "CHQ_TYPE")
    protected String chqtype;
    @XmlElement(name = "CH_BK_TYPE")
    protected String chbktype;
    @XmlElement(name = "DELIVERY_ADD1")
    protected String deliveryadd1;
    @XmlElement(name = "DELIVERY_ADD2")
    protected String deliveryadd2;
    @XmlElement(name = "DELIVERY_ADD3")
    protected String deliveryadd3;
    @XmlElement(name = "DELIVERY_ADD4")
    protected String deliveryadd4;
    @XmlElement(name = "DELIVERY_MODE")
    protected String deliverymode;
    @XmlElement(name = "LANGCODE")
    protected String langcode;
    @XmlElement(name = "REQUEST_STATUS")
    protected String requeststatus;
    @XmlElement(name = "REQUEST_MODE")
    protected String requestmode;
    @XmlElement(name = "APPLY_CHARGE")
    protected String applycharge;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "CHECKER")
    protected String checker;
    @XmlElement(name = "CHECKERSTAMP")
    protected String checkerstamp;
    @XmlElement(name = "MODNO")
    protected BigDecimal modno;
    @XmlElement(name = "TXNSTAT")
    protected String txnstat;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;
    @XmlElement(name = "Cavws-Cheque-Status")
    protected List<CheckBookFullType.CavwsChequeStatus> cavwsChequeStatus;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;
    @XmlElement(name = "Event-Master")
    protected CsconevtFullType eventMaster;
    @XmlElement(name = "Charge-Main")
    protected CsconchgFullType chargeMain;

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
     * Gets the value of the checkleaves property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCHECKLEAVES() {
        return checkleaves;
    }

    /**
     * Sets the value of the checkleaves property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCHECKLEAVES(BigDecimal value) {
        this.checkleaves = value;
    }

    /**
     * Gets the value of the orderdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getORDERDATE() {
        return orderdate;
    }

    /**
     * Sets the value of the orderdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setORDERDATE(XMLGregorianCalendar value) {
        this.orderdate = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setISSUEDATE(XMLGregorianCalendar value) {
        this.issuedate = value;
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
     * Gets the value of the chqtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHQTYPE() {
        return chqtype;
    }

    /**
     * Sets the value of the chqtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHQTYPE(String value) {
        this.chqtype = value;
    }

    /**
     * Gets the value of the chbktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHBKTYPE() {
        return chbktype;
    }

    /**
     * Sets the value of the chbktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHBKTYPE(String value) {
        this.chbktype = value;
    }

    /**
     * Gets the value of the deliveryadd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD1() {
        return deliveryadd1;
    }

    /**
     * Sets the value of the deliveryadd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD1(String value) {
        this.deliveryadd1 = value;
    }

    /**
     * Gets the value of the deliveryadd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD2() {
        return deliveryadd2;
    }

    /**
     * Sets the value of the deliveryadd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD2(String value) {
        this.deliveryadd2 = value;
    }

    /**
     * Gets the value of the deliveryadd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD3() {
        return deliveryadd3;
    }

    /**
     * Sets the value of the deliveryadd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD3(String value) {
        this.deliveryadd3 = value;
    }

    /**
     * Gets the value of the deliveryadd4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD4() {
        return deliveryadd4;
    }

    /**
     * Sets the value of the deliveryadd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD4(String value) {
        this.deliveryadd4 = value;
    }

    /**
     * Gets the value of the deliverymode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYMODE() {
        return deliverymode;
    }

    /**
     * Sets the value of the deliverymode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYMODE(String value) {
        this.deliverymode = value;
    }

    /**
     * Gets the value of the langcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGCODE() {
        return langcode;
    }

    /**
     * Sets the value of the langcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGCODE(String value) {
        this.langcode = value;
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
     * Gets the value of the requestmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUESTMODE() {
        return requestmode;
    }

    /**
     * Sets the value of the requestmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUESTMODE(String value) {
        this.requestmode = value;
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
     * Gets the value of the checker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKER() {
        return checker;
    }

    /**
     * Sets the value of the checker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKER(String value) {
        this.checker = value;
    }

    /**
     * Gets the value of the checkerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERSTAMP() {
        return checkerstamp;
    }

    /**
     * Sets the value of the checkerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERSTAMP(String value) {
        this.checkerstamp = value;
    }

    /**
     * Gets the value of the modno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODNO() {
        return modno;
    }

    /**
     * Sets the value of the modno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODNO(BigDecimal value) {
        this.modno = value;
    }

    /**
     * Gets the value of the txnstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNSTAT() {
        return txnstat;
    }

    /**
     * Sets the value of the txnstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNSTAT(String value) {
        this.txnstat = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHSTAT(String value) {
        this.authstat = value;
    }

    /**
     * Gets the value of the cavwsChequeStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cavwsChequeStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCavwsChequeStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckBookFullType.CavwsChequeStatus }
     * 
     * 
     */
    public List<CheckBookFullType.CavwsChequeStatus> getCavwsChequeStatus() {
        if (cavwsChequeStatus == null) {
            cavwsChequeStatus = new ArrayList<CheckBookFullType.CavwsChequeStatus>();
        }
        return this.cavwsChequeStatus;
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
     *     {@link CsconevtFullType }
     *     
     */
    public CsconevtFullType getEventMaster() {
        return eventMaster;
    }

    /**
     * Sets the value of the eventMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconevtFullType }
     *     
     */
    public void setEventMaster(CsconevtFullType value) {
        this.eventMaster = value;
    }

    /**
     * Gets the value of the chargeMain property.
     * 
     * @return
     *     possible object is
     *     {@link CsconchgFullType }
     *     
     */
    public CsconchgFullType getChargeMain() {
        return chargeMain;
    }

    /**
     * Sets the value of the chargeMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconchgFullType }
     *     
     */
    public void setChargeMain(CsconchgFullType value) {
        this.chargeMain = value;
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
     *         &lt;element name="CHQ_BOOK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHQ_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "chqbookno",
        "chqno",
        "status"
    })
    public static class CavwsChequeStatus {

        @XmlElement(name = "CHQ_BOOK_NO")
        protected String chqbookno;
        @XmlElement(name = "CHQ_NO")
        protected String chqno;
        @XmlElement(name = "STATUS")
        protected String status;

        /**
         * Gets the value of the chqbookno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHQBOOKNO() {
            return chqbookno;
        }

        /**
         * Sets the value of the chqbookno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHQBOOKNO(String value) {
            this.chqbookno = value;
        }

        /**
         * Gets the value of the chqno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHQNO() {
            return chqno;
        }

        /**
         * Sets the value of the chqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHQNO(String value) {
            this.chqno = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

    }

}
