package stepdefinationAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginMultiple {

	WebDriver driver;
	WebDriverWait wait;
	@Given("Person is in SAMETIME page")
	public void person_is_in_sametime_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stpoc.cwp.pnp-hcl.com/chat/login");
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		 wait=new WebDriverWait(driver,10);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@data-testid=\"loginHeader\"]")));
		String login=element.getText();
		Assert.assertEquals(login, "Login","Login page is not displayed");
	    
	}

	@When("Person type valid {string} and {string}")
	public void person_type_valid_and(String user_name, String pass_word) {
		driver.findElement(By.id("username")).sendKeys(user_name);
		driver.findElement(By.id("password")).sendKeys(pass_word);
	    
	}

	@And("Person click on sign")
	public void person_click_on_sign() throws InterruptedException {
		driver.findElement(By.xpath("//button[@data-testid=\"loginButton\"]")).click();
		
	    
	}

	@Then("Person HomePageIsDisplayed")
	public void person_home_page_is_displayed() {
		 wait=new WebDriverWait(driver,10);
			WebElement logo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"HCL Sametime\"]")));
		String homePageLogo  = logo.getText();
		 Assert.assertEquals(homePageLogo, "HCL Sametime", "Logo is not displyaed");
	}

	@Then("Person logout")
	public void person_logout() throws InterruptedException {
	   driver.findElement(By.xpath("//p[text()=\"Log out\"]")).click();
	   wait=new WebDriverWait(driver,5);
	  WebElement logoutHeader= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@data-testid=\"loginHeader\"]")));
	   String logout=logoutHeader.getText();
	   
		Assert.assertEquals(logout, "You've been logged out","User is not logged out");
		driver.quit();
		
	}

}