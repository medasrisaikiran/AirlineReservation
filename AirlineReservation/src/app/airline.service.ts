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
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"getFlights/");
  }
  addFlight(fd:FlightDetails):Observable<FlightDetails>
  {
    return this.myhttp.post<FlightDetails>(this.baseurl+"getFlights/",fd);
  }
  deleteFlight(fd:FlightDetails):Observable<FlightDetails>
  {
    return this.myhttp.delete<FlightDetails>(this.baseurl+"getFlights/"+fd);
  }
  updateFlights(fd:FlightDetails):Observable<FlightDetails>
  {
    return this.myhttp.put<FlightDetails>(this.baseurl+"updateFlight/",fd);
  }


}
