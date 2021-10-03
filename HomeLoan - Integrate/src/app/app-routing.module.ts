import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminloginhomeComponent } from './adminloginhome/adminloginhome.component';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { AllapplicationsComponent } from './allapplications/allapplications.component';
import { ApprovedapplicationsComponent } from './approvedapplications/approvedapplications.component';
import { AppviewComponent } from './appview/appview.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { CustomerregistrationComponent } from './customerregistration/customerregistration.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EligibilitycalculatorComponent } from './eligibilitycalculator/eligibilitycalculator.component';
import { EmicalculatorComponent } from './emicalculator/emicalculator.component';
import { HomeComponent } from './home/home.component';
import { LoantrackerComponent } from './loantracker/loantracker.component';
import { LoginComponent } from './login/login.component';
import { LoginhomeComponent } from './loginhome/loginhome.component';
import { ShowregistrationdetailsComponent } from './showregistrationdetails/showregistrationdetails.component';
import { ViewapplicationComponent } from './viewapplication/viewapplication.component';

const routes: Routes = [
  {path:'' ,component:HomeComponent},
  {path:'customerregistration' ,component:CustomerregistrationComponent},
  {path:'adminregistration' ,component:AdminregistrationComponent},
  {path:'showregistrationdetails' ,component:ShowregistrationdetailsComponent},
  {path:'aboutus' ,component:AboutusComponent},
  {path:'customerlogin' ,component:CustomerloginComponent},
  {path:'adminlogin' ,component:AdminloginComponent},
  {path:'loginhome' ,component:LoginhomeComponent},
  {path:'loginhome/:loginid' ,component:LoginhomeComponent},
  {path:'login' ,component:LoginComponent},
  {path:'home' ,component:HomeComponent},
  {path:'login' ,component:LoginComponent,
    children: [{path:'customerlogin' ,component:CustomerloginComponent},{path:'adminlogin' ,component:AdminloginComponent} ]},


  // Priyanka components -------------------------------------------------------- 

  {path:'dashboard',component:DashboardComponent,
      children:[{path:'viewapplication',component:ViewapplicationComponent},{path:'allapplications',component:AllapplicationsComponent}, {path:'approvedapplications',component:ApprovedapplicationsComponent}]},
  {path:'viewapplication',component:ViewapplicationComponent},
  {path:'appview/:id',component:AppviewComponent},
  {path:'allapplications',component:AllapplicationsComponent},
  {path:'approvedapplications',component:ApprovedapplicationsComponent},
  
  // Priyanka components -------------------------------------------------------- 
  
  // --------------------------------------------------------  
  // Sunny components

  {path:'tracker/getloandetails',component:LoantrackerComponent},  
 
    {path: 'calculator', component: CalculatorComponent,
        children: [
          { path: 'EligibilityCalculator1', component: EligibilitycalculatorComponent },
          { path: 'EmiCalculator1', component: EmicalculatorComponent }
      ]
    },
  
  // -------------------------------------------------------- 

 // {path:'showregistrationdetails/:customerEmail' ,component:ShowregistrationdetailsComponent}
  

  // {path:'showall' ,component:ShowallComponent},
  // {path:'search',component:SearchComponent},
  // {path:'updatevehicle/:vehicleNo',component:UpdatevehicleComponent} //Step 1
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
