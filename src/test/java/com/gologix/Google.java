package com.gologix;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;


public class Google {
	
	@Test
	public void search() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
	    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.className("gsfi")).sendKeys("testing");
		Thread.sleep(5000);
		driver.findElement(By.className("lsb")).click();
		Thread.sleep(5000);
		
		System.out.println("Below list is printed for search");
	    
	    ArrayList<WebElement> options = (ArrayList<WebElement>) driver.findElements(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]"));
	    for (WebElement webElement : options) {
	       System.out.println(webElement.getText());
	    }
	        
	    // driver
	    driver.close();
	    driver.quit();

	    }

	}