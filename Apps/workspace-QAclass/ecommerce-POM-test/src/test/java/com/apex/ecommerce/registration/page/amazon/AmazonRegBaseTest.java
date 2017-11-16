package com.apex.ecommerce.registration.page.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class AmazonRegBaseTest {
  WebDriver driver =null;
  
@BeforeMethod
	
	public void seturl(){
		driver= new FirefoxDriver();
		driver.get("http://www.amazon.com");
		WebElement newuser = driver.findElement(By.xpath("//a[@class='nav-a']"));
		newuser.click();
		
		
	}

	
	@AfterMethod
	public void teardown(){
		
		driver.close();
	}
	
}
