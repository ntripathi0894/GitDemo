package qaclickacademy.ExtentreportDemo;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.ForgotPassword;
import PageObject.LoginPage;
import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;
	private static Logger Log=LogManager.getLogger(Base.class.getName());
	 @BeforeTest
		
		public void initialize() throws IOException {
			
	           driver = initializeDriver();
	           Log.info("driver is initialised");
	   		
	          
		}
		
	
	@Test(dataProvider="getData")
	
	public void basePageNavigator(String username, String password) throws IOException {
		
		driver.get("https://www.facebook.com");
		 Log.info("navigated to facebook homepage");
		LoginPage l=new LoginPage(driver); 
		l.username().sendKeys(username);
		l.Password().sendKeys(password);
		l.LoginButton().click();
		 Log.info("succefully login");
		 
		
	}

	@DataProvider
	public Object[][] getData() {
		
		Object[][] data= new Object[1][2];
		//Ist data
		data[0][0]= "ntripathi0894@gmail.com";
		data[0][1]= "grandmasti";
		//2nd data
//    	data[1][0]= "aaaaa@gmail.com";
//		data[1][1]= "grandmasti";
		return data;
		
}
	@AfterTest
	public void teardown() {
		driver.close();
		
	}
}

