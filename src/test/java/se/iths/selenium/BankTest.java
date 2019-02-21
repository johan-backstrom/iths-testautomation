package se.iths.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import se.iths.selenium.pages.bank.LoginPage;
import se.iths.selenium.pages.bank.ManagerAdminPage;

public class BankTest {

    WebDriver driver;

    @Before
    public void startBrowser(){
        driver = new ChromeDriver();
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void createUserTest(){

        driver.get("http://www.way2automation.com/angularjs-protractor/banking");

        new LoginPage(driver).loginAsManager();

        ManagerAdminPage adminPage = new ManagerAdminPage(driver);
        adminPage.addNewCustomer();
        adminPage.createUser("Kalle", "Kula", "123435");
    }

}
