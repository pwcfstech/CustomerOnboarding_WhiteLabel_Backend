package com.afrAsia.dao.jpa;

import com.afrAsia.dao.MobRmAppRefIdDao;
import com.afrAsia.entities.transactions.MobRmAppRefId;

public interface MobRmAppRefIdJpaDao extends MobRmAppRefIdDao {
	public MobRmAppRefId store(MobRmAppRefId mobRmAppRefId);
}
