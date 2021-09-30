import { Component, OnInit } from '@angular/core';
import { VehicleService } from '../vehicle.service';

@Component({
  selector: 'app-showall',
  templateUrl: './showall.component.html',
  styleUrls: ['./showall.component.css']
})
export class ShowallComponent implements OnInit {

  constructor(private vservice:VehicleService) { }
  vehicleArray:any;
  ngOnInit(): void 
  {
        this.vservice.getAllVehicles().subscribe(
          (data)=>{
                console.log(data);
                this.vehicleArray=data;
                console.log(this.vehicleArray);
          },
          (error)=>
          {
              console.log(error);
          }
        )
  }

}
