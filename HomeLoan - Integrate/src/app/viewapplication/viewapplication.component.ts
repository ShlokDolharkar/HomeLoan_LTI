import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';

@Component({
  selector: 'app-viewapplication',
  templateUrl: './viewapplication.component.html',
  styleUrls: ['./viewapplication.component.css']
})
export class ViewapplicationComponent implements OnInit {

  constructor(private aservice:AdminserviceService) { }
  apparray:any;
  app:any;
getApplicationId(id:number)
{
  this.aservice.getApplicationId(id);
}
  ngOnInit(): void {
    this.aservice.getPendingAppications().subscribe(
      (data)=>{
        console.log(data);
        this.apparray=data;
        console.log(this.apparray);
      },
      (error)=>{
       console.log(error);
      }
    )
  }

}