import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(
		monochrome = true,
		 features ={"src/test/resources/"},
		 
		
	
		plugin = {"pretty",
				"html:target/cucumber-html-report",
				"json:target/flaconi-cucumber-reports-json/cucumber.json",
				})


@RunWith(Cucumber.class)
public class cucumberRunnerTest{

}
