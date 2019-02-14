package se.iths.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import se.iths.selenium.Version;

public class DownloadPage {

    WebDriver browser;

    public DownloadPage(WebDriver browser){
        this.browser = browser;
    }

    public Version getVersion(){
        WebElement version = browser.findElement(By.xpath("//*[@id=\"mainContent\"]/p[3]/a"));
        return new Version(version.getText());
    }

    public String getSillyString(){
        return "APA!";
    }

}
