package ecommerce;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BRokenLinks {
	
public static void main(String[] args) throws Exception {
	

	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.google.co.in/");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	 int alllinks = links.size();
	 System.out.println(alllinks);
	 
	 for(int i=0;i<=alllinks;i++){
		WebElement element= links.get(i);
		
		String url =element.getAttribute("herf");
		System.out.println(links.get(i).getText());
				verifylinkactive(url);
				
		
	 }
	
}

private static void verifylinkactive(String linkurl)  {
	
	
	try {
		URL url= new URL(linkurl);
		HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
		httpURLConnect.setConnectTimeout(3000);
        
        httpURLConnect.connect();
        
        if(httpURLConnect.getResponseCode()==200)
        {
            System.out.println(linkurl+" - "+httpURLConnect.getResponseMessage());
         }
       if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
        {
            System.out.println(linkurl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
         }
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}