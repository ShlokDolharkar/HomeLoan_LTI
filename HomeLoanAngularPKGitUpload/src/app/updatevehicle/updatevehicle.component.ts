import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Vehicle } from '../vehicle';
import { VehicleService } from '../vehicle.service';

@Component({
  selector: 'app-updatevehicle',
  templateUrl: './updatevehicle.component.html',
  styleUrls: ['./updatevehicle.component.css']
})
export class UpdatevehicleComponent implements OnInit {
  vehicle:Vehicle;
  constructor(private activeRoute:ActivatedRoute,private vservice:VehicleService) {
    this.vehicle=new Vehicle();
   }
  vehicleNo:string=""; 
  ngOnInit(): void 
  {
        this.activeRoute.paramMap.subscribe(
          params=> {
              this.vehicleNo=params.get("vehicleNo") as string;
              console.log(this.vehicleNo);
          }     
    )
          this.vservice.searchVehicleByNo(this.vehicleNo).subscribe
          (
            (data)=>{
                console.log(data);
                this.vehicle=data as Vehicle;
                console.log(this.vehicle);
            }
          )
  }
  updateVehicle(vehicleForm:any)
  {
      this.vehicle=vehicleForm.value;
      console.log(this.vehicle);
      this.vservice.updateVehicle(this.vehicle).subscribe
      (
        (data)=>{
            console.log(data);
        },
        (error)=>
        {
          console.log(error);
          
        }     
      )
  }

}
