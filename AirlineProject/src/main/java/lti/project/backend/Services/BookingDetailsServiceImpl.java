package lti.project.backend.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lti.project.backend.Exceptions.BookingAlreadyExistException;
import lti.project.backend.Exceptions.InSufficientDataException;
import lti.project.backend.Exceptions.NoBookingFoundException;
import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Repository.BookingDetailsRepositoryImpl;

@Service
public class BookingDetailsServiceImpl implements BookingDetailsService {
	
	@Autowired
	BookingDetailsRepositoryImpl br;

	@Override
	public List<Bookingdetails> getAllBookingsService(){
		// TODO Auto-generated method stub
		List<Bookingdetails> b=br.getAllBookings();
		try {
		if(b==null) {
			throw new NoBookingFoundException("No Bookings are Done...");
		}
		}
		catch(NoBookingFoundException e) {
			System.out.println(e);
		}
		return b;
	}
                             
	@Override
	public void addBookingService(Bookingdetails b){
		// TODO Auto-generated method stub
		try {
		br.addBooking(b);
		}
		catch(Exception e) { //InvalidDataAccessApiUsageException
			try {
			throw new BookingAlreadyExistException("Booking exist already");
			}
			catch(BookingAlreadyExistException msg) {
				System.out.println(msg);
			}
		}
		
	}
                           
	@Override
	public void updateBookingService(Bookingdetails b) {
		// TODO Auto-generated method stub
		try {
		br.updateBooking(b);
		}
		catch(Exception e) { //InvalidDataAccessApiUsageException 
			try {
			throw new InSufficientDataException("Data already exist...Recheck the updated data");
			}
			catch(InSufficientDataException msg) {
				System.out.println(msg);
			}
		}
	}

	@Override
	public List<Bookingdetails> getBookingsbyFlightidService(int id) {
		// TODO Auto-generated method stub
		List<Bookingdetails> b=br.getBookingsbyFlightid(id);
		try {
			if(b==null) {
				throw new NoBookingFoundException("No booking with this FLIGHT ID exist..");
			}
		}
		catch(NoBookingFoundException e) {
			System.out.println(e);
		}
		
		return b;
	}

	@Override
	public Bookingdetails getBookingbyIdService(int id) {
		// TODO Auto-generated method stub
		Bookingdetails b=br.getBookingById(id);
		try {
		if(b==null) {
			throw new NoBookingFoundException("No Booking with this Booking id");
		}
		}
		catch(NoBookingFoundException e) {
			System.out.println(e);
		}
		return b;
	}

	@Override
	public void deleteBookingService(int id){
		// TODO Auto-generated method stub
		try {
			br.deleteBooking(id);
		}
		catch(Exception e) { //EntityNotFoundException
			try {
			throw new NoBookingFoundException("No booking with this id");
			}
			catch(NoBookingFoundException e1) {
				System.out.println(e1);
			}
		}
		
	}

}