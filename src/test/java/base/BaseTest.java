package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseTest extends AbstractTestNGCucumberTests {

    protected AndroidDriver driver;
    private AppiumDriverLocalService service;

    public void setUp() {
        service = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/")
                .build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setPlatformVersion("9")
                .setAppPackage("com.jeffprod.todo")
                .setAppActivity("ActivityMain")
                .setNoReset(true);
        driver = new AndroidDriver(service.getUrl(), options);
    }

    public void tearDown() {
        driver.quit();
        service.stop();
    }
}
