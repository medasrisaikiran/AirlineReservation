import { Time } from "@angular/common";

export class FlightDetails {
	
	
	public flightid:number;
	public arrivalTime:Time;
	public businessClassPrice:number;
	public cabin:string;
	public capacity:number;
	public departureTime:Time;
	public destination:string;
	public duration:Time;
	public economyClassPrice:number;
	public source:string;

	public Flightdetails() {
	}

	public getFlightid():number {
		return this.flightid;
	}

	public setFlightid(flightid:number) {
		this.flightid = flightid;
	}

	public getArrivalTime():Time {
		return this.arrivalTime;
	}

	public setArrivalTime(arrivalTime:Time) {
		this.arrivalTime = arrivalTime;
	}

	public getBusinessClassPrice() {
		return this.businessClassPrice;
	}

	public setBusinessClassPrice(businessClassPrice:number) {
		this.businessClassPrice = businessClassPrice;
	}

	public getCabin():string {
		return this.cabin;
	}

	public setCabin(cabin:string) {
		this.cabin = cabin;
	}

	public getCapacity():number {
		return this.capacity;
	}

	public setCapacity(capacity:number) {
		this.capacity = capacity;
	}

	public getDepartureTime():Time {
		return this.departureTime;
	}

	public setDepartureTime(departureTime) {
		this.departureTime = departureTime;
	}

	public getDestination():string {
		return this.destination;
	}

	public setDestination(destination:string) {
		this.destination = destination;
	}

	public getDuration():Time {
		return this.duration;
	}

	public setDuration(duration:Time) {
		this.duration = duration;
	}

	public getEconomyClassPrice():number {
		return this.economyClassPrice;
	}

	public setEconomyClassPrice(i:number) {
		this.economyClassPrice = i;
	}

	public getSource():string {
		return this.source;
	}

	public setSource(source:string) {
		this.source = source;
	}
}
