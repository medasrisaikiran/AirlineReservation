package lti.project.backend.layer2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FLIGHTDETAILS database table.
 * 
 */
@Entity
@Table(name="FLIGHTDETAILS")
public class Flightdetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int flightid;

	@Column(name="ARRIVAL_TIME")
	private Timestamp arrivalTime;

	@Column(name="BUSINESS_CLASS_PRICE")
	private int businessClassPrice;

	@Column(length=1)
	private String cabin;

	private int capacity;

	@Column(name="DEPARTURE_TIME")
	private Timestamp departureTime;

	@Column(length=20)
	private String destination;

	private Timestamp duration;

	@Column(name="ECONOMY_CLASS_PRICE")
	private int economyClassPrice;
	
	@Column(length=20)
	private String source;

	//bi-directional many-to-one association to Bookingdetail
	@OneToMany(mappedBy="flightdetail",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Bookingdetails> bookingdetails;

	public Flightdetails() {
	}

	public long getFlightid() {
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<Bookingdetails> getBookingdetails() {
		return this.bookingdetails;
	}

	public void setBookingdetails(List<Bookingdetails> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}
}