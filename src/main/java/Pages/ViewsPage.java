package Pages;

import Actions.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    WebDriver driver;
    MobileActions mobileActions;

    By radioGroup_Button=By.xpath("//android.widget.TextView[@content-desc=\"Radio Group\"]");

    public ViewsPage(WebDriver driver) {
        this.driver = driver;

    }
    public RadioGroupsPage scrollToRadioGroupButton(){
        new MobileActions(driver);
        MobileActions.scrollDownToSpecificText("Radio Group");
        driver.findElement(radioGroup_Button).click();
        return new RadioGroupsPage(driver);
    }

}
