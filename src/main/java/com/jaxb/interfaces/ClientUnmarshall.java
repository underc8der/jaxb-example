package com.jaxb.interfaces;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.jaxb.files.Aircraft;
import com.jaxb.files.AircraftConfig;
import com.jaxb.files.AircraftMap;

public class ClientUnmarshall {
	
	public static void main(String[] args) {
		try {
			ClassLoader classLoader = ClientUnmarshall.class.getClassLoader();
	        File file = new File(classLoader.getResource("AircraftCofig.xml").getFile());
	        
	        if(!file.exists())
	        	throw new RuntimeException();
			
			JAXBContext jaxbContext = JAXBContext.newInstance(AircraftConfig.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	     
			//We had written this file in marshalling example
			AircraftConfig aircraft = (AircraftConfig) jaxbUnmarshaller.unmarshal( file );
			for(Aircraft result : aircraft.getAircrafts())
				System.out.println(result);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
