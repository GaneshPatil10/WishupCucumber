package org.testRunners;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/org/features",
		glue = {"org/stepdefinations","org.applicationHooks"},
		monochrome=true,
		dryRun = false,
		//tags="@Smoke or @Regression",
		plugin = {"pretty",
			"html:target/html_report/cucumber_reports.html",
			"junit:target/junit_report/junit_reports.xml",
			"json:target/json_report/json_reports.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
		)
public class MyTestRunner { //extends AbstractTestNGCucumberTests {
	
}