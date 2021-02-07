import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';
import { Ticket } from '../ticket';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit {
  tickets:Ticket[]
  displayTickets(){
    this.service.getTicketByUserId(parseInt(localStorage.getItem("userid"))).subscribe(
      data=>{
        this.tickets=data;
      })
  }
  delete(ticket:Ticket)
  {
    this.service.deleteTicket(ticket.ticketid).subscribe(data=>{
      alert("deleted successfully");
      this.displayTickets();
    })
  }
  constructor(private service:AirlineService){}
  ngOnInit(){
    this.displayTickets();
  }
}