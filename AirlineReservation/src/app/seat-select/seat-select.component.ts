import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlineService } from '../airline.service';

@Component({
  selector: 'app-seat-select',
  templateUrl: './seat-select.component.html',
  styleUrls: ['./seat-select.component.css']
})
export class SeatSelectComponent implements OnInit {
  selectedseats:number[]=[];
  alreadybookedseats:number[]=[]
  disabledseats:boolean[]=[];
  noofpassengers:number;
  seat1:boolean=false;
  seat2:boolean=false;
  seat3:boolean=false;
  seat4:boolean=false;
  seat5:boolean=false;
  seat6:boolean=false;
  blockseats(){
    for(var i=0;i<=53;i++)
    {
      this.disabledseats[i]=false;
    }
    for(var i=0;i<this.alreadybookedseats.length;i++)
    {
      this.disabledseats[this.alreadybookedseats[i]-1]=true;
    }
  }
  addseat(n:number){
    if(this.selectedseats.length<this.noofpassengers)
    {
      console.log("noofpassengers"+this.noofpassengers)
      if(this.selectedseats.indexOf(n)!=-1)
      {
        let index=this.selectedseats.indexOf(n);
        this.selectedseats.splice(index,1);
        console.log("popped "+this.selectedseats)
        console.log("selected seats:"+this.selectedseats)
      }
      else
      {
        this.selectedseats.push(n);
        console.log("pushed "+this.selectedseats)
        console.log("selected seats:"+this.selectedseats)
      }
    }
    else if(this.selectedseats.length>=this.noofpassengers){
      //this.selectedseats.length=this.noofpassengers;
      alert("cannot book more than "+localStorage.getItem("noofpassengers")+" seats");
      this.clear(n);
    }
  }
  clear(n:number){
    console.log("clear called"+n)
    if(n==1)
    {
      setTimeout(()=>{
        this.seat1=false;
      })
    }
    else if(n==2)
    {
      setTimeout(()=>{
        this.seat2=false;
      })
    }
    else if(n==3)
    {
      setTimeout(()=>{
        this.seat3=false;
      })
    }
    else if(n==4)
    {
      setTimeout(()=>{
        this.seat4=false;
      })
    }
    else if(n==5)
    { 
      setTimeout(()=>{
        this.seat5=false;
      })
    }
    else if(n==6)
    {
      setTimeout(()=>{
        this.seat6=false;
      })
    }
  }
  seatselect(){
    
      localStorage.setItem("seatsselected",JSON.stringify(this.selectedseats))
      this.router.navigate(['payment'])
    
  }
  constructor(private router:Router,private service:AirlineService) { }

  ngOnInit(): void {
    this.service.getSeatsByFlightId(parseInt(localStorage.getItem("flightid"))).subscribe(
      data=>{
        this.alreadybookedseats=data;
        console.log(this.alreadybookedseats)
        this.blockseats();
        this.noofpassengers=parseInt(localStorage.getItem("noofpassengers"));
      })
  }

}
