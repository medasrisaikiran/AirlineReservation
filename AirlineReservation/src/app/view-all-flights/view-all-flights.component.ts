import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { FlightDetails } from '../flight-details';
import {AirlineService} from './../airline.service';
@Component({
  selector: 'app-view-all-flights',
  templateUrl: './view-all-flights.component.html',
  styleUrls: ['./view-all-flights.component.css']
})
export class ViewAllFlightsComponent implements OnInit {

  private subscription:Subscription;
  flights:FlightDetails[];
  tempflights:FlightDetails[];
  constructor(private als:AirlineService) {}

  ngOnInit(): void {
  this.subscription=this.als.findAllFlights().subscribe((data:FlightDetails[])=>{
    this.flights=data;
    this.tempflights=data;},
    (err)=>{
      console.log(err);
    })
  }

}
