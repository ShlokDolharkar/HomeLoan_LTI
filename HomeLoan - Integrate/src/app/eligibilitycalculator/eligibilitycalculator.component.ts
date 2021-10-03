import { Component, OnInit } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-eligibilitycalculator',
  templateUrl: './eligibilitycalculator.component.html',
  styleUrls: ['./eligibilitycalculator.component.css']
})
export class EligibilitycalculatorComponent implements OnInit {

  constructor(private calservice:CalculatorService) { }

  ngOnInit(): void {
  }

  eligibilitycalc:any;
  monthlyincome:number=0;
  public test=0;
 

   calceligible(monthlyincome:any){
    this.calservice.geteligiblecalc(monthlyincome).subscribe(
      (data)=>{
      
      this.eligibilitycalc = data
        console.log(this.eligibilitycalc);
    },
    (error)=>{
      console.log(error);
    }
    );
  }
}