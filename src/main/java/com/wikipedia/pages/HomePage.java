package com.wikipedia.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;


    //@FindBy(css = "input#searchInput")

    @FindBy(how= How.CSS,using = "input#searchInput")
    @CacheLookup
    WebElement searchBox;


    @FindBy(how= How.CSS,using = "button[type='submit']")
    @CacheLookup
    WebElement searchButton;



    public HomePage(WebDriver driver){

        this.driver=driver;
    }


    public  void searchFor(String searchtext){
        searchBox.sendKeys(searchtext);


    }
    public SearchResultsPage clicksearch() {
        searchButton.click();
        return new SearchResultsPage(driver);
    }
















}
