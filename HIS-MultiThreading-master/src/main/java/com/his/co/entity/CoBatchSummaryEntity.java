package com.his.co.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * 
 * @author vinay
 *
 */


@Entity()
@Table(name="BATCH_SUMMARY")
public class CoBatchSummaryEntity {
	@Id()
	@GeneratedValue
	@Column(name="SUMMARY_ID")
	private Integer  summaryId;
	@Column(name = "BATCH_NAME")
	String batchName;
	@Column(name = "TOTAL_TRIGGER_PROCESSED")
	Integer totalTriggerProcessed;
	@Column(name = "FAILURE_TRIGGER_COUNT")
	Integer failureTriggerCount;
	@Column(name="SUCCESS_TRIGGER_COUNT")
	Integer successTriggerCount;
	public Integer getSummaryId() {
		return summaryId;
	}
	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public Integer getTotalTriggerProcessed() {
		return totalTriggerProcessed;
	}
	public void setTotalTriggerProcessed(Integer totalTriggerProcessed) {
		this.totalTriggerProcessed = totalTriggerProcessed;
	}
	public Integer getFailureTriggerCount() {
		return failureTriggerCount;
	}
	public void setFailureTriggerCount(Integer failureTriggerCount) {
		this.failureTriggerCount = failureTriggerCount;
	}
	public Integer getSuccessTriggerCount() {
		return successTriggerCount;
	}
	public void setSuccessTriggerCount(Integer successTriggerCount) {
		this.successTriggerCount = successTriggerCount;
	}

}//BatchSummary
