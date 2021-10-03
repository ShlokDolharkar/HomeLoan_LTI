import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerRegistrationService } from '../customer-registration.service';
import { Customerregistration } from '../customerregistration';
import { CustomerregistrationComponent } from '../customerregistration/customerregistration.component';

@Component({
  selector: 'app-showregistrationdetails',
  templateUrl: './showregistrationdetails.component.html',
  styleUrls: ['./showregistrationdetails.component.css']
})
export class ShowregistrationdetailsComponent implements OnInit {

  customer: any
  customermail:any
  customer2 = new Customerregistration()

  constructor(private activeRoute:ActivatedRoute, private cservice:CustomerRegistrationService, private myrouter:Router) {

  

   }

  ngOnInit(): void {

//     this.activeRoute.paramMap.subscribe(
//       params=> {
//           this.customermail=params.get("customerEmail") as string;
//           console.log(this.customermail);
//       }     
// )

    this.customermail = localStorage.getItem("custemail")
    console.log(this.customermail)
      this.cservice.searchCustomerByMail(this.customermail).subscribe
      (
        (data)=>{
            console.log(data);
            this.customer=data;
            console.log(this.customer);
            console.log(this.customer.customerId)
        }
      )
    
  }

  goToLogin()
  {
    this.myrouter.navigate(['customerlogin', this.customer.customerId])
  }

}
