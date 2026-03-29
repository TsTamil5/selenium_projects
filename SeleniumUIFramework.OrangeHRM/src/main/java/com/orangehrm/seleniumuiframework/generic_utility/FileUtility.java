package com.orangehrm.seleniumuiframework.generic_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	FileInputStream fis;
	FileOutputStream fos;
	Properties prop;
	
	// Read data from properties file
	public String getPropertyKeyValue(String key) throws IOException {
		fis=new FileInputStream("./src/test/resources/OrangeHRM_Common_Data/commondata.properties");
		prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	// write data on properties file
	public void setPropertyPair(String key,String value) throws IOException {
		prop = new Properties();
		fos=new FileOutputStream("./src/test/resources/OrangeHRM_Common_Data/write.properties");
		prop.setProperty(key,value);
		prop.store(fos,"Updated common data");
		fos.close();
	}
	
}
