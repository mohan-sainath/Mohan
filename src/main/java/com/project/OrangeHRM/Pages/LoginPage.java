package com.project.OrangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By enterUserName = By.xpath("//input[@name='username']");
    By enterPassword = By.xpath("//input[@name='password']");
    By enterLogin = By.xpath("//button[@type='submit']");

    public LoginPage login(String username, String password){
        driver.findElement(enterUserName).sendKeys(username);
        driver.findElement(enterPassword).sendKeys(password);
        driver.findElement(enterLogin).click();
        return this;
    }
}
