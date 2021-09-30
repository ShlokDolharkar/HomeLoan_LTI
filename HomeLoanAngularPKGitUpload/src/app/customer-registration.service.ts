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
}
