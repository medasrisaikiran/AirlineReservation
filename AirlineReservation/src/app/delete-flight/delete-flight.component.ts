import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';
import { FlightDetails } from '../flight-details';

@Component({
  selector: 'app-delete-flight',
  templateUrl: './delete-flight.component.html',
  styleUrls: ['./delete-flight.component.css']
})
export class DeleteFlightComponent implements OnInit {

  FlightNumber:number;
  deleteFlight()
  {
    this.a.deleteFlight(this.FlightNumber).subscribe(data=>{
      alert("deleted successfully");
      },
      (err)=>{alert("fightid is invalid")});
  }
  constructor(private a:AirlineService) { }

  ngOnInit(): void {
  }
}
