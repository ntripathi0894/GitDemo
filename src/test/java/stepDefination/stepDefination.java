package stepDefination;

import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;

import PageObject.LandingPage;
import PageObject.LoginPage;
import PageObject.PortalHomepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resources.Base;


@RunWith(Cucumber.class)
public class stepDefination extends Base{

	@Given("Initialize browser with chrome")
	public void initialize_browser_with_chrome() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}
    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    	LandingPage l=new LandingPage(driver);
		if(l.getPopUpSize()>0)
		{
			l.getpopup().click();
		}
	
    }

   

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        PortalHomepage PH= new PortalHomepage(driver);
        Assert.assertTrue(PH.fbpagevalidation().isDisplayed());
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
    	LoginPage l=new LoginPage(driver); 
		l.username().sendKeys(username);
		l.Password().sendKeys(password);
		l.LoginButton().click();
    	
    }
    @And("^close the browsers$")
    public void close_the_browsers() throws Throwable {
       driver.quit();
    }
}
