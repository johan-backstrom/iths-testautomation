package se.iths.selenium.pages.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerAdminPage {

    WebDriver driver;

    By addNewCustomerButton = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[1]");
    By firstNameField = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input");
    By lastNameField = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input");
    By postCodeField = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input");
    By addButton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button");

    public ManagerAdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addNewCustomer(){
        ExpectedCondition ex = ExpectedConditions.elementToBeClickable(addNewCustomerButton);
        new WebDriverWait(driver, 5).until(ex);
        driver.findElement(addNewCustomerButton).click();
    }

    public void createUser(String firstName, String lastName, String postalCode){

        ExpectedCondition ex = ExpectedConditions.presenceOfElementLocated(firstNameField);
        new WebDriverWait(driver, 5).until(ex);

        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postCodeField).sendKeys(postalCode);
        driver.findElement(addButton).click();
        driver.switchTo().alert().accept();
    }


}
