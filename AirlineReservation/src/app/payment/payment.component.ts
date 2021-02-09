import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlineService } from '../airline.service';
import { BookingDto } from '../booking-dto';
import { FlightBySrcAndDestDto } from '../flight-by-src-and-dest-dto';
import { FlightDetails } from '../flight-details';
@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  journeytype=parseInt(localStorage.getItem("journeytype"));
  flightid=parseInt(localStorage.getItem("flightid"));
  source=localStorage.getItem("source");
  destination=localStorage.getItem("destination");
  arrivaltime=new Date(localStorage.getItem("arrivaltime"));
  departuretime=new Date(localStorage.getItem("departuretime"));
  returndate=new Date(localStorage.getItem("returndate"));
  departuredate=new Date(localStorage.getItem("departuredate"));
  price=parseInt(localStorage.getItem("price"));
  class=localStorage.getItem("type");
  noofpassengers=parseInt(localStorage.getItem("noofpassengers"));
  seats:number[]=JSON.parse(localStorage.getItem("seatsselected"))
  flight:string[][]=[[],[]];
  flights:FlightDetails[]=[];
  returnflight:number=0;
  totalprice:number=0;
  ticketcount:number=0
  displayticket(){
        this.flight[0][0]=this.flightid.toString();
        this.flight[0][1]=this.source;
        this.flight[0][2]=this.destination;
        this.flight[0][3]=this.arrivaltime.toString();
        this.flight[0][4]=this.departuretime.toString();
        this.flight[0][5]=this.departuredate.toString();
        this.flight[0][6]=this.departuredate.toString();
        this.flight[0][7]=this.price.toString();
        this.flight[0][8]=this.class;
        this.flight[0][9]=this.noofpassengers.toString();
        this.totalprice=this.totalprice+(this.price*this.noofpassengers);
        if(this.journeytype==2)
        {
          let f=new FlightBySrcAndDestDto();
          f.source=this.destination;
          f.destination=this.source;
          this.service.getFlightsBySrcDest(f).subscribe(data=>{
            this.flights=data;
            this.flight[1][0]=data[0].flightid.toString();
            this.returnflight=data[0].flightid;
            this.flight[1][1]=data[0].source;
            this.flight[1][2]=data[0].destination;
            this.flight[1][3]=data[0].arrivalTime.toString();
            this.flight[1][4]=data[0].departureTime.toString();
            this.flight[1][5]=this.returndate.toString();
            this.flight[1][6]=this.returndate.toString();
            this.flight[1][7]=this.price.toString();
            this.flight[1][8]=this.class;
            this.flight[1][9]=this.noofpassengers.toString();
            this.totalprice=this.totalprice+this.price*this.noofpassengers;
          })
        }
  }
  bookTicket()
  {
    for(var x=0;x<this.noofpassengers;x++)
    {
        let book=new BookingDto();
        book.departuredate=this.departuredate;
        book.flightid=this.flightid;
        book.price=this.price;
        book.returndate=this.departuredate;
        book.status="active";
        book.seatno=this.seats[x];
        console.log("seat is:"+book.seatno)
        book.userid=parseInt(localStorage.getItem("userid"));
        this.service.addBooking(book).subscribe(data=>{
      })
      if(this.journeytype==2)
      {
        let book=new BookingDto();
        book.departuredate=this.returndate;
        book.flightid=this.returnflight;
        book.price=this.price;
        book.returndate=this.returndate;
        book.status="active";
        book.seatno=this.seats[x];
        console.log("seat is:"+book.seatno)
        book.userid=parseInt(localStorage.getItem("userid"));
        this.service.addBooking(book).subscribe(data=>{
      })
      }
    }
    alert("payment successful");
    alert("Booking done")
    this.router.navigate([''])    
  }
  constructor(private service:AirlineService,private router:Router) { }

  ngOnInit(): void {
    this.displayticket();
  }

}
