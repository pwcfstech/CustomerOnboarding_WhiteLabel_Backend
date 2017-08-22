package com.afrAsia.entities.request;

/**
 * @author mds012
 *
 */
public class KYCDataRequest {
	private Long appId;
	private Long applicantId;
	private String docId;
	private String noOfPages;
	private String currentPageNo;
	private Boolean isLastPage;
	private String image;
	private Boolean ignorePrevious;
	private String rmId;
	private Long recordNo;

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(String noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(String currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public Boolean getIsLastPage() {
		return isLastPage;
	}

	public void setIsLastPage(Boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Boolean getIgnorePrevious() {
		return ignorePrevious;
	}

	public void setIgnorePrevious(Boolean ignorePrevious) {
		this.ignorePrevious = ignorePrevious;
	}

	public String getRmId() {
		return rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	public Long getRecordNo() {
		return recordNo;
	}

	public void setRecordNo(Long recordNo) {
		this.recordNo = recordNo;
	}

}
