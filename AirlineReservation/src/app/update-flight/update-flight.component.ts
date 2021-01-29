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
  FlightName:string;
  Destination:string;
  Depart:Date;
  Arrive:Date;
  Duration:Time;
  Cabin:string;
  fetch(){
    this.a.findFlights(this.FlightNumber).subscribe(  
      (data)=>{
        this.Destination=data[0].destinationName;
        this.Source=data[0].sourceName;
        this.FlightName=data[0].flightName;
        },(err)=>{
          alert("invalid flightid"+err);
          })
  }
  updateFlight(f:FlightDetails)
  {
    let fl=new FlightDetails();
    fl.setDestinationName(this.Destination);
    fl.setFlightName(this.FlightName);
    fl.setSourceName(this.Source);
    fl.setFlightNumber(this.FlightNumber);
    this.a.updateFlight(fl).subscribe(data=>{alert("updated successfully")});
  }
  constructor(private a:AirlineService) { }

  ngOnInit(): void {
  }

}
