package com.klm.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klm.flight.model.Flight;
import com.klm.flight.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@PostMapping("/addFlight")
	public void addFlight(@RequestBody Flight flight) {
		 flightService.addFlight(flight);
	}
	
	@GetMapping("/flight/{id}")
	public Flight getFlight(@PathVariable("id") String flightNo) {
		return flightService.getFlightById(flightNo);
	}
	
	/*
	 * @GetMapping("/student") public List<Flight> getAllStudent(){ return
	 * studentService.getAllStudent(); }
	 * 
	 * @PutMapping("/student/{id}") public Flight updateStudent(@PathVariable("id")
	 * Long id, @RequestBody Flight student) { return
	 * studentService.updateStudent(id, student); }
	 * 
	 * @DeleteMapping("/student/{id}") public String
	 * deleteStudent(@PathVariable("id") Long id) { return
	 * studentService.deleteStudent(id); }
	 */
}
