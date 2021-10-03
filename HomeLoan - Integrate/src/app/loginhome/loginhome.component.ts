import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginhome',
  templateUrl: './loginhome.component.html',
  styleUrls: ['./loginhome.component.css']
})
export class LoginhomeComponent implements OnInit {

  goToCustReg()
  {
    this.myrouter.navigate(['customerregistration'])
  }

  goToHome()
  {
    this.myrouter.navigate(['home'])
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
