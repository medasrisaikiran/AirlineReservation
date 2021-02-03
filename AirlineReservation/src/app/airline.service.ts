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
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"getAllFlights");
  }
  findFlightsById(fn:number) :Observable<FlightDetails>
  {
    console.log("find in service");
    return this.myhttp.get<FlightDetails>(this.baseurl+"getFlightsById/"+fn);
  }
  sortFlightsBySource() :Observable<FlightDetails[]>
  {
    console.log("find in service");
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"sortflightsBySrc/");
  }
  sortFlightsByDestination() :Observable<FlightDetails[]>
  {
    console.log("find in service");
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"sortflightsByDest/");
  }
  addFlight(fd:FlightDetails)
  {
    console.log("add in service class");
    return this.myhttp.post<FlightDetails>(this.baseurl+"addflight/",fd);
  }
  deleteFlight(id:number)
  {
    console.log("delete in service class");
    return this.myhttp.delete<FlightDetails>(this.baseurl+"deleteflight/"+id);
  }
  updateFlight(fd:FlightDetails)  
  {
    console.log("update in service");
    return this.myhttp.put<FlightDetails>(this.baseurl+"updateflight/",fd);
  }
}
