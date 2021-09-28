package com.app.demo.repository;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.demo.pojo.Vehicle;

@Repository
public class VehicleRepoImpl implements VehicleRepo{

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addVehicle(Vehicle vehicle) {
		eMan.persist(vehicle);
		return true;
	}
	@Override
	public boolean updateVehicle(Vehicle vehicle) {
		
		eMan.merge(vehicle);
		return true;
	}
	@Override
	public boolean deleteVehicle(String vehicleNo) {
		Vehicle obj=eMan.find(Vehicle.class, vehicleNo);
		eMan.remove(obj);
		return true;
	}
	@Override
	public List<Vehicle> getVehicles() {
		List<Vehicle> vhcls=eMan.createQuery("from Vehicle").getResultList();
		return vhcls;
	}
	@Override
	public Vehicle searchVehicle(String vehicleNo) {
		Vehicle obj=eMan.find(Vehicle.class, vehicleNo);
		return obj;
	}

}