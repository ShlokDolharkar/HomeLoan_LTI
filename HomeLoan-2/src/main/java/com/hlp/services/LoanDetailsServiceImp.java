package com.hlp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hlp.pojo.LoanDetails;
import com.hlp.repository.LoanDetailsRepository;
@Service
@Transactional
public class LoanDetailsServiceImp implements LoanDetailsService{
	@Autowired
	LoanDetailsRepository loanrepo;
	@Override
	public LoanDetails addLoandetails(LoanDetails loandetails) {
		return loanrepo.addLoandetails(loandetails);
	}

	@Override
	public boolean updateLoandetails(LoanDetails loandetails) {
		return loanrepo.updateLoandetails(loandetails);
	}

	@Override
	public boolean deleteLoandetails(LoanDetails loandetails) {
		return loanrepo.deleteLoandetails(loandetails);
	}

	@Override
	public List<LoanDetails> getLoandeatils() {
		return loanrepo.getLoandeatils();
	}

}
