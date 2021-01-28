package com.example.layer3.repository;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.layer2.entity.FlightDetails;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FlightRepositoryImpl implements FlightRepository {

	@PersistenceContext
	EntityManager entityManager; //CHEF
	
	@Transactional
	public List<FlightDetails> getAllFlights() { //this man will only communicate with CHEF 
		Query query = entityManager.createQuery(" from FlightDetails");
		@SuppressWarnings("unchecked")
		List<FlightDetails> flightList = query.getResultList();
		return flightList;
	}

	
	  @Transactional public List<FlightDetails> getAllFlights(String source) 
	  {
	  String queryString ="select f from FlightDetails f where f.sourceName ="+source;
	  
	  @SuppressWarnings("unchecked") 
	  List<FlightDetails> list =entityManager.createQuery(queryString).getResultList(); 
	  return list; 
	  }
	  
	  @Transactional public List<FlightDetails> getAllFlights(String source, String
	  dest)
	  { //JPQL 
		  String queryString = "select f from " +"FlightDetails f where " + "f.sourceName=:src and f.destinationName=:dst";
	  
	  @SuppressWarnings("unchecked") List<FlightDetails> list =
	  entityManager.createQuery(queryString) .setParameter("src", source).setParameter("dst", dest) .getResultList();
	  return list; }
	 
	@Transactional
	public void  addFlight(FlightDetails fd) {
		entityManager.persist(fd);
	}
	@Transactional
	public void updateFlight(FlightDetails fd) {
		entityManager.merge(fd);
	}
	@Transactional
	public void deleteFlight(int f) {
		FlightDetails fd=entityManager.find(FlightDetails.class,f);
		entityManager.remove(fd);
	}
}
