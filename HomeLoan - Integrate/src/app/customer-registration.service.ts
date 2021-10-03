import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customerregistration } from './customerregistration';

@Injectable({
  providedIn: 'root'
})
export class CustomerRegistrationService {

  baseUrl="http://localhost:8088/api/rest";

  constructor(private http:HttpClient) { }

  addNewCustomer(customer: Customerregistration)
  {
      return this.http.post(this.baseUrl+"/customers",customer);
  }

  searchCustomerByMail(Mail:string) //FETCH BY NO
  {
      return this.http.get(this.baseUrl+"/customers/"+ Mail);
  }

  searchCustomerById(Id:any) //FETCH BY NO
  {
      return this.http.get(this.baseUrl+"/customers/login/"+ Id);
  }

  validlogin(mail:string, password:string)
  {
    return this.http.get(this.baseUrl + "/customers/" + mail + "/" + password)
  }

  validloginid(mail:string)
  {
    return this.http.get(this.baseUrl + "/customers/" + mail + "/validation")
  }
}
