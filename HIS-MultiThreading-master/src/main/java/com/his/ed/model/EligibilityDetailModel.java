package com.his.ed.model;

import java.util.Date;

public class EligibilityDetailModel {


	private Integer edTraceId;

	private Long caseNum;

	private String planName;

	private String planStatus;

	private String planStartDate;

	private String planEndDate;

	private String benefitAmt;

	private String denialReason;

	private Date createdDate;

	private Date updatedDate;

	public Integer getEdTraceId() {
		return edTraceId;
	}

	public void setEdTraceId(Integer edTraceId) {
		this.edTraceId = edTraceId;
	}

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}

	public String getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getBenefitAmt() {
		return benefitAmt;
	}

	public void setBenefitAmt(String benefitAmt) {
		this.benefitAmt = benefitAmt;
	}

	public String getDenialReason() {
		return denialReason;
	}

	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "EligibilityDetailModel [edTraceId=" + edTraceId + ", caseNum=" + caseNum + ", planName=" + planName
				+ ", planStatus=" + planStatus + ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate
				+ ", benefitAmt=" + benefitAmt + ", denialReason=" + denialReason + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

}
