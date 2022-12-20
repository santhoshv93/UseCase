package com.klm.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Airport
/**
 * Class Airport
 */
{
	@Id
	private String airportCode;
	private String airportName;
	
	
	
	public Airport() {
		
	}
	
	
	public Airport(String airportCode, String airportName) {
		super();
		this.airportCode = airportCode;
		this.airportName = airportName;
	}


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


	@Override
	public String toString() {
		return "Airport [airportCode=" + airportCode + ", airportName=" + airportName + "]";
	}


}
