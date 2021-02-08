import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlineService } from '../airline.service';
import { FlightBySrcAndDestDto } from '../flight-by-src-and-dest-dto';
import { FlightDetails } from '../flight-details';

@Component({
  selector: 'app-flight-select',
  templateUrl: './flight-select.component.html',
  styleUrls: ['./flight-select.component.css']
})
export class FlightSelectComponent implements OnInit {


  flights:FlightDetails[];
  constructor(private a:AirlineService,private router:Router) {
   }
   getFlights(){
     let source=localStorage.getItem("source");
     let destination=localStorage.getItem("destination");
     let f=new FlightBySrcAndDestDto();
     f.source=source;
    f.destination=destination;
    this.a.getFlightsBySrcDest(f).subscribe(data=>{
    console.log(data);
    this.flights=data;
    });    
   }
   type:string="";
   classprice:string;
   assign(s:string){
     if(s=="economy")
    this.type="economy";
    else
    this.type="business";
   }
   booknow(flight:FlightDetails){
     if(localStorage.getItem("user"))
     {
      if(this.type=="")
      {
        alert("please select a class!")
      }
      else
      {
        localStorage.setItem("class",this.type);
        if(this.type=="economy")
        {
          localStorage.setItem("classprice",flight.economyClassPrice.toString())
          this.classprice=flight.economyClassPrice.toString();
        }
        else{
          localStorage.setItem("classprice",flight.businessClassPrice.toString())
          this.classprice=flight.businessClassPrice.toString();  
        }
        localStorage.setItem("flightid",flight.flightid.toString());
        localStorage.setItem("source",flight.source.toString());
        localStorage.setItem("destination",flight.destination.toString());
        localStorage.setItem("arrivaltime",flight.arrivalTime.toString());
        localStorage.setItem("departuretime",flight.departureTime.toString());
        localStorage.setItem("price",this.classprice.toString());
        localStorage.setItem("type",this.type);
        this.router.navigate(['seatselect'])
      }  
     }
     else{
       alert("u have to login to proceed further...!")
      this.router.navigate(['userlogin'])
     }
       }
  ngOnInit(): void {
    this.getFlights()
    }
  }
