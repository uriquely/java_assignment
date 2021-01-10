package com.collection.map.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;


public class propertiesRun {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("Project-Root/resources/config.Properties"));
			System.out.println(prop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		Enumeration<?> names = prop.propertyNames();
		
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			String value = prop.getProperty(name);
			System.out.println(name + " = " + value);
		}

	}
}
