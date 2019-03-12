package se.iths.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import se.iths.petstore.PetStoreClient;

public class SeleniumHq {

    WebDriver driver = CucumberHooks.getWorld().getDriver();

    @When("^I go to the projects tab$")
    public void i_go_to_the_projects_tab() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"menu_projects\"]/a")).click();
    }

    @Then("^WebDriver is the first project$")
    public void webdriver_is_the_first_project() throws Throwable {
        WebElement heading = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/h3[1]/a"));
        Assert.assertEquals("Selenium WebDriver", heading.getText());
    }
}
