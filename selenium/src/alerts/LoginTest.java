package alerts;
//package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {

    @Test
    public void login() {

        WebDriver driver =
                new ChromeDriver();

        driver.get(
            "https://www.saucedemo.com");

        LoginPage page =
                new LoginPage(driver);

        page.enterUsername(
                "standard_user");

        page.enterPassword(
                "secret_sauce");

        page.clickLogin();

        driver.quit();
    }
}