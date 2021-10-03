import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { ReactiveFormsModule } from '@angular/forms';
import { NgxSliderModule } from '@angular-slider/ngx-slider';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
// import {  }; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { CustomerregistrationComponent } from './customerregistration/customerregistration.component';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { ShowregistrationdetailsComponent } from './showregistrationdetails/showregistrationdetails.component';
import { HomeComponent } from './home/home.component';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { LoginhomeComponent } from './loginhome/loginhome.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminloginhomeComponent } from './adminloginhome/adminloginhome.component';
import { LoginComponent } from './login/login.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { LoantrackerComponent } from './loantracker/loantracker.component';
import { EmicalculatorComponent } from './emicalculator/emicalculator.component';
import { EligibilitycalculatorComponent } from './eligibilitycalculator/eligibilitycalculator.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { AllapplicationsComponent } from './allapplications/allapplications.component';
import { ViewapplicationComponent } from './viewapplication/viewapplication.component';
import { ApprovedapplicationsComponent } from './approvedapplications/approvedapplications.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AppviewComponent } from './appview/appview.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomerregistrationComponent,
    AdminregistrationComponent,
    ShowregistrationdetailsComponent,
    HomeComponent,
    CustomerloginComponent,
    LoginhomeComponent,
    AdminloginComponent,
    AdminloginhomeComponent,
    LoginComponent,
    AboutusComponent,
    LoantrackerComponent,
    EmicalculatorComponent,
    EligibilitycalculatorComponent,
    CalculatorComponent,
    AllapplicationsComponent,
    ViewapplicationComponent,
    ApprovedapplicationsComponent,
    DashboardComponent,
    AppviewComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserModule, ReactiveFormsModule,
    NgxSliderModule,
    NgbModule

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
