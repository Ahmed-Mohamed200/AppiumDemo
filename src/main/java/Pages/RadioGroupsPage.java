package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroupsPage {
    WebDriver driver;

    public RadioGroupsPage(WebDriver driver){
        this.driver = driver;

    }
    By breakFast_radioButton=By.xpath("//android.widget.RadioButton[@content-desc=\"Breakfast\"]");

    public boolean clickBreakFast_RadioButton(){
        driver.findElement(breakFast_radioButton).click();
        return driver.findElement(breakFast_radioButton).getAttribute("checked").equals("true");
    }
}
