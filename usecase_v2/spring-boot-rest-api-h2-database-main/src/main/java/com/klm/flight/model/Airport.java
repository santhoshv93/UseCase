package com.klm.flight.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport
/**
 * Class Airport
 */
{
	@Id
	private String airportCode;
	private String airportName;
	
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


}
