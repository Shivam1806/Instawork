package com.testing.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Utils.Utility;


public class GooglePage {
	
	public WebDriver driver;
	public  GooglePage( WebDriver driver) {
		this.driver=driver;		
	}
	
	public void OpenGoogle() throws IOException {
		System.out.println(driver.getCurrentUrl());
		WebElement googleText= driver.findElement(By.xpath(Utility.fetchPropertyValue("googleTextXpath")));
		googleText.sendKeys(Utility.fetchPropertyValue("instaworkUrl"));
		googleText.sendKeys(Keys.ENTER);
		List<WebElement> allLinks= driver.findElements(By.xpath(Utility.fetchPropertyValue("linksXpath")));
		int c =0;
		for(int i = 0;i<allLinks.size();i++) {
			
			String linkText = allLinks.get(i).getText();
			if (linkText.equals(Utility.fetchPropertyValue("instaWorkText"))) 
			{	int j = i+1;
				System.out.println("Position of InstaWork List is '"+ j + "' in UI List" );
				c=i;				
				break;	
			}
			
		}
		WebElement link = allLinks.get(c);
		WebDriverWait wait = new WebDriverWait(driver,5000);
		WebElement instaWork= wait.until
		(ExpectedConditions.elementToBeClickable(link));
		instaWork.click();
		System.out.println("Testcase passed");
		
	}
	

}
