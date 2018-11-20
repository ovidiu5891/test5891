import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/Ovidiu/Workspace 5891/flaconiCucumber/src/test/resources/features/Cart.feature"},
        plugin = {"json:C:/Users/Ovidiu/Workspace 5891/flaconiCucumber/target/flaconi-cucumber-reports-json/1.json"},
        monochrome = true,
        tags = {"@regression"},
        glue = {"flaconi.shop.integration.cucumber"})
public class Parallel01IT {
}
