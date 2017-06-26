package com.afrAsia.entities.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author nyalfernandes
 *
 */
@XmlRootElement(name = "TRANSACTIONS")
public class DailyTxnDataListResponse
{
    
    private List<DailyTxnDataResponse> transactions = new ArrayList<DailyTxnDataResponse>();  
    
    private Integer errorCode;

    @XmlElement(name = "TRANSACTION" )
    public List<DailyTxnDataResponse> getTransactions()
    {
        return transactions;
    }

    public void setTransactions(List<DailyTxnDataResponse> transactions)
    {
        this.transactions = transactions;
    }
    
    @XmlElement(name = "ERROR_CODE")
    public Integer getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode)
    {
        this.errorCode = errorCode;
    }

	@Override
	public String toString() {
		return "DailyTxnDataListResponse [transactions=" + transactions + ", errorCode=" + errorCode + "]";
	}

    
}
