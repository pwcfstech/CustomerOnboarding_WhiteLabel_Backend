
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
 * <p>Java class for CustAccTfr-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAccTfr-Create-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHQBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OFFLINE_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACSTMTTYPE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACSTMTDAY2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACSTMTCYCLE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACSTMTTYPE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACSTMTDAY3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACSTMTCYCLE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRACK_RECEIVABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGDAPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGDPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LODGEBKFAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKLVL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AUTOREORDERCHKLVS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AUTOSTATCHANGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALLWBKPERENTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXCL_SAMEDAY_RVRTRNS_FM_STMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTO_PROV_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPCATEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVCCYTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DORMPRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SWEEPMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINREQBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CONSREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EFFECTIVEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ACSTMTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACSTMTDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACSTMTCYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DR_HO_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEXTLIQDCYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATMCUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATMDLYAMTLMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ATMDLYLMTCNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHECKNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHECKNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interest" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WAIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GEN_UCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INTRECSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ONCE_AUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UDE_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MIN_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MAX_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Ude-Effdt" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UDEEFFECTIVEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Ude-Vals" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="UDEVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Account-Status" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Mis" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UNIT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RELATED_CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RELATED_REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MIS_HEAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="POOLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RATE_FLAG1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REF_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CALC_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PROCESSING_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MIS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MIS_GROUP_TXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MIS_GROUP_COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="COMPMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMPMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TXNMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COSTCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FUND_MIS_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REF_SPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="REF_RATE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REF_RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REF_XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARFIELD30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNTCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Consol-Charges" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RECRDSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DISCPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DISCAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="WAIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Charge-Prod" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHGPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GEN_UCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UDE_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MIN_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MAX_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Charge-Slab" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ictm-Acc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CALCULATION_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INT_BOOKING_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INT_START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CHARGE_BOOKING_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INT_BOOK_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CHARGE_START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="CONSOLACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CONSOLCHGBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CustAccTfr-Create-IO-Type", propOrder = {
    "chqbook",
    "passbook",
    "atm",
    "offlinelimit",
    "acstmttype2",
    "acstmtday2",
    "acstmtcycle2",
    "acstmttype3",
    "acstmtday3",
    "acstmtcycle3",
    "trackreceivable",
    "regdapp",
    "regdper",
    "refreq",
    "lodgebkfac",
    "autoreorderchkr",
    "autoreorderchklvl",
    "autoreorderchklvs",
    "autostatchange",
    "allwbkperentry",
    "exclsamedayrvrtrnsfmstmt",
    "autoprovreqd",
    "expcateg",
    "provccytype",
    "dormprm",
    "sweepmode",
    "minreqbal",
    "consreqd",
    "acc",
    "accls",
    "effectivedate",
    "acstmttype",
    "acstmtday",
    "acstmtcycle",
    "crcbline",
    "drcbline",
    "crholine",
    "drholine",
    "remarks",
    "brn",
    "nextliqdcycle",
    "atmcustacno",
    "atmdlyamtlmt",
    "atmdlylmtcnt",
    "checkname1",
    "checkname2",
    "interest",
    "accountStatus",
    "mis",
    "consolCharges",
    "chargeProd",
    "ictmAcc"
})
public class CustAccTfrCreateIOType {

    @XmlElement(name = "CHQBOOK")
    protected String chqbook;
    @XmlElement(name = "PASSBOOK")
    protected String passbook;
    @XmlElement(name = "ATM")
    protected String atm;
    @XmlElement(name = "OFFLINE_LIMIT")
    protected BigDecimal offlinelimit;
    @XmlElement(name = "ACSTMTTYPE2")
    protected String acstmttype2;
    @XmlElement(name = "ACSTMTDAY2")
    protected BigDecimal acstmtday2;
    @XmlElement(name = "ACSTMTCYCLE2")
    protected String acstmtcycle2;
    @XmlElement(name = "ACSTMTTYPE3")
    protected String acstmttype3;
    @XmlElement(name = "ACSTMTDAY3")
    protected BigDecimal acstmtday3;
    @XmlElement(name = "ACSTMTCYCLE3")
    protected String acstmtcycle3;
    @XmlElement(name = "TRACK_RECEIVABLE")
    protected String trackreceivable;
    @XmlElement(name = "REGDAPP")
    protected String regdapp;
    @XmlElement(name = "REGDPER")
    protected String regdper;
    @XmlElement(name = "REFREQ")
    protected String refreq;
    @XmlElement(name = "LODGEBKFAC")
    protected String lodgebkfac;
    @XmlElement(name = "AUTOREORDERCHKR")
    protected String autoreorderchkr;
    @XmlElement(name = "AUTOREORDERCHKLVL")
    protected BigDecimal autoreorderchklvl;
    @XmlElement(name = "AUTOREORDERCHKLVS")
    protected BigDecimal autoreorderchklvs;
    @XmlElement(name = "AUTOSTATCHANGE")
    protected String autostatchange;
    @XmlElement(name = "ALLWBKPERENTRY")
    protected String allwbkperentry;
    @XmlElement(name = "EXCL_SAMEDAY_RVRTRNS_FM_STMT")
    protected String exclsamedayrvrtrnsfmstmt;
    @XmlElement(name = "AUTO_PROV_REQD")
    protected String autoprovreqd;
    @XmlElement(name = "EXPCATEG")
    protected String expcateg;
    @XmlElement(name = "PROVCCYTYPE")
    protected String provccytype;
    @XmlElement(name = "DORMPRM")
    protected String dormprm;
    @XmlElement(name = "SWEEPMODE")
    protected String sweepmode;
    @XmlElement(name = "MINREQBAL")
    protected BigDecimal minreqbal;
    @XmlElement(name = "CONSREQD")
    protected String consreqd;
    @XmlElement(name = "ACC", required = true)
    protected String acc;
    @XmlElement(name = "ACCLS", required = true)
    protected String accls;
    @XmlElement(name = "EFFECTIVEDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectivedate;
    @XmlElement(name = "ACSTMTTYPE")
    protected String acstmttype;
    @XmlElement(name = "ACSTMTDAY")
    protected BigDecimal acstmtday;
    @XmlElement(name = "ACSTMTCYCLE")
    protected String acstmtcycle;
    @XmlElement(name = "CRCBLINE")
    protected String crcbline;
    @XmlElement(name = "DRCBLINE")
    protected String drcbline;
    @XmlElement(name = "CRHOLINE")
    protected String crholine;
    @XmlElement(name = "DR_HO_LINE")
    protected String drholine;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "NEXTLIQDCYCLE")
    protected String nextliqdcycle;
    @XmlElement(name = "ATMCUSTACNO")
    protected String atmcustacno;
    @XmlElement(name = "ATMDLYAMTLMT")
    protected BigDecimal atmdlyamtlmt;
    @XmlElement(name = "ATMDLYLMTCNT")
    protected BigDecimal atmdlylmtcnt;
    @XmlElement(name = "CHECKNAME1")
    protected String checkname1;
    @XmlElement(name = "CHECKNAME2")
    protected String checkname2;
    @XmlElement(name = "Interest")
    protected List<CustAccTfrCreateIOType.Interest> interest;
    @XmlElement(name = "Account-Status")
    protected List<CustAccTfrCreateIOType.AccountStatus> accountStatus;
    @XmlElement(name = "Mis")
    protected CustAccTfrCreateIOType.Mis mis;
    @XmlElement(name = "Consol-Charges")
    protected List<CustAccTfrCreateIOType.ConsolCharges> consolCharges;
    @XmlElement(name = "Charge-Prod")
    protected List<CustAccTfrCreateIOType.ChargeProd> chargeProd;
    @XmlElement(name = "Ictm-Acc")
    protected CustAccTfrCreateIOType.IctmAcc ictmAcc;

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
     * Gets the value of the offlinelimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOFFLINELIMIT() {
        return offlinelimit;
    }

