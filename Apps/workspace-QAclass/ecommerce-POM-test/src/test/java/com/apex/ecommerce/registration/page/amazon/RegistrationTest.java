package com.apex.ecommerce.registration.page.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.registration.page.amazon.AmazonRegBaseTest;
import com.apex.ecommerce.registration.page.amazon.RegistrationPage;

public class RegistrationTest extends AmazonRegBaseTest {
	
	
	
	String[][] acct = { { "bhuvi", "abc.gmail.com","sidd","sidd" }, {"sidd","sidd@gmail.com","xyz","xyz"}};

	
	@Test(dataProvider="acct")
	public void CreateAc(String name, String email,String pass,String repass) throws Exception{
			
		RegistrationPage reg = new  RegistrationPage (driver);
		reg.docreateac(name, email, pass, repass);
			
		
	}
	@DataProvider(name = "acct")
	public Object[][] signinIdDp() {
		return acct;
	}
	

}
