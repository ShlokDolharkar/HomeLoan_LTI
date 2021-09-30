import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerRegistrationService } from '../customer-registration.service';
import { Customerregistration } from '../customerregistration';

@Component({
  selector: 'app-customerregistration',
  templateUrl: './customerregistration.component.html',
  styleUrls: ['./customerregistration.component.css']
})
export class CustomerregistrationComponent implements OnInit {
  
  customer:Customerregistration
  e1:String = ""
  errorresult:boolean =true;
  GenderOptns = ["Female", "Male", "Other" ]

  CustomerConfirmPassword: string = ""

  validateRegistration(RegistrationFormValue:any)
  {

    if(RegistrationFormValue.customerPassword !== RegistrationFormValue.customerConfirmPassword)
      {
        console.log(RegistrationFormValue.customerPassword);
        console.log(RegistrationFormValue.customerConfirmPassword)
        
        this.e1 = "Passwords donot match"
        this.errorresult = false
      }
    else
      {
        console.log(RegistrationFormValue.customerPassword);
        console.log(RegistrationFormValue.customerConfirmPassword)
      }

      
  }

  addCustomer(RegistrationForm:any)
  {
    if(this.errorresult == true)
    {
      console.log(this.errorresult)
      console.log(RegistrationForm.value);
      this.customer=RegistrationForm.value;
      console.log(this.customer)
      this.cservice.addNewCustomer(this.customer).subscribe
      (
        (data)=>{
          console.log(data);
          if(data)
          {
            alert("Customer Added!");
            this.myrouter.navigate(['showregistrationdetails'])
          } 
        },
        (error)=>{
            console.log(error);
        }
      )
    }
    else
    {
      alert("Invalid Registrations Details")
    }

  }

  gotodetails()
  {
    this.myrouter.navigate(['showregistrationdetails']);
  }

    cust: Array<Customerregistration> = []
  // addCustomer(RegistrationForm:any)
  // {
  //   this.cust.push(RegistrationForm)
  //   console.log(this.cust)
  // }


  constructor(private cservice:CustomerRegistrationService, private myrouter:Router) {

    this.customer = new Customerregistration();
   }

  ngOnInit(): void {
  }


  

}
