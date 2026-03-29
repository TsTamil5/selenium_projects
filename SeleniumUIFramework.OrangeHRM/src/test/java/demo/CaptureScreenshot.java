package demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.generic_utility.ScreenshotUtility;
import com.orangehrm.seleniumuiframework.generic_utility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class CaptureScreenshot {
	@Test(invocationCount = 2)
	public void screenShot() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dsp=new DashBoardPage(driver);
		ScreenshotUtility ssu=new ScreenshotUtility();
		
//		String timestamp=new SimpleDateFormat("yyyy-mm-dd[hh-ss]").format(new Date());
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(20);
		
		wdu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin","admin123");
		Thread.sleep(6000); // to take screenshot
		
		// capture the screenshot of the home page
		ssu.captureScreenshot(driver,"DashboardPage");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File temp=ts.getScreenshotAs(OutputType.FILE);
//		File perm=new File("./Reports/dashboard.png");
//		FileHandler.copy(temp, perm);
		
		
		// capture the screenshot of the webelement
		ssu.captureScreenshot(dsp.getRecruitment(), "recruitment");
		
//		WebElement recruitmentLink=dsp.getRecruitment();
//		File tempsrc=recruitmentLink.getScreenshotAs(OutputType.FILE);
//		File permTrg=new File("./Reports/recruitment.png");
//		FileHandler.copy(tempsrc, permTrg);
		
		
	}
}
