package com.gologix;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SamsungMobiles {
	
	@Test
	public void mobiles() throws InterruptedException {
		  	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gsmarena.com/samsung-phones-9.php");
		ArrayList<WebElement> SamsungPhones = (ArrayList<WebElement>) driver.findElements(By.cssSelector("img[title^='Samsung']"));
		    
		for (WebElement webElement : SamsungPhones) {
			System.out.println(webElement.getAttribute("title") );
		}
	  	  
		Thread.sleep(6000);
		driver.quit();
		System.out.println(SamsungPhones.size());
	}
}
		
		
	


