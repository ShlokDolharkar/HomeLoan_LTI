import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Adminregistration } from './adminregistration';

@Injectable({
  providedIn: 'root'
})
export class AdminregistrationService {

  baseUrl="http://localhost:8088/api/rest";

  constructor(private http:HttpClient) { }

  addNewAdmin(admin: Adminregistration)
  {
      return this.http.post(this.baseUrl+"/admins",admin);
  }

  validlogin(mail:string, password:string)
  {
    return this.http.get(this.baseUrl + "/admins/" + mail + "/" + password)
  }

  validloginid(mail:string)
  {
    return this.http.get(this.baseUrl + "/admins/" + mail + "/validation")
  }

}
