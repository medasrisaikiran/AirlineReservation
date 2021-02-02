package lti.project.backend.Services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lti.project.backend.Pojos.Bookingdetails;
@Service
public class BookingDetailsServiceImpl implements BookingDetailsService{

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
}
