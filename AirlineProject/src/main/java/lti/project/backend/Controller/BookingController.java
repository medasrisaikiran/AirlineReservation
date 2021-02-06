package lti.project.backend.Controller;

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
import lti.project.backend.Services.BookingDetailsService;

@RestController
@CrossOrigin
public class BookingController {
	
	@Autowired
	BookingDetailsService bookingservice;
	
	/*============================Booking Controller====================================*/
	
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
	

}