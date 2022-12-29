package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccessibilityNodeQuerying {

    WebDriver driver;
    By checkBox=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox");
    public AccessibilityNodeQuerying(WebDriver driver){
        this.driver = driver;

    }
    public void chooseCheckBox(){
        driver.findElement(checkBox).click();
        Assert.assertEquals(driver.findElement(checkBox).getAttribute("checked"), "true");
    }
}
