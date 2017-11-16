package com.apex.ecommerce.signon.page.google.guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99 {
	WebDriver driver = null;

	@Test
	public void setup() {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://live.guru99.com/index.php/");

		WebElement mobile = driver.findElement(By.xpath(".//*[@id='nav']/ol/li[1]/a"));
		mobile.click();
		
		Select sc= new Select(driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
		List<WebElement> count=sc.getOptions();
		
		int size= count.size();
		for(int i=0;i<size;i++){
			String Svalue=sc.getOptions().get(i).getText();
			if(Svalue.equalsIgnoreCase("name")){
				sc.selectByIndex(i);
				break;
			}
			
		}
		
		 
		driver.close();

	}

}
