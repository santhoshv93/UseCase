package com.klm.flight.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.klm.flight.model.Airport;
import com.klm.flight.model.Flight;

@Repository
public interface AirportDao extends CrudRepository<Airport, String> {

	Optional<Airport> findByAirportName(String origin);
}
