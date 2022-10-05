package Pages;

import Driver.DriverSetup;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
public class BasePage {
AndroidDriver driver;

    public BasePage(AndroidDriver driver)throws Exception {
        PageFactory.initElements(DriverSetup.getDriver(), this);
        this.driver = DriverSetup.getDriver();
    }
}
