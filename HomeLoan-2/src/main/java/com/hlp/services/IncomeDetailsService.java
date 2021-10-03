package com.hlp.services;

import java.util.List;

import com.hlp.pojo.Application;
import com.hlp.pojo.IncomeDetails;

public interface IncomeDetailsService {
	public boolean addIncomeDetails(IncomeDetails incomedeatils);
	public boolean updateIncomeDetails(IncomeDetails incomedeatils);
	public boolean deleteIncomeDetails(IncomeDetails incomedeatils);
	public List<IncomeDetails> getIncomeDetails();
	public IncomeDetails getallvalueofIncomeDetails(IncomeDetails incomedetails);
}
