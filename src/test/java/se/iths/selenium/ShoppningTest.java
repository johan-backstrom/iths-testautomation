package se.iths.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import se.iths.selenium.pages.webshop.AutomationPracticeLogin;

import static se.iths.selenium.pages.webshop.User.slaskUser;

public class ShoppningTest {

    WebDriver chrome;

    @Before
    public void startBrowser(){
        chrome = WebDriverHelper.createWebDriver();
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

    @Test
    public void shopping() throws InterruptedException {

        By addToCart = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
        By proceedToCheckout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");

        chrome.get("http://automationpractice.com");

        WebElement serachBox = chrome.findElement(By.xpath("//*[@id=\"search_query_top\"]"));

        serachBox.sendKeys("green chiffon dress");
        serachBox.submit();

        chrome.findElement(addToCart).click();

        ExpectedCondition proceedToCheckoutIsClickable = ExpectedConditions.elementToBeClickable(
                proceedToCheckout
        );
        WebDriverWait wait = new WebDriverWait(chrome, 5);
        wait.until(proceedToCheckoutIsClickable);

        chrome.findElement(proceedToCheckout).click();
    }
}
