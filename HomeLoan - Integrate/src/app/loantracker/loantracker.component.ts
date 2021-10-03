import { Component, OnInit } from '@angular/core';
import { Loantracker } from '../loantracker';
import { LoantrackerService } from '../loantracker.service';

@Component({
  selector: 'app-loantracker',
  templateUrl: './loantracker.component.html',
  styleUrls: ['./loantracker.component.css']
})
export class LoantrackerComponent implements OnInit {

  loantrack :any;   // Return Object object from backend
  phonenumber:string="";
  loantrackerid:any;
  showerror:boolean=false;    // Converted objectto json for printing

  

  constructor(private ltracker:LoantrackerService) { 
  
  }
   

  ngOnInit(): void {

  }
  trackLoan(loantrackerid:number,phonenumber:string){
    this.loantrack={};
    this.ltracker.getLoan(loantrackerid,phonenumber).subscribe(
      (data)=>{
      
      this.loantrack = data
        console.log(this.loantrack);
        this.showerror=!this.loantrack;
        console.log(this.showerror)
        
    },
    (error)=>{
      console.log(error);
    }
    );
  }
}