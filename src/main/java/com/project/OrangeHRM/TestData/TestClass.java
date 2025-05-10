package com.project.OrangeHRM.TestData;

import com.project.OrangeHRM.Base.BaseTest;
import com.project.OrangeHRM.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {
    WebDriver driver;

    @Test
    public void TestLoginPage(){
        LoginPage enterCredentials = new LoginPage(driver);

        enterCredentials.login("Admin", "admin123");
    }

}
