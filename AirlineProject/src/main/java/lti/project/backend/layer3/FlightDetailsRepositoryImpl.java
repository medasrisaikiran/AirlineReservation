package lti.project.backend.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import lti.project.backend.layer2.Flightdetails;

@Repository
public class FlightDetailsRepositoryImpl 
{
	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public List<Flightdetails> getAllFlights() { //this man will only communicate with CHEF 
		Query query = entityManager.createQuery(" from FlightDetail f order by f.flightNumber");
		@SuppressWarnings("unchecked")
		List<Flightdetails> flightList = query.getResultList();
		return flightList;
	}
	@Transactional
	public Flightdetails getFlightById(int id) 
	{
		Flightdetails f=entityManager.find(Flightdetails.class,id);
		return f;
	}
	@Transactional
	public List<Flightdetails> getFlightsBySrcAndDest(String src,String dest) 
	{
		String q="select f from FlightDetails f where f.SOURCE=:src and f.DESTINATION=:dest";
		@SuppressWarnings("unchecked")
		List<Flightdetails> flightList = entityManager.createQuery(q).getResultList();
		return flightList;
	}
	@Transactional
	public void addFlight(Flightdetails f) 
	{
		entityManager.persist(f);
	}
	@Transactional
	public void deleteFlight(int n) 
	{
		Flightdetails f=entityManager.getReference(Flightdetails.class,n);
		entityManager.remove(f);
	}
}
