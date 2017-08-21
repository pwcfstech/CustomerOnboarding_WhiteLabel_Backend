package com.afrAsia.entities.request;

import java.io.Serializable;
import com.afrAsia.entities.request.ApplicantDetails;

public class JointApplicants implements Serializable {

	public JointApplicants() {
		super();
	}
	private static final long serialVersionUID = 1L;
	
	private ApplicantDetails jointApplicantDetail;
	
	private ApplicantDetails guardianDetail;

	public ApplicantDetails getJointApplicantDetail() {
		return jointApplicantDetail;
	}
	public void setJointApplicantDetail(ApplicantDetails jointApplicantDetail) {
		this.jointApplicantDetail = jointApplicantDetail;
	}
	public ApplicantDetails getGuardianDetail() {
		return guardianDetail;
	}
	public void setGuardianDetail(ApplicantDetails guardianDetail) {
		this.guardianDetail = guardianDetail;
	}
	@Override
	public String toString() {
		return "JointApplicantInfo [jointApplicantDetail=" + jointApplicantDetail + ", guardianDetail="
				+ guardianDetail + "]";
	}
}

