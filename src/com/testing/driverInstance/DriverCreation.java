package com.testing.driverInstance;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.testing.Utils.Utility;

public class DriverCreation {
	
public  static WebDriver driver;
public  static final String chromedriverpath = System.getProperty("user.dir") + "/src/com/testing/drivers/chromedriver";
public  static final String firefoxdriverpath = System.getProperty("user.dir") + "/src/com/testing/drivers/firefoxdriver";

	
	@BeforeTest
	public static void initiateDriverInstance() throws IOException {
		
		if(Utility.fetchPropertyValue("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			driver= new ChromeDriver();		
			}
		else if (Utility.fetchPropertyValue("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", firefoxdriverpath);
			driver=new FirefoxDriver();
		}
		
		else{
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			driver= new ChromeDriver();		
		}
		driver.get(Utility.fetchPropertyValue("google"));
		driver.manage().window().maximize();
		
	};
	
	@AfterTest
	public void closeDriverInstance() {
		
		driver.quit();
		
	}

}
