package com.afrAsia.entities.response;

import java.io.Serializable;
import com.afrAsia.entities.response.ApplicantDetailsResponse;

public class JointApplicantsResponse implements Serializable {

	public JointApplicantsResponse() {
		super();
	}
	private static final long serialVersionUID = 1L;
	
	private ApplicantDetailsResponse jointApplicantDetail;
	
	private ApplicantDetailsResponse guardianDetail;

	public ApplicantDetailsResponse getJointApplicantDetail() {
		return jointApplicantDetail;
	}
	public void setJointApplicantDetail(ApplicantDetailsResponse jointApplicantDetail) {
		this.jointApplicantDetail = jointApplicantDetail;
	}
	public ApplicantDetailsResponse getGuardianDetail() {
		return guardianDetail;
	}
	public void setGuardianDetail(ApplicantDetailsResponse guardianDetail) {
		this.guardianDetail = guardianDetail;
	}
	@Override
	public String toString() {
		return "JointApplicantInfo [jointApplicantDetail=" + jointApplicantDetail + ", guardianDetail="
				+ guardianDetail + "]";
	}
}

