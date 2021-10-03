package com.hlp.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hlp.pojo.Application;

@Repository
public class ApplicationRepositoryImp implements ApplicationRepository {
	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addApplication(Application application) {
		eMan.persist(application);
		return true;
	}

	@Override
	public boolean updateApplication(Application application) {
		// TODO Auto-generated method stub
		eMan.merge(application);
		return true;
	}

	@Override
	public boolean deleteApplication(Application application) {
		Application obj=eMan.find(Application.class, application);
		eMan.remove(obj);
		return true;
	}

	@Override
	public List<Application> getApplication() {
		List<Application> apls=eMan.createQuery("from Application").getResultList();
		return apls;
	}

	@Override
	public Application getallvalueApplication(Application application) {
		// TODO Auto-generated method stub
		eMan.persist(application);
		return application;
	}

	@Override
	public Application searchApplication(int applicationId) {
		Application obj = eMan.find(Application.class, applicationId);
		return obj;
	}

}
