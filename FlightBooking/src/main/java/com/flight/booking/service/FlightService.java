package com.flight.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.flight.booking.model.Flight;
import com.flight.booking.repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	FlightRepository fr;
	
	public List<Flight> getAllFlightDetails(){
		
		return fr.findAll();
	}
	
	public Flight postFlight(@RequestBody Flight id) {
		
		return fr.save(id);
		
	}
	
	public Flight putFlight(@RequestBody Flight id) {
		
		return fr.save(id);
		
	}
	
	public Flight getFlightDetailsById(@PathVariable int id) {
		
		return fr.findById(id).orElse(null);
	}
	
	public void deleteFlightById(@PathVariable int id) {
		
		fr.deleteById(id);
	}
	
	

}
