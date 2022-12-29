package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityPage {
    WebDriver driver;
    By accessibilityNodeProviderButton=new AppiumBy.ByAccessibilityId("Accessibility Node Provider");
    By accessibilityNodeQuerying=By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]");


    public AccessibilityPage(WebDriver driver){
        this.driver = driver;

    }
    public String getAccessibilityNodeProvider_Text(){
        return driver.findElement(accessibilityNodeProviderButton).getText();
    }
    public AccessibilityNodeQuerying clickOnAAccessibilityNodeQuerying(){
        driver.findElement(accessibilityNodeQuerying).click();
        return new AccessibilityNodeQuerying(driver);
    }

}
