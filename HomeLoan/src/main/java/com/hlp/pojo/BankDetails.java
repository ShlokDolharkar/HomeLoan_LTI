package com.hlp.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="hlp_tbl_BankDetails")
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private String BankAccId;
	private String CustomerId; 
	private String LoanAccNo;
	private  String Balance ;
	private String	AdminId ;
	public String getBankAccId() {
		return BankAccId;
	}
	public void setBankAccId(String bankAccId) {
		BankAccId = bankAccId;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getLoanAccNo() {
		return LoanAccNo;
	}
	public void setLoanAccNo(String loanAccNo) {
		LoanAccNo = loanAccNo;
	}
	public String getBalance() {
		return Balance;
	}
	public void setBalance(String balance) {
		Balance = balance;
	}
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
