package com.afrAsia.service;

import java.util.Date;
import java.util.List;

import com.afrAsia.entities.response.DailyTxnDataResponse;

/**
 * 
 * @author nyalfernandes
 *
 */
public interface DTDPSService
{
    public List<DailyTxnDataResponse> fetchTransactions(Date date, Integer onUsInd);
}
