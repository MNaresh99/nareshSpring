package com.his.co.model;




public class CoBatchSummaryModel {
	private Integer summaryId;
	private String batchName;
	Integer totalTriggerProcessed;
	private Integer failureTriggerCount;
	private Integer successTriggerCount;
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

}// BatchSummaryModel
