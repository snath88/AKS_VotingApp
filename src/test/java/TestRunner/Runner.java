package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/features"},
		glue= {"StepDefination"},		
		plugin= {"pretty","json:target/jsonReports/cucumber-report.json"},
		monochrome= true,
//		tags= "@ADD_Place_Excel and not @DELETE_Place",
		dryRun=false				
		
		)

public class Runner {

}
