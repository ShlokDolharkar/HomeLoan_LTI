import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';

@Component({
  selector: 'app-approvedapplications',
  templateUrl: './approvedapplications.component.html',
  styleUrls: ['./approvedapplications.component.css']
})
export class ApprovedapplicationsComponent implements OnInit {

  constructor(private adservice:AdminserviceService) { }

  appdata:any
getApplicationId(id:any)
{
  this.adservice.getApplicationId(id);
}
  ngOnInit(): void {
    this.adservice.getApprovedApplications().subscribe(
      (data)=>{
        console.log(data);
        this.appdata=data;
        console.log(this.appdata);
      },
      (error)=>{
        console.log(error)
      }
    );
  }

}