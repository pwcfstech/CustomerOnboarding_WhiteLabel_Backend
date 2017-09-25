
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
 * <p>Java class for Stccuacc-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stccuacc-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ALT_ACC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHQBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATMACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATMDLIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ATMDCNTLIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHKNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHKNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKLVL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKLVS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DORMPRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTO_CHEQUE_BOOK_REQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTO_DEBIT_CARD_REQUEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAX_NO_CHEQUE_REJECTIONS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACC_OPENING_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GL_ACCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OFFSET_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAY_IN_OPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAIVE_ACC_OPEN_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODATMBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRACK_LIMITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIABNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIABID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REPL_CUST_SIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALARY_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SDREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPDANLSYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Jointholders" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JNTHLDCDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JNTHLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Acc-Nominees" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RELSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOMMINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GUARDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GUARDRELNSHP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Doctype-Checklist" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MANDATORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Doctype-Remarks1" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cust-Acc-Check" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHECK_LEAVES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CHEQUE_BOOK_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ORDER_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LANG_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cust-Acc-Card" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CARD_BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Udfdetails" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FLDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FLDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DATATYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VALTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Misdetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TXNMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCOD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFRTSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="REFRTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="POOLCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RTFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REFRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CALCMETH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISGRPTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MISGRPCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Stccuacc-Modify-IO-Type", propOrder = {
    "brn",
    "acc",
    "acdesc",
    "custno",
    "acopendate",
    "altaccno",
    "chqbook",
    "atm",
    "passbook",
    "atmacc",
    "atmdlim",
    "atmdcntlim",
    "chkname1",
    "chkname2",
    "autoreorderchkreq",
    "autoreorderchklvl",
    "autoreorderchklvs",
    "dormprm",
    "location",
    "opmode",
    "countrycode",
    "autochequebookreq",
    "autodebitcardrequest",
    "accounttype",
    "maxnochequerejections",
    "accopeningamt",
    "glaccc",
    "offsetbrn",
    "payinoption",
    "waiveaccopencharge",
    "codatmbrn",
    "tracklimits",
    "liabno",
    "liabid",
    "replcustsig",
    "salaryaccount",
    "sdrefno",
    "spdanlsys",
    "jointholders",
    "accNominees",
    "doctypeChecklist",
    "doctypeRemarks1",
    "custAccCheck",
    "custAccCard",
    "udfdetails",
    "misdetails"
})
public class StccuaccModifyIOType {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "ACC", required = true)
    protected String acc;
    @XmlElement(name = "AC_DESC")
    protected String acdesc;
    @XmlElement(name = "CUST_NO", required = true)
    protected String custno;
    @XmlElement(name = "AC_OPEN_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acopendate;
    @XmlElement(name = "ALT_ACC_NO")
    protected String altaccno;
    @XmlElement(name = "CHQBOOK")
    protected String chqbook;
    @XmlElement(name = "ATM")
    protected String atm;
    @XmlElement(name = "PASSBOOK")
    protected String passbook;
    @XmlElement(name = "ATMACC")
    protected String atmacc;
    @XmlElement(name = "ATMDLIM")
    protected BigDecimal atmdlim;
    @XmlElement(name = "ATMDCNTLIM")
    protected BigDecimal atmdcntlim;
    @XmlElement(name = "CHKNAME1")
    protected String chkname1;
    @XmlElement(name = "CHKNAME2")
    protected String chkname2;
    @XmlElement(name = "AUTOREORDERCHKREQ")
    protected String autoreorderchkreq;
    @XmlElement(name = "AUTOREORDERCHKLVL")
    protected BigDecimal autoreorderchklvl;
    @XmlElement(name = "AUTOREORDERCHKLVS")
    protected BigDecimal autoreorderchklvs;
    @XmlElement(name = "DORMPRM")
    protected String dormprm;
    @XmlElement(name = "LOCATION")
    protected String location;
    @XmlElement(name = "OPMODE")
    protected String opmode;
    @XmlElement(name = "COUNTRY_CODE")
    protected String countrycode;
    @XmlElement(name = "AUTO_CHEQUE_BOOK_REQ")
    protected String autochequebookreq;
    @XmlElement(name = "AUTO_DEBIT_CARD_REQUEST")
    protected String autodebitcardrequest;
    @XmlElement(name = "ACCOUNT_TYPE")
    protected String accounttype;
    @XmlElement(name = "MAX_NO_CHEQUE_REJECTIONS")
    protected BigDecimal maxnochequerejections;
    @XmlElement(name = "ACC_OPENING_AMT")
    protected BigDecimal accopeningamt;
    @XmlElement(name = "GL_ACCC")
    protected String glaccc;
    @XmlElement(name = "OFFSET_BRN")
    protected String offsetbrn;
    @XmlElement(name = "PAY_IN_OPTION")
    protected String payinoption;
    @XmlElement(name = "WAIVE_ACC_OPEN_CHARGE")
    protected String waiveaccopencharge;
    @XmlElement(name = "CODATMBRN")
    protected String codatmbrn;
    @XmlElement(name = "TRACK_LIMITS")
    protected String tracklimits;
    @XmlElement(name = "LIABNO")
    protected String liabno;
    @XmlElement(name = "LIABID")
    protected String liabid;
    @XmlElement(name = "REPL_CUST_SIG")
    protected String replcustsig;
    @XmlElement(name = "SALARY_ACCOUNT")
    protected String salaryaccount;
    @XmlElement(name = "SDREFNO")
    protected String sdrefno;
    @XmlElement(name = "SPDANLSYS")
    protected String spdanlsys;
    @XmlElement(name = "Jointholders")
    protected List<StccuaccModifyIOType.Jointholders> jointholders;
    @XmlElement(name = "Acc-Nominees")
    protected List<StccuaccModifyIOType.AccNominees> accNominees;
    @XmlElement(name = "Doctype-Checklist")
    protected List<StccuaccModifyIOType.DoctypeChecklist> doctypeChecklist;
    @XmlElement(name = "Doctype-Remarks1")
    protected StccuaccModifyIOType.DoctypeRemarks1 doctypeRemarks1;
    @XmlElement(name = "Cust-Acc-Check")
    protected StccuaccModifyIOType.CustAccCheck custAccCheck;
    @XmlElement(name = "Cust-Acc-Card")
    protected StccuaccModifyIOType.CustAccCard custAccCard;
    @XmlElement(name = "Udfdetails")
    protected List<StccuaccModifyIOType.Udfdetails> udfdetails;
    @XmlElement(name = "Misdetails")
    protected StccuaccModifyIOType.Misdetails misdetails;

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
     * Gets the value of the acdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDESC() {
        return acdesc;
    }

    /**
     * Sets the value of the acdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDESC(String value) {
        this.acdesc = value;
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
     * Gets the value of the acopendate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACOPENDATE() {
        return acopendate;
    }

    /**
     * Sets the value of the acopendate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACOPENDATE(XMLGregorianCalendar value) {
        this.acopendate = value;
    }

    /**
     * Gets the value of the altaccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTACCNO() {
        return altaccno;
    }

    /**
     * Sets the value of the altaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTACCNO(String value) {
        this.altaccno = value;
    }

    /**
     * Gets the value of the chqbook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHQBOOK() {
        return chqbook;
    }

    /**
     * Sets the value of the chqbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHQBOOK(String value) {
        this.chqbook = value;
    }

    /**
     * Gets the value of the atm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATM() {
        return atm;
    }

    /**
     * Sets the value of the atm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATM(String value) {
        this.atm = value;
    }

    /**
     * Gets the value of the passbook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSBOOK() {
        return passbook;
    }

    /**
     * Sets the value of the passbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSBOOK(String value) {
        this.passbook = value;
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
     * Gets the value of the atmdcntlim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMDCNTLIM() {
        return atmdcntlim;
    }

    /**
     * Sets the value of the atmdcntlim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setATMDCNTLIM(BigDecimal value) {
        this.atmdcntlim = value;
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
     * Gets the value of the autoreorderchkreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOREORDERCHKREQ() {
        return autoreorderchkreq;
    }

    /**
     * Sets the value of the autoreorderchkreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOREORDERCHKREQ(String value) {
        this.autoreorderchkreq = value;
    }

    /**
     * Gets the value of the autoreorderchklvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAUTOREORDERCHKLVL() {
        return autoreorderchklvl;
    }

    /**
     * Sets the value of the autoreorderchklvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAUTOREORDERCHKLVL(BigDecimal value) {
        this.autoreorderchklvl = value;
    }

    /**
     * Gets the value of the autoreorderchklvs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAUTOREORDERCHKLVS() {
        return autoreorderchklvs;
    }

    /**
     * Sets the value of the autoreorderchklvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAUTOREORDERCHKLVS(BigDecimal value) {
        this.autoreorderchklvs = value;
    }

    /**
     * Gets the value of the dormprm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDORMPRM() {
        return dormprm;
    }

    /**
     * Sets the value of the dormprm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDORMPRM(String value) {
        this.dormprm = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATION(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the opmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPMODE() {
        return opmode;
    }

    /**
     * Sets the value of the opmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPMODE(String value) {
        this.opmode = value;
    }

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYCODE(String value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the autochequebookreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOCHEQUEBOOKREQ() {
        return autochequebookreq;
    }

    /**
     * Sets the value of the autochequebookreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOCHEQUEBOOKREQ(String value) {
        this.autochequebookreq = value;
    }

    /**
     * Gets the value of the autodebitcardrequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTODEBITCARDREQUEST() {
        return autodebitcardrequest;
    }

    /**
     * Sets the value of the autodebitcardrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTODEBITCARDREQUEST(String value) {
        this.autodebitcardrequest = value;
    }

    /**
     * Gets the value of the accounttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTYPE() {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTYPE(String value) {
        this.accounttype = value;
    }

    /**
     * Gets the value of the maxnochequerejections property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXNOCHEQUEREJECTIONS() {
        return maxnochequerejections;
    }

    /**
     * Sets the value of the maxnochequerejections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXNOCHEQUEREJECTIONS(BigDecimal value) {
        this.maxnochequerejections = value;
    }

    /**
     * Gets the value of the accopeningamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCOPENINGAMT() {
        return accopeningamt;
    }

    /**
     * Sets the value of the accopeningamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCOPENINGAMT(BigDecimal value) {
        this.accopeningamt = value;
    }

    /**
     * Gets the value of the glaccc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLACCC() {
        return glaccc;
    }

    /**
     * Sets the value of the glaccc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLACCC(String value) {
        this.glaccc = value;
    }

    /**
     * Gets the value of the offsetbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFSETBRN() {
        return offsetbrn;
    }

    /**
     * Sets the value of the offsetbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFSETBRN(String value) {
        this.offsetbrn = value;
    }

    /**
     * Gets the value of the payinoption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYINOPTION() {
        return payinoption;
    }

    /**
     * Sets the value of the payinoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYINOPTION(String value) {
        this.payinoption = value;
    }

    /**
     * Gets the value of the waiveaccopencharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVEACCOPENCHARGE() {
        return waiveaccopencharge;
    }

    /**
     * Sets the value of the waiveaccopencharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVEACCOPENCHARGE(String value) {
        this.waiveaccopencharge = value;
    }

    /**
     * Gets the value of the codatmbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODATMBRN() {
        return codatmbrn;
    }

    /**
     * Sets the value of the codatmbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODATMBRN(String value) {
        this.codatmbrn = value;
    }

    /**
     * Gets the value of the tracklimits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRACKLIMITS() {
        return tracklimits;
    }

    /**
     * Sets the value of the tracklimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRACKLIMITS(String value) {
        this.tracklimits = value;
    }

    /**
     * Gets the value of the liabno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIABNO() {
        return liabno;
    }

    /**
     * Sets the value of the liabno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIABNO(String value) {
        this.liabno = value;
    }

    /**
     * Gets the value of the liabid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIABID() {
        return liabid;
    }

    /**
     * Sets the value of the liabid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIABID(String value) {
        this.liabid = value;
    }

    /**
     * Gets the value of the replcustsig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPLCUSTSIG() {
        return replcustsig;
    }

    /**
     * Sets the value of the replcustsig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPLCUSTSIG(String value) {
        this.replcustsig = value;
    }

    /**
     * Gets the value of the salaryaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALARYACCOUNT() {
        return salaryaccount;
    }

    /**
     * Sets the value of the salaryaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALARYACCOUNT(String value) {
        this.salaryaccount = value;
    }

    /**
     * Gets the value of the sdrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDREFNO() {
        return sdrefno;
    }

    /**
     * Sets the value of the sdrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDREFNO(String value) {
        this.sdrefno = value;
    }

    /**
     * Gets the value of the spdanlsys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDANLSYS() {
        return spdanlsys;
    }

    /**
     * Sets the value of the spdanlsys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDANLSYS(String value) {
        this.spdanlsys = value;
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
     * {@link StccuaccModifyIOType.Jointholders }
     * 
     * 
     */
    public List<StccuaccModifyIOType.Jointholders> getJointholders() {
        if (jointholders == null) {
            jointholders = new ArrayList<StccuaccModifyIOType.Jointholders>();
        }
        return this.jointholders;
    }

    /**
     * Gets the value of the accNominees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accNominees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccNominees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StccuaccModifyIOType.AccNominees }
     * 
     * 
     */
    public List<StccuaccModifyIOType.AccNominees> getAccNominees() {
        if (accNominees == null) {
            accNominees = new ArrayList<StccuaccModifyIOType.AccNominees>();
        }
        return this.accNominees;
    }

    /**
     * Gets the value of the doctypeChecklist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doctypeChecklist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoctypeChecklist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StccuaccModifyIOType.DoctypeChecklist }
     * 
     * 
     */
    public List<StccuaccModifyIOType.DoctypeChecklist> getDoctypeChecklist() {
        if (doctypeChecklist == null) {
            doctypeChecklist = new ArrayList<StccuaccModifyIOType.DoctypeChecklist>();
        }
        return this.doctypeChecklist;
    }

    /**
     * Gets the value of the doctypeRemarks1 property.
     * 
     * @return
     *     possible object is
     *     {@link StccuaccModifyIOType.DoctypeRemarks1 }
     *     
     */
    public StccuaccModifyIOType.DoctypeRemarks1 getDoctypeRemarks1() {
        return doctypeRemarks1;
    }

    /**
     * Sets the value of the doctypeRemarks1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StccuaccModifyIOType.DoctypeRemarks1 }
     *     
     */
    public void setDoctypeRemarks1(StccuaccModifyIOType.DoctypeRemarks1 value) {
        this.doctypeRemarks1 = value;
    }

    /**
     * Gets the value of the custAccCheck property.
     * 
     * @return
     *     possible object is
     *     {@link StccuaccModifyIOType.CustAccCheck }
     *     
     */
    public StccuaccModifyIOType.CustAccCheck getCustAccCheck() {
        return custAccCheck;
    }

    /**
     * Sets the value of the custAccCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link StccuaccModifyIOType.CustAccCheck }
     *     
     */
    public void setCustAccCheck(StccuaccModifyIOType.CustAccCheck value) {
        this.custAccCheck = value;
    }

    /**
     * Gets the value of the custAccCard property.
     * 
     * @return
     *     possible object is
     *     {@link StccuaccModifyIOType.CustAccCard }
     *     
     */
    public StccuaccModifyIOType.CustAccCard getCustAccCard() {
        return custAccCard;
    }

    /**
     * Sets the value of the custAccCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link StccuaccModifyIOType.CustAccCard }
     *     
     */
    public void setCustAccCard(StccuaccModifyIOType.CustAccCard value) {
        this.custAccCard = value;
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
     * {@link StccuaccModifyIOType.Udfdetails }
     * 
     * 
     */
    public List<StccuaccModifyIOType.Udfdetails> getUdfdetails() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<StccuaccModifyIOType.Udfdetails>();
        }
        return this.udfdetails;
    }

    /**
     * Gets the value of the misdetails property.
     * 
     * @return
     *     possible object is
     *     {@link StccuaccModifyIOType.Misdetails }
     *     
     */
    public StccuaccModifyIOType.Misdetails getMisdetails() {
        return misdetails;
    }

    /**
     * Sets the value of the misdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StccuaccModifyIOType.Misdetails }
     *     
     */
    public void setMisdetails(StccuaccModifyIOType.Misdetails value) {
        this.misdetails = value;
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
     *         &lt;element name="RELSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOMMINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GUARDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GUARDRELNSHP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "relship",
        "naddr1",
        "naddr2",
        "naddr3",
        "naddr4",
        "nomminor",
        "guardnam",
        "guardrelnshp",
        "gaddr1",
        "gaddr2",
        "gaddr3",
        "gaddr4",
        "nam",
        "dob"
    })
    public static class AccNominees {

        @XmlElement(name = "RELSHIP")
        protected String relship;
        @XmlElement(name = "NADDR1")
        protected String naddr1;
        @XmlElement(name = "NADDR2")
        protected String naddr2;
        @XmlElement(name = "NADDR3")
        protected String naddr3;
        @XmlElement(name = "NADDR4")
        protected String naddr4;
        @XmlElement(name = "NOMMINOR")
        protected String nomminor;
        @XmlElement(name = "GUARDNAM")
        protected String guardnam;
        @XmlElement(name = "GUARDRELNSHP")
        protected String guardrelnshp;
        @XmlElement(name = "GADDR1")
        protected String gaddr1;
        @XmlElement(name = "GADDR2")
        protected String gaddr2;
        @XmlElement(name = "GADDR3")
        protected String gaddr3;
        @XmlElement(name = "GADDR4")
        protected String gaddr4;
        @XmlElement(name = "NAM")
        protected String nam;
        @XmlElement(name = "DOB")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;

        /**
         * Gets the value of the relship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELSHIP() {
            return relship;
        }

        /**
         * Sets the value of the relship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELSHIP(String value) {
            this.relship = value;
        }

        /**
         * Gets the value of the naddr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNADDR1() {
            return naddr1;
        }

        /**
         * Sets the value of the naddr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNADDR1(String value) {
            this.naddr1 = value;
        }

        /**
         * Gets the value of the naddr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNADDR2() {
            return naddr2;
        }

        /**
         * Sets the value of the naddr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNADDR2(String value) {
            this.naddr2 = value;
        }

        /**
         * Gets the value of the naddr3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNADDR3() {
            return naddr3;
        }

        /**
         * Sets the value of the naddr3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNADDR3(String value) {
            this.naddr3 = value;
        }

        /**
         * Gets the value of the naddr4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNADDR4() {
            return naddr4;
        }

        /**
         * Sets the value of the naddr4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNADDR4(String value) {
            this.naddr4 = value;
        }

        /**
         * Gets the value of the nomminor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOMMINOR() {
            return nomminor;
        }

        /**
         * Sets the value of the nomminor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOMMINOR(String value) {
            this.nomminor = value;
        }

        /**
         * Gets the value of the guardnam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUARDNAM() {
            return guardnam;
        }

        /**
         * Sets the value of the guardnam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUARDNAM(String value) {
            this.guardnam = value;
        }

        /**
         * Gets the value of the guardrelnshp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUARDRELNSHP() {
            return guardrelnshp;
        }

        /**
         * Sets the value of the guardrelnshp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUARDRELNSHP(String value) {
            this.guardrelnshp = value;
        }

        /**
         * Gets the value of the gaddr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGADDR1() {
            return gaddr1;
        }

        /**
         * Sets the value of the gaddr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGADDR1(String value) {
            this.gaddr1 = value;
        }

        /**
         * Gets the value of the gaddr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGADDR2() {
            return gaddr2;
        }

        /**
         * Sets the value of the gaddr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGADDR2(String value) {
            this.gaddr2 = value;
        }

        /**
         * Gets the value of the gaddr3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGADDR3() {
            return gaddr3;
        }

        /**
         * Sets the value of the gaddr3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGADDR3(String value) {
            this.gaddr3 = value;
        }

        /**
         * Gets the value of the gaddr4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGADDR4() {
            return gaddr4;
        }

        /**
         * Sets the value of the gaddr4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGADDR4(String value) {
            this.gaddr4 = value;
        }

        /**
         * Gets the value of the nam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAM() {
            return nam;
        }

        /**
         * Sets the value of the nam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAM(String value) {
            this.nam = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOB(XMLGregorianCalendar value) {
            this.dob = value;
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
     *         &lt;element name="CARD_BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cardbin",
        "cardno"
    })
    public static class CustAccCard {

        @XmlElement(name = "CARD_BIN")
        protected String cardbin;
        @XmlElement(name = "CARD_NO")
        protected String cardno;

        /**
         * Gets the value of the cardbin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDBIN() {
            return cardbin;
        }

        /**
         * Sets the value of the cardbin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDBIN(String value) {
            this.cardbin = value;
        }

        /**
         * Gets the value of the cardno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDNO() {
            return cardno;
        }

        /**
         * Sets the value of the cardno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDNO(String value) {
            this.cardno = value;
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
     *         &lt;element name="CHECK_LEAVES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CHEQUE_BOOK_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ORDER_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LANG_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "checkleaves",
        "chequebooktype",
        "orderdate",
        "orderdetails",
        "langcode"
    })
    public static class CustAccCheck {

        @XmlElement(name = "CHECK_LEAVES")
        protected BigDecimal checkleaves;
        @XmlElement(name = "CHEQUE_BOOK_TYPE")
        protected String chequebooktype;
        @XmlElement(name = "ORDER_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar orderdate;
        @XmlElement(name = "ORDER_DETAILS")
        protected String orderdetails;
        @XmlElement(name = "LANG_CODE")
        protected String langcode;

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
         * Gets the value of the chequebooktype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHEQUEBOOKTYPE() {
            return chequebooktype;
        }

        /**
         * Sets the value of the chequebooktype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHEQUEBOOKTYPE(String value) {
            this.chequebooktype = value;
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
     *         &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MANDATORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "documenttype",
        "mandatory",
        "checked"
    })
    public static class DoctypeChecklist {

        @XmlElement(name = "DOCUMENT_TYPE")
        protected String documenttype;
        @XmlElement(name = "MANDATORY")
        protected String mandatory;
        @XmlElement(name = "CHECKED")
        protected String checked;

        /**
         * Gets the value of the documenttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCUMENTTYPE() {
            return documenttype;
        }

        /**
         * Sets the value of the documenttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCUMENTTYPE(String value) {
            this.documenttype = value;
        }

        /**
         * Gets the value of the mandatory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMANDATORY() {
            return mandatory;
        }

        /**
         * Sets the value of the mandatory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMANDATORY(String value) {
            this.mandatory = value;
        }

        /**
         * Gets the value of the checked property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKED() {
            return checked;
        }

        /**
         * Sets the value of the checked property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKED(String value) {
            this.checked = value;
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
     *         &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "remark1",
        "remark2",
        "remark3",
        "remark4",
        "remark5",
        "remark6",
        "remark7",
        "remark8",
        "remark9",
        "remark10"
    })
    public static class DoctypeRemarks1 {

        @XmlElement(name = "REMARK1")
        protected String remark1;
        @XmlElement(name = "REMARK2")
        protected String remark2;
        @XmlElement(name = "REMARK3")
        protected String remark3;
        @XmlElement(name = "REMARK4")
        protected String remark4;
        @XmlElement(name = "REMARK5")
        protected String remark5;
        @XmlElement(name = "REMARK6")
        protected String remark6;
        @XmlElement(name = "REMARK7")
        protected String remark7;
        @XmlElement(name = "REMARK8")
        protected String remark8;
        @XmlElement(name = "REMARK9")
        protected String remark9;
        @XmlElement(name = "REMARK10")
        protected String remark10;

        /**
         * Gets the value of the remark1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK1() {
            return remark1;
        }

        /**
         * Sets the value of the remark1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK1(String value) {
            this.remark1 = value;
        }

        /**
         * Gets the value of the remark2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK2() {
            return remark2;
        }

        /**
         * Sets the value of the remark2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK2(String value) {
            this.remark2 = value;
        }

        /**
         * Gets the value of the remark3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK3() {
            return remark3;
        }

        /**
         * Sets the value of the remark3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK3(String value) {
            this.remark3 = value;
        }

        /**
         * Gets the value of the remark4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK4() {
            return remark4;
        }

        /**
         * Sets the value of the remark4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK4(String value) {
            this.remark4 = value;
        }

        /**
         * Gets the value of the remark5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK5() {
            return remark5;
        }

        /**
         * Sets the value of the remark5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK5(String value) {
            this.remark5 = value;
        }

        /**
         * Gets the value of the remark6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK6() {
            return remark6;
        }

        /**
         * Sets the value of the remark6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK6(String value) {
            this.remark6 = value;
        }

        /**
         * Gets the value of the remark7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK7() {
            return remark7;
        }

        /**
         * Sets the value of the remark7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK7(String value) {
            this.remark7 = value;
        }

        /**
         * Gets the value of the remark8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK8() {
            return remark8;
        }

        /**
         * Sets the value of the remark8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK8(String value) {
            this.remark8 = value;
        }

        /**
         * Gets the value of the remark9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK9() {
            return remark9;
        }

        /**
         * Sets the value of the remark9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK9(String value) {
            this.remark9 = value;
        }

        /**
         * Gets the value of the remark10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK10() {
            return remark10;
        }

        /**
         * Sets the value of the remark10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK10(String value) {
            this.remark10 = value;
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
     *         &lt;element name="JNTHLDCDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JNTHLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "jnthldcde",
        "jnthlddesc",
        "jnthldtyp",
        "startdate",
        "enddate"
    })
    public static class Jointholders {

        @XmlElement(name = "JNTHLDCDE")
        protected String jnthldcde;
        @XmlElement(name = "JNTHLDDESC")
        protected String jnthlddesc;
        @XmlElement(name = "JNTHLDTYP")
        protected String jnthldtyp;
        @XmlElement(name = "START_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startdate;
        @XmlElement(name = "END_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar enddate;

        /**
         * Gets the value of the jnthldcde property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJNTHLDCDE() {
            return jnthldcde;
        }

        /**
         * Sets the value of the jnthldcde property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJNTHLDCDE(String value) {
            this.jnthldcde = value;
        }

        /**
         * Gets the value of the jnthlddesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJNTHLDDESC() {
            return jnthlddesc;
        }

        /**
         * Sets the value of the jnthlddesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJNTHLDDESC(String value) {
            this.jnthlddesc = value;
        }

        /**
         * Gets the value of the jnthldtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJNTHLDTYP() {
            return jnthldtyp;
        }

        /**
         * Sets the value of the jnthldtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJNTHLDTYP(String value) {
            this.jnthldtyp = value;
        }

        /**
         * Gets the value of the startdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTARTDATE() {
            return startdate;
        }

        /**
         * Sets the value of the startdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTARTDATE(XMLGregorianCalendar value) {
            this.startdate = value;
        }

        /**
         * Gets the value of the enddate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getENDDATE() {
            return enddate;
        }

        /**
         * Sets the value of the enddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setENDDATE(XMLGregorianCalendar value) {
            this.enddate = value;
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
     *         &lt;element name="TXNMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCOD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFRTSPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="REFRTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFRTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="POOLCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RTFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REFRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CALCMETH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISGRPTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MISGRPCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "txnmis7",
        "compmis8",
        "txnmis8",
        "compmis9",
        "txnmis9",
        "compmis10",
        "txnmis10",
        "costcod1",
        "costcod2",
        "costcod3",
        "costcod4",
        "costcod5",
        "refrtsprd",
        "refrttype",
        "refrtcd",
        "poolcd",
        "rtflag",
        "refrate",
        "calcmeth",
        "misgrp",
        "misgrptxn",
        "misgrpcomp",
        "compmis1",
        "txnmis1",
        "compmis2",
        "txnmis2",
        "compmis3",
        "txnmis3",
        "compmis4",
        "txnmis4",
        "compmis5",
        "txnmis5",
        "compmis6",
        "txnmis6",
        "compmis7"
    })
    public static class Misdetails {

        @XmlElement(name = "TXNMIS7")
        protected String txnmis7;
        @XmlElement(name = "COMPMIS8")
        protected String compmis8;
        @XmlElement(name = "TXNMIS8")
        protected String txnmis8;
        @XmlElement(name = "COMPMIS9")
        protected String compmis9;
        @XmlElement(name = "TXNMIS9")
        protected String txnmis9;
        @XmlElement(name = "COMPMIS10")
        protected String compmis10;
        @XmlElement(name = "TXNMIS10")
        protected String txnmis10;
        @XmlElement(name = "COSTCOD1")
        protected String costcod1;
        @XmlElement(name = "COSTCOD2")
        protected String costcod2;
        @XmlElement(name = "COSTCOD3")
        protected String costcod3;
        @XmlElement(name = "COSTCOD4")
        protected String costcod4;
        @XmlElement(name = "COSTCOD5")
        protected String costcod5;
        @XmlElement(name = "REFRTSPRD")
        protected BigDecimal refrtsprd;
        @XmlElement(name = "REFRTTYPE")
        protected String refrttype;
        @XmlElement(name = "REFRTCD")
        protected String refrtcd;
        @XmlElement(name = "POOLCD")
        protected String poolcd;
        @XmlElement(name = "RTFLAG")
        protected String rtflag;
        @XmlElement(name = "REFRATE")
        protected BigDecimal refrate;
        @XmlElement(name = "CALCMETH")
        protected String calcmeth;
        @XmlElement(name = "MISGRP")
        protected String misgrp;
        @XmlElement(name = "MISGRPTXN")
        protected String misgrptxn;
        @XmlElement(name = "MISGRPCOMP")
        protected String misgrpcomp;
        @XmlElement(name = "COMPMIS1")
        protected String compmis1;
        @XmlElement(name = "TXNMIS1")
        protected String txnmis1;
        @XmlElement(name = "COMPMIS2")
        protected String compmis2;
        @XmlElement(name = "TXNMIS2")
        protected String txnmis2;
        @XmlElement(name = "COMPMIS3")
        protected String compmis3;
        @XmlElement(name = "TXNMIS3")
        protected String txnmis3;
        @XmlElement(name = "COMPMIS4")
        protected String compmis4;
        @XmlElement(name = "TXNMIS4")
        protected String txnmis4;
        @XmlElement(name = "COMPMIS5")
        protected String compmis5;
        @XmlElement(name = "TXNMIS5")
        protected String txnmis5;
        @XmlElement(name = "COMPMIS6")
        protected String compmis6;
        @XmlElement(name = "TXNMIS6")
        protected String txnmis6;
        @XmlElement(name = "COMPMIS7")
        protected String compmis7;

        /**
         * Gets the value of the txnmis7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS7() {
            return txnmis7;
        }

        /**
         * Sets the value of the txnmis7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS7(String value) {
            this.txnmis7 = value;
        }

        /**
         * Gets the value of the compmis8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS8() {
            return compmis8;
        }

        /**
         * Sets the value of the compmis8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS8(String value) {
            this.compmis8 = value;
        }

        /**
         * Gets the value of the txnmis8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS8() {
            return txnmis8;
        }

        /**
         * Sets the value of the txnmis8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS8(String value) {
            this.txnmis8 = value;
        }

        /**
         * Gets the value of the compmis9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS9() {
            return compmis9;
        }

        /**
         * Sets the value of the compmis9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS9(String value) {
            this.compmis9 = value;
        }

        /**
         * Gets the value of the txnmis9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS9() {
            return txnmis9;
        }

        /**
         * Sets the value of the txnmis9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS9(String value) {
            this.txnmis9 = value;
        }

        /**
         * Gets the value of the compmis10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS10() {
            return compmis10;
        }

        /**
         * Sets the value of the compmis10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS10(String value) {
            this.compmis10 = value;
        }

        /**
         * Gets the value of the txnmis10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS10() {
            return txnmis10;
        }

        /**
         * Sets the value of the txnmis10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS10(String value) {
            this.txnmis10 = value;
        }

        /**
         * Gets the value of the costcod1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD1() {
            return costcod1;
        }

        /**
         * Sets the value of the costcod1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD1(String value) {
            this.costcod1 = value;
        }

        /**
         * Gets the value of the costcod2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD2() {
            return costcod2;
        }

        /**
         * Sets the value of the costcod2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD2(String value) {
            this.costcod2 = value;
        }

        /**
         * Gets the value of the costcod3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD3() {
            return costcod3;
        }

        /**
         * Sets the value of the costcod3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD3(String value) {
            this.costcod3 = value;
        }

        /**
         * Gets the value of the costcod4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD4() {
            return costcod4;
        }

        /**
         * Sets the value of the costcod4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD4(String value) {
            this.costcod4 = value;
        }

        /**
         * Gets the value of the costcod5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCOD5() {
            return costcod5;
        }

        /**
         * Sets the value of the costcod5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCOD5(String value) {
            this.costcod5 = value;
        }

        /**
         * Gets the value of the refrtsprd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getREFRTSPRD() {
            return refrtsprd;
        }

        /**
         * Sets the value of the refrtsprd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setREFRTSPRD(BigDecimal value) {
            this.refrtsprd = value;
        }

        /**
         * Gets the value of the refrttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFRTTYPE() {
            return refrttype;
        }

        /**
         * Sets the value of the refrttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFRTTYPE(String value) {
            this.refrttype = value;
        }

        /**
         * Gets the value of the refrtcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFRTCD() {
            return refrtcd;
        }

        /**
         * Sets the value of the refrtcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFRTCD(String value) {
            this.refrtcd = value;
        }

        /**
         * Gets the value of the poolcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOOLCD() {
            return poolcd;
        }

        /**
         * Sets the value of the poolcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOOLCD(String value) {
            this.poolcd = value;
        }

        /**
         * Gets the value of the rtflag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRTFLAG() {
            return rtflag;
        }

        /**
         * Sets the value of the rtflag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRTFLAG(String value) {
            this.rtflag = value;
        }

        /**
         * Gets the value of the refrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getREFRATE() {
            return refrate;
        }

        /**
         * Sets the value of the refrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setREFRATE(BigDecimal value) {
            this.refrate = value;
        }

        /**
         * Gets the value of the calcmeth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCMETH() {
            return calcmeth;
        }

        /**
         * Sets the value of the calcmeth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCMETH(String value) {
            this.calcmeth = value;
        }

        /**
         * Gets the value of the misgrp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGRP() {
            return misgrp;
        }

        /**
         * Sets the value of the misgrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGRP(String value) {
            this.misgrp = value;
        }

        /**
         * Gets the value of the misgrptxn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGRPTXN() {
            return misgrptxn;
        }

        /**
         * Sets the value of the misgrptxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGRPTXN(String value) {
            this.misgrptxn = value;
        }

        /**
         * Gets the value of the misgrpcomp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGRPCOMP() {
            return misgrpcomp;
        }

        /**
         * Sets the value of the misgrpcomp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGRPCOMP(String value) {
            this.misgrpcomp = value;
        }

        /**
         * Gets the value of the compmis1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS1() {
            return compmis1;
        }

        /**
         * Sets the value of the compmis1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS1(String value) {
            this.compmis1 = value;
        }

        /**
         * Gets the value of the txnmis1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS1() {
            return txnmis1;
        }

        /**
         * Sets the value of the txnmis1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS1(String value) {
            this.txnmis1 = value;
        }

        /**
         * Gets the value of the compmis2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS2() {
            return compmis2;
        }

        /**
         * Sets the value of the compmis2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS2(String value) {
            this.compmis2 = value;
        }

        /**
         * Gets the value of the txnmis2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS2() {
            return txnmis2;
        }

        /**
         * Sets the value of the txnmis2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS2(String value) {
            this.txnmis2 = value;
        }

        /**
         * Gets the value of the compmis3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS3() {
            return compmis3;
        }

        /**
         * Sets the value of the compmis3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS3(String value) {
            this.compmis3 = value;
        }

        /**
         * Gets the value of the txnmis3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS3() {
            return txnmis3;
        }

        /**
         * Sets the value of the txnmis3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS3(String value) {
            this.txnmis3 = value;
        }

        /**
         * Gets the value of the compmis4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS4() {
            return compmis4;
        }

        /**
         * Sets the value of the compmis4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS4(String value) {
            this.compmis4 = value;
        }

        /**
         * Gets the value of the txnmis4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS4() {
            return txnmis4;
        }

        /**
         * Sets the value of the txnmis4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS4(String value) {
            this.txnmis4 = value;
        }

        /**
         * Gets the value of the compmis5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS5() {
            return compmis5;
        }

        /**
         * Sets the value of the compmis5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS5(String value) {
            this.compmis5 = value;
        }

        /**
         * Gets the value of the txnmis5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS5() {
            return txnmis5;
        }

        /**
         * Sets the value of the txnmis5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS5(String value) {
            this.txnmis5 = value;
        }

        /**
         * Gets the value of the compmis6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS6() {
            return compmis6;
        }

        /**
         * Sets the value of the compmis6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS6(String value) {
            this.compmis6 = value;
        }

        /**
         * Gets the value of the txnmis6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNMIS6() {
            return txnmis6;
        }

        /**
         * Sets the value of the txnmis6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNMIS6(String value) {
            this.txnmis6 = value;
        }

        /**
         * Gets the value of the compmis7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPMIS7() {
            return compmis7;
        }

        /**
         * Sets the value of the compmis7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPMIS7(String value) {
            this.compmis7 = value;
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
     *         &lt;element name="FLDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FLDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DATATYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VALTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "fldnam",
        "fldval",
        "datatyp",
        "valtyp"
    })
    public static class Udfdetails {

        @XmlElement(name = "FLDNAM")
        protected String fldnam;
        @XmlElement(name = "FLDVAL")
        protected String fldval;
        @XmlElement(name = "DATATYP")
        protected String datatyp;
        @XmlElement(name = "VALTYP")
        protected String valtyp;

        /**
         * Gets the value of the fldnam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFLDNAM() {
            return fldnam;
        }

        /**
         * Sets the value of the fldnam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFLDNAM(String value) {
            this.fldnam = value;
        }

        /**
         * Gets the value of the fldval property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFLDVAL() {
            return fldval;
        }

        /**
         * Sets the value of the fldval property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFLDVAL(String value) {
            this.fldval = value;
        }

        /**
         * Gets the value of the datatyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATATYP() {
            return datatyp;
        }

        /**
         * Sets the value of the datatyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATATYP(String value) {
            this.datatyp = value;
        }

        /**
         * Gets the value of the valtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALTYP() {
            return valtyp;
        }

        /**
         * Sets the value of the valtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVALTYP(String value) {
            this.valtyp = value;
        }

    }

}
