package com.hlp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hlp.pojo.Application;
import com.hlp.services.ApplicationService;

@RestController
@RequestMapping("/homeloan")
public class HomeLoanController {
 @Autowired
 ApplicationService appserv;
 @GetMapping("/getapplications")
	public List<Application> getAllApplication()
	{
		return appserv.getApplication();
		
	}
}
