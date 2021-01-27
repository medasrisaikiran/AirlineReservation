import { Time } from '@angular/common';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update-flight',
  templateUrl: './update-flight.component.html',
  styleUrls: ['./update-flight.component.css']
})
export class UpdateFlightComponent implements OnInit {

  FlightNumber:number;
  FlightName:string;
  Source:string;
  Destination:string;
  Depart:Date;
  Arrive:Date;
  Duration:Time;
  Cabin:string="";
  constructor() { }

  ngOnInit(): void {
  }

}
