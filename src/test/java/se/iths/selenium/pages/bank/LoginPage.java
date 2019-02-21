package se.iths.selenium.pages.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    By loginAsManagerButton = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAsManager(){
        ExpectedCondition ex = ExpectedConditions.elementToBeClickable(loginAsManagerButton);
        new WebDriverWait(driver, 5).until(ex);
        driver.findElement(loginAsManagerButton).click();
    }
}
