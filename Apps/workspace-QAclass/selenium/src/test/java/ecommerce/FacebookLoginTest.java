package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jdk.nashorn.internal.runtime.regexp.joni.Syntax;


public class FacebookLoginTest {

	WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void url() {
		driver.get("http://facebook.com");
	}
@Test
public void login(){
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("bhuva_hari21@yahoo.co.in");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("harishsiddu22");

		WebElement signin = driver.findElement(By.xpath("//input[@value='Log In']"));
		signin.click();
		
		driver.close();
		
	}
	
	@Test()
 public void blankcredentials(){
	 WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(" ");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("harishsiddu22");

		WebElement signin = driver.findElement(By.xpath("//input[@value='Log In']"));
		signin.click();
		 
 }
	
@Test
public void blankpass(){
	 WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("bhuva_hari21@yahoo.co.in ");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("");

		WebElement signin = driver.findElement(By.xpath("//input[@value='Log In']"));
		signin.click();
}

@AfterTest
public void close(){
	driver.close();
	
	
}

}
