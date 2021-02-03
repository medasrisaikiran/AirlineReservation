import { Time } from '@angular/common';
import { Component, OnInit, ɵɵpureFunction1 } from '@angular/core';
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
  Depart:Time;
  Arrive:Time;
  Duration:Time;
  Cabin:string;
  addFlight()
  {
    let d=new FlightDetails();
    d.capacity=54;
    d.cabin=this.Cabin;
    d.destination=this.Destination;
    d.source=this.Source;
    d.arrivalTime=this.Arrive;
    d.departureTime=this.Depart;
    d.duration=this.Duration;


    this.als.addFlight(d).subscribe(data=>{alert("added successsfully");});
  }
  constructor(private als:AirlineService) {}

  ngOnInit(): void {

  }
}
