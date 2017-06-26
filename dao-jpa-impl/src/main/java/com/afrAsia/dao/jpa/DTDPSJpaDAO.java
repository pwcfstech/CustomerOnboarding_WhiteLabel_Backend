package com.afrAsia.dao.jpa;

import java.util.Date;
import java.util.List;

import com.afrAsia.dao.DTDPSDAO;
import com.afrAsia.entities.DigitalTxnDaily;

/**
 * 
 * @author nyalfernandes
 *
 */
public interface DTDPSJpaDAO extends DTDPSDAO
{
    public List<DigitalTxnDaily> getAllTransactionsOfDate(Date date, Integer onUsInd);
}
