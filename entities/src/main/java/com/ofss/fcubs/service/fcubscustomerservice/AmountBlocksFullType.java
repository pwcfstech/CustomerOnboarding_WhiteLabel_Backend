
package com.ofss.fcubs.service.fcubscustomerservice;

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
 * <p>Java class for AmountBlocks-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountBlocks-Full-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMTBLKNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EFFDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EXPDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="REM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOLD_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKERDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ONCEAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}UDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountBlocks-Full-Type", propOrder = {
    "branch",
    "acc",
    "amtblkno",
    "amt",
    "effdate",
    "expdate",
    "rem",
    "holdcode",
    "makerid",
    "makerdtstamp",
    "checkerid",
    "checkerdtstamp",
    "modno",
    "authstat",
    "recstat",
    "onceauth",
    "udfdetails"
})
public class AmountBlocksFullType {

    @XmlElement(name = "BRANCH", required = true)
    protected String branch;
    @XmlElement(name = "ACC", required = true)
    protected String acc;
    @XmlElement(name = "AMTBLKNO", required = true)
    protected String amtblkno;
    @XmlElement(name = "AMT")
    protected BigDecimal amt;
    @XmlElement(name = "EFFDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effdate;
    @XmlElement(name = "EXPDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expdate;
    @XmlElement(name = "REM")
    protected String rem;
    @XmlElement(name = "HOLD_CODE")
    protected String holdcode;
    @XmlElement(name = "MAKERID")
    protected String makerid;
    @XmlElement(name = "MAKERDTSTAMP")
    protected String makerdtstamp;
    @XmlElement(name = "CHECKERID")
    protected String checkerid;
    @XmlElement(name = "CHECKERDTSTAMP")
    protected String checkerdtstamp;
    @XmlElement(name = "MODNO")
    protected BigDecimal modno;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;
    @XmlElement(name = "RECSTAT")
    protected String recstat;
    @XmlElement(name = "ONCEAUTH")
    protected String onceauth;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType> udfdetails;

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
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the amtblkno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTBLKNO() {
        return amtblkno;
    }

    /**
     * Sets the value of the amtblkno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTBLKNO(String value) {
        this.amtblkno = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMT() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMT(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the effdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEFFDATE() {
        return effdate;
    }

    /**
     * Sets the value of the effdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEFFDATE(XMLGregorianCalendar value) {
        this.effdate = value;
    }

    /**
     * Gets the value of the expdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXPDATE() {
        return expdate;
    }

    /**
     * Sets the value of the expdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXPDATE(XMLGregorianCalendar value) {
        this.expdate = value;
    }

    /**
     * Gets the value of the rem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREM() {
        return rem;
    }

    /**
     * Sets the value of the rem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREM(String value) {
        this.rem = value;
    }

    /**
     * Gets the value of the holdcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLDCODE() {
        return holdcode;
    }

    /**
     * Sets the value of the holdcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLDCODE(String value) {
        this.holdcode = value;
    }

    /**
     * Gets the value of the makerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERID() {
        return makerid;
    }

    /**
     * Sets the value of the makerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERID(String value) {
        this.makerid = value;
    }

    /**
     * Gets the value of the makerdtstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERDTSTAMP() {
        return makerdtstamp;
    }

    /**
     * Sets the value of the makerdtstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERDTSTAMP(String value) {
        this.makerdtstamp = value;
    }

    /**
     * Gets the value of the checkerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERID() {
        return checkerid;
    }

    /**
     * Sets the value of the checkerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERID(String value) {
        this.checkerid = value;
    }

    /**
     * Gets the value of the checkerdtstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERDTSTAMP() {
        return checkerdtstamp;
    }

    /**
     * Sets the value of the checkerdtstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERDTSTAMP(String value) {
        this.checkerdtstamp = value;
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
     * Gets the value of the recstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECSTAT() {
        return recstat;
    }

    /**
     * Sets the value of the recstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECSTAT(String value) {
        this.recstat = value;
    }

    /**
     * Gets the value of the onceauth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONCEAUTH() {
        return onceauth;
    }

    /**
     * Sets the value of the onceauth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONCEAUTH(String value) {
        this.onceauth = value;
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
     * {@link UDFDETAILSType }
     * 
     * 
     */
    public List<UDFDETAILSType> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType>();
        }
        return this.udfdetails;
    }

}
