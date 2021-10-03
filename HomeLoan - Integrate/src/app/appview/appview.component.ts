import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { Application } from '../application';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
@Component({
  selector: 'app-appview',
  templateUrl: './appview.component.html',
  styleUrls: ['./appview.component.css']
})
export class AppviewComponent implements OnInit {
id:any;
  constructor(private adservice:AdminserviceService,private route: ActivatedRoute,private router:Router) { }
app:any
approveApplication(a:Application)
{
this.adservice.approveApplication(a).subscribe();
this.generatebankdetails(a);
}
rejectApplication(a:Application)
{
this.adservice.rejectApplication(a);
}
generatebankdetails(a:Application)
{
  this.adservice.generateBankDetails(a);
}
appid:any;
title = 'appBootstrap';
public isCollapsed = false;
public isCollapsed1=false;
public isCollapsed2=false;
  ngOnInit(): void {
    this.route.paramMap.subscribe((params: ParamMap) => {
      this.appid = params.get('id')
      console.log(this.appid)
    })
    this.adservice.getApplicationbyid(this.appid).subscribe(
      (data)=>{
        console.log(data);
        this.app=data;
        console.log(this.app)
      },
      (error)=>{
        console.log(error);
      }
    )
  }

}