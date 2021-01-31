package lti.project.backend.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="bookingdetails")
public class BookingDetails {
	@Id
	@GeneratedValue
	@Column(name="bookingid")
	private int BOOKINGID;
	@Column(name="bookingtime")
	private java.time.LocalTime  BOOKINGTIME;
	@ManyToOne
	@JoinColumn(name="flightid")
	private FlightDetails FLIGHTDETAILS;
	@ManyToOne
	@JoinColumn(name="userid")
	private UserDetails USERDETAILS;
	@OneToOne
	@JoinColumn(name="ticketid")
	private Ticket TICKET;
	public int getBOOKINGID() {
		return BOOKINGID;
	}
	public java.time.LocalTime getBOOKINGTIME() {
		return BOOKINGTIME;
	}
	public FlightDetails getFLIGHTDETAILS() {
		return FLIGHTDETAILS;
	}
	public UserDetails getUSERDETAILS() {
		return USERDETAILS;
	}
	public Ticket getTICKET() {
		return TICKET;
	}
	public void setBOOKINGID(int bOOKINGID) {
		BOOKINGID = bOOKINGID;
	}
	public void setBOOKINGTIME(java.time.LocalTime bOOKINGTIME) {
		BOOKINGTIME = bOOKINGTIME;
	}
	public void setFLIGHTDETAILS(FlightDetails fLIGHTDETAILS) {
		FLIGHTDETAILS = fLIGHTDETAILS;
	}
	public void setUSERDETAILS(UserDetails uSERDETAILS) {
		USERDETAILS = uSERDETAILS;
	}
	public void setTICKET(Ticket tICKET) {
		TICKET = tICKET;
	}
		
}
