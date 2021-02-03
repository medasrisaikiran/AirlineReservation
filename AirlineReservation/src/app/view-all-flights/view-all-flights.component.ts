import { Component, OnInit } from '@angular/core';
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
  searchfor:string;
  sortby:string="flightid";
  sortFlights(){
    if(this.sortby==='flightid')
    {
      this.als.findAllFlights().subscribe((data:FlightDetails[])=>{
        this.flights=data;},
        (err)=>{
          console.log(err);
        })
    }
    else if(this.sortby==='source')
    {
      this.als.sortFlightsBySource().subscribe((data:FlightDetails[])=>{
        this.flights=data;},
        (err)=>{
          console.log(err);
        })
    }
    else
    {
      this.als.sortFlightsByDestination().subscribe((data:FlightDetails[])=>{
        this.flights=data;},
        (err)=>{
          this.flights.length=0;
        })
    }
  }
  viewFlights()
  {
    if(this.searchfor.length!=0){
      this.als.findFlightsById(parseInt(this.searchfor)).subscribe((data:FlightDetails)=>{
      this.flights[0]=data;  
      this.flights.length=1;
      },
        (err)=>{
          console.log(err);
        })
    }
    else{
      this.ngOnInit();
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
