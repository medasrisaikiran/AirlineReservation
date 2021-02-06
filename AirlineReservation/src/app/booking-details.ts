import { Time } from "@angular/common";
import { FlightDetails } from "./flight-details";
import { Ticket } from "./ticket";
import { Userdetails } from "./userdetails";

export class BookingDetails {
    public bookingid:number;
    public bookingtime:Date
    public status:string;
    public departuredate:Date;
    public ticket:Ticket;
    public flightdetail:FlightDetails;
    public userdetail:Userdetails;
}
