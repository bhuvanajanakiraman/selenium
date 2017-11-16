package ecommerce;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ebay {

}
	@Test
  public void login() {
	  WebElement Email = driver.findElement(by.id("452371801"));
	
	  Email.sendKeys("email");
	  System.out.println("email:");
	  
	  WebElement pass = driver.findElement(by.id("452371801"));
	  pass.sendKeys("password");
	  System.out.println("password:");
	  
	  ebElement signin =	  driver.findElement(By.id("sgnBt"))
	  signin.click();
	  
  }

	@beforemethod
  public void Login() {
	  WebDriver driver =new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("http://ebay.com");
	WebDriverWait  wait= new WebDriverWait(driver, 15)
	
WebElement lin= wait.until(ExpectedCondition.elemenToBeClickable(driver.findElement(By.id("gh-ug-flex"));

lin.click();
	
 

	  
	  @test
			  
	public void test(){
	WebElement Email = driver.findElement(by.id("452371801"));	
	Email.sendKeys("bhuvana.career2016.gmail.com");
	 WebElement password = driver.findElement(By.id("624762771"));
	 password.sendKeys("buvisidd22");
			  
	WebElement signin =	  driver.findElement(By.id("sgnBt"))
				signin.click();
  }

	@Aftertest
	public void afterMethod() {

		driver.close();
	}

}