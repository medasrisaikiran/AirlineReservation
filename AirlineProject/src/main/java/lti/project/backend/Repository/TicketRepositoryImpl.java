package lti.project.backend.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import lti.project.backend.Pojos.Ticket;

@Repository
public class TicketRepositoryImpl 
{
	@PersistenceContext
	EntityManager entityManager;
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
}
