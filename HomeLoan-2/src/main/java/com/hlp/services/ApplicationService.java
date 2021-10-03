package com.hlp.services;

import java.util.List;

import com.hlp.pojo.Application;


public interface ApplicationService {
	public boolean addApplication(Application application);
	public boolean updateApplication(Application application);
	public boolean deleteApplication(Application application);
	public List<Application> getApplication();
	public Application getallvalueApplication(Application application);
	public Application searchApplication(int applicationId);
	
}
