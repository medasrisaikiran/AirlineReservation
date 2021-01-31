package lti.project.backend.layer2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="flightdetails")
public class FlightDetails {
@Id
@GeneratedValue
@Column(name="flightid")
private int  FLIGHTID;
@Column(name="source",length=20)
private String SOURCE;
@Column(name="destination",length=20)
private String DESTINATION;
@Column(name="capacity")
private int CAPACITY;
@Column(name="duration")
private java.time.LocalTime DURATION;
@Column(name="departure_time")
private java.time.LocalTime DEPARTURETIME;
@Column(name="arrival_time")
private java.time.LocalTime ARRIVALTIME;
@Column(name="economy_class_price")
private int ECONOMYCLASSPRICE;
@Column(name="business_class_price")
private int BUSINESSCLASSPRICE;
@Column(name="available_seats")
private int AVAILABLESEATS;
@Column(name="cabin",length=1)
private String CABIN;
@OneToMany(mappedBy="FLIGHTDETAILS",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
Set<BookingDetails> BOOKINGDETAILS;
@OneToOne(mappedBy="FLIGHTDETAILS",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
FlightAvailability FLIGHTAVAILABILITY;
public int getFLIGHTID() {
	return FLIGHTID;
}
public String getSOURCE() {
	return SOURCE;
}
public String getDESTINATION() {
	return DESTINATION;
}
public int getCAPACITY() {
	return CAPACITY;
}
public java.time.LocalTime getDURATION() {
	return DURATION;
}
public java.time.LocalTime getDEPARTURETIME() {
	return DEPARTURETIME;
}
public java.time.LocalTime getARRIVALTIME() {
	return ARRIVALTIME;
}
public int getECONOMYCLASSPRICE() {
	return ECONOMYCLASSPRICE;
}
public int getBUSINESSCLASSPRICE() {
	return BUSINESSCLASSPRICE;
}
public int getAVAILABLESEATS() {
	return AVAILABLESEATS;
}
public String getCABIN() {
	return CABIN;
}
public void setFLIGHTID(int fLIGHTID) {
	FLIGHTID = fLIGHTID;
}
public void setSOURCE(String sOURCE) {
	SOURCE = sOURCE;
}
public void setDESTINATION(String dESTINATION) {
	DESTINATION = dESTINATION;
}
public void setCAPACITY(int cAPACITY) {
	CAPACITY = cAPACITY;
}
public void setDURATION(java.time.LocalTime dURATION) {
	DURATION = dURATION;
}
public void setDEPARTURETIME(java.time.LocalTime dEPARTURETIME) {
	DEPARTURETIME = dEPARTURETIME;
}
public void setARRIVALTIME(java.time.LocalTime aRRIVALTIME) {
	ARRIVALTIME = aRRIVALTIME;
}
public void setECONOMYCLASSPRICE(int eCONOMYCLASSPRICE) {
	ECONOMYCLASSPRICE = eCONOMYCLASSPRICE;
}
public void setBUSINESSCLASSPRICE(int bUSINESSCLASSPRICE) {
	BUSINESSCLASSPRICE = bUSINESSCLASSPRICE;
}
public void setAVAILABLESEATS(int aVAILABLESEATS) {
	AVAILABLESEATS = aVAILABLESEATS;
}
public void setCABIN(String cABIN) {
	CABIN = cABIN;
}
public Set<BookingDetails> getBOOKINGDETAILS() {
	return BOOKINGDETAILS;
}
public void setBOOKINGDETAILS(Set<BookingDetails> bOOKINGDETAILS) {
	BOOKINGDETAILS = bOOKINGDETAILS;
}
public FlightAvailability getFLIGHTAVAILABILITY() {
	return FLIGHTAVAILABILITY;
}
public void setFLIGHTAVAILABILITY(FlightAvailability fLIGHTAVAILABILITY) {
	FLIGHTAVAILABILITY = fLIGHTAVAILABILITY;
}


}
