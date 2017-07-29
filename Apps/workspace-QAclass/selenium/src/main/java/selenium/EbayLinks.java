package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayLinks {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ebay.com/");
 /* List <WebElement> links= driver.findElements(By.tagName("a"));
 int size= links.size();
System.out.println("total links:"+ size);
for(int i=0;i<=links.size();i++){
	
	System.out.println(links.get(i).getText());
	
}*/

		
WebElement footer=driver.findElement(By.id("glbfooter"));
List<WebElement> footerlinks= footer.findElements(By.tagName("a"));
System.out.println(footerlinks.size());
	}

}
