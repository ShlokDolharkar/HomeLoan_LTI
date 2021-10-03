package com.hlp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hlp.pojo.IncomeDetails;
import com.hlp.repository.IncomeDetailsRepository;
@Service
@Transactional
public class IncomeDetailsServiceImp implements IncomeDetailsService{
	@Autowired
	IncomeDetailsRepository incomerepo;
	@Override
	public boolean addIncomeDetails(IncomeDetails incomedeatils) {
		return incomerepo.addIncomeDetails(incomedeatils);
	}

	@Override
	public boolean updateIncomeDetails(IncomeDetails incomedeatils) {
		return incomerepo.updateIncomeDetails(incomedeatils);
	}

	@Override
	public boolean deleteIncomeDetails(IncomeDetails incomedeatils) {
		return incomerepo.deleteIncomeDetails(incomedeatils);
	}

	@Override
	public List<IncomeDetails> getIncomeDetails() {
		return incomerepo.getIncomeDetails();
	}

	@Override
	public IncomeDetails getallvalueofIncomeDetails(IncomeDetails incomedetails) {
		// TODO Auto-generated method stub
		return incomerepo.getallvalueofIncomeDetails(incomedetails);
	}

}
