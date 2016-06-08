package com.wikipedia.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigReader;

import java.io.FileNotFoundException;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) throws FileNotFoundException {

        this.driver=driver;
    }


    //@FindBy(css = "input#searchInput")

    @FindBy(how= How.CSS,using = "input#searchInput")
    @CacheLookup
    WebElement searchBox;


    @FindBy(how= How.CSS,using = "button[type='submit']")
    @CacheLookup
    WebElement searchButton;






    public  void searchFor(String searchtext){
        searchBox.sendKeys(searchtext);


    }
    public SearchResultsPage clicksearch() {
        searchButton.click();
        return new SearchResultsPage(driver);
    }
















}
