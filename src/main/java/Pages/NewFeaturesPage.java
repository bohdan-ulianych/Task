package Pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class NewFeaturesPage extends BasePage {
    public NewFeaturesPage(AndroidDriver driver) throws Exception {
        super(driver);
    }

    @FindBy(id = "com.yummly.android:id/closeButton")
    protected WebElement closeNewFeaturesScreenButton;

    public MainPage clickOnCloseNewFeaturesScreenButton() throws Exception {
        closeNewFeaturesScreenButton.click();
        return new MainPage(driver);
    }

    public NewFeaturesPage swipeLeft() {
        new TouchAction(driver)
                .press(point(530, 1210))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(73, 1210))
                .release().perform();
        return this;
    }
}
