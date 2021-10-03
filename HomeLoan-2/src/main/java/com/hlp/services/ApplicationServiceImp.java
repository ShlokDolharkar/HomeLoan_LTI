package com.hlp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hlp.pojo.Application;
import com.hlp.repository.ApplicationRepository;

@Service
@Transactional
public class ApplicationServiceImp implements ApplicationService{
	@Autowired
	ApplicationRepository aprepo;
	
	@Override
	public boolean addApplication(Application application) {
		// TODO Auto-generated method stub
		return aprepo.addApplication(application);
	}

	@Override
	public boolean updateApplication(Application application) {
		// TODO Auto-generated method stub
		return aprepo.updateApplication(application);
	}

	@Override
	public boolean deleteApplication(Application application) {
		// TODO Auto-generated method stub
		return aprepo.deleteApplication(application);
	}

	@Override
	public List<Application> getApplication() {
		// TODO Auto-generated method stub
		return aprepo.getApplication();
	}

	@Override
	public Application getallvalueApplication(Application application) {
		// TODO Auto-generated method stub
		return aprepo.getallvalueApplication(application);
	}

	@Override
	public Application searchApplication(int applicationId) {
		// TODO Auto-generated method stub
		return aprepo.searchApplication(applicationId);
	}
	
	

}
