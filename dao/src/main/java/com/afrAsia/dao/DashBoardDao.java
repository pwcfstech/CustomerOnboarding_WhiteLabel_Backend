package com.afrAsia.dao;

import com.afrAsia.entities.response.AppLoggedSummary;
import com.afrAsia.entities.response.Apps;
import com.afrAsia.entities.response.AverageProductivity;

public interface DashBoardDao {

	public AverageProductivity getavgProductivity(); 
	
	public AppLoggedSummary getAppLoggedSummary(); 

	public Apps getApps(); 

}
