package com.jaxb.files;

import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="aircrafts")
public class AircraftMap {

	private Map<String, Aircraft> aircraftEqp;
	
	public AircraftMap() {}

	public Map<String, Aircraft> getAircraftEqp() {
		return aircraftEqp;
	}

	@XmlElement(name="aircraft")
	public void setAircraftEqp(Map<String, Aircraft> aircraftEqp) {
		this.aircraftEqp = aircraftEqp;
	}
	
	@Override
	public String toString() {
		return "aircraftEqp="+aircraftEqp;
	}
}
