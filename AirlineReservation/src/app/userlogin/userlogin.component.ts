import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlineService } from '../airline.service';
import { Userdetails } from '../userdetails';
import { UsersByEmailIdAndPasswordDto } from '../users-by-email-id-and-password-dto';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  user = new UsersByEmailIdAndPasswordDto();
  Username:string;
  Password:string;
  login()
  {
    this.user.emailId=this.Username;
    this.user.password=this.Password;
    this.as.getUser(this.user).subscribe(data=>{
      if(data!=null)
      {
        alert(data.firstname  +" login success");
        localStorage.setItem("user",data.email);
        localStorage.setItem("userid",data.userid.toString());
        localStorage.setItem("username",data.firstname+""+data.lastname);
        console.log(data.email);
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
