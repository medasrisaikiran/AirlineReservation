import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SeatSelectComponent } from './seat-select/seat-select.component';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { DeleteFlightComponent } from './delete-flight/delete-flight.component';
import { RegisterComponent } from './register/register.component';
import { FlightSearchComponent } from './flight-search/flight-search.component';
import { FlightSelectComponent } from './flight-select/flight-select.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { ViewAllFlightsComponent } from './view-all-flights/view-all-flights.component';
import {CommonModule} from '@angular/common';
import {HttpClientModule} from '@angular/common/http';
import { UpdateFlightComponent } from './update-flight/update-flight.component';
import {FormsModule} from '@angular/forms';
import { PaymentComponent } from './payment/payment.component';
import { TicketComponent } from './ticket/ticket.component';
import { ErrorComponent } from './error/error.component';
@NgModule({
  declarations: [
    AppComponent,
    SeatSelectComponent,
    AddFlightComponent,
    DeleteFlightComponent,
    RegisterComponent,
    FlightSearchComponent,
    FlightSelectComponent,
    UserloginComponent,
    AdminloginComponent,
    ViewAllFlightsComponent,
    UpdateFlightComponent,
    PaymentComponent,
    TicketComponent,
    ErrorComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
