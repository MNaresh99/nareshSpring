package com.his.co.entity;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "CO_TRIGGERS")
public class CoTriggersEntity {

	@Id
	@GeneratedValue
	@Column(name = "TRG_ID")
	private Integer triggerId;

	@Column(name = "CASE_NUM")
	private Long caseNum;

	@Column(name = "TRG_STATUS")
	private String triggerStatus;

	@Column(name = "CREATE_DT")
	private Date createdDate;

	@Column(name = "UPDATE_DT")
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
