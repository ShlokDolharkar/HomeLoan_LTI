import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Adminregistration } from '../adminregistration';
import { AdminregistrationService } from '../adminregistration.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(private myrouter:Router, private cservice:AdminregistrationService) { }

  ngOnInit(): void {
  }

  e1:String =""
  e2:String =""

  loginid:string=""
  password:string=""

  data1:any
  a = new Adminregistration()

  loginidcheck:any
  admin:any

  async validateLogin()
  {
    console.log("Admin Email "+ this.loginid);
    
      

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
                (data)=>{
                  console.log(data);
                  if(data == true)
                  {
                    this.myrouter.navigate(['dashboard'])
                  }
                //   //alert("Cust Added!")
                //   // localStorage.setItem("custemail", this.admin.adminEmail as string)
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

}
