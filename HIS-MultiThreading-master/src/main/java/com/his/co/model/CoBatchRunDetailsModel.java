/**
 * 
 */
package com.his.co.model;

import java.util.Date;



/**
 * @author vinay
 *
 */

public class CoBatchRunDetailsModel {
	private Integer runSeq;
	private String batchName;
	private Date startDate;
	private Date endDate;
	private String batchRunStatus;
	public Integer getRunSeq() {
		return runSeq;
	}
	public void setRunSeq(Integer runSeq) {
		this.runSeq = runSeq;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getBatchRunStatus() {
		return batchRunStatus;
	}
	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}
}// CoBatchRunDetailsModel
