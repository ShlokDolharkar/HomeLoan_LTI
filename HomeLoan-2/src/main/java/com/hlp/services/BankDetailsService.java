package com.hlp.services;

import java.util.List;

import com.hlp.pojo.BankDetails;
import com.hlp.pojo.IncomeDetails;

public interface BankDetailsService {
	public boolean addBankDetails(BankDetails bankdetails);
	public boolean updateBankDetails(BankDetails bankdetails);
	public boolean deleteBankDetails(BankDetails bankdetails);
	public List<BankDetails> getBankDetails();
}
