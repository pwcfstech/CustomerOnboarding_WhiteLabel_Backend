package com.afrAsia.dao.jpa.impl;

import com.afrAsia.dao.jpa.MobRmAppRefIdJpaDao;
import com.afrAsia.entities.transactions.MobRmAppRefId;

public class MobRmAppRefIdJpaDaoImpl extends BaseJpaDAOImpl<String, MobRmAppRefId> implements MobRmAppRefIdJpaDao  {

	public MobRmAppRefId store(MobRmAppRefId mobRmAppRefId) {
		MobRmAppRefId moAppRefId=getEntityManager().merge(mobRmAppRefId);
		return moAppRefId; 
	}

}
