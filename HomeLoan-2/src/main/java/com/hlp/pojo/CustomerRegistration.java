package com.hlp.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="hlp_tbl_registrationdetails")
public class CustomerRegistration implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	@Column(name = "CUSTOMERID")
	private Integer customerId;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "MIDDLENAME")
	private String middleName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "CUSTOMEREMAIL")
	private String customerEmail;
	@Column(name = "CUSTOMERPASSWORD")
	private String customerPassword;
	@Column(name = "PHONENUMBER")
	private String phoneNumber;
	@Column(name = "DATEOFBIRTH")
	private Date dateOfBirth;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "NATIONALITY")
	private String nationality;
	@Column(name = "AADHARNUMBER")
	private String aadharNumber;
	@Column(name = "PANNUMBER")
	private String panNumber;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CustomerRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}