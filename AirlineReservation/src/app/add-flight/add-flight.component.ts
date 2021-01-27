import { Time } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';
@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent implements OnInit {

  FlightNumber:number;
  FlightName:string;
  Source:string;
  Destination:string;
  Depart:Date;
  Arrive:Date;
  Duration:Time;
  Cabin:string="";
  addFlight(){
    this.as.addFlight(f);
  }
  constructor(private als:AirlineService,private as:AirlineService) {}

  ngOnInit(): void {

  }
}
