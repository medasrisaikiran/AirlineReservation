package lti.project.backend.Services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lti.project.backend.Pojos.Flightdetails;

@Service
public class FlightDetailsServiceImpl implements FlightDetailsService
{
	@PersistenceContext
	EntityManager entityManager;
	
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
}
