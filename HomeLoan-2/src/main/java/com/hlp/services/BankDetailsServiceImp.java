package com.hlp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hlp.pojo.BankDetails;
import com.hlp.repository.BankDetailsRepository;
@Service
@Transactional
public class BankDetailsServiceImp implements BankDetailsService{
	@Autowired
	BankDetailsRepository bankrepo;
	@Override
	public boolean addBankDetails(BankDetails bankdetails) {
		return bankrepo.addBankDetails(bankdetails);
	}

	@Override
	public boolean updateBankDetails(BankDetails bankdetails) {
		return bankrepo.updateBankDetails(bankdetails);
	}

	@Override
	public boolean deleteBankDetails(BankDetails bankdetails) {
		return bankrepo.deleteBankDetails(bankdetails);
	}

	@Override
	public List<BankDetails> getBankDetails() {
		return bankrepo.getBankDetails();
	}

}
