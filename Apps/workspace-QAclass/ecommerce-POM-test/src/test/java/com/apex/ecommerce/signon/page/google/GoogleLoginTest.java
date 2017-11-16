package com.apex.ecommerce.signon.page.google;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexbaseTest;
import com.apex.ecommerce.signon.page.google.GoogleLoginpage;
public class GoogleLoginTest extends ApexbaseTest {

	String[][] userids = { { "test1", "abc" }, { "bhuvana.janakiraman", "buvisiddd22emails" } };

	@Test(dataProvider = "userids")
	public void testwithsuccessfuldata(String userId, String pwd) throws Exception {

		GoogleLoginpage loginpage = new GoogleLoginpage(driver);
		loginpage.dosignon(userId, pwd);

	
	}

	@DataProvider(name = "userids")
	public Object[][] signinIdDp() {
		return userids;
	}

}
