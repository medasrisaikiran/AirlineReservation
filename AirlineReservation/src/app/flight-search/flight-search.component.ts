import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlineService } from '../airline.service';
import { FlightBySrcAndDestDto } from '../flight-by-src-and-dest-dto';
import { FlightDetails } from '../flight-details';

@Component({
  selector: 'app-flight-search',
  templateUrl: './flight-search.component.html',
  styleUrls: ['./flight-search.component.css']
})
export class FlightSearchComponent implements OnInit {

  Source:string;
  Destination:string;
  Departuredate:Date;
  Returndate:Date;
  Passengers:number;
  trip:number;
  flights:FlightDetails[];
  assign(s:string){
    if(s=="oneway")
    {
      this.trip=1;
    }
    else{
      this.trip=2;
    }
  }
  flightsearch(){
    alert("welcome "+this.trip+","+this.Source+","+this.Destination+","+this.Departuredate+","+this.Returndate+","+this.Passengers);
    let f=new FlightBySrcAndDestDto();
    f.source=this.Source;
    f.destination=this.Destination;
    localStorage.setItem("journeytype",this.trip.toString())
    localStorage.setItem("source",this.Source);
    localStorage.setItem("destination",this.Destination)
    localStorage.setItem("noofpassengers",this.Passengers.toString())
    localStorage.setItem("departuredate",this.Departuredate.toString())
    localStorage.setItem("returndate",this.Returndate.toString())
    console.log(f.source+" "+f.destination);
    this.a.getFlightsBySrcDest(f).subscribe(data=>{
    console.log(data);
    this.flights=data;
    });
    this.router.navigate(['flightselect']);
  }
  constructor(private a:AirlineService,private router:Router) { }

  ngOnInit(): void {

  }

}
