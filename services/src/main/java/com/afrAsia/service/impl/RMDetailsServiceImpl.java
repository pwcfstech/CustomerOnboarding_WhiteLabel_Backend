package com.afrAsia.service.impl;

import java.util.Date;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.afrAsia.dao.RMDetailsDao;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.service.RMDetailsService;

public class RMDetailsServiceImpl implements RMDetailsService
{
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private RMDetailsDao rmDetailsDao;
	
	public RMDetailsDao getRmDetailsDao() {
		return rmDetailsDao;
	}
	
	public void setRmDetailsDao(RMDetailsDao rmDetailsDao) {
		this.rmDetailsDao = rmDetailsDao;
	}

	@Transactional
	public RMDetails saveRMDetails(String rmName, String rmId) 
	{
		RMDetails rmDetails =  new RMDetails();
		rmDetails.setId(rmId);
		rmDetails.setRmName(rmName);
		rmDetails.setCreatedBy(rmId);
		rmDetails.setCreatedDate(new Date());
		rmDetailsDao.saveRmDetails(rmDetails);
		debugLog.debug("rmDetails :: "+rmDetails);
		return rmDetails;
	}
}
