package com.afrAsia.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Logger;

import com.afrAsia.dao.jpa.DTDPSJpaDAO;
import com.afrAsia.entities.jpa.DigitalTxnDaily;
import com.afrAsia.entities.response.DailyTxnDataResponse;
import com.afrAsia.service.DTDPSService;

/**
 * 
 * @author nyalfernandes
 *
 */
public class DTDPSServiceImpl implements DTDPSService
{
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
    private DTDPSJpaDAO dtdpsDAO;

    public DTDPSJpaDAO getDtdpsDAO()
    {
        return dtdpsDAO;
    }

    public void setDtdpsDAO(DTDPSJpaDAO dtdpsDAO)
    {
        this.dtdpsDAO = dtdpsDAO;
    }

    public List<DailyTxnDataResponse> fetchTransactions(Date date, Integer onUsInd)
    {
        final List<DailyTxnDataResponse> txnList = new ArrayList<DailyTxnDataResponse>();

        if (date == null)
        {
            return txnList;
        }

        List<DigitalTxnDaily> dbTxnDataList = dtdpsDAO.getAllTransactionsOfDate(date, onUsInd);

        if (dbTxnDataList != null)
        {
            dbTxnDataList.parallelStream().forEach(new Consumer<DigitalTxnDaily>()
            {
                public void accept(DigitalTxnDaily t)
                {
                	if (t != null)
                	{
                		txnList.add(DailyTxnDataResponse.parse(t));
                	}
                }
            });
        }
        debugLog.debug("txnList :: "+txnList);
        return txnList;
    }

}
