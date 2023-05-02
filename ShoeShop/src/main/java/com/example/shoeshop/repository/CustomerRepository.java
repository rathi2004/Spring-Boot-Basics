package com.example.shoeshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoeshop.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	List<Customer> findByFirstnameStartingWith(String prefix);

	List<Customer> findByFirstnameEndingWith(String suffix);

	List<Customer> findByAge(String attribute);

}
