package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class browsersetup{
    public WebDriver browser;

    @BeforeSuite
    public void browserset() {
        browser =new FirefoxDriver();
    }

    @AfterSuite
    public void quitbrowser(){
        browser.quit();
    }
}