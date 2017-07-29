package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexbaseTest {
	WebDriver driver=null;
	@BeforeMethod
	public void setup(){
 driver = new FirefoxDriver();
 driver.get("http://google.com");
 driver.findElement(By.id("gb_70" )).click();
 
	}

		
 @AfterMethod 
 public void close(){
 driver.close();
 
	}

}