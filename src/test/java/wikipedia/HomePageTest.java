package wikipedia;

import com.wikipedia.pages.HomePage;
import com.wikipedia.pages.SearchResultsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by akinom on 07/06/2016.
 */
@Test
public class HomePageTest extends WikipediaTestSetup{


    public void searchForText() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);

        hp.searchFor("selenium software");
        hp.clicksearch();
        SearchResultsPage rp = PageFactory.initElements(driver,SearchResultsPage.class);
        rp.clickFirstLink();
        System.out.println("clicked the first link too");

    }





}
