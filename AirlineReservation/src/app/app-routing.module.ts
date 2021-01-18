import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FlightSearchComponent } from './flight-search/flight-search.component';
import { FlightSelectComponent } from './flight-select/flight-select.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import {SeatSelectComponent} from './seat-select/seat-select.component';

const routes: Routes = [
  {path:'seatselect',component:SeatSelectComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'flightsearch',component:FlightSearchComponent},
  {path:'flightselect',component:FlightSelectComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
