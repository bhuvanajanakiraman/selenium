package com.apex.ecommerce.registration.page.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.signon.constant.AmazonRegConstant;

public class RegistrationPage {
@FindBy(id=AmazonRegConstant.AP_CUSTOMER_NAME)
	public WebElement username;
@FindBy(id=AmazonRegConstant.AP_EMAIL)
	public WebElement emailId;
@FindBy(id=AmazonRegConstant.AP_PASSWORD)
	public WebElement pwd;
@FindBy(id=AmazonRegConstant.AP_PASSWORD_CHECK)
	public WebElement repwd;
@FindBy(id=AmazonRegConstant.CONTINUE)
public WebElement create;


public RegistrationPage (WebDriver driver) {
	PageFactory.initElements(driver, this);

}
	
	





public void docreateac(String name, String email,String pass,String repass) throws Exception{
	
	username.sendKeys(name);
	Thread.sleep(3000);
	emailId.sendKeys(email);
	Thread.sleep(3000);
	pwd.sendKeys(pass);
	Thread.sleep(3000);
	repwd.sendKeys(repass);
	Thread.sleep(3000);
	create.click();
	
}


	
}
