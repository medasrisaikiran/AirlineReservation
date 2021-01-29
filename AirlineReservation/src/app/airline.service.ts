import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs'
import { FlightDetails } from './flight-details';
@Injectable({
  providedIn: 'root'
})
export class AirlineService {

  baseurl:string='http://localhost:8080/';
  constructor(private myhttp:HttpClient) { }
  findAllFlights() :Observable<FlightDetails[]>
  {
    console.log("findall in service");
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"getFlights");
  }
  findFlights(fn:number) :Observable<FlightDetails[]>
  {
    console.log("find in service");
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"getFlights/"+fn);
  }
  addFlight(fd:FlightDetails)
  {
    console.log("add in service class");
    return this.myhttp.post<FlightDetails>(this.baseurl+"addFlight/",fd);
  }
  deleteFlight(id:number)
  {
    console.log("delete in service class");
    return this.myhttp.delete<FlightDetails>(this.baseurl+"deleteFlight/"+id);
  }
  updateFlight(fd:FlightDetails)  
  {
    console.log("update in service");
    return this.myhttp.put<FlightDetails>(this.baseurl+"updateFlight/",fd);
  }
}
