package com.hlp.repository;

import java.util.List;

import com.hlp.pojo.Vehicle;

public interface VehicleRepo 
{
	public boolean addVehicle(Vehicle vehicle);
	public boolean updateVehicle(Vehicle vehicle);
	public boolean deleteVehicle(String vehicleNo);
	public List<Vehicle> getVehicles();
	public Vehicle searchVehicle(String vehicleNo);
}
