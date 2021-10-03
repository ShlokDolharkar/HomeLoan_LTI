package com.hlp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="hlp_tbl_DocDetails")
public class DocumentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DocsId  ")
	@PrimaryKeyJoinColumn
	private int docsId ;
	
	private String pan ;
	private String salarySlip ;
	private String loa ;
	private String noc ;
	private String agreement;
	private String aadhar;
	public int getDocsId() {
		return docsId;
	}
	public void setDocsId(int docsId) {
		this.docsId = docsId;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}
	public String getLoa() {
		return loa;
	}
	public void setLoa(String loa) {
		this.loa = loa;
	}
	public String getNoc() {
		return noc;
	}
	public void setNoc(String noc) {
		this.noc = noc;
	}
	public String getAgreement() {
		return agreement;
	}
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public DocumentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
