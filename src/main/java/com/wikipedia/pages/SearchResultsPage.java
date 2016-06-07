package com.wikipedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by akinom on 07/06/2016.
 */
public class SearchResultsPage {

    private WebDriver driver;
    public SearchResultsPage(WebDriver driver){

        this.driver = driver;
    }

    @FindBy(how= How.CSS,using = "ul.mw-search-results>li:nth-child(1) a")
    @CacheLookup
    WebElement firstResult;


    public  void clickFirstLink(){
        firstResult.click();

    }


}
