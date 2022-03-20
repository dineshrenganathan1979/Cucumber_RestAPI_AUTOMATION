package options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		format ={"pretty","html:output/report.html","json:output/report.json","junit:output/report.xml"},
		glue = {"stepdefs"},
		features = {"src/test/features"}
		)
public class CucumberTests {}
