package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice {
	Properties prop;
	@Test
	public void readData() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHRM_Common_Data/commondata.properties");
		prop=new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url");
		String browser=prop.getProperty("browser");
		String validUserNmae=prop.getProperty("username");
		String validPassword=prop.getProperty("password");
		
		System.out.println("Browser:"+browser);
		System.out.println("Url:"+url);
		System.out.println("Username:"+validUserNmae);
		System.out.println("Password:"+validPassword);
		
		
		// write data
		
//		FileOutputStream fos=new FileOutputStream("./src/test/resources/OrangeHRM_Common_Data/commondata.properties");
//		prop.setProperty("candidateName","Thamizh");
//		prop.store(fos,null);
		
	}
}
