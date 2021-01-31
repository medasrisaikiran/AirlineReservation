package lti.project.backend.layer2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
	@Id
	@GeneratedValue
	@Column(name="ticketid")
	private int TICKETID;
	@Column(name="seatnumber")
	private int SEATNUMBER;
	@Column(name="price")
	private int PRICE;
	@Column(name="departure_date")
	private java.util.Date DEPARTUREDATE;
	@Column(name="return_date")
	private java.util.Date RETURNDATE;
	@OneToOne(mappedBy="TICKET",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	BookingDetails BOOKINGDETAILS;
	public int getTICKETID() {
		return TICKETID;
	}
	public int getSEATNUMBER() {
		return SEATNUMBER;
	}
	public int getPRICE() {
		return PRICE;
	}
	public java.util.Date getDEPARTUREDATE() {
		return DEPARTUREDATE;
	}
	public java.util.Date getRETURNDATE() {
		return RETURNDATE;
	}
	public BookingDetails getBOOKINGDETAILS() {
		return BOOKINGDETAILS;
	}
	public void setTICKETID(int tICKETID) {
		TICKETID = tICKETID;
	}
	public void setSEATNUMBER(int sEATNUMBER) {
		SEATNUMBER = sEATNUMBER;
	}
	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}
	public void setDEPARTUREDATE(java.util.Date dEPARTUREDATE) {
		DEPARTUREDATE = dEPARTUREDATE;
	}
	public void setRETURNDATE(java.util.Date rETURNDATE) {
		RETURNDATE = rETURNDATE;
	}
	public void setBOOKINGDETAILS(BookingDetails bOOKINGDETAILS) {
		BOOKINGDETAILS = bOOKINGDETAILS;
	}
	
	
}
