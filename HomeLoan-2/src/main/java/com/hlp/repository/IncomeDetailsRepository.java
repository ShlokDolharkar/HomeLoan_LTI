package com.hlp.repository;

import java.util.List;

import com.hlp.pojo.IncomeDetails;
import com.hlp.pojo.LoanDetails;

public interface IncomeDetailsRepository {
	public boolean addIncomeDetails(IncomeDetails incomedeatils);
	public boolean updateIncomeDetails(IncomeDetails incomedeatils);
	public boolean deleteIncomeDetails(IncomeDetails incomedeatils);
	public List<IncomeDetails> getIncomeDetails();
	public IncomeDetails getallvalueofIncomeDetails(IncomeDetails incomedetails);
}
