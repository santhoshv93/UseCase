package com.klm.flight.repository;

import org.springframework.data.repository.CrudRepository;

import com.klm.flight.model.Flight;

public interface FlightRepository extends CrudRepository<Flight, String> {

}
