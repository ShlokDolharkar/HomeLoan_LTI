package com.hlp.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="hlp_tbl_LoanDetails")
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int loanId ;
	
	private String	maxLoanAmount;
	private String interestRate ;
	private String	loanTenure ;
	private String appliedLoanAmount ;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getMaxLoanAmount() {
		return maxLoanAmount;
	}
	public void setMaxLoanAmount(String maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}
	public String getAppliedLoanAmount() {
		return appliedLoanAmount;
	}
	public void setAppliedLoanAmount(String appliedLoanAmount) {
		this.appliedLoanAmount = appliedLoanAmount;
	}
	public LoanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
}
