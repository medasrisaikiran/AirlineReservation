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

  flights:FlightDetails[];
  tempflights:FlightDetails[];
  searchfor:string="";
  viewFlights()
  {
    if(this.searchfor.length!=0){
      this.als.findFlights(parseInt(this.searchfor)).subscribe((data:FlightDetails[])=>{
        this.flights=data;},
        (err)=>{
          console.log(err);
        })
    }
    else{
      this.als.findAllFlights().subscribe((data:FlightDetails[])=>{
        this.flights=data;
        this.tempflights=data;},
        (err)=>{
          console.log(err);
        })
    }
  }
  constructor(private als:AirlineService) {}
  ngOnInit(): void {
  this.als.findAllFlights().subscribe((data:FlightDetails[])=>{
    this.flights=data;
    this.tempflights=data;},
    (err)=>{
      console.log(err);
    })
  }
}
