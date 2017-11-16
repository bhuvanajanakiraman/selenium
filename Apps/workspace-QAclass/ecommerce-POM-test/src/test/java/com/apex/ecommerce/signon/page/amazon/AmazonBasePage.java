package com.apex.ecommerce.signon.page.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class AmazonBasePage {
protected  WebDriver driver =null;
@BeforeMethod
	
	public void seturl(){
		driver= new FirefoxDriver();
		driver.get("http://www.amazon.com");
		WebElement singin = driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/div/a[1]/span[1]"));
		singin.click();;
		
		
	}

	
	@AfterMethod
	public void teardown(){
		
		driver.close();
	}
	
}
