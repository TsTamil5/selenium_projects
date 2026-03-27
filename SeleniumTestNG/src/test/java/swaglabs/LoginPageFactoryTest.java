package swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository_pagefactory.LoginPage;

public class LoginPageFactoryTest {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();
		LoginPage lp=new LoginPage(driver);
		lp.enterUrl("https://www.saucedemo.com/");
		lp.enterCredentials("standard_user","secret_sauce");
		lp.clickLogin();
	}
	
}
