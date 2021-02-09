import { formatDate, Time } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';
import { FlightDetails } from '../flight-details';
import {DatePipe} from '@angular/common';
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
  Duration:Date;
  Cabin:string;
  fetch(){
    this.a.findFlightsById(this.FlightNumber).subscribe(  
      (data:FlightDetails)=>{
        if(data!=null){
          this.Destination=data.destination;
          this.Source=data.source;
          this.Cabin=data.cabin;
        }
        else{
          alert("invalid flightid")
        }
      });
    }
  updateFlight(f:FlightDetails)
  {
    let d=new FlightDetails();
    d.capacity=54;
    d.flightid=this.FlightNumber;
    d.cabin=this.Cabin;
    d.destination=this.Destination;
    d.source=this.Source;
    let arrd=new Date();
    let arrive=this.Arrive.toString();
    arrd.setHours(parseInt(arrive.split(':')[0])+5,parseInt(arrive.split(':')[1])+30,0) 
    console.log("arrd"+arrd);
    d.arrivalTime=arrd;
    let depd=new Date();
    let depart=this.Depart.toString();
    depd.setHours(parseInt(depart.split(':')[0])+5,parseInt(depart.split(':')[1])+30,0) 
    console.log("depd"+depd);
    d.departureTime=depd;
    let date=new Date();
    date.setHours(arrd.getHours()-depd.getHours()+5,arrd.getMinutes()-depd.getMinutes()+30,0);
    console.log("duration"+date);
    d.duration=date;
    d.businessClassPrice=30000;
    d.economyClassPrice=20000;
    if(this.Arrive>this.Depart){
      this.a.updateFlight(d).subscribe((data:FlightDetails)=>{alert("updated successsfully");},
    (err)=>{alert("failure");});
    }
    else{
      alert("arrival time > departure time");
    }
  }
  constructor(private a:AirlineService) { }

  ngOnInit(): void {
  }

}
