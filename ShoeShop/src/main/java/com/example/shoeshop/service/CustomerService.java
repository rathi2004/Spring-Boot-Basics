package com.example.shoeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.shoeshop.model.Customer;
import com.example.shoeshop.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cr;

public List<Customer> getAllDetails(){
		
		return cr.findAll();
	}
	
	public Customer postDetails(@RequestBody Customer id) {
		
		return cr.save(id);
	}
	
	public Customer putDetails(@RequestBody Customer id) {
		
		return cr.save(id);
	}
	
	public Customer getDetailsById(@PathVariable int id) {
		
		return cr.findById(id).orElse(null);
	}
	
	public void deleteDetails(@PathVariable int id) {
		
		cr.deleteById(id);
	}

	public List<Customer> sortDetails(@PathVariable String field) {
		
		return cr.findAll(Sort.by(field));
	}
	
	public List<Customer> sortDetailsDes(@RequestParam String field){
		
		return cr.findAll(Sort.by(Direction.DESC,field));
	}

	public List<Customer> sortTwoDetails(String field1, String field2) {
		
		return cr.findAll((Sort.by(field1)).and(Sort.by(field2)));
	}
	
	public List<Customer> sortCustomerPage(int offset,int pagesize){
		
		Page<Customer> paging=cr.findAll(PageRequest.of(offset, pagesize));
		return paging.getContent();
	}
	
	public List<Customer> sortWithPagination(int offset, int pagesize, String field) {
		
		Page<Customer> paging=cr.findAll(PageRequest.of(offset, pagesize,Sort.by(Direction.DESC,field)));
		
		return paging.getContent();
	}
	
	public List<Customer> getSortCustomerPrefix(String prefix) {
		
		return cr.findByFirstnameStartingWith(prefix);
	}

	public List<Customer> getSortCustomerSuffix(String suffix) {
		
		return cr.findByFirstnameEndingWith(suffix);
	}
	
	public List<Customer> getFindAttribute(String attribute) {
		
		return cr.findByAge(attribute);
	}
	
}
