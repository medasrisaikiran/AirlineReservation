package lti.project.backend.layer2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BOOKINGDETAILS database table.
 * 
 */
@Entity
@Table(name="BOOKINGDETAILS")
public class Bookingdetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int bookingid;

	private Timestamp bookingtime;

	private Timestamp departuredate;

	@Column(length=20)
	private String status;

	//bi-directional many-to-one association to Flightdetail
	@ManyToOne
	@JoinColumn(name="FLIGHTID")
	private Flightdetails flightdetail;

	//bi-directional many-to-one association to Ticket
	@OneToOne
	@JoinColumn(name="TICKETID")
	private Ticket ticket;

	//bi-directional many-to-one association to Userdetail
	@ManyToOne
	@JoinColumn(name="USERID")
	private Userdetails userdetail;

	public Bookingdetails() {
	}

	public int getBookingid() {
		return this.bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public Timestamp getBookingtime() {
		return this.bookingtime;
	}

	public void setBookingtime(Timestamp bookingtime) {
		this.bookingtime = bookingtime;
	}

	public Timestamp getDeparturedate() {
		return this.departuredate;
	}

	public void setDeparturedate(Timestamp departuredate) {
		this.departuredate = departuredate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Flightdetails getFlightdetail() {
		return this.flightdetail;
	}

	public void setFlightdetail(Flightdetails flightdetail) {
		this.flightdetail = flightdetail;
	}

	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Userdetails getUserdetail() {
		return this.userdetail;
	}

	public void setUserdetail(Userdetails userdetail) {
		this.userdetail = userdetail;
	}

}