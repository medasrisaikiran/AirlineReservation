package lti.project.backend.Pojos;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name="FLIGHTDETAILS")
public class Flightdetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int flightid;

	@Column(name="ARRIVAL_TIME")
	@JsonFormat(shape = Shape.STRING,pattern="yyyy-MM-dd'T'HH:mm:ss",timezone="Asia/Kolkata")
	private Timestamp arrivalTime;

	@Column(name="BUSINESS_CLASS_PRICE",precision=1)
	private int businessClassPrice;

	@Column(length=1)
	private String cabin;

	@Column(length=2)
	private int capacity;

	@Column(name="DEPARTURE_TIME",length=20)
	@JsonFormat(shape = Shape.STRING,pattern="yyyy-MM-dd'T'HH:mm:ss",timezone="Asia/Kolkata")
	private Timestamp departureTime;

	@Column(length=10)
	private String destination;

	@JsonFormat(shape = Shape.STRING,pattern="yyyy-MM-dd'T'HH:mm:ss",timezone="Asia/Kolkata")
	private Timestamp duration;

	@Column(name="ECONOMY_CLASS_PRICE",precision=1)
	private int economyClassPrice;
	
	@Column(length=10)
	private String source;

	//bi-directional many-to-one association to Bookingdetail
	@OneToMany(mappedBy="flightdetail",fetch =FetchType.LAZY,cascade = CascadeType.MERGE)
	private List<Bookingdetails> bookingdetails;

	public Flightdetails() {
	}

	public int getFlightid() {
		return this.flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public Timestamp getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getBusinessClassPrice() {
		return this.businessClassPrice;
	}

	public void setBusinessClassPrice(int businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}

	public String getCabin() {
		return this.cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Timestamp getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Timestamp getDuration() {
		return this.duration;
	}

	public void setDuration(Timestamp duration) {
		this.duration = duration;
	}

	public int getEconomyClassPrice() {
		return this.economyClassPrice;
	}

	public void setEconomyClassPrice(int i) {
		this.economyClassPrice = i;
	}

	@JsonIgnore
	public List<Bookingdetails> getBookingdetails() {
		return bookingdetails;
	}

	public void setBookingdetails(List<Bookingdetails> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}