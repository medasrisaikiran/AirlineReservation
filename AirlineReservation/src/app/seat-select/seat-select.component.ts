import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-seat-select',
  templateUrl: './seat-select.component.html',
  styleUrls: ['./seat-select.component.css']
})
export class SeatSelectComponent implements OnInit {
  seatcols=[1,2,3,4,4,5,6];
  seatrows=[1,2,3,4,5,6,7,8,9];
  constructor() { }

  ngOnInit(): void {
  }

}
