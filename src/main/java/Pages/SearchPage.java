package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    public SearchPage(AndroidDriver driver) throws Exception {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[1]/android.view.View[2]")
    protected WebElement firstRecipeTiramisu;

    public RecipeTiramisuPage clickOnFirstRecipeTiramisu() throws Exception {
        firstRecipeTiramisu.click();
        return new RecipeTiramisuPage(driver);
    }
}
