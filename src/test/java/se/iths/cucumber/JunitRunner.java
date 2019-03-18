package se.iths.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber", "junit"},
        features = "src/test/resources",
        glue = "se.iths.cucumber"
)
public class JunitRunner {}
