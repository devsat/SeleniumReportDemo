package com.gologix;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Getlinks {
	
	@Test
	public void getLinks(){
 
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		driver.get("http://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();
 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a")); // links with only a tags and not link tags
 
		System.out.println(links.size());
 
		for (int i = 0; i<links.size(); i++)
 
		{
			
			System.out.println(links.get(i).getText());
			 
			 
		}
		
		// for fetching the link tag urls
		ArrayList<WebElement> linkTagLinks = (ArrayList<WebElement>) driver.findElements(By.tagName("link"));
		  
		int count = 0;
		
		for (WebElement webElement : linkTagLinks) {
		   System.out.println(webElement.getAttribute("href"));
		   count++;
		}
		
		System.out.println("link tag" + count);
		
		driver.quit();
	}
	
}
