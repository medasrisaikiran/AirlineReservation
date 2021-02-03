package lti.project.backend.Pojos;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;


@Entity
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int ticketid;

	@JsonIgnore
	public Bookingdetails getBookingdetails() {
		return bookingdetails;
	}

	public void setBookingdetails(Bookingdetails bookingdetails) {
		this.bookingdetails = bookingdetails;
	}

	@Column(name="DEPARTURE_DATE")
	private Timestamp departureDate;

	@Column(precision=1)
	private int price;

	@Column(name="RETURN_DATE")
	private Timestamp returnDate;

	private int seatnumber;

	//bi-directional many-to-one association to Bookingdetail
	@OneToOne(mappedBy="ticket",cascade=CascadeType.ALL)
	private Bookingdetails bookingdetails;

	public Ticket() {
	}

	public int getTicketid() {
		return this.ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public Timestamp getDepartureDate() {
		return this.departureDate;
	}

	public void setDepartureDate(Timestamp departureDate) {
		this.departureDate = departureDate;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Timestamp getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Timestamp returnDate) {
		this.returnDate = returnDate;
	}

	public int getSeatnumber() {
		return this.seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}


}