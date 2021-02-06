import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-seat-select',
  templateUrl: './seat-select.component.html',
  styleUrls: ['./seat-select.component.css']
})
export class SeatSelectComponent implements OnInit {
  selectedseats:number[]=[];
  alreadybookedseats:number[]=[1,2,5,16,34,54];
  disabledseats:boolean[]=[];
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
    if(this.selectedseats.length<parseInt(localStorage.getItem("noofpassengers")))
    {
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
    else{
      alert("cannot book more than "+localStorage.getItem("noofpassengers")+" seats");
    }
  }
  seatselect(){
    alert("seatselect()");
    localStorage.setItem("seatsselected",JSON.stringify(this.selectedseats))
    this.router.navigate(['payment'])
  }
  constructor(private router:Router) { }

  ngOnInit(): void {
    this.blockseats()
  }

}
