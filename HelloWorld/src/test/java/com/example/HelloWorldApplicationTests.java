package com.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.layer2.entity.FlightDetails;

import com.example.layer3.repository.FlightRepository;
import com.example.layer3.repository.FlightRepositoryImpl;

@SpringBootTest
class HelloWorldApplicationTests {

	@Autowired 
	FlightRepositoryImpl flightRepository;
	
	@Test
	void contextLoads1() {
		System.out.println("running test : flightRepo : "+flightRepository);
		FlightDetails f1 = new FlightDetails();
		f1.setFlightName("B2");
		f1.setSourceName("Hyderabad");
		f1.setDestinationName("London");
		flightRepository.addFlight(f1);
	}
	
	@Test
	void contextLoads2() {
		System.out.println("running test : flightRepo : "+flightRepository);
		List<FlightDetails> flights; 
		
		flights = flightRepository.getAllFlights();
		for (FlightDetails flightDetails : flights) {
			System.out.println("Flight Number : "+flightDetails.getFlightNumber());
			System.out.println("Flight Name   : "+flightDetails.getFlightName());
			System.out.println("Flight Source : "+flightDetails.getSourceName());
			System.out.println("Flight Dest   : "+flightDetails.getDestinationName());
		}
	}
	
	@Test
	void contextLoads3() {
		System.out.println("running test : flightRepo : "+flightRepository);
		List<FlightDetails> flights; 
		
		flights = flightRepository.getAllFlights("Mumbai");
		for (FlightDetails flightDetails : flights) {
			System.out.println("Flight Number : "+flightDetails.getFlightNumber());
			System.out.println("Flight Name   : "+flightDetails.getFlightName());
			System.out.println("Flight Source : "+flightDetails.getSourceName());
			System.out.println("Flight Dest   : "+flightDetails.getDestinationName());
		}
	}
	
	@Test
	void contextLoads4() {
		System.out.println("running test : flightRepo : "+flightRepository);
		List<FlightDetails> flights; 
		flights = flightRepository.getAllFlights("Mumbai","London");
		for (FlightDetails flightDetails : flights) {
			System.out.println("Flight Number : "+flightDetails.getFlightNumber());
			System.out.println("Flight Name   : "+flightDetails.getFlightName());
			System.out.println("Flight Source : "+flightDetails.getSourceName());
			System.out.println("Flight Dest   : "+flightDetails.getDestinationName());
		}
	}
	

}
