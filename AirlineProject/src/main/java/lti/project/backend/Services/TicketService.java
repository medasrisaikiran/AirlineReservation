package lti.project.backend.Services;

import java.util.List;

import lti.project.backend.Pojos.Ticket;

public interface TicketService 
{
	public List<Ticket> getAllTicket();
	public Ticket getTicketById(int id);
	public void addTicket(Ticket t) ;
	public void deleteTicket(int n) ;
	public void updateTicket(Ticket t);
	
}
