package com.klm.flight.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.klm.flight.model.Airport;
import com.klm.flight.model.Flight;

public interface FlightRepository extends CrudRepository<Flight, String> {

	List<Flight> findByOriginAndDestination(Airport origin, Airport destination);
}
