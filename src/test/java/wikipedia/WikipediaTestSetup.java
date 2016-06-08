package wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

/**
 * Created by akinom on 07/06/2016.
 */
public class WikipediaTestSetup {

     WebDriver driver;

    @BeforeMethod
    public void openDriver(){


        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("test-type");
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebDriverWait wait = new WebDriverWait(driver, 10);


    }

    @AfterMethod
    public void tearDown(){


        driver.close();
        driver.quit();

    }


}
