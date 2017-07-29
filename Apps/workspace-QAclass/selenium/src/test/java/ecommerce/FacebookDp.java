package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookDp {

	WebDriver driver = null;

	String[][] loginids = { { "9790567600", "siddesh" }, { "bhuvana.janakiraman", "bluebeater" },
			{ "testfb", "hjhkj" } };

	@BeforeMethod
	public void pagesetup() {

		driver = new FirefoxDriver();
		driver.get("http://facebook.com");

	}

	@Test(dataProvider = "loginids")
	public void flogin(String email, String pwd) {

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(email);

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pwd);

		WebElement signin = driver.findElement(By.id("u_0_t"));
		signin.click();

	}

	@DataProvider(name = "loginids")
	public Object[][] fbIds() {

		return loginids;
	}


@AfterMethod
public void closeapp()
{
	driver.close();
}

}