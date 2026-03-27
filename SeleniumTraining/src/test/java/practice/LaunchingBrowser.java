package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import java.util.*;

public class LaunchingBrowser {
	public static void main(String[] args) {
		// WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the browser you have:");
		String browser=s.next();
		
		WebDriver driver=null;
		
		if(browser.toLowerCase().contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.toLowerCase().contains("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.toLowerCase().contains("edge")) {
			driver=new EdgeDriver();
		}
		
	}
}
