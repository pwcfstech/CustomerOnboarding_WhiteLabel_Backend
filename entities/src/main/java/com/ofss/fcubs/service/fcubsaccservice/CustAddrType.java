
package com.ofss.fcubs.service.fcubsaccservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAddrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAddrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MEDIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFAULTADDR" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="COMMADDR" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRLN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRLN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRLN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDRLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TESTKEYWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELIVERYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDBYEMAIL" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ADDHOLDMAIL" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ANSWERBACK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Msgaddress" type="{http://fcubs.ofss.com/service/FCUBSAccService}MsgAddrsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAddrType", propOrder = {
    "media",
    "loc",
    "lang",
    "defaultaddr",
    "commaddr",
    "name",
    "country",
    "addrln1",
    "addrln2",
    "addrln3",
    "addrln4",
    "testkeyword",
    "deliveryby",
    "sendbyemail",
    "addholdmail",
    "answerback",
    "msgaddress"
})
public class CustAddrType {

    @XmlElement(name = "MEDIA", required = true)
    protected String media;
    @XmlElement(name = "LOC", required = true)
    protected String loc;
    @XmlElement(name = "LANG")
    protected String lang;
    @XmlElement(name = "DEFAULTADDR")
    @XmlSchemaType(name = "string")
    protected YesNoType defaultaddr;
    @XmlElement(name = "COMMADDR")
    @XmlSchemaType(name = "string")
    protected YesNoType commaddr;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "COUNTRY")
    protected String country;
    @XmlElement(name = "ADDRLN1")
    protected String addrln1;
    @XmlElement(name = "ADDRLN2")
    protected String addrln2;
    @XmlElement(name = "ADDRLN3")
    protected String addrln3;
    @XmlElement(name = "ADDRLN4")
    protected String addrln4;
    @XmlElement(name = "TESTKEYWORD")
    protected String testkeyword;
    @XmlElement(name = "DELIVERYBY")
    protected String deliveryby;
    @XmlElement(name = "SENDBYEMAIL")
    @XmlSchemaType(name = "string")
    protected YesNoType sendbyemail;
    @XmlElement(name = "ADDHOLDMAIL")
    @XmlSchemaType(name = "string")
    protected YesNoType addholdmail;
    @XmlElement(name = "ANSWERBACK")
    protected String answerback;
    @XmlElement(name = "Msgaddress")
    protected List<MsgAddrsType> msgaddress;

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIA() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIA(String value) {
        this.media = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOC() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOC(String value) {
        this.loc = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANG() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANG(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the defaultaddr property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDEFAULTADDR() {
        return defaultaddr;
    }

    /**
     * Sets the value of the defaultaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDEFAULTADDR(YesNoType value) {
        this.defaultaddr = value;
    }

    /**
     * Gets the value of the commaddr property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getCOMMADDR() {
        return commaddr;
    }

    /**
     * Sets the value of the commaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setCOMMADDR(YesNoType value) {
        this.commaddr = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the addrln1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRLN1() {
        return addrln1;
    }

    /**
     * Sets the value of the addrln1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRLN1(String value) {
        this.addrln1 = value;
    }

    /**
     * Gets the value of the addrln2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRLN2() {
        return addrln2;
    }

    /**
     * Sets the value of the addrln2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRLN2(String value) {
        this.addrln2 = value;
    }

    /**
     * Gets the value of the addrln3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRLN3() {
        return addrln3;
    }

    /**
     * Sets the value of the addrln3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRLN3(String value) {
        this.addrln3 = value;
    }

    /**
     * Gets the value of the addrln4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRLN4() {
        return addrln4;
    }

    /**
     * Sets the value of the addrln4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRLN4(String value) {
        this.addrln4 = value;
    }

    /**
     * Gets the value of the testkeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTKEYWORD() {
        return testkeyword;
    }

    /**
     * Sets the value of the testkeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTKEYWORD(String value) {
        this.testkeyword = value;
    }

    /**
     * Gets the value of the deliveryby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYBY() {
        return deliveryby;
    }

    /**
     * Sets the value of the deliveryby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYBY(String value) {
        this.deliveryby = value;
    }

    /**
     * Gets the value of the sendbyemail property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getSENDBYEMAIL() {
        return sendbyemail;
    }

    /**
     * Sets the value of the sendbyemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setSENDBYEMAIL(YesNoType value) {
        this.sendbyemail = value;
    }

    /**
     * Gets the value of the addholdmail property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getADDHOLDMAIL() {
        return addholdmail;
    }

    /**
     * Sets the value of the addholdmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setADDHOLDMAIL(YesNoType value) {
        this.addholdmail = value;
    }

    /**
     * Gets the value of the answerback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANSWERBACK() {
        return answerback;
    }

    /**
     * Sets the value of the answerback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANSWERBACK(String value) {
        this.answerback = value;
    }

    /**
     * Gets the value of the msgaddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgaddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgaddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsgAddrsType }
     * 
     * 
     */
    public List<MsgAddrsType> getMsgaddress() {
        if (msgaddress == null) {
            msgaddress = new ArrayList<MsgAddrsType>();
        }
        return this.msgaddress;
    }

}
