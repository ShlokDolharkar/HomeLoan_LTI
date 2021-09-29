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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
		private Integer CustomerId;
		private String CustomerEmail;		
		private String CustomerPassword;
		public Integer getCustomerId() {
			return CustomerId;
		}
		public void setCustomerId(Integer customerId) {
			CustomerId = customerId;
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
		public Customer(Integer customerId, String customerEmail, String customerPassword) {
			super();
			CustomerId = customerId;
			CustomerEmail = customerEmail;
			CustomerPassword = customerPassword;
		}
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
}