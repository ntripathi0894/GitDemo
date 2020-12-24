package TriggeringOptions;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/Login.feature",
		glue="stepDefination"
		)

public class testRunner extends AbstractTestNGCucumberTests{

}
