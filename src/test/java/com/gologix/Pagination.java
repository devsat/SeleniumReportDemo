package com.gologix;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Pagination {

	@Test
	public void pagination() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("http://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();		
		
		ArrayList<WebElement> pagination = (ArrayList<WebElement>) driver.findElements(By.xpath(".//*[@id='body']/div/div[3]/div[1]/*"));
		// check if pagination link exists 
		
		if(pagination.size()>0){ 
			System.out.println("Pagination do exists in page");
		}
				System.out.println(pagination.size());
		
		
		for(int i=0; i<pagination.size(); i++){ 
			System.out.println("total number of pages " + i);
		}
		
		
		for (WebElement webElement : pagination) 
		{ 
			System.out.println(webElement.getAttribute("href") ); 
		}
			
		Thread.sleep(6000);
		driver.quit();
		System.out.println(pagination.contains("samsung-phones-f-9-0-p"));
	}
}


