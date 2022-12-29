package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    WebDriver driver;

    public ActivityPage(WebDriver driver) {
        this.driver = driver;

    }

    By customTitle = By.xpath("//android.widget.TextView[@content-desc=\"Custom Title\"]");

    public CustomTitlePage clickCustomTitle() {
        driver.findElement(customTitle).click();
       return new CustomTitlePage(driver);
    }
}