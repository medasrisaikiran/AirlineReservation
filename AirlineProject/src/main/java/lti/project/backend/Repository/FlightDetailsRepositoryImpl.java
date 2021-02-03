package lti.project.backend.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;

@Repository
public class FlightDetailsRepositoryImpl implements FlightDetailsRepository
{
	@PersistenceContext
	EntityManager entityManager;
	@Autowired
	BookingDetailsRepositoryImpl bd;
	
	@Override
	@Transactional
	public List<Flightdetails> getAllFlights() { //this man will only communicate with CHEF 
		Query query = entityManager.createQuery(" from Flightdetails f");
		@SuppressWarnings("unchecked")
		List<Flightdetails> flightList = query.getResultList();
		return flightList;
	}
	@Override
	@Transactional
	public Flightdetails getFlightById(int id) 
	{
		Flightdetails f=entityManager.find(Flightdetails.class,id);
		return f;
	}
	@Override
	@Transactional
	public List<Flightdetails> getFlightsBySrcAndDest(String src,String dest) 
	{
		String queryString = "select f from Flightdetails f where f.source=:src and f.destination=:dst";
		  @SuppressWarnings("unchecked") List<Flightdetails> list =
		  entityManager.createQuery(queryString) .setParameter("src", src).setParameter("dst", dest) .getResultList();
		  return list;
	}
	@Override
	@Transactional
	public List<Bookingdetails> getFlightsBySrcAndDestAndDate(String src,String dest,Date t) 
	{
		List<Flightdetails> l=getFlightsBySrcAndDest(src, dest);
		List<Bookingdetails> b=new ArrayList<Bookingdetails>();
		java.sql.Date d=new java.sql.Date(t.getTime());
		System.out.println("sqldate is:"+d.toString());
		for (Flightdetails flightdetails : l) {
			List<Bookingdetails> li=bd.getBookingsbyFlightid(flightdetails.getFlightid());
			for (Bookingdetails bookingdetails : li) {
				if(bookingdetails.getDeparturedate().equals(d)) {
					System.out.println("sqldate from oracle"+bookingdetails.getDeparturedate().toString());
					System.out.println(bookingdetails.getBookingid()+"\t"+bookingdetails.getDeparturedate()+"\t"+bookingdetails.getFlightdetail().getFlightid());
					b.add(bookingdetails);
				}
		}}
		return b;
	}
	@Override
	@Transactional
	public void addFlight(Flightdetails f) 
	{
		entityManager.persist(f);
	}
	@Override
	@Transactional
	public void deleteFlight(int n) 
	{
		Flightdetails f=entityManager.getReference(Flightdetails.class,n);
		entityManager.remove(f);
	}
	@Override
	@Transactional
	public void updateFlight(Flightdetails f) 
	{
		entityManager.merge(f);
	}
	@Transactional
	@Override
	public List<Flightdetails> sortFlightsById() {
		String queryString ="select f from Flightdetails f order by flightid";
		  @SuppressWarnings("unchecked") 
		  List<Flightdetails> list =entityManager.createQuery(queryString).getResultList(); 
		  return list;
	}

	@Transactional
	@Override
	public List<Flightdetails> sortFlightsBySource() {
		Query query = entityManager.createQuery(" from Flightdetails f order by f.source");
		@SuppressWarnings("unchecked")
		List<Flightdetails> flightList = query.getResultList();
		return flightList;
	}

	@Transactional
	@Override
	public List<Flightdetails> sortFlightsByDestination() {
		Query query = entityManager.createQuery(" from Flightdetails f order by f.destination");
		@SuppressWarnings("unchecked")
		List<Flightdetails> flightList = query.getResultList();
		return flightList;
	}

}
