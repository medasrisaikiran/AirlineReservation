package com.example.layer5.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.layer2.entity.FlightDetails;
import com.example.layer4.service.FlightService;

@RestController
@CrossOrigin
public class FlightController {
	
	@Autowired
	FlightService flightService; //controller is talking to service

	@GetMapping(path="/getFlights")
	public List<FlightDetails> getAllFlights() {
		return flightService.getAllFlightsService();
	}
	@PostMapping(path="/addFlight")
	public void addFlights(@RequestBody FlightDetails f) {
		flightService.addFlightService(f);
	}
	@DeleteMapping(path="/deleteFlight")
	public void deleteFlights(@RequestBody FlightDetails f) {
		flightService.deleteFlightService(f.getFlightNumber());
	}
	@PutMapping(path="/updateFlight")
	public void updateFlight(FlightDetails f) {
		flightService.updateFlightService(f);
	}
	@RequestMapping("/login")
	@ResponseBody
	public String loginTheUser() {
		//u may connect to a database via dao
		return  "<h2>  Lets Sign In </h2>";
	}
	@GetMapping(path="/error")
	public String error() {
		return "<h2>error oops!</h2>";
	}
	@RequestMapping("/register")
	@ResponseBody
	public String registerTheUser() {
		//u may connect to a database via dao
		return  "<h2>  Lets Sign Up </h2>";
	}
}
