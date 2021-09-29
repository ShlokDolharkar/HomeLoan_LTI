package com.hlp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hlp.pojo.AdminRegistraion;
import com.hlp.pojo.Application;
import com.hlp.pojo.CustomerRegistration;
import com.hlp.services.AdminService;
import com.hlp.services.CustomerService;
import com.hlp.services.ApplicationService;

@RestController
@RequestMapping("/homeloan")
@CrossOrigin(origins = "http://localhost:4200")
public class HomeLoanController {
 @Autowired
 ApplicationService appserv;
 
 	@GetMapping("/getapplications")
	public List<Application> getAllApplication()
	{
		return appserv.getApplication();
		
	}
 	
 	@Autowired
	CustomerService cService;
	
	@Autowired
	AdminService aService;
	
			@GetMapping("/customers")
			public List<CustomerRegistration> getAllCustomers()
			{
				return cService.getCustomers();
				
			}
			
			@PostMapping("/customers")
			public boolean addCustomer(@RequestBody CustomerRegistration customer)
			{
				return cService.addCustomer(customer);
			}
			
			@GetMapping("/admins")
			public List<AdminRegistraion> getAllAdmins()
			{
				return aService.getAdmins();
				
			}
			
			@PostMapping("/admins")
			public boolean addAdmin(@RequestBody AdminRegistraion admin)
			{
				return aService.addAdmin(admin);
			}
}
