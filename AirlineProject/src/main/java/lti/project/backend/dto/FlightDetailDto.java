package lti.project.backend.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class FlightDetailDto {

	java.sql.Date departuredate;
	int userid;
	int flightid;
	public java.sql.Date getDeparturedate() {
		return departuredate;
	}
	public int getUserid() {
		return userid;
	}
	public int getFlightid() {
		return flightid;
	}
	public void setDeparturedate(java.sql.Date departuredate) {
		this.departuredate = departuredate;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
			
}
