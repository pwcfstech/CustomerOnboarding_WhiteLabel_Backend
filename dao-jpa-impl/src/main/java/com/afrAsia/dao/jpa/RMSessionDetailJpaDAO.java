package com.afrAsia.dao.jpa;

import com.afrAsia.dao.RMSessionDetailDao;
import com.afrAsia.entities.jpa.MobRmSessionDetail;

public interface RMSessionDetailJpaDAO extends RMSessionDetailDao {

	public MobRmSessionDetail setLoginTime(MobRmSessionDetail mobRmSessionDetail);
	public void setLogoutTime(String rmId);
}

