package PageObject;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeTest;

public class LandingPage {
	
	 @BeforeTest
		
		public WebDriver initialize() throws IOException {
			
	           driver = initialize();
	           
			
			driver.get("http://facebook.com");
			
			return driver;
		}
		
	
	public WebDriver driver;
	 By navibar = By.xpath("//form[@id='u_0_a']");
	 By navibarlogin = By.xpath("//form[@id='u_0_a']");
	 By popup=By.xpath("//button[text()='NO THANKS']");
   
   public LandingPage(WebDriver driver) {
	   
	   this.driver = driver;
	   
   }
   
public WebElement NavigationBar() {
	   
	   return driver.findElement(navibar);
	   
   }

public WebElement getpopup() {
	   
	   return driver.findElement(popup);
	   
}
public int getPopUpSize()
{
	return driver.findElements(popup).size();
}


}

