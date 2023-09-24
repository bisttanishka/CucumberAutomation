package stepdefinationAmazon;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAmazonWithParameter {
WebDriver driver;
	@Given("User is in Amazon login page")
	public void user_is_in_amazon_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}

	@When("User enter valid {string} and {string}")
	public void user_enter_valid_and(String mob_number, String pass) {
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys(mob_number);
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys(pass);
	   
	}

	@And("user click on sign in button")
	public void user_click_on_sign_in_button() {
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
	    
	}

	@Then("user should be in amazon homepage")
	public void user_should_be_in_amazon_homepage() {

		WebElement amazonlogo=driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		boolean amzlogo=amazonlogo.isDisplayed();
		Assert.assertEquals(amzlogo,true);
	
	}

	@Then("user account name should be same as loggen in")
	public void user_account_name_should_be_same_as_loggen_in() {
		WebElement userName=driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		String username=userName.getText();
		Assert.assertEquals(username, "Hello, Tanishka");
		 driver.quit();
		
	}

}
