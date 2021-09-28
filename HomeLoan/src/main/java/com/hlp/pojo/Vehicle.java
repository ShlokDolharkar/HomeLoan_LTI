package com.hlp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicleinfo")
public class Vehicle 
{
		@Id
		private String vehicleNo;
		private String vehicleType;
		private String modelName;
		
		public String getVehicleNo() {
			return vehicleNo;
		}
		public void setVehicleNo(String vehicleNo) {
			this.vehicleNo = vehicleNo;
		}
		public String getVehicleType() {
			return vehicleType;
		}
		public void setVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public Vehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + ", modelName=" + modelName
					+ "]";
		}
		
		
		
}
