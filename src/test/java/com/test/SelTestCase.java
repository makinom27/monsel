package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by akinom on 28/05/2016.
 */

@Test
public class SelTestCase {


    WebDriver driver;

    @Parameters ("browser")
    @BeforeMethod
    public void launchBrowser(@Optional("CHROME") String browser) {
        if (browser.equalsIgnoreCase("FF")) {
            driver = new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase("CHROME")) {

            driver = new ChromeDriver();
        }
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close ();
        driver.quit();
    }
}
