package com.jaxb.interfaces;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.jaxb.files.Aircraft;
import com.jaxb.files.AircraftConfig;
import com.jaxb.files.AircraftMap;

public class LsClientMarshall {
	
	public static void main(String[] args) {
		ArrayList<Aircraft> ls = new ArrayList<>();
		Aircraft aircraft1 = new Aircraft("123", "WN", 182, "737");
		ls.add(aircraft1);
		aircraft1 = new Aircraft("345", "WN", 171, "73G");
		ls.add(aircraft1);
		AircraftConfig wrapper = new AircraftConfig();
		wrapper.setAircrafts(ls);
		
		JAXBElement<AircraftConfig> jaxEl = new JAXBElement<AircraftConfig>(
				new QName(AircraftConfig.class.getSimpleName()), AircraftConfig.class, wrapper);
		try {
			JAXBContext context = JAXBContext.newInstance(AircraftConfig.class);
			Marshaller marshal = context.createMarshaller();
			marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshal.marshal(jaxEl, new File("src/main/resources/AircraftCofig.xml"));
			System.out.println("marshal!");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
