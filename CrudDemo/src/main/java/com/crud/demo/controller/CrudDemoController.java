package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.Service.CrudDemoService;
import com.crud.demo.model.CrudDemo;

@RestController

public class CrudDemoController {

	@Autowired
	public CrudDemoService crs;
	
	@PostMapping("/save")
	public String saveInfo(@RequestBody CrudDemo ba) {
		crs.saveInfo(ba);
		return "Id details Saved";
	}
	@PutMapping("/put")
	public CrudDemo editInfo(@RequestBody CrudDemo ba) {
		return crs.saveInfo(ba);
		
	}
	@GetMapping("/login")
	
	public List<CrudDemo> getAllDetails(){
		
		return crs.getAllDetails();
	}
	@GetMapping("/login/{id}")
	
	public CrudDemo getDetailsById(@PathVariable int id) {
		
		return crs.getDetailsById(id);
	}
	
	@DeleteMapping("/login/{id}")
	 
	public String deleteDetailsById(@PathVariable int id){
		
		crs.deleteDetailsById(id);
	    return "Deleted Successfully";
	}
	
}
