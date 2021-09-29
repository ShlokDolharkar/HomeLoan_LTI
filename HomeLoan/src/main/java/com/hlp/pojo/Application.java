package com.hlp.pojo;

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

@Entity(name="hlp_tbl_Application")
@Table(name="hlp_tbl_Application")
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ApplicationId")
	@PrimaryKeyJoinColumn
	private int ApplicationId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CustomerId")
	private Customer CustomerId ;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PersonalDetailsId")
	private CustomerRegistration PersonalDetailsId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IncomeId")
	private IncomeDetails IncomeId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DocsId")
	private DocumentDetails DocsId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="LoanId")
	private LoanDetails LoanId;
	
	private String ApplicationCompletion;

	public int getApplicationId() {
		return ApplicationId;
	}

	public void setApplicationId(int applicationId) {
		ApplicationId = applicationId;
	}

	public Customer getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Customer customerId) {
		CustomerId = customerId;
	}

	public CustomerRegistration getPersonalDetailsId() {
		return PersonalDetailsId;
	}

	public void setPersonalDetailsId(CustomerRegistration personalDetailsId) {
		PersonalDetailsId = personalDetailsId;
	}

	public IncomeDetails getIncomeId() {
		return IncomeId;
	}

	public void setIncomeId(IncomeDetails incomeId) {
		IncomeId = incomeId;
	}

	public DocumentDetails getDocsId() {
		return DocsId;
	}

	public void setDocsId(DocumentDetails docsId) {
		DocsId = docsId;
	}

	public LoanDetails getLoanId() {
		return LoanId;
	}

	public void setLoanId(LoanDetails loanId) {
		LoanId = loanId;
	}

	public String getApplicationCompletion() {
		return ApplicationCompletion;
	}

	public void setApplicationCompletion(String applicationCompletion) {
		ApplicationCompletion = applicationCompletion;
	}

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
