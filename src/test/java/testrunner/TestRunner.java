package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"D:\\AutomationLearning eclispe\\Cucumber\\src\\test\\java\\resources"}, // Location of your feature files
    glue = {"stepdefinition"},      // Package where your step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports"},
    // Specify the format and location of the test reports
    dryRun = false,
    monochrome = true
    
)
public class TestRunner {
    // This class doesn't need any code in it, as it's a JUnit test runner.
    // It will automatically find and execute your Cucumber tests based on the options you've specified.
}

