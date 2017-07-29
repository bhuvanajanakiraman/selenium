package ecommerce;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class Newtest {

	@Beforemethod
	public void login(){

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.amazon.com");

	WebElement singin = driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/div/a[1]/span[1]"));
	singin.click();
}
	
	

  @Test(dataProvider = "getdata")
  public void login(String userid, String password) {
	  WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys(userid);

		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys(password);

		WebElement sign = driver.findElement(By.id("signInSubmit"));
		sign.click();
	  
  }

  @DataProvider
  public Object[][] getdata() {
	  object[][] data = new object[2][2]
			 data[0][0]="bhuvana.career2016@gmail.com"
			 data[0][1]="buvisiddu22"
			 data[1][0]="abcd"
			 data[1][1]="xyz"
   
			 return data;
    };
  }

