package se.iths.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import se.iths.selenium.pages.DownloadPage;
import se.iths.selenium.pages.TopMenu;

public class SeleniumHqTest {

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
    public void searchForChromeInSereachBoxAndCheckThatFirstHitIsGithub(){

        chrome.get("https://www.seleniumhq.org");
        WebElement searchBox = chrome.findElement(By.id("q"));
        searchBox.sendKeys("chrome");
        searchBox.submit();

        WebElement firstSearchHit = chrome.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[2]/div[2]"));

        Assert.assertEquals(
                "https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver",
                firstSearchHit.getText()
        );
    }

    @Test
    public void validateVersion(){

        chrome.get("https://www.seleniumhq.org");
        TopMenu topMenu = new TopMenu(chrome);
        topMenu.clickDownloadTab();

        DownloadPage downloadPage = new DownloadPage(chrome);
        Version version = downloadPage.getVersion();

        Assert.assertEquals(
                "3.141.59",
                version.toString()
        );
    }

}
