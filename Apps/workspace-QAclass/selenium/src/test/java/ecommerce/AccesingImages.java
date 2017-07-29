package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccesingImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get( "https://www.facebook.com/login/identify?ctx=recover");
	WebElement image=	driver.findElement(By.cssSelector("a[title=\"Go to Facebook Home\"]"));
		
		image.click();
		driver.getTitle();
//		//Assertion
//		if(driver.getTitle().equals("Welcome to Facebook - Log In, Sign Up or Learn More")){
//			System.out.println("Welcome to facebook");
//			
//		}
//		else{
//			System.out.println("You are not in facebookpage");
//		}
	}

}
