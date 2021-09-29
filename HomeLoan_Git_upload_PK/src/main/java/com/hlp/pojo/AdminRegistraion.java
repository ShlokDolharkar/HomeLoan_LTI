package com.hlp.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="hlp_tbl_adminregdetails")
public class AdminRegistraion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "admin_seq", allocationSize = 1)
	@Column(name = "ADMINID")
	private Integer AdminId;
	@Column(name = "ADMINNAME")
	private String AdminName;
	@Column(name = "ADMINEMAIL")
	private String AdminEmail;
	@Column(name = "AdminPASSWORD")
	private String AdminPassword;
	@Column(name = "DATEOFBIRTH")
	private Date DateOfBirth;
	@Column(name = "GENDER")
	private String Gender;
	public Integer getAdminId() {
		return AdminId;
	}
	public void setAdminId(Integer adminId) {
		AdminId = adminId;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminEmail() {
		return AdminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		AdminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
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
	public AdminRegistraion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminRegistraion [AdminId=" + AdminId + ", AdminName=" + AdminName + ", AdminEmail=" + AdminEmail
				+ ", AdminPassword=" + AdminPassword + ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender + "]";
	}

	
	
	
	
}
