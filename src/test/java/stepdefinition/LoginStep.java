package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	
public class LoginStep {
	WebDriver driver;
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

	
	  @When("the user enters valid credentials") public void
	  clicks_the_submit_button() {
	  
	  }
	 

	@Then("they should be logged in")
	public void they_should_be_logged_in() {
	   
	}

	@Then("redirected to the dashboard")
	public void redirected_to_the_dashboard() {
	   
	}

}
