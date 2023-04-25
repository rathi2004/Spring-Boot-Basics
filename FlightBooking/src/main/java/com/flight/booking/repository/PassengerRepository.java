package com.flight.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.booking.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer>{

}
