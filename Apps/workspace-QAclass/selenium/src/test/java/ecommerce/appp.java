package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class appp {

	private static final String SIGN_IN_SUBMIT = "signInSubmit";
	private static final String AP_PASSWORD = "ap_password";
	private static final String AP_EMAIL = "ap_email";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");

		WebElement singin = driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/div/a[1]/span[1]"));
		singin.click();

		WebElement email = driver.findElement(By.id(AP_EMAIL));
		email.sendKeys("bhuvana.career2016@gmail.com");

		WebElement pass = driver.findElement(By.id(AP_PASSWORD));
		pass.sendKeys("buvisidd22");

		WebElement sign = driver.findElement(By.id(SIGN_IN_SUBMIT));
		sign.click();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("earings");

		WebElement click = driver.findElement(By.className("nav-input"));
		click.click();

		WebElement shopnow = driver.findElement(By.id("amsShopNow"));
		shopnow.click();
		WebElement select = driver.findElement(By.xpath("//a["));
		select.click();
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		WebElement checkout = driver.findElement(By.id("hlb-ptc-btn-native"));
		checkout.click();

		driver.quit();
	}

}
