import { Component, OnInit } from '@angular/core';
import { VehicleService } from '../vehicle.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  vehicleArray:any;
  srchByType:string="";

  constructor(private vservice:VehicleService) { }

  ngOnInit(): void {
  }
  searchByVehicleType()
  {
    console.log("Srch String "+this.srchByType);
      this.vservice.searchVehilesByType(this.srchByType).subscribe
      (
        (data)=>{
          console.log(data);
            this.vehicleArray=data;
        },
        (error)=>
        {
          console.log(error);
        }
      )
  }

}
