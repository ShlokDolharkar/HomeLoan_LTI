package com.hlp.services;

import java.util.List;

import com.hlp.pojo.AdminRegistraion;
//import com.hlp.pojo.Vehicle;

public interface AdminService 
{
		public boolean addAdmin(AdminRegistraion admin);
//		public boolean updateVehicle(Vehicle vehicle);
//		public boolean deleteVehicle(String vehicleNo);
//		public List<Vehicle> getVehicles();
//		public Vehicle searchVehicle(String vehicleNo);
//		
//		public List<Vehicle> getVehiclesByType(String type);
//		public List<Vehicle> getVehiclesByModelName(String type);
//		
//		public List<Vehicle> getVehiclesByModelLike(String type);

		public List<AdminRegistraion> getAdmins();
		
}
