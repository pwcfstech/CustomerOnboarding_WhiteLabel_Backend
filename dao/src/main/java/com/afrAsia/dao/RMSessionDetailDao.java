package com.afrAsia.dao;


import com.afrAsia.entities.jpa.MobRmSessionDetail;

public interface RMSessionDetailDao 
{
	public MobRmSessionDetail setLoginTime(MobRmSessionDetail mobRmSessionDetail);
	public void setLogoutTime(String rmId);
}
