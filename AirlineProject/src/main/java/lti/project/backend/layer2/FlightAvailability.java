package lti.project.backend.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="flightavailability")
public class FlightAvailability 
{
	@OneToOne
	@JoinColumn(name="flightid")
	FlightDetails FLIGHTDETAILS;
	@Column(name="monday")
	private String MONDAY;
	@Column(name="tuesday")
	private String TUESDAY;
	@Column(name="wednesday")
	private String WEDNESDAY;
	@Column(name="thursday")
	private String THURSDAY;
	@Column(name="friday")
	private String FRIDAY;
	@Column(name="saturday")
	private String SATURDAY;
	@Column(name="sunday")
	private String SUNDAY;
	public FlightDetails getFLIGHTDETAILS() {
		return FLIGHTDETAILS;
	}
	public String getMONDAY() {
		return MONDAY;
	}
	public String getTUESDAY() {
		return TUESDAY;
	}
	public String getWEDNESDAY() {
		return WEDNESDAY;
	}
	public String getTHURSDAY() {
		return THURSDAY;
	}
	public String getFRIDAY() {
		return FRIDAY;
	}
	public String getSATURDAY() {
		return SATURDAY;
	}
	public String getSUNDAY() {
		return SUNDAY;
	}
	public void setFLIGHTDETAILS(FlightDetails fLIGHTDETAILS) {
		FLIGHTDETAILS = fLIGHTDETAILS;
	}
	public void setMONDAY(String mONDAY) {
		MONDAY = mONDAY;
	}
	public void setTUESDAY(String tUESDAY) {
		TUESDAY = tUESDAY;
	}
	public void setWEDNESDAY(String wEDNESDAY) {
		WEDNESDAY = wEDNESDAY;
	}
	public void setTHURSDAY(String tHURSDAY) {
		THURSDAY = tHURSDAY;
	}
	public void setFRIDAY(String fRIDAY) {
		FRIDAY = fRIDAY;
	}
	public void setSATURDAY(String sATURDAY) {
		SATURDAY = sATURDAY;
	}
	public void setSUNDAY(String sUNDAY) {
		SUNDAY = sUNDAY;
	}
}
