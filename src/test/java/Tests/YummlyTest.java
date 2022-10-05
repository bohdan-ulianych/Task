package Tests;
import Pages.WelcomePage;
import org.testng.annotations.Test;


public class YummlyTest extends BaseTest {

    public static final String SEARCHING_STRING = "tiramisu";

    @Test
    public void yummlyTest() throws Exception {
        new WelcomePage(driver)
                .clickOnDontAllowNotificationsButton()
                .clickOnSkipPersonalizationButton()
                .swipeLeft()
                .swipeLeft()
                .clickOnCloseNewFeaturesScreenButton()
                .clickOnNavBarSearchButton()
                .searchRecipes(SEARCHING_STRING)
                .clickOnFirstRecipeTiramisu()
                .swipeDown()
                .clickOnLastIngredientToggle()
                .swipeUp()
                .clickOnShoppingCartButton()
                .clickOnCloseSignInPopUpButton()
                .clickOnIngredientExpandMenuButton()
                .clickOnIngredientExpandMenuRecipeButton()
                .swipeDown()
                .checkMinusToggleButtonOnLastIngredient();
    }
}
