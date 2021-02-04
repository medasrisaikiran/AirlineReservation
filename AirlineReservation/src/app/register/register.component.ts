import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  Title:string;
  Firstname:string;
  Lastname:string;
  Dateofbirth:Date;
  Password:string;
  Cnfpassword:string;
  Mobile:string;
  Email:string;
  register(){}
  constructor() { }

  ngOnInit(): void {
  }

}
