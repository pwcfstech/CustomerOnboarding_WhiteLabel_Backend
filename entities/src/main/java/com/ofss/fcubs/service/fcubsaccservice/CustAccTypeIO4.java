
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAccType-IO4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAccType-IO4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOPENDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="XREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLRACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLRBNKCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCTYPE" type="{http://fcubs.ofss.com/service/FCUBSAccService}JntAccType" minOccurs="0"/>
 *         &lt;element name="NOM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHQBOOK" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="CHKNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHKNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYOFCHQ" type="{http://fcubs.ofss.com/service/FCUBSAccService}TyOfChkType" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKREQ" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKLVS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKLVL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PASSBOOK" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="LODGEBKFAC" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="MT210REQD" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="REFREQ" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="TRKREC" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ATM" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ATMACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATMDLIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FROZEN" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="AUTOSTATCHANGE" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="POSTALLOWED" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="DORM" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="DORMPRM" type="{http://fcubs.ofss.com/service/FCUBSAccService}DormPrmType" minOccurs="0"/>
 *         &lt;element name="ACSTATNOCR" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ACSTATNODR" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ACSTATSTPAY" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ALLWBKPERENTRY" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="TODLIMSTDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="TODLIMENDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="LINEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NETREQ" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="TODLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SUBLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UNCOLFUNDLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OFFLINELIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRTXNLMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRLMSTDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="CRLMREVDT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="ACSTMTTYPE" type="{http://fcubs.ofss.com/service/FCUBSAccService}ACSTMTType" minOccurs="0"/>
 *         &lt;element name="ACSTMTCYCLE" type="{http://fcubs.ofss.com/service/FCUBSAccService}ACSTMTCycleType" minOccurs="0"/>
 *         &lt;element name="ACSTMTDAY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GENSTMTMV" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ACSTMTTYPE2" type="{http://fcubs.ofss.com/service/FCUBSAccService}ACSTMTType" minOccurs="0"/>
 *         &lt;element name="ACSTMTCYCLE2" type="{http://fcubs.ofss.com/service/FCUBSAccService}ACSTMTCycleType" minOccurs="0"/>
 *         &lt;element name="ACSTMTDAY2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GENSTMTMV2" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="ACSTMTTYPE3" type="{http://fcubs.ofss.com/service/FCUBSAccService}ACSTMTType" minOccurs="0"/>
 *         &lt;element name="ACSTMTCYCLE3" type="{http://fcubs.ofss.com/service/FCUBSAccService}ACSTMTCycleType" minOccurs="0"/>
 *         &lt;element name="ACSTMTDAY3" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GENSTMTMV3" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="DISPIBANINADV" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="FLGEXCLRVRTRANS" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="STMTAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOPROVREQ" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="PROVCCYTYPE" type="{http://fcubs.ofss.com/service/FCUBSAccService}ProvCcyType" minOccurs="0"/>
 *         &lt;element name="RSKEXPAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EXPCATEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOCREXRATEAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AUTODREXRATEAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INHERITREP" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="MINREQBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SWPTYPE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="POSPAYAC" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="STDAYS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="REGCCAVL" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="REGDAPP" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="REGDPER" type="{http://fcubs.ofss.com/service/FCUBSAccService}RegDPerType" minOccurs="0"/>
 *         &lt;element name="Acstatuslines" type="{http://fcubs.ofss.com/service/FCUBSAccService}AcStatusLinesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Provdetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}AcProvDetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Slimintdet" type="{http://fcubs.ofss.com/service/FCUBSAccService}SlimIntDetailsType" minOccurs="0"/>
 *         &lt;element name="Chgdetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}ChgDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Chgcons" type="{http://fcubs.ofss.com/service/FCUBSAccService}ChgConsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Accaddress" type="{http://fcubs.ofss.com/service/FCUBSAccService}AccAddrType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Authbicdetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}AuthBICDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustAcc" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAccountMIS-Full-Type" minOccurs="0"/>
 *         &lt;element name="Udfdetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}UDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Accsigdetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}AccSigDetailsType" minOccurs="0"/>
 *         &lt;element name="Linkedentities" type="{http://fcubs.ofss.com/service/FCUBSAccService}LINKEDENTITYType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Intdetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}IntDetailsType"/>
 *         &lt;element name="Tddetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}TDInputType"/>
 *         &lt;element name="Tdpayindetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}TDPayInType" minOccurs="0"/>
 *         &lt;element name="Tdpayoutdetails" type="{http://fcubs.ofss.com/service/FCUBSAccService}TDPayOutType" minOccurs="0"/>
 *         &lt;element name="Dcdmaster" type="{http://fcubs.ofss.com/service/FCUBSAccService}DCDInputType"/>
 *         &lt;element name="Jointholders" type="{http://fcubs.ofss.com/service/FCUBSAccService}JointHoldersType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAccType-IO4", propOrder = {
    "brn",
    "acc",
    "custno",
    "accls",
    "ccy",
    "adesc",
    "ibanacno",
    "accopendt",
    "xref",
    "clracno",
    "clrbnkcd",
    "acctype",
    "nom1",
    "nom2",
    "chqbook",
    "chkname1",
    "chkname2",
    "tyofchq",
    "autoreorderchkreq",
    "autoreorderchklvs",
    "autoreorderchklvl",
    "passbook",
    "lodgebkfac",
    "mt210REQD",
    "refreq",
    "trkrec",
    "atm",
    "atmacc",
    "atmdlim",
    "frozen",
    "autostatchange",
    "postallowed",
    "dorm",
    "dormprm",
    "acstatnocr",
    "acstatnodr",
    "acstatstpay",
    "allwbkperentry",
    "todlimstdt",
    "todlimendt",
    "lineid",
    "netreq",
    "todlimit",
    "sublimit",
    "uncolfundlimit",
    "offlinelim",
    "crtxnlmt",
    "crlmstdt",
    "crlmrevdt",
    "acstmttype",
    "acstmtcycle",
    "acstmtday",
    "genstmtmv",
    "acstmttype2",
    "acstmtcycle2",
    "acstmtday2",
    "genstmtmv2",
    "acstmttype3",
    "acstmtcycle3",
    "acstmtday3",
    "genstmtmv3",
    "dispibaninadv",
    "flgexclrvrtrans",
    "stmtac",
    "autoprovreq",
    "provccytype",
    "rskexpamt",
    "expcateg",
    "autocrexrateamt",
    "autodrexrateamt",
    "inheritrep",
    "minreqbal",
    "swptype",
    "pospayac",
    "stdays",
    "regccavl",
    "regdapp",
    "regdper",
    "acstatuslines",
    "provdetails",
    "slimintdet",
    "chgdetails",
    "chgcons",
    "accaddress",
    "authbicdetails",
    "custAcc",
    "udfdetails",
    "accsigdetails",
    "linkedentities",
    "intdetails",
    "tddetails",
    "tdpayindetails",
    "tdpayoutdetails",
    "dcdmaster",
    "jointholders"
})
public class CustAccTypeIO4 {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "CUSTNO", required = true)
    protected String custno;
    @XmlElement(name = "ACCLS", required = true)
    protected String accls;
    @XmlElement(name = "CCY", required = true)
    protected String ccy;
    @XmlElement(name = "ADESC")
    protected String adesc;
    @XmlElement(name = "IBANACNO")
    protected String ibanacno;
    @XmlElement(name = "ACCOPENDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object accopendt;
    @XmlElement(name = "XREF")
    protected String xref;
    @XmlElement(name = "CLRACNO")
    protected String clracno;
    @XmlElement(name = "CLRBNKCD")
    protected String clrbnkcd;
    @XmlElement(name = "ACCTYPE")
    @XmlSchemaType(name = "string")
    protected JntAccType acctype;
    @XmlElement(name = "NOM1")
    protected String nom1;
    @XmlElement(name = "NOM2")
    protected String nom2;
    @XmlElement(name = "CHQBOOK")
    @XmlSchemaType(name = "string")
    protected YesNoType chqbook;
    @XmlElement(name = "CHKNAME1")
    protected String chkname1;
    @XmlElement(name = "CHKNAME2")
    protected String chkname2;
    @XmlElement(name = "TYOFCHQ")
    @XmlSchemaType(name = "string")
    protected TyOfChkType tyofchq;
    @XmlElement(name = "AUTOREORDERCHKREQ")
    @XmlSchemaType(name = "string")
    protected YesNoType autoreorderchkreq;
    @XmlElement(name = "AUTOREORDERCHKLVS")
    protected BigInteger autoreorderchklvs;
    @XmlElement(name = "AUTOREORDERCHKLVL")
    protected BigInteger autoreorderchklvl;
    @XmlElement(name = "PASSBOOK")
    @XmlSchemaType(name = "string")
    protected YesNoType passbook;
    @XmlElement(name = "LODGEBKFAC")
    @XmlSchemaType(name = "string")
    protected YesNoType lodgebkfac;
    @XmlElement(name = "MT210REQD")
    @XmlSchemaType(name = "string")
    protected YesNoType mt210REQD;
    @XmlElement(name = "REFREQ")
    @XmlSchemaType(name = "string")
    protected YesNoType refreq;
    @XmlElement(name = "TRKREC")
    @XmlSchemaType(name = "string")
    protected YesNoType trkrec;
    @XmlElement(name = "ATM")
    @XmlSchemaType(name = "string")
    protected YesNoType atm;
    @XmlElement(name = "ATMACC")
    protected String atmacc;
    @XmlElement(name = "ATMDLIM")
    protected BigDecimal atmdlim;
    @XmlElement(name = "FROZEN")
    @XmlSchemaType(name = "string")
    protected YesNoType frozen;
    @XmlElement(name = "AUTOSTATCHANGE")
    @XmlSchemaType(name = "string")
    protected YesNoType autostatchange;
    @XmlElement(name = "POSTALLOWED")
    @XmlSchemaType(name = "string")
    protected YesNoType postallowed;
    @XmlElement(name = "DORM")
    @XmlSchemaType(name = "string")
    protected YesNoType dorm;
    @XmlElement(name = "DORMPRM")
    @XmlSchemaType(name = "string")
    protected DormPrmType dormprm;
    @XmlElement(name = "ACSTATNOCR")
    @XmlSchemaType(name = "string")
    protected YesNoType acstatnocr;
    @XmlElement(name = "ACSTATNODR")
    @XmlSchemaType(name = "string")
    protected YesNoType acstatnodr;
    @XmlElement(name = "ACSTATSTPAY")
    @XmlSchemaType(name = "string")
    protected YesNoType acstatstpay;
    @XmlElement(name = "ALLWBKPERENTRY")
    @XmlSchemaType(name = "string")
    protected YesNoType allwbkperentry;
    @XmlElement(name = "TODLIMSTDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object todlimstdt;
    @XmlElement(name = "TODLIMENDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object todlimendt;
    @XmlElement(name = "LINEID")
    protected String lineid;
    @XmlElement(name = "NETREQ")
    @XmlSchemaType(name = "string")
    protected YesNoType netreq;
    @XmlElement(name = "TODLIMIT")
    protected BigDecimal todlimit;
    @XmlElement(name = "SUBLIMIT")
    protected BigDecimal sublimit;
    @XmlElement(name = "UNCOLFUNDLIMIT")
    protected BigDecimal uncolfundlimit;
    @XmlElement(name = "OFFLINELIM")
    protected BigDecimal offlinelim;
    @XmlElement(name = "CRTXNLMT")
    protected BigDecimal crtxnlmt;
    @XmlElement(name = "CRLMSTDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object crlmstdt;
    @XmlElement(name = "CRLMREVDT")
    @XmlSchemaType(name = "anySimpleType")
    protected Object crlmrevdt;
    @XmlElement(name = "ACSTMTTYPE")
    @XmlSchemaType(name = "string")
    protected ACSTMTType acstmttype;
    @XmlElement(name = "ACSTMTCYCLE")
    @XmlSchemaType(name = "string")
    protected ACSTMTCycleType acstmtcycle;
    @XmlElement(name = "ACSTMTDAY")
    protected BigInteger acstmtday;
    @XmlElement(name = "GENSTMTMV")
    @XmlSchemaType(name = "string")
    protected YesNoType genstmtmv;
    @XmlElement(name = "ACSTMTTYPE2")
    @XmlSchemaType(name = "string")
    protected ACSTMTType acstmttype2;
    @XmlElement(name = "ACSTMTCYCLE2")
    @XmlSchemaType(name = "string")
    protected ACSTMTCycleType acstmtcycle2;
    @XmlElement(name = "ACSTMTDAY2")
    protected BigInteger acstmtday2;
    @XmlElement(name = "GENSTMTMV2")
    @XmlSchemaType(name = "string")
    protected YesNoType genstmtmv2;
    @XmlElement(name = "ACSTMTTYPE3")
    @XmlSchemaType(name = "string")
    protected ACSTMTType acstmttype3;
    @XmlElement(name = "ACSTMTCYCLE3")
    @XmlSchemaType(name = "string")
    protected ACSTMTCycleType acstmtcycle3;
    @XmlElement(name = "ACSTMTDAY3")
    protected BigInteger acstmtday3;
    @XmlElement(name = "GENSTMTMV3")
    @XmlSchemaType(name = "string")
    protected YesNoType genstmtmv3;
    @XmlElement(name = "DISPIBANINADV")
    @XmlSchemaType(name = "string")
    protected YesNoType dispibaninadv;
    @XmlElement(name = "FLGEXCLRVRTRANS")
    @XmlSchemaType(name = "string")
    protected YesNoType flgexclrvrtrans;
    @XmlElement(name = "STMTAC")
    protected String stmtac;
    @XmlElement(name = "AUTOPROVREQ")
    @XmlSchemaType(name = "string")
    protected YesNoType autoprovreq;
    @XmlElement(name = "PROVCCYTYPE")
    @XmlSchemaType(name = "string")
    protected ProvCcyType provccytype;
    @XmlElement(name = "RSKEXPAMT")
    protected BigDecimal rskexpamt;
    @XmlElement(name = "EXPCATEG")
    protected String expcateg;
    @XmlElement(name = "AUTOCREXRATEAMT")
    protected BigDecimal autocrexrateamt;
    @XmlElement(name = "AUTODREXRATEAMT")
    protected BigDecimal autodrexrateamt;
    @XmlElement(name = "INHERITREP")
    @XmlSchemaType(name = "string")
    protected YesNoType inheritrep;
    @XmlElement(name = "MINREQBAL")
    protected BigDecimal minreqbal;
    @XmlElement(name = "SWPTYPE")
    protected BigInteger swptype;
    @XmlElement(name = "POSPAYAC")
    @XmlSchemaType(name = "string")
    protected YesNoType pospayac;
    @XmlElement(name = "STDAYS")
    protected BigInteger stdays;
    @XmlElement(name = "REGCCAVL")
    @XmlSchemaType(name = "string")
    protected YesNoType regccavl;
    @XmlElement(name = "REGDAPP")
    @XmlSchemaType(name = "string")
    protected YesNoType regdapp;
    @XmlElement(name = "REGDPER")
    @XmlSchemaType(name = "string")
    protected RegDPerType regdper;
    @XmlElement(name = "Acstatuslines")
    protected List<AcStatusLinesType> acstatuslines;
    @XmlElement(name = "Provdetails")
    protected List<AcProvDetType> provdetails;
    @XmlElement(name = "Slimintdet")
    protected SlimIntDetailsType slimintdet;
    @XmlElement(name = "Chgdetails")
    protected List<ChgDetailsType> chgdetails;
    @XmlElement(name = "Chgcons")
    protected List<ChgConsType> chgcons;
    @XmlElement(name = "Accaddress")
    protected List<AccAddrType> accaddress;
    @XmlElement(name = "Authbicdetails")
    protected List<AuthBICDetailsType> authbicdetails;
    @XmlElement(name = "CustAcc")
    protected CustAccountMISFullType custAcc;
    @XmlElement(name = "Udfdetails")
    protected List<UDFDETAILSType> udfdetails;
    @XmlElement(name = "Accsigdetails")
    protected AccSigDetailsType accsigdetails;
    @XmlElement(name = "Linkedentities")
    protected List<LINKEDENTITYType> linkedentities;
    @XmlElement(name = "Intdetails", required = true)
    protected IntDetailsType intdetails;
    @XmlElement(name = "Tddetails", required = true)
    protected TDInputType tddetails;
    @XmlElement(name = "Tdpayindetails")
    protected TDPayInType tdpayindetails;
    @XmlElement(name = "Tdpayoutdetails")
    protected TDPayOutType tdpayoutdetails;
    @XmlElement(name = "Dcdmaster", required = true)
    protected DCDInputType dcdmaster;
    @XmlElement(name = "Jointholders")
    protected List<JointHoldersType> jointholders;

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
     * Gets the value of the ibanacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANACNO() {
        return ibanacno;
    }

    /**
     * Sets the value of the ibanacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANACNO(String value) {
        this.ibanacno = value;
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
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXREF() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXREF(String value) {
        this.xref = value;
    }

    /**
     * Gets the value of the clracno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLRACNO() {
        return clracno;
    }

    /**
     * Sets the value of the clracno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLRACNO(String value) {
        this.clracno = value;
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
     * Gets the value of the nom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOM1() {
        return nom1;
    }

    /**
     * Sets the value of the nom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOM1(String value) {
        this.nom1 = value;
    }

    /**
     * Gets the value of the nom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOM2() {
        return nom2;
    }

    /**
     * Sets the value of the nom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOM2(String value) {
        this.nom2 = value;
    }

    /**
     * Gets the value of the chqbook property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getCHQBOOK() {
        return chqbook;
    }

    /**
     * Sets the value of the chqbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setCHQBOOK(YesNoType value) {
        this.chqbook = value;
    }

    /**
     * Gets the value of the chkname1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKNAME1() {
        return chkname1;
    }

    /**
     * Sets the value of the chkname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKNAME1(String value) {
        this.chkname1 = value;
    }

    /**
     * Gets the value of the chkname2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKNAME2() {
        return chkname2;
    }

    /**
     * Sets the value of the chkname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKNAME2(String value) {
        this.chkname2 = value;
    }

    /**
     * Gets the value of the tyofchq property.
     * 
     * @return
     *     possible object is
     *     {@link TyOfChkType }
     *     
     */
    public TyOfChkType getTYOFCHQ() {
        return tyofchq;
    }

    /**
     * Sets the value of the tyofchq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TyOfChkType }
     *     
     */
    public void setTYOFCHQ(TyOfChkType value) {
        this.tyofchq = value;
    }

    /**
     * Gets the value of the autoreorderchkreq property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getAUTOREORDERCHKREQ() {
        return autoreorderchkreq;
    }

    /**
     * Sets the value of the autoreorderchkreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setAUTOREORDERCHKREQ(YesNoType value) {
        this.autoreorderchkreq = value;
    }

    /**
     * Gets the value of the autoreorderchklvs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAUTOREORDERCHKLVS() {
        return autoreorderchklvs;
    }

    /**
     * Sets the value of the autoreorderchklvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAUTOREORDERCHKLVS(BigInteger value) {
        this.autoreorderchklvs = value;
    }

    /**
     * Gets the value of the autoreorderchklvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAUTOREORDERCHKLVL() {
        return autoreorderchklvl;
    }

    /**
     * Sets the value of the autoreorderchklvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAUTOREORDERCHKLVL(BigInteger value) {
        this.autoreorderchklvl = value;
    }

    /**
     * Gets the value of the passbook property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getPASSBOOK() {
        return passbook;
    }

    /**
     * Sets the value of the passbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setPASSBOOK(YesNoType value) {
        this.passbook = value;
    }

    /**
     * Gets the value of the lodgebkfac property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getLODGEBKFAC() {
        return lodgebkfac;
    }

    /**
     * Sets the value of the lodgebkfac property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setLODGEBKFAC(YesNoType value) {
        this.lodgebkfac = value;
    }

    /**
     * Gets the value of the mt210REQD property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getMT210REQD() {
        return mt210REQD;
    }

    /**
     * Sets the value of the mt210REQD property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setMT210REQD(YesNoType value) {
        this.mt210REQD = value;
    }

    /**
     * Gets the value of the refreq property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getREFREQ() {
        return refreq;
    }

    /**
     * Sets the value of the refreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setREFREQ(YesNoType value) {
        this.refreq = value;
    }

    /**
     * Gets the value of the trkrec property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getTRKREC() {
        return trkrec;
    }

    /**
     * Sets the value of the trkrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setTRKREC(YesNoType value) {
        this.trkrec = value;
    }

    /**
     * Gets the value of the atm property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getATM() {
        return atm;
    }

    /**
     * Sets the value of the atm property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setATM(YesNoType value) {
        this.atm = value;
    }

    /**
     * Gets the value of the atmacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMACC() {
        return atmacc;
    }

    /**
     * Sets the value of the atmacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMACC(String value) {
        this.atmacc = value;
    }

    /**
     * Gets the value of the atmdlim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMDLIM() {
        return atmdlim;
    }

    /**
     * Sets the value of the atmdlim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setATMDLIM(BigDecimal value) {
        this.atmdlim = value;
    }

    /**
     * Gets the value of the frozen property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getFROZEN() {
        return frozen;
    }

    /**
     * Sets the value of the frozen property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setFROZEN(YesNoType value) {
        this.frozen = value;
    }

    /**
     * Gets the value of the autostatchange property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getAUTOSTATCHANGE() {
        return autostatchange;
    }

    /**
     * Sets the value of the autostatchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setAUTOSTATCHANGE(YesNoType value) {
        this.autostatchange = value;
    }

    /**
     * Gets the value of the postallowed property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getPOSTALLOWED() {
        return postallowed;
    }

    /**
     * Sets the value of the postallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setPOSTALLOWED(YesNoType value) {
        this.postallowed = value;
    }

    /**
     * Gets the value of the dorm property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDORM() {
        return dorm;
    }

    /**
     * Sets the value of the dorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDORM(YesNoType value) {
        this.dorm = value;
    }

    /**
     * Gets the value of the dormprm property.
     * 
     * @return
     *     possible object is
     *     {@link DormPrmType }
     *     
     */
    public DormPrmType getDORMPRM() {
        return dormprm;
    }

    /**
     * Sets the value of the dormprm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DormPrmType }
     *     
     */
    public void setDORMPRM(DormPrmType value) {
        this.dormprm = value;
    }

    /**
     * Gets the value of the acstatnocr property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getACSTATNOCR() {
        return acstatnocr;
    }

    /**
     * Sets the value of the acstatnocr property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setACSTATNOCR(YesNoType value) {
        this.acstatnocr = value;
    }

    /**
     * Gets the value of the acstatnodr property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getACSTATNODR() {
        return acstatnodr;
    }

    /**
     * Sets the value of the acstatnodr property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setACSTATNODR(YesNoType value) {
        this.acstatnodr = value;
    }

    /**
     * Gets the value of the acstatstpay property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getACSTATSTPAY() {
        return acstatstpay;
    }

    /**
     * Sets the value of the acstatstpay property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setACSTATSTPAY(YesNoType value) {
        this.acstatstpay = value;
    }

    /**
     * Gets the value of the allwbkperentry property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getALLWBKPERENTRY() {
        return allwbkperentry;
    }

    /**
     * Sets the value of the allwbkperentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setALLWBKPERENTRY(YesNoType value) {
        this.allwbkperentry = value;
    }

    /**
     * Gets the value of the todlimstdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTODLIMSTDT() {
        return todlimstdt;
    }

    /**
     * Sets the value of the todlimstdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTODLIMSTDT(Object value) {
        this.todlimstdt = value;
    }

    /**
     * Gets the value of the todlimendt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTODLIMENDT() {
        return todlimendt;
    }

    /**
     * Sets the value of the todlimendt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTODLIMENDT(Object value) {
        this.todlimendt = value;
    }

    /**
     * Gets the value of the lineid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEID() {
        return lineid;
    }

    /**
     * Sets the value of the lineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEID(String value) {
        this.lineid = value;
    }

    /**
     * Gets the value of the netreq property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getNETREQ() {
        return netreq;
    }

    /**
     * Sets the value of the netreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setNETREQ(YesNoType value) {
        this.netreq = value;
    }

    /**
     * Gets the value of the todlimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTODLIMIT() {
        return todlimit;
    }

    /**
     * Sets the value of the todlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTODLIMIT(BigDecimal value) {
        this.todlimit = value;
    }

    /**
     * Gets the value of the sublimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUBLIMIT() {
        return sublimit;
    }

    /**
     * Sets the value of the sublimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUBLIMIT(BigDecimal value) {
        this.sublimit = value;
    }

    /**
     * Gets the value of the uncolfundlimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUNCOLFUNDLIMIT() {
        return uncolfundlimit;
    }

    /**
     * Sets the value of the uncolfundlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUNCOLFUNDLIMIT(BigDecimal value) {
        this.uncolfundlimit = value;
    }

    /**
     * Gets the value of the offlinelim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOFFLINELIM() {
        return offlinelim;
    }

    /**
     * Sets the value of the offlinelim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOFFLINELIM(BigDecimal value) {
        this.offlinelim = value;
    }

    /**
     * Gets the value of the crtxnlmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRTXNLMT() {
        return crtxnlmt;
    }

    /**
     * Sets the value of the crtxnlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRTXNLMT(BigDecimal value) {
        this.crtxnlmt = value;
    }

    /**
     * Gets the value of the crlmstdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCRLMSTDT() {
        return crlmstdt;
    }

    /**
     * Sets the value of the crlmstdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCRLMSTDT(Object value) {
        this.crlmstdt = value;
    }

    /**
     * Gets the value of the crlmrevdt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCRLMREVDT() {
        return crlmrevdt;
    }

    /**
     * Sets the value of the crlmrevdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCRLMREVDT(Object value) {
        this.crlmrevdt = value;
    }

    /**
     * Gets the value of the acstmttype property.
     * 
     * @return
     *     possible object is
     *     {@link ACSTMTType }
     *     
     */
    public ACSTMTType getACSTMTTYPE() {
        return acstmttype;
    }

    /**
     * Sets the value of the acstmttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSTMTType }
     *     
     */
    public void setACSTMTTYPE(ACSTMTType value) {
        this.acstmttype = value;
    }

    /**
     * Gets the value of the acstmtcycle property.
     * 
     * @return
     *     possible object is
     *     {@link ACSTMTCycleType }
     *     
     */
    public ACSTMTCycleType getACSTMTCYCLE() {
        return acstmtcycle;
    }

    /**
     * Sets the value of the acstmtcycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSTMTCycleType }
     *     
     */
    public void setACSTMTCYCLE(ACSTMTCycleType value) {
        this.acstmtcycle = value;
    }

    /**
     * Gets the value of the acstmtday property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACSTMTDAY() {
        return acstmtday;
    }

    /**
     * Sets the value of the acstmtday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACSTMTDAY(BigInteger value) {
        this.acstmtday = value;
    }

    /**
     * Gets the value of the genstmtmv property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getGENSTMTMV() {
        return genstmtmv;
    }

    /**
     * Sets the value of the genstmtmv property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setGENSTMTMV(YesNoType value) {
        this.genstmtmv = value;
    }

    /**
     * Gets the value of the acstmttype2 property.
     * 
     * @return
     *     possible object is
     *     {@link ACSTMTType }
     *     
     */
    public ACSTMTType getACSTMTTYPE2() {
        return acstmttype2;
    }

    /**
     * Sets the value of the acstmttype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSTMTType }
     *     
     */
    public void setACSTMTTYPE2(ACSTMTType value) {
        this.acstmttype2 = value;
    }

    /**
     * Gets the value of the acstmtcycle2 property.
     * 
     * @return
     *     possible object is
     *     {@link ACSTMTCycleType }
     *     
     */
    public ACSTMTCycleType getACSTMTCYCLE2() {
        return acstmtcycle2;
    }

    /**
     * Sets the value of the acstmtcycle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSTMTCycleType }
     *     
     */
    public void setACSTMTCYCLE2(ACSTMTCycleType value) {
        this.acstmtcycle2 = value;
    }

    /**
     * Gets the value of the acstmtday2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACSTMTDAY2() {
        return acstmtday2;
    }

    /**
     * Sets the value of the acstmtday2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACSTMTDAY2(BigInteger value) {
        this.acstmtday2 = value;
    }

    /**
     * Gets the value of the genstmtmv2 property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getGENSTMTMV2() {
        return genstmtmv2;
    }

    /**
     * Sets the value of the genstmtmv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setGENSTMTMV2(YesNoType value) {
        this.genstmtmv2 = value;
    }

    /**
     * Gets the value of the acstmttype3 property.
     * 
     * @return
     *     possible object is
     *     {@link ACSTMTType }
     *     
     */
    public ACSTMTType getACSTMTTYPE3() {
        return acstmttype3;
    }

    /**
     * Sets the value of the acstmttype3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSTMTType }
     *     
     */
    public void setACSTMTTYPE3(ACSTMTType value) {
        this.acstmttype3 = value;
    }

    /**
     * Gets the value of the acstmtcycle3 property.
     * 
     * @return
     *     possible object is
     *     {@link ACSTMTCycleType }
     *     
     */
    public ACSTMTCycleType getACSTMTCYCLE3() {
        return acstmtcycle3;
    }

    /**
     * Sets the value of the acstmtcycle3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSTMTCycleType }
     *     
     */
    public void setACSTMTCYCLE3(ACSTMTCycleType value) {
        this.acstmtcycle3 = value;
    }

    /**
     * Gets the value of the acstmtday3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACSTMTDAY3() {
        return acstmtday3;
    }

    /**
     * Sets the value of the acstmtday3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACSTMTDAY3(BigInteger value) {
        this.acstmtday3 = value;
    }

    /**
     * Gets the value of the genstmtmv3 property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getGENSTMTMV3() {
        return genstmtmv3;
    }

    /**
     * Sets the value of the genstmtmv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setGENSTMTMV3(YesNoType value) {
        this.genstmtmv3 = value;
    }

    /**
     * Gets the value of the dispibaninadv property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getDISPIBANINADV() {
        return dispibaninadv;
    }

    /**
     * Sets the value of the dispibaninadv property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setDISPIBANINADV(YesNoType value) {
        this.dispibaninadv = value;
    }

    /**
     * Gets the value of the flgexclrvrtrans property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getFLGEXCLRVRTRANS() {
        return flgexclrvrtrans;
    }

    /**
     * Sets the value of the flgexclrvrtrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setFLGEXCLRVRTRANS(YesNoType value) {
        this.flgexclrvrtrans = value;
    }

    /**
     * Gets the value of the stmtac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTAC() {
        return stmtac;
    }

    /**
     * Sets the value of the stmtac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTAC(String value) {
        this.stmtac = value;
    }

    /**
     * Gets the value of the autoprovreq property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getAUTOPROVREQ() {
        return autoprovreq;
    }

    /**
     * Sets the value of the autoprovreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setAUTOPROVREQ(YesNoType value) {
        this.autoprovreq = value;
    }

    /**
     * Gets the value of the provccytype property.
     * 
     * @return
     *     possible object is
     *     {@link ProvCcyType }
     *     
     */
    public ProvCcyType getPROVCCYTYPE() {
        return provccytype;
    }

    /**
     * Sets the value of the provccytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvCcyType }
     *     
     */
    public void setPROVCCYTYPE(ProvCcyType value) {
        this.provccytype = value;
    }

    /**
     * Gets the value of the rskexpamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRSKEXPAMT() {
        return rskexpamt;
    }

    /**
     * Sets the value of the rskexpamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRSKEXPAMT(BigDecimal value) {
        this.rskexpamt = value;
    }

    /**
     * Gets the value of the expcateg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPCATEG() {
        return expcateg;
    }

    /**
     * Sets the value of the expcateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPCATEG(String value) {
        this.expcateg = value;
    }

    /**
     * Gets the value of the autocrexrateamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAUTOCREXRATEAMT() {
        return autocrexrateamt;
    }

    /**
     * Sets the value of the autocrexrateamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAUTOCREXRATEAMT(BigDecimal value) {
        this.autocrexrateamt = value;
    }

    /**
     * Gets the value of the autodrexrateamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAUTODREXRATEAMT() {
        return autodrexrateamt;
    }

    /**
     * Sets the value of the autodrexrateamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAUTODREXRATEAMT(BigDecimal value) {
        this.autodrexrateamt = value;
    }

    /**
     * Gets the value of the inheritrep property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getINHERITREP() {
        return inheritrep;
    }

    /**
     * Sets the value of the inheritrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setINHERITREP(YesNoType value) {
        this.inheritrep = value;
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
     * Gets the value of the pospayac property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getPOSPAYAC() {
        return pospayac;
    }

    /**
     * Sets the value of the pospayac property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setPOSPAYAC(YesNoType value) {
        this.pospayac = value;
    }

    /**
     * Gets the value of the stdays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTDAYS() {
        return stdays;
    }

    /**
     * Sets the value of the stdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTDAYS(BigInteger value) {
        this.stdays = value;
    }

    /**
     * Gets the value of the regccavl property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getREGCCAVL() {
        return regccavl;
    }

    /**
     * Sets the value of the regccavl property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setREGCCAVL(YesNoType value) {
        this.regccavl = value;
    }

    /**
     * Gets the value of the regdapp property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getREGDAPP() {
        return regdapp;
    }

    /**
     * Sets the value of the regdapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setREGDAPP(YesNoType value) {
        this.regdapp = value;
    }

    /**
     * Gets the value of the regdper property.
     * 
     * @return
     *     possible object is
     *     {@link RegDPerType }
     *     
     */
    public RegDPerType getREGDPER() {
        return regdper;
    }

    /**
     * Sets the value of the regdper property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegDPerType }
     *     
     */
    public void setREGDPER(RegDPerType value) {
        this.regdper = value;
    }

    /**
     * Gets the value of the acstatuslines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acstatuslines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcstatuslines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcStatusLinesType }
     * 
     * 
     */
    public List<AcStatusLinesType> getAcstatuslines() {
        if (acstatuslines == null) {
            acstatuslines = new ArrayList<AcStatusLinesType>();
        }
        return this.acstatuslines;
    }

    /**
     * Gets the value of the provdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcProvDetType }
     * 
     * 
     */
    public List<AcProvDetType> getProvdetails() {
        if (provdetails == null) {
            provdetails = new ArrayList<AcProvDetType>();
        }
        return this.provdetails;
    }

    /**
     * Gets the value of the slimintdet property.
     * 
     * @return
     *     possible object is
     *     {@link SlimIntDetailsType }
     *     
     */
    public SlimIntDetailsType getSlimintdet() {
        return slimintdet;
    }

    /**
     * Sets the value of the slimintdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlimIntDetailsType }
     *     
     */
    public void setSlimintdet(SlimIntDetailsType value) {
        this.slimintdet = value;
    }

    /**
     * Gets the value of the chgdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chgdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChgdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChgDetailsType }
     * 
     * 
     */
    public List<ChgDetailsType> getChgdetails() {
        if (chgdetails == null) {
            chgdetails = new ArrayList<ChgDetailsType>();
        }
        return this.chgdetails;
    }

    /**
     * Gets the value of the chgcons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chgcons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChgcons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChgConsType }
     * 
     * 
     */
    public List<ChgConsType> getChgcons() {
        if (chgcons == null) {
            chgcons = new ArrayList<ChgConsType>();
        }
        return this.chgcons;
    }

    /**
     * Gets the value of the accaddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accaddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccaddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccAddrType }
     * 
     * 
     */
    public List<AccAddrType> getAccaddress() {
        if (accaddress == null) {
            accaddress = new ArrayList<AccAddrType>();
        }
        return this.accaddress;
    }

    /**
     * Gets the value of the authbicdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authbicdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthbicdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthBICDetailsType }
     * 
     * 
     */
    public List<AuthBICDetailsType> getAuthbicdetails() {
        if (authbicdetails == null) {
            authbicdetails = new ArrayList<AuthBICDetailsType>();
        }
        return this.authbicdetails;
    }

    /**
     * Gets the value of the custAcc property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccountMISFullType }
     *     
     */
    public CustAccountMISFullType getCustAcc() {
        return custAcc;
    }

    /**
     * Sets the value of the custAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccountMISFullType }
     *     
     */
    public void setCustAcc(CustAccountMISFullType value) {
        this.custAcc = value;
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
     *    getUdfdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType }
     * 
     * 
     */
    public List<UDFDETAILSType> getUdfdetails() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType>();
        }
        return this.udfdetails;
    }

    /**
     * Gets the value of the accsigdetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccSigDetailsType }
     *     
     */
    public AccSigDetailsType getAccsigdetails() {
        return accsigdetails;
    }

    /**
     * Sets the value of the accsigdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccSigDetailsType }
     *     
     */
    public void setAccsigdetails(AccSigDetailsType value) {
        this.accsigdetails = value;
    }

    /**
     * Gets the value of the linkedentities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedentities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedentities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINKEDENTITYType }
     * 
     * 
     */
    public List<LINKEDENTITYType> getLinkedentities() {
        if (linkedentities == null) {
            linkedentities = new ArrayList<LINKEDENTITYType>();
        }
        return this.linkedentities;
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

    /**
     * Gets the value of the tdpayindetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDPayInType }
     *     
     */
    public TDPayInType getTdpayindetails() {
        return tdpayindetails;
    }

    /**
     * Sets the value of the tdpayindetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDPayInType }
     *     
     */
    public void setTdpayindetails(TDPayInType value) {
        this.tdpayindetails = value;
    }

    /**
     * Gets the value of the tdpayoutdetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDPayOutType }
     *     
     */
    public TDPayOutType getTdpayoutdetails() {
        return tdpayoutdetails;
    }

    /**
     * Sets the value of the tdpayoutdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDPayOutType }
     *     
     */
    public void setTdpayoutdetails(TDPayOutType value) {
        this.tdpayoutdetails = value;
    }

    /**
     * Gets the value of the dcdmaster property.
     * 
     * @return
     *     possible object is
     *     {@link DCDInputType }
     *     
     */
    public DCDInputType getDcdmaster() {
        return dcdmaster;
    }

    /**
     * Sets the value of the dcdmaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCDInputType }
     *     
     */
    public void setDcdmaster(DCDInputType value) {
        this.dcdmaster = value;
    }

    /**
     * Gets the value of the jointholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jointholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJointholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JointHoldersType }
     * 
     * 
     */
    public List<JointHoldersType> getJointholders() {
        if (jointholders == null) {
            jointholders = new ArrayList<JointHoldersType>();
        }
        return this.jointholders;
    }

}
