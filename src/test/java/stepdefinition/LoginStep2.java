package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep2 {
	@Given("the user is on the login page of amazon")
	public void the_user_is_on_the_login_page_of_amazon() {
	    
	}

	@When("the user enters valid {string} and {string}")
	public void the_user_enters_valid_and(String userName, String password) {
	    System.out.println(userName +" "+password);
	}

	@When("clicks the submit button")
	public void clicks_the_submit_button() {
	    
	}

	@Then("they should be logged in thorugh amazon")
	public void they_should_be_logged_in_thorugh_amazon() {
	
	}

	@Then("redirected to the home page")
	public void redirected_to_the_home_page() {
	   
	}

}