    /**
     * Sets the value of the offlinelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOFFLINELIMIT(BigDecimal value) {
        this.offlinelimit = value;
    }

    /**
     * Gets the value of the acstmttype2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTTYPE2() {
        return acstmttype2;
    }

    /**
     * Sets the value of the acstmttype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTTYPE2(String value) {
        this.acstmttype2 = value;
    }

    /**
     * Gets the value of the acstmtday2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACSTMTDAY2() {
        return acstmtday2;
    }

    /**
     * Sets the value of the acstmtday2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACSTMTDAY2(BigDecimal value) {
        this.acstmtday2 = value;
    }

    /**
     * Gets the value of the acstmtcycle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTCYCLE2() {
        return acstmtcycle2;
    }

    /**
     * Sets the value of the acstmtcycle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTCYCLE2(String value) {
        this.acstmtcycle2 = value;
    }

    /**
     * Gets the value of the acstmttype3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTTYPE3() {
        return acstmttype3;
    }

    /**
     * Sets the value of the acstmttype3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTTYPE3(String value) {
        this.acstmttype3 = value;
    }

    /**
     * Gets the value of the acstmtday3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACSTMTDAY3() {
        return acstmtday3;
    }

    /**
     * Sets the value of the acstmtday3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACSTMTDAY3(BigDecimal value) {
        this.acstmtday3 = value;
    }

    /**
     * Gets the value of the acstmtcycle3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTCYCLE3() {
        return acstmtcycle3;
    }

    /**
     * Sets the value of the acstmtcycle3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTCYCLE3(String value) {
        this.acstmtcycle3 = value;
    }

    /**
     * Gets the value of the trackreceivable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRACKRECEIVABLE() {
        return trackreceivable;
    }

    /**
     * Sets the value of the trackreceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRACKRECEIVABLE(String value) {
        this.trackreceivable = value;
    }

    /**
     * Gets the value of the regdapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGDAPP() {
        return regdapp;
    }

    /**
     * Sets the value of the regdapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGDAPP(String value) {
        this.regdapp = value;
    }

    /**
     * Gets the value of the regdper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGDPER() {
        return regdper;
    }

    /**
     * Sets the value of the regdper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGDPER(String value) {
        this.regdper = value;
    }

    /**
     * Gets the value of the refreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFREQ() {
        return refreq;
    }

    /**
     * Sets the value of the refreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFREQ(String value) {
        this.refreq = value;
    }

    /**
     * Gets the value of the lodgebkfac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLODGEBKFAC() {
        return lodgebkfac;
    }

    /**
     * Sets the value of the lodgebkfac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLODGEBKFAC(String value) {
        this.lodgebkfac = value;
    }

    /**
     * Gets the value of the autoreorderchkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOREORDERCHKR() {
        return autoreorderchkr;
    }

    /**
     * Sets the value of the autoreorderchkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOREORDERCHKR(String value) {
        this.autoreorderchkr = value;
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
     * Gets the value of the autostatchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOSTATCHANGE() {
        return autostatchange;
    }

    /**
     * Sets the value of the autostatchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOSTATCHANGE(String value) {
        this.autostatchange = value;
    }

    /**
     * Gets the value of the allwbkperentry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLWBKPERENTRY() {
        return allwbkperentry;
    }

    /**
     * Sets the value of the allwbkperentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLWBKPERENTRY(String value) {
        this.allwbkperentry = value;
    }

    /**
     * Gets the value of the exclsamedayrvrtrnsfmstmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCLSAMEDAYRVRTRNSFMSTMT() {
        return exclsamedayrvrtrnsfmstmt;
    }

    /**
     * Sets the value of the exclsamedayrvrtrnsfmstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCLSAMEDAYRVRTRNSFMSTMT(String value) {
        this.exclsamedayrvrtrnsfmstmt = value;
    }

    /**
     * Gets the value of the autoprovreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOPROVREQD() {
        return autoprovreqd;
    }

    /**
     * Sets the value of the autoprovreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOPROVREQD(String value) {
        this.autoprovreqd = value;
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
     * Gets the value of the provccytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVCCYTYPE() {
        return provccytype;
    }

    /**
     * Sets the value of the provccytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVCCYTYPE(String value) {
        this.provccytype = value;
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
     * Gets the value of the sweepmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWEEPMODE() {
        return sweepmode;
    }

    /**
     * Sets the value of the sweepmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWEEPMODE(String value) {
        this.sweepmode = value;
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
     * Gets the value of the consreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSREQD() {
        return consreqd;
    }

    /**
     * Sets the value of the consreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSREQD(String value) {
        this.consreqd = value;
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
     * Gets the value of the effectivedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEFFECTIVEDATE() {
        return effectivedate;
    }

    /**
     * Sets the value of the effectivedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEFFECTIVEDATE(XMLGregorianCalendar value) {
        this.effectivedate = value;
    }

    /**
     * Gets the value of the acstmttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTTYPE() {
        return acstmttype;
    }

    /**
     * Sets the value of the acstmttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTTYPE(String value) {
        this.acstmttype = value;
    }

    /**
     * Gets the value of the acstmtday property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACSTMTDAY() {
        return acstmtday;
    }

    /**
     * Sets the value of the acstmtday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACSTMTDAY(BigDecimal value) {
        this.acstmtday = value;
    }

    /**
     * Gets the value of the acstmtcycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTCYCLE() {
        return acstmtcycle;
    }

    /**
     * Sets the value of the acstmtcycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTCYCLE(String value) {
        this.acstmtcycle = value;
    }

    /**
     * Gets the value of the crcbline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRCBLINE() {
        return crcbline;
    }

    /**
     * Sets the value of the crcbline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRCBLINE(String value) {
        this.crcbline = value;
    }

    /**
     * Gets the value of the drcbline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRCBLINE() {
        return drcbline;
    }

    /**
     * Sets the value of the drcbline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRCBLINE(String value) {
        this.drcbline = value;
    }

    /**
     * Gets the value of the crholine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRHOLINE() {
        return crholine;
    }

    /**
     * Sets the value of the crholine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRHOLINE(String value) {
        this.crholine = value;
    }

    /**
     * Gets the value of the drholine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRHOLINE() {
        return drholine;
    }

    /**
     * Sets the value of the drholine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRHOLINE(String value) {
        this.drholine = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
    }

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
     * Gets the value of the nextliqdcycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEXTLIQDCYCLE() {
        return nextliqdcycle;
    }

    /**
     * Sets the value of the nextliqdcycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEXTLIQDCYCLE(String value) {
        this.nextliqdcycle = value;
    }

    /**
     * Gets the value of the atmcustacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMCUSTACNO() {
        return atmcustacno;
    }

    /**
     * Sets the value of the atmcustacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMCUSTACNO(String value) {
        this.atmcustacno = value;
    }

    /**
     * Gets the value of the atmdlyamtlmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMDLYAMTLMT() {
        return atmdlyamtlmt;
    }

    /**
     * Sets the value of the atmdlyamtlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setATMDLYAMTLMT(BigDecimal value) {
        this.atmdlyamtlmt = value;
    }

    /**
     * Gets the value of the atmdlylmtcnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMDLYLMTCNT() {
        return atmdlylmtcnt;
    }

    /**
     * Sets the value of the atmdlylmtcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setATMDLYLMTCNT(BigDecimal value) {
        this.atmdlylmtcnt = value;
    }

    /**
     * Gets the value of the checkname1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKNAME1() {
        return checkname1;
    }

    /**
     * Sets the value of the checkname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKNAME1(String value) {
        this.checkname1 = value;
    }

    /**
     * Gets the value of the checkname2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKNAME2() {
        return checkname2;
    }

    /**
     * Sets the value of the checkname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKNAME2(String value) {
        this.checkname2 = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustAccTfrCreateIOType.Interest }
     * 
     * 
     */
    public List<CustAccTfrCreateIOType.Interest> getInterest() {
        if (interest == null) {
            interest = new ArrayList<CustAccTfrCreateIOType.Interest>();
        }
        return this.interest;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustAccTfrCreateIOType.AccountStatus }
     * 
     * 
     */
    public List<CustAccTfrCreateIOType.AccountStatus> getAccountStatus() {
        if (accountStatus == null) {
            accountStatus = new ArrayList<CustAccTfrCreateIOType.AccountStatus>();
        }
        return this.accountStatus;
    }

