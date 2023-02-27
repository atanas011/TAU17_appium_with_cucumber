package pages.todo;

import io.appium.java_client.AppiumDriver;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    private final AppiumDriver driver;

    public PageBase(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void click(WebElement element) {
        waitForVisibility(element);
        element.click();
    }

    public void clear(WebElement element) {
        waitForVisibility(element);
        element.clear();
    }

    public void sendText(WebElement element, String txt) {
        element.sendKeys(txt);
    }

    private void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}