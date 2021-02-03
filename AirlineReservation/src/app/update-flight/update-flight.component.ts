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
      (data)=>{
        this.Destination=data[0].destination;
        this.Source=data[0].source;
        this.Depart=data[0].departureTime;
        this.Cabin=data[0].cabin;
        this.Duration=data[0].duration;
        this.Arrive=data[0].arrivalTime;
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
