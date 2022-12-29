import Actions.MobileActions;
import Pages.HomePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Test_MobileActions {
    WebDriver driver;


//    @BeforeClass
//    public void setup(){
//        first_screen = new First_Screen(driver);
//    }

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        System.out.println(System.getProperty("user.dir"));
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Bando");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        new MobileActions(driver);


    }

    @Test
    public void testClickAction() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(new AppiumBy.ByAccessibilityId("Access'ibility")).click();
//        Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Provider")).getText(), "Accessibility Node Provider");
        String Accessibility_Text = new HomePage(driver).click_Accessibility().getAccessibilityNodeProvider_Text();
        Assert.assertEquals(Accessibility_Text, "Accessibility Node Provider");
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String upperTextField = new HomePage(driver).click_App().clickActivity().clickCustomTitle().typeOnLeftField();
        Assert.assertEquals(upperTextField, "Appium");
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
//        driver.findElement(new AppiumBy.ByAccessibilityId("Activity")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Custom Title\"]")).click();
//        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]")).clear();
//        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]")).sendKeys("Appium");
//        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Change Left\"]")).click();
//        Assert.assertEquals( driver.findElement(By.id("io.appium.android.apis:id/left_text_edit")).getText(),"Appium");
    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new HomePage(driver).click_Accessibility().clickOnAAccessibilityNodeQuerying().chooseCheckBox();
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]")).click();
//        driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]")).click();
//        Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]")).getAttribute("checked"), "true");
    }


    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
       String scaleToFit_Text =new HomePage(driver).click_Graphics().scrollDownToScaleToFitButton().headerText();
       Assert.assertEquals(scaleToFit_Text,"Graphics/ScaleToFit");
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]")).click();
//        new MobileActions(driver);
//        MobileActions.scrollDownToSpecificText("ScaleToFit");
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"ScaleToFit\"]")).click();
//        Assert.assertEquals(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")).getText(), "Graphics/ScaleToFit");
    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        new HomePage(driver).click_Graphics().scrollDownToVerticesButton().swpieLeftThenRight();
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]")).click();
//        MobileActions.scrollDownToSpecificText("Vertices");
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Vertices\"]")).click();
//        MobileActions.swipeRightOnElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View"), driver);
//        MobileActions.swipeLeftOnElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View"));


    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        boolean radioButtonChecked=new HomePage(driver).click_Views().scrollToRadioGroupButton().clickBreakFast_RadioButton();
        Assert.assertTrue(radioButtonChecked);
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
//        MobileActions.scrollDownToSpecificText("Radio Group");
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Radio Group\"]")).click();
//        driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"Breakfast\"]")).click();
//        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"Breakfast\"]")).getAttribute("checked"), "true");

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
