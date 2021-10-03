package com.hlp.repository;

import java.util.List;

import com.hlp.pojo.BankDetails;

public interface BankDetailsRepository {
	public boolean addBankDetails(BankDetails bankdetails);
	public boolean updateBankDetails(BankDetails bankdetails);
	public boolean deleteBankDetails(BankDetails bankdetails);
	public List<BankDetails> getBankDetails();
}
