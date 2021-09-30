import { Component, OnInit } from '@angular/core';
import { Vehicle } from '../vehicle';
import { VehicleService } from '../vehicle.service';

@Component({
  selector: 'app-newvehicle',
  templateUrl: './newvehicle.component.html',
  styleUrls: ['./newvehicle.component.css']
})
export class NewvehicleComponent implements OnInit {


  vTypes=["Sedan","Hatchback","SUV"];

  vehicle:Vehicle;
  addResult:boolean=true;

  constructor(private vservice:VehicleService) {
      this.vehicle=new Vehicle();
   }

  ngOnInit(): void {
  }
  addVehicle(vehicleForm:any)
  {
      console.log(vehicleForm.value);
      this.vehicle=vehicleForm.value;
      this.vservice.addNewVehicle(this.vehicle).subscribe
      (
        (data)=>{
          console.log(data);
          if(data)
            alert("Vehicle Added!");
        },
        (error)=>{
            console.log(error);
        }
      )

  }
}
