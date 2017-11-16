package com.apex.ecommerce.signon.page.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.signon.constant.AmazonPageConstant;

public class AmazonLoginPage {
	@FindBy(id = AmazonPageConstant.AP_EMAIL)
	public WebElement email;
	@FindBy(id = AmazonPageConstant.AP_PASSWORD)
	public WebElement pass;
	@FindBy(id = AmazonPageConstant.SIGN_IN_SUBMIT)
	public WebElement signIn;

	public AmazonLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void dosignon(String username, String pwd) throws Exception {

		email.sendKeys(username);
		Thread.sleep(2000);
		pass.sendKeys(pwd);
		Thread.sleep(2000);
		signIn.click();

	}
}
