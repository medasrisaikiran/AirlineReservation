import { DatePipe, Time } from '@angular/common';
import { Component, OnInit} from '@angular/core';
import { AirlineService } from '../airline.service';
import { FlightDetails } from '../flight-details';
@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent implements OnInit {

  Source:string;
  Destination:string;
  Depart:Date;
  Arrive:Date;
  Duration:Date;
  Cabin:string;
  user=localStorage.getItem("user");
  
  constructor(private als:AirlineService) {}

  ngOnInit(): void {
  }
  addFlight()
  {
    let d=new FlightDetails();
    d.capacity=54;
    d.cabin=this.Cabin;
    d.destination=this.Destination;
    d.source=this.Source;
    let arrd=new Date();
    let arrive=this.Arrive.toString();
    arrd.setHours(parseInt(arrive.split(':')[0]),parseInt(arrive.split(':')[1])) 
    console.log("arrd"+arrd);
    d.arrivalTime=arrd;
    let depd=new Date();
    let depart=this.Depart.toString();
    depd.setHours(parseInt(depart.split(':')[0]),parseInt(depart.split(':')[1])) 
    console.log("depd"+depd);
    d.departureTime=depd;
    let date=new Date();
    date.setHours(arrd.getHours()-depd.getHours()+5,arrd.getMinutes()-depd.getMinutes()+30,0);
    console.log("duration"+date);
    d.duration=date;
    d.businessClassPrice=30000;
    d.economyClassPrice=20000;
    if(this.Arrive>this.Depart){
      this.als.addFlight(d).subscribe((data:FlightDetails)=>{alert("added successsfully");},
    (err)=>{alert("failure");});
    }
    else{
      alert("arrival time <= departure time");
    }
  }
}
