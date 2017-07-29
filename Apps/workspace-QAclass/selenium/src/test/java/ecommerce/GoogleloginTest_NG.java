package ecommerce;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleloginTest_NG extends ApexbaseTest implements GoogleLoginConstant {

	String[][] userids = { { "test1", "abc" }, { "test3", "khj" }, { "bhuvana.janakiraman", "buvisiddd22emails" } };

	@Test(dataProvider = "userids")
	public void testwithsuccesfuldata(String userid, String pass) {

		WebElement email = driver.findElement(By.id(EMAIL_LOCATOR));
		email.sendKeys(userid);

		WebElement cnext = driver.findElement(By.id(NEXT_LOCATOR));
		cnext.click();
		WebElement passwd = driver.findElement(By.xpath(PASSWD_LOCATOR));
		passwd.sendKeys(pass);

		WebElement sign = driver.findElement(By.id(SIGN_IN_LOCATOR));
		sign.click();

		// validate
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

	}

	@DataProvider(name = "userids")
	public Object[][] signinIdDp() {
		return userids;
	}

}