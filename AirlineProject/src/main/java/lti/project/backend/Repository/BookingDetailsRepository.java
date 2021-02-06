package lti.project.backend.Repository;

import java.util.List;

import lti.project.backend.Pojos.Bookingdetails;

public interface BookingDetailsRepository {

	List<Bookingdetails> getAllBookings();

	Bookingdetails getBookingById(int id);

	void addBooking(Bookingdetails f);

	void deleteBooking(int n);

	void updateBooking(Bookingdetails f);

	List<Bookingdetails> getBookingsbyFlightid(int id);

	List<Bookingdetails> getBookingsbyUserId(int userid);

	Bookingdetails getBookingsbyTicketid(int n);
}