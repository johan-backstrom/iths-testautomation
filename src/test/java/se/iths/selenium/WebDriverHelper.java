package se.iths.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverHelper {

    public static WebDriver createWebDriver(){

        WebDriver myBrowser = new ChromeDriver();
        return myBrowser;
    }
}
