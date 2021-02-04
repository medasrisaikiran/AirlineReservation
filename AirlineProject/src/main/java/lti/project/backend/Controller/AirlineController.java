package lti.project.backend.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import lti.project.backend.Pojos.Ticket;
import lti.project.backend.Pojos.Userdetails;
import lti.project.backend.Services.BookingDetailsService;
import lti.project.backend.Services.FlightDetailsService;
import lti.project.backend.Services.TicketService;
import lti.project.backend.Services.UserDetailsService;
import lti.project.backend.dto.FlightBySrcAndDestDto;
import lti.project.backend.dto.FlightDetailDto;


@RestController
@CrossOrigin
public class AirlineController {
	
	@Autowired FlightDetailsService flightService;
	@Autowired BookingDetailsService bookingservice;
	@Autowired TicketService ticketService;
	@Autowired UserDetailsService userService;
	
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
	@GetMapping("/getAllBookings")
	public List<Bookingdetails> getAllBookings(){
		return bookingservice.getAllBookingsService();
	}
	@PostMapping(path="/addBooking")
	public String addBooking(@RequestBody Bookingdetails b) {
		// boob.getFlightdetail().forEach(Flightdetail -> Flightdetail.setBookingdetails(b));
		bookingservice.addBookingService(b);
		return "Booking added";
	}
	@PutMapping(path="/updateBooking")
	public void updateBooking(@RequestBody Bookingdetails b) {
		bookingservice.updateBookingService(b);
	}
	@DeleteMapping(path="/deleteBooking/{id}")
	public void deleteBooking(@PathVariable("id") int id) {
		bookingservice.deleteBookingService(id);
	}
	@GetMapping(path="/getBooking/{id}")
	public Bookingdetails getBookingbyId(@PathVariable("id") int id) {
		 Bookingdetails b=bookingservice.getBookingbyIdService(id);
		 return b;
	}
	
	@GetMapping(path="/getBookingByFlight/{fid}")
	public List<Bookingdetails> getBookingsbyFlightId(@PathVariable("fid") int id){
		List<Bookingdetails> b=bookingservice.getBookingsbyFlightidService(id);
		return b;
	}

	
	@GetMapping(path="/getAllTicket")
	public List<Ticket> getAllTicket() {
		return ticketService.getAllTicketService();
	}
	
	@GetMapping(path="/getTicketById/{tno}")
	public Ticket getTicket(@PathVariable("tno") int tno) {
		return ticketService.getTicketByIdService(tno);
	}
	
	@PostMapping(path="/addticket")
	public void addTicket(@RequestBody Ticket t) {
		ticketService.addTicketService(t);
	}
	@DeleteMapping(path="/deleteticket/{id}")
	public void deleteTicket(@PathVariable("id") int id) {
		ticketService.deleteTicketService(id);
	}
	@PutMapping(path="/updateticket")
	public void updateTicket(@RequestBody Ticket t) {
		ticketService.updateTicketService(t);
	}
	@GetMapping(path="/getFlightByTicketId/{id}")
	public void getFlightByTicketId(@PathVariable("id") int id) {
		ticketService.getFlightByTicketIdService(id);
	}
	@GetMapping(path="/getSeatsByFlightId/{id}")
	public ArrayList<Integer> getSeatsByFlightId(@PathVariable("id") int id) {
		return ticketService.getSeatsByFlightIdService(id);
	}
	@PostMapping(path="/addUser")
	public void register(@RequestBody Userdetails u) {
		userService.addUsers(u);
	}
}
