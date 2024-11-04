package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	public static WebDriver driver;

	@Before
	public void steupChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().driverVersion("130.0");
		driver = new ChromeDriver();
	}

	@Given("user navigates to Facebook")
	public void user_navigates_to_facebook() {
		driver.get("https://www.facebook.com/");
	}

	@When("I enter Username as {string} and Password as {string}")
	public void i_enter_username_as_and_password_as(String userName, String password) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

	@Then("login should be unsuccessful.")
	public void login_should_be_unsuccessful() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.")) {
			System.out.println("Test Pass");
		} else
			System.out.println("Test Failed");

	}
	@Given("^I am on Facebook login page$")
	public void goToFacebook() {
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("^I enter username as \"(.*)\"$")
	public void enterUsername(String arg1) {
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^I enter password as \"(.*)\"$")
	public void enterPassword(String arg1) {
		driver.findElement(By.id("pass")).sendKeys(arg1);
		driver.findElement(By.name("login")).click();
	}

	@Then("^Login should fail$")
	public void checkFail() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
	}

	@Then("^Relogin option should be available$")
	public void checkRelogin() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
	}

	


	@After
	public void closeBrowser() {
		driver.quit();
	}
}
