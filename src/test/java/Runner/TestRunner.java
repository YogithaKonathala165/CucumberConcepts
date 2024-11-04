package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/registration.feature", glue= {"StepDefinitions"}, 
plugin= {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"}, dryRun=false)
public class TestRunner extends AbstractTestNGCucumberTests {
	@DataProvider()
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
