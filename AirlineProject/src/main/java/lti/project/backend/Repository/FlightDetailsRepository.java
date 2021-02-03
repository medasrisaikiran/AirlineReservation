package lti.project.backend.Repository;

import java.util.Date;
import java.util.List;

import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.dto.FlightDetailDto;

public interface FlightDetailsRepository {
	
	public List<Flightdetails> getAllFlights();
	public Flightdetails getFlightById(int id);
	public List<Flightdetails> getFlightsBySrcAndDest(String src,String dest);
	public void addFlight(Flightdetails f) ;
	public void deleteFlight(int n) ;
	public void updateFlight(Flightdetails f);
	List<Flightdetails> sortFlightsBySource();
	List<Flightdetails> sortFlightsByDestination();
	List<Flightdetails> sortFlightsById();
	List<Bookingdetails> getFlightsBySrcAndDestAndDate(String src, String dest, Date t);
}
