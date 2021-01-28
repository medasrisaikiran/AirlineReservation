import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';
import { FlightDetails } from '../flight-details';

@Component({
  selector: 'app-delete-flight',
  templateUrl: './delete-flight.component.html',
  styleUrls: ['./delete-flight.component.css']
})
export class DeleteFlightComponent implements OnInit {

  flightnumber:number=0;
  deleteFlight(f:FlightDetails)
  {
    this.a.deleteFlight(f);
  }
  constructor(private a:AirlineService) { }

  ngOnInit(): void {
  }

}
