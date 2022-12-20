package com.klm.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klm.flight.model.Airport;
import com.klm.flight.model.Flight;
import com.klm.flight.service.FlightService;
import com.klm.flight.service.AirportService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@Autowired
	AirportService airportService;
	
	@PostMapping("/addFlight")
	public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {
		 
		 
		 return new ResponseEntity<Flight>(flightService.addFlight(flight),
					HttpStatus.OK);
	}
	
	@GetMapping("/flight/{id}")
	public Flight getFlight(@PathVariable("id") String flightNo) {
		return flightService.getFlightById(flightNo);
	}
	
	@GetMapping("/getFlights")
    public List<Flight> getFlights(@RequestParam String origin, @RequestParam String destination)
                          throws RuntimeException {	
		Flight flight = new Flight();
		//flight.setScheduleId(scheduledFlight.getScheduleFlightId());
		flight.setOrigin(airportService.viewAirport(origin));
		flight.setDestination(airportService.viewAirport(destination));
        return flightService.getFlights(flight.getOrigin(), flight.getDestination());
    }
	
}
