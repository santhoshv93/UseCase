package com.klm.Flight.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.klm.Flight.domain.Airport;

@Repository
public interface AirportDao extends CrudRepository<Airport, String> {

}
