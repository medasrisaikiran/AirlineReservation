package com.example.layer2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


// cases have no concern in DBMS
//busType  BusType  BUSTYPE  

@Entity
@Table(name="flights")
public class FlightDetails {
	
	@Id
	@Column(name="flno")
	@GeneratedValue
	private int flightNumber;
	
	@Column(name="flname", length=20)
	private String flightName;
	
	@Column(name="src", length=20)
	private String sourceName;
	
	@Column(name="dest", length=20)
	private String destinationName;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	
	
}
