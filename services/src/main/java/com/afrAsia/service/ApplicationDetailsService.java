package com.afrAsia.service;

//import com.afrAsia.entities.transactions.MobRmAppRefId;
//
//
//public interface ApplicationDetailsService {
//	public MobRmAppRefId getApplicationDetails(Long appRefId);
//}

import com.afrAsia.entities.request.ApplicationDetailsReq;
import com.afrAsia.entities.response.ApplicationDetailsResponse;

public interface ApplicationDetailsService {
	ApplicationDetailsResponse getApplicationDetails(ApplicationDetailsReq applicationDetailsReq);
}