package stepdefinationAmazon;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAmazon {
	WebDriver driver;
	@Given("User is in login page")
	public void user_is_in_login_page() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
	    
	}

	@When("the user enters phonenumber and password")
	public void the_user_enters_phonenumber_and_password() {
		
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("7300584041");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("Prinkle@1234");  
	}

	@And("user hit on login button")
	public void user_hit_on_login_button() {
		System.out.println("going in And method");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		
		WebElement userName=driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		String username=userName.getText();
		Assert.assertEquals(username, "Hello, Tanishka");
		 driver.quit();

     
	    
	}

}
