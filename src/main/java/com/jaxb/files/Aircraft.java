package com.jaxb.files;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="aircraft")
public class Aircraft {
	private String acv;
	private String iataCode;
	private Integer seats;
	private String acType;

	public Aircraft() {	}
	
	public Aircraft(String acv,
			String iataCode,
			Integer seats,
			String acType) {
		this.acv = acv;
		this.iataCode = iataCode;
		this.seats = seats;
		this.acType = acType;
	}
	
	public String getAcv() {
		return acv;
	}
	@XmlElement
	public void setAcv(String acv) {
		this.acv = acv;
	}
	public String getIataCode() {
		return iataCode;
	}
	@XmlElement
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	public Integer getSeats() {
		return seats;
	}
	@XmlElement
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	public String getAcType() {
		return acType;
	}
	@XmlElement
	public void setAcType(String acType) {
		this.acType = acType;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[")
		.append("acv=").append(acv)
		.append(",iataCode=").append(iataCode)
		.append(",seats=").append(seats)
		.append(",acType").append(acType)
		.append("]");
		return sb.toString();
	}
}
