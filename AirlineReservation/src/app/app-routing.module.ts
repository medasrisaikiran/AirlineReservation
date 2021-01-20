import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { DeleteFlightComponent } from './delete-flight/delete-flight.component';
import { FlightSearchComponent } from './flight-search/flight-search.component';
import { FlightSelectComponent } from './flight-select/flight-select.component';
import { RegisterComponent } from './register/register.component';
import {SeatSelectComponent} from './seat-select/seat-select.component';
import { UserloginComponent } from './userlogin/userlogin.component';

const routes: Routes = [
  {path:'userlogin',component:UserloginComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'register',component:RegisterComponent},
  {path:'flightsearch',component:FlightSearchComponent},
  {path:'flightselect',component:FlightSelectComponent},
  {path:'seatselect',component:SeatSelectComponent},
  {path:'addflight',component:AddFlightComponent},
  {path:'deleteflight',component:DeleteFlightComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
