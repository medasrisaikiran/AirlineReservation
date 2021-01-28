package com.example.layer3.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.layer2.entity.FlightDetails;

@Repository
public interface FlightRepository { // we can call it repo now instead of DAO
	List<FlightDetails> getAllFlights();
	  List<FlightDetails> getAllFlights(String source); List<FlightDetails>
	  getAllFlights(String source, String dest);
	void updateFlight(FlightDetails fd);
	void deleteFlight(int f);
	void addFlight(FlightDetails fd);
}
