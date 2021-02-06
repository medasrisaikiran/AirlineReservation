package lti.project.backend.Services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;

@Service
public interface FlightDetailsService {

	public List<Flightdetails> getAllFlightsService();
	public Flightdetails getFlightByIdService(int id);
	public List<Flightdetails> getFlightsBySrcAndDestService(String src,String dest);
	public void addFlightService(Flightdetails f) ;
	public void deleteFlightService(int n) ;
	public void updateFlightService(Flightdetails f);
	public List<Flightdetails> sortFlightsBySourceService();
	public List<Flightdetails> sortFlightsByDestinationService();
	public List<Flightdetails> sortFlightsByIdService();
	public List<Bookingdetails> getFlightsBySrcAndDestAndDateService(String src, String dest, Date t);
}
