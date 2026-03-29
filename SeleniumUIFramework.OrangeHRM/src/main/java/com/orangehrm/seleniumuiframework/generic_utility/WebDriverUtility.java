package com.orangehrm.seleniumuiframework.generic_utility;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	// Manage methods
	// maximize
	public void configMaximizedBrowser() {
		driver.manage().window().maximize();
	}
	// minimize
	public void configMinimizedBrowser() {
		driver.manage().window().minimize();
	}
	// full screen
	public void configFullScreenBrowser() {
		driver.manage().window().fullscreen();
	}
	// getSize
	public Dimension fetchSize() {
		Dimension dimension=driver.manage().window().getSize();
		return dimension;
	}
	// setSize
	public void configBrowserSize(int height,int width) {
		driver.manage().window().setSize(new Dimension(height,width));
	}
	// getPosition
	public Point fetchPosition() {
		Point point = driver.manage().window().getPosition();
		return point;
	}
	// setPosition
	public void configBrowserPosition(int x,int y) {
		driver.manage().window().setPosition(new Point(x,y));
	}
	
	// Navigate
	
	// navigate to
	public void navigateToApplication(String url) {
		driver.navigate().to(url);
	}
	// forward
	public void navigateForward() {
		driver.navigate().forward();
	}
	// backward
	public void navigateBackward() {
		driver.navigate().back();
	}
	public void refreshCurrentPage() {
		driver.navigate().refresh();
	}
	
	//get
	public void enterUrl(String url) {
		driver.get(url);
	}
	// getTitle
	public String fetchApplicationTitle() {
		String title=driver.getTitle();
		return title;
	}
	// getCurrentUrl
	public String fetchApplicationUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}
	// close
	public void closingBrowserTab() {
		driver.close();
	}
	//quit
	public void closingBrowserWindow() {
		driver.quit();
	}
	//timeouts
	public void waitForElementsToLoad(long timeInSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
	}
	
	// explicit wait
	public void waitTillTheElementIsClickable(WebElement element,int maximizeTimeToWait) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maximizeTimeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitTillTheElementIsVisible(WebElement element,int maximizeTimeToWait) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maximizeTimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//popups
	public void clickOnAccept() {
		driver.switchTo().alert().accept();
	}
	public void clickOnDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public void typeMessageInJavascriptPopup(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public String fetchJavascriptPopupMessage() {
		String message=driver.switchTo().alert().getText();
		return message;
	}
	// child window switching
	public void windowSwitchingByTitle(String childApplicationTitle) {
		String parentId = driver.getWindowHandle();
		Set<String> allWindowsId=driver.getWindowHandles();
		allWindowsId.remove(parentId);
		
		for(String childIds:allWindowsId) {
			driver.switchTo().window(childIds);
			String title=driver.getTitle();
			if(title.contains(childApplicationTitle)) {
				break;
			}
		}
	}
	
	public void windowSwitchingByUrl(String childApplicationUrl) {
		String parentId = driver.getWindowHandle();
		Set<String> allWindowsId=driver.getWindowHandles();
		allWindowsId.remove(parentId);
		
		for(String childIds:allWindowsId) {
			driver.switchTo().window(childIds);
			String url=driver.getCurrentUrl();
			if(url.contains(childApplicationUrl)) {
				break;
			}
		}
	}
	
	// frames
	public void switchToFrameByIndex(int indexNo) {
		driver.switchTo().frame(indexNo);
	}
	public void switchToFrameByIdOrName(String idOrNameValue) {
		driver.switchTo().frame(idOrNameValue);
	}
	public void switchToFrameByFrameElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public void switchBackTheControlToPreviousFrame() {
		driver.switchTo().parentFrame();
	}
	public void switchBackTheControlToMainPage() {
		driver.switchTo().defaultContent();
	}
	
}
