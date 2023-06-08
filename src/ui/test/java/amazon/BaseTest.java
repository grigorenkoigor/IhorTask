package amazon;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    String baseUri = "https://www.amazon.ca/gp/browse.html?node=2206275011&ref_=nav_cs_home";

    @BeforeClass
    public void init(){
        driver = new ChromeDriver();
        Dimension dimension = new Dimension(1420, 920);
        driver.manage().window().setSize(dimension);
        driver.navigate().to(baseUri);
    }

    @AfterTest
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception e) {
        }
    }
}
