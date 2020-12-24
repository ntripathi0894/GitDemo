package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	
	public WebDriver driver;
	
   By username = By.xpath("//input[@id='identify_email']");
   By Password = By.xpath("//input[@id='pass']");
   By search = By.xpath("//input[@id='u_0_2']");

   
   public ForgotPassword(WebDriver driver) {
	// TODO Auto-generated constructor stub
}

public WebElement username() {
	   
	   return driver.findElement(username);
	   }
public WebElement usernameeee() {
	   
	   return driver.findElement(username);
	   }
public WebElement usernameeeee() {
	   
	   return driver.findElement(username);
	   }

public WebElement Search() {
	   
	   return driver.findElement(search);
	   }

public WebElement Password() {
	// TODO Auto-generated method stub
	  return driver.findElement(Password);
}


}
