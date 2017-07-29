package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EbayBaseTest {

	
	protected WebDriver driver=null;
	
	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com");
		
	}
	@AfterMethod
		
	public void teardown(){
		driver.close();
		
	}
}
