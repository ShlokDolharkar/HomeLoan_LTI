package com.hlp.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import com.hlp.pojo.DocumentDetails;

@Entity
@Table(name="hlp_tbl_Application")
public class Application implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "applicationId")
	private int applicationId;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="customerloginId")
	private Customer customerloginId ;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="customerId")
	private CustomerRegistration customerId;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="incomeId")
	private IncomeDetails incomeId;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="docsId")
	private DocumentDetails docsId;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="loanId")
	private LoanDetails loanId;
	
	private String applicationCompletion;

	

	public int getApplicationId() {
		return applicationId;
	}



	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}



	public Customer getCustomerloginId() {
		return customerloginId;
	}



	public void setCustomerloginId(Customer customerloginId) {
		this.customerloginId = customerloginId;
	}



	public CustomerRegistration getCustomerId() {
		return customerId;
	}



	public void setCustomerId(CustomerRegistration customerId) {
		this.customerId = customerId;
	}



	public IncomeDetails getIncomeId() {
		return incomeId;
	}



	public void setIncomeId(IncomeDetails incomeId) {
		this.incomeId = incomeId;
	}



	public DocumentDetails getDocsId() {
		return docsId;
	}



	public void setDocsId(DocumentDetails docsId) {
		this.docsId = docsId;
	}



	public LoanDetails getLoanId() {
		return loanId;
	}



	public void setLoanId(LoanDetails loanId) {
		this.loanId = loanId;
	}



	public String getApplicationCompletion() {
		return applicationCompletion;
	}



	public void setApplicationCompletion(String applicationCompletion) {
		this.applicationCompletion = applicationCompletion;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
