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
  Depart:Time;
  Arrive:Time;
  Duration:Time;
  Cabin:string;
  fetch(){
    this.a.findFlightsById(this.FlightNumber).subscribe(  
      (data:FlightDetails)=>{
        this.Destination=data.destination;
        this.Source=data.source;
        this.Depart=data.departureTime;
        this.Cabin=data.cabin;
        this.Duration=data.duration;
        this.Arrive=data.arrivalTime;
        },(err)=>{
          alert("invalid flightid"+err);
          })
  }
  updateFlight(f:FlightDetails)
  {
    let fl=new FlightDetails();
    fl.destination=this.Destination;
    fl.source=this.Source;
    fl.departureTime=this.Depart;
    fl.cabin=this.Cabin;
    fl.duration=this.Duration;
    fl.arrivalTime=this.Arrive;
    this.a.updateFlight(fl).subscribe(data=>{alert("updated successfully")});
  }
  constructor(private a:AirlineService) { }

  ngOnInit(): void {
  }

}
