package com.hlp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name="hlp_tbl_DocDetails")
@Table(name="hlp_tbl_DocDetails")
public class DocumentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DocsId  ")
	@PrimaryKeyJoinColumn
	private int DocsId ;
	
	private String Pan ;
	private String SalarySlip ;
	private String LOA ;
	private String NOC ;
	private String Agreement;
	private String Aadhar;
	public int getDocsId() {
		return DocsId;
	}
	public void setDocsId(int docsId) {
		DocsId = docsId;
	}
	public String getPan() {
		return Pan;
	}
	public void setPan(String pan) {
		Pan = pan;
	}
	public String getSalarySlip() {
		return SalarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		SalarySlip = salarySlip;
	}
	public String getLOA() {
		return LOA;
	}
	public void setLOA(String lOA) {
		LOA = lOA;
	}
	public String getNOC() {
		return NOC;
	}
	public void setNOC(String nOC) {
		NOC = nOC;
	}
	public String getAgreement() {
		return Agreement;
	}
	public void setAgreement(String agreement) {
		Agreement = agreement;
	}
	public String getAadhar() {
		return Aadhar;
	}
	public void setAadhar(String aadhar) {
		Aadhar = aadhar;
	}
	public DocumentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
