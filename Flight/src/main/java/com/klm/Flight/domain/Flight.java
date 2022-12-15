package com.klm.Flight.domain;

import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.klm.Flight.domain.Airport;

import jakarta.persistence.Entity;
/*import lombok.Getter;
import lombok.Setter;*/

@Entity
public class Flight {
	
	private String flightNumber;

	private Long duration;
	 
	//private Airport origin;
	//private Airport destination;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Airport srcAirport;

	@OneToOne(fetch = FetchType.EAGER)
	private Airport dstnAirport;

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

	public Airport getSrcAirport() {
		return srcAirport;
	}

	public void setSrcAirport(Airport srcAirport) {
		this.srcAirport = srcAirport;
	}

	public Airport getDstnAirport() {
		return dstnAirport;
	}

	public void setDstnAirport(Airport dstnAirport) {
		this.dstnAirport = dstnAirport;
	}
	

}