    /**
     * Gets the value of the mis property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccTfrCreateIOType.Mis }
     *     
     */
    public CustAccTfrCreateIOType.Mis getMis() {
        return mis;
    }

    /**
     * Sets the value of the mis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccTfrCreateIOType.Mis }
     *     
     */
    public void setMis(CustAccTfrCreateIOType.Mis value) {
        this.mis = value;
    }

    /**
     * Gets the value of the consolCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustAccTfrCreateIOType.ConsolCharges }
     * 
     * 
     */
    public List<CustAccTfrCreateIOType.ConsolCharges> getConsolCharges() {
        if (consolCharges == null) {
            consolCharges = new ArrayList<CustAccTfrCreateIOType.ConsolCharges>();
        }
        return this.consolCharges;
    }

    /**
     * Gets the value of the chargeProd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeProd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeProd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustAccTfrCreateIOType.ChargeProd }
     * 
     * 
     */
    public List<CustAccTfrCreateIOType.ChargeProd> getChargeProd() {
        if (chargeProd == null) {
            chargeProd = new ArrayList<CustAccTfrCreateIOType.ChargeProd>();
        }
        return this.chargeProd;
    }

    /**
     * Gets the value of the ictmAcc property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccTfrCreateIOType.IctmAcc }
     *     
     */
    public CustAccTfrCreateIOType.IctmAcc getIctmAcc() {
        return ictmAcc;
    }

