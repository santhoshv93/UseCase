package com.klm.flight.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.klm.flight.model.Airport;
import com.klm.flight.model.Flight;

public interface FlightService {
	
	//List<Flight> viewAllFlight();
	Flight getFlightById(String flightNumber);
	Flight addFlight(Flight flight);
	//String deleteStudent(Long id);
	//Flight updateStudent(Long id, Flight student);
	public List<Flight> getFlights(Airport origin, Airport destination);
	
}
