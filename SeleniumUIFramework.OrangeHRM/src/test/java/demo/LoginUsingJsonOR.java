package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingJsonOR {
	@Test
	public void login() throws IOException {
		//Reading The JSON File
		String data=new String(Files.readAllBytes(Paths.get("./src/main/resources/DemoObjectRepository/LoginPage.json")));
		JSONObject obj=new JSONObject(data);
		JSONObject loginPage = obj.getJSONObject("login");
		
		//Extracting the data to check
		String userTextField=loginPage.getString("un");
		String passwordTextField=loginPage.getString("pass");
		String loginBtn=loginPage.getString("loginbutton");
		
		// Splitting the string values to use the locator
		String [] userLoc=userTextField.split(":");
		String [] passLoc=passwordTextField.split(":");
		String [] loginBtnLoc=loginBtn.split(":");
		
		// Test Script
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//UserName
		if(userLoc[0].equals("name")) {
			driver.findElement(By.name(userLoc[1])).sendKeys("Admin");
		}
		// password
		if(passLoc[0].equals("name")) {
			driver.findElement(By.name(passLoc[1])).sendKeys("admin123");
		}
		// login button
		if(loginBtnLoc[0].equals("cssSelector")) {
			driver.findElement(By.cssSelector(loginBtnLoc[1])).click();
		}
	}
}
