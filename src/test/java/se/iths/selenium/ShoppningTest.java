package se.iths.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import se.iths.selenium.pages.AutomationPracticeLogin;
import se.iths.selenium.pages.User;

import static se.iths.selenium.pages.User.slaskUser;

public class ShoppningTest {

    WebDriver chrome;

    @Before
    public void startBrowser(){
        chrome = new ChromeDriver();
    }

    @After
    public void closeBrowser(){
        chrome.quit();
    }

    @Test
    public void login(){

        chrome.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        AutomationPracticeLogin loginPage = new AutomationPracticeLogin(chrome);

        loginPage.login(slaskUser());
    }
}
