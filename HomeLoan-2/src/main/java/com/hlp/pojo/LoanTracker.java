package com.hlp.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="hlp_tbl_LoanTracker")
public class LoanTracker 
{
	//@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "application")
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LoanTrackerId")
	@PrimaryKeyJoinColumn
	private int LoanTrackerId ;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="ApplicationId")
	private Application application ;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="AdminId")
	private Admin admin;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="LoanId")
	private LoanDetails loan ;
	
	@NonNull
	@Column(name="LoanStatus")
	private String LoanStatus ; 
	
	@NonNull
	@Column(name="PhoneNumber")
	private int PhoneNumber ;

	
	public LoanTracker() {
		super();
		
	}


	public int getLoanTrackerId() {
		return LoanTrackerId;
	}


	public void setLoanTrackerId(int loanTrackerId) {
		LoanTrackerId = loanTrackerId;
	}


	public Application getApplication() {
		return application;
	}


	public void setApplication(Application application) {
		this.application = application;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	public LoanDetails getLoan() {
		return loan;
	}


	public void setLoan(LoanDetails loan) {
		this.loan = loan;
	}


	public String getLoanStatus() {
		return LoanStatus;
	}


	public void setLoanStatus(String loanStatus) {
		LoanStatus = loanStatus;
	}


	public int getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	
	
	
	
}
