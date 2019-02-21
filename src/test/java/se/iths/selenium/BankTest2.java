package se.iths.selenium;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;


public class BankTest2 {

    @Test
    public void addCustomer(){

        open("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        $("div:nth-child(3) > button").click();
        $("button:nth-child(1)").click();

        Selenide.switchTo().alert().accept();
    }




}
