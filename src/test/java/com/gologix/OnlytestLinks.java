package com.gologix;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class OnlytestLinks {
	
	@Test
	public void testLinks() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("http://only-testing-blog.blogspot.in/");
		driver.manage().window().maximize();
	
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	
		System.out.println(links.size());
		
		for (WebElement webElement : links) {
		    System.out.println(webElement.getAttribute("href") ); 
			
		}
		
		driver.quit();
	}
}

