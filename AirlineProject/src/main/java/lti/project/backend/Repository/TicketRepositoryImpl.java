package lti.project.backend.Repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.Pojos.Ticket;

@Repository
public class TicketRepositoryImpl 
{
	@PersistenceContext
	EntityManager entityManager;
	@Autowired FlightDetailsRepositoryImpl fd;
	@Autowired BookingDetailsRepositoryImpl bd;
	
	@Transactional
	public List<Ticket> getAllTicket() { 
		Query query = entityManager.createQuery(" from Ticket t ");
		@SuppressWarnings("unchecked")
		List<Ticket> ticketlist = query.getResultList();
		return ticketlist;
	}
	
	@Transactional
	public Ticket getTicketById(int id) 
	{
		Ticket t=entityManager.find(Ticket.class,id);
		return t;
	}
	
	@Transactional
	public void addTicket(Ticket t) 
	{
		entityManager.persist(t);
	}
	@Transactional
	public void deleteTicket(int n) 
	{
		Ticket t=entityManager.getReference(Ticket.class,n);
		entityManager.remove(t);
	}
	
	@Transactional
	public void updateTicket(Ticket t) 
	{
		entityManager.merge(t);
	}
	@Transactional
	public Flightdetails getFlightByTicketId(int n) 
	{
		Bookingdetails b=bd.getBookingsbyTicketid(n);
		Flightdetails f=b.getFlightdetail();
		return f;
	}
	@Transactional
	public ArrayList<Integer> getSeatsByFlightId(int id) {
		Flightdetails f=fd.getFlightById(id);
		ArrayList<Integer> a=new ArrayList<Integer>();
		List<Bookingdetails> l=bd.getBookingsbyFlightid(f.getFlightid());
		for (Bookingdetails bookingdetails : l) {
			Ticket t=bookingdetails.getTicket();
			a.add(t.getSeatnumber());
		}
		return a;
	}
}
