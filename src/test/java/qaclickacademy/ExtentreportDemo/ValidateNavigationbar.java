package qaclickacademy.ExtentreportDemo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import junit.framework.Assert;
import resources.Base;


public class ValidateNavigationbar extends Base {
	private static Logger Log=LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
  @BeforeTest
	
	public void initialize() throws IOException {
		
           driver = initializeDriver();
           Log.info("driver is initialised");
           driver.get("https://facebook.com");
           Log.info("navigated to homepage");
	}
  
	
	@Test
	
	public void basePageNavigator() throws IOException {
		
		
		LandingPage lp=new LandingPage(driver); 
		Assert.assertTrue(lp.NavigationBar().isDisplayed());
		Log.info("Successfully validated the navigation bar");
		//Assert.assertFalse(lp.NavigationBar().isDisplayed());
	     
	}

	@AfterTest
	public void teardown() {
		driver.close();
		
	}
	
}

