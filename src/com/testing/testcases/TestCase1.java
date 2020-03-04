package com.testing.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.testing.Utils.Utility;
import com.testing.driverInstance.DriverCreation;
import com.testing.pages.GooglePage;

public class TestCase1 extends DriverCreation{

	@Test
	public void searchInstawork() throws IOException{
		GooglePage gp = new GooglePage(driver);
		gp.OpenGoogle();	
		
	}


}
