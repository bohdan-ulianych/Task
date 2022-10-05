package Pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.appium.java_client.touch.offset.PointOption.point;

public class MainPage extends BasePage {
    public MainPage(AndroidDriver driver) throws Exception {
        super(driver);
    }

    @FindBy(id = "com.yummly.android:id/nav_graph_search")
    protected WebElement navBarSearchButton;

    @FindBy(id = "com.yummly.android:id/search_src_text")
    protected WebElement recipesSearchInput;

    @FindBy(id = "com.yummly.android:id/search_content")
    protected WebElement searchContent;

    public MainPage clickOnNavBarSearchButton() {
        navBarSearchButton.click();
        return this;
    }

    public SearchPage searchRecipes(String recipe) throws Exception {
        recipesSearchInput.click();
        recipesSearchInput.sendKeys(recipe);
        new WebDriverWait(driver, Duration.ofMillis(2000)).until(ExpectedConditions.visibilityOf(searchContent));
//        Thread.sleep(2000);
        TouchAction tap = new TouchAction(driver);
        tap.tap(point(420, 310)).release();
        tap.perform();
        return new SearchPage(driver);
    }
}
