package se.iths.selenium.pages.webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeLogin {

    WebDriver driver;

    public AutomationPracticeLogin(WebDriver driver){
        this.driver = driver;
    }

    public void login(User user){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(user.getUsername());
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(user.getPassword());
    }

    public void login(String user, String pass){

    }

}
