package com.hlp.repository;

import java.util.List;

import com.hlp.pojo.IncomeDetails;
import com.hlp.pojo.LoanDetails;

public interface LoanDetailsRepository {
	
	public LoanDetails addLoandetails (LoanDetails loandetails);
	public boolean updateLoandetails (LoanDetails loandetails);
	public boolean deleteLoandetails (LoanDetails loandetails);
	public List<LoanDetails> getLoandeatils();
}
