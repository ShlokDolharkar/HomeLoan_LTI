package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.pojo.Vehicle;
import com.app.demo.service.VehicleService;

@RestController
@RequestMapping("/api/rest")
@CrossOrigin(origins = "http://localhost:4200")
public class MyRestController
{
	@Autowired
	VehicleService vService;
	
			@GetMapping("/vehicles")
			public List<Vehicle> getAllVehicles()
			{
				return vService.getVehicles();
				
			}
			@GetMapping("/vehicles/{vehicleno}")
			public Vehicle searchVehicle(@PathVariable(name="vehicleno") String vehicleNo)
			{
				return vService.searchVehicle(vehicleNo);
				
			}
			//----
			@GetMapping("/vehiclesByType/{vehicletype}")
			public List<Vehicle> searchVehiclebytype(@PathVariable(name="vehicletype") String vehicleType)
			{
				return vService.getVehiclesByType(vehicleType);
	
			}
			@GetMapping("/vehiclesByModel/{vehicleModel}")
			public List<Vehicle> searchVehiclebyModel(@PathVariable(name="vehicleModel") String vehicleModel)
			{
				return vService.getVehiclesByModelName(vehicleModel);
	
			}
			@GetMapping("/vehiclesByModelLIKE/{vehicleModel}")
			public List<Vehicle> searchVehiclebyModelLIKE(@PathVariable(name="vehicleModel") String vehicleModel)
			{
				System.out.println(vehicleModel+" Search Param");
				return vService.getVehiclesByModelLike(vehicleModel);
	
			}
			//----
			@PostMapping("/vehicles")
			public boolean addVehicle(@RequestBody Vehicle vehicle)
			{
				return vService.addVehicle(vehicle);
			}
			@PutMapping("/vehicles")
			public boolean updateVehicle(@RequestBody Vehicle vehicle)
			{
				return vService.updateVehicle(vehicle);
			}
			@DeleteMapping("/vehicles")
			public boolean deleteVehicle(@RequestBody Vehicle vehicle)
			{
				return vService.deleteVehicle(vehicle.getVehicleNo());
			}
			
			
			
}
