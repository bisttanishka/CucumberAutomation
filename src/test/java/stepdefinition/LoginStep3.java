package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep3 {
	WebDriver driver;
	@Given("the user is on the login page of Naukri")
	public void the_user_is_on_the_login_page_of_naukri() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

	@When("the user give credentails valid {string} and {string}")
	public void the_user_give_credentails_valid_and(String string, String string2) {
	    
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
	    
	}

	@Then("they should be logged in thorugh Naukri")
	public void they_should_be_logged_in_thorugh_naukri() {
	    
	}

	@Then("redirected to the home page of naukri")
	public void redirected_to_the_home_page_of_naukri() {
	   
	}

	@When("the user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String string, String string2) {
	   
	}

	@When("clicks the sign button")
	public void clicks_the_sign_button() {
	  
	}
}
