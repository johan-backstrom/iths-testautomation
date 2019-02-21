package se.iths.selenium;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test
    public void myFirstSelenideTest(){

        open("http://www.way2automation.com/angularjs-protractor/banking/");
        $(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button")).click();
        $(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[1]")).click();
        $(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Apan");
        $(".apa").shouldBe(Condition.or("apa", Condition.disabled, Condition.checked));

    }

    @Test
    public void normalSelenium(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/banking/");
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Apan");
        driver.quit();
    }
}
