package com.hlp.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hlp.pojo.Application;
import com.hlp.pojo.LoanDetails;
@Repository
public class LoanDetailsRepositoryImp implements LoanDetailsRepository {
	@Autowired
	EntityManager eMan;
	@Override
	public LoanDetails addLoandetails(LoanDetails loandetails) {
		eMan.persist(loandetails);
		return loandetails;
	}

	@Override
	public boolean updateLoandetails(LoanDetails loandetails) {
		eMan.merge(loandetails);
		return true;
	}

	@Override
	public boolean deleteLoandetails(LoanDetails loandetails) {
		LoanDetails obj=eMan.find(LoanDetails.class, loandetails);
		eMan.remove(obj);
		return true;
	}

	@Override
	public List<LoanDetails> getLoandeatils() {
		List<LoanDetails> apls=eMan.createQuery("from LoanDetails").getResultList();
		return apls;
	}


}
