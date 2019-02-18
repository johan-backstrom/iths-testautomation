package se.iths.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {

    public static WebDriver createWebDriver(){
        WebDriver myBrowser = new ChromeDriver();
        return myBrowser;
    }
}
