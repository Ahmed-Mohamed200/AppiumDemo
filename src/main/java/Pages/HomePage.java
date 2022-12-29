package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
     WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    By Accessibility=new AppiumBy.ByAccessibilityId("Access'ibility");
    By App=By.xpath("//android.widget.TextView[@content-desc=\"App\"]");

    By Graphics=By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]");

    By Views=By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");

    public AccessibilityPage click_Accessibility(){
        driver.findElement(Accessibility).click();
        return new AccessibilityPage(driver);

    }
    public AppPage click_App(){
        driver.findElement(App).click();
        return new AppPage(driver);

    }
    public GraphicsPage click_Graphics(){
        driver.findElement(Graphics).click();
        return new GraphicsPage(driver);

    }
    public ViewsPage click_Views(){
        driver.findElement(Views).click();
        return new ViewsPage(driver);

    }



}
