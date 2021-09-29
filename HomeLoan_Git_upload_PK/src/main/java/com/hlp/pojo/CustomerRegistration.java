package com.hlp.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="hlp_tbl_registrationdetails")
public class CustomerRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "id_Sequence", sequenceName = "customer_seq", allocationSize = 1)
	@PrimaryKeyJoinColumn
	@Column(name = "CUSTOMERID")
	private Integer CustomerId;
	@Column(name = "FIRSTNAME")
	private String FirstName;
	@Column(name = "MIDDLENAME")
	private String MiddleName;
	@Column(name = "LASTNAME")
	private String LastName;
	@Column(name = "CUSTOMEREMAIL")
	private String CustomerEmail;
	@Column(name = "CUSTOMERPASSWORD")
	private String CustomerPassword;
	@Column(name = "PHONENUMBER")
	private String PhoneNumber;
	@Column(name = "DATEOFBIRTH")
	private Date DateOfBirth;
	@Column(name = "GENDER")
	private String Gender;
	@Column(name = "NATIONALITY")
	private String Nationality;
	@Column(name = "AADHARNUMBER")
	private String AadharNumber;
	@Column(name = "PANNUMBER")
	private String PanNumber;
	
	
	public Integer getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return CustomerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		CustomerPassword = customerPassword;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getAadharNumber() {
		return AadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		AadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return PanNumber;
	}
	public void setPanNumber(String panNumber) {
		PanNumber = panNumber;
	}
	public CustomerRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CustomerRegistraion [CustomerId=" + CustomerId + ", FirstName=" + FirstName + ", MiddleName="
				+ MiddleName + ", LastName=" + LastName + ", CustomerEmail=" + CustomerEmail + ", CustomerPassword="
				+ CustomerPassword + ", PhoneNumber=" + PhoneNumber + ", DateOfBirth=" + DateOfBirth + ", Gender="
				+ Gender + ", Nationality=" + Nationality + ", AadharNumber=" + AadharNumber + ", PanNumber="
				+ PanNumber + "]";
	}
	
	
	
}