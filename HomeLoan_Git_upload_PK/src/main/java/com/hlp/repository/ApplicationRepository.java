package com.hlp.repository;

import java.util.List;

import com.hlp.pojo.Application;

public interface ApplicationRepository {
	public boolean addApplication(Application application);
	public boolean updateApplication(Application application);
	public boolean deleteApplication(Application application);
	public List<Application> getApplication();
}
