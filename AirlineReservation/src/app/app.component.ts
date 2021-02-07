import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'AirlineReservation';
  user=localStorage.getItem("username")
  logout(){
    localStorage.clear();
    this.ngOnInit();
    this.router.navigate(['']);
    alert("logged out successfully")
  }
  constructor(private router:Router){}
  ngOnInit():void {

  }
}
