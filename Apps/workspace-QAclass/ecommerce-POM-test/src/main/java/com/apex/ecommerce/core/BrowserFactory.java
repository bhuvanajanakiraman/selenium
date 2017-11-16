package com.apex.ecommerce.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
public class BrowserFactory {
	public WebDriver driver;
@Parameters("browser")
@BeforeClass
public void parllel(String browser){

	if(browser.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("ie")){
		
		WebDriver driver=new ChromeDriver();
		
	}
	driver.get("http://www.store.demoqa.com");
}
@Test
public void login() throws InterruptedException{
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
    driver.findElement(By.id("log")).sendKeys("testuser_1");
 
    driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
    driver.findElement(By.id("login")).click();
 
	
	
}
@AfterClass
public void teardown(){
	driver.close();
}
}
