package lti.project.backend.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.Pojos.Ticket;

@Service
public interface TicketService 
{
	public List<Ticket> getAllTicketService();
	public Ticket getTicketByIdService(int id);
	public void addTicketService(Ticket t) ;
	public void deleteTicketService(int n) ;
	public void updateTicketService(Ticket t);
	public Flightdetails getFlightByTicketIdService(int id);
	public ArrayList<Integer> getSeatsByFlightIdService(int id);
	List<Bookingdetails> getBookingsbyUserIdService(int userid);
	List<Ticket> getTicketByUserId(int userid);
}
