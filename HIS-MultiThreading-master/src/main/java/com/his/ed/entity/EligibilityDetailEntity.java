package com.his.ed.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityDetailEntity {

	@Id
	@GeneratedValue
	@Column(name = "ED_TRACE_ID")
	private Integer edTraceId;

	@Column(name = "CASE_NUM")
	private Long caseNum;

	@Column(name = "PLAN_NAME")
	private String planName;

	@Column(name = "PLAN_STATUS")
	private String planStatus;

	@Column(name = "PLAN_START_DT")
	private String planStartDate;

	@Column(name = "PLAN_END_DT")
	private String planEndDate;

	@Column(name = "BENEFIT_AMT")
	private String benefitAmt;

	@Column(name = "DENIAL_REASON")
	private String denialReason;

	@Column(name = "CREATE_DT")
	private Date createdDate;

	@Column(name = "UPDATE_DT")
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

}
