import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private myrouter:Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
  }

  goToAdminLogin()
  {
    this.myrouter.navigate(['adminlogin'], {relativeTo:this.route})
  }

  goToHome()
  {
    this.myrouter.navigate(['home'])
  }

  goToCustomerLogin()
  {
    this.myrouter.navigate(['customerlogin'], {relativeTo:this.route})
  }

}
