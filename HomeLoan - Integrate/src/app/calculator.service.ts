import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  baseUrl : String = 'http://localhost:8087/tracker/'

  constructor(private myhttp: HttpClient) { }

  geteligiblecalc(monthlyincome:any)
  {
    
    return this.myhttp.post(this.baseUrl+"calculator/EligibilityCalculator",{"monthlyincome" : monthlyincome});
  }

  getemicalc(loanamount:any,loantenure:any,rateofinterest:any)
  {
    
    return this.myhttp.post(this.baseUrl+"calculator/EmiCalculator",{"loanamount":loanamount,"loantenure" : loantenure,"rateofinterest":rateofinterest});
  }


}