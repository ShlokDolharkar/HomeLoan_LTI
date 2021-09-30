import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { CustomerregistrationComponent } from './customerregistration/customerregistration.component';
import { HomeComponent } from './home/home.component';
import { NewvehicleComponent } from './newvehicle/newvehicle.component';
import { SearchComponent } from './search/search.component';
import { ShowallComponent } from './showall/showall.component';
import { ShowregistrationdetailsComponent } from './showregistrationdetails/showregistrationdetails.component';
import { UpdatevehicleComponent } from './updatevehicle/updatevehicle.component';

const routes: Routes = [
  {path:'' ,component:HomeComponent},
  {path:'customerregistration' ,component:CustomerregistrationComponent},
  {path:'adminregistration' ,component:AdminregistrationComponent},
  {path:'showregistrationdetails' ,component:CustomerregistrationComponent},
  {path:'home/adminregistration' ,component:AdminregistrationComponent},
  {path:'customerregistration/showregistrationdetails' ,component:ShowregistrationdetailsComponent}

  // {path:'showall' ,component:ShowallComponent},
  // {path:'search',component:SearchComponent},
  // {path:'updatevehicle/:vehicleNo',component:UpdatevehicleComponent} //Step 1
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
