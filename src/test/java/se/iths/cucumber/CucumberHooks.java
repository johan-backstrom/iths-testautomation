package se.iths.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberHooks {

    private static CucumberWorld world;

    public static CucumberWorld getWorld(){
        return world;
    }

    @Before
    public void setup2(){
        world = new CucumberWorld();
        world.setDriver(new ChromeDriver());
    }

    @After
    public void tearDown(){
        world.getDriver().quit();
    }
}
