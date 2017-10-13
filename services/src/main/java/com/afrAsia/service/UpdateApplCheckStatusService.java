package com.afrAsia.service;

import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.ApplCheckStatusReq;
import com.afrAsia.entities.response.ApplCheckStatusResponse;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;

public interface UpdateApplCheckStatusService {
	public ApplCheckStatusResponse updateApplCheckStatus(ApplCheckStatusReq applCheckStatusReq);
	
	public RMDetails getRMDetails(Long refId);
	
	public MobApplicantPersonalDetail getApplPersonalDetails(Long refId);
}
