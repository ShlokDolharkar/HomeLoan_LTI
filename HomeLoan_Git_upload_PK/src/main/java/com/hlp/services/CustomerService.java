package com.hlp.services;

import java.util.List;

import com.hlp.pojo.CustomerRegistration;
//import com.hlp.pojo.Vehicle;

public interface CustomerService 
{
		public boolean addCustomer(CustomerRegistration customer);
//		public boolean updateVehicle(Vehicle vehicle);
//		public boolean deleteVehicle(String vehicleNo);
//		public List<Vehicle> getVehicles();
//		public Vehicle searchVehicle(String vehicleNo);
//		
//		public List<Vehicle> getVehiclesByType(String type);
//		public List<Vehicle> getVehiclesByModelName(String type);
//		
//		public List<Vehicle> getVehiclesByModelLike(String type);

		public List<CustomerRegistration> getCustomers();
		
}
