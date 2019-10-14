package com.his.co.model;

import java.util.Date;




public class CoTriggersModel {

	private Integer triggerId;

	private Long caseNum;

	private String triggerStatus;

	private Date createdDate;

	private Date updatedDate;

	public Integer getTriggerId() {
		return triggerId;
	}

	public void setTriggerId(Integer triggerId) {
		this.triggerId = triggerId;
	}

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public String getTriggerStatus() {
		return triggerStatus;
	}

	public void setTriggerStatus(String triggerStatus) {
		this.triggerStatus = triggerStatus;
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
