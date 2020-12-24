package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
   By username = By.xpath("//input[@id='email']");
   By password = By.xpath("//input[@id='pass']");
   By loginbutton = By.name("login");
   By title = By.name("login");
   By forgotpassword = By.xpath("//a[contains(text(),'Forgotten password?')]");
   
   public LoginPage(WebDriver driver) {
	   
	   this.driver = driver;
	   
   }
   
   public WebElement username() {
	   
	   return driver.findElement(username);
	   
   
   }
public WebElement Password() {
	   
	   return driver.findElement(password);
	   
   }
public WebElement LoginButton() {
	   
	   return driver.findElement(loginbutton);
	   
}
public WebElement gettitle() {
	   
	   return driver.findElement(title);
	   
}
public ForgotPassword forgotpassword() {
	driver.findElement(forgotpassword).click();
	return new ForgotPassword(driver);
	
}


}
