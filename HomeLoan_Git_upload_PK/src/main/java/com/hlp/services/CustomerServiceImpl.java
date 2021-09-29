package com.hlp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hlp.jparepos.MyJPARepoAdminRegistration;
import com.hlp.jparepos.MyJPARepoCustomerRegistration;
import com.hlp.pojo.CustomerRegistration;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	MyJPARepoCustomerRegistration jpaRepo;

	@Override
	public boolean addCustomer(CustomerRegistration customer) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<CustomerRegistration> getCustomers() {
		// TODO Auto-generated method stub
		return jpaRepo.findAll();
	}
	
	

	
//	@Autowired
//	VehicleRepo vrepo;
//	
//	@Autowired
//	MyJPARepo jpaRepo;
//	
//	@Override
//	public boolean addVehicle(Vehicle vehicle) 
//	{
//		//return vrepo.addVehicle(vehicle);
//		jpaRepo.save(vehicle);
//		return true;
//	}
//	@Override
//	public boolean updateVehicle(Vehicle vehicle) {
//		jpaRepo.save(vehicle);
//		return true;
//	}
//	@Override
//	public boolean deleteVehicle(String vehicleNo) {
//		jpaRepo.deleteById(vehicleNo);
//		return true;
//	}
	
//	@Override
//	public List<Vehicle> getVehicles() {
//		//return vrepo.getVehicles();
//		return jpaRepo.findAll();
//	}
//	@Override
//	public Vehicle searchVehicle(String vehicleNo) {
//		//return vrepo.searchVehicle(vehicleNo);
//		Vehicle obj=jpaRepo.findById(vehicleNo).get();
//		return obj;
//	}
//	@Override
//	public List<Vehicle> getVehiclesByType(String type) {
//		return jpaRepo.findByvehicleType(type);
//	}
//	@Override
//	public List<Vehicle> getVehiclesByModelName(String type) {
//		// TODO Auto-generated method stub
//		return jpaRepo.findBymodelName(type);
//	}
//	@Override
//	public List<Vehicle> getVehiclesByModelLike(String type) {
//		// TODO Auto-generated method stub
//		return jpaRepo.findByModelLIKE(type);
//	}

	
}
