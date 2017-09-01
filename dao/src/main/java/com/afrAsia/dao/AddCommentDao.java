package com.afrAsia.dao;

import java.util.List;

import com.afrAsia.entities.transactions.MobComments;

public interface AddCommentDao {
	
	//public List<String> getRmUserId(String id);
	
	public String getRmId(String rmId);
	
	public List<Long> getAppId(Long appId);

	public MobComments addComments(MobComments mobComments);

}
