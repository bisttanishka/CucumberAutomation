package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep5 {

@Given("I am on the login page")
public void i_am_on_the_login_page() {
  System.out.println("Common");
}

@When("I enter valid credentials")
public void i_enter_valid_credentials() {
	System.out.println("Smoke");
}

@Then("I should be logged in successfully")
public void i_should_be_logged_in_successfully() {
	System.out.println("Smoke");
}

@When("I enter invalid credentials")
public void i_enter_invalid_credentials() {
	System.out.println("Sanity");
}

@Then("I should see an error message")
public void i_should_see_an_error_message() {
	System.out.println("Sanity");
}

@When("I click on the {string} link")
public void i_click_on_the_link(String string) {
	System.out.println("Rergression");
}

@Then("I should be redirected to the password reset page")
public void i_should_be_redirected_to_the_password_reset_page() {
	System.out.println("Rergression");
}


}
