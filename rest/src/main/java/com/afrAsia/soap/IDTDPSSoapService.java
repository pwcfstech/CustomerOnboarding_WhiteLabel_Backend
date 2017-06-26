package com.afrAsia.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name="DigitalTxs", targetNamespace="https://digitalonline.unitedbank.co.in")
@SOAPBinding(style=Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface IDTDPSSoapService 
{
	
//	@WebMethod(operationName="DigitalTransaction")
//	public DailyTxnDataListResponse getDigitalTransaction(@WebParam(name = "USERNAME") String username, @WebParam(name = "PASSWORD") String password, @WebParam(name = "TRANSACTION_DATE") String transactionDate);
//	
//	@WebMethod(operationName="getDigitalTransaction")
//	public DailyTxnDataListResponse getDigitalTransaction(String username, String password, String transactionDate, String onUsIndString);
	
	@WebMethod(operationName="DigitalTransaction")
	public String getDigitalTransaction(@WebParam(name = "USERNAME") String username, @WebParam(name = "PASSWORD") String password, @WebParam(name = "TRANSACTION_DATE") String transactionDate);
	
	@WebMethod(operationName="getDigitalTransaction")
	public String getDigitalTransaction(String username, String password, String transactionDate, String onUsIndString);
	
}
