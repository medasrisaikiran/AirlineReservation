package com.example.layer4.service;

import java.util.List;

import com.example.layer2.entity.FlightDetails;

public interface FlightService {
	List<FlightDetails> getAllFlightsService();
	void addFlightService(FlightDetails f);
	void deleteFlightService(int f);
	void updateFlightService(FlightDetails f);
}
