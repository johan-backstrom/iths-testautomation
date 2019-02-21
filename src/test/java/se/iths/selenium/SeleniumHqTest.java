package se.iths.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import se.iths.selenium.pages.webshop.DownloadPage;
import se.iths.selenium.pages.webshop.TopMenu;

import java.util.stream.Collectors;

public class SeleniumHqTest {

    WebDriver driver;

    @Before
    public void startBrowser() {

        driver = new ChromeDriver();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void searchForChromeInSereachBoxAndCheckThatFirstHitIsGithub() {

        driver.get("https://www.seleniumhq.org");
        WebElement searchBox = driver.findElement(By.id("q"));
        searchBox.sendKeys("driver");
        searchBox.submit();

        WebElement firstSearchHit = driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[2]/div[2]"));

        Assert.assertEquals(
                "https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver",
                firstSearchHit.getText()
        );
    }

    @Test
    public void validateVersion() {

        driver.get("https://www.seleniumhq.org");
        TopMenu topMenu = new TopMenu(driver);
        topMenu.clickDownloadTab();

        DownloadPage downloadPage = new DownloadPage(driver);
        Version version = downloadPage.getVersion();

        Assert.assertEquals(
                "3.141.59",
                version.toString()
        );
    }

    @Test
    public void validateAllLinksOnThirdPartDownloads() {

        driver.get("https://www.seleniumhq.org");
        TopMenu topMenu = new TopMenu(driver);
        topMenu.clickDownloadTab();

        driver.findElements(By.cssSelector("#mainContent > table:nth-child(29) > tbody > tr > td:nth-child(1) > a"))
                .stream()
                .map(webElement -> webElement.getAttribute("href"))
                .collect(Collectors.toSet())
                .stream()
                .forEach(s -> {
                    driver.get(s);
                    Assert.assertFalse(driver.getTitle().contains("404"));
                });
    }

    @Test
    public void testAllLinksOnDownloadPage(){

        driver.get("https://www.seleniumhq.org");
        TopMenu topMenu = new TopMenu(driver);
        topMenu.clickDownloadTab();

        driver.findElements(By.cssSelector("#mainContent > table:nth-child(29) > tbody > tr > td:nth-child(1) > a"))
                .stream()
                .map(webElement -> webElement.getAttribute("href"))
                .collect(Collectors.toList())
                .forEach(url -> {
                    driver.get(url);
                    Assert.assertFalse(driver.getTitle().contains("404"));
                });
    }

}
