import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Vehicle } from './vehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {

  baseUrl="http://localhost:8088/api/rest";

  constructor(private http:HttpClient) 
  { }

  getAllVehicles()
  {
     return this.http.get(this.baseUrl+"/vehicles");
  }
  addNewVehicle(vehicle:Vehicle)
  {
      return this.http.post(this.baseUrl+"/vehicles",vehicle);
  }
  searchVehilesByType(srchString:string)
  {
      return this.http.get(this.baseUrl+"/vehiclesByType/"+srchString);
  }
  searchVehicleByNo(vehicleNo:string) //FETCH BY NO
  {
      return this.http.get(this.baseUrl+"/vehicles/"+vehicleNo);
  }
  updateVehicle(vehicle:Vehicle) // UPDATE RECORD
  {
      return this.http.put(this.baseUrl+"/vehicles",vehicle);
  }

}
