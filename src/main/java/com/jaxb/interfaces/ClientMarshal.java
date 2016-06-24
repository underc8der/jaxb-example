package com.jaxb.interfaces;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.jaxb.files.Aircraft;
import com.jaxb.files.AircraftMap;

@Deprecated
public class ClientMarshal {
	public static void main(String[] args) {
		AircraftMap aircraft = new AircraftMap();
		Map<String, Aircraft> aircmap = new HashMap<String, Aircraft>();
		Aircraft aircraft1 = new Aircraft("123", "WN", 182, "737");
		aircmap.put("737", aircraft1);
		aircraft1 = new Aircraft("345", "WN", 171, "73G");
		aircmap.put("73G", aircraft1);
		aircraft.setAircraftEqp(aircmap);

		JAXBElement<AircraftMap> jaxEl = new JAXBElement<AircraftMap>(
				new QName(AircraftMap.class.getSimpleName()), AircraftMap.class, aircraft);
		try {
			JAXBContext context = JAXBContext.newInstance(AircraftMap.class);
			Marshaller marshal = context.createMarshaller();
			marshal.marshal(jaxEl, new File("C:\\TMP\\aircraftMap" + new Date().getTime() +".xml"));
			System.out.println("marshal!");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
