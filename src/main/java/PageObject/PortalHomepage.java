package PageObject;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeTest;

public class PortalHomepage {
	
	 @BeforeTest
		
		public WebDriver initialize() throws IOException {
			
	           driver = initialize();
	           
			
			driver.get("http://facebook.com");
			
			return driver;
		}
		
	
	public WebDriver driver;
	 By fbpage = By.xpath("//body/div[@id='mount_0_0']/div/div/div/div[2]/div[2]/div/div/div/div/label/input");
	 
 
   
   public PortalHomepage(WebDriver driver) {
	   
	   this.driver = driver;
	   
   }
   
public WebElement fbpagevalidation() {
	   
	   return driver.findElement(fbpage);
	   
   }

	

}

