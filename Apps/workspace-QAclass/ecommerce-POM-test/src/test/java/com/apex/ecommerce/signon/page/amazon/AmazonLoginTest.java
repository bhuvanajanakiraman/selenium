package com.apex.ecommerce.signon.page.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.signon.page.amazon.AmazonLoginPage;
public class AmazonLoginTest extends AmazonBasePage{

	String[][] userids = { { "test1", "abc" }, { "bhuvana.janakiraman", "buvisiddd22emails" },{"bhuvana","abcd" }};

	@Test(dataProvider = "userids")
	public void testwithdata(String username, String pwd) throws Exception {

		
		AmazonLoginPage amz=new AmazonLoginPage(driver);
		amz.dosignon(username, pwd);
	}

	@DataProvider(name = "userids")
	public Object[][] signinIdDp() {
		return userids;
	}

	
}
