package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.AddCommentDao;
import com.afrAsia.entities.transactions.MobComments;

public interface AddCommentJpaDao extends AddCommentDao{
	
	public List<String> getRmUserId(String id);
	
	public List<Long> getAppId(Long appId);

	public MobComments addComments(MobComments mobComments);

}
