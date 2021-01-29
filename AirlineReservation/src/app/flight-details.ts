export class FlightDetails {
	
	public flightNumber:number;
	
	public flightName:string;
	
	public sourceName:string;
	
	public destinationName:string;

	public getFlightNumber():number {
		return this.flightNumber;
	}

	public setFlightNumber(flightNumber:number) {
		this.flightNumber = flightNumber;
	}

	public getFlightName():string {
		return this.flightName;
	}

	public setFlightName(flightName:string) {
		this.flightName = flightName;
	}

	public getSourceName():string {
		return this.sourceName;
	}

	public setSourceName(sourceName:string) {
		this.sourceName = sourceName;
	}

	public getDestinationName():string {
		return this.destinationName;
	}

	public setDestinationName(destinationName:string) {
		this.destinationName = destinationName;
	}
	

}
