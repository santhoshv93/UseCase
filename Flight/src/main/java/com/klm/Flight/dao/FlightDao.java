package com.klm.Flight.dao;

import com.klm.Flight.domain.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDao extends CrudRepository<Flight,String>{

}
