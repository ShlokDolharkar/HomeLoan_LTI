package com.hlp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name="hlp_tbl_LoanDetails")
@Table(name="hlp_tbl_LoanDetails")
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LoanId  ")
	@PrimaryKeyJoinColumn
	private int LoanId ;
	
	private int	MaxLoanAmount;
	private int InterestRate ;
	private int	LoanTenure ;
	private int AppliedLoanAmount ;
	public int getLoanId() {
		return LoanId;
	}
	public void setLoanId(int loanId) {
		LoanId = loanId;
	}
	public int getMaxLoanAmount() {
		return MaxLoanAmount;
	}
	public void setMaxLoanAmount(int maxLoanAmount) {
		MaxLoanAmount = maxLoanAmount;
	}
	public int getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(int interestRate) {
		InterestRate = interestRate;
	}
	public int getLoanTenure() {
		return LoanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		LoanTenure = loanTenure;
	}
	public int getAppliedLoanAmount() {
		return AppliedLoanAmount;
	}
	public void setAppliedLoanAmount(int appliedLoanAmount) {
		AppliedLoanAmount = appliedLoanAmount;
	}
	public LoanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
