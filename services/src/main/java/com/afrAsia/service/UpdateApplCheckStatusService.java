package com.afrAsia.service;

import com.afrAsia.entities.request.ApplCheckStatusReq;
import com.afrAsia.entities.response.ApplCheckStatusResponse;

public interface UpdateApplCheckStatusService {
	public ApplCheckStatusResponse updateApplCheckStatus(ApplCheckStatusReq applCheckStatusReq);
}
