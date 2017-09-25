
package com.ofss.fcubs.gw.ws.types;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZEACCLASSTFRFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZEACCLASSTFRFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZEACCLASSTFRIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZEACCLASSTFRIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKBOOKFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKBOOKFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKBOOKIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKBOOKIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKDETAILSFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKDETAILSFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKDETAILSIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKDETAILSIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZESTOPPAYMENTSFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZESTOPPAYMENTSFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZESTOPPAYMENTSIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZESTOPPAYMENTSIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZETDCUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZETDCUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZETDCUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.AUTHORIZETDCUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CHECKDETAILSQUERYIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CHECKDETAILSQUERYIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECHECKBOOKFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECHECKBOOKFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECHECKBOOKIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECHECKBOOKIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CLOSESTOPPAYMENTSFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSESTOPPAYMENTSFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CLOSESTOPPAYMENTSIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSESTOPPAYMENTSIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CLOSETDCUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSETDCUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CLOSETDCUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CLOSETDCUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATEACCLASSTFRFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATEACCLASSTFRFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATEACCLASSTFRIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATEACCLASSTFRIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATECHECKBOOKFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATECHECKBOOKFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATECHECKBOOKIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATECHECKBOOKIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATESTOPPAYMENTSFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATESTOPPAYMENTSFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATESTOPPAYMENTSIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATESTOPPAYMENTSIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATETDCUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATETDCUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATETDCUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATETDCUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATETDSIMFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATETDSIMFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CREATETDSIMIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATETDSIMIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETEACCLASSTFRFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETEACCLASSTFRFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETEACCLASSTFRIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETEACCLASSTFRIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETECHECKBOOKFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETECHECKBOOKFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETECHECKBOOKIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETECHECKBOOKIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETECUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETECUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETECUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETECUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETESTOPPAYMENTSFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETESTOPPAYMENTSFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETESTOPPAYMENTSIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETESTOPPAYMENTSIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETETDCUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETETDCUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.DELETETDCUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.DELETETDCUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYACCLASSTFRFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYACCLASSTFRFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYACCLASSTFRIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYACCLASSTFRIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKBOOKFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKBOOKFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKBOOKIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKBOOKIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKDETAILSFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKDETAILSFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKDETAILSIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKDETAILSIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYCUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYSTOPPAYMENTSFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYSTOPPAYMENTSFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYSTOPPAYMENTSIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYSTOPPAYMENTSIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYTDCUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYTDCUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYTDCUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.MODIFYTDCUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.ObjectFactory;
import com.ofss.fcubs.service.fcubsaccservice.QUERYACCBALIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYACCBALIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYACCLASSTFRIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYACCLASSTFRIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYACCSUMMIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYACCSUMMIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYCHECKBOOKIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYCHECKBOOKIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYCHECKDETAILSIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYCHECKDETAILSIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYCUSTACCIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYCUSTACCIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYCUSTACCOUNTDETAILSIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYCUSTACCOUNTDETAILSIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYGENADVICEIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYGENADVICEIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYSTOPPAYMENTSIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYSTOPPAYMENTSIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.QUERYTDCUSTACCIOFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.QUERYTDCUSTACCIOFSRES;
import com.ofss.fcubs.service.fcubsaccservice.REOPENCHECKBOOKFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.REOPENCHECKBOOKFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.REOPENCHECKBOOKIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.REOPENCHECKBOOKIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.REOPENCUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.REOPENCUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.REOPENCUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.REOPENCUSTACCIOPKRES;
import com.ofss.fcubs.service.fcubsaccservice.REOPENTDCUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.REOPENTDCUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.REOPENTDCUSTACCIOPKREQ;
import com.ofss.fcubs.service.fcubsaccservice.REOPENTDCUSTACCIOPKRES;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FCUBSAccServiceSEI", targetNamespace = "http://types.ws.gw.fcubs.ofss.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FCUBSAccServiceSEI {


    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZEACCLASSTFRFSFSRES
     */
    @WebMethod(operationName = "AuthorizeAcClassTfrFS")
    @WebResult(name = "AUTHORIZEACCLASSTFR_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZEACCLASSTFRFSFSRES authorizeAcClassTfrFS(
        @WebParam(name = "AUTHORIZEACCLASSTFR_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZEACCLASSTFRFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZEACCLASSTFRIOPKRES
     */
    @WebMethod(operationName = "AuthorizeAcClassTfrIO")
    @WebResult(name = "AUTHORIZEACCLASSTFR_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZEACCLASSTFRIOPKRES authorizeAcClassTfrIO(
        @WebParam(name = "AUTHORIZEACCLASSTFR_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZEACCLASSTFRIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKBOOKFSFSRES
     */
    @WebMethod(operationName = "AuthorizeCheckBookFS")
    @WebResult(name = "AUTHORIZECHECKBOOK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZECHECKBOOKFSFSRES authorizeCheckBookFS(
        @WebParam(name = "AUTHORIZECHECKBOOK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZECHECKBOOKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKBOOKIOPKRES
     */
    @WebMethod(operationName = "AuthorizeCheckBookIO")
    @WebResult(name = "AUTHORIZECHECKBOOK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZECHECKBOOKIOPKRES authorizeCheckBookIO(
        @WebParam(name = "AUTHORIZECHECKBOOK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZECHECKBOOKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKDETAILSFSFSRES
     */
    @WebMethod(operationName = "AuthorizeCheckDetailsFS")
    @WebResult(name = "AUTHORIZECHECKDETAILS_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZECHECKDETAILSFSFSRES authorizeCheckDetailsFS(
        @WebParam(name = "AUTHORIZECHECKDETAILS_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZECHECKDETAILSFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECHECKDETAILSIOPKRES
     */
    @WebMethod(operationName = "AuthorizeCheckDetailsIO")
    @WebResult(name = "AUTHORIZECHECKDETAILS_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZECHECKDETAILSIOPKRES authorizeCheckDetailsIO(
        @WebParam(name = "AUTHORIZECHECKDETAILS_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZECHECKDETAILSIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECUSTACCFSFSRES
     */
    @WebMethod(operationName = "AuthorizeCustAccFS")
    @WebResult(name = "AUTHORIZECUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZECUSTACCFSFSRES authorizeCustAccFS(
        @WebParam(name = "AUTHORIZECUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZECUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZECUSTACCIOPKRES
     */
    @WebMethod(operationName = "AuthorizeCustAccIO")
    @WebResult(name = "AUTHORIZECUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZECUSTACCIOPKRES authorizeCustAccIO(
        @WebParam(name = "AUTHORIZECUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZECUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZESTOPPAYMENTSFSFSRES
     */
    @WebMethod(operationName = "AuthorizeStopPaymentsFS")
    @WebResult(name = "AUTHORIZESTOPPAYMENTS_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZESTOPPAYMENTSFSFSRES authorizeStopPaymentsFS(
        @WebParam(name = "AUTHORIZESTOPPAYMENTS_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZESTOPPAYMENTSFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZESTOPPAYMENTSIOPKRES
     */
    @WebMethod(operationName = "AuthorizeStopPaymentsIO")
    @WebResult(name = "AUTHORIZESTOPPAYMENTS_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZESTOPPAYMENTSIOPKRES authorizeStopPaymentsIO(
        @WebParam(name = "AUTHORIZESTOPPAYMENTS_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZESTOPPAYMENTSIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZETDCUSTACCFSFSRES
     */
    @WebMethod(operationName = "AuthorizeTDCustAccFS")
    @WebResult(name = "AUTHORIZETDCUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZETDCUSTACCFSFSRES authorizeTDCustAccFS(
        @WebParam(name = "AUTHORIZETDCUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZETDCUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.AUTHORIZETDCUSTACCIOPKRES
     */
    @WebMethod(operationName = "AuthorizeTDCustAccIO")
    @WebResult(name = "AUTHORIZETDCUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public AUTHORIZETDCUSTACCIOPKRES authorizeTDCustAccIO(
        @WebParam(name = "AUTHORIZETDCUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        AUTHORIZETDCUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CHECKDETAILSQUERYIOFSRES
     */
    @WebMethod(operationName = "CheckDetailsQueryIO")
    @WebResult(name = "CHECKDETAILSQUERY_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CHECKDETAILSQUERYIOFSRES checkDetailsQueryIO(
        @WebParam(name = "CHECKDETAILSQUERY_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CHECKDETAILSQUERYIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CLOSECHECKBOOKFSFSRES
     */
    @WebMethod(operationName = "CloseCheckBookFS")
    @WebResult(name = "CLOSECHECKBOOK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CLOSECHECKBOOKFSFSRES closeCheckBookFS(
        @WebParam(name = "CLOSECHECKBOOK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CLOSECHECKBOOKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CLOSECHECKBOOKIOPKRES
     */
    @WebMethod(operationName = "CloseCheckBookIO")
    @WebResult(name = "CLOSECHECKBOOK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CLOSECHECKBOOKIOPKRES closeCheckBookIO(
        @WebParam(name = "CLOSECHECKBOOK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CLOSECHECKBOOKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCFSFSRES
     */
    @WebMethod(operationName = "CloseCustAccFS")
    @WebResult(name = "CLOSECUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CLOSECUSTACCFSFSRES closeCustAccFS(
        @WebParam(name = "CLOSECUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CLOSECUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CLOSECUSTACCIOPKRES
     */
    @WebMethod(operationName = "CloseCustAccIO")
    @WebResult(name = "CLOSECUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CLOSECUSTACCIOPKRES closeCustAccIO(
        @WebParam(name = "CLOSECUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CLOSECUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CLOSESTOPPAYMENTSFSFSRES
     */
    @WebMethod(operationName = "CloseStopPaymentsFS")
    @WebResult(name = "CLOSESTOPPAYMENTS_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CLOSESTOPPAYMENTSFSFSRES closeStopPaymentsFS(
        @WebParam(name = "CLOSESTOPPAYMENTS_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CLOSESTOPPAYMENTSFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CLOSESTOPPAYMENTSIOPKRES
     */
    @WebMethod(operationName = "CloseStopPaymentsIO")
    @WebResult(name = "CLOSESTOPPAYMENTS_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CLOSESTOPPAYMENTSIOPKRES closeStopPaymentsIO(
        @WebParam(name = "CLOSESTOPPAYMENTS_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CLOSESTOPPAYMENTSIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CLOSETDCUSTACCFSFSRES
     */
    @WebMethod(operationName = "CloseTDCustAccFS")
    @WebResult(name = "CLOSETDCUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CLOSETDCUSTACCFSFSRES closeTDCustAccFS(
        @WebParam(name = "CLOSETDCUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CLOSETDCUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CLOSETDCUSTACCIOPKRES
     */
    @WebMethod(operationName = "CloseTDCustAccIO")
    @WebResult(name = "CLOSETDCUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CLOSETDCUSTACCIOPKRES closeTDCustAccIO(
        @WebParam(name = "CLOSETDCUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CLOSETDCUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATEACCLASSTFRFSFSRES
     */
    @WebMethod(operationName = "CreateAcClassTfrFS")
    @WebResult(name = "CREATEACCLASSTFR_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATEACCLASSTFRFSFSRES createAcClassTfrFS(
        @WebParam(name = "CREATEACCLASSTFR_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATEACCLASSTFRFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATEACCLASSTFRIOPKRES
     */
    @WebMethod(operationName = "CreateAcClassTfrIO")
    @WebResult(name = "CREATEACCLASSTFR_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATEACCLASSTFRIOPKRES createAcClassTfrIO(
        @WebParam(name = "CREATEACCLASSTFR_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATEACCLASSTFRIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATECHECKBOOKFSFSRES
     */
    @WebMethod(operationName = "CreateCheckBookFS")
    @WebResult(name = "CREATECHECKBOOK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATECHECKBOOKFSFSRES createCheckBookFS(
        @WebParam(name = "CREATECHECKBOOK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATECHECKBOOKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATECHECKBOOKIOPKRES
     */
    @WebMethod(operationName = "CreateCheckBookIO")
    @WebResult(name = "CREATECHECKBOOK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATECHECKBOOKIOPKRES createCheckBookIO(
        @WebParam(name = "CREATECHECKBOOK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATECHECKBOOKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCFSFSRES
     */
    @WebMethod(operationName = "CreateCustAccFS")
    @WebResult(name = "CREATECUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATECUSTACCFSFSRES createCustAccFS(
        @WebParam(name = "CREATECUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATECUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCIOPKRES
     */
    @WebMethod(operationName = "CreateCustAccIO")
    @WebResult(name = "CREATECUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATECUSTACCIOPKRES createCustAccIO(
        @WebParam(name = "CREATECUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATECUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATESTOPPAYMENTSFSFSRES
     */
    @WebMethod(operationName = "CreateStopPaymentsFS")
    @WebResult(name = "CREATESTOPPAYMENTS_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATESTOPPAYMENTSFSFSRES createStopPaymentsFS(
        @WebParam(name = "CREATESTOPPAYMENTS_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATESTOPPAYMENTSFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATESTOPPAYMENTSIOPKRES
     */
    @WebMethod(operationName = "CreateStopPaymentsIO")
    @WebResult(name = "CREATESTOPPAYMENTS_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATESTOPPAYMENTSIOPKRES createStopPaymentsIO(
        @WebParam(name = "CREATESTOPPAYMENTS_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATESTOPPAYMENTSIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATETDCUSTACCFSFSRES
     */
    @WebMethod(operationName = "CreateTDCustAccFS")
    @WebResult(name = "CREATETDCUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATETDCUSTACCFSFSRES createTDCustAccFS(
        @WebParam(name = "CREATETDCUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATETDCUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATETDCUSTACCIOPKRES
     */
    @WebMethod(operationName = "CreateTDCustAccIO")
    @WebResult(name = "CREATETDCUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATETDCUSTACCIOPKRES createTDCustAccIO(
        @WebParam(name = "CREATETDCUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATETDCUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATETDSIMFSFSRES
     */
    @WebMethod(operationName = "CreateTDSimFS")
    @WebResult(name = "CREATETDSIM_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATETDSIMFSFSRES createTDSimFS(
        @WebParam(name = "CREATETDSIM_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATETDSIMFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.CREATETDSIMIOPKRES
     */
    @WebMethod(operationName = "CreateTDSimIO")
    @WebResult(name = "CREATETDSIM_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public CREATETDSIMIOPKRES createTDSimIO(
        @WebParam(name = "CREATETDSIM_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        CREATETDSIMIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETEACCLASSTFRFSFSRES
     */
    @WebMethod(operationName = "DeleteAcClassTfrFS")
    @WebResult(name = "DELETEACCLASSTFR_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETEACCLASSTFRFSFSRES deleteAcClassTfrFS(
        @WebParam(name = "DELETEACCLASSTFR_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETEACCLASSTFRFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETEACCLASSTFRIOPKRES
     */
    @WebMethod(operationName = "DeleteAcClassTfrIO")
    @WebResult(name = "DELETEACCLASSTFR_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETEACCLASSTFRIOPKRES deleteAcClassTfrIO(
        @WebParam(name = "DELETEACCLASSTFR_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETEACCLASSTFRIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETECHECKBOOKFSFSRES
     */
    @WebMethod(operationName = "DeleteCheckBookFS")
    @WebResult(name = "DELETECHECKBOOK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETECHECKBOOKFSFSRES deleteCheckBookFS(
        @WebParam(name = "DELETECHECKBOOK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETECHECKBOOKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETECHECKBOOKIOPKRES
     */
    @WebMethod(operationName = "DeleteCheckBookIO")
    @WebResult(name = "DELETECHECKBOOK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETECHECKBOOKIOPKRES deleteCheckBookIO(
        @WebParam(name = "DELETECHECKBOOK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETECHECKBOOKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETECUSTACCFSFSRES
     */
    @WebMethod(operationName = "DeleteCustAccFS")
    @WebResult(name = "DELETECUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETECUSTACCFSFSRES deleteCustAccFS(
        @WebParam(name = "DELETECUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETECUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETECUSTACCIOPKRES
     */
    @WebMethod(operationName = "DeleteCustAccIO")
    @WebResult(name = "DELETECUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETECUSTACCIOPKRES deleteCustAccIO(
        @WebParam(name = "DELETECUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETECUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETESTOPPAYMENTSFSFSRES
     */
    @WebMethod(operationName = "DeleteStopPaymentsFS")
    @WebResult(name = "DELETESTOPPAYMENTS_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETESTOPPAYMENTSFSFSRES deleteStopPaymentsFS(
        @WebParam(name = "DELETESTOPPAYMENTS_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETESTOPPAYMENTSFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETESTOPPAYMENTSIOPKRES
     */
    @WebMethod(operationName = "DeleteStopPaymentsIO")
    @WebResult(name = "DELETESTOPPAYMENTS_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETESTOPPAYMENTSIOPKRES deleteStopPaymentsIO(
        @WebParam(name = "DELETESTOPPAYMENTS_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETESTOPPAYMENTSIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETETDCUSTACCFSFSRES
     */
    @WebMethod(operationName = "DeleteTDCustAccFS")
    @WebResult(name = "DELETETDCUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETETDCUSTACCFSFSRES deleteTDCustAccFS(
        @WebParam(name = "DELETETDCUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETETDCUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.DELETETDCUSTACCIOPKRES
     */
    @WebMethod(operationName = "DeleteTDCustAccIO")
    @WebResult(name = "DELETETDCUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public DELETETDCUSTACCIOPKRES deleteTDCustAccIO(
        @WebParam(name = "DELETETDCUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        DELETETDCUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYACCLASSTFRFSFSRES
     */
    @WebMethod(operationName = "ModifyAcClassTfrFS")
    @WebResult(name = "MODIFYACCLASSTFR_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYACCLASSTFRFSFSRES modifyAcClassTfrFS(
        @WebParam(name = "MODIFYACCLASSTFR_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYACCLASSTFRFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYACCLASSTFRIOPKRES
     */
    @WebMethod(operationName = "ModifyAcClassTfrIO")
    @WebResult(name = "MODIFYACCLASSTFR_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYACCLASSTFRIOPKRES modifyAcClassTfrIO(
        @WebParam(name = "MODIFYACCLASSTFR_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYACCLASSTFRIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKBOOKFSFSRES
     */
    @WebMethod(operationName = "ModifyCheckBookFS")
    @WebResult(name = "MODIFYCHECKBOOK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYCHECKBOOKFSFSRES modifyCheckBookFS(
        @WebParam(name = "MODIFYCHECKBOOK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYCHECKBOOKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKBOOKIOPKRES
     */
    @WebMethod(operationName = "ModifyCheckBookIO")
    @WebResult(name = "MODIFYCHECKBOOK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYCHECKBOOKIOPKRES modifyCheckBookIO(
        @WebParam(name = "MODIFYCHECKBOOK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYCHECKBOOKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKDETAILSFSFSRES
     */
    @WebMethod(operationName = "ModifyCheckDetailsFS")
    @WebResult(name = "MODIFYCHECKDETAILS_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYCHECKDETAILSFSFSRES modifyCheckDetailsFS(
        @WebParam(name = "MODIFYCHECKDETAILS_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYCHECKDETAILSFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYCHECKDETAILSIOPKRES
     */
    @WebMethod(operationName = "ModifyCheckDetailsIO")
    @WebResult(name = "MODIFYCHECKDETAILS_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYCHECKDETAILSIOPKRES modifyCheckDetailsIO(
        @WebParam(name = "MODIFYCHECKDETAILS_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYCHECKDETAILSIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYCUSTACCFSFSRES
     */
    @WebMethod(operationName = "ModifyCustAccFS")
    @WebResult(name = "MODIFYCUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYCUSTACCFSFSRES modifyCustAccFS(
        @WebParam(name = "MODIFYCUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYCUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYCUSTACCIOPKRES
     */
    @WebMethod(operationName = "ModifyCustAccIO")
    @WebResult(name = "MODIFYCUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYCUSTACCIOPKRES modifyCustAccIO(
        @WebParam(name = "MODIFYCUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYCUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYSTOPPAYMENTSFSFSRES
     */
    @WebMethod(operationName = "ModifyStopPaymentsFS")
    @WebResult(name = "MODIFYSTOPPAYMENTS_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYSTOPPAYMENTSFSFSRES modifyStopPaymentsFS(
        @WebParam(name = "MODIFYSTOPPAYMENTS_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYSTOPPAYMENTSFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYSTOPPAYMENTSIOPKRES
     */
    @WebMethod(operationName = "ModifyStopPaymentsIO")
    @WebResult(name = "MODIFYSTOPPAYMENTS_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYSTOPPAYMENTSIOPKRES modifyStopPaymentsIO(
        @WebParam(name = "MODIFYSTOPPAYMENTS_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYSTOPPAYMENTSIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYTDCUSTACCFSFSRES
     */
    @WebMethod(operationName = "ModifyTDCustAccFS")
    @WebResult(name = "MODIFYTDCUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYTDCUSTACCFSFSRES modifyTDCustAccFS(
        @WebParam(name = "MODIFYTDCUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYTDCUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.MODIFYTDCUSTACCIOPKRES
     */
    @WebMethod(operationName = "ModifyTDCustAccIO")
    @WebResult(name = "MODIFYTDCUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public MODIFYTDCUSTACCIOPKRES modifyTDCustAccIO(
        @WebParam(name = "MODIFYTDCUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        MODIFYTDCUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYACCLASSTFRIOFSRES
     */
    @WebMethod(operationName = "QueryAcClassTfrIO")
    @WebResult(name = "QUERYACCLASSTFR_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYACCLASSTFRIOFSRES queryAcClassTfrIO(
        @WebParam(name = "QUERYACCLASSTFR_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYACCLASSTFRIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYACCBALIOFSRES
     */
    @WebMethod(operationName = "QueryAccBalIO")
    @WebResult(name = "QUERYACCBAL_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYACCBALIOFSRES queryAccBalIO(
        @WebParam(name = "QUERYACCBAL_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYACCBALIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYACCSUMMIOFSRES
     */
    @WebMethod(operationName = "QueryAccSummIO")
    @WebResult(name = "QUERYACCSUMM_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYACCSUMMIOFSRES queryAccSummIO(
        @WebParam(name = "QUERYACCSUMM_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYACCSUMMIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYCHECKBOOKIOFSRES
     */
    @WebMethod(operationName = "QueryCheckBookIO")
    @WebResult(name = "QUERYCHECKBOOK_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYCHECKBOOKIOFSRES queryCheckBookIO(
        @WebParam(name = "QUERYCHECKBOOK_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYCHECKBOOKIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYCHECKDETAILSIOFSRES
     */
    @WebMethod(operationName = "QueryCheckDetailsIO")
    @WebResult(name = "QUERYCHECKDETAILS_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYCHECKDETAILSIOFSRES queryCheckDetailsIO(
        @WebParam(name = "QUERYCHECKDETAILS_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYCHECKDETAILSIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYCUSTACCIOFSRES
     */
    @WebMethod(operationName = "QueryCustAccIO")
    @WebResult(name = "QUERYCUSTACC_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYCUSTACCIOFSRES queryCustAccIO(
        @WebParam(name = "QUERYCUSTACC_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYCUSTACCIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYGENADVICEIOFSRES
     */
    @WebMethod(operationName = "QueryGenAdviceIO")
    @WebResult(name = "QUERYGENADVICE_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYGENADVICEIOFSRES queryGenAdviceIO(
        @WebParam(name = "QUERYGENADVICE_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYGENADVICEIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYSTOPPAYMENTSIOFSRES
     */
    @WebMethod(operationName = "QueryStopPaymentsIO")
    @WebResult(name = "QUERYSTOPPAYMENTS_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYSTOPPAYMENTSIOFSRES queryStopPaymentsIO(
        @WebParam(name = "QUERYSTOPPAYMENTS_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYSTOPPAYMENTSIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYTDCUSTACCIOFSRES
     */
    @WebMethod(operationName = "QueryTDCustAccIO")
    @WebResult(name = "QUERYTDCUSTACC_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYTDCUSTACCIOFSRES queryTDCustAccIO(
        @WebParam(name = "QUERYTDCUSTACC_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYTDCUSTACCIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.QUERYCUSTACCOUNTDETAILSIOFSRES
     */
    @WebMethod(operationName = "QuerycustAccountDetailsIO")
    @WebResult(name = "QUERYCUSTACCOUNTDETAILS_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public QUERYCUSTACCOUNTDETAILSIOFSRES querycustAccountDetailsIO(
        @WebParam(name = "QUERYCUSTACCOUNTDETAILS_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        QUERYCUSTACCOUNTDETAILSIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.REOPENCHECKBOOKFSFSRES
     */
    @WebMethod(operationName = "ReopenCheckBookFS")
    @WebResult(name = "REOPENCHECKBOOK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public REOPENCHECKBOOKFSFSRES reopenCheckBookFS(
        @WebParam(name = "REOPENCHECKBOOK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        REOPENCHECKBOOKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.REOPENCHECKBOOKIOPKRES
     */
    @WebMethod(operationName = "ReopenCheckBookIO")
    @WebResult(name = "REOPENCHECKBOOK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public REOPENCHECKBOOKIOPKRES reopenCheckBookIO(
        @WebParam(name = "REOPENCHECKBOOK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        REOPENCHECKBOOKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.REOPENCUSTACCFSFSRES
     */
    @WebMethod(operationName = "ReopenCustAccFS")
    @WebResult(name = "REOPENCUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public REOPENCUSTACCFSFSRES reopenCustAccFS(
        @WebParam(name = "REOPENCUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        REOPENCUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.REOPENCUSTACCIOPKRES
     */
    @WebMethod(operationName = "ReopenCustAccIO")
    @WebResult(name = "REOPENCUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public REOPENCUSTACCIOPKRES reopenCustAccIO(
        @WebParam(name = "REOPENCUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        REOPENCUSTACCIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.REOPENTDCUSTACCFSFSRES
     */
    @WebMethod(operationName = "ReopenTDCustAccFS")
    @WebResult(name = "REOPENTDCUSTACC_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public REOPENTDCUSTACCFSFSRES reopenTDCustAccFS(
        @WebParam(name = "REOPENTDCUSTACC_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        REOPENTDCUSTACCFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubsaccservice.REOPENTDCUSTACCIOPKRES
     */
    @WebMethod(operationName = "ReopenTDCustAccIO")
    @WebResult(name = "REOPENTDCUSTACC_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "ResponseMsg")
    public REOPENTDCUSTACCIOPKRES reopenTDCustAccIO(
        @WebParam(name = "REOPENTDCUSTACC_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSAccService", partName = "RequestMsg")
        REOPENTDCUSTACCIOPKREQ requestMsg);

}
