package Driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverSetup {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException {
        if(driver == null){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5556");
        capabilities.setCapability("appPackage", "com.yummly.android");
        capabilities.setCapability("appActivity", "com.yummly.android.feature.splash.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);}
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return driver;
    }

    public static void tearDown() {
        driver.quit();
    }
}
