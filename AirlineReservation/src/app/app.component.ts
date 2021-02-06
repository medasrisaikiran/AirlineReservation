import { Component } from '@angular/core';
import { AirlineService } from './airline.service';
import { Ticket } from './ticket';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AirlineReservation';
  user:string="sai";
  time:Date=new Date();
  tickets:Ticket[]
  displayTickets(){
    this.service.getTicketByUserId(parseInt(localStorage.getItem("userid"))).subscribe(
      data=>{
        this.tickets=data;
      }
    )
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
