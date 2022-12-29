package Pages;

import io.cucumber.java.ht.Le;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitlePage {
    WebDriver driver;

    public CustomTitlePage(WebDriver driver){
        this.driver = driver;

    }
    By LeftField=By.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]");
    By changeLeft_Button=By.xpath("//android.widget.Button[@content-desc=\"Change Left\"]");

    By upperLeftText=By.xpath("//android.widget.TextView[@content-desc=\"Left is best\"]");


    public String typeOnLeftField(){
        driver.findElement(LeftField).clear();
        driver.findElement(LeftField).sendKeys("Appium");
        driver.findElement(changeLeft_Button).click();
        return driver.findElement(upperLeftText).getText();
    }
}
