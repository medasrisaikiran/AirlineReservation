package com.example.layer4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.layer2.entity.FlightDetails;
import com.example.layer3.repository.FlightRepository;
@Service
public class FlightServiceImpl implements FlightService {// BUSINESS LOGIC OF YOUR PROJECT
	
	@Autowired
	FlightRepository flightRepository; //service is talking to repository
	
	@Override // Repositories <---> Service <----> Controller(SpringMVC) <---> Angular CR-RA-UD
	public List<FlightDetails> getAllFlightsService() { //service invoking repository
		List<FlightDetails> listOfFlights = null;
		//take some business decisionshere 
		//take some business decisionshere 
		listOfFlights = flightRepository.getAllFlights();
		//take some business decisionshere 
		//take some business decisionshere 
		return listOfFlights;
	}
	@Override
	public void updateFlightService(FlightDetails f) { //service invoking repository
		flightRepository.updateFlight(f);
	}
	@Override
	public void addFlightService(FlightDetails f) { //service invoking repository
		flightRepository.addFlight(f); 
	}
	@Override
	public void deleteFlightService(int f) { //service invoking repository
		flightRepository.deleteFlight(f);; 
	}
}
