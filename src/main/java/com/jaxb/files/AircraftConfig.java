package com.jaxb.files;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AircraftConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class AircraftConfig {

	@XmlElementWrapper(name="aircrafts")
	@XmlElement(name="aircraft")
	private List<Aircraft> aircrafts;
	
	public AircraftConfig() {}

	public List<Aircraft> getAircrafts() {
		return aircrafts;
	}

	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}

	@Override
	public String toString() {
		return "aircraftEqp="+aircrafts;
	}
}
