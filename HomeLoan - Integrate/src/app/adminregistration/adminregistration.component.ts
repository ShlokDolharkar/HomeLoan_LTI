import { Component, OnInit } from '@angular/core';
import { Adminregistration } from '../adminregistration';
import { AdminregistrationService } from '../adminregistration.service';

@Component({
  selector: 'app-adminregistration',
  templateUrl: './adminregistration.component.html',
  styleUrls: ['./adminregistration.component.css']
})
export class AdminregistrationComponent implements OnInit {

  admin:Adminregistration

  GenderOptns = ["Female", "Male", "Other" ]


  addAdmin(RegistrationForm:any)
  {
      console.log(RegistrationForm.value);
      this.admin=RegistrationForm.value;
      console.log(this.admin)
      this.aservice.addNewAdmin(this.admin).subscribe
      (
        (data)=>{
          console.log(data);
          if(data)
            alert("Admin Added!");
        },
        (error)=>{
            console.log(error);
        }
      )

  }



  constructor(private aservice:AdminregistrationService) {

    this.admin = new Adminregistration();
   }

  ngOnInit(): void {
  }

}
