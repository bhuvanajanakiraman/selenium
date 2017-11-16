package com.apex.ecommerce.signon.page.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.core.Basepage;
import com.apex.ecommerce.signon.constant.GoogleLoginPageConstant;
public class GoogleLoginpage extends Basepage {
	
	@FindBy(id =GoogleLoginPageConstant.EMAIL_LOCATOR)
	public WebElement emailId;
	@FindBy(id = GoogleLoginPageConstant.NEXT_LOCATOR)
	public WebElement Nextbtn;
	@FindBy(id = GoogleLoginPageConstant.PASSWD_LOCATOR)
	public WebElement pass;
	@FindBy(id = GoogleLoginPageConstant.SIGN_IN_LOCATOR)
	public WebElement signin;

	public GoogleLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void dosignon(String userId, String pwd) throws Exception {
		emailId.sendKeys(userId);
		Thread.sleep(4000);
		Nextbtn.click();
		Thread.sleep(5000);
		pass.sendKeys(pwd);
		Thread.sleep(2000);
		signin.click();
	}
}
