
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIQDBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIQDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTSTDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="NEXTMATDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="AUTOROLL" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ROLLTYPE" type="{http://fcubs.ofss.com/service/FCUBSAccService}RolloverType" minOccurs="0"/>
 *         &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CLONMAT" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="MOVINTUNCLM" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="MOVPRIUNCLM" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="TDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RDPAYMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DFTENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYOPT" type="{http://fcubs.ofss.com/service/FCUBSAccService}PayOptType" minOccurs="0"/>
 *         &lt;element name="OFFBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OFFACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOPAY" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="FUNDONOVD" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="MOVTOUNCLM" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RDFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RDFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RDFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MATURITY_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTEREST_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RDFLAG" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="RDPAYSCHDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="STOCKCATALOGCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CERTNUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRB_DUP_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDInputType", propOrder = {
    "liqdbrn",
    "liqdacc",
    "intstdt",
    "matdt",
    "nextmatdt",
    "autoroll",
    "rolltype",
    "rollamt",
    "clonmat",
    "movintunclm",
    "movpriunclm",
    "tdamt",
    "rdacc",
    "rdpaymntccy",
    "dftenor",
    "ccy",
    "payopt",
    "offbrn",
    "offacc",
    "autopay",
    "fundonovd",
    "movtounclm",
    "paybrn",
    "payacc",
    "rdfreday",
    "rdfremth",
    "rdfreyear",
    "rdamt",
    "maturityamt",
    "interestrate",
    "rdflag",
    "rdpayschdt",
    "stockcatalogcode",
    "certnum",
    "crbdupind"
})
public class TDInputType {

