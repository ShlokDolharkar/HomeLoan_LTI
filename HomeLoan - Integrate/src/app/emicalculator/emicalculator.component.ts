import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { CalculatorService } from '../calculator.service';
import { Options, LabelType } from '@angular-slider/ngx-slider'; 

@Component({
  selector: 'app-emicalculator',
  templateUrl: './emicalculator.component.html',
  styleUrls: ['./emicalculator.component.css']
})
export class EmicalculatorComponent implements OnInit {

  constructor(private calservice:CalculatorService) { 
  
  }


  ngOnInit(): void {
  }

  emicalc:any;
  loanamount:any;
  loantenure:any="";
  rateofinterest:any=8.5;
  totalinterestpayable:any;
  totalpayment:any;

  roptions: Options = {
    floor: 1,
    ceil: 20,
    step:0.5,
    translate: (value: number, label: LabelType): string => {
      switch (label) {
        case LabelType.Low:
          return value + '<b>%</b>';
        case LabelType.High:
          return value + '<b>%</b>';
        default:
          return value + '<b>%</b>';
      }
    }
  };

  yoptions: Options = {
    floor:1,
    ceil: 30,
    translate: (value: number, label: LabelType): string => {
      switch (label) {
        case LabelType.Low:
          return value + '<b>Year</b>';
        case LabelType.High:
          return value + '<b>Year</b>';
        default:
          return  value + '<b>Year</b>';
      }
    }
  };

  public test=0;

  calcemi(loanamount:any,loantenure:any,rateofinterest:any){
    this.calservice.getemicalc(loanamount,loantenure,rateofinterest).subscribe(
      (data)=>{
      
      this.emicalc = data
        console.log(this.emicalc);

        this.totalpayment=((this.loantenure*12)*this.emicalc);
        console.log(this.totalpayment);
        this.totalinterestpayable=this.totalpayment-this.loanamount;
        console.log(this.totalinterestpayable);
        
    },
    (error)=>{
      console.log(error);
    }
    );
  }


}