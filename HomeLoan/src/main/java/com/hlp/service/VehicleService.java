package com.hlp.service;

import java.util.List;

import com.hlp.pojo.Vehicle;

public interface VehicleService 
{
		public boolean addVehicle(Vehicle vehicle);
		public boolean updateVehicle(Vehicle vehicle);
		public boolean deleteVehicle(String vehicleNo);
		public List<Vehicle> getVehicles();
		public Vehicle searchVehicle(String vehicleNo);
		
		public List<Vehicle> getVehiclesByType(String type);
		public List<Vehicle> getVehiclesByModelName(String type);
		
		public List<Vehicle> getVehiclesByModelLike(String type);
		
}
