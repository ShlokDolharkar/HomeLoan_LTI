import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerRegistrationService } from '../customer-registration.service';
import { Customerregistration } from '../customerregistration';

@Component({
  selector: 'app-customerlogin',
  templateUrl: './customerlogin.component.html',
  styleUrls: ['./customerlogin.component.css']
})
export class CustomerloginComponent implements OnInit {

  constructor(private myrouter:Router, private cservice:CustomerRegistrationService) { }

  ngOnInit(): void {

    

  }

  e1:String =""
  e2:String =""

  loginid:any
  password:string=""

  data1:any
  a = new Customerregistration()

  loginidcheck:any
  customer:any

  doSomeLogic()
  {
    this.myrouter.navigate(['customerregistration'])
  }

  async validateLogin()
  {
    console.log("Customer Email "+ this.loginid);

    // let data = await this.cservice.searchCustomerByMail(this.loginid).toPromise();
    
    // this.cservice.searchCustomerByMail(this.loginid).toPromise().then(data => {
    //   this.customer = data;
    //   console.log('Promise resolved.')
    //   console.log(this.customer)
    // });
    // this.customer = data
    // console.log(this.customer)
    
      

    this.cservice.validloginid(this.loginid).subscribe
    (
      
      (data)=>{
        console.log(data);
        if(data == false)
        {
          //alert("Login ID doesn't exist")
          this.e1="Login ID doesn't exist"
          this.e2=""
        }
          
          else
            {
              this.cservice.validlogin(this.loginid, this.password).subscribe
              (
                async (data)=>{
                  console.log(data);
                  if(data == true)
                  {
                    // let data = await this.cservice.searchCustomerById(this.loginid).toPromise();
                    // this.customer=data;
                    // console.log(data);
                    // console.log(this.customer);
                    //     console.log(this.customer.customerId);
                    this.cservice.searchCustomerById(this.loginid).subscribe
                    (
                      (data)=>{
                        console.log(data);
                        this.customer=data;
                        console.log(this.customer);
                        this.myrouter.navigate(['loginhome', this.loginid])
                          },
                      (error)=>{
                        console.log(error);
                      }
                    )
                      
                  }
                //   //alert("Cust Added!")
                //   // localStorage.setItem("custemail", this.customer.CustomerEmail as string)
                //     this.myrouter.navigate(['showregistrationdetails'])
                // } 
                  else
                  {
                    this.e2="Wrong Password"
                    this.e1=""
                    //alert("Invalid Password")
                  }
              },
              (error)=>{
                console.log(error);
              }
              )
            }
          },
          (error)=>{
            console.log(error);
        }
      )
    }
            
    //      // localStorage.setItem("loginidcheck", this.customer.customerEmail)
    //      console.log(this.customer) 
    //      console.log(this.customer.customerEmail)

         
    //   }
    //         };
    //      // localStorage.setItem("loginidcheck", this.customer.customerEmail)
    //      console.log(this.customer) 
    //      console.log(this.customer.customerEmail)

         
    //   },
    //   (error)=>
    //   {
    //     console.log(error);
    //   }
    // )

      //this.loginidcheck = localStorage.getItem("loginidcheck")
      // console.log(this.loginidcheck)
    // this.myrouter.navigate(['loginhome'])
}


