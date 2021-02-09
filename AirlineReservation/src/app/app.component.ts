import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  title = 'AirlineReservation';
  user=localStorage.getItem("username")
  logout(){
    localStorage.clear();
    alert("logged out successfully")
    this.ngOnInit();
  }
  constructor(private router:Router){}
  ngOnInit():void {
    
    if(this.user==null){
      console.log(this.user)
      this.router.navigate(['aboutus'])
    }
  }
}
