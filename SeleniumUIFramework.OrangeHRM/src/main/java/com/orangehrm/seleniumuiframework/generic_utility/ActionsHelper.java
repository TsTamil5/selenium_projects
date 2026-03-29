package com.orangehrm.seleniumuiframework.generic_utility;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
	WebDriver driver;
	Actions action;
	public ActionsHelper(WebDriver driver) {
		this.driver=driver;
		action=new Actions(driver);
	}
	
	// moveToElement and click
	public void clickOnElement(WebElement element) {
		action.moveToElement(element).click().perform();
	}
	
	// navigate dropdown
	public void navigateDownDrpDown(WebElement element,long timeInSec,int downArrowIndex) {
		action.click(element).pause(Duration.ofSeconds(timeInSec)).perform();
		for(int i=1;i<=downArrowIndex;i++) {
			action.keyDown(Keys.DOWN).perform();
		}
		action.keyDown(Keys.ENTER).perform();
	}
	
	// scrolldown auto sugesstion
	public void scrollDownAutoSugesstion(WebElement element,String text,long timeInSec,int downArrowIndex) {
		action.sendKeys(element,text).pause(Duration.ofSeconds(timeInSec)).perform();
		for(int i=1;i<=downArrowIndex;i++) {
			action.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		}
		action.keyDown(Keys.ENTER).keyUp(Keys.DOWN).perform();;
	}
	
	
	
}
