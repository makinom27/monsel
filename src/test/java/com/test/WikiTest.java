package com.test;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


@Test
public class WikiTest extends SelTestCase{



        @Test
        public void launchWiki() {

            driver.get("http://wikipedia.org");
            driver.manage().window().maximize();
            driver.findElement(By.id(("searchInput"))).sendKeys("Selenium Software");
            driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("ul.mw-search-results>li:nth-of-type(1) a")).click();
            Assert.assertTrue(driver.findElement(By.cssSelector("img[src='//upload.wikimedia.org/wikipedia/en/thumb/5/5c/Seleniumlogo.png/100px-Seleniumlogo.png']")).isDisplayed());

        }

}
