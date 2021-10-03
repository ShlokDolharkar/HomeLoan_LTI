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
	private String bankAccId;
	private String customerId; 
	private String loanAccNo;
	private  String balance ;
	private String	adminId ;
	public String getBankAccId() {
		return bankAccId;
	}
	public void setBankAccId(String bankAccId) {
		this.bankAccId = bankAccId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getLoanAccNo() {
		return loanAccNo;
	}
	public void setLoanAccNo(String loanAccNo) {
		this.loanAccNo = loanAccNo;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
