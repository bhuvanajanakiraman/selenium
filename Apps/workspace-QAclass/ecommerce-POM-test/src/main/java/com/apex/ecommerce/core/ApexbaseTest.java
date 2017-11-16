package com.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexbaseTest {
	protected WebDriver driver = null;

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("http://google.com");
	}

	@AfterMethod
	public void close() {
		driver.close();

	}

}
