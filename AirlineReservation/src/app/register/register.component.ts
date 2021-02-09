import { Component, OnInit } from '@angular/core';
import { Userdetails } from '../userdetails';
import { Subscription } from 'rxjs/internal/Subscription';
import { AirlineService } from '../airline.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user : Userdetails = new Userdetails();
  Title:string;
  Firstname:string;
  Lastname:string;
  Dateofbirth:Date;
  Password:string;
  Cnfpassword:string;
  Mobile:string;
  Email:string;
  
  register(){
    if(this.Title==="Mr."){
    this.user.gender="m";
    }
    else{
      this.user.gender="f";
    }
    this.user.firstname=this.Firstname;
    this.user.lastname=this.Lastname;
    this.user.dob=this.Dateofbirth;
    this.user.password=this.Password;
    this.user.mobile=this.Mobile;
    this.user.email=this.Email;

    this.userservice.addUser(this.user)
    .subscribe(data => {alert("you have registered successfully!!");
    this.router.navigate(['userlogin'])
    });
  }
  constructor(private userservice: AirlineService,private router:Router) { }

  ngOnInit(): void {
  }

}
