package lti.project.backend.Services;

import java.util.List;

import lti.project.backend.Pojos.Bookingdetails;

public interface BookingDetailsService {

	List<Bookingdetails> getAllBookings();

	Bookingdetails getBookingById(int id);

	void addBooking(Bookingdetails f);

	void deleteBooking(int n);

	void updateBooking(Bookingdetails f);

}
