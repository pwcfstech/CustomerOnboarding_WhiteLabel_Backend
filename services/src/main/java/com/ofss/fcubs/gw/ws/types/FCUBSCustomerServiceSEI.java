
package com.ofss.fcubs.gw.ws.types;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSAUTHORIZEFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSAUTHORIZEFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSAUTHORIZEIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSAUTHORIZEIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSCLOSEFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSCLOSEFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSCLOSEIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSCLOSEIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSDELETEFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSDELETEFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSDELETEIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSDELETEIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSMODIFYFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSMODIFYFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSMODIFYIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSMODIFYIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSNEWFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSNEWFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSNEWIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSNEWIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSQUERYIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSQUERYIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSREOPENFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSREOPENFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSREOPENIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSREOPENIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZEAMTBLKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZEAMTBLKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZEAMTBLKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZEAMTBLKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTOMERFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTOMERFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTOMERIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTOMERIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTSEGASSOCIATIONFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTSEGASSOCIATIONFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTSEGASSOCIATIONIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTSEGASSOCIATIONIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZETDAMOUNTBLOCKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZETDAMOUNTBLOCKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZETDAMOUNTBLOCKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZETDAMOUNTBLOCKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSEAMTBLKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSEAMTBLKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSEAMTBLKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSEAMTBLKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTOMERFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTOMERFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTOMERIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTOMERIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTSEGASSOCIATIONFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTSEGASSOCIATIONFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTSEGASSOCIATIONIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTSEGASSOCIATIONIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSETDAMOUNTBLOCKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSETDAMOUNTBLOCKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSETDAMOUNTBLOCKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CLOSETDAMOUNTBLOCKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATEACCOUNTSTRUCTUREFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATEACCOUNTSTRUCTUREFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATEACCOUNTSTRUCTUREIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATEACCOUNTSTRUCTUREIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATEAMTBLKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATEAMTBLKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATEAMTBLKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATEAMTBLKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTOMERFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTOMERFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTOMERIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTOMERIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTSEGASSOCIATIONFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTSEGASSOCIATIONFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTSEGASSOCIATIONIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTSEGASSOCIATIONIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATENSFMUTUALFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATENSFMUTUALFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATENSFMUTUALIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATENSFMUTUALIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATETDAMOUNTBLOCKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATETDAMOUNTBLOCKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.CREATETDAMOUNTBLOCKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.CREATETDAMOUNTBLOCKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.DELETEAMTBLKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.DELETEAMTBLKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.DELETEAMTBLKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.DELETEAMTBLKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTOMERFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTOMERFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTOMERIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTOMERIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTSEGASSOCIATIONFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTSEGASSOCIATIONFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTSEGASSOCIATIONIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTSEGASSOCIATIONIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.DELETETDAMOUNTBLOCKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.DELETETDAMOUNTBLOCKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.DELETETDAMOUNTBLOCKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.DELETETDAMOUNTBLOCKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYACCOUNTSTRUCTUREFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYACCOUNTSTRUCTUREFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYACCOUNTSTRUCTUREIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYACCOUNTSTRUCTUREIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYAMTBLKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYAMTBLKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYAMTBLKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYAMTBLKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTOMERFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTOMERFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTOMERIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTOMERIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTSEGASSOCIATIONFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTSEGASSOCIATIONFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTSEGASSOCIATIONIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTSEGASSOCIATIONIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYNSFMUTUALFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYNSFMUTUALFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYNSFMUTUALIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYNSFMUTUALIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYTDAMOUNTBLOCKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYTDAMOUNTBLOCKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYTDAMOUNTBLOCKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.MODIFYTDAMOUNTBLOCKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.ObjectFactory;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYACCOUNTSTRUCTUREIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYACCOUNTSTRUCTUREIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYAMTBLKIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYAMTBLKIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYCUSTOMERIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYCUSTOMERIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYCUSTSEGASSOCIATIONIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYCUSTSEGASSOCIATIONIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFCBENQIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFCBENQIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFCHECKIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFCHECKIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFMUTUALIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFMUTUALIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYTDAMOUNTBLOCKIOFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.QUERYTDAMOUNTBLOCKIOFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENAMTBLKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENAMTBLKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENAMTBLKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENAMTBLKIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTOMERFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTOMERFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTOMERIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTOMERIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTSEGASSOCIATIONFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTSEGASSOCIATIONFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTSEGASSOCIATIONIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTSEGASSOCIATIONIOPKRES;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENTDAMOUNTBLOCKFSFSREQ;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENTDAMOUNTBLOCKFSFSRES;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENTDAMOUNTBLOCKIOPKREQ;
import com.ofss.fcubs.service.fcubscustomerservice.REOPENTDAMOUNTBLOCKIOPKRES;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FCUBSCustomerServiceSEI", targetNamespace = "http://types.ws.gw.fcubs.ofss.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FCUBSCustomerServiceSEI {


    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSAUTHORIZEFSFSRES
     */
    @WebMethod(operationName = "AmountBlocksAuthorizeFS")
    @WebResult(name = "AMOUNTBLOCKSAUTHORIZE_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSAUTHORIZEFSFSRES amountBlocksAuthorizeFS(
        @WebParam(name = "AMOUNTBLOCKSAUTHORIZE_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSAUTHORIZEFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSAUTHORIZEIOPKRES
     */
    @WebMethod(operationName = "AmountBlocksAuthorizeIO")
    @WebResult(name = "AMOUNTBLOCKSAUTHORIZE_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSAUTHORIZEIOPKRES amountBlocksAuthorizeIO(
        @WebParam(name = "AMOUNTBLOCKSAUTHORIZE_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSAUTHORIZEIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSCLOSEFSFSRES
     */
    @WebMethod(operationName = "AmountBlocksCloseFS")
    @WebResult(name = "AMOUNTBLOCKSCLOSE_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSCLOSEFSFSRES amountBlocksCloseFS(
        @WebParam(name = "AMOUNTBLOCKSCLOSE_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSCLOSEFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSCLOSEIOPKRES
     */
    @WebMethod(operationName = "AmountBlocksCloseIO")
    @WebResult(name = "AMOUNTBLOCKSCLOSE_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSCLOSEIOPKRES amountBlocksCloseIO(
        @WebParam(name = "AMOUNTBLOCKSCLOSE_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSCLOSEIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSDELETEFSFSRES
     */
    @WebMethod(operationName = "AmountBlocksDeleteFS")
    @WebResult(name = "AMOUNTBLOCKSDELETE_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSDELETEFSFSRES amountBlocksDeleteFS(
        @WebParam(name = "AMOUNTBLOCKSDELETE_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSDELETEFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSDELETEIOPKRES
     */
    @WebMethod(operationName = "AmountBlocksDeleteIO")
    @WebResult(name = "AMOUNTBLOCKSDELETE_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSDELETEIOPKRES amountBlocksDeleteIO(
        @WebParam(name = "AMOUNTBLOCKSDELETE_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSDELETEIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSMODIFYFSFSRES
     */
    @WebMethod(operationName = "AmountBlocksModifyFS")
    @WebResult(name = "AMOUNTBLOCKSMODIFY_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSMODIFYFSFSRES amountBlocksModifyFS(
        @WebParam(name = "AMOUNTBLOCKSMODIFY_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSMODIFYFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSMODIFYIOPKRES
     */
    @WebMethod(operationName = "AmountBlocksModifyIO")
    @WebResult(name = "AMOUNTBLOCKSMODIFY_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSMODIFYIOPKRES amountBlocksModifyIO(
        @WebParam(name = "AMOUNTBLOCKSMODIFY_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSMODIFYIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSNEWFSFSRES
     */
    @WebMethod(operationName = "AmountBlocksNewFS")
    @WebResult(name = "AMOUNTBLOCKSNEW_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSNEWFSFSRES amountBlocksNewFS(
        @WebParam(name = "AMOUNTBLOCKSNEW_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSNEWFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSNEWIOPKRES
     */
    @WebMethod(operationName = "AmountBlocksNewIO")
    @WebResult(name = "AMOUNTBLOCKSNEW_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSNEWIOPKRES amountBlocksNewIO(
        @WebParam(name = "AMOUNTBLOCKSNEW_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSNEWIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSQUERYIOFSRES
     */
    @WebMethod(operationName = "AmountBlocksQueryIO")
    @WebResult(name = "AMOUNTBLOCKSQUERY_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSQUERYIOFSRES amountBlocksQueryIO(
        @WebParam(name = "AMOUNTBLOCKSQUERY_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSQUERYIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSREOPENFSFSRES
     */
    @WebMethod(operationName = "AmountBlocksReopenFS")
    @WebResult(name = "AMOUNTBLOCKSREOPEN_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSREOPENFSFSRES amountBlocksReopenFS(
        @WebParam(name = "AMOUNTBLOCKSREOPEN_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSREOPENFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AMOUNTBLOCKSREOPENIOPKRES
     */
    @WebMethod(operationName = "AmountBlocksReopenIO")
    @WebResult(name = "AMOUNTBLOCKSREOPEN_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AMOUNTBLOCKSREOPENIOPKRES amountBlocksReopenIO(
        @WebParam(name = "AMOUNTBLOCKSREOPEN_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AMOUNTBLOCKSREOPENIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZEAMTBLKFSFSRES
     */
    @WebMethod(operationName = "AuthorizeAmtBlkFS")
    @WebResult(name = "AUTHORIZEAMTBLK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AUTHORIZEAMTBLKFSFSRES authorizeAmtBlkFS(
        @WebParam(name = "AUTHORIZEAMTBLK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AUTHORIZEAMTBLKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZEAMTBLKIOPKRES
     */
    @WebMethod(operationName = "AuthorizeAmtBlkIO")
    @WebResult(name = "AUTHORIZEAMTBLK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AUTHORIZEAMTBLKIOPKRES authorizeAmtBlkIO(
        @WebParam(name = "AUTHORIZEAMTBLK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AUTHORIZEAMTBLKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTSEGASSOCIATIONFSFSRES
     */
    @WebMethod(operationName = "AuthorizeCustSegAssociationFS")
    @WebResult(name = "AUTHORIZECUSTSEGASSOCIATION_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AUTHORIZECUSTSEGASSOCIATIONFSFSRES authorizeCustSegAssociationFS(
        @WebParam(name = "AUTHORIZECUSTSEGASSOCIATION_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AUTHORIZECUSTSEGASSOCIATIONFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTSEGASSOCIATIONIOPKRES
     */
    @WebMethod(operationName = "AuthorizeCustSegAssociationIO")
    @WebResult(name = "AUTHORIZECUSTSEGASSOCIATION_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AUTHORIZECUSTSEGASSOCIATIONIOPKRES authorizeCustSegAssociationIO(
        @WebParam(name = "AUTHORIZECUSTSEGASSOCIATION_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AUTHORIZECUSTSEGASSOCIATIONIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTOMERFSFSRES
     */
    @WebMethod(operationName = "AuthorizeCustomerFS")
    @WebResult(name = "AUTHORIZECUSTOMER_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AUTHORIZECUSTOMERFSFSRES authorizeCustomerFS(
        @WebParam(name = "AUTHORIZECUSTOMER_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AUTHORIZECUSTOMERFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZECUSTOMERIOPKRES
     */
    @WebMethod(operationName = "AuthorizeCustomerIO")
    @WebResult(name = "AUTHORIZECUSTOMER_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AUTHORIZECUSTOMERIOPKRES authorizeCustomerIO(
        @WebParam(name = "AUTHORIZECUSTOMER_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AUTHORIZECUSTOMERIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZETDAMOUNTBLOCKFSFSRES
     */
    @WebMethod(operationName = "AuthorizeTDAmountBlockFS")
    @WebResult(name = "AUTHORIZETDAMOUNTBLOCK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AUTHORIZETDAMOUNTBLOCKFSFSRES authorizeTDAmountBlockFS(
        @WebParam(name = "AUTHORIZETDAMOUNTBLOCK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AUTHORIZETDAMOUNTBLOCKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.AUTHORIZETDAMOUNTBLOCKIOPKRES
     */
    @WebMethod(operationName = "AuthorizeTDAmountBlockIO")
    @WebResult(name = "AUTHORIZETDAMOUNTBLOCK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public AUTHORIZETDAMOUNTBLOCKIOPKRES authorizeTDAmountBlockIO(
        @WebParam(name = "AUTHORIZETDAMOUNTBLOCK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        AUTHORIZETDAMOUNTBLOCKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CLOSEAMTBLKFSFSRES
     */
    @WebMethod(operationName = "CloseAmtBlkFS")
    @WebResult(name = "CLOSEAMTBLK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CLOSEAMTBLKFSFSRES closeAmtBlkFS(
        @WebParam(name = "CLOSEAMTBLK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CLOSEAMTBLKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CLOSEAMTBLKIOPKRES
     */
    @WebMethod(operationName = "CloseAmtBlkIO")
    @WebResult(name = "CLOSEAMTBLK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CLOSEAMTBLKIOPKRES closeAmtBlkIO(
        @WebParam(name = "CLOSEAMTBLK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CLOSEAMTBLKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTSEGASSOCIATIONFSFSRES
     */
    @WebMethod(operationName = "CloseCustSegAssociationFS")
    @WebResult(name = "CLOSECUSTSEGASSOCIATION_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CLOSECUSTSEGASSOCIATIONFSFSRES closeCustSegAssociationFS(
        @WebParam(name = "CLOSECUSTSEGASSOCIATION_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CLOSECUSTSEGASSOCIATIONFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTSEGASSOCIATIONIOPKRES
     */
    @WebMethod(operationName = "CloseCustSegAssociationIO")
    @WebResult(name = "CLOSECUSTSEGASSOCIATION_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CLOSECUSTSEGASSOCIATIONIOPKRES closeCustSegAssociationIO(
        @WebParam(name = "CLOSECUSTSEGASSOCIATION_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CLOSECUSTSEGASSOCIATIONIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTOMERFSFSRES
     */
    @WebMethod(operationName = "CloseCustomerFS")
    @WebResult(name = "CLOSECUSTOMER_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CLOSECUSTOMERFSFSRES closeCustomerFS(
        @WebParam(name = "CLOSECUSTOMER_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CLOSECUSTOMERFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CLOSECUSTOMERIOPKRES
     */
    @WebMethod(operationName = "CloseCustomerIO")
    @WebResult(name = "CLOSECUSTOMER_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CLOSECUSTOMERIOPKRES closeCustomerIO(
        @WebParam(name = "CLOSECUSTOMER_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CLOSECUSTOMERIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CLOSETDAMOUNTBLOCKFSFSRES
     */
    @WebMethod(operationName = "CloseTDAmountBlockFS")
    @WebResult(name = "CLOSETDAMOUNTBLOCK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CLOSETDAMOUNTBLOCKFSFSRES closeTDAmountBlockFS(
        @WebParam(name = "CLOSETDAMOUNTBLOCK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CLOSETDAMOUNTBLOCKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CLOSETDAMOUNTBLOCKIOPKRES
     */
    @WebMethod(operationName = "CloseTDAmountBlockIO")
    @WebResult(name = "CLOSETDAMOUNTBLOCK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CLOSETDAMOUNTBLOCKIOPKRES closeTDAmountBlockIO(
        @WebParam(name = "CLOSETDAMOUNTBLOCK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CLOSETDAMOUNTBLOCKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATEACCOUNTSTRUCTUREFSFSRES
     */
    @WebMethod(operationName = "CreateAccountStructureFS")
    @WebResult(name = "CREATEACCOUNTSTRUCTURE_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATEACCOUNTSTRUCTUREFSFSRES createAccountStructureFS(
        @WebParam(name = "CREATEACCOUNTSTRUCTURE_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATEACCOUNTSTRUCTUREFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATEACCOUNTSTRUCTUREIOPKRES
     */
    @WebMethod(operationName = "CreateAccountStructureIO")
    @WebResult(name = "CREATEACCOUNTSTRUCTURE_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATEACCOUNTSTRUCTUREIOPKRES createAccountStructureIO(
        @WebParam(name = "CREATEACCOUNTSTRUCTURE_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATEACCOUNTSTRUCTUREIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATEAMTBLKFSFSRES
     */
    @WebMethod(operationName = "CreateAmtBlkFS")
    @WebResult(name = "CREATEAMTBLK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATEAMTBLKFSFSRES createAmtBlkFS(
        @WebParam(name = "CREATEAMTBLK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATEAMTBLKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATEAMTBLKIOPKRES
     */
    @WebMethod(operationName = "CreateAmtBlkIO")
    @WebResult(name = "CREATEAMTBLK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATEAMTBLKIOPKRES createAmtBlkIO(
        @WebParam(name = "CREATEAMTBLK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATEAMTBLKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTSEGASSOCIATIONFSFSRES
     */
    @WebMethod(operationName = "CreateCustSegAssociationFS")
    @WebResult(name = "CREATECUSTSEGASSOCIATION_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATECUSTSEGASSOCIATIONFSFSRES createCustSegAssociationFS(
        @WebParam(name = "CREATECUSTSEGASSOCIATION_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATECUSTSEGASSOCIATIONFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTSEGASSOCIATIONIOPKRES
     */
    @WebMethod(operationName = "CreateCustSegAssociationIO")
    @WebResult(name = "CREATECUSTSEGASSOCIATION_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATECUSTSEGASSOCIATIONIOPKRES createCustSegAssociationIO(
        @WebParam(name = "CREATECUSTSEGASSOCIATION_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATECUSTSEGASSOCIATIONIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTOMERFSFSRES
     */
    @WebMethod(operationName = "CreateCustomerFS")
    @WebResult(name = "CREATECUSTOMER_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATECUSTOMERFSFSRES createCustomerFS(
        @WebParam(name = "CREATECUSTOMER_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATECUSTOMERFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATECUSTOMERIOPKRES
     */
    @WebMethod(operationName = "CreateCustomerIO")
    @WebResult(name = "CREATECUSTOMER_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATECUSTOMERIOPKRES createCustomerIO(
        @WebParam(name = "CREATECUSTOMER_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATECUSTOMERIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATENSFMUTUALFSFSRES
     */
    @WebMethod(operationName = "CreateNSFMutualFS")
    @WebResult(name = "CREATENSFMUTUAL_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATENSFMUTUALFSFSRES createNSFMutualFS(
        @WebParam(name = "CREATENSFMUTUAL_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATENSFMUTUALFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATENSFMUTUALIOPKRES
     */
    @WebMethod(operationName = "CreateNSFMutualIO")
    @WebResult(name = "CREATENSFMUTUAL_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATENSFMUTUALIOPKRES createNSFMutualIO(
        @WebParam(name = "CREATENSFMUTUAL_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATENSFMUTUALIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATETDAMOUNTBLOCKFSFSRES
     */
    @WebMethod(operationName = "CreateTDAmountBlockFS")
    @WebResult(name = "CREATETDAMOUNTBLOCK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATETDAMOUNTBLOCKFSFSRES createTDAmountBlockFS(
        @WebParam(name = "CREATETDAMOUNTBLOCK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATETDAMOUNTBLOCKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.CREATETDAMOUNTBLOCKIOPKRES
     */
    @WebMethod(operationName = "CreateTDAmountBlockIO")
    @WebResult(name = "CREATETDAMOUNTBLOCK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public CREATETDAMOUNTBLOCKIOPKRES createTDAmountBlockIO(
        @WebParam(name = "CREATETDAMOUNTBLOCK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        CREATETDAMOUNTBLOCKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.DELETEAMTBLKFSFSRES
     */
    @WebMethod(operationName = "DeleteAmtBlkFS")
    @WebResult(name = "DELETEAMTBLK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public DELETEAMTBLKFSFSRES deleteAmtBlkFS(
        @WebParam(name = "DELETEAMTBLK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        DELETEAMTBLKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.DELETEAMTBLKIOPKRES
     */
    @WebMethod(operationName = "DeleteAmtBlkIO")
    @WebResult(name = "DELETEAMTBLK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public DELETEAMTBLKIOPKRES deleteAmtBlkIO(
        @WebParam(name = "DELETEAMTBLK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        DELETEAMTBLKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTSEGASSOCIATIONFSFSRES
     */
    @WebMethod(operationName = "DeleteCustSegAssociationFS")
    @WebResult(name = "DELETECUSTSEGASSOCIATION_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public DELETECUSTSEGASSOCIATIONFSFSRES deleteCustSegAssociationFS(
        @WebParam(name = "DELETECUSTSEGASSOCIATION_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        DELETECUSTSEGASSOCIATIONFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTSEGASSOCIATIONIOPKRES
     */
    @WebMethod(operationName = "DeleteCustSegAssociationIO")
    @WebResult(name = "DELETECUSTSEGASSOCIATION_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public DELETECUSTSEGASSOCIATIONIOPKRES deleteCustSegAssociationIO(
        @WebParam(name = "DELETECUSTSEGASSOCIATION_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        DELETECUSTSEGASSOCIATIONIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTOMERFSFSRES
     */
    @WebMethod(operationName = "DeleteCustomerFS")
    @WebResult(name = "DELETECUSTOMER_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public DELETECUSTOMERFSFSRES deleteCustomerFS(
        @WebParam(name = "DELETECUSTOMER_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        DELETECUSTOMERFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.DELETECUSTOMERIOPKRES
     */
    @WebMethod(operationName = "DeleteCustomerIO")
    @WebResult(name = "DELETECUSTOMER_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public DELETECUSTOMERIOPKRES deleteCustomerIO(
        @WebParam(name = "DELETECUSTOMER_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        DELETECUSTOMERIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.DELETETDAMOUNTBLOCKFSFSRES
     */
    @WebMethod(operationName = "DeleteTDAmountBlockFS")
    @WebResult(name = "DELETETDAMOUNTBLOCK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public DELETETDAMOUNTBLOCKFSFSRES deleteTDAmountBlockFS(
        @WebParam(name = "DELETETDAMOUNTBLOCK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        DELETETDAMOUNTBLOCKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.DELETETDAMOUNTBLOCKIOPKRES
     */
    @WebMethod(operationName = "DeleteTDAmountBlockIO")
    @WebResult(name = "DELETETDAMOUNTBLOCK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public DELETETDAMOUNTBLOCKIOPKRES deleteTDAmountBlockIO(
        @WebParam(name = "DELETETDAMOUNTBLOCK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        DELETETDAMOUNTBLOCKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYACCOUNTSTRUCTUREFSFSRES
     */
    @WebMethod(operationName = "ModifyAccountStructureFS")
    @WebResult(name = "MODIFYACCOUNTSTRUCTURE_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYACCOUNTSTRUCTUREFSFSRES modifyAccountStructureFS(
        @WebParam(name = "MODIFYACCOUNTSTRUCTURE_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYACCOUNTSTRUCTUREFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYACCOUNTSTRUCTUREIOPKRES
     */
    @WebMethod(operationName = "ModifyAccountStructureIO")
    @WebResult(name = "MODIFYACCOUNTSTRUCTURE_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYACCOUNTSTRUCTUREIOPKRES modifyAccountStructureIO(
        @WebParam(name = "MODIFYACCOUNTSTRUCTURE_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYACCOUNTSTRUCTUREIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYAMTBLKFSFSRES
     */
    @WebMethod(operationName = "ModifyAmtBlkFS")
    @WebResult(name = "MODIFYAMTBLK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYAMTBLKFSFSRES modifyAmtBlkFS(
        @WebParam(name = "MODIFYAMTBLK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYAMTBLKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYAMTBLKIOPKRES
     */
    @WebMethod(operationName = "ModifyAmtBlkIO")
    @WebResult(name = "MODIFYAMTBLK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYAMTBLKIOPKRES modifyAmtBlkIO(
        @WebParam(name = "MODIFYAMTBLK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYAMTBLKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTSEGASSOCIATIONFSFSRES
     */
    @WebMethod(operationName = "ModifyCustSegAssociationFS")
    @WebResult(name = "MODIFYCUSTSEGASSOCIATION_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYCUSTSEGASSOCIATIONFSFSRES modifyCustSegAssociationFS(
        @WebParam(name = "MODIFYCUSTSEGASSOCIATION_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYCUSTSEGASSOCIATIONFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTSEGASSOCIATIONIOPKRES
     */
    @WebMethod(operationName = "ModifyCustSegAssociationIO")
    @WebResult(name = "MODIFYCUSTSEGASSOCIATION_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYCUSTSEGASSOCIATIONIOPKRES modifyCustSegAssociationIO(
        @WebParam(name = "MODIFYCUSTSEGASSOCIATION_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYCUSTSEGASSOCIATIONIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTOMERFSFSRES
     */
    @WebMethod(operationName = "ModifyCustomerFS")
    @WebResult(name = "MODIFYCUSTOMER_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYCUSTOMERFSFSRES modifyCustomerFS(
        @WebParam(name = "MODIFYCUSTOMER_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYCUSTOMERFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYCUSTOMERIOPKRES
     */
    @WebMethod(operationName = "ModifyCustomerIO")
    @WebResult(name = "MODIFYCUSTOMER_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYCUSTOMERIOPKRES modifyCustomerIO(
        @WebParam(name = "MODIFYCUSTOMER_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYCUSTOMERIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYNSFMUTUALFSFSRES
     */
    @WebMethod(operationName = "ModifyNSFMutualFS")
    @WebResult(name = "MODIFYNSFMUTUAL_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYNSFMUTUALFSFSRES modifyNSFMutualFS(
        @WebParam(name = "MODIFYNSFMUTUAL_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYNSFMUTUALFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYNSFMUTUALIOPKRES
     */
    @WebMethod(operationName = "ModifyNSFMutualIO")
    @WebResult(name = "MODIFYNSFMUTUAL_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYNSFMUTUALIOPKRES modifyNSFMutualIO(
        @WebParam(name = "MODIFYNSFMUTUAL_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYNSFMUTUALIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYTDAMOUNTBLOCKFSFSRES
     */
    @WebMethod(operationName = "ModifyTDAmountBlockFS")
    @WebResult(name = "MODIFYTDAMOUNTBLOCK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYTDAMOUNTBLOCKFSFSRES modifyTDAmountBlockFS(
        @WebParam(name = "MODIFYTDAMOUNTBLOCK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYTDAMOUNTBLOCKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.MODIFYTDAMOUNTBLOCKIOPKRES
     */
    @WebMethod(operationName = "ModifyTDAmountBlockIO")
    @WebResult(name = "MODIFYTDAMOUNTBLOCK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public MODIFYTDAMOUNTBLOCKIOPKRES modifyTDAmountBlockIO(
        @WebParam(name = "MODIFYTDAMOUNTBLOCK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        MODIFYTDAMOUNTBLOCKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.QUERYACCOUNTSTRUCTUREIOFSRES
     */
    @WebMethod(operationName = "QueryAccountStructureIO")
    @WebResult(name = "QUERYACCOUNTSTRUCTURE_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public QUERYACCOUNTSTRUCTUREIOFSRES queryAccountStructureIO(
        @WebParam(name = "QUERYACCOUNTSTRUCTURE_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        QUERYACCOUNTSTRUCTUREIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.QUERYAMTBLKIOFSRES
     */
    @WebMethod(operationName = "QueryAmtBlkIO")
    @WebResult(name = "QUERYAMTBLK_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public QUERYAMTBLKIOFSRES queryAmtBlkIO(
        @WebParam(name = "QUERYAMTBLK_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        QUERYAMTBLKIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.QUERYCUSTSEGASSOCIATIONIOFSRES
     */
    @WebMethod(operationName = "QueryCustSegAssociationIO")
    @WebResult(name = "QUERYCUSTSEGASSOCIATION_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public QUERYCUSTSEGASSOCIATIONIOFSRES queryCustSegAssociationIO(
        @WebParam(name = "QUERYCUSTSEGASSOCIATION_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        QUERYCUSTSEGASSOCIATIONIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.QUERYCUSTOMERIOFSRES
     */
    @WebMethod(operationName = "QueryCustomerIO")
    @WebResult(name = "QUERYCUSTOMER_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public QUERYCUSTOMERIOFSRES queryCustomerIO(
        @WebParam(name = "QUERYCUSTOMER_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        QUERYCUSTOMERIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFCBENQIOFSRES
     */
    @WebMethod(operationName = "QueryNSFCBenqIO")
    @WebResult(name = "QUERYNSFCBENQ_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public QUERYNSFCBENQIOFSRES queryNSFCBenqIO(
        @WebParam(name = "QUERYNSFCBENQ_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        QUERYNSFCBENQIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFCHECKIOFSRES
     */
    @WebMethod(operationName = "QueryNSFCheckIO")
    @WebResult(name = "QUERYNSFCHECK_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public QUERYNSFCHECKIOFSRES queryNSFCheckIO(
        @WebParam(name = "QUERYNSFCHECK_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        QUERYNSFCHECKIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.QUERYNSFMUTUALIOFSRES
     */
    @WebMethod(operationName = "QueryNSFMutualIO")
    @WebResult(name = "QUERYNSFMUTUAL_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public QUERYNSFMUTUALIOFSRES queryNSFMutualIO(
        @WebParam(name = "QUERYNSFMUTUAL_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        QUERYNSFMUTUALIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.QUERYTDAMOUNTBLOCKIOFSRES
     */
    @WebMethod(operationName = "QueryTDAmountBlockIO")
    @WebResult(name = "QUERYTDAMOUNTBLOCK_IOFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public QUERYTDAMOUNTBLOCKIOFSRES queryTDAmountBlockIO(
        @WebParam(name = "QUERYTDAMOUNTBLOCK_IOFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        QUERYTDAMOUNTBLOCKIOFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.REOPENAMTBLKFSFSRES
     */
    @WebMethod(operationName = "ReopenAmtBlkFS")
    @WebResult(name = "REOPENAMTBLK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public REOPENAMTBLKFSFSRES reopenAmtBlkFS(
        @WebParam(name = "REOPENAMTBLK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        REOPENAMTBLKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.REOPENAMTBLKIOPKRES
     */
    @WebMethod(operationName = "ReopenAmtBlkIO")
    @WebResult(name = "REOPENAMTBLK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public REOPENAMTBLKIOPKRES reopenAmtBlkIO(
        @WebParam(name = "REOPENAMTBLK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        REOPENAMTBLKIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTSEGASSOCIATIONFSFSRES
     */
    @WebMethod(operationName = "ReopenCustSegAssociationFS")
    @WebResult(name = "REOPENCUSTSEGASSOCIATION_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public REOPENCUSTSEGASSOCIATIONFSFSRES reopenCustSegAssociationFS(
        @WebParam(name = "REOPENCUSTSEGASSOCIATION_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        REOPENCUSTSEGASSOCIATIONFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTSEGASSOCIATIONIOPKRES
     */
    @WebMethod(operationName = "ReopenCustSegAssociationIO")
    @WebResult(name = "REOPENCUSTSEGASSOCIATION_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public REOPENCUSTSEGASSOCIATIONIOPKRES reopenCustSegAssociationIO(
        @WebParam(name = "REOPENCUSTSEGASSOCIATION_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        REOPENCUSTSEGASSOCIATIONIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTOMERFSFSRES
     */
    @WebMethod(operationName = "ReopenCustomerFS")
    @WebResult(name = "REOPENCUSTOMER_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public REOPENCUSTOMERFSFSRES reopenCustomerFS(
        @WebParam(name = "REOPENCUSTOMER_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        REOPENCUSTOMERFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.REOPENCUSTOMERIOPKRES
     */
    @WebMethod(operationName = "ReopenCustomerIO")
    @WebResult(name = "REOPENCUSTOMER_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public REOPENCUSTOMERIOPKRES reopenCustomerIO(
        @WebParam(name = "REOPENCUSTOMER_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        REOPENCUSTOMERIOPKREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.REOPENTDAMOUNTBLOCKFSFSRES
     */
    @WebMethod(operationName = "ReopenTDAmountBlockFS")
    @WebResult(name = "REOPENTDAMOUNTBLOCK_FSFS_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public REOPENTDAMOUNTBLOCKFSFSRES reopenTDAmountBlockFS(
        @WebParam(name = "REOPENTDAMOUNTBLOCK_FSFS_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        REOPENTDAMOUNTBLOCKFSFSREQ requestMsg);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns com.ofss.fcubs.service.fcubscustomerservice.REOPENTDAMOUNTBLOCKIOPKRES
     */
    @WebMethod(operationName = "ReopenTDAmountBlockIO")
    @WebResult(name = "REOPENTDAMOUNTBLOCK_IOPK_RES", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "ResponseMsg")
    public REOPENTDAMOUNTBLOCKIOPKRES reopenTDAmountBlockIO(
        @WebParam(name = "REOPENTDAMOUNTBLOCK_IOPK_REQ", targetNamespace = "http://fcubs.ofss.com/service/FCUBSCustomerService", partName = "RequestMsg")
        REOPENTDAMOUNTBLOCKIOPKREQ requestMsg);

}
