package com.hlp.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hlp.pojo.Application;
import com.hlp.pojo.BankDetails;

@Repository
public class BankDetailsRepositoryImp implements BankDetailsRepository {
	@Autowired
	EntityManager eMan;
	@Override
	public boolean addBankDetails(BankDetails bankdetails) {
		// TODO Auto-generated method stub
		eMan.persist(bankdetails);
		return true;
	}

	@Override
	public boolean updateBankDetails(BankDetails bankdetails) {
		eMan.merge(bankdetails);
		return true;
	}

	@Override
	public boolean deleteBankDetails(BankDetails bankdetails) {
		BankDetails obj=eMan.find(BankDetails.class, bankdetails);
		eMan.remove(obj);
		return true;
	}

	@Override
	public List<BankDetails> getBankDetails() {
		List<BankDetails> apls=eMan.createQuery("from BankDetails").getResultList();
		return apls;
	}

}
