import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { Application } from '../application';

@Component({
  selector: 'app-allapplications',
  templateUrl: './allapplications.component.html',
  styleUrls: ['./allapplications.component.css']
})
export class AllapplicationsComponent implements OnInit {

  constructor(private adservice:AdminserviceService) { }
appdata:any;
getApplicationId(id:any)
{
  this.adservice.getApplicationId(id);
}
  ngOnInit(): void {
    this.adservice.getAllApplications().subscribe(
      (data)=>{
        console.log(data);
        this.appdata=data;
        console.log(this.appdata)
      },
      (error)=>{
        console.log(error)
      }
    );
  }

}