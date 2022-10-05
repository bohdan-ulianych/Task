package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {
    public WelcomePage(AndroidDriver driver) throws Exception {
        super(driver);
    }
    @FindBy(id = "com.yummly.android:id/skip_view")
    protected WebElement skipPersonalizationButton;

    @FindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    protected WebElement dontAllowNotificationsButton;

    public NewFeaturesPage clickOnSkipPersonalizationButton() throws Exception {
        skipPersonalizationButton.click();
        return new NewFeaturesPage(driver);
    }

    public WelcomePage clickOnDontAllowNotificationsButton() {
        dontAllowNotificationsButton.click();
        return this;
    }
}
