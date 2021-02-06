package lti.project.backend.Pojos;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Table(name="BOOKINGDETAILS")
public class Bookingdetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int bookingid;

	@JsonFormat(shape = Shape.STRING,pattern="yyyy-MM-dd'T'HH:ss",timezone="Asia/Kolkata")
	private Timestamp bookingtime;

	private Date departuredate;

	@Column(length=20)
	private String status;

	//bi-directional many-to-one association to Flightdetails
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name="FLIGHTID")
	private Flightdetails flightdetail;

	//bi-directional many-to-one association to Tickets
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="TICKETID")
	private Ticket ticket;

	//bi-directional many-to-one association to Userdetails
	@ManyToOne(cascade ={CascadeType.MERGE})
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

	public Date getDeparturedate() {
		return this.departuredate;
	}

	public void setDeparturedate(Date departuredate) {
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