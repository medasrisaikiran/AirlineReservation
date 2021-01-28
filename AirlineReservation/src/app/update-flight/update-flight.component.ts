import { Time } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';
import { FlightDetails } from '../flight-details';

@Component({
  selector: 'app-update-flight',
  templateUrl: './update-flight.component.html',
  styleUrls: ['./update-flight.component.css']
})
export class UpdateFlightComponent implements OnInit {

  FlightNumber:number;
  Source:string;
  Destination:string;
  Depart:Date;
  Arrive:Date;
  Duration:Time;
  Cabin:string="";
  updateFlight(f:FlightDetails)
  {
    this.a.updateFlights(f);
  }
  constructor(private a:AirlineService) { }

  ngOnInit(): void {
  }

}
