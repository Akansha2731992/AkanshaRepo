package Stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Use "usage" or "pretty" for console details  and you can use one at a time.
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-reports" }, features = { "src/test/resources/features" }, glue = { "Stepdefinitions" }, tags = { "" }, monochrome = true, dryRun =false,strict=true)
public class CucumberTestSuite {
	
}
