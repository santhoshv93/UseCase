package com.klm.flight.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.klm.flight.model.Airport;
import com.klm.flight.model.Flight;
import com.klm.flight.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired //inject repository dependency
	FlightRepository flightRepository;
	
	@Override
	public Flight addFlight(Flight flight) {
		return flightRepository.save(flight); 
	}
	
	@Override
	public Flight getFlightById(String flightNo) {
		Optional<Flight> flight = flightRepository.findById(flightNo);
		if(flight.isPresent()) return flight.get();
		return null;
	}

	@Override
	public List<Flight> getFlights(Airport origin, Airport destination) {
		
		List<Flight> flightList = flightRepository.findByOriginAndDestination(origin, destination);
		
		return flightList;
	}
	/*
	 * @Override public List<Flight> getAllStudent() { List<Flight> students = new
	 * ArrayList<Flight>(); //create list of students variable
	 * studentRepository.findAll().forEach(student ->students.add(student)); // keep
	 * each student in students list return students; }
	 * 
	 * @Override public Flight updateStudent(Long id, Flight student) {
	 * Optional<Flight> studentById = studentRepository.findById(id);
	 * 
	 * if(studentById.isPresent()) { Flight updatedStudent = studentById.get();
	 * 
	 * updatedStudent.setId(student.getId());
	 * updatedStudent.setName(student.getName());
	 * updatedStudent.setAge(student.getAge());
	 * updatedStudent.setEmail(student.getEmail());
	 * 
	 * return studentRepository.save(updatedStudent); }
	 * 
	 * return null; }
	 * 
	 * @Override public String deleteStudent(Long id) {
	 * studentRepository.deleteById(id); //delete student by id return "id" + id +
	 * "is deleted successfully"; }
	 */
}
