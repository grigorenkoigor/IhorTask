package amazon.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage clickByNavTabByName(String navTabName){
        By dropdown = By.cssSelector("[id=\"nav-progressive-subnav\"] [aria-label=\"" + navTabName + "\"]");
        driver.findElement(dropdown).click();
        return this;
    }


}
