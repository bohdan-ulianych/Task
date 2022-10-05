package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage {
    public ShopPage(AndroidDriver driver) throws Exception {
        super(driver);
    }

    @FindBy(id = "com.yummly.android:id/alert_close_button")
    protected WebElement closeSignInPopUpButton;

    @FindBy(id = "com.yummly.android:id/expand_menu")
    protected WebElement ingredientExpandMenuButton;

    @FindBy(xpath = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
    protected WebElement ingredientExpandMenuRecipeButton;

    public ShopPage clickOnIngredientExpandMenuButton() {
        ingredientExpandMenuButton.click();
        return this;
    }

    public ShopPage clickOnCloseSignInPopUpButton() {
        closeSignInPopUpButton.click();
        return this;
    }

    public RecipeTiramisuPage clickOnIngredientExpandMenuRecipeButton() throws Exception {
        ingredientExpandMenuRecipeButton.click();
        return new RecipeTiramisuPage(driver);
    }
}
