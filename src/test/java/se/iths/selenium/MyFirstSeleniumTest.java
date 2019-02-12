package se.iths.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumTest {

    WebDriver myBrowser;

    @Before
    public void setUpBrowser() {
        myBrowser = new ChromeDriver();
    }

    @After
    public void closeBrowser() {
        myBrowser.quit();
    }

    @Test
    public void myVeryFirstTest() {

        myBrowser.get("https://www.google.se");

        WebElement inputField = myBrowser.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        inputField.sendKeys("apa");
        inputField.submit();

        WebElement firstSearchResult = myBrowser.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3"));
        myBrowser.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > div.r > a > h3"));
        myBrowser.findElement(By.partialLinkText("Referensguide"));

        Assert.assertEquals(
                "Referensguide för APA - Karolinska Institutet",
                firstSearchResult.getText()
        );
    }
}