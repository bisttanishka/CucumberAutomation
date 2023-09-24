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
		tags ="@Regression" /* if we have to run two senario with sanity and smoke then use OR and if
		                           we have given Sanity and Smoke name to one secenior the use And*/

)

public class TestRunneramazon {
  
}
