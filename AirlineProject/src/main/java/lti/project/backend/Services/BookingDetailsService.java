package lti.project.backend.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import lti.project.backend.Pojos.Bookingdetails;
@Service
public interface BookingDetailsService {
	
	public List<Bookingdetails> getAllBookingsService();
	public void addBookingService(Bookingdetails b);
	public void updateBookingService(Bookingdetails b);
	public List<Bookingdetails> getBookingsbyFlightidService(int id);
	public Bookingdetails getBookingbyIdService(int id);
	public void deleteBookingService(int id);

}
