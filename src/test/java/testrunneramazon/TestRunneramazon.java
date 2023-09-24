package testrunneramazon;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"D:\\AutomationLearning eclispe\\cucumberAutomation\\src\\test\\java\\resources\\loginTestSuite.feature"}, 
		glue = { "stepdefinationAmazon" }, // Package where your step definitions are located
		plugin = { "pretty", "html:target/cucumber-reports" }, 
		monochrome = true, 
		tags ="@Sanity or @Smoke"

)

public class TestRunneramazon {
  
}
