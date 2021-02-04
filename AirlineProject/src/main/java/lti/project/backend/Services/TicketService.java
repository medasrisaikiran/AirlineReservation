package lti.project.backend.Services;

import java.util.ArrayList;
import java.util.List;

import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.Pojos.Ticket;

public interface TicketService 
{
	public List<Ticket> getAllTicketService();
	public Ticket getTicketByIdService(int id);
	public void addTicketService(Ticket t) ;
	public void deleteTicketService(int n) ;
	public void updateTicketService(Ticket t);
	Flightdetails getFlightByTicketIdService(int id);
	ArrayList<Integer> getSeatsByFlightIdService(int id);
}
