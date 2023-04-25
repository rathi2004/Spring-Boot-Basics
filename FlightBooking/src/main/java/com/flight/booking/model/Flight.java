package com.flight.booking.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flight_details")
public class Flight {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="flying_from",nullable = false, length = 20)
    private String from;
	
	@Column(name="flying_to",nullable = false, length = 20)
    private String to;
	
	@Column(nullable = false, length = 20)
    private String trip;
	
	@Column(name = "departure")
    private LocalDate departure;
	
	@Column(name = "returning")
    private LocalDate returning;
	
	@Column(name = "travelclass")
    private String travelclass;
	
	private int seats;
	
	private int ticket;
	
	Flight(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	public LocalDate getDeparture() {
		return departure;
	}

	public void setDeparture(LocalDate departure) {
		this.departure = departure;
	}

	public LocalDate getReturning() {
		return returning;
	}

	public void setReturning(LocalDate returning) {
		this.returning = returning;
	}

	public String getTravelclass() {
		return travelclass;
	}

	public void setTravelclass(String travelclass) {
		this.travelclass = travelclass;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	
	
	
	
	
	

}
