package se.iths.cucumber;

import org.openqa.selenium.WebDriver;
import se.iths.petstore.Pet;

import java.util.List;

public class CucumberWorld {

    WebDriver driver;
    List<Pet> petresponseList;

    public List<Pet> getPetresponseList() {
        return petresponseList;
    }

    public void setPetresponseList(List<Pet> petresponseList) {
        this.petresponseList = petresponseList;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
