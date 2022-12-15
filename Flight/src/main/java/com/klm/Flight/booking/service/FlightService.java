package com.klm.Flight.booking.service;

import org.springframework.http.ResponseEntity;

import com.klm.Flight.domain.Flight;

public interface FlightService {
	public ResponseEntity<?> addFlight(Flight flight);

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlight(String flightNumber);


}
