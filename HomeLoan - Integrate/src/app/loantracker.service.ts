import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';



@Injectable({
  providedIn: 'root'
})
export class LoantrackerService {

  baseUrl : String = 'http://localhost:8087/tracker/'

  constructor(private myhttp: HttpClient) { }

 

getLoan(loantrackerid:number,phonenumber:string){
    return this.myhttp.get(this.baseUrl+"getLoan/"+loantrackerid+"/"+phonenumber);

}
}