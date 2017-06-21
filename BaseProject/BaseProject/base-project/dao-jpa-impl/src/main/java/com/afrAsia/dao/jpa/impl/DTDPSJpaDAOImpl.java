package com.afrAsia.dao.jpa.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.afrAsia.dao.jpa.DTDPSJpaDAO;
import com.afrAsia.entities.DigitalTxnDaily;

/**
 * 
 * @author nyalfernandes
 *
 */
public class DTDPSJpaDAOImpl extends BaseJpaDAOImpl<String, DigitalTxnDaily> implements DTDPSJpaDAO
{

    public List<DigitalTxnDaily> getAllTransactionsOfDate(Date date, Integer onUsInd)
    {
        if (date == null)
        {
            return new ArrayList<DigitalTxnDaily>();
        }
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("txnDate", date);
        parameters.put("onUsInd", onUsInd);
        
        return findAllByNamedQuery(DigitalTxnDaily.QUERY_FETCH_BY_TXN_DATE, parameters);
    }   
//    private List<DigitalTxnDaily>

}
