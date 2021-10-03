package com.hlp.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hlp.pojo.Application;
import com.hlp.pojo.IncomeDetails;
@Repository
public class IncomeDetailsRepositoryImp implements IncomeDetailsRepository {
	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addIncomeDetails(IncomeDetails incomedetails) {
		eMan.persist(incomedetails);
		return true;
	}

	@Override
	public boolean updateIncomeDetails(IncomeDetails incomedetails) {
		eMan.merge(incomedetails);
		return true;
	}

	@Override
	public boolean deleteIncomeDetails(IncomeDetails incomedetails) {
		IncomeDetails obj=eMan.find(IncomeDetails.class, incomedetails);
		eMan.remove(obj);
		return true;
	}

	@Override
	public List<IncomeDetails> getIncomeDetails() {
		List<IncomeDetails> apls=eMan.createQuery("from IncomeDetails").getResultList();
		return apls;
	}

	@Override
	public IncomeDetails getallvalueofIncomeDetails(IncomeDetails incomedetails) {
		eMan.persist(incomedetails);
		return incomedetails;
	}

	

}
