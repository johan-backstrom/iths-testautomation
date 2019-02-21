package se.iths.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverHelper {

    public static WebDriver createWebDriver(){

        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriver myBrowser = null;
        try {

            myBrowser = new RemoteWebDriver(
                    new URL("http://localhost:4444/wd/hub"),
                    chromeOptions
            );

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return myBrowser;
    }
}
