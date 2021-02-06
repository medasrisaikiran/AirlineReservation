import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  Username:string="admin";
  Password:string;

  login(){
    alert("login success")
    this.router.navigate(['addflight']);
  }
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

}
