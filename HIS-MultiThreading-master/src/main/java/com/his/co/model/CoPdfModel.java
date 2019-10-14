/**
 * 
 */
package com.his.co.model;



/**
 * @author vinay
 *
 */

public class CoPdfModel {
	Integer coPdfId;
	long caseNumber;
	byte[] pdfDocument;
	String planName;
	String PlanStatus;
	public Integer getCoPdfId() {
		return coPdfId;
	}
	public void setCoPdfId(Integer coPdfId) {
		this.coPdfId = coPdfId;
	}
	public long getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(long caseNumber) {
		this.caseNumber = caseNumber;
	}
	public byte[] getPdfDocument() {
		return pdfDocument;
	}
	public void setPdfDocument(byte[] pdfDocument) {
		this.pdfDocument = pdfDocument;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return PlanStatus;
	}
	public void setPlanStatus(String planStatus) {
		PlanStatus = planStatus;
	}

}// CoPdfModel
