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
	private int incomeId;
	
	private String propertyLocation;
	private String propertyName;
	private String estimatedAmount;
	private String employmentType;
	private String retirementAge ;
	private String organizatioType;
	private String employeeName;
	private String annualIncome ;
	public int getIncomeId() {
		return incomeId;
	}
	public void setIncomeId(int incomeId) {
		this.incomeId = incomeId;
	}
	public String getPropertyLocation() {
		return propertyLocation;
	}
	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getEstimatedAmount() {
		return estimatedAmount;
	}
	public void setEstimatedAmount(String estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getRetirementAge() {
		return retirementAge;
	}
	public void setRetirementAge(String retirementAge) {
		this.retirementAge = retirementAge;
	}
	public String getOrganizatioType() {
		return organizatioType;
	}
	public void setOrganizatioType(String organizatioType) {
		this.organizatioType = organizatioType;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public IncomeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
