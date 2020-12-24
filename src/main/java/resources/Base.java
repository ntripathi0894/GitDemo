package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	
public Properties prop;

public WebDriver initializeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
	
		String browsername=prop.getProperty("browser");
	
		
	if(browsername.equals("chrome"));
	{
      System.setProperty("webdriver.chrome.driver", "H:\\Nilesh Data\\chromedriver_win32\\chromedriver.exe");
       	driver = new ChromeDriver();
	}
	 if (browsername.equals("firefox"));
	{
      
//               System.setProperty("webdriver.gecko.driver","H:\\Nilesh Data\\FireFox WD\\geckodriver.exe");
//				 driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

       	
	}
	 if (browsername.equals("IE"));
	{
      
//		System.setProperty("webdriver.ie.driver","H:\\Nilesh Data\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
//		 driver = new InternetExplorerDriver(); 
	}
	return driver;

	}

public String getScreenshotpath(String testcaseName, WebDriver driver) throws IOException 
{
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String destinationFile= System.getProperty("user.dir") +"\\reports\\"+testcaseName+".png";
     FileUtils.copyFile(source,new File(destinationFile));
     return destinationFile;
	
}

}
