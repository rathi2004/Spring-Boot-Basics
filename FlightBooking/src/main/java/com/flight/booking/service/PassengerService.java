package com.flight.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.flight.booking.model.Passenger;
import com.flight.booking.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	PassengerRepository pr;
	
	public List<Passenger> getAllDetails(){
		
		return pr.findAll();
	}
	
	public Passenger postDetails(@RequestBody Passenger id) {
		
		return pr.save(id);
	}
	
	public Passenger putDetails(@RequestBody Passenger id) {
		
		return pr.save(id);
	}
	
	public Passenger getDetailsById(@PathVariable int id) {
		
		return pr.findById(id).orElse(null);
	}
	
	public void deleteDetails(@PathVariable int id) {
		
		pr.deleteById(id);
	}

}
