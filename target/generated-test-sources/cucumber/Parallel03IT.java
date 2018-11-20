import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/Ovidiu/Workspace 5891/flaconiCucumber/src/test/resources/features/ProductCatalog.feature"},
        plugin = {"json:C:/Users/Ovidiu/Workspace 5891/flaconiCucumber/target/flaconi-cucumber-reports-json/3.json"},
        monochrome = true,
        tags = {"@regression"},
        glue = {"flaconi.shop.integration.cucumber"})
public class Parallel03IT {
}
