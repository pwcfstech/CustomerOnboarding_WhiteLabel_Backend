package com.afrAsia.service.impl;

import java.util.Date;

import javax.transaction.Transactional;

import com.afrAsia.dao.RMDetailsDao;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.service.RMDetailsService;

public class RMDetailsServiceImpl implements RMDetailsService
{
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
		rmDetails.setRmId(rmId);
		rmDetails.setRmName(rmName);
		rmDetails.setCreatedBy(rmId);
		rmDetails.setCreatedDate(new Date());
		rmDetailsDao.saveRmDetails(rmDetails);
		
		return rmDetails;
	}

}
