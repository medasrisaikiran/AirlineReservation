package lti.project.backend.Repository;

import java.util.List;

import lti.project.backend.Pojos.Flightdetails;

public interface FlightDetailsRepository {
	
	public List<Flightdetails> getAllFlights();
	public Flightdetails getFlightById(int id);
	public List<Flightdetails> getFlightsBySrcAndDest(String src,String dest);
	public void addFlight(Flightdetails f) ;
	public void deleteFlight(int n) ;
	public void updateFlight(Flightdetails f);
}
