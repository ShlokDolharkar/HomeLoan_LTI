package com.hlp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hlp.pojo.*;
import com.hlp.services.ApplicationService;
import com.hlp.services.BankDetailsService;
import com.hlp.services.DocumentuploadService;
import com.hlp.services.IncomeDetailsService;
import com.hlp.services.LoanDetailsService;

@RestController
@RequestMapping("/homeloan")

@CrossOrigin(origins = "http://localhost:4200")
public class HomeLoanController {
 @Autowired
 ApplicationService appserv;
 @Autowired
 BankDetailsService bankserv;
 @Autowired
 DocumentuploadService docserv;
 @Autowired
 IncomeDetailsService incomeserv;
 @Autowired
 LoanDetailsService loanserv;
 @GetMapping("/getapplications")
	public List<Application> getAllApplication()
	{
		return appserv.getApplication();
		
	}
 @GetMapping("/getbankdetails")
	public List<BankDetails> getBankDetails()
	{
		return bankserv.getBankDetails();
		
	}
 @GetMapping("/getdocumentupload")
	public List<DocumentDetails> getDocumentDetails()
	{
		return docserv.getDocumentDetails();
		
	}
 @GetMapping("/getincomedetails")
	public List<IncomeDetails> getIncomeDetails()
	{
		return incomeserv.getIncomeDetails();
		
	}
 @PostMapping("/getallvaluesincomedetails")
	public IncomeDetails getallvaluesIncomeDetails(@RequestBody IncomeDetails incomed)
	{
		return incomeserv.getallvalueofIncomeDetails(incomed);
		
	}
 @GetMapping("/getloandetails")
	public List<LoanDetails> getLoanDetails()
	{
		return loanserv.getLoandeatils();
		
	}
 @PostMapping("/addApplicationDetails")
	public boolean addApplicationDetails(@RequestBody Application apli)
	{
		return appserv.addApplication(apli);
	}
 @PostMapping("/getallvalueApplication")
	public Application getallvalueApplication(@RequestBody Application apli)
	{
		return appserv.getallvalueApplication(apli);
	}
 @PutMapping("/updateApplication")
	public boolean updateVehicle(@RequestBody Application apli)
	{
		return appserv.updateApplication(apli);
	}
 
 @PostMapping("/addLoanDetails")
	public LoanDetails addLoanDetails(@RequestBody LoanDetails loandetails)
	{
		return loanserv.addLoandetails(loandetails);
	}
 @PostMapping("/addIncomeDetails")
	public boolean addIncomeDetails(@RequestBody IncomeDetails incomedetails)
	{
		return incomeserv.addIncomeDetails(incomedetails);
	}
 @GetMapping("/{applicationId}/addLoanDetails")
 	public Application searchApplication(@PathVariable(name="applicationId") int applicationId) {
	 return appserv.searchApplication(applicationId);
 }
 @GetMapping("/{applicationId}/addDocDetails")
	public Application searchApplication2(@PathVariable(name="applicationId") int applicationId) {
	 return appserv.searchApplication(applicationId);
}
 
}
