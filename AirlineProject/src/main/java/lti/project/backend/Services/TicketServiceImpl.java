package lti.project.backend.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lti.project.backend.Exceptions.EmptyTicketException;
import lti.project.backend.Exceptions.NoBookingFoundException;
import lti.project.backend.Exceptions.TicketAlreadyPresentException;
import lti.project.backend.Exceptions.TicketNotFoundException;
import lti.project.backend.Exceptions.TicketUpdateException;
import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.Pojos.Ticket;
import lti.project.backend.Repository.BookingDetailsRepositoryImpl;
import lti.project.backend.Repository.TicketRepositoryImpl;

@Service
public class TicketServiceImpl implements TicketService 
{
	@Autowired
	TicketRepositoryImpl T;
	@Autowired BookingDetailsRepositoryImpl br;
    @Override
	public List<Ticket> getAllTicketService() {
		List<Ticket> tr=T.getAllTicket();
		try {
		if(tr==null) {
			throw new EmptyTicketException("No Ticket is Done...");
		}
		}
		catch(EmptyTicketException e) {
			System.out.println(e);
		}
		return tr;
	}

	@Override
	public Ticket getTicketByIdService(int id) 
	{
		// TODO Auto-generated method stub
				Ticket tt=T.getTicketById(id);
				try {
				if(tt==null) {
					throw new TicketNotFoundException("No Tickets with this Ticket id");
				}
				}
				catch(TicketNotFoundException e) {
					System.out.println(e);
				}
				return tt;
	}

	@Override
	public Flightdetails getFlightByTicketIdService(int id) 
	{
		// TODO Auto-generated method stub
				Flightdetails tt=T.getFlightByTicketId(id);
				try {
				if(tt==null) {
					throw new TicketNotFoundException("No Flights with this Ticket id");
				}
				}
				catch(TicketNotFoundException e) {
					System.out.println(e);
				}
				return tt;
	}

	@Override
	public void addTicketService(Ticket t) {
		try {
			T.addTicket(t);
			}
			catch(Exception e) { //InvalidDataAccessApiUsageException
				try {
				throw new TicketAlreadyPresentException("Ticket exist already");
				}
				catch(TicketAlreadyPresentException msg) {
					System.out.println(msg);
				}
			}
		
	}

	@Override
	public void deleteTicketService(int n) {
		try {
			T.deleteTicket(n);
		}
		catch(Exception e) { //EntityNotFoundException
			try {
			throw new TicketNotFoundException("No Ticket with this id");
			}
			catch(TicketNotFoundException e1) {
				System.out.println(e1);
			}
		}
		
	}

	@Override
	public void updateTicketService(Ticket t) {
		try {
			T.updateTicket(t);
			}
			catch(Exception e) { //InvalidDataAccessApiUsageException 
				try {
				throw new TicketUpdateException("Data already exist...Recheck the updated data");
				}
				catch(TicketUpdateException msg) {
					System.out.println(msg);
				}
			}
		
	}

	@Override
	public ArrayList<Integer> getSeatsByFlightIdService(int id) {
		// TODO Auto-generated method stub
		ArrayList<Integer> tt=T.getSeatsByFlightId(id);
		try {
		if(tt==null) {
			throw new TicketNotFoundException("No seats booked");
		}
		}
		catch(TicketNotFoundException e) {
			System.out.println(e);
		}
		return tt;
	}
	@Override
	public List<Bookingdetails> getBookingsbyUserIdService(int userid) {
		// TODO Auto-generated method stub
		List<Bookingdetails> b=br.getBookingsbyUserId(userid);
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
	public List<Ticket> getTicketByUserId(int userid) {
		// TODO Auto-generated method stub
		List<Ticket> tr=T.getTicketByUserId(userid);
		try {
		if(tr==null) {
			throw new EmptyTicketException("No Tickets Booked by User...");
		}
		}
		catch(EmptyTicketException e) {
			System.out.println(e);
		}
		return tr;
	}
}
