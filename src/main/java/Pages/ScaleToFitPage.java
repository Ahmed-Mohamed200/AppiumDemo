package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScaleToFitPage {
    WebDriver driver;
    public ScaleToFitPage(WebDriver driver) {
        this.driver = driver;

    }
    By headerText=By.xpath("//android.view.ViewGroup[@resource-id=\"android:id/action_bar\"]//android.widget.TextView");
    public String headerText(){
        return driver.findElement(headerText).getText();
    }
}
