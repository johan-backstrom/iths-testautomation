package se.iths.cucumber;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class SeleniumHq2 {

    WebDriver driver = CucumberHooks.getWorld().getDriver();

    @Given("^I am at the Selenium hq web page$")
    public void i_am_at_the_Selenium_hq_web_page() throws Throwable {
        driver.get("https://www.seleniumhq.org/");
    }

}
