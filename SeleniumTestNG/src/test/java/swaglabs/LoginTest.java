package swaglabs;
import org.testng.annotations.Test;

import objectrepository.BaseClass;
import objectrepository.LoginPage;
import objectrepository.LogoutPage;

public class LoginTest extends BaseClass {
	@Test
	public void login() {
		
		LoginPage lp=new LoginPage(driver);
		LogoutPage loutp=new LogoutPage(driver);
		// login action
		lp.enterUrl("https://www.saucedemo.com/");
		lp.enterCredentials("standard_user","secret_sauce");
		lp.clickLogin();
		// logout action
		loutp.clickLogout();
		driver.quit();
	}
	
	
}
