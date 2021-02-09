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
import {ViewAllFlightsComponent} from './view-all-flights/view-all-flights.component';
import {UpdateFlightComponent} from './update-flight/update-flight.component';
import {PaymentComponent} from './payment/payment.component';
import { AppComponent } from './app.component';
import { ErrorComponent } from './error/error.component';
import { TicketComponent } from './ticket/ticket.component';
import { AboutusComponent } from './aboutus/aboutus.component';

const routes: Routes = [
  {path:'',component:AppComponent},
  {path:'userlogin',component:UserloginComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'register',component:RegisterComponent},
  {path:'flightsearch',component:FlightSearchComponent},
  {path:'flightselect',component:FlightSelectComponent},
  {path:'seatselect',component:SeatSelectComponent},
  {path:'addflight',component:AddFlightComponent},
  {path:'deleteflight',component:DeleteFlightComponent},
  {path:'viewflights',component:ViewAllFlightsComponent},
  {path:'updateflight',component:UpdateFlightComponent},
  {path:'payment',component:PaymentComponent},
  {path:'aboutus',component:AboutusComponent},
  {path:'tickets',component:TicketComponent},
  {path:'**',component:ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
