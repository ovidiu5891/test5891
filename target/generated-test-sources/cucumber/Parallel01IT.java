import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Projects/Workspace 5891/flaconiCucumber/src/test/resources/features/HomePage.feature"},
        plugin = {"json:C:/Projects/Workspace 5891/flaconiCucumber/target/flaconi-cucumber-reports-json/1.json"},
        monochrome = true,
        tags = {"@homepage", "@reactBlock"},
        glue = {"flaconi.shop.integration.cucumber"})
public class Parallel01IT {
}
