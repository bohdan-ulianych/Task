package Pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class RecipeTiramisuPage extends BasePage {
    public RecipeTiramisuPage(AndroidDriver driver) throws Exception {
        super(driver);
    }

    @FindBy(id = "com.yummly.android:id/ingredients_header_instacart_image")
    protected WebElement shoppingCartButton;

    public ShopPage clickOnShoppingCartButton() throws Exception {
        shoppingCartButton.click();
        return new ShopPage(driver);
    }

    public RecipeTiramisuPage swipeDown() {
        new TouchAction(driver)
                .tap(point(536, 1560))
                .press(point(536, 1560))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(536, 1110))
                .release().perform();
        return this;
    }

    public RecipeTiramisuPage swipeUp() {
        new TouchAction(driver)
                .tap(point(536, 1560))
                .press(point(536, 1110))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(536, 1560))
                .release().perform();
        return this;
    }

    private List<WebElement> getListOfRecipeElements() {
        return driver.findElements(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"));
    }

    private WebElement getLastIngredientOfRecipe() {
        return getListOfRecipeElements().get(getListOfRecipeElements().size() - 1);
    }

    public RecipeTiramisuPage clickOnLastIngredientToggle() {
        WebElement lastIngredientButton = getLastIngredientOfRecipe().findElement(By.xpath("//android.view.View[@content-desc=\"Add 1 bar chocolate (i used 80% cocoa) to Shopping List\"]"));lastIngredientButton.click();
        return this;
    }

    public void checkMinusToggleButtonOnLastIngredient() {
        WebElement minusToggleButton = getLastIngredientOfRecipe().findElement(By.xpath("//android.view.View[@content-desc=\"Remove 1 bar chocolate (i used 80% cocoa) from Shopping List\"]\n"));
        Assert.assertTrue(minusToggleButton.isDisplayed());
    }

}