    @XmlElement(name = "LIQDBRN")
    protected String liqdbrn;
    @XmlElement(name = "LIQDACC")
    protected String liqdacc;
    @XmlElement(name = "INTSTDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object intstdt;
    @XmlElement(name = "MATDT", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object matdt;
    @XmlElement(name = "NEXTMATDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object nextmatdt;
    @XmlElement(name = "AUTOROLL")
    @XmlSchemaType(name = "string")
    protected YesNoType autoroll;
    @XmlElement(name = "ROLLTYPE")
    @XmlSchemaType(name = "string")
    protected RolloverType rolltype;
    @XmlElement(name = "ROLLAMT")
    protected BigDecimal rollamt;
    @XmlElement(name = "CLONMAT")
    @XmlSchemaType(name = "string")
    protected YesNoType clonmat;
    @XmlElement(name = "MOVINTUNCLM")
    @XmlSchemaType(name = "string")
    protected YesNoType movintunclm;
    @XmlElement(name = "MOVPRIUNCLM")
    @XmlSchemaType(name = "string")
    protected YesNoType movpriunclm;
    @XmlElement(name = "TDAMT")
    protected BigDecimal tdamt;
    @XmlElement(name = "RDACC")
    protected String rdacc;
    @XmlElement(name = "RDPAYMNTCCY")
    protected String rdpaymntccy;
    @XmlElement(name = "DFTENOR")
    protected BigDecimal dftenor;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "PAYOPT")
    @XmlSchemaType(name = "string")
    protected PayOptType payopt;
    @XmlElement(name = "OFFBRN")
    protected String offbrn;
    @XmlElement(name = "OFFACC")
    protected String offacc;
    @XmlElement(name = "AUTOPAY")
    @XmlSchemaType(name = "string")
    protected YesNoType autopay;
    @XmlElement(name = "FUNDONOVD")
    @XmlSchemaType(name = "string")
    protected YesNoType fundonovd;
    @XmlElement(name = "MOVTOUNCLM")
    @XmlSchemaType(name = "string")
    protected YesNoType movtounclm;
    @XmlElement(name = "PAYBRN")
    protected String paybrn;
    @XmlElement(name = "PAYACC")
    protected String payacc;
    @XmlElement(name = "RDFREDAY")
    protected BigDecimal rdfreday;
    @XmlElement(name = "RDFREMTH")
    protected BigDecimal rdfremth;
    @XmlElement(name = "RDFREYEAR")
    protected BigDecimal rdfreyear;
    @XmlElement(name = "RDAMT")
    protected BigDecimal rdamt;
    @XmlElement(name = "MATURITY_AMT")
    protected BigDecimal maturityamt;
    @XmlElement(name = "INTEREST_RATE")
    protected BigDecimal interestrate;
    @XmlElement(name = "RDFLAG")
    @XmlSchemaType(name = "string")
    protected YesNoType rdflag;
    @XmlElement(name = "RDPAYSCHDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object rdpayschdt;
    @XmlElement(name = "STOCKCATALOGCODE")
    protected String stockcatalogcode;
    @XmlElement(name = "CERTNUM")
    protected BigDecimal certnum;
    @XmlElement(name = "CRB_DUP_IND")
    protected String crbdupind;

    /**
     * Gets the value of the liqdbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQDBRN() {
        return liqdbrn;
    }

    /**
     * Sets the value of the liqdbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQDBRN(String value) {
        this.liqdbrn = value;
    }

    /**
     * Gets the value of the liqdacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIQDACC() {
        return liqdacc;
    }

    /**
     * Sets the value of the liqdacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIQDACC(String value) {
        this.liqdacc = value;
    }

    /**
     * Gets the value of the intstdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINTSTDT() {
        return intstdt;
    }

    /**
     * Sets the value of the intstdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINTSTDT(Object value) {
        this.intstdt = value;
    }

    /**
     * Gets the value of the matdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMATDT() {
        return matdt;
    }

    /**
     * Sets the value of the matdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMATDT(Object value) {
        this.matdt = value;
    }

    /**
     * Gets the value of the nextmatdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNEXTMATDT() {
        return nextmatdt;
    }

    /**
     * Sets the value of the nextmatdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNEXTMATDT(Object value) {
        this.nextmatdt = value;
    }

    /**
     * Gets the value of the autoroll property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getAUTOROLL() {
        return autoroll;
    }

    /**
     * Sets the value of the autoroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setAUTOROLL(YesNoType value) {
        this.autoroll = value;
    }

    /**
     * Gets the value of the rolltype property.
     * 
     * @return
     *     possible object is
     *     {@link RolloverType }
     *     
     */
    public RolloverType getROLLTYPE() {
        return rolltype;
    }

    /**
     * Sets the value of the rolltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolloverType }
     *     
     */
    public void setROLLTYPE(RolloverType value) {
        this.rolltype = value;
    }

    /**
     * Gets the value of the rollamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getROLLAMT() {
        return rollamt;
    }

    /**
     * Sets the value of the rollamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setROLLAMT(BigDecimal value) {
        this.rollamt = value;
    }

    /**
     * Gets the value of the clonmat property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getCLONMAT() {
        return clonmat;
    }

    /**
     * Sets the value of the clonmat property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setCLONMAT(YesNoType value) {
        this.clonmat = value;
    }

    /**
     * Gets the value of the movintunclm property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getMOVINTUNCLM() {
        return movintunclm;
    }

    /**
     * Sets the value of the movintunclm property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setMOVINTUNCLM(YesNoType value) {
        this.movintunclm = value;
    }

    /**
     * Gets the value of the movpriunclm property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getMOVPRIUNCLM() {
        return movpriunclm;
    }

    /**
     * Sets the value of the movpriunclm property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setMOVPRIUNCLM(YesNoType value) {
        this.movpriunclm = value;
    }

    /**
     * Gets the value of the tdamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTDAMT() {
        return tdamt;
    }

    /**
     * Sets the value of the tdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTDAMT(BigDecimal value) {
        this.tdamt = value;
    }

    /**
     * Gets the value of the rdacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDACC() {
        return rdacc;
    }

    /**
     * Sets the value of the rdacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDACC(String value) {
        this.rdacc = value;
    }

    /**
     * Gets the value of the rdpaymntccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDPAYMNTCCY() {
        return rdpaymntccy;
    }

    /**
     * Sets the value of the rdpaymntccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDPAYMNTCCY(String value) {
        this.rdpaymntccy = value;
    }

    /**
     * Gets the value of the dftenor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDFTENOR() {
        return dftenor;
    }

    /**
     * Sets the value of the dftenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDFTENOR(BigDecimal value) {
        this.dftenor = value;
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
     * Gets the value of the payopt property.
     * 
     * @return
     *     possible object is
     *     {@link PayOptType }
     *     
     */
    public PayOptType getPAYOPT() {
        return payopt;
    }

    /**
     * Sets the value of the payopt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayOptType }
     *     
     */
    public void setPAYOPT(PayOptType value) {
        this.payopt = value;
    }

    /**
     * Gets the value of the offbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFBRN() {
        return offbrn;
    }

    /**
     * Sets the value of the offbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFBRN(String value) {
        this.offbrn = value;
    }

    /**
     * Gets the value of the offacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFACC() {
        return offacc;
    }

    /**
     * Sets the value of the offacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFACC(String value) {
        this.offacc = value;
    }

    /**
     * Gets the value of the autopay property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getAUTOPAY() {
        return autopay;
    }

    /**
     * Sets the value of the autopay property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setAUTOPAY(YesNoType value) {
        this.autopay = value;
    }

    /**
     * Gets the value of the fundonovd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getFUNDONOVD() {
        return fundonovd;
    }

    /**
     * Sets the value of the fundonovd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setFUNDONOVD(YesNoType value) {
        this.fundonovd = value;
    }

    /**
     * Gets the value of the movtounclm property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getMOVTOUNCLM() {
        return movtounclm;
    }

    /**
     * Sets the value of the movtounclm property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setMOVTOUNCLM(YesNoType value) {
        this.movtounclm = value;
    }

    /**
     * Gets the value of the paybrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYBRN() {
        return paybrn;
    }

    /**
     * Sets the value of the paybrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYBRN(String value) {
        this.paybrn = value;
    }

    /**
     * Gets the value of the payacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYACC() {
        return payacc;
    }

    /**
     * Sets the value of the payacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYACC(String value) {
        this.payacc = value;
    }

    /**
     * Gets the value of the rdfreday property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRDFREDAY() {
        return rdfreday;
    }

    /**
     * Sets the value of the rdfreday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRDFREDAY(BigDecimal value) {
        this.rdfreday = value;
    }

    /**
     * Gets the value of the rdfremth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRDFREMTH() {
        return rdfremth;
    }

    /**
     * Sets the value of the rdfremth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRDFREMTH(BigDecimal value) {
        this.rdfremth = value;
    }

    /**
     * Gets the value of the rdfreyear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRDFREYEAR() {
        return rdfreyear;
    }

    /**
     * Sets the value of the rdfreyear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRDFREYEAR(BigDecimal value) {
        this.rdfreyear = value;
    }

    /**
     * Gets the value of the rdamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRDAMT() {
        return rdamt;
    }

    /**
     * Sets the value of the rdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRDAMT(BigDecimal value) {
        this.rdamt = value;
    }

    /**
     * Gets the value of the maturityamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMATURITYAMT() {
        return maturityamt;
    }

    /**
     * Sets the value of the maturityamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMATURITYAMT(BigDecimal value) {
        this.maturityamt = value;
    }

    /**
     * Gets the value of the interestrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTERESTRATE() {
        return interestrate;
    }

    /**
     * Sets the value of the interestrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTERESTRATE(BigDecimal value) {
        this.interestrate = value;
    }

    /**
     * Gets the value of the rdflag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getRDFLAG() {
        return rdflag;
    }

    /**
     * Sets the value of the rdflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setRDFLAG(YesNoType value) {
        this.rdflag = value;
    }

    /**
     * Gets the value of the rdpayschdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRDPAYSCHDT() {
        return rdpayschdt;
    }

    /**
     * Sets the value of the rdpayschdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRDPAYSCHDT(Object value) {
        this.rdpayschdt = value;
    }

    /**
     * Gets the value of the stockcatalogcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOCKCATALOGCODE() {
        return stockcatalogcode;
    }

    /**
     * Sets the value of the stockcatalogcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOCKCATALOGCODE(String value) {
        this.stockcatalogcode = value;
    }

    /**
     * Gets the value of the certnum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCERTNUM() {
        return certnum;
    }

    /**
     * Sets the value of the certnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCERTNUM(BigDecimal value) {
        this.certnum = value;
    }

    /**
     * Gets the value of the crbdupind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRBDUPIND() {
        return crbdupind;
    }

    /**
     * Sets the value of the crbdupind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRBDUPIND(String value) {
        this.crbdupind = value;
    }

}