    /**
     * Sets the value of the ictmAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccTfrCreateIOType.IctmAcc }
     *     
     */
    public void setIctmAcc(CustAccTfrCreateIOType.IctmAcc value) {
        this.ictmAcc = value;
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
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "acc",
        "brn",
        "acstatus",
        "drholine",
        "crholine",
        "crcbline",
        "drcbline",
        "drgl",
        "crgl"
    })
    public static class AccountStatus {

        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "ACSTATUS")
        protected String acstatus;
        @XmlElement(name = "DRHOLINE")
        protected String drholine;
        @XmlElement(name = "CRHOLINE")
        protected String crholine;
        @XmlElement(name = "CRCBLINE")
        protected String crcbline;
        @XmlElement(name = "DRCBLINE")
        protected String drcbline;
        @XmlElement(name = "DRGL")
        protected String drgl;
        @XmlElement(name = "CRGL")
        protected String crgl;

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
         * Gets the value of the acstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATUS() {
            return acstatus;
        }

        /**
         * Sets the value of the acstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATUS(String value) {
            this.acstatus = value;
        }

        /**
         * Gets the value of the drholine property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRHOLINE() {
            return drholine;
        }

        /**
         * Sets the value of the drholine property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRHOLINE(String value) {
            this.drholine = value;
        }

        /**
         * Gets the value of the crholine property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRHOLINE() {
            return crholine;
        }

        /**
         * Sets the value of the crholine property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRHOLINE(String value) {
            this.crholine = value;
        }

        /**
         * Gets the value of the crcbline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRCBLINE() {
            return crcbline;
        }

        /**
         * Sets the value of the crcbline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRCBLINE(String value) {
            this.crcbline = value;
        }

        /**
         * Gets the value of the drcbline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCBLINE() {
            return drcbline;
        }

        /**
         * Sets the value of the drcbline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCBLINE(String value) {
            this.drcbline = value;
        }

        /**
         * Gets the value of the drgl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRGL() {
            return drgl;
        }

        /**
         * Sets the value of the drgl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRGL(String value) {
            this.drgl = value;
        }

        /**
         * Gets the value of the crgl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRGL() {
            return crgl;
        }

        /**
         * Sets the value of the crgl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRGL(String value) {
            this.crgl = value;
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
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHGPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WAIVEPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GEN_UCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UDE_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MIN_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MAX_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Charge-Slab" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "brn",
        "acc",
        "chgprod",
        "waiveprod",
        "genuca",
        "udeccy",
        "minamt",
        "maxamt",
        "freetxn",
        "prodmapstat",
        "chargeSlab"
    })
    public static class ChargeProd {

        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "CHGPROD")
        protected String chgprod;
        @XmlElement(name = "WAIVEPROD")
        protected String waiveprod;
        @XmlElement(name = "GEN_UCA")
        protected String genuca;
        @XmlElement(name = "UDE_CCY")
        protected String udeccy;
        @XmlElement(name = "MIN_AMT")
        protected BigDecimal minamt;
        @XmlElement(name = "MAX_AMT")
        protected BigDecimal maxamt;
        @XmlElement(name = "FREETXN")
        protected BigDecimal freetxn;
        @XmlElement(name = "PRODMAPSTAT")
        protected String prodmapstat;
        @XmlElement(name = "Charge-Slab")
        protected List<CustAccTfrCreateIOType.ChargeProd.ChargeSlab> chargeSlab;

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
         * Gets the value of the chgprod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGPROD() {
            return chgprod;
        }

        /**
         * Sets the value of the chgprod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGPROD(String value) {
            this.chgprod = value;
        }

        /**
         * Gets the value of the waiveprod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAIVEPROD() {
            return waiveprod;
        }

        /**
         * Sets the value of the waiveprod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAIVEPROD(String value) {
            this.waiveprod = value;
        }

        /**
         * Gets the value of the genuca property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENUCA() {
            return genuca;
        }

        /**
         * Sets the value of the genuca property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENUCA(String value) {
            this.genuca = value;
        }

        /**
         * Gets the value of the udeccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUDECCY() {
            return udeccy;
        }

        /**
         * Sets the value of the udeccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUDECCY(String value) {
            this.udeccy = value;
        }

        /**
         * Gets the value of the minamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINAMT() {
            return minamt;
        }

        /**
         * Sets the value of the minamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINAMT(BigDecimal value) {
            this.minamt = value;
        }

        /**
         * Gets the value of the maxamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMAXAMT() {
            return maxamt;
        }

        /**
         * Sets the value of the maxamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMAXAMT(BigDecimal value) {
            this.maxamt = value;
        }

        /**
         * Gets the value of the freetxn property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFREETXN() {
            return freetxn;
        }

        /**
         * Sets the value of the freetxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFREETXN(BigDecimal value) {
            this.freetxn = value;
        }

        /**
         * Gets the value of the prodmapstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODMAPSTAT() {
            return prodmapstat;
        }

        /**
         * Sets the value of the prodmapstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODMAPSTAT(String value) {
            this.prodmapstat = value;
        }

        /**
         * Gets the value of the chargeSlab property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargeSlab property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChargeSlab().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustAccTfrCreateIOType.ChargeProd.ChargeSlab }
         * 
         * 
         */
        public List<CustAccTfrCreateIOType.ChargeProd.ChargeSlab> getChargeSlab() {
            if (chargeSlab == null) {
                chargeSlab = new ArrayList<CustAccTfrCreateIOType.ChargeProd.ChargeSlab>();
            }
            return this.chargeSlab;
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
         *         &lt;element name="SLABAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CHGRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            "slabamt",
            "chgamt",
            "chgrate"
        })
        public static class ChargeSlab {

            @XmlElement(name = "SLABAMT")
            protected BigDecimal slabamt;
            @XmlElement(name = "CHGAMT")
            protected BigDecimal chgamt;
            @XmlElement(name = "CHGRATE")
            protected BigDecimal chgrate;

            /**
             * Gets the value of the slabamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSLABAMT() {
                return slabamt;
            }

            /**
             * Sets the value of the slabamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSLABAMT(BigDecimal value) {
                this.slabamt = value;
            }

            /**
             * Gets the value of the chgamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCHGAMT() {
                return chgamt;
            }

            /**
             * Sets the value of the chgamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCHGAMT(BigDecimal value) {
                this.chgamt = value;
            }

            /**
             * Gets the value of the chgrate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCHGRATE() {
                return chgrate;
            }

            /**
             * Sets the value of the chgrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCHGRATE(BigDecimal value) {
                this.chgrate = value;
            }

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
     *         &lt;element name="RECRDSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DISCPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DISCAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="WAIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "recrdstat",
        "discpc",
        "discamt",
        "waive",
        "rec",
        "brn",
        "acc",
        "branchcode",
        "account",
        "prod",
        "minamt",
        "maxamt"
    })
    public static class ConsolCharges {

        @XmlElement(name = "RECRDSTAT")
        protected String recrdstat;
        @XmlElement(name = "DISCPC")
        protected BigDecimal discpc;
        @XmlElement(name = "DISCAMT")
        protected BigDecimal discamt;
        @XmlElement(name = "WAIVE")
        protected String waive;
        @XmlElement(name = "REC")
        protected String rec;
        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "BRANCH_CODE")
        protected String branchcode;
        @XmlElement(name = "ACCOUNT")
        protected String account;
        @XmlElement(name = "PROD")
        protected String prod;
        @XmlElement(name = "MINAMT")
        protected BigDecimal minamt;
        @XmlElement(name = "MAXAMT")
        protected BigDecimal maxamt;

        /**
         * Gets the value of the recrdstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECRDSTAT() {
            return recrdstat;
        }

        /**
         * Sets the value of the recrdstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECRDSTAT(String value) {
            this.recrdstat = value;
        }

        /**
         * Gets the value of the discpc property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDISCPC() {
            return discpc;
        }

        /**
         * Sets the value of the discpc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDISCPC(BigDecimal value) {
            this.discpc = value;
        }

        /**
         * Gets the value of the discamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDISCAMT() {
            return discamt;
        }

        /**
         * Sets the value of the discamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDISCAMT(BigDecimal value) {
            this.discamt = value;
        }

        /**
         * Gets the value of the waive property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAIVE() {
            return waive;
        }

        /**
         * Sets the value of the waive property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAIVE(String value) {
            this.waive = value;
        }

        /**
         * Gets the value of the rec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREC() {
            return rec;
        }

        /**
         * Sets the value of the rec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREC(String value) {
            this.rec = value;
        }

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
         * Gets the value of the branchcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRANCHCODE() {
            return branchcode;
        }

        /**
         * Sets the value of the branchcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRANCHCODE(String value) {
            this.branchcode = value;
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
         * Gets the value of the prod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROD() {
            return prod;
        }

        /**
         * Sets the value of the prod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROD(String value) {
            this.prod = value;
        }

        /**
         * Gets the value of the minamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINAMT() {
            return minamt;
        }

        /**
         * Sets the value of the minamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINAMT(BigDecimal value) {
            this.minamt = value;
        }

        /**
         * Gets the value of the maxamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMAXAMT() {
            return maxamt;
        }

        /**
         * Sets the value of the maxamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMAXAMT(BigDecimal value) {
            this.maxamt = value;
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
     *         &lt;element name="CALCULATION_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INT_BOOKING_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INT_START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CHARGE_BOOKING_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INT_BOOK_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARGE_START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="CONSOLACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CONSOLCHGBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "calculationaccount",
        "intbookingaccount",
        "intstartdate",
        "chargebookingaccount",
        "hasis",
        "intbookbranch",
        "drcradv",
        "chgbookaccbrn",
        "chargestartdate",
        "consolacc",
        "consolchgbrn"
    })
    public static class IctmAcc {

        @XmlElement(name = "CALCULATION_ACCOUNT")
        protected String calculationaccount;
        @XmlElement(name = "INT_BOOKING_ACCOUNT")
        protected String intbookingaccount;
        @XmlElement(name = "INT_START_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar intstartdate;
        @XmlElement(name = "CHARGE_BOOKING_ACCOUNT")
        protected String chargebookingaccount;
        @XmlElement(name = "HASIS")
        protected String hasis;
        @XmlElement(name = "INT_BOOK_BRANCH")
        protected String intbookbranch;
        @XmlElement(name = "DRCRADV")
        protected String drcradv;
        @XmlElement(name = "CHGBOOKACCBRN")
        protected String chgbookaccbrn;
        @XmlElement(name = "CHARGE_START_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar chargestartdate;
        @XmlElement(name = "CONSOLACC")
        protected String consolacc;
        @XmlElement(name = "CONSOLCHGBRN")
        protected String consolchgbrn;

        /**
         * Gets the value of the calculationaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCULATIONACCOUNT() {
            return calculationaccount;
        }

        /**
         * Sets the value of the calculationaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCULATIONACCOUNT(String value) {
            this.calculationaccount = value;
        }

        /**
         * Gets the value of the intbookingaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTBOOKINGACCOUNT() {
            return intbookingaccount;
        }

        /**
         * Sets the value of the intbookingaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTBOOKINGACCOUNT(String value) {
            this.intbookingaccount = value;
        }

        /**
         * Gets the value of the intstartdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getINTSTARTDATE() {
            return intstartdate;
        }

        /**
         * Sets the value of the intstartdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setINTSTARTDATE(XMLGregorianCalendar value) {
            this.intstartdate = value;
        }

        /**
         * Gets the value of the chargebookingaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARGEBOOKINGACCOUNT() {
            return chargebookingaccount;
        }

        /**
         * Sets the value of the chargebookingaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARGEBOOKINGACCOUNT(String value) {
            this.chargebookingaccount = value;
        }

        /**
         * Gets the value of the hasis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHASIS() {
            return hasis;
        }

        /**
         * Sets the value of the hasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHASIS(String value) {
            this.hasis = value;
        }

        /**
         * Gets the value of the intbookbranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTBOOKBRANCH() {
            return intbookbranch;
        }

        /**
         * Sets the value of the intbookbranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTBOOKBRANCH(String value) {
            this.intbookbranch = value;
        }

        /**
         * Gets the value of the drcradv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCRADV() {
            return drcradv;
        }

        /**
         * Sets the value of the drcradv property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCRADV(String value) {
            this.drcradv = value;
        }

        /**
         * Gets the value of the chgbookaccbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGBOOKACCBRN() {
            return chgbookaccbrn;
        }

        /**
         * Sets the value of the chgbookaccbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGBOOKACCBRN(String value) {
            this.chgbookaccbrn = value;
        }

        /**
         * Gets the value of the chargestartdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCHARGESTARTDATE() {
            return chargestartdate;
        }

        /**
         * Sets the value of the chargestartdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCHARGESTARTDATE(XMLGregorianCalendar value) {
            this.chargestartdate = value;
        }

        /**
         * Gets the value of the consolacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSOLACC() {
            return consolacc;
        }

        /**
         * Sets the value of the consolacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSOLACC(String value) {
            this.consolacc = value;
        }

        /**
         * Gets the value of the consolchgbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSOLCHGBRN() {
            return consolchgbrn;
        }

        /**
         * Sets the value of the consolchgbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSOLCHGBRN(String value) {
            this.consolchgbrn = value;
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
     *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WAIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GEN_UCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INTRECSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ONCE_AUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UDE_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MIN_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MAX_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="FREETXN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Ude-Effdt" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UDEEFFECTIVEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Ude-Vals" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="UDEVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "product",
        "waive",
        "genuca",
        "intrecstat",
        "onceauth",
        "udeccy",
        "minamt",
        "maxamt",
        "freetxn",
        "udeEffdt"
    })
    public static class Interest {

        @XmlElement(name = "PRODUCT")
        protected String product;
        @XmlElement(name = "WAIVE")
        protected String waive;
        @XmlElement(name = "GEN_UCA")
        protected String genuca;
        @XmlElement(name = "INTRECSTAT")
        protected String intrecstat;
        @XmlElement(name = "ONCE_AUTH")
        protected String onceauth;
        @XmlElement(name = "UDE_CCY")
        protected String udeccy;
        @XmlElement(name = "MIN_AMT")
        protected BigDecimal minamt;
        @XmlElement(name = "MAX_AMT")
        protected BigDecimal maxamt;
        @XmlElement(name = "FREETXN")
        protected BigDecimal freetxn;
        @XmlElement(name = "Ude-Effdt")
        protected List<CustAccTfrCreateIOType.Interest.UdeEffdt> udeEffdt;

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCT() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCT(String value) {
            this.product = value;
        }

        /**
         * Gets the value of the waive property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAIVE() {
            return waive;
        }

        /**
         * Sets the value of the waive property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAIVE(String value) {
            this.waive = value;
        }

        /**
         * Gets the value of the genuca property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENUCA() {
            return genuca;
        }

        /**
         * Sets the value of the genuca property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENUCA(String value) {
            this.genuca = value;
        }

        /**
         * Gets the value of the intrecstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTRECSTAT() {
            return intrecstat;
        }

        /**
         * Sets the value of the intrecstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTRECSTAT(String value) {
            this.intrecstat = value;
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
         * Gets the value of the udeccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUDECCY() {
            return udeccy;
        }

        /**
         * Sets the value of the udeccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUDECCY(String value) {
            this.udeccy = value;
        }

        /**
         * Gets the value of the minamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINAMT() {
            return minamt;
        }

        /**
         * Sets the value of the minamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINAMT(BigDecimal value) {
            this.minamt = value;
        }

        /**
         * Gets the value of the maxamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMAXAMT() {
            return maxamt;
        }

        /**
         * Sets the value of the maxamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMAXAMT(BigDecimal value) {
            this.maxamt = value;
        }

        /**
         * Gets the value of the freetxn property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFREETXN() {
            return freetxn;
        }

        /**
         * Sets the value of the freetxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFREETXN(BigDecimal value) {
            this.freetxn = value;
        }

        /**
         * Gets the value of the udeEffdt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the udeEffdt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUdeEffdt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustAccTfrCreateIOType.Interest.UdeEffdt }
         * 
         * 
         */
        public List<CustAccTfrCreateIOType.Interest.UdeEffdt> getUdeEffdt() {
            if (udeEffdt == null) {
                udeEffdt = new ArrayList<CustAccTfrCreateIOType.Interest.UdeEffdt>();
            }
            return this.udeEffdt;
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
         *         &lt;element name="UDEEFFECTIVEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Ude-Vals" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UDEVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "udeeffectivedate",
            "udeVals"
        })
        public static class UdeEffdt {

            @XmlElement(name = "UDEEFFECTIVEDATE")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar udeeffectivedate;
            @XmlElement(name = "Ude-Vals")
            protected List<CustAccTfrCreateIOType.Interest.UdeEffdt.UdeVals> udeVals;

            /**
             * Gets the value of the udeeffectivedate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getUDEEFFECTIVEDATE() {
                return udeeffectivedate;
            }

            /**
             * Sets the value of the udeeffectivedate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setUDEEFFECTIVEDATE(XMLGregorianCalendar value) {
                this.udeeffectivedate = value;
            }

            /**
             * Gets the value of the udeVals property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the udeVals property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUdeVals().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CustAccTfrCreateIOType.Interest.UdeEffdt.UdeVals }
             * 
             * 
             */
            public List<CustAccTfrCreateIOType.Interest.UdeEffdt.UdeVals> getUdeVals() {
                if (udeVals == null) {
                    udeVals = new ArrayList<CustAccTfrCreateIOType.Interest.UdeEffdt.UdeVals>();
                }
                return this.udeVals;
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
             *         &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="UDEVAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "udeid",
                "udeval",
                "ratecode"
            })
            public static class UdeVals {

                @XmlElement(name = "UDEID")
                protected String udeid;
                @XmlElement(name = "UDEVAL")
                protected BigDecimal udeval;
                @XmlElement(name = "RATE_CODE")
                protected String ratecode;

                /**
                 * Gets the value of the udeid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUDEID() {
                    return udeid;
                }

                /**
                 * Sets the value of the udeid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUDEID(String value) {
                    this.udeid = value;
                }

                /**
                 * Gets the value of the udeval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUDEVAL() {
                    return udeval;
                }

                /**
                 * Sets the value of the udeval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUDEVAL(BigDecimal value) {
                    this.udeval = value;
                }

                /**
                 * Gets the value of the ratecode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRATECODE() {
                    return ratecode;
                }

                /**
                 * Sets the value of the ratecode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRATECODE(String value) {
                    this.ratecode = value;
                }

            }

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
     *         &lt;element name="UNIT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RELATED_CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RELATED_REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MIS_HEAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="POOLCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RATE_FLAG1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REF_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CALC_METHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PROCESSING_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MIS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MIS_GROUP_TXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MIS_GROUP_COMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="COMPMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMPMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TXNMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COSTCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FUND_MIS_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REF_SPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="REF_RATE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REF_RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REF_XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CHARFIELD22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARFIELD23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARFIELD24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARFIELD25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARFIELD26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARFIELD27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARFIELD28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARFIELD29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CHARFIELD30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCOUNTCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "unittype",
        "product",
        "customer",
        "relatedcustomer",
        "relatedref",
        "ccy",
        "mishead",
        "poolcode",
        "rateflag1",
        "refrate",
        "calcmethod",
        "processingflag",
        "misgroup",
        "misgrouptxn",
        "misgroupcomp",
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
        "compmis7",
        "txnmis7",
        "compmis8",
        "txnmis8",
        "compmis9",
        "txnmis9",
        "costcd1",
        "costcd2",
        "costcd3",
        "costcd4",
        "costcd5",
        "fundmis1",
        "fundmis2",
        "fundmis3",
        "fundmis4",
        "fundmis5",
        "fundmis6",
        "fundmis7",
        "fundmis8",
        "fundmis9",
        "fundmis10",
        "refspread",
        "refratetype",
        "refratecode",
        "refxrate",
        "charfield22",
        "charfield23",
        "charfield24",
        "charfield25",
        "charfield26",
        "charfield27",
        "charfield28",
        "charfield29",
        "charfield30",
        "accountclass"
    })
    public static class Mis {

        @XmlElement(name = "UNIT_TYPE")
        protected String unittype;
        @XmlElement(name = "PRODUCT")
        protected String product;
        @XmlElement(name = "CUSTOMER")
        protected String customer;
        @XmlElement(name = "RELATED_CUSTOMER")
        protected String relatedcustomer;
        @XmlElement(name = "RELATED_REF")
        protected String relatedref;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "MIS_HEAD")
        protected String mishead;
        @XmlElement(name = "POOLCODE")
        protected String poolcode;
        @XmlElement(name = "RATE_FLAG1")
        protected String rateflag1;
        @XmlElement(name = "REF_RATE")
        protected BigDecimal refrate;
        @XmlElement(name = "CALC_METHOD")
        protected String calcmethod;
        @XmlElement(name = "PROCESSING_FLAG")
        protected String processingflag;
        @XmlElement(name = "MIS_GROUP")
        protected String misgroup;
        @XmlElement(name = "MIS_GROUP_TXN")
        protected String misgrouptxn;
        @XmlElement(name = "MIS_GROUP_COMP")
        protected String misgroupcomp;
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
        @XmlElement(name = "COMPMIS7")
        protected String compmis7;
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
        @XmlElement(name = "COSTCD1")
        protected String costcd1;
        @XmlElement(name = "COSTCD2")
        protected String costcd2;
        @XmlElement(name = "COSTCD3")
        protected String costcd3;
        @XmlElement(name = "COSTCD4")
        protected String costcd4;
        @XmlElement(name = "COSTCD5")
        protected String costcd5;
        @XmlElement(name = "FUND_MIS_1")
        protected String fundmis1;
        @XmlElement(name = "FUND_MIS_2")
        protected String fundmis2;
        @XmlElement(name = "FUND_MIS_3")
        protected String fundmis3;
        @XmlElement(name = "FUND_MIS_4")
        protected String fundmis4;
        @XmlElement(name = "FUND_MIS_5")
        protected String fundmis5;
        @XmlElement(name = "FUND_MIS_6")
        protected String fundmis6;
        @XmlElement(name = "FUND_MIS_7")
        protected String fundmis7;
        @XmlElement(name = "FUND_MIS_8")
        protected String fundmis8;
        @XmlElement(name = "FUND_MIS_9")
        protected String fundmis9;
        @XmlElement(name = "FUND_MIS_10")
        protected String fundmis10;
        @XmlElement(name = "REF_SPREAD")
        protected BigDecimal refspread;
        @XmlElement(name = "REF_RATE_TYPE")
        protected String refratetype;
        @XmlElement(name = "REF_RATE_CODE")
        protected String refratecode;
        @XmlElement(name = "REF_XRATE")
        protected BigDecimal refxrate;
        @XmlElement(name = "CHARFIELD22")
        protected String charfield22;
        @XmlElement(name = "CHARFIELD23")
        protected String charfield23;
        @XmlElement(name = "CHARFIELD24")
        protected String charfield24;
        @XmlElement(name = "CHARFIELD25")
        protected String charfield25;
        @XmlElement(name = "CHARFIELD26")
        protected String charfield26;
        @XmlElement(name = "CHARFIELD27")
        protected String charfield27;
        @XmlElement(name = "CHARFIELD28")
        protected String charfield28;
        @XmlElement(name = "CHARFIELD29")
        protected String charfield29;
        @XmlElement(name = "CHARFIELD30")
        protected String charfield30;
        @XmlElement(name = "ACCOUNTCLASS")
        protected String accountclass;

        /**
         * Gets the value of the unittype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNITTYPE() {
            return unittype;
        }

        /**
         * Sets the value of the unittype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNITTYPE(String value) {
            this.unittype = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCT() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCT(String value) {
            this.product = value;
        }

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
         * Gets the value of the relatedcustomer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATEDCUSTOMER() {
            return relatedcustomer;
        }

        /**
         * Sets the value of the relatedcustomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATEDCUSTOMER(String value) {
            this.relatedcustomer = value;
        }

        /**
         * Gets the value of the relatedref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATEDREF() {
            return relatedref;
        }

        /**
         * Sets the value of the relatedref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATEDREF(String value) {
            this.relatedref = value;
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
         * Gets the value of the mishead property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISHEAD() {
            return mishead;
        }

        /**
         * Sets the value of the mishead property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISHEAD(String value) {
            this.mishead = value;
        }

        /**
         * Gets the value of the poolcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOOLCODE() {
            return poolcode;
        }

        /**
         * Sets the value of the poolcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOOLCODE(String value) {
            this.poolcode = value;
        }

        /**
         * Gets the value of the rateflag1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATEFLAG1() {
            return rateflag1;
        }

        /**
         * Sets the value of the rateflag1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATEFLAG1(String value) {
            this.rateflag1 = value;
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
         * Gets the value of the calcmethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCMETHOD() {
            return calcmethod;
        }

        /**
         * Sets the value of the calcmethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCMETHOD(String value) {
            this.calcmethod = value;
        }

        /**
         * Gets the value of the processingflag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROCESSINGFLAG() {
            return processingflag;
        }

        /**
         * Sets the value of the processingflag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROCESSINGFLAG(String value) {
            this.processingflag = value;
        }

        /**
         * Gets the value of the misgroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGROUP() {
            return misgroup;
        }

        /**
         * Sets the value of the misgroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGROUP(String value) {
            this.misgroup = value;
        }

        /**
         * Gets the value of the misgrouptxn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGROUPTXN() {
            return misgrouptxn;
        }

        /**
         * Sets the value of the misgrouptxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGROUPTXN(String value) {
            this.misgrouptxn = value;
        }

        /**
         * Gets the value of the misgroupcomp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISGROUPCOMP() {
            return misgroupcomp;
        }

        /**
         * Sets the value of the misgroupcomp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISGROUPCOMP(String value) {
            this.misgroupcomp = value;
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
         * Gets the value of the costcd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCD1() {
            return costcd1;
        }

        /**
         * Sets the value of the costcd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCD1(String value) {
            this.costcd1 = value;
        }

        /**
         * Gets the value of the costcd2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCD2() {
            return costcd2;
        }

        /**
         * Sets the value of the costcd2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCD2(String value) {
            this.costcd2 = value;
        }

        /**
         * Gets the value of the costcd3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCD3() {
            return costcd3;
        }

        /**
         * Sets the value of the costcd3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCD3(String value) {
            this.costcd3 = value;
        }

        /**
         * Gets the value of the costcd4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCD4() {
            return costcd4;
        }

        /**
         * Sets the value of the costcd4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCD4(String value) {
            this.costcd4 = value;
        }

        /**
         * Gets the value of the costcd5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTCD5() {
            return costcd5;
        }

        /**
         * Sets the value of the costcd5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTCD5(String value) {
            this.costcd5 = value;
        }

        /**
         * Gets the value of the fundmis1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS1() {
            return fundmis1;
        }

        /**
         * Sets the value of the fundmis1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS1(String value) {
            this.fundmis1 = value;
        }

        /**
         * Gets the value of the fundmis2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS2() {
            return fundmis2;
        }

        /**
         * Sets the value of the fundmis2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS2(String value) {
            this.fundmis2 = value;
        }

        /**
         * Gets the value of the fundmis3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS3() {
            return fundmis3;
        }

        /**
         * Sets the value of the fundmis3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS3(String value) {
            this.fundmis3 = value;
        }

        /**
         * Gets the value of the fundmis4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS4() {
            return fundmis4;
        }

        /**
         * Sets the value of the fundmis4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS4(String value) {
            this.fundmis4 = value;
        }

        /**
         * Gets the value of the fundmis5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS5() {
            return fundmis5;
        }

        /**
         * Sets the value of the fundmis5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS5(String value) {
            this.fundmis5 = value;
        }

        /**
         * Gets the value of the fundmis6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS6() {
            return fundmis6;
        }

        /**
         * Sets the value of the fundmis6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS6(String value) {
            this.fundmis6 = value;
        }

        /**
         * Gets the value of the fundmis7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS7() {
            return fundmis7;
        }

        /**
         * Sets the value of the fundmis7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS7(String value) {
            this.fundmis7 = value;
        }

        /**
         * Gets the value of the fundmis8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS8() {
            return fundmis8;
        }

        /**
         * Sets the value of the fundmis8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS8(String value) {
            this.fundmis8 = value;
        }

        /**
         * Gets the value of the fundmis9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS9() {
            return fundmis9;
        }

        /**
         * Sets the value of the fundmis9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS9(String value) {
            this.fundmis9 = value;
        }

        /**
         * Gets the value of the fundmis10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDMIS10() {
            return fundmis10;
        }

        /**
         * Sets the value of the fundmis10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDMIS10(String value) {
            this.fundmis10 = value;
        }

        /**
         * Gets the value of the refspread property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getREFSPREAD() {
            return refspread;
        }

        /**
         * Sets the value of the refspread property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setREFSPREAD(BigDecimal value) {
            this.refspread = value;
        }

        /**
         * Gets the value of the refratetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFRATETYPE() {
            return refratetype;
        }

        /**
         * Sets the value of the refratetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFRATETYPE(String value) {
            this.refratetype = value;
        }

        /**
         * Gets the value of the refratecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFRATECODE() {
            return refratecode;
        }

        /**
         * Sets the value of the refratecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFRATECODE(String value) {
            this.refratecode = value;
        }

        /**
         * Gets the value of the refxrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getREFXRATE() {
            return refxrate;
        }

        /**
         * Sets the value of the refxrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setREFXRATE(BigDecimal value) {
            this.refxrate = value;
        }

        /**
         * Gets the value of the charfield22 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD22() {
            return charfield22;
        }

        /**
         * Sets the value of the charfield22 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD22(String value) {
            this.charfield22 = value;
        }

        /**
         * Gets the value of the charfield23 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD23() {
            return charfield23;
        }

        /**
         * Sets the value of the charfield23 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD23(String value) {
            this.charfield23 = value;
        }

        /**
         * Gets the value of the charfield24 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD24() {
            return charfield24;
        }

        /**
         * Sets the value of the charfield24 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD24(String value) {
            this.charfield24 = value;
        }

        /**
         * Gets the value of the charfield25 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD25() {
            return charfield25;
        }

        /**
         * Sets the value of the charfield25 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD25(String value) {
            this.charfield25 = value;
        }

        /**
         * Gets the value of the charfield26 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD26() {
            return charfield26;
        }

        /**
         * Sets the value of the charfield26 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD26(String value) {
            this.charfield26 = value;
        }

        /**
         * Gets the value of the charfield27 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD27() {
            return charfield27;
        }

        /**
         * Sets the value of the charfield27 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD27(String value) {
            this.charfield27 = value;
        }

        /**
         * Gets the value of the charfield28 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD28() {
            return charfield28;
        }

        /**
         * Sets the value of the charfield28 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD28(String value) {
            this.charfield28 = value;
        }

        /**
         * Gets the value of the charfield29 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD29() {
            return charfield29;
        }

        /**
         * Sets the value of the charfield29 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD29(String value) {
            this.charfield29 = value;
        }

        /**
         * Gets the value of the charfield30 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARFIELD30() {
            return charfield30;
        }

        /**
         * Sets the value of the charfield30 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARFIELD30(String value) {
            this.charfield30 = value;
        }

        /**
         * Gets the value of the accountclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTCLASS() {
            return accountclass;
        }

        /**
         * Sets the value of the accountclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTCLASS(String value) {
            this.accountclass = value;
        }

    }

}
