package amazon.tests;

import amazon.BaseTest;
import amazon.objectRepository.HomePage;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    String furniture = "Furniture";
    String bedding = "Bedding";

    @Test
    public void clickByNavTabByName(){
        HomePage homePage = new HomePage(driver);

        homePage.clickByNavTabByName(bedding);
    }
}
