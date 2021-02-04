package lti.project.backend.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.Pojos.Ticket;
@Repository
public class BookingDetailsRepositoryImpl implements BookingDetailsRepository{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Bookingdetails> getAllBookings() {
		Query query = entityManager.createQuery(" from Bookingdetails b");
		@SuppressWarnings("unchecked")
		List<Bookingdetails> bookingList = query.getResultList();
		return bookingList;
	}
	@Override
	@Transactional
	public Bookingdetails getBookingById(int id) 
	{
		Bookingdetails f=entityManager.find(Bookingdetails.class,id);
		System.out.println("here is the booking"+f);
		return f;
	}
	@Override
	@Transactional
	public void addBooking(Bookingdetails f) 
	{
		entityManager.persist(f);
	}
	@Override
	@Transactional
	public void deleteBooking(int id) 
	{
		Bookingdetails f=entityManager.getReference(Bookingdetails.class,id);
		entityManager.remove(f);
	}
	@Override
	@Transactional
	public void updateBooking(Bookingdetails f) 
	{
		entityManager.merge(f);
	}
    @Override
    @Transactional
    public List<Bookingdetails> getBookingsbyFlightid(int id)
    {
        Flightdetails f=entityManager.find(Flightdetails.class, id);
        Query query = entityManager.createQuery("select b from Bookingdetails b where b.flightdetail ="+f.getFlightid());
        @SuppressWarnings("unchecked")
        List<Bookingdetails> Bookinglist = query.getResultList();
        return Bookinglist;
    }
    public Bookingdetails getBookingsbyTicketid(int id)
    {
        Ticket f=entityManager.find(Ticket.class, id);
        Query query = entityManager.createQuery("select b from Bookingdetails b where b.ticket ="+f.getTicketid());
        Bookingdetails Bookinglist = (Bookingdetails)query.getSingleResult();
        return Bookinglist;
    }
}
