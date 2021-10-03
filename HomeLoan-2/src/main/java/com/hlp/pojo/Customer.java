package com.hlp.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="hlp_tbl_Customer")
public class Customer 
{
			
	@Id
	@PrimaryKeyJoinColumn	
		private int customerloginId;
		private String customerEmail;
		private String customerPassword;
		public int getCustomerloginId() {
			return customerloginId;
		}
		public void setCustomerloginId(int customerloginId) {
			this.customerloginId = customerloginId;
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
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
		
		
}