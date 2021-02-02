package lti.project.backend.Repository;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.dto.FlightDetailDto;

@Repository
public class FlightDetailsRepositoryImpl implements FlightDetailsRepository
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
	public List<FlightDetailDto> getFlightsBySrcAndDestAndDate(String src,String dest,Date t) 
	{
		System.out.println(t.toString());
		java.sql.Date sqldate=new java.sql.Date(t.getTime());
		String str="select f.flightid,b.userid,b.departuredate from flightdetails f,bookingdetails b where f.source="+"'"+src+"'"+
				" and f.destination="+"'"+dest+"'"+" and f.flightid=b.flightid and to_char(b.departuredate,'yyyy-mm-dd')="+"'"+sqldate+"'";
		System.out.println(str);
		Query query=entityManager.createNativeQuery(str,FlightDetailDto.class);
		@SuppressWarnings("unchecked")
		List<FlightDetailDto> list =query.getResultList();
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
