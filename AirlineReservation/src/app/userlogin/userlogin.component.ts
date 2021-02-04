import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlineService } from '../airline.service';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  Username:string;
  Password:string;
  login()
  {
    this.as.getUser().subscribe(data=>{
      if((data.email==this.Username)&&(data.password==this.Password))
      {
        alert("login success");
        this.router.navigate(['']);
      }
      else{
        alert("login denied Invalid credentials");
      }
    })
  }
  constructor(private as:AirlineService,private router:Router) { }

  ngOnInit(): void {
  }

}
