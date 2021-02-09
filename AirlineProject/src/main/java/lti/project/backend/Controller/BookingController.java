package lti.project.backend.Controller;

import java.sql.Timestamp;
import java.time.Instant;
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
import lti.project.backend.Services.UserDetailsService;
import lti.project.backend.dto.BookingDto;

@RestController
@CrossOrigin
public class BookingController {
	
	@Autowired
	BookingDetailsService bookingservice;
	@Autowired
	FlightDetailsService fd;
	@Autowired
	UserDetailsService us;

	
	/*============================Booking Controller====================================*/
	
	@GetMapping("/getAllBookings")
	public List<Bookingdetails> getAllBookings(){
		return bookingservice.getAllBookingsService();
	}
	
	@PostMapping(path="/addBooking")
	public void addBooking(@RequestBody BookingDto b) {
		int userid=b.getUserid();
		int flightid=b.getFlightid();
		Flightdetails f=fd.getFlightByIdService(flightid);
		Userdetails d=us.getUserbyIdService(userid);
		Bookingdetails book=new Bookingdetails();
		book.setFlightdetail(f);
		book.setUserdetail(d);
		book.setDeparturedate(b.getDeparturedate());
		book.setBookingtime(Timestamp.from(Instant.now()));
		book.setStatus(b.getStatus());
		Ticket t=new Ticket();
		t.setDepartureDate(new Timestamp(b.getDeparturedate().getTime()));
		t.setPrice(b.getPrice());
		t.setReturnDate(new Timestamp(b.getReturndate().getTime()));
		t.setSeatnumber(b.getSeatno());
		book.setTicket(t);
		bookingservice.addBookingService(book);
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
	

}