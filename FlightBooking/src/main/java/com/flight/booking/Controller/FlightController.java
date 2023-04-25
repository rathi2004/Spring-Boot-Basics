package com.flight.booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.booking.model.Flight;
import com.flight.booking.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	FlightService fs;
	
	
	@GetMapping("/allflight")
	public List<Flight> getAllFlightDetails(){
		
		return fs.getAllFlightDetails();
	}
	
	@PostMapping("/postFlight")
	public String postFlightDetails(@RequestBody Flight id) {
		
		fs.postFlight(id);
		return "Flight details are Saved";
	}
	
	@PutMapping("/putFlight")
	public String putFlightDetails(@RequestBody Flight id) {
		
		fs.putFlight(id);
		return "Flight details are Edited";
	}
	
	@GetMapping("/allflight/{id}")
	
	public Flight getFlightById(@PathVariable int id) {
		
		return fs.getFlightDetailsById(id);
	}
	
	@DeleteMapping("/deleteflight/{id}")
	
	public String deleteFlight(@PathVariable int id) {
		
		fs.deleteFlightById(id);
		return "Flight details are deleted";
	}
	
	
}
