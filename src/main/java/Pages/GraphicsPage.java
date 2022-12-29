package Pages;

import Actions.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphicsPage {
    WebDriver driver;
    MobileActions mobileActions;
    By scaleToFitButton = By.xpath("//android.widget.TextView[@content-desc=\"ScaleToFit\"]");
    By VerticesButton = By.xpath("//android.widget.TextView[@content-desc=\"Vertices\"]");

    public GraphicsPage(WebDriver driver) {
        this.driver = driver;

    }

    public ScaleToFitPage scrollDownToScaleToFitButton() {
        new MobileActions(driver);
        mobileActions.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(scaleToFitButton).click();
        return new ScaleToFitPage(driver);


    }

    public VerticsPage scrollDownToVerticesButton() {
        new MobileActions(driver);
        mobileActions.scrollDownToSpecificText("Vertices");
        driver.findElement(VerticesButton).click();
        return new VerticsPage(driver);

    }

}
