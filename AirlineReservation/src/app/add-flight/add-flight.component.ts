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

  FlightName:string;
  Source:string;
  Destination:string;
  Depart:Date;
  Arrive:Date;
  Duration:Time;
  Cabin:string="";
  addFlight(f:any)
  {
    let d=new FlightDetails();
    d.setFlightName(this.FlightName);
    d.setSourceName(this.Source);
    d.setDestinationName(this.Destination);
    this.als.addFlight(d).subscribe(data=>{alert("added successsfully");});
  }
  constructor(private als:AirlineService) {}

  ngOnInit(): void {

  }
}
