package Pages;

import Actions.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerticsPage {
    WebDriver driver;
    MobileActions mobileActions;

    public VerticsPage(WebDriver driver) {
        this.driver = driver;

    }

    By swipeRight = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View");
    By swipeLeft = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View"));


    public void swpieLeftThenRight() {
        new MobileActions(driver);
            MobileActions.swipeLeftOnElement(swipeLeft);
            MobileActions.swipeRightOnElement(swipeRight,driver);

    }
}
