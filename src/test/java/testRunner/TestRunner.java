package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/java/features" }, glue = "stepdefination", monochrome = true, tags = "@SeleniumTest",
				  plugin = {"pretty",
					        "json:target/cucumber_json_reports/home-page.json",
					        "html:target/home-page-html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner {

}