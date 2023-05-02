package com.example.shoeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoeshop.model.Customer;
import com.example.shoeshop.service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@GetMapping("/getallcustomer")
	public List<Customer> getAllDetails(){
		
		return cs.getAllDetails();
	}
	@PostMapping("/postcustomer")
	public String postDetails(@RequestBody Customer id) {
		
		cs.postDetails(id);
		return "Customer Details are Saved";
	}
	@PutMapping("/putcustomer")
	public String putDetails(@RequestBody Customer id) {
		
		cs.putDetails(id);
		return "Customer Details are edited";
	}
	
	@GetMapping("/getcustomer/{id}")
	
	public Customer getDetailsById(@PathVariable int id) {
		
		return cs.getDetailsById(id);
	}
	
	@DeleteMapping("/deletecustomer/{id}")
	public String deleteDetails(@PathVariable int id) {
		
		cs.deleteDetails(id);
		return "Customer Details are deleted";
	}
	
	
	@GetMapping("/sortdetails/{fields}")
	
	public List<Customer> sortDetails(@PathVariable("fields") String fields){
		
		return cs.sortDetails(fields);
	}
	
	@GetMapping("/sortdetailsdes/")
	public List<Customer> sortDetailsDes(@RequestParam String field){
		
		return cs.sortDetailsDes(field);
	}
	
	@GetMapping("/sorttwodetails")
	
	public List<Customer> sortTwoDetails(@RequestParam String field1,@RequestParam String field2){
		
		return cs.sortTwoDetails(field1,field2);
	}
	
	@GetMapping("/customerpagination")
	
	public List<Customer> sortPagenation(@RequestParam int offset,@RequestParam int pagesize){
		
		return cs.sortCustomerPage(offset,pagesize);
	}
	
	@GetMapping("/paginationwithsort")
	
	public List<Customer> sortWithPagination(@RequestParam int offset,@RequestParam int pagesize,@RequestParam String field){
		
		return cs.sortWithPagination(offset,pagesize,field);
	}
	
	@GetMapping("/sortcustomerprefix")
	public List<Customer> sortPrefix(@RequestParam String prefix){
		
		return cs.getSortCustomerPrefix(prefix);
	}

	@GetMapping("/sortcustomersufix")
	
	public List<Customer> sortSuffix(@RequestParam String suffix){
		
		return cs.getSortCustomerSuffix(suffix);
	}
	@GetMapping("/findbyattribute")
	
	public List<Customer> findAttribute(@RequestParam String attribute){
		
		return cs.getFindAttribute(attribute);
	}
}
