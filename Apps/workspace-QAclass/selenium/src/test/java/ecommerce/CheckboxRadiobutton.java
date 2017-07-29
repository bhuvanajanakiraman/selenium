package ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxRadiobutton {
	
	
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.techbeamers.com");
	List<WebElement> list =driver.findElements(By.tagName("checkbox"));
	list.size();
	
	for(int i=0; i<=list.size();i++){
		String svalue = list.get(i).getAttribute("value");
		System.out.println(svalue);
	}
	
	
}
}
