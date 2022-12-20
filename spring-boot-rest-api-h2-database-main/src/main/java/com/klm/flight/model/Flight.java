package com.klm.flight.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.klm.flight.model.Airport;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.context.annotation.Bean;


@Entity //mark class as entity
public class Flight {
	
	@Id //defining id as primary key
	private String flightNumber;
	
	private Long duration;
	
	//@NotFound(action = NotFoundAction.IGNORE)
	@OneToOne(fetch = FetchType.EAGER)
	private Airport origin;

	//@NotFound(action = NotFoundAction.IGNORE)
	@OneToOne(fetch = FetchType.EAGER)
	private Airport destination;

	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Flight(String flightNumber, Long duration, Airport origin, Airport destination) {
		super();
		this.flightNumber = flightNumber;
		this.duration = duration;
		this.origin = origin;
		this.destination = destination;
	}



	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Airport getOrigin() {
		return origin;
	}

	public void setOrigin(Airport origin) {
		this.origin = origin;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", duration=" + duration + ", origin=" + origin
				+ ", destination=" + destination + "]";
	}

}
