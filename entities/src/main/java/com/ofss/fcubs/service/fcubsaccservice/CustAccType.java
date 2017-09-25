
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAccType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAccType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECORD_STAT" type="{http://fcubs.ofss.com/service/FCUBSAccService}RecStatType" minOccurs="0"/>
 *         &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOPENDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="CLRBNKCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCTYPE" type="{http://fcubs.ofss.com/service/FCUBSAccService}JntAccType" minOccurs="0"/>
 *         &lt;element name="MINREQBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SWPTYPE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ALTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MASTERACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTODEPBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PRDLST" type="{http://fcubs.ofss.com/service/FCUBSAccService}ALLWDISALWType" minOccurs="0"/>
 *         &lt;element name="TXNLST" type="{http://fcubs.ofss.com/service/FCUBSAccService}ALLWDISALWType" minOccurs="0"/>
 *         &lt;element name="SPCONDLST" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="SPCONDTXN" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ACCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATSINCE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="Intdetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}IntDetailsType" minOccurs="0"/>
 *         &lt;element name="Tddetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}TDInputType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAccType", propOrder = {
    "brn",
    "acc",
    "custno",
    "custname",
    "accls",
    "ccy",
    "recordstat",
    "adesc",
    "accopendt",
    "clrbnkcd",
    "acctype",
    "minreqbal",
    "swptype",
    "altacc",
    "masteracc",
    "autodepbal",
    "prdlst",
    "txnlst",
    "spcondlst",
    "spcondtxn",
    "accstat",
    "statsince",
    "intdetails",
    "tddetails"
})
public class CustAccType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "CUSTNAME")
    protected String custname;
    @XmlElement(name = "ACCLS")
    protected String accls;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "RECORD_STAT")
    @XmlSchemaType(name = "string")
    protected RecStatType recordstat;
    @XmlElement(name = "ADESC")
    protected String adesc;
    @XmlElement(name = "ACCOPENDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object accopendt;
    @XmlElement(name = "CLRBNKCD")
    protected String clrbnkcd;
    @XmlElement(name = "ACCTYPE")
    @XmlSchemaType(name = "string")
    protected JntAccType acctype;
    @XmlElement(name = "MINREQBAL")
    protected BigDecimal minreqbal;
    @XmlElement(name = "SWPTYPE")
    protected BigInteger swptype;
    @XmlElement(name = "ALTACC")
    protected String altacc;
    @XmlElement(name = "MASTERACC")
    protected String masteracc;
    @XmlElement(name = "AUTODEPBAL")
    protected BigDecimal autodepbal;
    @XmlElement(name = "PRDLST")
    @XmlSchemaType(name = "string")
    protected ALLWDISALWType prdlst;
    @XmlElement(name = "TXNLST")
    @XmlSchemaType(name = "string")
    protected ALLWDISALWType txnlst;
    @XmlElement(name = "SPCONDLST")
    @XmlSchemaType(name = "string")
    protected YesNoType spcondlst;
    @XmlElement(name = "SPCONDTXN")
    @XmlSchemaType(name = "string")
    protected YesNoType spcondtxn;
    @XmlElement(name = "ACCSTAT")
    protected String accstat;
    @XmlElement(name = "STATSINCE")
    @XmlSchemaType(name = "anySimpleType")
    protected Object statsince;
    @XmlElement(name = "Intdetails")
    protected IntDetailsType intdetails;
    @XmlElement(name = "Tddetails", required = true)
    protected TDInputType tddetails;

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
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
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNAME() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNAME(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the accls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCLS() {
        return accls;
    }

    /**
     * Sets the value of the accls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCLS(String value) {
        this.accls = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the recordstat property.
     * 
     * @return
     *     possible object is
     *     {@link RecStatType }
     *     
     */
    public RecStatType getRECORDSTAT() {
        return recordstat;
    }

    /**
     * Sets the value of the recordstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecStatType }
     *     
     */
    public void setRECORDSTAT(RecStatType value) {
        this.recordstat = value;
    }

    /**
     * Gets the value of the adesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADESC() {
        return adesc;
    }

    /**
     * Sets the value of the adesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADESC(String value) {
        this.adesc = value;
    }

    /**
     * Gets the value of the accopendt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getACCOPENDT() {
        return accopendt;
    }

    /**
     * Sets the value of the accopendt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setACCOPENDT(Object value) {
        this.accopendt = value;
    }

    /**
     * Gets the value of the clrbnkcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLRBNKCD() {
        return clrbnkcd;
    }

    /**
     * Sets the value of the clrbnkcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLRBNKCD(String value) {
        this.clrbnkcd = value;
    }

    /**
     * Gets the value of the acctype property.
     * 
     * @return
     *     possible object is
     *     {@link JntAccType }
     *     
     */
    public JntAccType getACCTYPE() {
        return acctype;
    }

    /**
     * Sets the value of the acctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JntAccType }
     *     
     */
    public void setACCTYPE(JntAccType value) {
        this.acctype = value;
    }

    /**
     * Gets the value of the minreqbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINREQBAL() {
        return minreqbal;
    }

    /**
     * Sets the value of the minreqbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINREQBAL(BigDecimal value) {
        this.minreqbal = value;
    }

    /**
     * Gets the value of the swptype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSWPTYPE() {
        return swptype;
    }

    /**
     * Sets the value of the swptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSWPTYPE(BigInteger value) {
        this.swptype = value;
    }

    /**
     * Gets the value of the altacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTACC() {
        return altacc;
    }

    /**
     * Sets the value of the altacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTACC(String value) {
        this.altacc = value;
    }

    /**
     * Gets the value of the masteracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMASTERACC() {
        return masteracc;
    }

    /**
     * Sets the value of the masteracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMASTERACC(String value) {
        this.masteracc = value;
    }

    /**
     * Gets the value of the autodepbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAUTODEPBAL() {
        return autodepbal;
    }

    /**
     * Sets the value of the autodepbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAUTODEPBAL(BigDecimal value) {
        this.autodepbal = value;
    }

    /**
     * Gets the value of the prdlst property.
     * 
     * @return
     *     possible object is
     *     {@link ALLWDISALWType }
     *     
     */
    public ALLWDISALWType getPRDLST() {
        return prdlst;
    }

    /**
     * Sets the value of the prdlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALLWDISALWType }
     *     
     */
    public void setPRDLST(ALLWDISALWType value) {
        this.prdlst = value;
    }

    /**
     * Gets the value of the txnlst property.
     * 
     * @return
     *     possible object is
     *     {@link ALLWDISALWType }
     *     
     */
    public ALLWDISALWType getTXNLST() {
        return txnlst;
    }

    /**
     * Sets the value of the txnlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALLWDISALWType }
     *     
     */
    public void setTXNLST(ALLWDISALWType value) {
        this.txnlst = value;
    }

    /**
     * Gets the value of the spcondlst property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getSPCONDLST() {
        return spcondlst;
    }

    /**
     * Sets the value of the spcondlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setSPCONDLST(YesNoType value) {
        this.spcondlst = value;
    }

    /**
     * Gets the value of the spcondtxn property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getSPCONDTXN() {
        return spcondtxn;
    }

    /**
     * Sets the value of the spcondtxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setSPCONDTXN(YesNoType value) {
        this.spcondtxn = value;
    }

    /**
     * Gets the value of the accstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCSTAT() {
        return accstat;
    }

    /**
     * Sets the value of the accstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCSTAT(String value) {
        this.accstat = value;
    }

    /**
     * Gets the value of the statsince property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSTATSINCE() {
        return statsince;
    }

    /**
     * Sets the value of the statsince property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSTATSINCE(Object value) {
        this.statsince = value;
    }

    /**
     * Gets the value of the intdetails property.
     * 
     * @return
     *     possible object is
     *     {@link IntDetailsType }
     *     
     */
    public IntDetailsType getIntdetails() {
        return intdetails;
    }

    /**
     * Sets the value of the intdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntDetailsType }
     *     
     */
    public void setIntdetails(IntDetailsType value) {
        this.intdetails = value;
    }

    /**
     * Gets the value of the tddetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDInputType }
     *     
     */
    public TDInputType getTddetails() {
        return tddetails;
    }

    /**
     * Sets the value of the tddetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDInputType }
     *     
     */
    public void setTddetails(TDInputType value) {
        this.tddetails = value;
    }

}
