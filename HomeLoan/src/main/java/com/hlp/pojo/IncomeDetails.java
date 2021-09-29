package com.hlp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="hlp_tbl_IncomeDetails")
public class IncomeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IncomeId ")
	@PrimaryKeyJoinColumn
	private int IncomeId;
	
	private String PropertyLocation;
	private String PropertyName;
	private String EstimatedAmount;
	private String EmploymentType;
	private String RetirementAge ;
	private String OrganizatioType;
	private String EmployeeName;
	private String AnnualIncome ;
	public int getIncomeId() {
		return IncomeId;
	}
	public void setIncomeId(int incomeId) {
		IncomeId = incomeId;
	}
	public String getPropertyLocation() {
		return PropertyLocation;
	}
	public void setPropertyLocation(String propertyLocation) {
		PropertyLocation = propertyLocation;
	}
	public String getPropertyName() {
		return PropertyName;
	}
	public void setPropertyName(String propertyName) {
		PropertyName = propertyName;
	}
	public String getEstimatedAmount() {
		return EstimatedAmount;
	}
	public void setEstimatedAmount(String estimatedAmount) {
		EstimatedAmount = estimatedAmount;
	}
	public String getEmploymentType() {
		return EmploymentType;
	}
	public void setEmploymentType(String employmentType) {
		EmploymentType = employmentType;
	}
	public String getRetirementAge() {
		return RetirementAge;
	}
	public void setRetirementAge(String retirementAge) {
		RetirementAge = retirementAge;
	}
	public String getOrganizatioType() {
		return OrganizatioType;
	}
	public void setOrganizatioType(String organizatioType) {
		OrganizatioType = organizatioType;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getAnnualIncome() {
		return AnnualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		AnnualIncome = annualIncome;
	}
	public IncomeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
