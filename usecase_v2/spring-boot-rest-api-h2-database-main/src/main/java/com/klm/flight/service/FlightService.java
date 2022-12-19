package com.klm.flight.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.klm.flight.model.Flight;

public interface FlightService {
	
	//List<Flight> viewAllFlight();
	Flight getFlightById(String flightNumber);
	void addFlight(Flight flight);
	//String deleteStudent(Long id);
	//Flight updateStudent(Long id, Flight student);
	

}
