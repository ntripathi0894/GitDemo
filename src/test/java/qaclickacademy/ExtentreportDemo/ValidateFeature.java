package qaclickacademy.ExtentreportDemo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PageObject.LoginPage;
import junit.framework.Assert;
import resources.Base;


public class ValidateFeature extends Base {
	public WebDriver driver;
	
	private static Logger Log=LogManager.getLogger(Base.class.getName());
	  @BeforeTest
		
		public void initialize() throws IOException {
			
	           driver = initializeDriver();
	           Log.info("driver is initialised");
			
			driver.get("https://www.facebook.com");
			   Log.info("navigated to homepage");
		}
		
	
	
	@Test
	
	public void basePageNavigator() throws IOException {
		
		
		LoginPage l=new LoginPage(driver); 
		Assert.assertEquals(l.gettitle().getText(),"Log In");
		   Log.info("validated the Login text");
		
	     
	}
	@AfterTest
	public void teardown() {
		driver.close();
		
	}
	
	
}

