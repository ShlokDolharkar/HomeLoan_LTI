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

  customerEmail: string=""

  validateRegistration(RegistrationFormValue:any)
  { 
    localStorage.setItem("custemail", RegistrationFormValue.customerEmail as string)

    this.cservice.validloginid(RegistrationFormValue.customerEmail).subscribe
      (
        (data)=>{
          console.log(data);
          if(data == true)
          {
            //alert("Cust Added!")
           // localStorage.setItem("custemail", this.customer.CustomerEmail as string)
            alert("Customer email already exists!")
            this.myrouter.navigate(['customerlogin'])
          } 
        },
        (error)=>{
            console.log(error);
        }
      )

    if(RegistrationFormValue.customerPassword !== RegistrationFormValue.customerConfirmPassword)
      {
        console.log(RegistrationFormValue.customerPassword);
        this.e1 = "Passwords donot match"
        this.errorresult = false
      }
    else
      {
        console.log(RegistrationFormValue.customerPassword);
        console.log(RegistrationFormValue.customerConfirmPassword)
        this.errorresult = true
        this.e1= ""
      }

      
  }

  addCustomer(registrationForm:any)
  { 
    console.log(registrationForm.value.customerEmail);
    this.cservice.validloginid(registrationForm.value.customerEmail).subscribe
      (
        (data)=>{
          console.log(data);
          if(data == true)
          {
            //alert("Cust Added!")
           // localStorage.setItem("custemail", this.customer.CustomerEmail as string)
            alert("Customer email already exists!")
            this.myrouter.navigate(['customerlogin'])
          }
          else
          {
            if(this.errorresult == true)
            {
              console.log(this.errorresult)
      
              this.customer=registrationForm.value;
              console.log(this.customer)
              this.cservice.addNewCustomer(this.customer).subscribe
              (
                (data)=>{
                  console.log(data);
                  if(data)
                  {
                    //alert("Cust Added!")
                    // localStorage.setItem("custemail", this.customer.CustomerEmail as string)
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
        },
        (error)=>{
            console.log(error);
        }
      )
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
