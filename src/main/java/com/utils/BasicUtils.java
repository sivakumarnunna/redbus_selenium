package com.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BasicUtils {
	public static Properties config_properties=null;
	static {
		 String currentDirectory = System.getProperty("user.dir");
		 config_properties=new Properties();  
	         try {
	        	 config_properties.load(new FileReader(currentDirectory+"/src/main/resources/config.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
