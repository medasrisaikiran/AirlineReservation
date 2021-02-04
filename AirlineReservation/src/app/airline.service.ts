import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs'
import { FlightDetails } from './flight-details';
import { BookingDetails } from './booking-details';
import { Ticket } from './ticket';
import { Userdetails } from './userdetails';
import { FlightDto } from './flight-dto';
import { FlightRouteDto } from './flight-route-dto';
@Injectable({
  providedIn: 'root'
})
export class AirlineService {

  baseurl:string='http://localhost:8080/';
  constructor(private myhttp:HttpClient) { }
  findAllFlights() :Observable<FlightDetails[]>
  {
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"getAllFlights");
  }
  findFlightsById(fn:number) :Observable<FlightDetails>
  {
    return this.myhttp.get<FlightDetails>(this.baseurl+"getFlightsById/"+fn);
  }
  sortFlightsBySource() :Observable<FlightDetails[]>
  {
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"sortflightsBySrc");
  }
  sortFlightsByDestination() :Observable<FlightDetails[]>
  {
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"sortflightsByDest");
  }
  getFlightsBySrcDestDate(f:FlightDto):Observable<BookingDetails[]>
  {
    return this.myhttp.get<BookingDetails[]>(this.baseurl+"getAllFlightsBySrcAndDestAndDate/"+f);
  }
  getFlightsBySrcDest(f:FlightRouteDto):Observable<FlightDetails[]>
  {
    return this.myhttp.get<FlightDetails[]>(this.baseurl+"getFlightsBySrcAndDest/"+f);
  }
  addFlight(fd:FlightDetails)
  {
    return this.myhttp.post<FlightDetails>(this.baseurl+"addflight/",fd);
  }
  deleteFlight(id:number)
  {
    return this.myhttp.delete<FlightDetails>(this.baseurl+"deleteflight/"+id);
  }
  updateFlight(fd:FlightDetails)  
  {
    return this.myhttp.put<FlightDetails>(this.baseurl+"updateflight/",fd);
  }
  getAllBookings() :Observable<BookingDetails[]>
  {
    return this.myhttp.get<BookingDetails[]>(this.baseurl+"getAllBookings");
  }
  getBookingsById(fn:number) :Observable<BookingDetails>
  {
    return this.myhttp.get<BookingDetails>(this.baseurl+"getBooking/"+fn);
  }
  addBooking(fd:BookingDetails)
  {
    return this.myhttp.post<BookingDetails>(this.baseurl+"addBooking/",fd);
  }
  deleteBooking(id:number)
  {
    return this.myhttp.delete<BookingDetails>(this.baseurl+"deleteBooking/"+id);
  }
  updateBooking(fd:BookingDetails)  
  {
    return this.myhttp.put<BookingDetails>(this.baseurl+"updateBooking/",fd);
  }
  getBookingByFlight(f:number)
  {
    return this.myhttp.get<BookingDetails>(this.baseurl+"getBookingByFlight/"+f);
  }
  getAllTickets() :Observable<Ticket[]>
  {
    return this.myhttp.get<Ticket[]>(this.baseurl+"getAllTicket");
  }
  getTicketsById(fn:number) :Observable<Ticket>
  {
    return this.myhttp.get<Ticket>(this.baseurl+"getTicketById/"+fn);
  }
  addTicket(t:Ticket)
  {
    return this.myhttp.post<Ticket>(this.baseurl+"addticket/",t);
  }
  deleteTicket(id:number)
  {
    return this.myhttp.delete<Ticket>(this.baseurl+"deleteticket/"+id);
  }
  updateTicket(t:Ticket)  
  {
    return this.myhttp.put<Ticket>(this.baseurl+"updateticket/",t);
  }
  getUser():Observable<Userdetails>
  {
    return this.myhttp.get<Userdetails>(this.baseurl+"getUser/");
  }  
}
