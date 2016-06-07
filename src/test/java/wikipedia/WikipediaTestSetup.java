package wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

/**
 * Created by akinom on 07/06/2016.
 */
public class WikipediaTestSetup {

     WebDriver driver;

    @BeforeTest
    public void openDriver(){


        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("test-type");
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

    }

    @AfterTest
    public void tearDown(){


        driver.close();
        driver.quit();

    }


}
