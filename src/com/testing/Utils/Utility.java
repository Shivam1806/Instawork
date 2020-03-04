package com.testing.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	
public static String fetchPropertyValue(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("/home/shivampathak/Shivam/Eclipse/WS/InstaWork/src/com/testing/properties/config.properties");
		Properties property = new Properties();
		property.load(file);
		return (String) property.get(key);
		
	}
}
