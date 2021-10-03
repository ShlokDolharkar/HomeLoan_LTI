import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  goToCustReg()
  {
    this.myrouter.navigate(['customerregistration'])
  }

  goToAdminLogin()
  {
    this.myrouter.navigate(['adminlogin'])
  }

  goToRegDetails()
  {
    this.myrouter.navigate(['showregistrationdetails'])
  }

  goToLogin()
  {
    this.myrouter.navigate(['login'])
  }

  goToCustomerLogin()
  {
    this.myrouter.navigate(['customerlogin'])
  }
  
  
  constructor(private myrouter:Router) { }

  ngOnInit(): void {
  }

}
