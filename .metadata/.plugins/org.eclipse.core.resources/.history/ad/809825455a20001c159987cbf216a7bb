package com.app.demo.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.demo.pojo.Vehicle;

public interface MyJPARepo extends JpaRepository<Vehicle, String>
{
		public List<Vehicle> findByvehicleType(String name);
		public List<Vehicle> findBymodelName(String name);
		
		@Query("select v from Vehicle v where v.modelName LIKE %:type%")
		public List<Vehicle> findByModelLIKE(String type);
}
