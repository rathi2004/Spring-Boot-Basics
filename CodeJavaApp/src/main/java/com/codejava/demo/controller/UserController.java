package com.codejava.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codejava.demo.model.User;
import com.codejava.demo.repository.UserRepository;

@RequestMapping("api/")
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	
	@Autowired
	UserRepository ur;
	
	@PostMapping("/lo")
	public String saveInfo(@RequestBody User id) {
			
		ur.save(id);
		return "Details Saved";
	}
	
	@GetMapping("/login")
	public List<User> getAllDetails(){
		
		return ur.findAll();
	}
	
	@GetMapping("/login/{id}")
	public User getDetailsById(@PathVariable Long id) {
		
		return ur.findById(id).orElse(null);
	}
	
	@DeleteMapping("/login/{id}")
	public String deleteDetailsById(@PathVariable Long id) {
		
		 ur.deleteById(id);
		 return "id: "+id+" is deleted";
	}

}
