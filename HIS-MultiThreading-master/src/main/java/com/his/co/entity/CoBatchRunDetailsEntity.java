/**
 * 
 */
package com.his.co.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author vinay
 *
 */


@Entity()
@Table(name = "CO_BATCH_RUN_DTLS")
public class CoBatchRunDetailsEntity {
	@Id()
	@GeneratedValue
	@Column(name = "BATCH_RUN_SEQ")
	Integer runSeq;
	@Column(name = "BATCH_NAME")
	String batchName;
	@Column(name = "START_DATE")
	Date startDate;
	@Column(name = "END_DATE")
	Date endTime;

	@Column(name = "BATCH_RUN_STATUS")
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

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getBatchRunStatus() {
		return batchRunStatus;
	}

	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}

}// CoBatchRunDetailsEntity
