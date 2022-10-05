package Tests;

import io.appium.java_client.android.AndroidDriver;
import Driver.DriverSetup;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        DriverSetup.getDriver();
    }

    @AfterTest
    public void tearDown() {
    DriverSetup.tearDown();
    }
}
