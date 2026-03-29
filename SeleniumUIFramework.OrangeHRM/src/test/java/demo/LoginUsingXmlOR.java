package demo;

import java.io.IOException;
import java.time.Duration;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingXmlOR {
	@Test
	public void login() throws SAXException,IOException,ParserConfigurationException{
		// Read data from xml file
		Document file=DocumentBuilderFactory.newInstance().newDocumentBuilder()
		.parse(new File("./src/main/resources/DemoObjectRepository/LoginPage.xml"));
		
		//Fetching the String Values
		String username=file.getElementsByTagName("UserNameField").item(0).getTextContent();
		String password=file.getElementsByTagName("password").item(0).getTextContent();
		String loginBtn=file.getElementsByTagName("loginBtn").item(0).getTextContent();
		
		//Splitting the Locator and value
		String userLoc=username.split(":")[0];
		String userLocValue=username.split(":")[1];
		String passLoc=password.split(":")[0];
		String passLocValue=password.split(":")[1];
		String loginBtnLoc=loginBtn.split(":")[0];
		String loginBtnLocValue=loginBtn.split(":")[1];
		
		//Test Script
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		if(userLoc.equals("name")) {
			driver.findElement(By.name(userLocValue)).sendKeys("Admin");
		}
		if(passLoc.equals("name")) {
			driver.findElement(By.name(passLocValue)).sendKeys("admin123");
		}
		if(loginBtnLoc.equals("css")) {
			driver.findElement(By.cssSelector(loginBtnLocValue)).click();
		}
	}
}
