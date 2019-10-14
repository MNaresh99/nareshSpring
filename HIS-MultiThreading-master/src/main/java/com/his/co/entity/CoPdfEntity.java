/**
 * 
 */
package com.his.co.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



/**
 * @author vinay
 *
 */



@Entity
@Table(name = "CO_PDFS")
public class CoPdfEntity {
	
	@Id()
	@GeneratedValue
	@Column(name = "CO_PDF_ID")
	Integer coPdfId;
	@Column(name = "CASE_NUMBER")
	String caseNumber;
	@Lob
	@Column(name = "PDF_DOCUMENT", length = 100000)
	byte[] pdfDocument;
	@Column(name = "PLAN_NAME")
	String planName;
	@Column(name = "PLAN_STATUS")
	String PlanStatus;
	
public CoPdfEntity() {
		
	}
	
	public Integer getCoPdfId() {
		return coPdfId;
	}
	public void setCoPdfId(Integer coPdfId) {
		this.coPdfId = coPdfId;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
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

}// CoPdfEntity
