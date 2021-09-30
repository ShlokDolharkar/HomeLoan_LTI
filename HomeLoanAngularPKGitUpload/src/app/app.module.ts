import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewvehicleComponent } from './newvehicle/newvehicle.component';
import { SearchComponent } from './search/search.component';
import { ShowallComponent } from './showall/showall.component';
import { UpdatevehicleComponent } from './updatevehicle/updatevehicle.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { CustomerregistrationComponent } from './customerregistration/customerregistration.component';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { ShowregistrationdetailsComponent } from './showregistrationdetails/showregistrationdetails.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    NewvehicleComponent,
    SearchComponent,
    ShowallComponent,
    UpdatevehicleComponent,
    CustomerregistrationComponent,
    AdminregistrationComponent,
    ShowregistrationdetailsComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserModule, ReactiveFormsModule

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
