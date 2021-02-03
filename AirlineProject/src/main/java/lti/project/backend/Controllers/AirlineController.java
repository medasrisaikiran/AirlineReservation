package lti.project.backend.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.Services.FlightDetailsService;
import lti.project.backend.dto.FlightBySrcAndDestDto;
import lti.project.backend.dto.FlightDetailDto;


@RestController
@CrossOrigin
public class AirlineController {
	
	@Autowired
	FlightDetailsService flightService; //controller is talking to service

	@GetMapping(path="/getAllFlights")
	public List<Flightdetails> getAllFlights() {
		return flightService.getAllFlightsService();
	}
	@GetMapping(path="/getFlightsById/{flno}")
	public Flightdetails getFlights(@PathVariable("flno") int flno) {
		return flightService.getFlightByIdService(flno);
	}
	@GetMapping(path="/getFlightsBySrcAndDest")
	public List<Flightdetails> getFlightsBySrcAndDest(@RequestBody FlightBySrcAndDestDto f) {
		return flightService.getFlightsBySrcAndDestService(f.getSource(),f.getDestination());
	}
	@GetMapping(path="/getAllFlightsBySrcAndDestAndDate")
	public List<Bookingdetails> getFlightsBySrcAndDestAndDate(@RequestBody FlightDetailDto f) throws ParseException {
		String str=f.getDeparturedate();
		java.util.Date d=new SimpleDateFormat("dd-MM-yy").parse(str);
		System.out.println(d.toString());
		return flightService.getFlightsBySrcAndDestAndDateService(f.getSource(),f.getDestination(),d);
	}
	@PostMapping(path="/addflight")
	public void addFlights(@RequestBody Flightdetails f) {
		flightService.addFlightService(f);
	}
	@DeleteMapping(path="/deleteflight/{id}")
	public void deleteFlights(@PathVariable("id") int id) {
		flightService.deleteFlightService(id);
	}
	@PutMapping(path="/updateflight")
	public void updateFlight(@RequestBody Flightdetails f) {
		flightService.updateFlightService(f);
	}
	@GetMapping(path="/sortflightsBySrc")
	public List<Flightdetails> sortFlightsBySource() {
		return flightService.sortFlightsBySourceService();
	}
	@GetMapping(path="/sortflightsByDest")
	public List<Flightdetails> sortFlightsByDest() {
		return flightService.sortFlightsByDestinationService();
	}
	@GetMapping(path="/sortflightsById")
	public List<Flightdetails> sortFlightsById() {
		return flightService.sortFlightsByIdService();
	}
}
