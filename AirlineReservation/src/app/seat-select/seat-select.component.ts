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
  checked:boolean[]=[];
  blockseats(){
    for(var i=0;i<=53;i++)
    {
      this.disabledseats[i]=false;
      this.checked[i]=false;
    }
    for(var i=0;i<this.alreadybookedseats.length;i++)
    {
      this.disabledseats[this.alreadybookedseats[i]-1]=true;
    }
  }
  addseat(n:number){
    if(this.selectedseats.length<this.noofpassengers)
    {
      if(this.selectedseats.indexOf(n)!=-1)
      {
        let index=this.selectedseats.indexOf(n);
        this.selectedseats.splice(index,1);
        console.log("selected seats:"+this.selectedseats)
      }
      else
      {
        this.selectedseats.push(n);
        console.log("selected seats:"+this.selectedseats)
      }
    }
    else{
      if(this.selectedseats.indexOf(n)!=-1){
        let index=this.selectedseats.indexOf(n);
        this.selectedseats.splice(index,1);
        console.log("selected seats:"+this.selectedseats)
      }
      else{
        alert("cannot book more than "+localStorage.getItem("noofpassengers")+" seats");
        console.log("selected seats:"+this.selectedseats)
        setTimeout(()=>{this.checked[n-1]=false})
      }
    }
  }
  seatselect(){
    if(this.selectedseats.length==this.noofpassengers){
      localStorage.setItem("seatsselected",JSON.stringify(this.selectedseats))
      this.router.navigate(['payment'])
    }
    else{
      alert("please select "+this.noofpassengers +"seat(s)")
    }
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
