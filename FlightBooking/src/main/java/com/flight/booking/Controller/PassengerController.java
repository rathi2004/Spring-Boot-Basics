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

import com.flight.booking.model.Passenger;
import com.flight.booking.service.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	PassengerService ps;
	
	@GetMapping("/getallpassenger")
	public List<Passenger> getAllDetails(){
		
		return ps.getAllDetails();
	}
	@PostMapping("/postpassenger")
	public String postDetails(@RequestBody Passenger id) {
		
		ps.postDetails(id);
		return "Passenger Details are Saved";
	}
	@PutMapping("/putpassenger")
	public String putDetails(@RequestBody Passenger id) {
		
		ps.putDetails(id);
		return "Passenger Details are edited";
	}
	
	@GetMapping("/getpassenger/{id}")
	
	public Passenger getDetailsById(@PathVariable int id) {
		
		return ps.getDetailsById(id);
	}
	
	@DeleteMapping("/deletepassenger/{id}")
	public String deleteDetails(@PathVariable int id) {
		
		ps.deleteDetails(id);
		return "Passenger Details are deleted";
	}
}
