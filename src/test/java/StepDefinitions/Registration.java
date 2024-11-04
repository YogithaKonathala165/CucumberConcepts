package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	WebDriver driver = null;

	@Given("I am on a new user registration page")
	public void i_am_on_a_new_user_registration_page() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().driverVersion("130.0");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");
	}

	@When("I enter valid data on the page")
	public void i_enter_valid_data_on_the_page(DataTable table) {
		// Initialize data table
		Map<String,String> data = table.asMap();
		System.out.println(data.get("First Name"));

		// Enter data
		driver.findElement(By.name("firstname")).sendKeys(data.get("First Name"));
		driver.findElement(By.name("lastname")).sendKeys(data.get("Last Name"));
		driver.findElement(By.name("reg_email__")).sendKeys(data.get("Email Address"));
		driver.findElement(By.name("reg_passwd__")).sendKeys(data.get("Password"));
		driver.findElement(By.xpath("//input[@id='sex' and @value='1']")).click();
		Select dropdownB = new Select(driver.findElement(By.name("birthday_day")));
		dropdownB.selectByValue("15");

		Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
		dropdownM.selectByValue("6");

		Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
		dropdownY.selectByValue("1990");

		driver.findElement(By.name("websubmit")).click();

	}

	@Then("the user registration should be successful.")
	public void the_user_registration_should_be_successful() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
	}
}
