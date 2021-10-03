import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Application } from './application';

@Injectable({
  providedIn: 'root'
})
export class AdminserviceService {
baseurl="http://localhost:8088/homeloan";
  constructor(private myhttp:HttpClient) { }
  id:any;
  getPendingAppications()
  {
    return this.myhttp.get(this.baseurl+"/pendingapplicationsview");
  }
  getApplicationId(id:any)
  {
    this.id=id;
  }
  getApplicationbyid(id:number)
  {
    return this.myhttp.get(this.baseurl+"/applicationview/"+id)
  }
  getAllApplications()
  {
    return this.myhttp.get(this.baseurl+"/allapplicationsview")
  }
  approveApplication(a:Application) 
  {
    return this.myhttp.put(this.baseurl+"/approveapplication",a)
  }
  rejectApplication(a:Application)
  {
    return this.myhttp.put(this.baseurl+"/rejectapplication",a)
  }
  getApprovedApplications()
  {
    return this.myhttp.get(this.baseurl+"/approvedapplications")
  }
  generateBankDetails(a:Application)
  {
    return this.myhttp.put(this.baseurl+"/generatedetails",a)
  }

}