package se.iths.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenu {

    WebDriver driver;

    public TopMenu(WebDriver driver){
        this.driver = driver;
    }

    public void clickDownloadTab(){

        WebElement downloadLink = driver.findElement(By.xpath("//*[@id=\"menu_download\"]/a"));
        downloadLink.click();
    }

}
