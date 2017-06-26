package com.afrAsia.dao;

import java.util.Date;
import java.util.List;

import com.afrAsia.entities.jpa.DigitalTxnDaily;

/**
 * 
 * @author nyalfernandes
 *
 */
public interface DTDPSDAO
{
    public List<DigitalTxnDaily> getAllTransactionsOfDate(Date date, Integer onUsInd);
}
