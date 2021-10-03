package com.hlp.services;

import java.util.List;
import com.hlp.pojo.LoanDetails;

public interface LoanDetailsService {
	public LoanDetails addLoandetails (LoanDetails loandetails);
	public boolean updateLoandetails (LoanDetails loandetails);
	public boolean deleteLoandetails (LoanDetails loandetails);
	public List<LoanDetails> getLoandeatils();
}
